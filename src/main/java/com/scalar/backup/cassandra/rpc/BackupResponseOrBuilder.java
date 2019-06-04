// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cassandra-backup.proto

package com.scalar.backup.cassandra.rpc;

public interface BackupResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpc.BackupResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * a status of the result
   * </pre>
   *
   * <code>.rpc.OperationStatus status = 1;</code>
   */
  int getStatusValue();
  /**
   * <pre>
   * a status of the result
   * </pre>
   *
   * <code>.rpc.OperationStatus status = 1;</code>
   */
  com.scalar.backup.cassandra.rpc.OperationStatus getStatus();

  /**
   * <pre>
   * human-readable messages from the interaction
   * </pre>
   *
   * <code>string message = 2;</code>
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * human-readable messages from the interaction
   * </pre>
   *
   * <code>string message = 2;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>string backup_id = 3;</code>
   */
  java.lang.String getBackupId();
  /**
   * <code>string backup_id = 3;</code>
   */
  com.google.protobuf.ByteString
      getBackupIdBytes();
}
