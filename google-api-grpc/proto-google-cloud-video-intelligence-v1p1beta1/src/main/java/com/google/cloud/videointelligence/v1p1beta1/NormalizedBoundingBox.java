// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p1beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p1beta1;

/**
 * <pre>
 * Normalized bounding box.
 * The normalized vertex coordinates are relative to the original image.
 * Range: [0, 1].
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox}
 */
public  final class NormalizedBoundingBox extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox)
    NormalizedBoundingBoxOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NormalizedBoundingBox.newBuilder() to construct.
  private NormalizedBoundingBox(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NormalizedBoundingBox() {
    left_ = 0F;
    top_ = 0F;
    right_ = 0F;
    bottom_ = 0F;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NormalizedBoundingBox(
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
          case 13: {

            left_ = input.readFloat();
            break;
          }
          case 21: {

            top_ = input.readFloat();
            break;
          }
          case 29: {

            right_ = input.readFloat();
            break;
          }
          case 37: {

            bottom_ = input.readFloat();
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
    return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p1beta1_NormalizedBoundingBox_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p1beta1_NormalizedBoundingBox_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox.class, com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox.Builder.class);
  }

  public static final int LEFT_FIELD_NUMBER = 1;
  private float left_;
  /**
   * <pre>
   * Left X coordinate.
   * </pre>
   *
   * <code>float left = 1;</code>
   */
  public float getLeft() {
    return left_;
  }

  public static final int TOP_FIELD_NUMBER = 2;
  private float top_;
  /**
   * <pre>
   * Top Y coordinate.
   * </pre>
   *
   * <code>float top = 2;</code>
   */
  public float getTop() {
    return top_;
  }

  public static final int RIGHT_FIELD_NUMBER = 3;
  private float right_;
  /**
   * <pre>
   * Right X coordinate.
   * </pre>
   *
   * <code>float right = 3;</code>
   */
  public float getRight() {
    return right_;
  }

  public static final int BOTTOM_FIELD_NUMBER = 4;
  private float bottom_;
  /**
   * <pre>
   * Bottom Y coordinate.
   * </pre>
   *
   * <code>float bottom = 4;</code>
   */
  public float getBottom() {
    return bottom_;
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
    if (left_ != 0F) {
      output.writeFloat(1, left_);
    }
    if (top_ != 0F) {
      output.writeFloat(2, top_);
    }
    if (right_ != 0F) {
      output.writeFloat(3, right_);
    }
    if (bottom_ != 0F) {
      output.writeFloat(4, bottom_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (left_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, left_);
    }
    if (top_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, top_);
    }
    if (right_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, right_);
    }
    if (bottom_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, bottom_);
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
    if (!(obj instanceof com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox other = (com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox) obj;

    boolean result = true;
    result = result && (
        java.lang.Float.floatToIntBits(getLeft())
        == java.lang.Float.floatToIntBits(
            other.getLeft()));
    result = result && (
        java.lang.Float.floatToIntBits(getTop())
        == java.lang.Float.floatToIntBits(
            other.getTop()));
    result = result && (
        java.lang.Float.floatToIntBits(getRight())
        == java.lang.Float.floatToIntBits(
            other.getRight()));
    result = result && (
        java.lang.Float.floatToIntBits(getBottom())
        == java.lang.Float.floatToIntBits(
            other.getBottom()));
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
    hash = (37 * hash) + LEFT_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getLeft());
    hash = (37 * hash) + TOP_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getTop());
    hash = (37 * hash) + RIGHT_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getRight());
    hash = (37 * hash) + BOTTOM_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getBottom());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox parseFrom(
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
  public static Builder newBuilder(com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox prototype) {
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
   * Normalized bounding box.
   * The normalized vertex coordinates are relative to the original image.
   * Range: [0, 1].
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox)
      com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBoxOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p1beta1_NormalizedBoundingBox_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p1beta1_NormalizedBoundingBox_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox.class, com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox.Builder.class);
    }

    // Construct using com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox.newBuilder()
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
    public Builder clear() {
      super.clear();
      left_ = 0F;

      top_ = 0F;

      right_ = 0F;

      bottom_ = 0F;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p1beta1_NormalizedBoundingBox_descriptor;
    }

    public com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox.getDefaultInstance();
    }

    public com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox build() {
      com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox buildPartial() {
      com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox result = new com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox(this);
      result.left_ = left_;
      result.top_ = top_;
      result.right_ = right_;
      result.bottom_ = bottom_;
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
      if (other instanceof com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox) {
        return mergeFrom((com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox other) {
      if (other == com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox.getDefaultInstance()) return this;
      if (other.getLeft() != 0F) {
        setLeft(other.getLeft());
      }
      if (other.getTop() != 0F) {
        setTop(other.getTop());
      }
      if (other.getRight() != 0F) {
        setRight(other.getRight());
      }
      if (other.getBottom() != 0F) {
        setBottom(other.getBottom());
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
      com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float left_ ;
    /**
     * <pre>
     * Left X coordinate.
     * </pre>
     *
     * <code>float left = 1;</code>
     */
    public float getLeft() {
      return left_;
    }
    /**
     * <pre>
     * Left X coordinate.
     * </pre>
     *
     * <code>float left = 1;</code>
     */
    public Builder setLeft(float value) {
      
      left_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Left X coordinate.
     * </pre>
     *
     * <code>float left = 1;</code>
     */
    public Builder clearLeft() {
      
      left_ = 0F;
      onChanged();
      return this;
    }

    private float top_ ;
    /**
     * <pre>
     * Top Y coordinate.
     * </pre>
     *
     * <code>float top = 2;</code>
     */
    public float getTop() {
      return top_;
    }
    /**
     * <pre>
     * Top Y coordinate.
     * </pre>
     *
     * <code>float top = 2;</code>
     */
    public Builder setTop(float value) {
      
      top_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Top Y coordinate.
     * </pre>
     *
     * <code>float top = 2;</code>
     */
    public Builder clearTop() {
      
      top_ = 0F;
      onChanged();
      return this;
    }

    private float right_ ;
    /**
     * <pre>
     * Right X coordinate.
     * </pre>
     *
     * <code>float right = 3;</code>
     */
    public float getRight() {
      return right_;
    }
    /**
     * <pre>
     * Right X coordinate.
     * </pre>
     *
     * <code>float right = 3;</code>
     */
    public Builder setRight(float value) {
      
      right_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Right X coordinate.
     * </pre>
     *
     * <code>float right = 3;</code>
     */
    public Builder clearRight() {
      
      right_ = 0F;
      onChanged();
      return this;
    }

    private float bottom_ ;
    /**
     * <pre>
     * Bottom Y coordinate.
     * </pre>
     *
     * <code>float bottom = 4;</code>
     */
    public float getBottom() {
      return bottom_;
    }
    /**
     * <pre>
     * Bottom Y coordinate.
     * </pre>
     *
     * <code>float bottom = 4;</code>
     */
    public Builder setBottom(float value) {
      
      bottom_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Bottom Y coordinate.
     * </pre>
     *
     * <code>float bottom = 4;</code>
     */
    public Builder clearBottom() {
      
      bottom_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox)
  private static final com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox();
  }

  public static com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NormalizedBoundingBox>
      PARSER = new com.google.protobuf.AbstractParser<NormalizedBoundingBox>() {
    public NormalizedBoundingBox parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NormalizedBoundingBox(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NormalizedBoundingBox> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NormalizedBoundingBox> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.videointelligence.v1p1beta1.NormalizedBoundingBox getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

