// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cassandra-backup.proto

package com.scalar.backup.cassandra.rpc;

/**
 * Protobuf type {@code rpc.BackupResponse}
 */
public  final class BackupResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rpc.BackupResponse)
    BackupResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BackupResponse.newBuilder() to construct.
  private BackupResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BackupResponse() {
    status_ = 0;
    clusterId_ = "";
    targetIps_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    snapshotId_ = "";
    createdAt_ = 0L;
    backupType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BackupResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            clusterId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              targetIps_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000004;
            }
            targetIps_.add(s);
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            snapshotId_ = s;
            break;
          }
          case 40: {

            createdAt_ = input.readUInt64();
            break;
          }
          case 48: {

            backupType_ = input.readUInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        targetIps_ = targetIps_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalar.backup.cassandra.rpc.CassandraBackupProto.internal_static_rpc_BackupResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalar.backup.cassandra.rpc.CassandraBackupProto.internal_static_rpc_BackupResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalar.backup.cassandra.rpc.BackupResponse.class, com.scalar.backup.cassandra.rpc.BackupResponse.Builder.class);
  }

  private int bitField0_;
  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.rpc.OperationStatus status = 1;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.rpc.OperationStatus status = 1;</code>
   */
  public com.scalar.backup.cassandra.rpc.OperationStatus getStatus() {
    @SuppressWarnings("deprecation")
    com.scalar.backup.cassandra.rpc.OperationStatus result = com.scalar.backup.cassandra.rpc.OperationStatus.valueOf(status_);
    return result == null ? com.scalar.backup.cassandra.rpc.OperationStatus.UNRECOGNIZED : result;
  }

  public static final int CLUSTER_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object clusterId_;
  /**
   * <code>string cluster_id = 2;</code>
   */
  public java.lang.String getClusterId() {
    java.lang.Object ref = clusterId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clusterId_ = s;
      return s;
    }
  }
  /**
   * <code>string cluster_id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getClusterIdBytes() {
    java.lang.Object ref = clusterId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clusterId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TARGET_IPS_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList targetIps_;
  /**
   * <code>repeated string target_ips = 3;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getTargetIpsList() {
    return targetIps_;
  }
  /**
   * <code>repeated string target_ips = 3;</code>
   */
  public int getTargetIpsCount() {
    return targetIps_.size();
  }
  /**
   * <code>repeated string target_ips = 3;</code>
   */
  public java.lang.String getTargetIps(int index) {
    return targetIps_.get(index);
  }
  /**
   * <code>repeated string target_ips = 3;</code>
   */
  public com.google.protobuf.ByteString
      getTargetIpsBytes(int index) {
    return targetIps_.getByteString(index);
  }

  public static final int SNAPSHOT_ID_FIELD_NUMBER = 4;
  private volatile java.lang.Object snapshotId_;
  /**
   * <code>string snapshot_id = 4;</code>
   */
  public java.lang.String getSnapshotId() {
    java.lang.Object ref = snapshotId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      snapshotId_ = s;
      return s;
    }
  }
  /**
   * <code>string snapshot_id = 4;</code>
   */
  public com.google.protobuf.ByteString
      getSnapshotIdBytes() {
    java.lang.Object ref = snapshotId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      snapshotId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATED_AT_FIELD_NUMBER = 5;
  private long createdAt_;
  /**
   * <code>uint64 created_at = 5;</code>
   */
  public long getCreatedAt() {
    return createdAt_;
  }

  public static final int BACKUP_TYPE_FIELD_NUMBER = 6;
  private int backupType_;
  /**
   * <code>uint32 backup_type = 6;</code>
   */
  public int getBackupType() {
    return backupType_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (status_ != com.scalar.backup.cassandra.rpc.OperationStatus.UNKNOWN.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (!getClusterIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, clusterId_);
    }
    for (int i = 0; i < targetIps_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, targetIps_.getRaw(i));
    }
    if (!getSnapshotIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, snapshotId_);
    }
    if (createdAt_ != 0L) {
      output.writeUInt64(5, createdAt_);
    }
    if (backupType_ != 0) {
      output.writeUInt32(6, backupType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != com.scalar.backup.cassandra.rpc.OperationStatus.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (!getClusterIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, clusterId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < targetIps_.size(); i++) {
        dataSize += computeStringSizeNoTag(targetIps_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTargetIpsList().size();
    }
    if (!getSnapshotIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, snapshotId_);
    }
    if (createdAt_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(5, createdAt_);
    }
    if (backupType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, backupType_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.scalar.backup.cassandra.rpc.BackupResponse)) {
      return super.equals(obj);
    }
    com.scalar.backup.cassandra.rpc.BackupResponse other = (com.scalar.backup.cassandra.rpc.BackupResponse) obj;

    boolean result = true;
    result = result && status_ == other.status_;
    result = result && getClusterId()
        .equals(other.getClusterId());
    result = result && getTargetIpsList()
        .equals(other.getTargetIpsList());
    result = result && getSnapshotId()
        .equals(other.getSnapshotId());
    result = result && (getCreatedAt()
        == other.getCreatedAt());
    result = result && (getBackupType()
        == other.getBackupType());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (37 * hash) + CLUSTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClusterId().hashCode();
    if (getTargetIpsCount() > 0) {
      hash = (37 * hash) + TARGET_IPS_FIELD_NUMBER;
      hash = (53 * hash) + getTargetIpsList().hashCode();
    }
    hash = (37 * hash) + SNAPSHOT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSnapshotId().hashCode();
    hash = (37 * hash) + CREATED_AT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCreatedAt());
    hash = (37 * hash) + BACKUP_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getBackupType();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalar.backup.cassandra.rpc.BackupResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalar.backup.cassandra.rpc.BackupResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalar.backup.cassandra.rpc.BackupResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalar.backup.cassandra.rpc.BackupResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalar.backup.cassandra.rpc.BackupResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalar.backup.cassandra.rpc.BackupResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalar.backup.cassandra.rpc.BackupResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalar.backup.cassandra.rpc.BackupResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalar.backup.cassandra.rpc.BackupResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.scalar.backup.cassandra.rpc.BackupResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalar.backup.cassandra.rpc.BackupResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalar.backup.cassandra.rpc.BackupResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.scalar.backup.cassandra.rpc.BackupResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code rpc.BackupResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rpc.BackupResponse)
      com.scalar.backup.cassandra.rpc.BackupResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalar.backup.cassandra.rpc.CassandraBackupProto.internal_static_rpc_BackupResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalar.backup.cassandra.rpc.CassandraBackupProto.internal_static_rpc_BackupResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalar.backup.cassandra.rpc.BackupResponse.class, com.scalar.backup.cassandra.rpc.BackupResponse.Builder.class);
    }

    // Construct using com.scalar.backup.cassandra.rpc.BackupResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      status_ = 0;

      clusterId_ = "";

      targetIps_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      snapshotId_ = "";

      createdAt_ = 0L;

      backupType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalar.backup.cassandra.rpc.CassandraBackupProto.internal_static_rpc_BackupResponse_descriptor;
    }

    @java.lang.Override
    public com.scalar.backup.cassandra.rpc.BackupResponse getDefaultInstanceForType() {
      return com.scalar.backup.cassandra.rpc.BackupResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalar.backup.cassandra.rpc.BackupResponse build() {
      com.scalar.backup.cassandra.rpc.BackupResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalar.backup.cassandra.rpc.BackupResponse buildPartial() {
      com.scalar.backup.cassandra.rpc.BackupResponse result = new com.scalar.backup.cassandra.rpc.BackupResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.status_ = status_;
      result.clusterId_ = clusterId_;
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        targetIps_ = targetIps_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.targetIps_ = targetIps_;
      result.snapshotId_ = snapshotId_;
      result.createdAt_ = createdAt_;
      result.backupType_ = backupType_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.scalar.backup.cassandra.rpc.BackupResponse) {
        return mergeFrom((com.scalar.backup.cassandra.rpc.BackupResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalar.backup.cassandra.rpc.BackupResponse other) {
      if (other == com.scalar.backup.cassandra.rpc.BackupResponse.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (!other.getClusterId().isEmpty()) {
        clusterId_ = other.clusterId_;
        onChanged();
      }
      if (!other.targetIps_.isEmpty()) {
        if (targetIps_.isEmpty()) {
          targetIps_ = other.targetIps_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureTargetIpsIsMutable();
          targetIps_.addAll(other.targetIps_);
        }
        onChanged();
      }
      if (!other.getSnapshotId().isEmpty()) {
        snapshotId_ = other.snapshotId_;
        onChanged();
      }
      if (other.getCreatedAt() != 0L) {
        setCreatedAt(other.getCreatedAt());
      }
      if (other.getBackupType() != 0) {
        setBackupType(other.getBackupType());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.scalar.backup.cassandra.rpc.BackupResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.scalar.backup.cassandra.rpc.BackupResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int status_ = 0;
    /**
     * <code>.rpc.OperationStatus status = 1;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.rpc.OperationStatus status = 1;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.rpc.OperationStatus status = 1;</code>
     */
    public com.scalar.backup.cassandra.rpc.OperationStatus getStatus() {
      @SuppressWarnings("deprecation")
      com.scalar.backup.cassandra.rpc.OperationStatus result = com.scalar.backup.cassandra.rpc.OperationStatus.valueOf(status_);
      return result == null ? com.scalar.backup.cassandra.rpc.OperationStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.rpc.OperationStatus status = 1;</code>
     */
    public Builder setStatus(com.scalar.backup.cassandra.rpc.OperationStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.rpc.OperationStatus status = 1;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object clusterId_ = "";
    /**
     * <code>string cluster_id = 2;</code>
     */
    public java.lang.String getClusterId() {
      java.lang.Object ref = clusterId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clusterId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string cluster_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getClusterIdBytes() {
      java.lang.Object ref = clusterId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clusterId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string cluster_id = 2;</code>
     */
    public Builder setClusterId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      clusterId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string cluster_id = 2;</code>
     */
    public Builder clearClusterId() {
      
      clusterId_ = getDefaultInstance().getClusterId();
      onChanged();
      return this;
    }
    /**
     * <code>string cluster_id = 2;</code>
     */
    public Builder setClusterIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      clusterId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList targetIps_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureTargetIpsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        targetIps_ = new com.google.protobuf.LazyStringArrayList(targetIps_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <code>repeated string target_ips = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getTargetIpsList() {
      return targetIps_.getUnmodifiableView();
    }
    /**
     * <code>repeated string target_ips = 3;</code>
     */
    public int getTargetIpsCount() {
      return targetIps_.size();
    }
    /**
     * <code>repeated string target_ips = 3;</code>
     */
    public java.lang.String getTargetIps(int index) {
      return targetIps_.get(index);
    }
    /**
     * <code>repeated string target_ips = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTargetIpsBytes(int index) {
      return targetIps_.getByteString(index);
    }
    /**
     * <code>repeated string target_ips = 3;</code>
     */
    public Builder setTargetIps(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTargetIpsIsMutable();
      targetIps_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string target_ips = 3;</code>
     */
    public Builder addTargetIps(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTargetIpsIsMutable();
      targetIps_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string target_ips = 3;</code>
     */
    public Builder addAllTargetIps(
        java.lang.Iterable<java.lang.String> values) {
      ensureTargetIpsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, targetIps_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string target_ips = 3;</code>
     */
    public Builder clearTargetIps() {
      targetIps_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string target_ips = 3;</code>
     */
    public Builder addTargetIpsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureTargetIpsIsMutable();
      targetIps_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object snapshotId_ = "";
    /**
     * <code>string snapshot_id = 4;</code>
     */
    public java.lang.String getSnapshotId() {
      java.lang.Object ref = snapshotId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        snapshotId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string snapshot_id = 4;</code>
     */
    public com.google.protobuf.ByteString
        getSnapshotIdBytes() {
      java.lang.Object ref = snapshotId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        snapshotId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string snapshot_id = 4;</code>
     */
    public Builder setSnapshotId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      snapshotId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string snapshot_id = 4;</code>
     */
    public Builder clearSnapshotId() {
      
      snapshotId_ = getDefaultInstance().getSnapshotId();
      onChanged();
      return this;
    }
    /**
     * <code>string snapshot_id = 4;</code>
     */
    public Builder setSnapshotIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      snapshotId_ = value;
      onChanged();
      return this;
    }

    private long createdAt_ ;
    /**
     * <code>uint64 created_at = 5;</code>
     */
    public long getCreatedAt() {
      return createdAt_;
    }
    /**
     * <code>uint64 created_at = 5;</code>
     */
    public Builder setCreatedAt(long value) {
      
      createdAt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 created_at = 5;</code>
     */
    public Builder clearCreatedAt() {
      
      createdAt_ = 0L;
      onChanged();
      return this;
    }

    private int backupType_ ;
    /**
     * <code>uint32 backup_type = 6;</code>
     */
    public int getBackupType() {
      return backupType_;
    }
    /**
     * <code>uint32 backup_type = 6;</code>
     */
    public Builder setBackupType(int value) {
      
      backupType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 backup_type = 6;</code>
     */
    public Builder clearBackupType() {
      
      backupType_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:rpc.BackupResponse)
  }

  // @@protoc_insertion_point(class_scope:rpc.BackupResponse)
  private static final com.scalar.backup.cassandra.rpc.BackupResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalar.backup.cassandra.rpc.BackupResponse();
  }

  public static com.scalar.backup.cassandra.rpc.BackupResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BackupResponse>
      PARSER = new com.google.protobuf.AbstractParser<BackupResponse>() {
    @java.lang.Override
    public BackupResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BackupResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BackupResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BackupResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalar.backup.cassandra.rpc.BackupResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

