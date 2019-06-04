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
    message_ = "";
    backupId_ = "";
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

            message_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            backupId_ = s;
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

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <pre>
   * a status of the result
   * </pre>
   *
   * <code>.rpc.OperationStatus status = 1;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <pre>
   * a status of the result
   * </pre>
   *
   * <code>.rpc.OperationStatus status = 1;</code>
   */
  public com.scalar.backup.cassandra.rpc.OperationStatus getStatus() {
    @SuppressWarnings("deprecation")
    com.scalar.backup.cassandra.rpc.OperationStatus result = com.scalar.backup.cassandra.rpc.OperationStatus.valueOf(status_);
    return result == null ? com.scalar.backup.cassandra.rpc.OperationStatus.UNRECOGNIZED : result;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object message_;
  /**
   * <pre>
   * human-readable messages from the interaction
   * </pre>
   *
   * <code>string message = 2;</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * human-readable messages from the interaction
   * </pre>
   *
   * <code>string message = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BACKUP_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object backupId_;
  /**
   * <code>string backup_id = 3;</code>
   */
  public java.lang.String getBackupId() {
    java.lang.Object ref = backupId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      backupId_ = s;
      return s;
    }
  }
  /**
   * <code>string backup_id = 3;</code>
   */
  public com.google.protobuf.ByteString
      getBackupIdBytes() {
    java.lang.Object ref = backupId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      backupId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    if (!getBackupIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, backupId_);
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
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
    }
    if (!getBackupIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, backupId_);
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
    result = result && getMessage()
        .equals(other.getMessage());
    result = result && getBackupId()
        .equals(other.getBackupId());
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
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + BACKUP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBackupId().hashCode();
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

      message_ = "";

      backupId_ = "";

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
      result.status_ = status_;
      result.message_ = message_;
      result.backupId_ = backupId_;
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
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (!other.getBackupId().isEmpty()) {
        backupId_ = other.backupId_;
        onChanged();
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

    private int status_ = 0;
    /**
     * <pre>
     * a status of the result
     * </pre>
     *
     * <code>.rpc.OperationStatus status = 1;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <pre>
     * a status of the result
     * </pre>
     *
     * <code>.rpc.OperationStatus status = 1;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * a status of the result
     * </pre>
     *
     * <code>.rpc.OperationStatus status = 1;</code>
     */
    public com.scalar.backup.cassandra.rpc.OperationStatus getStatus() {
      @SuppressWarnings("deprecation")
      com.scalar.backup.cassandra.rpc.OperationStatus result = com.scalar.backup.cassandra.rpc.OperationStatus.valueOf(status_);
      return result == null ? com.scalar.backup.cassandra.rpc.OperationStatus.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * a status of the result
     * </pre>
     *
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
     * <pre>
     * a status of the result
     * </pre>
     *
     * <code>.rpc.OperationStatus status = 1;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <pre>
     * human-readable messages from the interaction
     * </pre>
     *
     * <code>string message = 2;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * human-readable messages from the interaction
     * </pre>
     *
     * <code>string message = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * human-readable messages from the interaction
     * </pre>
     *
     * <code>string message = 2;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * human-readable messages from the interaction
     * </pre>
     *
     * <code>string message = 2;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * human-readable messages from the interaction
     * </pre>
     *
     * <code>string message = 2;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object backupId_ = "";
    /**
     * <code>string backup_id = 3;</code>
     */
    public java.lang.String getBackupId() {
      java.lang.Object ref = backupId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        backupId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string backup_id = 3;</code>
     */
    public com.google.protobuf.ByteString
        getBackupIdBytes() {
      java.lang.Object ref = backupId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        backupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string backup_id = 3;</code>
     */
    public Builder setBackupId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      backupId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string backup_id = 3;</code>
     */
    public Builder clearBackupId() {
      
      backupId_ = getDefaultInstance().getBackupId();
      onChanged();
      return this;
    }
    /**
     * <code>string backup_id = 3;</code>
     */
    public Builder setBackupIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      backupId_ = value;
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

