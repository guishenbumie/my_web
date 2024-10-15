/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thrift_gen.oasis_im.rpc;

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
public class PullMessage implements org.apache.thrift.TBase<PullMessage, PullMessage._Fields>, java.io.Serializable, Cloneable, Comparable<PullMessage> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PullMessage");

  private static final org.apache.thrift.protocol.TField SEQ_BEGIN_FIELD_DESC = new org.apache.thrift.protocol.TField("seqBegin", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField SEQ_END_FIELD_DESC = new org.apache.thrift.protocol.TField("seqEnd", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField SESSION_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("sessionType", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField SESSION_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("sessionKey", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField UID_FIELD_DESC = new org.apache.thrift.protocol.TField("uid", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PullMessageStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PullMessageTupleSchemeFactory());
  }

  public long seqBegin; // required
  public long seqEnd; // required
  /**
   * 
   * @see SESSION_TYPE
   */
  public SESSION_TYPE sessionType; // required
  public String sessionKey; // required
  public String uid; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SEQ_BEGIN((short)1, "seqBegin"),
    SEQ_END((short)2, "seqEnd"),
    /**
     * 
     * @see SESSION_TYPE
     */
    SESSION_TYPE((short)3, "sessionType"),
    SESSION_KEY((short)4, "sessionKey"),
    UID((short)5, "uid");

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
        case 1: // SEQ_BEGIN
          return SEQ_BEGIN;
        case 2: // SEQ_END
          return SEQ_END;
        case 3: // SESSION_TYPE
          return SESSION_TYPE;
        case 4: // SESSION_KEY
          return SESSION_KEY;
        case 5: // UID
          return UID;
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
    tmpMap.put(_Fields.SEQ_BEGIN, new org.apache.thrift.meta_data.FieldMetaData("seqBegin", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SEQ_END, new org.apache.thrift.meta_data.FieldMetaData("seqEnd", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SESSION_TYPE, new org.apache.thrift.meta_data.FieldMetaData("sessionType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SESSION_TYPE.class)));
    tmpMap.put(_Fields.SESSION_KEY, new org.apache.thrift.meta_data.FieldMetaData("sessionKey", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UID, new org.apache.thrift.meta_data.FieldMetaData("uid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PullMessage.class, metaDataMap);
  }

  public PullMessage() {
  }

  public PullMessage(
    long seqBegin,
    long seqEnd,
    SESSION_TYPE sessionType,
    String sessionKey,
    String uid)
  {
    this();
    this.seqBegin = seqBegin;
    setSeqBeginIsSet(true);
    this.seqEnd = seqEnd;
    setSeqEndIsSet(true);
    this.sessionType = sessionType;
    this.sessionKey = sessionKey;
    this.uid = uid;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PullMessage(PullMessage other) {
    __isset_bitfield = other.__isset_bitfield;
    this.seqBegin = other.seqBegin;
    this.seqEnd = other.seqEnd;
    if (other.isSetSessionType()) {
      this.sessionType = other.sessionType;
    }
    if (other.isSetSessionKey()) {
      this.sessionKey = other.sessionKey;
    }
    if (other.isSetUid()) {
      this.uid = other.uid;
    }
  }

  public PullMessage deepCopy() {
    return new PullMessage(this);
  }

  @Override
  public void clear() {
    setSeqBeginIsSet(false);
    this.seqBegin = 0;
    setSeqEndIsSet(false);
    this.seqEnd = 0;
    this.sessionType = null;
    this.sessionKey = null;
    this.uid = null;
  }

  public long getSeqBegin() {
    return this.seqBegin;
  }

  public PullMessage setSeqBegin(long seqBegin) {
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

  public PullMessage setSeqEnd(long seqEnd) {
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
   * @see SESSION_TYPE
   */
  public SESSION_TYPE getSessionType() {
    return this.sessionType;
  }

  /**
   * 
   * @see SESSION_TYPE
   */
  public PullMessage setSessionType(SESSION_TYPE sessionType) {
    this.sessionType = sessionType;
    return this;
  }

  public void unsetSessionType() {
    this.sessionType = null;
  }

  /** Returns true if field sessionType is set (has been assigned a value) and false otherwise */
  public boolean isSetSessionType() {
    return this.sessionType != null;
  }

  public void setSessionTypeIsSet(boolean value) {
    if (!value) {
      this.sessionType = null;
    }
  }

  public String getSessionKey() {
    return this.sessionKey;
  }

  public PullMessage setSessionKey(String sessionKey) {
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

  public String getUid() {
    return this.uid;
  }

  public PullMessage setUid(String uid) {
    this.uid = uid;
    return this;
  }

  public void unsetUid() {
    this.uid = null;
  }

  /** Returns true if field uid is set (has been assigned a value) and false otherwise */
  public boolean isSetUid() {
    return this.uid != null;
  }

  public void setUidIsSet(boolean value) {
    if (!value) {
      this.uid = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
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

    case SESSION_TYPE:
      if (value == null) {
        unsetSessionType();
      } else {
        setSessionType((SESSION_TYPE)value);
      }
      break;

    case SESSION_KEY:
      if (value == null) {
        unsetSessionKey();
      } else {
        setSessionKey((String)value);
      }
      break;

    case UID:
      if (value == null) {
        unsetUid();
      } else {
        setUid((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SEQ_BEGIN:
      return getSeqBegin();

    case SEQ_END:
      return getSeqEnd();

    case SESSION_TYPE:
      return getSessionType();

    case SESSION_KEY:
      return getSessionKey();

    case UID:
      return getUid();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SEQ_BEGIN:
      return isSetSeqBegin();
    case SEQ_END:
      return isSetSeqEnd();
    case SESSION_TYPE:
      return isSetSessionType();
    case SESSION_KEY:
      return isSetSessionKey();
    case UID:
      return isSetUid();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PullMessage)
      return this.equals((PullMessage)that);
    return false;
  }

  public boolean equals(PullMessage that) {
    if (that == null)
      return false;

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

    boolean this_present_sessionType = true && this.isSetSessionType();
    boolean that_present_sessionType = true && that.isSetSessionType();
    if (this_present_sessionType || that_present_sessionType) {
      if (!(this_present_sessionType && that_present_sessionType))
        return false;
      if (!this.sessionType.equals(that.sessionType))
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

    boolean this_present_uid = true && this.isSetUid();
    boolean that_present_uid = true && that.isSetUid();
    if (this_present_uid || that_present_uid) {
      if (!(this_present_uid && that_present_uid))
        return false;
      if (!this.uid.equals(that.uid))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_seqBegin = true;
    list.add(present_seqBegin);
    if (present_seqBegin)
      list.add(seqBegin);

    boolean present_seqEnd = true;
    list.add(present_seqEnd);
    if (present_seqEnd)
      list.add(seqEnd);

    boolean present_sessionType = true && (isSetSessionType());
    list.add(present_sessionType);
    if (present_sessionType)
      list.add(sessionType.getValue());

    boolean present_sessionKey = true && (isSetSessionKey());
    list.add(present_sessionKey);
    if (present_sessionKey)
      list.add(sessionKey);

    boolean present_uid = true && (isSetUid());
    list.add(present_uid);
    if (present_uid)
      list.add(uid);

    return list.hashCode();
  }

  @Override
  public int compareTo(PullMessage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = Boolean.valueOf(isSetSessionType()).compareTo(other.isSetSessionType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSessionType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sessionType, other.sessionType);
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
    lastComparison = Boolean.valueOf(isSetUid()).compareTo(other.isSetUid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uid, other.uid);
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
    StringBuilder sb = new StringBuilder("PullMessage(");
    boolean first = true;

    sb.append("seqBegin:");
    sb.append(this.seqBegin);
    first = false;
    if (!first) sb.append(", ");
    sb.append("seqEnd:");
    sb.append(this.seqEnd);
    first = false;
    if (!first) sb.append(", ");
    sb.append("sessionType:");
    if (this.sessionType == null) {
      sb.append("null");
    } else {
      sb.append(this.sessionType);
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
    if (!first) sb.append(", ");
    sb.append("uid:");
    if (this.uid == null) {
      sb.append("null");
    } else {
      sb.append(this.uid);
    }
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

  private static class PullMessageStandardSchemeFactory implements SchemeFactory {
    public PullMessageStandardScheme getScheme() {
      return new PullMessageStandardScheme();
    }
  }

  private static class PullMessageStandardScheme extends StandardScheme<PullMessage> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PullMessage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SEQ_BEGIN
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.seqBegin = iprot.readI64();
              struct.setSeqBeginIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SEQ_END
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.seqEnd = iprot.readI64();
              struct.setSeqEndIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SESSION_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.sessionType = thrift_gen.oasis_im.rpc.SESSION_TYPE.findByValue(iprot.readI32());
              struct.setSessionTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SESSION_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sessionKey = iprot.readString();
              struct.setSessionKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // UID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.uid = iprot.readString();
              struct.setUidIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PullMessage struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SEQ_BEGIN_FIELD_DESC);
      oprot.writeI64(struct.seqBegin);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SEQ_END_FIELD_DESC);
      oprot.writeI64(struct.seqEnd);
      oprot.writeFieldEnd();
      if (struct.sessionType != null) {
        oprot.writeFieldBegin(SESSION_TYPE_FIELD_DESC);
        oprot.writeI32(struct.sessionType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.sessionKey != null) {
        oprot.writeFieldBegin(SESSION_KEY_FIELD_DESC);
        oprot.writeString(struct.sessionKey);
        oprot.writeFieldEnd();
      }
      if (struct.uid != null) {
        oprot.writeFieldBegin(UID_FIELD_DESC);
        oprot.writeString(struct.uid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PullMessageTupleSchemeFactory implements SchemeFactory {
    public PullMessageTupleScheme getScheme() {
      return new PullMessageTupleScheme();
    }
  }

  private static class PullMessageTupleScheme extends TupleScheme<PullMessage> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PullMessage struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSeqBegin()) {
        optionals.set(0);
      }
      if (struct.isSetSeqEnd()) {
        optionals.set(1);
      }
      if (struct.isSetSessionType()) {
        optionals.set(2);
      }
      if (struct.isSetSessionKey()) {
        optionals.set(3);
      }
      if (struct.isSetUid()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetSeqBegin()) {
        oprot.writeI64(struct.seqBegin);
      }
      if (struct.isSetSeqEnd()) {
        oprot.writeI64(struct.seqEnd);
      }
      if (struct.isSetSessionType()) {
        oprot.writeI32(struct.sessionType.getValue());
      }
      if (struct.isSetSessionKey()) {
        oprot.writeString(struct.sessionKey);
      }
      if (struct.isSetUid()) {
        oprot.writeString(struct.uid);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PullMessage struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.seqBegin = iprot.readI64();
        struct.setSeqBeginIsSet(true);
      }
      if (incoming.get(1)) {
        struct.seqEnd = iprot.readI64();
        struct.setSeqEndIsSet(true);
      }
      if (incoming.get(2)) {
        struct.sessionType = thrift_gen.oasis_im.rpc.SESSION_TYPE.findByValue(iprot.readI32());
        struct.setSessionTypeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.sessionKey = iprot.readString();
        struct.setSessionKeyIsSet(true);
      }
      if (incoming.get(4)) {
        struct.uid = iprot.readString();
        struct.setUidIsSet(true);
      }
    }
  }

}

