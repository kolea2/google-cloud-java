// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1/entity.proto

package com.google.datastore.v1;

/**
 * <pre>
 * An array value.
 * </pre>
 *
 * Protobuf type {@code google.datastore.v1.ArrayValue}
 */
public  final class ArrayValue extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.datastore.v1.ArrayValue)
    ArrayValueOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ArrayValue.newBuilder() to construct.
  private ArrayValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ArrayValue() {
    values_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ArrayValue(
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
              values_ = new java.util.ArrayList<com.google.datastore.v1.Value>();
              mutable_bitField0_ |= 0x00000001;
            }
            values_.add(
                input.readMessage(com.google.datastore.v1.Value.parser(), extensionRegistry));
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
        values_ = java.util.Collections.unmodifiableList(values_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.datastore.v1.EntityProto.internal_static_google_datastore_v1_ArrayValue_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.datastore.v1.EntityProto.internal_static_google_datastore_v1_ArrayValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.datastore.v1.ArrayValue.class, com.google.datastore.v1.ArrayValue.Builder.class);
  }

  public static final int VALUES_FIELD_NUMBER = 1;
  private java.util.List<com.google.datastore.v1.Value> values_;
  /**
   * <pre>
   * Values in the array.
   * The order of this array may not be preserved if it contains a mix of
   * indexed and unindexed values.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Value values = 1;</code>
   */
  public java.util.List<com.google.datastore.v1.Value> getValuesList() {
    return values_;
  }
  /**
   * <pre>
   * Values in the array.
   * The order of this array may not be preserved if it contains a mix of
   * indexed and unindexed values.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Value values = 1;</code>
   */
  public java.util.List<? extends com.google.datastore.v1.ValueOrBuilder> 
      getValuesOrBuilderList() {
    return values_;
  }
  /**
   * <pre>
   * Values in the array.
   * The order of this array may not be preserved if it contains a mix of
   * indexed and unindexed values.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Value values = 1;</code>
   */
  public int getValuesCount() {
    return values_.size();
  }
  /**
   * <pre>
   * Values in the array.
   * The order of this array may not be preserved if it contains a mix of
   * indexed and unindexed values.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Value values = 1;</code>
   */
  public com.google.datastore.v1.Value getValues(int index) {
    return values_.get(index);
  }
  /**
   * <pre>
   * Values in the array.
   * The order of this array may not be preserved if it contains a mix of
   * indexed and unindexed values.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Value values = 1;</code>
   */
  public com.google.datastore.v1.ValueOrBuilder getValuesOrBuilder(
      int index) {
    return values_.get(index);
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
    for (int i = 0; i < values_.size(); i++) {
      output.writeMessage(1, values_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < values_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, values_.get(i));
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
    if (!(obj instanceof com.google.datastore.v1.ArrayValue)) {
      return super.equals(obj);
    }
    com.google.datastore.v1.ArrayValue other = (com.google.datastore.v1.ArrayValue) obj;

    boolean result = true;
    result = result && getValuesList()
        .equals(other.getValuesList());
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
    if (getValuesCount() > 0) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getValuesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.datastore.v1.ArrayValue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.v1.ArrayValue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.v1.ArrayValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.v1.ArrayValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.v1.ArrayValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.v1.ArrayValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.v1.ArrayValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1.ArrayValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.datastore.v1.ArrayValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1.ArrayValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.datastore.v1.ArrayValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1.ArrayValue parseFrom(
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
  public static Builder newBuilder(com.google.datastore.v1.ArrayValue prototype) {
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
   * An array value.
   * </pre>
   *
   * Protobuf type {@code google.datastore.v1.ArrayValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.datastore.v1.ArrayValue)
      com.google.datastore.v1.ArrayValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.datastore.v1.EntityProto.internal_static_google_datastore_v1_ArrayValue_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.datastore.v1.EntityProto.internal_static_google_datastore_v1_ArrayValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.datastore.v1.ArrayValue.class, com.google.datastore.v1.ArrayValue.Builder.class);
    }

    // Construct using com.google.datastore.v1.ArrayValue.newBuilder()
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
        getValuesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (valuesBuilder_ == null) {
        values_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        valuesBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.datastore.v1.EntityProto.internal_static_google_datastore_v1_ArrayValue_descriptor;
    }

    public com.google.datastore.v1.ArrayValue getDefaultInstanceForType() {
      return com.google.datastore.v1.ArrayValue.getDefaultInstance();
    }

    public com.google.datastore.v1.ArrayValue build() {
      com.google.datastore.v1.ArrayValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.datastore.v1.ArrayValue buildPartial() {
      com.google.datastore.v1.ArrayValue result = new com.google.datastore.v1.ArrayValue(this);
      int from_bitField0_ = bitField0_;
      if (valuesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          values_ = java.util.Collections.unmodifiableList(values_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.values_ = values_;
      } else {
        result.values_ = valuesBuilder_.build();
      }
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
      if (other instanceof com.google.datastore.v1.ArrayValue) {
        return mergeFrom((com.google.datastore.v1.ArrayValue)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.datastore.v1.ArrayValue other) {
      if (other == com.google.datastore.v1.ArrayValue.getDefaultInstance()) return this;
      if (valuesBuilder_ == null) {
        if (!other.values_.isEmpty()) {
          if (values_.isEmpty()) {
            values_ = other.values_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureValuesIsMutable();
            values_.addAll(other.values_);
          }
          onChanged();
        }
      } else {
        if (!other.values_.isEmpty()) {
          if (valuesBuilder_.isEmpty()) {
            valuesBuilder_.dispose();
            valuesBuilder_ = null;
            values_ = other.values_;
            bitField0_ = (bitField0_ & ~0x00000001);
            valuesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getValuesFieldBuilder() : null;
          } else {
            valuesBuilder_.addAllMessages(other.values_);
          }
        }
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
      com.google.datastore.v1.ArrayValue parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.datastore.v1.ArrayValue) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.datastore.v1.Value> values_ =
      java.util.Collections.emptyList();
    private void ensureValuesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        values_ = new java.util.ArrayList<com.google.datastore.v1.Value>(values_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.datastore.v1.Value, com.google.datastore.v1.Value.Builder, com.google.datastore.v1.ValueOrBuilder> valuesBuilder_;

    /**
     * <pre>
     * Values in the array.
     * The order of this array may not be preserved if it contains a mix of
     * indexed and unindexed values.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Value values = 1;</code>
     */
    public java.util.List<com.google.datastore.v1.Value> getValuesList() {
      if (valuesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(values_);
      } else {
        return valuesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Values in the array.
     * The order of this array may not be preserved if it contains a mix of
     * indexed and unindexed values.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Value values = 1;</code>
     */
    public int getValuesCount() {
      if (valuesBuilder_ == null) {
        return values_.size();
      } else {
        return valuesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Values in the array.
     * The order of this array may not be preserved if it contains a mix of
     * indexed and unindexed values.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Value values = 1;</code>
     */
    public com.google.datastore.v1.Value getValues(int index) {
      if (valuesBuilder_ == null) {
        return values_.get(index);
      } else {
        return valuesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Values in the array.
     * The order of this array may not be preserved if it contains a mix of
     * indexed and unindexed values.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Value values = 1;</code>
     */
    public Builder setValues(
        int index, com.google.datastore.v1.Value value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.set(index, value);
        onChanged();
      } else {
        valuesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Values in the array.
     * The order of this array may not be preserved if it contains a mix of
     * indexed and unindexed values.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Value values = 1;</code>
     */
    public Builder setValues(
        int index, com.google.datastore.v1.Value.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.set(index, builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Values in the array.
     * The order of this array may not be preserved if it contains a mix of
     * indexed and unindexed values.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Value values = 1;</code>
     */
    public Builder addValues(com.google.datastore.v1.Value value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.add(value);
        onChanged();
      } else {
        valuesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Values in the array.
     * The order of this array may not be preserved if it contains a mix of
     * indexed and unindexed values.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Value values = 1;</code>
     */
    public Builder addValues(
        int index, com.google.datastore.v1.Value value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.add(index, value);
        onChanged();
      } else {
        valuesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Values in the array.
     * The order of this array may not be preserved if it contains a mix of
     * indexed and unindexed values.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Value values = 1;</code>
     */
    public Builder addValues(
        com.google.datastore.v1.Value.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.add(builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Values in the array.
     * The order of this array may not be preserved if it contains a mix of
     * indexed and unindexed values.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Value values = 1;</code>
     */
    public Builder addValues(
        int index, com.google.datastore.v1.Value.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.add(index, builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Values in the array.
     * The order of this array may not be preserved if it contains a mix of
     * indexed and unindexed values.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Value values = 1;</code>
     */
    public Builder addAllValues(
        java.lang.Iterable<? extends com.google.datastore.v1.Value> values) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, values_);
        onChanged();
      } else {
        valuesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Values in the array.
     * The order of this array may not be preserved if it contains a mix of
     * indexed and unindexed values.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Value values = 1;</code>
     */
    public Builder clearValues() {
      if (valuesBuilder_ == null) {
        values_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        valuesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Values in the array.
     * The order of this array may not be preserved if it contains a mix of
     * indexed and unindexed values.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Value values = 1;</code>
     */
    public Builder removeValues(int index) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.remove(index);
        onChanged();
      } else {
        valuesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Values in the array.
     * The order of this array may not be preserved if it contains a mix of
     * indexed and unindexed values.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Value values = 1;</code>
     */
    public com.google.datastore.v1.Value.Builder getValuesBuilder(
        int index) {
      return getValuesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Values in the array.
     * The order of this array may not be preserved if it contains a mix of
     * indexed and unindexed values.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Value values = 1;</code>
     */
    public com.google.datastore.v1.ValueOrBuilder getValuesOrBuilder(
        int index) {
      if (valuesBuilder_ == null) {
        return values_.get(index);  } else {
        return valuesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Values in the array.
     * The order of this array may not be preserved if it contains a mix of
     * indexed and unindexed values.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Value values = 1;</code>
     */
    public java.util.List<? extends com.google.datastore.v1.ValueOrBuilder> 
         getValuesOrBuilderList() {
      if (valuesBuilder_ != null) {
        return valuesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(values_);
      }
    }
    /**
     * <pre>
     * Values in the array.
     * The order of this array may not be preserved if it contains a mix of
     * indexed and unindexed values.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Value values = 1;</code>
     */
    public com.google.datastore.v1.Value.Builder addValuesBuilder() {
      return getValuesFieldBuilder().addBuilder(
          com.google.datastore.v1.Value.getDefaultInstance());
    }
    /**
     * <pre>
     * Values in the array.
     * The order of this array may not be preserved if it contains a mix of
     * indexed and unindexed values.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Value values = 1;</code>
     */
    public com.google.datastore.v1.Value.Builder addValuesBuilder(
        int index) {
      return getValuesFieldBuilder().addBuilder(
          index, com.google.datastore.v1.Value.getDefaultInstance());
    }
    /**
     * <pre>
     * Values in the array.
     * The order of this array may not be preserved if it contains a mix of
     * indexed and unindexed values.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Value values = 1;</code>
     */
    public java.util.List<com.google.datastore.v1.Value.Builder> 
         getValuesBuilderList() {
      return getValuesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.datastore.v1.Value, com.google.datastore.v1.Value.Builder, com.google.datastore.v1.ValueOrBuilder> 
        getValuesFieldBuilder() {
      if (valuesBuilder_ == null) {
        valuesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.datastore.v1.Value, com.google.datastore.v1.Value.Builder, com.google.datastore.v1.ValueOrBuilder>(
                values_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        values_ = null;
      }
      return valuesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.datastore.v1.ArrayValue)
  }

  // @@protoc_insertion_point(class_scope:google.datastore.v1.ArrayValue)
  private static final com.google.datastore.v1.ArrayValue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.datastore.v1.ArrayValue();
  }

  public static com.google.datastore.v1.ArrayValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ArrayValue>
      PARSER = new com.google.protobuf.AbstractParser<ArrayValue>() {
    public ArrayValue parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ArrayValue(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ArrayValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ArrayValue> getParserForType() {
    return PARSER;
  }

  public com.google.datastore.v1.ArrayValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

