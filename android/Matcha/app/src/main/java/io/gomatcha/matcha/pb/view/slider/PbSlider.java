// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gomatcha.io/matcha/pb/view/slider/slider.proto

package io.gomatcha.matcha.pb.view.slider;

public final class PbSlider {
  private PbSlider() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ViewOrBuilder extends
      // @@protoc_insertion_point(interface_extends:slider.View)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>double value = 1;</code>
     */
    double getValue();

    /**
     * <code>double maxValue = 2;</code>
     */
    double getMaxValue();

    /**
     * <code>double minValue = 3;</code>
     */
    double getMinValue();

    /**
     * <code>bool enabled = 4;</code>
     */
    boolean getEnabled();
  }
  /**
   * Protobuf type {@code slider.View}
   */
  public  static final class View extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:slider.View)
      ViewOrBuilder {
    // Use View.newBuilder() to construct.
    private View(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private View() {
      value_ = 0D;
      maxValue_ = 0D;
      minValue_ = 0D;
      enabled_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private View(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 9: {

              value_ = input.readDouble();
              break;
            }
            case 17: {

              maxValue_ = input.readDouble();
              break;
            }
            case 25: {

              minValue_ = input.readDouble();
              break;
            }
            case 32: {

              enabled_ = input.readBool();
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.gomatcha.matcha.pb.view.slider.PbSlider.internal_static_slider_View_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.gomatcha.matcha.pb.view.slider.PbSlider.internal_static_slider_View_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.gomatcha.matcha.pb.view.slider.PbSlider.View.class, io.gomatcha.matcha.pb.view.slider.PbSlider.View.Builder.class);
    }

    public static final int VALUE_FIELD_NUMBER = 1;
    private double value_;
    /**
     * <code>double value = 1;</code>
     */
    public double getValue() {
      return value_;
    }

    public static final int MAXVALUE_FIELD_NUMBER = 2;
    private double maxValue_;
    /**
     * <code>double maxValue = 2;</code>
     */
    public double getMaxValue() {
      return maxValue_;
    }

    public static final int MINVALUE_FIELD_NUMBER = 3;
    private double minValue_;
    /**
     * <code>double minValue = 3;</code>
     */
    public double getMinValue() {
      return minValue_;
    }

    public static final int ENABLED_FIELD_NUMBER = 4;
    private boolean enabled_;
    /**
     * <code>bool enabled = 4;</code>
     */
    public boolean getEnabled() {
      return enabled_;
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
      if (value_ != 0D) {
        output.writeDouble(1, value_);
      }
      if (maxValue_ != 0D) {
        output.writeDouble(2, maxValue_);
      }
      if (minValue_ != 0D) {
        output.writeDouble(3, minValue_);
      }
      if (enabled_ != false) {
        output.writeBool(4, enabled_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (value_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(1, value_);
      }
      if (maxValue_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, maxValue_);
      }
      if (minValue_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, minValue_);
      }
      if (enabled_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, enabled_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof io.gomatcha.matcha.pb.view.slider.PbSlider.View)) {
        return super.equals(obj);
      }
      io.gomatcha.matcha.pb.view.slider.PbSlider.View other = (io.gomatcha.matcha.pb.view.slider.PbSlider.View) obj;

      boolean result = true;
      result = result && (
          java.lang.Double.doubleToLongBits(getValue())
          == java.lang.Double.doubleToLongBits(
              other.getValue()));
      result = result && (
          java.lang.Double.doubleToLongBits(getMaxValue())
          == java.lang.Double.doubleToLongBits(
              other.getMaxValue()));
      result = result && (
          java.lang.Double.doubleToLongBits(getMinValue())
          == java.lang.Double.doubleToLongBits(
              other.getMinValue()));
      result = result && (getEnabled()
          == other.getEnabled());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getValue()));
      hash = (37 * hash) + MAXVALUE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getMaxValue()));
      hash = (37 * hash) + MINVALUE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getMinValue()));
      hash = (37 * hash) + ENABLED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getEnabled());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.gomatcha.matcha.pb.view.slider.PbSlider.View parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.gomatcha.matcha.pb.view.slider.PbSlider.View parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.gomatcha.matcha.pb.view.slider.PbSlider.View parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.gomatcha.matcha.pb.view.slider.PbSlider.View parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.gomatcha.matcha.pb.view.slider.PbSlider.View parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.gomatcha.matcha.pb.view.slider.PbSlider.View parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.gomatcha.matcha.pb.view.slider.PbSlider.View parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.gomatcha.matcha.pb.view.slider.PbSlider.View parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.gomatcha.matcha.pb.view.slider.PbSlider.View parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.gomatcha.matcha.pb.view.slider.PbSlider.View parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.gomatcha.matcha.pb.view.slider.PbSlider.View parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.gomatcha.matcha.pb.view.slider.PbSlider.View parseFrom(
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
    public static Builder newBuilder(io.gomatcha.matcha.pb.view.slider.PbSlider.View prototype) {
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
     * Protobuf type {@code slider.View}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:slider.View)
        io.gomatcha.matcha.pb.view.slider.PbSlider.ViewOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.gomatcha.matcha.pb.view.slider.PbSlider.internal_static_slider_View_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.gomatcha.matcha.pb.view.slider.PbSlider.internal_static_slider_View_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.gomatcha.matcha.pb.view.slider.PbSlider.View.class, io.gomatcha.matcha.pb.view.slider.PbSlider.View.Builder.class);
      }

      // Construct using io.gomatcha.matcha.pb.view.slider.PbSlider.View.newBuilder()
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
        value_ = 0D;

        maxValue_ = 0D;

        minValue_ = 0D;

        enabled_ = false;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.gomatcha.matcha.pb.view.slider.PbSlider.internal_static_slider_View_descriptor;
      }

      public io.gomatcha.matcha.pb.view.slider.PbSlider.View getDefaultInstanceForType() {
        return io.gomatcha.matcha.pb.view.slider.PbSlider.View.getDefaultInstance();
      }

      public io.gomatcha.matcha.pb.view.slider.PbSlider.View build() {
        io.gomatcha.matcha.pb.view.slider.PbSlider.View result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.gomatcha.matcha.pb.view.slider.PbSlider.View buildPartial() {
        io.gomatcha.matcha.pb.view.slider.PbSlider.View result = new io.gomatcha.matcha.pb.view.slider.PbSlider.View(this);
        result.value_ = value_;
        result.maxValue_ = maxValue_;
        result.minValue_ = minValue_;
        result.enabled_ = enabled_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
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
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.gomatcha.matcha.pb.view.slider.PbSlider.View) {
          return mergeFrom((io.gomatcha.matcha.pb.view.slider.PbSlider.View)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.gomatcha.matcha.pb.view.slider.PbSlider.View other) {
        if (other == io.gomatcha.matcha.pb.view.slider.PbSlider.View.getDefaultInstance()) return this;
        if (other.getValue() != 0D) {
          setValue(other.getValue());
        }
        if (other.getMaxValue() != 0D) {
          setMaxValue(other.getMaxValue());
        }
        if (other.getMinValue() != 0D) {
          setMinValue(other.getMinValue());
        }
        if (other.getEnabled() != false) {
          setEnabled(other.getEnabled());
        }
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
        io.gomatcha.matcha.pb.view.slider.PbSlider.View parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.gomatcha.matcha.pb.view.slider.PbSlider.View) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private double value_ ;
      /**
       * <code>double value = 1;</code>
       */
      public double getValue() {
        return value_;
      }
      /**
       * <code>double value = 1;</code>
       */
      public Builder setValue(double value) {
        
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double value = 1;</code>
       */
      public Builder clearValue() {
        
        value_ = 0D;
        onChanged();
        return this;
      }

      private double maxValue_ ;
      /**
       * <code>double maxValue = 2;</code>
       */
      public double getMaxValue() {
        return maxValue_;
      }
      /**
       * <code>double maxValue = 2;</code>
       */
      public Builder setMaxValue(double value) {
        
        maxValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double maxValue = 2;</code>
       */
      public Builder clearMaxValue() {
        
        maxValue_ = 0D;
        onChanged();
        return this;
      }

      private double minValue_ ;
      /**
       * <code>double minValue = 3;</code>
       */
      public double getMinValue() {
        return minValue_;
      }
      /**
       * <code>double minValue = 3;</code>
       */
      public Builder setMinValue(double value) {
        
        minValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double minValue = 3;</code>
       */
      public Builder clearMinValue() {
        
        minValue_ = 0D;
        onChanged();
        return this;
      }

      private boolean enabled_ ;
      /**
       * <code>bool enabled = 4;</code>
       */
      public boolean getEnabled() {
        return enabled_;
      }
      /**
       * <code>bool enabled = 4;</code>
       */
      public Builder setEnabled(boolean value) {
        
        enabled_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool enabled = 4;</code>
       */
      public Builder clearEnabled() {
        
        enabled_ = false;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:slider.View)
    }

    // @@protoc_insertion_point(class_scope:slider.View)
    private static final io.gomatcha.matcha.pb.view.slider.PbSlider.View DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.gomatcha.matcha.pb.view.slider.PbSlider.View();
    }

    public static io.gomatcha.matcha.pb.view.slider.PbSlider.View getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<View>
        PARSER = new com.google.protobuf.AbstractParser<View>() {
      public View parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new View(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<View> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<View> getParserForType() {
      return PARSER;
    }

    public io.gomatcha.matcha.pb.view.slider.PbSlider.View getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface EventOrBuilder extends
      // @@protoc_insertion_point(interface_extends:slider.Event)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>double value = 1;</code>
     */
    double getValue();
  }
  /**
   * Protobuf type {@code slider.Event}
   */
  public  static final class Event extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:slider.Event)
      EventOrBuilder {
    // Use Event.newBuilder() to construct.
    private Event(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Event() {
      value_ = 0D;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private Event(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 9: {

              value_ = input.readDouble();
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.gomatcha.matcha.pb.view.slider.PbSlider.internal_static_slider_Event_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.gomatcha.matcha.pb.view.slider.PbSlider.internal_static_slider_Event_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.gomatcha.matcha.pb.view.slider.PbSlider.Event.class, io.gomatcha.matcha.pb.view.slider.PbSlider.Event.Builder.class);
    }

    public static final int VALUE_FIELD_NUMBER = 1;
    private double value_;
    /**
     * <code>double value = 1;</code>
     */
    public double getValue() {
      return value_;
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
      if (value_ != 0D) {
        output.writeDouble(1, value_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (value_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(1, value_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof io.gomatcha.matcha.pb.view.slider.PbSlider.Event)) {
        return super.equals(obj);
      }
      io.gomatcha.matcha.pb.view.slider.PbSlider.Event other = (io.gomatcha.matcha.pb.view.slider.PbSlider.Event) obj;

      boolean result = true;
      result = result && (
          java.lang.Double.doubleToLongBits(getValue())
          == java.lang.Double.doubleToLongBits(
              other.getValue()));
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getValue()));
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.gomatcha.matcha.pb.view.slider.PbSlider.Event parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.gomatcha.matcha.pb.view.slider.PbSlider.Event parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.gomatcha.matcha.pb.view.slider.PbSlider.Event parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.gomatcha.matcha.pb.view.slider.PbSlider.Event parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.gomatcha.matcha.pb.view.slider.PbSlider.Event parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.gomatcha.matcha.pb.view.slider.PbSlider.Event parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.gomatcha.matcha.pb.view.slider.PbSlider.Event parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.gomatcha.matcha.pb.view.slider.PbSlider.Event parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.gomatcha.matcha.pb.view.slider.PbSlider.Event parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.gomatcha.matcha.pb.view.slider.PbSlider.Event parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.gomatcha.matcha.pb.view.slider.PbSlider.Event parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.gomatcha.matcha.pb.view.slider.PbSlider.Event parseFrom(
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
    public static Builder newBuilder(io.gomatcha.matcha.pb.view.slider.PbSlider.Event prototype) {
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
     * Protobuf type {@code slider.Event}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:slider.Event)
        io.gomatcha.matcha.pb.view.slider.PbSlider.EventOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.gomatcha.matcha.pb.view.slider.PbSlider.internal_static_slider_Event_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.gomatcha.matcha.pb.view.slider.PbSlider.internal_static_slider_Event_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.gomatcha.matcha.pb.view.slider.PbSlider.Event.class, io.gomatcha.matcha.pb.view.slider.PbSlider.Event.Builder.class);
      }

      // Construct using io.gomatcha.matcha.pb.view.slider.PbSlider.Event.newBuilder()
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
        value_ = 0D;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.gomatcha.matcha.pb.view.slider.PbSlider.internal_static_slider_Event_descriptor;
      }

      public io.gomatcha.matcha.pb.view.slider.PbSlider.Event getDefaultInstanceForType() {
        return io.gomatcha.matcha.pb.view.slider.PbSlider.Event.getDefaultInstance();
      }

      public io.gomatcha.matcha.pb.view.slider.PbSlider.Event build() {
        io.gomatcha.matcha.pb.view.slider.PbSlider.Event result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.gomatcha.matcha.pb.view.slider.PbSlider.Event buildPartial() {
        io.gomatcha.matcha.pb.view.slider.PbSlider.Event result = new io.gomatcha.matcha.pb.view.slider.PbSlider.Event(this);
        result.value_ = value_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
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
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.gomatcha.matcha.pb.view.slider.PbSlider.Event) {
          return mergeFrom((io.gomatcha.matcha.pb.view.slider.PbSlider.Event)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.gomatcha.matcha.pb.view.slider.PbSlider.Event other) {
        if (other == io.gomatcha.matcha.pb.view.slider.PbSlider.Event.getDefaultInstance()) return this;
        if (other.getValue() != 0D) {
          setValue(other.getValue());
        }
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
        io.gomatcha.matcha.pb.view.slider.PbSlider.Event parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.gomatcha.matcha.pb.view.slider.PbSlider.Event) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private double value_ ;
      /**
       * <code>double value = 1;</code>
       */
      public double getValue() {
        return value_;
      }
      /**
       * <code>double value = 1;</code>
       */
      public Builder setValue(double value) {
        
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double value = 1;</code>
       */
      public Builder clearValue() {
        
        value_ = 0D;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:slider.Event)
    }

    // @@protoc_insertion_point(class_scope:slider.Event)
    private static final io.gomatcha.matcha.pb.view.slider.PbSlider.Event DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.gomatcha.matcha.pb.view.slider.PbSlider.Event();
    }

    public static io.gomatcha.matcha.pb.view.slider.PbSlider.Event getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Event>
        PARSER = new com.google.protobuf.AbstractParser<Event>() {
      public Event parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Event(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Event> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Event> getParserForType() {
      return PARSER;
    }

    public io.gomatcha.matcha.pb.view.slider.PbSlider.Event getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_slider_View_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_slider_View_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_slider_Event_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_slider_Event_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.gomatcha.io/matcha/pb/view/slider/slid" +
      "er.proto\022\006slider\"J\n\004View\022\r\n\005value\030\001 \001(\001\022" +
      "\020\n\010maxValue\030\002 \001(\001\022\020\n\010minValue\030\003 \001(\001\022\017\n\007e" +
      "nabled\030\004 \001(\010\"\026\n\005Event\022\r\n\005value\030\001 \001(\001BF\n!" +
      "io.gomatcha.matcha.pb.view.sliderB\010PbSli" +
      "derZ\006slider\242\002\016MatchaSliderPbb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_slider_View_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_slider_View_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_slider_View_descriptor,
        new java.lang.String[] { "Value", "MaxValue", "MinValue", "Enabled", });
    internal_static_slider_Event_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_slider_Event_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_slider_Event_descriptor,
        new java.lang.String[] { "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
