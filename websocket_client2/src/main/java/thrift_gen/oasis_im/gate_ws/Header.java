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
public class Header implements org.apache.thrift.TBase<Header, Header._Fields>, java.io.Serializable, Cloneable, Comparable<Header> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Header");

  private static final org.apache.thrift.protocol.TField OPERATION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("operationID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField MSG_INCR_FIELD_DESC = new org.apache.thrift.protocol.TField("msgIncr", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new HeaderStandardSchemeFactory());
    schemes.put(TupleScheme.class, new HeaderTupleSchemeFactory());
  }

  public String operationID; // required
  public int msgIncr; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OPERATION_ID((short)1, "operationID"),
    MSG_INCR((short)2, "msgIncr");

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
        case 1: // OPERATION_ID
          return OPERATION_ID;
        case 2: // MSG_INCR
          return MSG_INCR;
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
  private static final int __MSGINCR_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OPERATION_ID, new org.apache.thrift.meta_data.FieldMetaData("operationID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MSG_INCR, new org.apache.thrift.meta_data.FieldMetaData("msgIncr", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Header.class, metaDataMap);
  }

  public Header() {
  }

  public Header(
    String operationID,
    int msgIncr)
  {
    this();
    this.operationID = operationID;
    this.msgIncr = msgIncr;
    setMsgIncrIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Header(Header other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetOperationID()) {
      this.operationID = other.operationID;
    }
    this.msgIncr = other.msgIncr;
  }

  public Header deepCopy() {
    return new Header(this);
  }

  @Override
  public void clear() {
    this.operationID = null;
    setMsgIncrIsSet(false);
    this.msgIncr = 0;
  }

  public String getOperationID() {
    return this.operationID;
  }

  public Header setOperationID(String operationID) {
    this.operationID = operationID;
    return this;
  }

  public void unsetOperationID() {
    this.operationID = null;
  }

  /** Returns true if field operationID is set (has been assigned a value) and false otherwise */
  public boolean isSetOperationID() {
    return this.operationID != null;
  }

  public void setOperationIDIsSet(boolean value) {
    if (!value) {
      this.operationID = null;
    }
  }

  public int getMsgIncr() {
    return this.msgIncr;
  }

  public Header setMsgIncr(int msgIncr) {
    this.msgIncr = msgIncr;
    setMsgIncrIsSet(true);
    return this;
  }

  public void unsetMsgIncr() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MSGINCR_ISSET_ID);
  }

  /** Returns true if field msgIncr is set (has been assigned a value) and false otherwise */
  public boolean isSetMsgIncr() {
    return EncodingUtils.testBit(__isset_bitfield, __MSGINCR_ISSET_ID);
  }

  public void setMsgIncrIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MSGINCR_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OPERATION_ID:
      if (value == null) {
        unsetOperationID();
      } else {
        setOperationID((String)value);
      }
      break;

    case MSG_INCR:
      if (value == null) {
        unsetMsgIncr();
      } else {
        setMsgIncr((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OPERATION_ID:
      return getOperationID();

    case MSG_INCR:
      return getMsgIncr();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OPERATION_ID:
      return isSetOperationID();
    case MSG_INCR:
      return isSetMsgIncr();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Header)
      return this.equals((Header)that);
    return false;
  }

  public boolean equals(Header that) {
    if (that == null)
      return false;

    boolean this_present_operationID = true && this.isSetOperationID();
    boolean that_present_operationID = true && that.isSetOperationID();
    if (this_present_operationID || that_present_operationID) {
      if (!(this_present_operationID && that_present_operationID))
        return false;
      if (!this.operationID.equals(that.operationID))
        return false;
    }

    boolean this_present_msgIncr = true;
    boolean that_present_msgIncr = true;
    if (this_present_msgIncr || that_present_msgIncr) {
      if (!(this_present_msgIncr && that_present_msgIncr))
        return false;
      if (this.msgIncr != that.msgIncr)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_operationID = true && (isSetOperationID());
    list.add(present_operationID);
    if (present_operationID)
      list.add(operationID);

    boolean present_msgIncr = true;
    list.add(present_msgIncr);
    if (present_msgIncr)
      list.add(msgIncr);

    return list.hashCode();
  }

  @Override
  public int compareTo(Header other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOperationID()).compareTo(other.isSetOperationID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperationID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operationID, other.operationID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMsgIncr()).compareTo(other.isSetMsgIncr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMsgIncr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.msgIncr, other.msgIncr);
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
    StringBuilder sb = new StringBuilder("Header(");
    boolean first = true;

    sb.append("operationID:");
    if (this.operationID == null) {
      sb.append("null");
    } else {
      sb.append(this.operationID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("msgIncr:");
    sb.append(this.msgIncr);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class HeaderStandardSchemeFactory implements SchemeFactory {
    public HeaderStandardScheme getScheme() {
      return new HeaderStandardScheme();
    }
  }

  private static class HeaderStandardScheme extends StandardScheme<Header> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Header struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OPERATION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.operationID = iprot.readString();
              struct.setOperationIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MSG_INCR
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.msgIncr = iprot.readI32();
              struct.setMsgIncrIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Header struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.operationID != null) {
        oprot.writeFieldBegin(OPERATION_ID_FIELD_DESC);
        oprot.writeString(struct.operationID);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(MSG_INCR_FIELD_DESC);
      oprot.writeI32(struct.msgIncr);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HeaderTupleSchemeFactory implements SchemeFactory {
    public HeaderTupleScheme getScheme() {
      return new HeaderTupleScheme();
    }
  }

  private static class HeaderTupleScheme extends TupleScheme<Header> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Header struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetOperationID()) {
        optionals.set(0);
      }
      if (struct.isSetMsgIncr()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetOperationID()) {
        oprot.writeString(struct.operationID);
      }
      if (struct.isSetMsgIncr()) {
        oprot.writeI32(struct.msgIncr);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Header struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.operationID = iprot.readString();
        struct.setOperationIDIsSet(true);
      }
      if (incoming.get(1)) {
        struct.msgIncr = iprot.readI32();
        struct.setMsgIncrIsSet(true);
      }
    }
  }

}

