// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cassandra-backup.proto

package com.scalar.backup.cassandra.rpc;

public interface BackupListingResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpc.BackupListingResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .rpc.BackupListingResponse.Entry entries = 1;</code>
   */
  java.util.List<com.scalar.backup.cassandra.rpc.BackupListingResponse.Entry> 
      getEntriesList();
  /**
   * <code>repeated .rpc.BackupListingResponse.Entry entries = 1;</code>
   */
  com.scalar.backup.cassandra.rpc.BackupListingResponse.Entry getEntries(int index);
  /**
   * <code>repeated .rpc.BackupListingResponse.Entry entries = 1;</code>
   */
  int getEntriesCount();
  /**
   * <code>repeated .rpc.BackupListingResponse.Entry entries = 1;</code>
   */
  java.util.List<? extends com.scalar.backup.cassandra.rpc.BackupListingResponse.EntryOrBuilder> 
      getEntriesOrBuilderList();
  /**
   * <code>repeated .rpc.BackupListingResponse.Entry entries = 1;</code>
   */
  com.scalar.backup.cassandra.rpc.BackupListingResponse.EntryOrBuilder getEntriesOrBuilder(
      int index);
}
