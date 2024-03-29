// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/cluster.proto

package org.tensorflow.distruntime;

/**
 * <pre>
 * Defines a TensorFlow cluster as a set of jobs.
 * </pre>
 *
 * Protobuf type {@code tensorflow.ClusterDef}
 */
public  final class ClusterDef extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.ClusterDef)
    ClusterDefOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClusterDef.newBuilder() to construct.
  private ClusterDef(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClusterDef() {
    job_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClusterDef(
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
              job_ = new java.util.ArrayList<org.tensorflow.distruntime.JobDef>();
              mutable_bitField0_ |= 0x00000001;
            }
            job_.add(
                input.readMessage(org.tensorflow.distruntime.JobDef.parser(), extensionRegistry));
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
        job_ = java.util.Collections.unmodifiableList(job_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.distruntime.ClusterProtos.internal_static_tensorflow_ClusterDef_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.distruntime.ClusterProtos.internal_static_tensorflow_ClusterDef_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.distruntime.ClusterDef.class, org.tensorflow.distruntime.ClusterDef.Builder.class);
  }

  public static final int JOB_FIELD_NUMBER = 1;
  private java.util.List<org.tensorflow.distruntime.JobDef> job_;
  /**
   * <pre>
   * The jobs that comprise the cluster.
   * </pre>
   *
   * <code>repeated .tensorflow.JobDef job = 1;</code>
   */
  public java.util.List<org.tensorflow.distruntime.JobDef> getJobList() {
    return job_;
  }
  /**
   * <pre>
   * The jobs that comprise the cluster.
   * </pre>
   *
   * <code>repeated .tensorflow.JobDef job = 1;</code>
   */
  public java.util.List<? extends org.tensorflow.distruntime.JobDefOrBuilder> 
      getJobOrBuilderList() {
    return job_;
  }
  /**
   * <pre>
   * The jobs that comprise the cluster.
   * </pre>
   *
   * <code>repeated .tensorflow.JobDef job = 1;</code>
   */
  public int getJobCount() {
    return job_.size();
  }
  /**
   * <pre>
   * The jobs that comprise the cluster.
   * </pre>
   *
   * <code>repeated .tensorflow.JobDef job = 1;</code>
   */
  public org.tensorflow.distruntime.JobDef getJob(int index) {
    return job_.get(index);
  }
  /**
   * <pre>
   * The jobs that comprise the cluster.
   * </pre>
   *
   * <code>repeated .tensorflow.JobDef job = 1;</code>
   */
  public org.tensorflow.distruntime.JobDefOrBuilder getJobOrBuilder(
      int index) {
    return job_.get(index);
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
    for (int i = 0; i < job_.size(); i++) {
      output.writeMessage(1, job_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < job_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, job_.get(i));
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
    if (!(obj instanceof org.tensorflow.distruntime.ClusterDef)) {
      return super.equals(obj);
    }
    org.tensorflow.distruntime.ClusterDef other = (org.tensorflow.distruntime.ClusterDef) obj;

    boolean result = true;
    result = result && getJobList()
        .equals(other.getJobList());
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
    if (getJobCount() > 0) {
      hash = (37 * hash) + JOB_FIELD_NUMBER;
      hash = (53 * hash) + getJobList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.distruntime.ClusterDef parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.ClusterDef parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.ClusterDef parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.ClusterDef parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.ClusterDef parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.ClusterDef parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.ClusterDef parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.ClusterDef parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.ClusterDef parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.ClusterDef parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.ClusterDef parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.ClusterDef parseFrom(
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
  public static Builder newBuilder(org.tensorflow.distruntime.ClusterDef prototype) {
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
   * Defines a TensorFlow cluster as a set of jobs.
   * </pre>
   *
   * Protobuf type {@code tensorflow.ClusterDef}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.ClusterDef)
      org.tensorflow.distruntime.ClusterDefOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.distruntime.ClusterProtos.internal_static_tensorflow_ClusterDef_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.distruntime.ClusterProtos.internal_static_tensorflow_ClusterDef_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.distruntime.ClusterDef.class, org.tensorflow.distruntime.ClusterDef.Builder.class);
    }

    // Construct using org.tensorflow.distruntime.ClusterDef.newBuilder()
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
        getJobFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (jobBuilder_ == null) {
        job_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        jobBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.distruntime.ClusterProtos.internal_static_tensorflow_ClusterDef_descriptor;
    }

    public org.tensorflow.distruntime.ClusterDef getDefaultInstanceForType() {
      return org.tensorflow.distruntime.ClusterDef.getDefaultInstance();
    }

    public org.tensorflow.distruntime.ClusterDef build() {
      org.tensorflow.distruntime.ClusterDef result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.tensorflow.distruntime.ClusterDef buildPartial() {
      org.tensorflow.distruntime.ClusterDef result = new org.tensorflow.distruntime.ClusterDef(this);
      int from_bitField0_ = bitField0_;
      if (jobBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          job_ = java.util.Collections.unmodifiableList(job_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.job_ = job_;
      } else {
        result.job_ = jobBuilder_.build();
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
      if (other instanceof org.tensorflow.distruntime.ClusterDef) {
        return mergeFrom((org.tensorflow.distruntime.ClusterDef)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.distruntime.ClusterDef other) {
      if (other == org.tensorflow.distruntime.ClusterDef.getDefaultInstance()) return this;
      if (jobBuilder_ == null) {
        if (!other.job_.isEmpty()) {
          if (job_.isEmpty()) {
            job_ = other.job_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureJobIsMutable();
            job_.addAll(other.job_);
          }
          onChanged();
        }
      } else {
        if (!other.job_.isEmpty()) {
          if (jobBuilder_.isEmpty()) {
            jobBuilder_.dispose();
            jobBuilder_ = null;
            job_ = other.job_;
            bitField0_ = (bitField0_ & ~0x00000001);
            jobBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getJobFieldBuilder() : null;
          } else {
            jobBuilder_.addAllMessages(other.job_);
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
      org.tensorflow.distruntime.ClusterDef parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.distruntime.ClusterDef) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.tensorflow.distruntime.JobDef> job_ =
      java.util.Collections.emptyList();
    private void ensureJobIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        job_ = new java.util.ArrayList<org.tensorflow.distruntime.JobDef>(job_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.distruntime.JobDef, org.tensorflow.distruntime.JobDef.Builder, org.tensorflow.distruntime.JobDefOrBuilder> jobBuilder_;

    /**
     * <pre>
     * The jobs that comprise the cluster.
     * </pre>
     *
     * <code>repeated .tensorflow.JobDef job = 1;</code>
     */
    public java.util.List<org.tensorflow.distruntime.JobDef> getJobList() {
      if (jobBuilder_ == null) {
        return java.util.Collections.unmodifiableList(job_);
      } else {
        return jobBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The jobs that comprise the cluster.
     * </pre>
     *
     * <code>repeated .tensorflow.JobDef job = 1;</code>
     */
    public int getJobCount() {
      if (jobBuilder_ == null) {
        return job_.size();
      } else {
        return jobBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The jobs that comprise the cluster.
     * </pre>
     *
     * <code>repeated .tensorflow.JobDef job = 1;</code>
     */
    public org.tensorflow.distruntime.JobDef getJob(int index) {
      if (jobBuilder_ == null) {
        return job_.get(index);
      } else {
        return jobBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The jobs that comprise the cluster.
     * </pre>
     *
     * <code>repeated .tensorflow.JobDef job = 1;</code>
     */
    public Builder setJob(
        int index, org.tensorflow.distruntime.JobDef value) {
      if (jobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobIsMutable();
        job_.set(index, value);
        onChanged();
      } else {
        jobBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The jobs that comprise the cluster.
     * </pre>
     *
     * <code>repeated .tensorflow.JobDef job = 1;</code>
     */
    public Builder setJob(
        int index, org.tensorflow.distruntime.JobDef.Builder builderForValue) {
      if (jobBuilder_ == null) {
        ensureJobIsMutable();
        job_.set(index, builderForValue.build());
        onChanged();
      } else {
        jobBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The jobs that comprise the cluster.
     * </pre>
     *
     * <code>repeated .tensorflow.JobDef job = 1;</code>
     */
    public Builder addJob(org.tensorflow.distruntime.JobDef value) {
      if (jobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobIsMutable();
        job_.add(value);
        onChanged();
      } else {
        jobBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The jobs that comprise the cluster.
     * </pre>
     *
     * <code>repeated .tensorflow.JobDef job = 1;</code>
     */
    public Builder addJob(
        int index, org.tensorflow.distruntime.JobDef value) {
      if (jobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobIsMutable();
        job_.add(index, value);
        onChanged();
      } else {
        jobBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The jobs that comprise the cluster.
     * </pre>
     *
     * <code>repeated .tensorflow.JobDef job = 1;</code>
     */
    public Builder addJob(
        org.tensorflow.distruntime.JobDef.Builder builderForValue) {
      if (jobBuilder_ == null) {
        ensureJobIsMutable();
        job_.add(builderForValue.build());
        onChanged();
      } else {
        jobBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The jobs that comprise the cluster.
     * </pre>
     *
     * <code>repeated .tensorflow.JobDef job = 1;</code>
     */
    public Builder addJob(
        int index, org.tensorflow.distruntime.JobDef.Builder builderForValue) {
      if (jobBuilder_ == null) {
        ensureJobIsMutable();
        job_.add(index, builderForValue.build());
        onChanged();
      } else {
        jobBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The jobs that comprise the cluster.
     * </pre>
     *
     * <code>repeated .tensorflow.JobDef job = 1;</code>
     */
    public Builder addAllJob(
        java.lang.Iterable<? extends org.tensorflow.distruntime.JobDef> values) {
      if (jobBuilder_ == null) {
        ensureJobIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, job_);
        onChanged();
      } else {
        jobBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The jobs that comprise the cluster.
     * </pre>
     *
     * <code>repeated .tensorflow.JobDef job = 1;</code>
     */
    public Builder clearJob() {
      if (jobBuilder_ == null) {
        job_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        jobBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The jobs that comprise the cluster.
     * </pre>
     *
     * <code>repeated .tensorflow.JobDef job = 1;</code>
     */
    public Builder removeJob(int index) {
      if (jobBuilder_ == null) {
        ensureJobIsMutable();
        job_.remove(index);
        onChanged();
      } else {
        jobBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The jobs that comprise the cluster.
     * </pre>
     *
     * <code>repeated .tensorflow.JobDef job = 1;</code>
     */
    public org.tensorflow.distruntime.JobDef.Builder getJobBuilder(
        int index) {
      return getJobFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The jobs that comprise the cluster.
     * </pre>
     *
     * <code>repeated .tensorflow.JobDef job = 1;</code>
     */
    public org.tensorflow.distruntime.JobDefOrBuilder getJobOrBuilder(
        int index) {
      if (jobBuilder_ == null) {
        return job_.get(index);  } else {
        return jobBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The jobs that comprise the cluster.
     * </pre>
     *
     * <code>repeated .tensorflow.JobDef job = 1;</code>
     */
    public java.util.List<? extends org.tensorflow.distruntime.JobDefOrBuilder> 
         getJobOrBuilderList() {
      if (jobBuilder_ != null) {
        return jobBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(job_);
      }
    }
    /**
     * <pre>
     * The jobs that comprise the cluster.
     * </pre>
     *
     * <code>repeated .tensorflow.JobDef job = 1;</code>
     */
    public org.tensorflow.distruntime.JobDef.Builder addJobBuilder() {
      return getJobFieldBuilder().addBuilder(
          org.tensorflow.distruntime.JobDef.getDefaultInstance());
    }
    /**
     * <pre>
     * The jobs that comprise the cluster.
     * </pre>
     *
     * <code>repeated .tensorflow.JobDef job = 1;</code>
     */
    public org.tensorflow.distruntime.JobDef.Builder addJobBuilder(
        int index) {
      return getJobFieldBuilder().addBuilder(
          index, org.tensorflow.distruntime.JobDef.getDefaultInstance());
    }
    /**
     * <pre>
     * The jobs that comprise the cluster.
     * </pre>
     *
     * <code>repeated .tensorflow.JobDef job = 1;</code>
     */
    public java.util.List<org.tensorflow.distruntime.JobDef.Builder> 
         getJobBuilderList() {
      return getJobFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.distruntime.JobDef, org.tensorflow.distruntime.JobDef.Builder, org.tensorflow.distruntime.JobDefOrBuilder> 
        getJobFieldBuilder() {
      if (jobBuilder_ == null) {
        jobBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.tensorflow.distruntime.JobDef, org.tensorflow.distruntime.JobDef.Builder, org.tensorflow.distruntime.JobDefOrBuilder>(
                job_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        job_ = null;
      }
      return jobBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.ClusterDef)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.ClusterDef)
  private static final org.tensorflow.distruntime.ClusterDef DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.distruntime.ClusterDef();
  }

  public static org.tensorflow.distruntime.ClusterDef getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClusterDef>
      PARSER = new com.google.protobuf.AbstractParser<ClusterDef>() {
    public ClusterDef parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClusterDef(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClusterDef> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClusterDef> getParserForType() {
    return PARSER;
  }

  public org.tensorflow.distruntime.ClusterDef getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

