/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.cloudera.flume.conf.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum FlumeNodeState implements org.apache.thrift.TEnum {
  HELLO(0),
  IDLE(1),
  CONFIGURING(2),
  ACTIVE(3),
  ERROR(4),
  LOST(5),
  DECOMMISSIONED(6),
  CLOSING(7);

  private final int value;

  private FlumeNodeState(int value) {
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
  public static FlumeNodeState findByValue(int value) { 
    switch (value) {
      case 0:
        return HELLO;
      case 1:
        return IDLE;
      case 2:
        return CONFIGURING;
      case 3:
        return ACTIVE;
      case 4:
        return ERROR;
      case 5:
        return LOST;
      case 6:
        return DECOMMISSIONED;
      case 7:
        return CLOSING;
      default:
        return null;
    }
  }
}
