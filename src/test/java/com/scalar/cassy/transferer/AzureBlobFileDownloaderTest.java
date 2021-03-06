package com.scalar.cassy.transferer;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.azure.core.http.rest.PagedFlux;
import com.azure.storage.blob.BlobAsyncClient;
import com.azure.storage.blob.BlobContainerAsyncClient;
import com.azure.storage.blob.models.BlobItem;
import com.azure.storage.blob.models.BlobProperties;
import com.azure.storage.blob.models.ListBlobsOptions;
import com.scalar.cassy.config.BackupType;
import com.scalar.cassy.config.RestoreConfig;
import com.scalar.cassy.exception.FileTransferException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.CompletableFuture;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import reactor.core.publisher.Mono;

public class AzureBlobFileDownloaderTest {
  private static final String KEYSPACE_DIR = "keyspace1";
  private static final String ANY_CLUSTER_ID = "cluster_id";
  private static final String ANY_SNAPSHOT_ID = "snapshot_id";
  private static final String ANY_TARGET_IP = "target_ip";
  private static final String ANY_TMP_DATA_DIR = "tmp_data_dir";
  private static final String ANY_STOREBASE_URI = "container_name";
  private static final String BLOB_ITEM_1 = "blobitem1";
  private static final String BLOB_ITEM_2 = "blobitem2";
  @Mock private BlobContainerAsyncClient containerClient;
  @Mock private BlobAsyncClient blobClient;
  private AzureBlobFileDownloader downloader;
  @Mock private PagedFlux<BlobItem> pagedFlux;
  @Mock private Mono<BlobProperties> blobPropertiesMono1;
  @Mock private Mono<BlobProperties> blobPropertiesMono2;
  @Mock private CompletableFuture<BlobProperties> future1;
  @Mock private CompletableFuture<BlobProperties> future2;
  @Mock private BlobProperties blobProperties1;
  @Mock private BlobProperties blobProperties2;

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
    downloader = new AzureBlobFileDownloader(this.containerClient);
  }

  public Properties getProperties(BackupType type, String dataDir) {
    Properties props = new Properties();
    props.setProperty(RestoreConfig.CLUSTER_ID, ANY_CLUSTER_ID);
    props.setProperty(RestoreConfig.SNAPSHOT_ID, ANY_SNAPSHOT_ID);
    props.setProperty(RestoreConfig.RESTORE_TYPE, Integer.toString(type.get()));
    props.setProperty(RestoreConfig.TARGET_IP, ANY_TARGET_IP);
    props.setProperty(RestoreConfig.DATA_DIR, dataDir);
    props.setProperty(RestoreConfig.STORE_BASE_URI, ANY_STOREBASE_URI);
    props.setProperty(RestoreConfig.KEYSPACE, KEYSPACE_DIR);
    return props;
  }

  private List<BlobItem> getMockedList() {
    BlobItem blobItem = new BlobItem().setName(BLOB_ITEM_1);
    BlobItem blobItem2 = new BlobItem().setName(BLOB_ITEM_2);
    List<BlobItem> list = new ArrayList<>();
    list.add(blobItem);
    list.add(blobItem2);
    return list;
  }

  @Test
  public void download_ConfigGiven_ShouldDownloadProperly() throws Exception {
    // Arrange
    RestoreConfig config =
        new RestoreConfig(getProperties(BackupType.NODE_SNAPSHOT, ANY_TMP_DATA_DIR));
    when(containerClient.listBlobs(any(ListBlobsOptions.class))).thenReturn(pagedFlux);
    when(pagedFlux.toIterable()).thenReturn(getMockedList());
    when(containerClient.getBlobAsyncClient(anyString())).thenReturn(blobClient);
    when(blobClient.downloadToFile(anyString()))
        .thenReturn(blobPropertiesMono1)
        .thenReturn(blobPropertiesMono2);
    when(blobPropertiesMono1.toFuture()).thenReturn(future1);
    when(blobPropertiesMono2.toFuture()).thenReturn(future2);
    when(future1.get()).thenReturn(blobProperties1);
    when(future2.get()).thenReturn(blobProperties2);

    // Act
    downloader.download(config);

    // Assert
    verify(blobClient).downloadToFile(Paths.get(config.getDataDir(), BLOB_ITEM_1).toString());
    verify(blobClient).downloadToFile(Paths.get(config.getDataDir(), BLOB_ITEM_2).toString());
    verify(future1).get();
    verify(future2).get();
  }

  @Test
  public void download_InterruptedExceptionThrown_ShouldThrowFileTransferException()
      throws Exception {
    // Arrange
    RestoreConfig config =
        new RestoreConfig(getProperties(BackupType.NODE_SNAPSHOT, ANY_TMP_DATA_DIR));
    InterruptedException toThrow = Mockito.mock(InterruptedException.class);
    when(containerClient.listBlobs(any(ListBlobsOptions.class))).thenReturn(pagedFlux);
    when(pagedFlux.toIterable()).thenReturn(getMockedList());
    when(containerClient.getBlobAsyncClient(anyString())).thenReturn(blobClient);
    when(blobClient.downloadToFile(anyString()))
        .thenReturn(blobPropertiesMono1)
        .thenReturn(blobPropertiesMono2);
    when(blobPropertiesMono1.toFuture()).thenReturn(future1);
    when(blobPropertiesMono2.toFuture()).thenReturn(future2);
    when(future1.get()).thenThrow(toThrow);

    // Act
    assertThatThrownBy(() -> downloader.download(config))
        .isInstanceOf(FileTransferException.class)
        .hasCause(toThrow);

    // Assert
    verify(blobClient).downloadToFile(Paths.get(config.getDataDir(), BLOB_ITEM_1).toString());
    verify(blobClient).downloadToFile(Paths.get(config.getDataDir(), BLOB_ITEM_2).toString());
    verify(future2, never()).get();
  }
}
