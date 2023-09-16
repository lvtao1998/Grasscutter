// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DIHKEFDNDBL.proto

package emu.grasscutter.net.proto;

public final class DIHKEFDNDBLOuterClass {
  private DIHKEFDNDBLOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DIHKEFDNDBLOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DIHKEFDNDBL)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_new_record = 6;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();

    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>bool is_finish = 10;</code>
     * @return The isFinish.
     */
    boolean getIsFinish();

    /**
     * <code>uint32 score = 13;</code>
     * @return The score.
     */
    int getScore();

    /**
     * <code>uint32 total_num = 14;</code>
     * @return The totalNum.
     */
    int getTotalNum();

    /**
     * <code>uint32 level_id = 15;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 KCFNBHCMLKM = 12;</code>
     * @return The kCFNBHCMLKM.
     */
    int getKCFNBHCMLKM();
  }
  /**
   * <pre>
   * CmdId: 3978
   * </pre>
   *
   * Protobuf type {@code DIHKEFDNDBL}
   */
  public static final class DIHKEFDNDBL extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DIHKEFDNDBL)
      DIHKEFDNDBLOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DIHKEFDNDBL.newBuilder() to construct.
    private DIHKEFDNDBL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DIHKEFDNDBL() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DIHKEFDNDBL();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DIHKEFDNDBL(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 24: {

              retcode_ = input.readInt32();
              break;
            }
            case 48: {

              isNewRecord_ = input.readBool();
              break;
            }
            case 80: {

              isFinish_ = input.readBool();
              break;
            }
            case 96: {

              kCFNBHCMLKM_ = input.readUInt32();
              break;
            }
            case 104: {

              score_ = input.readUInt32();
              break;
            }
            case 112: {

              totalNum_ = input.readUInt32();
              break;
            }
            case 120: {

              levelId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
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
      return emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.internal_static_DIHKEFDNDBL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.internal_static_DIHKEFDNDBL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL.class, emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL.Builder.class);
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 6;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 6;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
    }

    public static final int RETCODE_FIELD_NUMBER = 3;
    private int retcode_;
    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int IS_FINISH_FIELD_NUMBER = 10;
    private boolean isFinish_;
    /**
     * <code>bool is_finish = 10;</code>
     * @return The isFinish.
     */
    @java.lang.Override
    public boolean getIsFinish() {
      return isFinish_;
    }

    public static final int SCORE_FIELD_NUMBER = 13;
    private int score_;
    /**
     * <code>uint32 score = 13;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }

    public static final int TOTAL_NUM_FIELD_NUMBER = 14;
    private int totalNum_;
    /**
     * <code>uint32 total_num = 14;</code>
     * @return The totalNum.
     */
    @java.lang.Override
    public int getTotalNum() {
      return totalNum_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 15;
    private int levelId_;
    /**
     * <code>uint32 level_id = 15;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int KCFNBHCMLKM_FIELD_NUMBER = 12;
    private int kCFNBHCMLKM_;
    /**
     * <code>uint32 KCFNBHCMLKM = 12;</code>
     * @return The kCFNBHCMLKM.
     */
    @java.lang.Override
    public int getKCFNBHCMLKM() {
      return kCFNBHCMLKM_;
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
      if (retcode_ != 0) {
        output.writeInt32(3, retcode_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(6, isNewRecord_);
      }
      if (isFinish_ != false) {
        output.writeBool(10, isFinish_);
      }
      if (kCFNBHCMLKM_ != 0) {
        output.writeUInt32(12, kCFNBHCMLKM_);
      }
      if (score_ != 0) {
        output.writeUInt32(13, score_);
      }
      if (totalNum_ != 0) {
        output.writeUInt32(14, totalNum_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(15, levelId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, retcode_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isNewRecord_);
      }
      if (isFinish_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isFinish_);
      }
      if (kCFNBHCMLKM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, kCFNBHCMLKM_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, score_);
      }
      if (totalNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, totalNum_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL other = (emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL) obj;

      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getIsFinish()
          != other.getIsFinish()) return false;
      if (getScore()
          != other.getScore()) return false;
      if (getTotalNum()
          != other.getTotalNum()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getKCFNBHCMLKM()
          != other.getKCFNBHCMLKM()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinish());
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (37 * hash) + TOTAL_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getTotalNum();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + KCFNBHCMLKM_FIELD_NUMBER;
      hash = (53 * hash) + getKCFNBHCMLKM();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL prototype) {
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
     * <pre>
     * CmdId: 3978
     * </pre>
     *
     * Protobuf type {@code DIHKEFDNDBL}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DIHKEFDNDBL)
        emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBLOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.internal_static_DIHKEFDNDBL_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.internal_static_DIHKEFDNDBL_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL.class, emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL.newBuilder()
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
        isNewRecord_ = false;

        retcode_ = 0;

        isFinish_ = false;

        score_ = 0;

        totalNum_ = 0;

        levelId_ = 0;

        kCFNBHCMLKM_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.internal_static_DIHKEFDNDBL_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL build() {
        emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL buildPartial() {
        emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL result = new emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL(this);
        result.isNewRecord_ = isNewRecord_;
        result.retcode_ = retcode_;
        result.isFinish_ = isFinish_;
        result.score_ = score_;
        result.totalNum_ = totalNum_;
        result.levelId_ = levelId_;
        result.kCFNBHCMLKM_ = kCFNBHCMLKM_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL) {
          return mergeFrom((emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL other) {
        if (other == emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL.getDefaultInstance()) return this;
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getIsFinish() != false) {
          setIsFinish(other.getIsFinish());
        }
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        if (other.getTotalNum() != 0) {
          setTotalNum(other.getTotalNum());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getKCFNBHCMLKM() != 0) {
          setKCFNBHCMLKM(other.getKCFNBHCMLKM());
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
        emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 6;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 6;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 3;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private boolean isFinish_ ;
      /**
       * <code>bool is_finish = 10;</code>
       * @return The isFinish.
       */
      @java.lang.Override
      public boolean getIsFinish() {
        return isFinish_;
      }
      /**
       * <code>bool is_finish = 10;</code>
       * @param value The isFinish to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinish(boolean value) {
        
        isFinish_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finish = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinish() {
        
        isFinish_ = false;
        onChanged();
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 13;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 13;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
        onChanged();
        return this;
      }

      private int totalNum_ ;
      /**
       * <code>uint32 total_num = 14;</code>
       * @return The totalNum.
       */
      @java.lang.Override
      public int getTotalNum() {
        return totalNum_;
      }
      /**
       * <code>uint32 total_num = 14;</code>
       * @param value The totalNum to set.
       * @return This builder for chaining.
       */
      public Builder setTotalNum(int value) {
        
        totalNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 total_num = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalNum() {
        
        totalNum_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 15;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 15;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int kCFNBHCMLKM_ ;
      /**
       * <code>uint32 KCFNBHCMLKM = 12;</code>
       * @return The kCFNBHCMLKM.
       */
      @java.lang.Override
      public int getKCFNBHCMLKM() {
        return kCFNBHCMLKM_;
      }
      /**
       * <code>uint32 KCFNBHCMLKM = 12;</code>
       * @param value The kCFNBHCMLKM to set.
       * @return This builder for chaining.
       */
      public Builder setKCFNBHCMLKM(int value) {
        
        kCFNBHCMLKM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 KCFNBHCMLKM = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearKCFNBHCMLKM() {
        
        kCFNBHCMLKM_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:DIHKEFDNDBL)
    }

    // @@protoc_insertion_point(class_scope:DIHKEFDNDBL)
    private static final emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL();
    }

    public static emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DIHKEFDNDBL>
        PARSER = new com.google.protobuf.AbstractParser<DIHKEFDNDBL>() {
      @java.lang.Override
      public DIHKEFDNDBL parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DIHKEFDNDBL(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DIHKEFDNDBL> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DIHKEFDNDBL> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DIHKEFDNDBLOuterClass.DIHKEFDNDBL getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DIHKEFDNDBL_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DIHKEFDNDBL_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021DIHKEFDNDBL.proto\"\221\001\n\013DIHKEFDNDBL\022\025\n\ri" +
      "s_new_record\030\006 \001(\010\022\017\n\007retcode\030\003 \001(\005\022\021\n\ti" +
      "s_finish\030\n \001(\010\022\r\n\005score\030\r \001(\r\022\021\n\ttotal_n" +
      "um\030\016 \001(\r\022\020\n\010level_id\030\017 \001(\r\022\023\n\013KCFNBHCMLK" +
      "M\030\014 \001(\rB\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DIHKEFDNDBL_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DIHKEFDNDBL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DIHKEFDNDBL_descriptor,
        new java.lang.String[] { "IsNewRecord", "Retcode", "IsFinish", "Score", "TotalNum", "LevelId", "KCFNBHCMLKM", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}