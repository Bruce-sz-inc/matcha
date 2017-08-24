// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gomatcha.io/matcha/pb/view/button/button.proto

package io.gomatcha.matcha.pb.view.button;

public final class PbButton {
  private PbButton() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ViewOrBuilder extends
      // @@protoc_insertion_point(interface_extends:matcha.view.button.View)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.matcha.text.StyledText styledText = 1;</code>
     */
    boolean hasStyledText();
    /**
     * <code>.matcha.text.StyledText styledText = 1;</code>
     */
    io.gomatcha.matcha.pb.text.PbText.StyledText getStyledText();
    /**
     * <code>.matcha.text.StyledText styledText = 1;</code>
     */
    io.gomatcha.matcha.pb.text.PbText.StyledTextOrBuilder getStyledTextOrBuilder();

    /**
     * <code>bool enabled = 2;</code>
     */
    boolean getEnabled();

    /**
     * <code>.matcha.Color color = 3;</code>
     */
    boolean hasColor();
    /**
     * <code>.matcha.Color color = 3;</code>
     */
    io.gomatcha.matcha.pb.Pb.Color getColor();
    /**
     * <code>.matcha.Color color = 3;</code>
     */
    io.gomatcha.matcha.pb.Pb.ColorOrBuilder getColorOrBuilder();
  }
  /**
   * Protobuf type {@code matcha.view.button.View}
   */
  public  static final class View extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:matcha.view.button.View)
      ViewOrBuilder {
    // Use View.newBuilder() to construct.
    private View(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private View() {
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
            case 10: {
              io.gomatcha.matcha.pb.text.PbText.StyledText.Builder subBuilder = null;
              if (styledText_ != null) {
                subBuilder = styledText_.toBuilder();
              }
              styledText_ = input.readMessage(io.gomatcha.matcha.pb.text.PbText.StyledText.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(styledText_);
                styledText_ = subBuilder.buildPartial();
              }

              break;
            }
            case 16: {

              enabled_ = input.readBool();
              break;
            }
            case 26: {
              io.gomatcha.matcha.pb.Pb.Color.Builder subBuilder = null;
              if (color_ != null) {
                subBuilder = color_.toBuilder();
              }
              color_ = input.readMessage(io.gomatcha.matcha.pb.Pb.Color.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(color_);
                color_ = subBuilder.buildPartial();
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.gomatcha.matcha.pb.view.button.PbButton.internal_static_matcha_view_button_View_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.gomatcha.matcha.pb.view.button.PbButton.internal_static_matcha_view_button_View_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.gomatcha.matcha.pb.view.button.PbButton.View.class, io.gomatcha.matcha.pb.view.button.PbButton.View.Builder.class);
    }

    public static final int STYLEDTEXT_FIELD_NUMBER = 1;
    private io.gomatcha.matcha.pb.text.PbText.StyledText styledText_;
    /**
     * <code>.matcha.text.StyledText styledText = 1;</code>
     */
    public boolean hasStyledText() {
      return styledText_ != null;
    }
    /**
     * <code>.matcha.text.StyledText styledText = 1;</code>
     */
    public io.gomatcha.matcha.pb.text.PbText.StyledText getStyledText() {
      return styledText_ == null ? io.gomatcha.matcha.pb.text.PbText.StyledText.getDefaultInstance() : styledText_;
    }
    /**
     * <code>.matcha.text.StyledText styledText = 1;</code>
     */
    public io.gomatcha.matcha.pb.text.PbText.StyledTextOrBuilder getStyledTextOrBuilder() {
      return getStyledText();
    }

    public static final int ENABLED_FIELD_NUMBER = 2;
    private boolean enabled_;
    /**
     * <code>bool enabled = 2;</code>
     */
    public boolean getEnabled() {
      return enabled_;
    }

    public static final int COLOR_FIELD_NUMBER = 3;
    private io.gomatcha.matcha.pb.Pb.Color color_;
    /**
     * <code>.matcha.Color color = 3;</code>
     */
    public boolean hasColor() {
      return color_ != null;
    }
    /**
     * <code>.matcha.Color color = 3;</code>
     */
    public io.gomatcha.matcha.pb.Pb.Color getColor() {
      return color_ == null ? io.gomatcha.matcha.pb.Pb.Color.getDefaultInstance() : color_;
    }
    /**
     * <code>.matcha.Color color = 3;</code>
     */
    public io.gomatcha.matcha.pb.Pb.ColorOrBuilder getColorOrBuilder() {
      return getColor();
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
      if (styledText_ != null) {
        output.writeMessage(1, getStyledText());
      }
      if (enabled_ != false) {
        output.writeBool(2, enabled_);
      }
      if (color_ != null) {
        output.writeMessage(3, getColor());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (styledText_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getStyledText());
      }
      if (enabled_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, enabled_);
      }
      if (color_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getColor());
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
      if (!(obj instanceof io.gomatcha.matcha.pb.view.button.PbButton.View)) {
        return super.equals(obj);
      }
      io.gomatcha.matcha.pb.view.button.PbButton.View other = (io.gomatcha.matcha.pb.view.button.PbButton.View) obj;

      boolean result = true;
      result = result && (hasStyledText() == other.hasStyledText());
      if (hasStyledText()) {
        result = result && getStyledText()
            .equals(other.getStyledText());
      }
      result = result && (getEnabled()
          == other.getEnabled());
      result = result && (hasColor() == other.hasColor());
      if (hasColor()) {
        result = result && getColor()
            .equals(other.getColor());
      }
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasStyledText()) {
        hash = (37 * hash) + STYLEDTEXT_FIELD_NUMBER;
        hash = (53 * hash) + getStyledText().hashCode();
      }
      hash = (37 * hash) + ENABLED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getEnabled());
      if (hasColor()) {
        hash = (37 * hash) + COLOR_FIELD_NUMBER;
        hash = (53 * hash) + getColor().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.gomatcha.matcha.pb.view.button.PbButton.View parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.gomatcha.matcha.pb.view.button.PbButton.View parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.gomatcha.matcha.pb.view.button.PbButton.View parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.gomatcha.matcha.pb.view.button.PbButton.View parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.gomatcha.matcha.pb.view.button.PbButton.View parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.gomatcha.matcha.pb.view.button.PbButton.View parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.gomatcha.matcha.pb.view.button.PbButton.View parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.gomatcha.matcha.pb.view.button.PbButton.View parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.gomatcha.matcha.pb.view.button.PbButton.View parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.gomatcha.matcha.pb.view.button.PbButton.View parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.gomatcha.matcha.pb.view.button.PbButton.View parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.gomatcha.matcha.pb.view.button.PbButton.View parseFrom(
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
    public static Builder newBuilder(io.gomatcha.matcha.pb.view.button.PbButton.View prototype) {
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
     * Protobuf type {@code matcha.view.button.View}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:matcha.view.button.View)
        io.gomatcha.matcha.pb.view.button.PbButton.ViewOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.gomatcha.matcha.pb.view.button.PbButton.internal_static_matcha_view_button_View_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.gomatcha.matcha.pb.view.button.PbButton.internal_static_matcha_view_button_View_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.gomatcha.matcha.pb.view.button.PbButton.View.class, io.gomatcha.matcha.pb.view.button.PbButton.View.Builder.class);
      }

      // Construct using io.gomatcha.matcha.pb.view.button.PbButton.View.newBuilder()
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
        if (styledTextBuilder_ == null) {
          styledText_ = null;
        } else {
          styledText_ = null;
          styledTextBuilder_ = null;
        }
        enabled_ = false;

        if (colorBuilder_ == null) {
          color_ = null;
        } else {
          color_ = null;
          colorBuilder_ = null;
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.gomatcha.matcha.pb.view.button.PbButton.internal_static_matcha_view_button_View_descriptor;
      }

      public io.gomatcha.matcha.pb.view.button.PbButton.View getDefaultInstanceForType() {
        return io.gomatcha.matcha.pb.view.button.PbButton.View.getDefaultInstance();
      }

      public io.gomatcha.matcha.pb.view.button.PbButton.View build() {
        io.gomatcha.matcha.pb.view.button.PbButton.View result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.gomatcha.matcha.pb.view.button.PbButton.View buildPartial() {
        io.gomatcha.matcha.pb.view.button.PbButton.View result = new io.gomatcha.matcha.pb.view.button.PbButton.View(this);
        if (styledTextBuilder_ == null) {
          result.styledText_ = styledText_;
        } else {
          result.styledText_ = styledTextBuilder_.build();
        }
        result.enabled_ = enabled_;
        if (colorBuilder_ == null) {
          result.color_ = color_;
        } else {
          result.color_ = colorBuilder_.build();
        }
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
        if (other instanceof io.gomatcha.matcha.pb.view.button.PbButton.View) {
          return mergeFrom((io.gomatcha.matcha.pb.view.button.PbButton.View)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.gomatcha.matcha.pb.view.button.PbButton.View other) {
        if (other == io.gomatcha.matcha.pb.view.button.PbButton.View.getDefaultInstance()) return this;
        if (other.hasStyledText()) {
          mergeStyledText(other.getStyledText());
        }
        if (other.getEnabled() != false) {
          setEnabled(other.getEnabled());
        }
        if (other.hasColor()) {
          mergeColor(other.getColor());
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
        io.gomatcha.matcha.pb.view.button.PbButton.View parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.gomatcha.matcha.pb.view.button.PbButton.View) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private io.gomatcha.matcha.pb.text.PbText.StyledText styledText_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.gomatcha.matcha.pb.text.PbText.StyledText, io.gomatcha.matcha.pb.text.PbText.StyledText.Builder, io.gomatcha.matcha.pb.text.PbText.StyledTextOrBuilder> styledTextBuilder_;
      /**
       * <code>.matcha.text.StyledText styledText = 1;</code>
       */
      public boolean hasStyledText() {
        return styledTextBuilder_ != null || styledText_ != null;
      }
      /**
       * <code>.matcha.text.StyledText styledText = 1;</code>
       */
      public io.gomatcha.matcha.pb.text.PbText.StyledText getStyledText() {
        if (styledTextBuilder_ == null) {
          return styledText_ == null ? io.gomatcha.matcha.pb.text.PbText.StyledText.getDefaultInstance() : styledText_;
        } else {
          return styledTextBuilder_.getMessage();
        }
      }
      /**
       * <code>.matcha.text.StyledText styledText = 1;</code>
       */
      public Builder setStyledText(io.gomatcha.matcha.pb.text.PbText.StyledText value) {
        if (styledTextBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          styledText_ = value;
          onChanged();
        } else {
          styledTextBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.matcha.text.StyledText styledText = 1;</code>
       */
      public Builder setStyledText(
          io.gomatcha.matcha.pb.text.PbText.StyledText.Builder builderForValue) {
        if (styledTextBuilder_ == null) {
          styledText_ = builderForValue.build();
          onChanged();
        } else {
          styledTextBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.matcha.text.StyledText styledText = 1;</code>
       */
      public Builder mergeStyledText(io.gomatcha.matcha.pb.text.PbText.StyledText value) {
        if (styledTextBuilder_ == null) {
          if (styledText_ != null) {
            styledText_ =
              io.gomatcha.matcha.pb.text.PbText.StyledText.newBuilder(styledText_).mergeFrom(value).buildPartial();
          } else {
            styledText_ = value;
          }
          onChanged();
        } else {
          styledTextBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.matcha.text.StyledText styledText = 1;</code>
       */
      public Builder clearStyledText() {
        if (styledTextBuilder_ == null) {
          styledText_ = null;
          onChanged();
        } else {
          styledText_ = null;
          styledTextBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.matcha.text.StyledText styledText = 1;</code>
       */
      public io.gomatcha.matcha.pb.text.PbText.StyledText.Builder getStyledTextBuilder() {
        
        onChanged();
        return getStyledTextFieldBuilder().getBuilder();
      }
      /**
       * <code>.matcha.text.StyledText styledText = 1;</code>
       */
      public io.gomatcha.matcha.pb.text.PbText.StyledTextOrBuilder getStyledTextOrBuilder() {
        if (styledTextBuilder_ != null) {
          return styledTextBuilder_.getMessageOrBuilder();
        } else {
          return styledText_ == null ?
              io.gomatcha.matcha.pb.text.PbText.StyledText.getDefaultInstance() : styledText_;
        }
      }
      /**
       * <code>.matcha.text.StyledText styledText = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.gomatcha.matcha.pb.text.PbText.StyledText, io.gomatcha.matcha.pb.text.PbText.StyledText.Builder, io.gomatcha.matcha.pb.text.PbText.StyledTextOrBuilder> 
          getStyledTextFieldBuilder() {
        if (styledTextBuilder_ == null) {
          styledTextBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.gomatcha.matcha.pb.text.PbText.StyledText, io.gomatcha.matcha.pb.text.PbText.StyledText.Builder, io.gomatcha.matcha.pb.text.PbText.StyledTextOrBuilder>(
                  getStyledText(),
                  getParentForChildren(),
                  isClean());
          styledText_ = null;
        }
        return styledTextBuilder_;
      }

      private boolean enabled_ ;
      /**
       * <code>bool enabled = 2;</code>
       */
      public boolean getEnabled() {
        return enabled_;
      }
      /**
       * <code>bool enabled = 2;</code>
       */
      public Builder setEnabled(boolean value) {
        
        enabled_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool enabled = 2;</code>
       */
      public Builder clearEnabled() {
        
        enabled_ = false;
        onChanged();
        return this;
      }

      private io.gomatcha.matcha.pb.Pb.Color color_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.gomatcha.matcha.pb.Pb.Color, io.gomatcha.matcha.pb.Pb.Color.Builder, io.gomatcha.matcha.pb.Pb.ColorOrBuilder> colorBuilder_;
      /**
       * <code>.matcha.Color color = 3;</code>
       */
      public boolean hasColor() {
        return colorBuilder_ != null || color_ != null;
      }
      /**
       * <code>.matcha.Color color = 3;</code>
       */
      public io.gomatcha.matcha.pb.Pb.Color getColor() {
        if (colorBuilder_ == null) {
          return color_ == null ? io.gomatcha.matcha.pb.Pb.Color.getDefaultInstance() : color_;
        } else {
          return colorBuilder_.getMessage();
        }
      }
      /**
       * <code>.matcha.Color color = 3;</code>
       */
      public Builder setColor(io.gomatcha.matcha.pb.Pb.Color value) {
        if (colorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          color_ = value;
          onChanged();
        } else {
          colorBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.matcha.Color color = 3;</code>
       */
      public Builder setColor(
          io.gomatcha.matcha.pb.Pb.Color.Builder builderForValue) {
        if (colorBuilder_ == null) {
          color_ = builderForValue.build();
          onChanged();
        } else {
          colorBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.matcha.Color color = 3;</code>
       */
      public Builder mergeColor(io.gomatcha.matcha.pb.Pb.Color value) {
        if (colorBuilder_ == null) {
          if (color_ != null) {
            color_ =
              io.gomatcha.matcha.pb.Pb.Color.newBuilder(color_).mergeFrom(value).buildPartial();
          } else {
            color_ = value;
          }
          onChanged();
        } else {
          colorBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.matcha.Color color = 3;</code>
       */
      public Builder clearColor() {
        if (colorBuilder_ == null) {
          color_ = null;
          onChanged();
        } else {
          color_ = null;
          colorBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.matcha.Color color = 3;</code>
       */
      public io.gomatcha.matcha.pb.Pb.Color.Builder getColorBuilder() {
        
        onChanged();
        return getColorFieldBuilder().getBuilder();
      }
      /**
       * <code>.matcha.Color color = 3;</code>
       */
      public io.gomatcha.matcha.pb.Pb.ColorOrBuilder getColorOrBuilder() {
        if (colorBuilder_ != null) {
          return colorBuilder_.getMessageOrBuilder();
        } else {
          return color_ == null ?
              io.gomatcha.matcha.pb.Pb.Color.getDefaultInstance() : color_;
        }
      }
      /**
       * <code>.matcha.Color color = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.gomatcha.matcha.pb.Pb.Color, io.gomatcha.matcha.pb.Pb.Color.Builder, io.gomatcha.matcha.pb.Pb.ColorOrBuilder> 
          getColorFieldBuilder() {
        if (colorBuilder_ == null) {
          colorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.gomatcha.matcha.pb.Pb.Color, io.gomatcha.matcha.pb.Pb.Color.Builder, io.gomatcha.matcha.pb.Pb.ColorOrBuilder>(
                  getColor(),
                  getParentForChildren(),
                  isClean());
          color_ = null;
        }
        return colorBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:matcha.view.button.View)
    }

    // @@protoc_insertion_point(class_scope:matcha.view.button.View)
    private static final io.gomatcha.matcha.pb.view.button.PbButton.View DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.gomatcha.matcha.pb.view.button.PbButton.View();
    }

    public static io.gomatcha.matcha.pb.view.button.PbButton.View getDefaultInstance() {
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

    public io.gomatcha.matcha.pb.view.button.PbButton.View getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_matcha_view_button_View_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_matcha_view_button_View_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.gomatcha.io/matcha/pb/view/button/butt" +
      "on.proto\022\022matcha.view.button\032%gomatcha.i" +
      "o/matcha/pb/text/text.proto\032!gomatcha.io" +
      "/matcha/pb/image.proto\"b\n\004View\022+\n\nstyled" +
      "Text\030\001 \001(\0132\027.matcha.text.StyledText\022\017\n\007e" +
      "nabled\030\002 \001(\010\022\034\n\005color\030\003 \001(\0132\r.matcha.Col" +
      "orBF\n!io.gomatcha.matcha.pb.view.buttonB" +
      "\010PbButtonZ\006button\242\002\016MatchaButtonPBb\006prot" +
      "o3"
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
          io.gomatcha.matcha.pb.text.PbText.getDescriptor(),
          io.gomatcha.matcha.pb.Pb.getDescriptor(),
        }, assigner);
    internal_static_matcha_view_button_View_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_matcha_view_button_View_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_matcha_view_button_View_descriptor,
        new java.lang.String[] { "StyledText", "Enabled", "Color", });
    io.gomatcha.matcha.pb.text.PbText.getDescriptor();
    io.gomatcha.matcha.pb.Pb.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
