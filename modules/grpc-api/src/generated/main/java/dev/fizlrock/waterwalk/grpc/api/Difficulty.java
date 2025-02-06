// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: contract.proto

package dev.fizlrock.waterwalk.grpc.api;

/**
 * Protobuf enum {@code dev.fizlrock.waterwalk.grpc.Difficulty}
 */
public enum Difficulty
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>EASY = 0;</code>
   */
  EASY(0),
  /**
   * <code>NORMAL = 1;</code>
   */
  NORMAL(1),
  /**
   * <code>ADVANCED = 2;</code>
   */
  ADVANCED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>EASY = 0;</code>
   */
  public static final int EASY_VALUE = 0;
  /**
   * <code>NORMAL = 1;</code>
   */
  public static final int NORMAL_VALUE = 1;
  /**
   * <code>ADVANCED = 2;</code>
   */
  public static final int ADVANCED_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Difficulty valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Difficulty forNumber(int value) {
    switch (value) {
      case 0: return EASY;
      case 1: return NORMAL;
      case 2: return ADVANCED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Difficulty>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Difficulty> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Difficulty>() {
          public Difficulty findValueByNumber(int number) {
            return Difficulty.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return dev.fizlrock.waterwalk.grpc.api.Contract.getDescriptor().getEnumTypes().get(0);
  }

  private static final Difficulty[] VALUES = values();

  public static Difficulty valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Difficulty(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:dev.fizlrock.waterwalk.grpc.Difficulty)
}

