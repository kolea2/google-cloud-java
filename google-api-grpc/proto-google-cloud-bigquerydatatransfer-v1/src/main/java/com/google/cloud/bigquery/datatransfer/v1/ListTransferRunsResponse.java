// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

package com.google.cloud.bigquery.datatransfer.v1;

/**
 * <pre>
 * The returned list of pipelines in the project.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse}
 */
public  final class ListTransferRunsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse)
    ListTransferRunsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListTransferRunsResponse.newBuilder() to construct.
  private ListTransferRunsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListTransferRunsResponse() {
    transferRuns_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListTransferRunsResponse(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              transferRuns_ = new java.util.ArrayList<com.google.cloud.bigquery.datatransfer.v1.TransferRun>();
              mutable_bitField0_ |= 0x00000001;
            }
            transferRuns_.add(
                input.readMessage(com.google.cloud.bigquery.datatransfer.v1.TransferRun.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        transferRuns_ = java.util.Collections.unmodifiableList(transferRuns_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_ListTransferRunsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_ListTransferRunsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse.class, com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int TRANSFER_RUNS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.bigquery.datatransfer.v1.TransferRun> transferRuns_;
  /**
   * <pre>
   * Output only. The stored pipeline transfer runs.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun transfer_runs = 1;</code>
   */
  public java.util.List<com.google.cloud.bigquery.datatransfer.v1.TransferRun> getTransferRunsList() {
    return transferRuns_;
  }
  /**
   * <pre>
   * Output only. The stored pipeline transfer runs.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun transfer_runs = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.bigquery.datatransfer.v1.TransferRunOrBuilder> 
      getTransferRunsOrBuilderList() {
    return transferRuns_;
  }
  /**
   * <pre>
   * Output only. The stored pipeline transfer runs.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun transfer_runs = 1;</code>
   */
  public int getTransferRunsCount() {
    return transferRuns_.size();
  }
  /**
   * <pre>
   * Output only. The stored pipeline transfer runs.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun transfer_runs = 1;</code>
   */
  public com.google.cloud.bigquery.datatransfer.v1.TransferRun getTransferRuns(int index) {
    return transferRuns_.get(index);
  }
  /**
   * <pre>
   * Output only. The stored pipeline transfer runs.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun transfer_runs = 1;</code>
   */
  public com.google.cloud.bigquery.datatransfer.v1.TransferRunOrBuilder getTransferRunsOrBuilder(
      int index) {
    return transferRuns_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * Output only. The next-pagination token. For multiple-page list results,
   * this token can be used as the
   * `ListTransferRunsRequest.page_token`
   * to request the next page of list results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The next-pagination token. For multiple-page list results,
   * this token can be used as the
   * `ListTransferRunsRequest.page_token`
   * to request the next page of list results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < transferRuns_.size(); i++) {
      output.writeMessage(1, transferRuns_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < transferRuns_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, transferRuns_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse other = (com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse) obj;

    boolean result = true;
    result = result && getTransferRunsList()
        .equals(other.getTransferRunsList());
    result = result && getNextPageToken()
        .equals(other.getNextPageToken());
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
    if (getTransferRunsCount() > 0) {
      hash = (37 * hash) + TRANSFER_RUNS_FIELD_NUMBER;
      hash = (53 * hash) + getTransferRunsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   * The returned list of pipelines in the project.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse)
      com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_ListTransferRunsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_ListTransferRunsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse.class, com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse.newBuilder()
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
        getTransferRunsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (transferRunsBuilder_ == null) {
        transferRuns_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        transferRunsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_ListTransferRunsResponse_descriptor;
    }

    public com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse getDefaultInstanceForType() {
      return com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse.getDefaultInstance();
    }

    public com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse build() {
      com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse buildPartial() {
      com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse result = new com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (transferRunsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          transferRuns_ = java.util.Collections.unmodifiableList(transferRuns_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.transferRuns_ = transferRuns_;
      } else {
        result.transferRuns_ = transferRunsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse) {
        return mergeFrom((com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse other) {
      if (other == com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse.getDefaultInstance()) return this;
      if (transferRunsBuilder_ == null) {
        if (!other.transferRuns_.isEmpty()) {
          if (transferRuns_.isEmpty()) {
            transferRuns_ = other.transferRuns_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTransferRunsIsMutable();
            transferRuns_.addAll(other.transferRuns_);
          }
          onChanged();
        }
      } else {
        if (!other.transferRuns_.isEmpty()) {
          if (transferRunsBuilder_.isEmpty()) {
            transferRunsBuilder_.dispose();
            transferRunsBuilder_ = null;
            transferRuns_ = other.transferRuns_;
            bitField0_ = (bitField0_ & ~0x00000001);
            transferRunsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTransferRunsFieldBuilder() : null;
          } else {
            transferRunsBuilder_.addAllMessages(other.transferRuns_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.bigquery.datatransfer.v1.TransferRun> transferRuns_ =
      java.util.Collections.emptyList();
    private void ensureTransferRunsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        transferRuns_ = new java.util.ArrayList<com.google.cloud.bigquery.datatransfer.v1.TransferRun>(transferRuns_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.bigquery.datatransfer.v1.TransferRun, com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder, com.google.cloud.bigquery.datatransfer.v1.TransferRunOrBuilder> transferRunsBuilder_;

    /**
     * <pre>
     * Output only. The stored pipeline transfer runs.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun transfer_runs = 1;</code>
     */
    public java.util.List<com.google.cloud.bigquery.datatransfer.v1.TransferRun> getTransferRunsList() {
      if (transferRunsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(transferRuns_);
      } else {
        return transferRunsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer runs.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun transfer_runs = 1;</code>
     */
    public int getTransferRunsCount() {
      if (transferRunsBuilder_ == null) {
        return transferRuns_.size();
      } else {
        return transferRunsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer runs.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun transfer_runs = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferRun getTransferRuns(int index) {
      if (transferRunsBuilder_ == null) {
        return transferRuns_.get(index);
      } else {
        return transferRunsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer runs.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun transfer_runs = 1;</code>
     */
    public Builder setTransferRuns(
        int index, com.google.cloud.bigquery.datatransfer.v1.TransferRun value) {
      if (transferRunsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransferRunsIsMutable();
        transferRuns_.set(index, value);
        onChanged();
      } else {
        transferRunsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer runs.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun transfer_runs = 1;</code>
     */
    public Builder setTransferRuns(
        int index, com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder builderForValue) {
      if (transferRunsBuilder_ == null) {
        ensureTransferRunsIsMutable();
        transferRuns_.set(index, builderForValue.build());
        onChanged();
      } else {
        transferRunsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer runs.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun transfer_runs = 1;</code>
     */
    public Builder addTransferRuns(com.google.cloud.bigquery.datatransfer.v1.TransferRun value) {
      if (transferRunsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransferRunsIsMutable();
        transferRuns_.add(value);
        onChanged();
      } else {
        transferRunsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer runs.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun transfer_runs = 1;</code>
     */
    public Builder addTransferRuns(
        int index, com.google.cloud.bigquery.datatransfer.v1.TransferRun value) {
      if (transferRunsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransferRunsIsMutable();
        transferRuns_.add(index, value);
        onChanged();
      } else {
        transferRunsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer runs.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun transfer_runs = 1;</code>
     */
    public Builder addTransferRuns(
        com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder builderForValue) {
      if (transferRunsBuilder_ == null) {
        ensureTransferRunsIsMutable();
        transferRuns_.add(builderForValue.build());
        onChanged();
      } else {
        transferRunsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer runs.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun transfer_runs = 1;</code>
     */
    public Builder addTransferRuns(
        int index, com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder builderForValue) {
      if (transferRunsBuilder_ == null) {
        ensureTransferRunsIsMutable();
        transferRuns_.add(index, builderForValue.build());
        onChanged();
      } else {
        transferRunsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer runs.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun transfer_runs = 1;</code>
     */
    public Builder addAllTransferRuns(
        java.lang.Iterable<? extends com.google.cloud.bigquery.datatransfer.v1.TransferRun> values) {
      if (transferRunsBuilder_ == null) {
        ensureTransferRunsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, transferRuns_);
        onChanged();
      } else {
        transferRunsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer runs.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun transfer_runs = 1;</code>
     */
    public Builder clearTransferRuns() {
      if (transferRunsBuilder_ == null) {
        transferRuns_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        transferRunsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer runs.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun transfer_runs = 1;</code>
     */
    public Builder removeTransferRuns(int index) {
      if (transferRunsBuilder_ == null) {
        ensureTransferRunsIsMutable();
        transferRuns_.remove(index);
        onChanged();
      } else {
        transferRunsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer runs.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun transfer_runs = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder getTransferRunsBuilder(
        int index) {
      return getTransferRunsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer runs.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun transfer_runs = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferRunOrBuilder getTransferRunsOrBuilder(
        int index) {
      if (transferRunsBuilder_ == null) {
        return transferRuns_.get(index);  } else {
        return transferRunsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer runs.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun transfer_runs = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.bigquery.datatransfer.v1.TransferRunOrBuilder> 
         getTransferRunsOrBuilderList() {
      if (transferRunsBuilder_ != null) {
        return transferRunsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(transferRuns_);
      }
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer runs.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun transfer_runs = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder addTransferRunsBuilder() {
      return getTransferRunsFieldBuilder().addBuilder(
          com.google.cloud.bigquery.datatransfer.v1.TransferRun.getDefaultInstance());
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer runs.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun transfer_runs = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder addTransferRunsBuilder(
        int index) {
      return getTransferRunsFieldBuilder().addBuilder(
          index, com.google.cloud.bigquery.datatransfer.v1.TransferRun.getDefaultInstance());
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer runs.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun transfer_runs = 1;</code>
     */
    public java.util.List<com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder> 
         getTransferRunsBuilderList() {
      return getTransferRunsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.bigquery.datatransfer.v1.TransferRun, com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder, com.google.cloud.bigquery.datatransfer.v1.TransferRunOrBuilder> 
        getTransferRunsFieldBuilder() {
      if (transferRunsBuilder_ == null) {
        transferRunsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.bigquery.datatransfer.v1.TransferRun, com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder, com.google.cloud.bigquery.datatransfer.v1.TransferRunOrBuilder>(
                transferRuns_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        transferRuns_ = null;
      }
      return transferRunsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Output only. The next-pagination token. For multiple-page list results,
     * this token can be used as the
     * `ListTransferRunsRequest.page_token`
     * to request the next page of list results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The next-pagination token. For multiple-page list results,
     * this token can be used as the
     * `ListTransferRunsRequest.page_token`
     * to request the next page of list results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The next-pagination token. For multiple-page list results,
     * this token can be used as the
     * `ListTransferRunsRequest.page_token`
     * to request the next page of list results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The next-pagination token. For multiple-page list results,
     * this token can be used as the
     * `ListTransferRunsRequest.page_token`
     * to request the next page of list results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The next-pagination token. For multiple-page list results,
     * this token can be used as the
     * `ListTransferRunsRequest.page_token`
     * to request the next page of list results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse)
  private static final com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse();
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTransferRunsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListTransferRunsResponse>() {
    public ListTransferRunsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListTransferRunsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListTransferRunsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListTransferRunsResponse> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

