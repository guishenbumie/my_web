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

public enum MSG_FROM implements org.apache.thrift.TEnum {
  MF_INVALID(0),
  USER(1),
  SYSTEM(2);

  private final int value;

  private MSG_FROM(int value) {
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
  public static MSG_FROM findByValue(int value) { 
    switch (value) {
      case 0:
        return MF_INVALID;
      case 1:
        return USER;
      case 2:
        return SYSTEM;
      default:
        return null;
    }
  }
}
