/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thrift_gen.oasis_im.rpc;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum SESSION_TYPE implements org.apache.thrift.TEnum {
  ST_INVALID(0),
  SINGLE_CHAT(1),
  GROUP_CHAT(2),
  GLOBAL_CHAT(3),
  CROSS_GLOBAL_CHAT(4);

  private final int value;

  private SESSION_TYPE(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static SESSION_TYPE findByValue(int value) { 
    switch (value) {
      case 0:
        return ST_INVALID;
      case 1:
        return SINGLE_CHAT;
      case 2:
        return GROUP_CHAT;
      case 3:
        return GLOBAL_CHAT;
      case 4:
        return CROSS_GLOBAL_CHAT;
      default:
        return null;
    }
  }
}
