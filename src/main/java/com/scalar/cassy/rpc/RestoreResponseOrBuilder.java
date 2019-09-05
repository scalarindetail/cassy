// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cassy.proto

package com.scalar.cassy.rpc;

public interface RestoreResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpc.RestoreResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.rpc.OperationStatus status = 1;</code>
   */
  int getStatusValue();
  /**
   * <code>.rpc.OperationStatus status = 1;</code>
   */
  com.scalar.cassy.rpc.OperationStatus getStatus();

  /**
   * <code>string cluster_id = 2;</code>
   */
  java.lang.String getClusterId();
  /**
   * <code>string cluster_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getClusterIdBytes();

  /**
   * <code>repeated string target_ips = 3;</code>
   */
  java.util.List<java.lang.String>
      getTargetIpsList();
  /**
   * <code>repeated string target_ips = 3;</code>
   */
  int getTargetIpsCount();
  /**
   * <code>repeated string target_ips = 3;</code>
   */
  java.lang.String getTargetIps(int index);
  /**
   * <code>repeated string target_ips = 3;</code>
   */
  com.google.protobuf.ByteString
      getTargetIpsBytes(int index);

  /**
   * <code>string snapshot_id = 4;</code>
   */
  java.lang.String getSnapshotId();
  /**
   * <code>string snapshot_id = 4;</code>
   */
  com.google.protobuf.ByteString
      getSnapshotIdBytes();

  /**
   * <code>uint32 restore_type = 5;</code>
   */
  int getRestoreType();

  /**
   * <code>bool snapshot_only = 6;</code>
   */
  boolean getSnapshotOnly();
}