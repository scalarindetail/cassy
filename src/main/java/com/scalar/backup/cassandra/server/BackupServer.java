package com.scalar.backup.cassandra.server;

import com.scalar.backup.cassandra.config.BackupServerConfig;
import com.scalar.backup.cassandra.db.BackupHistory;
import com.scalar.backup.cassandra.remotecommand.RemoteCommandContext;
import com.scalar.backup.cassandra.rpc.CassandraBackupGrpc;
import io.grpc.ServerBuilder;
import io.grpc.protobuf.services.ProtoReflectionService;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.annotation.concurrent.Immutable;

@Immutable
public final class BackupServer extends CassandraBackupGrpc.CassandraBackupImplBase {
  private static final Logger logger = Logger.getLogger(BackupServer.class.getName());
  private final BackupServerConfig config;
  private io.grpc.Server server;
  private Connection connection;
  private ExecutorService handlerService;

  public BackupServer(BackupServerConfig config) {
    this.config = config;
  }

  private void start() throws IOException, SQLException {
    connection = DriverManager.getConnection(config.getHistoryDbUrl());
    BackupHistory history = new BackupHistory(connection);
    BlockingQueue futureQueue = new LinkedBlockingQueue<RemoteCommandContext>();
    handlerService = Executors.newFixedThreadPool(1);
    handlerService.submit(new RemoteCommandHandler(futureQueue, history));

    ServerBuilder builder =
        ServerBuilder.forPort(config.getPort())
            .addService(new BackupServerController(config, futureQueue, history))
            .addService(ProtoReflectionService.newInstance());

    server = builder.build().start();
    logger.info("Server started, listening on " + config.getPort());

    Runtime.getRuntime()
        .addShutdownHook(
            new Thread(
                () -> {
                  // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                  System.err.println("*** shutting down gRPC server since JVM is shutting down");
                  BackupServer.this.stop();
                  System.err.println("*** server shut down");
                }));
  }

  private void stop() {
    if (server != null) {
      server.shutdown();
      try {
        connection.close();
      } catch (SQLException e) {
        // ignore
      }
    }
  }

  /** Await termination on the main thread since the grpc library uses daemon threads. */
  private void blockUntilShutdown() throws InterruptedException {
    if (server != null) {
      server.awaitTermination();
      handlerService.awaitTermination(Long.MAX_VALUE, TimeUnit.HOURS);
    }
  }

  public static void main(String[] args) throws IOException, InterruptedException, SQLException {
    BackupServerConfig config = null;
    for (int i = 0; i < args.length; ++i) {
      if ("--config".equals(args[i])) {
        config = new BackupServerConfig(new File(args[++i]));
      } else if ("-help".equals(args[i])) {
        printUsageAndExit();
      }
    }
    if (config == null) {
      printUsageAndExit();
    }

    final BackupServer server = new BackupServer(config);
    server.start();
    server.blockUntilShutdown();
  }

  private static void printUsageAndExit() {
    System.err.println("BackupServer --config backup-server.properties");
    System.exit(1);
  }
}