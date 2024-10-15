/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thrift_gen.oasis_im.gate_ws;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2024-09-06")
public class CrossGlobalChatPush implements org.apache.thrift.TBase<CrossGlobalChatPush, CrossGlobalChatPush._Fields>, java.io.Serializable, Cloneable, Comparable<CrossGlobalChatPush> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CrossGlobalChatPush");

  private static final org.apache.thrift.protocol.TField DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("data", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField OPEN_FIELD_DESC = new org.apache.thrift.protocol.TField("open", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CrossGlobalChatPushStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CrossGlobalChatPushTupleSchemeFactory());
  }

  public thrift_gen.oasis_im.rpc.CrossGlobalSessionInfo data; // required
  public boolean open; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DATA((short)1, "data"),
    OPEN((short)2, "open");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // DATA
          return DATA;
        case 2: // OPEN
          return OPEN;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __OPEN_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DATA, new org.apache.thrift.meta_data.FieldMetaData("data", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, thrift_gen.oasis_im.rpc.CrossGlobalSessionInfo.class)));
    tmpMap.put(_Fields.OPEN, new org.apache.thrift.meta_data.FieldMetaData("open", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CrossGlobalChatPush.class, metaDataMap);
  }

  public CrossGlobalChatPush() {
  }

  public CrossGlobalChatPush(
    thrift_gen.oasis_im.rpc.CrossGlobalSessionInfo data,
    boolean open)
  {
    this();
    this.data = data;
    this.open = open;
    setOpenIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CrossGlobalChatPush(CrossGlobalChatPush other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetData()) {
      this.data = new thrift_gen.oasis_im.rpc.CrossGlobalSessionInfo(other.data);
    }
    this.open = other.open;
  }

  public CrossGlobalChatPush deepCopy() {
    return new CrossGlobalChatPush(this);
  }

  @Override
  public void clear() {
    this.data = null;
    setOpenIsSet(false);
    this.open = false;
  }

  public thrift_gen.oasis_im.rpc.CrossGlobalSessionInfo getData() {
    return this.data;
  }

  public CrossGlobalChatPush setData(thrift_gen.oasis_im.rpc.CrossGlobalSessionInfo data) {
    this.data = data;
    return this;
  }

  public void unsetData() {
    this.data = null;
  }

  /** Returns true if field data is set (has been assigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }

  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }

  public boolean isOpen() {
    return this.open;
  }

  public CrossGlobalChatPush setOpen(boolean open) {
    this.open = open;
    setOpenIsSet(true);
    return this;
  }

  public void unsetOpen() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OPEN_ISSET_ID);
  }

  /** Returns true if field open is set (has been assigned a value) and false otherwise */
  public boolean isSetOpen() {
    return EncodingUtils.testBit(__isset_bitfield, __OPEN_ISSET_ID);
  }

  public void setOpenIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OPEN_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DATA:
      if (value == null) {
        unsetData();
      } else {
        setData((thrift_gen.oasis_im.rpc.CrossGlobalSessionInfo)value);
      }
      break;

    case OPEN:
      if (value == null) {
        unsetOpen();
      } else {
        setOpen((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DATA:
      return getData();

    case OPEN:
      return isOpen();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DATA:
      return isSetData();
    case OPEN:
      return isSetOpen();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CrossGlobalChatPush)
      return this.equals((CrossGlobalChatPush)that);
    return false;
  }

  public boolean equals(CrossGlobalChatPush that) {
    if (that == null)
      return false;

    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
        return false;
    }

    boolean this_present_open = true;
    boolean that_present_open = true;
    if (this_present_open || that_present_open) {
      if (!(this_present_open && that_present_open))
        return false;
      if (this.open != that.open)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_data = true && (isSetData());
    list.add(present_data);
    if (present_data)
      list.add(data);

    boolean present_open = true;
    list.add(present_open);
    if (present_open)
      list.add(open);

    return list.hashCode();
  }

  @Override
  public int compareTo(CrossGlobalChatPush other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetData()).compareTo(other.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data, other.data);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOpen()).compareTo(other.isSetOpen());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOpen()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.open, other.open);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("CrossGlobalChatPush(");
    boolean first = true;

    sb.append("data:");
    if (this.data == null) {
      sb.append("null");
    } else {
      sb.append(this.data);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("open:");
    sb.append(this.open);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (data != null) {
      data.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CrossGlobalChatPushStandardSchemeFactory implements SchemeFactory {
    public CrossGlobalChatPushStandardScheme getScheme() {
      return new CrossGlobalChatPushStandardScheme();
    }
  }

  private static class CrossGlobalChatPushStandardScheme extends StandardScheme<CrossGlobalChatPush> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CrossGlobalChatPush struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.data = new thrift_gen.oasis_im.rpc.CrossGlobalSessionInfo();
              struct.data.read(iprot);
              struct.setDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OPEN
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.open = iprot.readBool();
              struct.setOpenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CrossGlobalChatPush struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.data != null) {
        oprot.writeFieldBegin(DATA_FIELD_DESC);
        struct.data.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(OPEN_FIELD_DESC);
      oprot.writeBool(struct.open);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CrossGlobalChatPushTupleSchemeFactory implements SchemeFactory {
    public CrossGlobalChatPushTupleScheme getScheme() {
      return new CrossGlobalChatPushTupleScheme();
    }
  }

  private static class CrossGlobalChatPushTupleScheme extends TupleScheme<CrossGlobalChatPush> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CrossGlobalChatPush struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetData()) {
        optionals.set(0);
      }
      if (struct.isSetOpen()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetData()) {
        struct.data.write(oprot);
      }
      if (struct.isSetOpen()) {
        oprot.writeBool(struct.open);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CrossGlobalChatPush struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.data = new thrift_gen.oasis_im.rpc.CrossGlobalSessionInfo();
        struct.data.read(iprot);
        struct.setDataIsSet(true);
      }
      if (incoming.get(1)) {
        struct.open = iprot.readBool();
        struct.setOpenIsSet(true);
      }
    }
  }

}

