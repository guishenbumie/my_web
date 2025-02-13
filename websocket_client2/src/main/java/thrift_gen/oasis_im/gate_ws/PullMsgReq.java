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
public class PullMsgReq implements org.apache.thrift.TBase<PullMsgReq, PullMsgReq._Fields>, java.io.Serializable, Cloneable, Comparable<PullMsgReq> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PullMsgReq");

  private static final org.apache.thrift.protocol.TField HEADER_FIELD_DESC = new org.apache.thrift.protocol.TField("header", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField SEQ_BEGIN_FIELD_DESC = new org.apache.thrift.protocol.TField("seqBegin", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField SEQ_END_FIELD_DESC = new org.apache.thrift.protocol.TField("seqEnd", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField MSG_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("msgType", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField SESSION_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("sessionKey", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PullMsgReqStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PullMsgReqTupleSchemeFactory());
  }

  public Header header; // required
  public long seqBegin; // required
  public long seqEnd; // required
  /**
   * 
   * @see thrift_gen.oasis_im.rpc.SESSION_TYPE
   */
  public thrift_gen.oasis_im.rpc.SESSION_TYPE msgType; // required
  public String sessionKey; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HEADER((short)1, "header"),
    SEQ_BEGIN((short)2, "seqBegin"),
    SEQ_END((short)3, "seqEnd"),
    /**
     * 
     * @see thrift_gen.oasis_im.rpc.SESSION_TYPE
     */
    MSG_TYPE((short)5, "msgType"),
    SESSION_KEY((short)6, "sessionKey");

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
        case 1: // HEADER
          return HEADER;
        case 2: // SEQ_BEGIN
          return SEQ_BEGIN;
        case 3: // SEQ_END
          return SEQ_END;
        case 5: // MSG_TYPE
          return MSG_TYPE;
        case 6: // SESSION_KEY
          return SESSION_KEY;
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
  private static final int __SEQBEGIN_ISSET_ID = 0;
  private static final int __SEQEND_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HEADER, new org.apache.thrift.meta_data.FieldMetaData("header", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Header.class)));
    tmpMap.put(_Fields.SEQ_BEGIN, new org.apache.thrift.meta_data.FieldMetaData("seqBegin", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SEQ_END, new org.apache.thrift.meta_data.FieldMetaData("seqEnd", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.MSG_TYPE, new org.apache.thrift.meta_data.FieldMetaData("msgType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, thrift_gen.oasis_im.rpc.SESSION_TYPE.class)));
    tmpMap.put(_Fields.SESSION_KEY, new org.apache.thrift.meta_data.FieldMetaData("sessionKey", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PullMsgReq.class, metaDataMap);
  }

  public PullMsgReq() {
  }

  public PullMsgReq(
    Header header,
    long seqBegin,
    long seqEnd,
    thrift_gen.oasis_im.rpc.SESSION_TYPE msgType,
    String sessionKey)
  {
    this();
    this.header = header;
    this.seqBegin = seqBegin;
    setSeqBeginIsSet(true);
    this.seqEnd = seqEnd;
    setSeqEndIsSet(true);
    this.msgType = msgType;
    this.sessionKey = sessionKey;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PullMsgReq(PullMsgReq other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetHeader()) {
      this.header = new Header(other.header);
    }
    this.seqBegin = other.seqBegin;
    this.seqEnd = other.seqEnd;
    if (other.isSetMsgType()) {
      this.msgType = other.msgType;
    }
    if (other.isSetSessionKey()) {
      this.sessionKey = other.sessionKey;
    }
  }

  public PullMsgReq deepCopy() {
    return new PullMsgReq(this);
  }

  @Override
  public void clear() {
    this.header = null;
    setSeqBeginIsSet(false);
    this.seqBegin = 0;
    setSeqEndIsSet(false);
    this.seqEnd = 0;
    this.msgType = null;
    this.sessionKey = null;
  }

  public Header getHeader() {
    return this.header;
  }

  public PullMsgReq setHeader(Header header) {
    this.header = header;
    return this;
  }

  public void unsetHeader() {
    this.header = null;
  }

  /** Returns true if field header is set (has been assigned a value) and false otherwise */
  public boolean isSetHeader() {
    return this.header != null;
  }

  public void setHeaderIsSet(boolean value) {
    if (!value) {
      this.header = null;
    }
  }

  public long getSeqBegin() {
    return this.seqBegin;
  }

  public PullMsgReq setSeqBegin(long seqBegin) {
    this.seqBegin = seqBegin;
    setSeqBeginIsSet(true);
    return this;
  }

  public void unsetSeqBegin() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SEQBEGIN_ISSET_ID);
  }

  /** Returns true if field seqBegin is set (has been assigned a value) and false otherwise */
  public boolean isSetSeqBegin() {
    return EncodingUtils.testBit(__isset_bitfield, __SEQBEGIN_ISSET_ID);
  }

  public void setSeqBeginIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SEQBEGIN_ISSET_ID, value);
  }

  public long getSeqEnd() {
    return this.seqEnd;
  }

  public PullMsgReq setSeqEnd(long seqEnd) {
    this.seqEnd = seqEnd;
    setSeqEndIsSet(true);
    return this;
  }

  public void unsetSeqEnd() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SEQEND_ISSET_ID);
  }

  /** Returns true if field seqEnd is set (has been assigned a value) and false otherwise */
  public boolean isSetSeqEnd() {
    return EncodingUtils.testBit(__isset_bitfield, __SEQEND_ISSET_ID);
  }

  public void setSeqEndIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SEQEND_ISSET_ID, value);
  }

  /**
   * 
   * @see thrift_gen.oasis_im.rpc.SESSION_TYPE
   */
  public thrift_gen.oasis_im.rpc.SESSION_TYPE getMsgType() {
    return this.msgType;
  }

  /**
   * 
   * @see thrift_gen.oasis_im.rpc.SESSION_TYPE
   */
  public PullMsgReq setMsgType(thrift_gen.oasis_im.rpc.SESSION_TYPE msgType) {
    this.msgType = msgType;
    return this;
  }

  public void unsetMsgType() {
    this.msgType = null;
  }

  /** Returns true if field msgType is set (has been assigned a value) and false otherwise */
  public boolean isSetMsgType() {
    return this.msgType != null;
  }

  public void setMsgTypeIsSet(boolean value) {
    if (!value) {
      this.msgType = null;
    }
  }

  public String getSessionKey() {
    return this.sessionKey;
  }

  public PullMsgReq setSessionKey(String sessionKey) {
    this.sessionKey = sessionKey;
    return this;
  }

  public void unsetSessionKey() {
    this.sessionKey = null;
  }

  /** Returns true if field sessionKey is set (has been assigned a value) and false otherwise */
  public boolean isSetSessionKey() {
    return this.sessionKey != null;
  }

  public void setSessionKeyIsSet(boolean value) {
    if (!value) {
      this.sessionKey = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HEADER:
      if (value == null) {
        unsetHeader();
      } else {
        setHeader((Header)value);
      }
      break;

    case SEQ_BEGIN:
      if (value == null) {
        unsetSeqBegin();
      } else {
        setSeqBegin((Long)value);
      }
      break;

    case SEQ_END:
      if (value == null) {
        unsetSeqEnd();
      } else {
        setSeqEnd((Long)value);
      }
      break;

    case MSG_TYPE:
      if (value == null) {
        unsetMsgType();
      } else {
        setMsgType((thrift_gen.oasis_im.rpc.SESSION_TYPE)value);
      }
      break;

    case SESSION_KEY:
      if (value == null) {
        unsetSessionKey();
      } else {
        setSessionKey((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HEADER:
      return getHeader();

    case SEQ_BEGIN:
      return getSeqBegin();

    case SEQ_END:
      return getSeqEnd();

    case MSG_TYPE:
      return getMsgType();

    case SESSION_KEY:
      return getSessionKey();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HEADER:
      return isSetHeader();
    case SEQ_BEGIN:
      return isSetSeqBegin();
    case SEQ_END:
      return isSetSeqEnd();
    case MSG_TYPE:
      return isSetMsgType();
    case SESSION_KEY:
      return isSetSessionKey();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PullMsgReq)
      return this.equals((PullMsgReq)that);
    return false;
  }

  public boolean equals(PullMsgReq that) {
    if (that == null)
      return false;

    boolean this_present_header = true && this.isSetHeader();
    boolean that_present_header = true && that.isSetHeader();
    if (this_present_header || that_present_header) {
      if (!(this_present_header && that_present_header))
        return false;
      if (!this.header.equals(that.header))
        return false;
    }

    boolean this_present_seqBegin = true;
    boolean that_present_seqBegin = true;
    if (this_present_seqBegin || that_present_seqBegin) {
      if (!(this_present_seqBegin && that_present_seqBegin))
        return false;
      if (this.seqBegin != that.seqBegin)
        return false;
    }

    boolean this_present_seqEnd = true;
    boolean that_present_seqEnd = true;
    if (this_present_seqEnd || that_present_seqEnd) {
      if (!(this_present_seqEnd && that_present_seqEnd))
        return false;
      if (this.seqEnd != that.seqEnd)
        return false;
    }

    boolean this_present_msgType = true && this.isSetMsgType();
    boolean that_present_msgType = true && that.isSetMsgType();
    if (this_present_msgType || that_present_msgType) {
      if (!(this_present_msgType && that_present_msgType))
        return false;
      if (!this.msgType.equals(that.msgType))
        return false;
    }

    boolean this_present_sessionKey = true && this.isSetSessionKey();
    boolean that_present_sessionKey = true && that.isSetSessionKey();
    if (this_present_sessionKey || that_present_sessionKey) {
      if (!(this_present_sessionKey && that_present_sessionKey))
        return false;
      if (!this.sessionKey.equals(that.sessionKey))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_header = true && (isSetHeader());
    list.add(present_header);
    if (present_header)
      list.add(header);

    boolean present_seqBegin = true;
    list.add(present_seqBegin);
    if (present_seqBegin)
      list.add(seqBegin);

    boolean present_seqEnd = true;
    list.add(present_seqEnd);
    if (present_seqEnd)
      list.add(seqEnd);

    boolean present_msgType = true && (isSetMsgType());
    list.add(present_msgType);
    if (present_msgType)
      list.add(msgType.getValue());

    boolean present_sessionKey = true && (isSetSessionKey());
    list.add(present_sessionKey);
    if (present_sessionKey)
      list.add(sessionKey);

    return list.hashCode();
  }

  @Override
  public int compareTo(PullMsgReq other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetHeader()).compareTo(other.isSetHeader());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeader()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.header, other.header);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSeqBegin()).compareTo(other.isSetSeqBegin());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSeqBegin()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.seqBegin, other.seqBegin);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSeqEnd()).compareTo(other.isSetSeqEnd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSeqEnd()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.seqEnd, other.seqEnd);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMsgType()).compareTo(other.isSetMsgType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMsgType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.msgType, other.msgType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSessionKey()).compareTo(other.isSetSessionKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSessionKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sessionKey, other.sessionKey);
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
    StringBuilder sb = new StringBuilder("PullMsgReq(");
    boolean first = true;

    sb.append("header:");
    if (this.header == null) {
      sb.append("null");
    } else {
      sb.append(this.header);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("seqBegin:");
    sb.append(this.seqBegin);
    first = false;
    if (!first) sb.append(", ");
    sb.append("seqEnd:");
    sb.append(this.seqEnd);
    first = false;
    if (!first) sb.append(", ");
    sb.append("msgType:");
    if (this.msgType == null) {
      sb.append("null");
    } else {
      sb.append(this.msgType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sessionKey:");
    if (this.sessionKey == null) {
      sb.append("null");
    } else {
      sb.append(this.sessionKey);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (header != null) {
      header.validate();
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

  private static class PullMsgReqStandardSchemeFactory implements SchemeFactory {
    public PullMsgReqStandardScheme getScheme() {
      return new PullMsgReqStandardScheme();
    }
  }

  private static class PullMsgReqStandardScheme extends StandardScheme<PullMsgReq> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PullMsgReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HEADER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.header = new Header();
              struct.header.read(iprot);
              struct.setHeaderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SEQ_BEGIN
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.seqBegin = iprot.readI64();
              struct.setSeqBeginIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SEQ_END
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.seqEnd = iprot.readI64();
              struct.setSeqEndIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MSG_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.msgType = thrift_gen.oasis_im.rpc.SESSION_TYPE.findByValue(iprot.readI32());
              struct.setMsgTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // SESSION_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sessionKey = iprot.readString();
              struct.setSessionKeyIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PullMsgReq struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.header != null) {
        oprot.writeFieldBegin(HEADER_FIELD_DESC);
        struct.header.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SEQ_BEGIN_FIELD_DESC);
      oprot.writeI64(struct.seqBegin);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SEQ_END_FIELD_DESC);
      oprot.writeI64(struct.seqEnd);
      oprot.writeFieldEnd();
      if (struct.msgType != null) {
        oprot.writeFieldBegin(MSG_TYPE_FIELD_DESC);
        oprot.writeI32(struct.msgType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.sessionKey != null) {
        oprot.writeFieldBegin(SESSION_KEY_FIELD_DESC);
        oprot.writeString(struct.sessionKey);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PullMsgReqTupleSchemeFactory implements SchemeFactory {
    public PullMsgReqTupleScheme getScheme() {
      return new PullMsgReqTupleScheme();
    }
  }

  private static class PullMsgReqTupleScheme extends TupleScheme<PullMsgReq> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PullMsgReq struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetHeader()) {
        optionals.set(0);
      }
      if (struct.isSetSeqBegin()) {
        optionals.set(1);
      }
      if (struct.isSetSeqEnd()) {
        optionals.set(2);
      }
      if (struct.isSetMsgType()) {
        optionals.set(3);
      }
      if (struct.isSetSessionKey()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetHeader()) {
        struct.header.write(oprot);
      }
      if (struct.isSetSeqBegin()) {
        oprot.writeI64(struct.seqBegin);
      }
      if (struct.isSetSeqEnd()) {
        oprot.writeI64(struct.seqEnd);
      }
      if (struct.isSetMsgType()) {
        oprot.writeI32(struct.msgType.getValue());
      }
      if (struct.isSetSessionKey()) {
        oprot.writeString(struct.sessionKey);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PullMsgReq struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.header = new Header();
        struct.header.read(iprot);
        struct.setHeaderIsSet(true);
      }
      if (incoming.get(1)) {
        struct.seqBegin = iprot.readI64();
        struct.setSeqBeginIsSet(true);
      }
      if (incoming.get(2)) {
        struct.seqEnd = iprot.readI64();
        struct.setSeqEndIsSet(true);
      }
      if (incoming.get(3)) {
        struct.msgType = thrift_gen.oasis_im.rpc.SESSION_TYPE.findByValue(iprot.readI32());
        struct.setMsgTypeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.sessionKey = iprot.readString();
        struct.setSessionKeyIsSet(true);
      }
    }
  }

}

