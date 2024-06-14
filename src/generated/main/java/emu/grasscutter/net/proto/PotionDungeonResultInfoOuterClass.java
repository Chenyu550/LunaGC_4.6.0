// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PotionDungeonResultInfo.proto

package emu.grasscutter.net.proto;

public final class PotionDungeonResultInfoOuterClass {
  private PotionDungeonResultInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PotionDungeonResultInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PotionDungeonResultInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 IPKGIOBPENI = 3;</code>
     * @return The iPKGIOBPENI.
     */
    int getIPKGIOBPENI();

    /**
     * <code>uint32 EEOAFHOMHPH = 8;</code>
     * @return The eEOAFHOMHPH.
     */
    int getEEOAFHOMHPH();

    /**
     * <code>uint32 MCAIMDGIIPN = 10;</code>
     * @return The mCAIMDGIIPN.
     */
    int getMCAIMDGIIPN();

    /**
     * <code>uint32 level_id = 11;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 IKDMGBPAKOL = 12;</code>
     * @return The iKDMGBPAKOL.
     */
    int getIKDMGBPAKOL();

    /**
     * <code>uint32 stage_id = 13;</code>
     * @return The stageId.
     */
    int getStageId();
  }
  /**
   * <pre>
   * 4.6.0
   * </pre>
   *
   * Protobuf type {@code PotionDungeonResultInfo}
   */
  public static final class PotionDungeonResultInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PotionDungeonResultInfo)
      PotionDungeonResultInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PotionDungeonResultInfo.newBuilder() to construct.
    private PotionDungeonResultInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PotionDungeonResultInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PotionDungeonResultInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PotionDungeonResultInfo(
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

              iPKGIOBPENI_ = input.readUInt32();
              break;
            }
            case 64: {

              eEOAFHOMHPH_ = input.readUInt32();
              break;
            }
            case 80: {

              mCAIMDGIIPN_ = input.readUInt32();
              break;
            }
            case 88: {

              levelId_ = input.readUInt32();
              break;
            }
            case 96: {

              iKDMGBPAKOL_ = input.readUInt32();
              break;
            }
            case 104: {

              stageId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.internal_static_PotionDungeonResultInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.internal_static_PotionDungeonResultInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo.class, emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo.Builder.class);
    }

    public static final int IPKGIOBPENI_FIELD_NUMBER = 3;
    private int iPKGIOBPENI_;
    /**
     * <code>uint32 IPKGIOBPENI = 3;</code>
     * @return The iPKGIOBPENI.
     */
    @java.lang.Override
    public int getIPKGIOBPENI() {
      return iPKGIOBPENI_;
    }

    public static final int EEOAFHOMHPH_FIELD_NUMBER = 8;
    private int eEOAFHOMHPH_;
    /**
     * <code>uint32 EEOAFHOMHPH = 8;</code>
     * @return The eEOAFHOMHPH.
     */
    @java.lang.Override
    public int getEEOAFHOMHPH() {
      return eEOAFHOMHPH_;
    }

    public static final int MCAIMDGIIPN_FIELD_NUMBER = 10;
    private int mCAIMDGIIPN_;
    /**
     * <code>uint32 MCAIMDGIIPN = 10;</code>
     * @return The mCAIMDGIIPN.
     */
    @java.lang.Override
    public int getMCAIMDGIIPN() {
      return mCAIMDGIIPN_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 11;
    private int levelId_;
    /**
     * <code>uint32 level_id = 11;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int IKDMGBPAKOL_FIELD_NUMBER = 12;
    private int iKDMGBPAKOL_;
    /**
     * <code>uint32 IKDMGBPAKOL = 12;</code>
     * @return The iKDMGBPAKOL.
     */
    @java.lang.Override
    public int getIKDMGBPAKOL() {
      return iKDMGBPAKOL_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 13;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 13;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
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
      if (iPKGIOBPENI_ != 0) {
        output.writeUInt32(3, iPKGIOBPENI_);
      }
      if (eEOAFHOMHPH_ != 0) {
        output.writeUInt32(8, eEOAFHOMHPH_);
      }
      if (mCAIMDGIIPN_ != 0) {
        output.writeUInt32(10, mCAIMDGIIPN_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(11, levelId_);
      }
      if (iKDMGBPAKOL_ != 0) {
        output.writeUInt32(12, iKDMGBPAKOL_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(13, stageId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (iPKGIOBPENI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, iPKGIOBPENI_);
      }
      if (eEOAFHOMHPH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, eEOAFHOMHPH_);
      }
      if (mCAIMDGIIPN_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, mCAIMDGIIPN_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, levelId_);
      }
      if (iKDMGBPAKOL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, iKDMGBPAKOL_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, stageId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo other = (emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo) obj;

      if (getIPKGIOBPENI()
          != other.getIPKGIOBPENI()) return false;
      if (getEEOAFHOMHPH()
          != other.getEEOAFHOMHPH()) return false;
      if (getMCAIMDGIIPN()
          != other.getMCAIMDGIIPN()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getIKDMGBPAKOL()
          != other.getIKDMGBPAKOL()) return false;
      if (getStageId()
          != other.getStageId()) return false;
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
      hash = (37 * hash) + IPKGIOBPENI_FIELD_NUMBER;
      hash = (53 * hash) + getIPKGIOBPENI();
      hash = (37 * hash) + EEOAFHOMHPH_FIELD_NUMBER;
      hash = (53 * hash) + getEEOAFHOMHPH();
      hash = (37 * hash) + MCAIMDGIIPN_FIELD_NUMBER;
      hash = (53 * hash) + getMCAIMDGIIPN();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + IKDMGBPAKOL_FIELD_NUMBER;
      hash = (53 * hash) + getIKDMGBPAKOL();
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo prototype) {
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
     * 4.6.0
     * </pre>
     *
     * Protobuf type {@code PotionDungeonResultInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PotionDungeonResultInfo)
        emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.internal_static_PotionDungeonResultInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.internal_static_PotionDungeonResultInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo.class, emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo.newBuilder()
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
        iPKGIOBPENI_ = 0;

        eEOAFHOMHPH_ = 0;

        mCAIMDGIIPN_ = 0;

        levelId_ = 0;

        iKDMGBPAKOL_ = 0;

        stageId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.internal_static_PotionDungeonResultInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo build() {
        emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo buildPartial() {
        emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo result = new emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo(this);
        result.iPKGIOBPENI_ = iPKGIOBPENI_;
        result.eEOAFHOMHPH_ = eEOAFHOMHPH_;
        result.mCAIMDGIIPN_ = mCAIMDGIIPN_;
        result.levelId_ = levelId_;
        result.iKDMGBPAKOL_ = iKDMGBPAKOL_;
        result.stageId_ = stageId_;
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
        if (other instanceof emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo) {
          return mergeFrom((emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo other) {
        if (other == emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo.getDefaultInstance()) return this;
        if (other.getIPKGIOBPENI() != 0) {
          setIPKGIOBPENI(other.getIPKGIOBPENI());
        }
        if (other.getEEOAFHOMHPH() != 0) {
          setEEOAFHOMHPH(other.getEEOAFHOMHPH());
        }
        if (other.getMCAIMDGIIPN() != 0) {
          setMCAIMDGIIPN(other.getMCAIMDGIIPN());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getIKDMGBPAKOL() != 0) {
          setIKDMGBPAKOL(other.getIKDMGBPAKOL());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
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
        emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int iPKGIOBPENI_ ;
      /**
       * <code>uint32 IPKGIOBPENI = 3;</code>
       * @return The iPKGIOBPENI.
       */
      @java.lang.Override
      public int getIPKGIOBPENI() {
        return iPKGIOBPENI_;
      }
      /**
       * <code>uint32 IPKGIOBPENI = 3;</code>
       * @param value The iPKGIOBPENI to set.
       * @return This builder for chaining.
       */
      public Builder setIPKGIOBPENI(int value) {
        
        iPKGIOBPENI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 IPKGIOBPENI = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIPKGIOBPENI() {
        
        iPKGIOBPENI_ = 0;
        onChanged();
        return this;
      }

      private int eEOAFHOMHPH_ ;
      /**
       * <code>uint32 EEOAFHOMHPH = 8;</code>
       * @return The eEOAFHOMHPH.
       */
      @java.lang.Override
      public int getEEOAFHOMHPH() {
        return eEOAFHOMHPH_;
      }
      /**
       * <code>uint32 EEOAFHOMHPH = 8;</code>
       * @param value The eEOAFHOMHPH to set.
       * @return This builder for chaining.
       */
      public Builder setEEOAFHOMHPH(int value) {
        
        eEOAFHOMHPH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 EEOAFHOMHPH = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearEEOAFHOMHPH() {
        
        eEOAFHOMHPH_ = 0;
        onChanged();
        return this;
      }

      private int mCAIMDGIIPN_ ;
      /**
       * <code>uint32 MCAIMDGIIPN = 10;</code>
       * @return The mCAIMDGIIPN.
       */
      @java.lang.Override
      public int getMCAIMDGIIPN() {
        return mCAIMDGIIPN_;
      }
      /**
       * <code>uint32 MCAIMDGIIPN = 10;</code>
       * @param value The mCAIMDGIIPN to set.
       * @return This builder for chaining.
       */
      public Builder setMCAIMDGIIPN(int value) {
        
        mCAIMDGIIPN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 MCAIMDGIIPN = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearMCAIMDGIIPN() {
        
        mCAIMDGIIPN_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 11;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 11;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int iKDMGBPAKOL_ ;
      /**
       * <code>uint32 IKDMGBPAKOL = 12;</code>
       * @return The iKDMGBPAKOL.
       */
      @java.lang.Override
      public int getIKDMGBPAKOL() {
        return iKDMGBPAKOL_;
      }
      /**
       * <code>uint32 IKDMGBPAKOL = 12;</code>
       * @param value The iKDMGBPAKOL to set.
       * @return This builder for chaining.
       */
      public Builder setIKDMGBPAKOL(int value) {
        
        iKDMGBPAKOL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 IKDMGBPAKOL = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIKDMGBPAKOL() {
        
        iKDMGBPAKOL_ = 0;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 13;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 13;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PotionDungeonResultInfo)
    }

    // @@protoc_insertion_point(class_scope:PotionDungeonResultInfo)
    private static final emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo();
    }

    public static emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PotionDungeonResultInfo>
        PARSER = new com.google.protobuf.AbstractParser<PotionDungeonResultInfo>() {
      @java.lang.Override
      public PotionDungeonResultInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PotionDungeonResultInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PotionDungeonResultInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PotionDungeonResultInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PotionDungeonResultInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PotionDungeonResultInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035PotionDungeonResultInfo.proto\"\221\001\n\027Poti" +
      "onDungeonResultInfo\022\023\n\013IPKGIOBPENI\030\003 \001(\r" +
      "\022\023\n\013EEOAFHOMHPH\030\010 \001(\r\022\023\n\013MCAIMDGIIPN\030\n \001" +
      "(\r\022\020\n\010level_id\030\013 \001(\r\022\023\n\013IKDMGBPAKOL\030\014 \001(" +
      "\r\022\020\n\010stage_id\030\r \001(\rB\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PotionDungeonResultInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PotionDungeonResultInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PotionDungeonResultInfo_descriptor,
        new java.lang.String[] { "IPKGIOBPENI", "EEOAFHOMHPH", "MCAIMDGIIPN", "LevelId", "IKDMGBPAKOL", "StageId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
