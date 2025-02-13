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
public class MuteChatReq implements org.apache.thrift.TBase<MuteChatReq, MuteChatReq._Fields>, java.io.Serializable, Cloneable, Comparable<MuteChatReq> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MuteChatReq");

  private static final org.apache.thrift.protocol.TField HEADER_FIELD_DESC = new org.apache.thrift.protocol.TField("header", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField SESSION_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("sessionType", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField SESSION_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("sessionKey", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField MUTE_FIELD_DESC = new org.apache.thrift.protocol.TField("mute", org.apache.thrift.protocol.TType.BOOL, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MuteChatReqStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MuteChatReqTupleSchemeFactory());
  }

  public Header header; // required
  /**
   * 
   * @see thrift_gen.oasis_im.rpc.SESSION_TYPE
   */
  public thrift_gen.oasis_im.rpc.SESSION_TYPE sessionType; // required
  public String sessionKey; // required
  public boolean mute; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HEADER((short)1, "header"),
    /**
     * 
     * @see thrift_gen.oasis_im.rpc.SESSION_TYPE
     */
    SESSION_TYPE((short)2, "sessionType"),
    SESSION_KEY((short)3, "sessionKey"),
    MUTE((short)4, "mute");

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
        case 2: // SESSION_TYPE
          return SESSION_TYPE;
        case 3: // SESSION_KEY
          return SESSION_KEY;
        case 4: // MUTE
          return MUTE;
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
  private static final int __MUTE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HEADER, new org.apache.thrift.meta_data.FieldMetaData("header", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Header.class)));
    tmpMap.put(_Fields.SESSION_TYPE, new org.apache.thrift.meta_data.FieldMetaData("sessionType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, thrift_gen.oasis_im.rpc.SESSION_TYPE.class)));
    tmpMap.put(_Fields.SESSION_KEY, new org.apache.thrift.meta_data.FieldMetaData("sessionKey", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MUTE, new org.apache.thrift.meta_data.FieldMetaData("mute", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MuteChatReq.class, metaDataMap);
  }

  public MuteChatReq() {
  }

  public MuteChatReq(
    Header header,
    thrift_gen.oasis_im.rpc.SESSION_TYPE sessionType,
    String sessionKey,
    boolean mute)
  {
    this();
    this.header = header;
    this.sessionType = sessionType;
    this.sessionKey = sessionKey;
    this.mute = mute;
    setMuteIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MuteChatReq(MuteChatReq other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetHeader()) {
      this.header = new Header(other.header);
    }
    if (other.isSetSessionType()) {
      this.sessionType = other.sessionType;
    }
    if (other.isSetSessionKey()) {
      this.sessionKey = other.sessionKey;
    }
    this.mute = other.mute;
  }

  public MuteChatReq deepCopy() {
    return new MuteChatReq(this);
  }

  @Override
  public void clear() {
    this.header = null;
    this.sessionType = null;
    this.sessionKey = null;
    setMuteIsSet(false);
    this.mute = false;
  }

  public Header getHeader() {
    return this.header;
  }

  public MuteChatReq setHeader(Header header) {
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

  /**
   * 
   * @see thrift_gen.oasis_im.rpc.SESSION_TYPE
   */
  public thrift_gen.oasis_im.rpc.SESSION_TYPE getSessionType() {
    return this.sessionType;
  }

  /**
   * 
   * @see thrift_gen.oasis_im.rpc.SESSION_TYPE
   */
  public MuteChatReq setSessionType(thrift_gen.oasis_im.rpc.SESSION_TYPE sessionType) {
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

  public MuteChatReq setSessionKey(String sessionKey) {
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

  public boolean isMute() {
    return this.mute;
  }

  public MuteChatReq setMute(boolean mute) {
    this.mute = mute;
    setMuteIsSet(true);
    return this;
  }

  public void unsetMute() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MUTE_ISSET_ID);
  }

  /** Returns true if field mute is set (has been assigned a value) and false otherwise */
  public boolean isSetMute() {
    return EncodingUtils.testBit(__isset_bitfield, __MUTE_ISSET_ID);
  }

  public void setMuteIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MUTE_ISSET_ID, value);
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

    case SESSION_TYPE:
      if (value == null) {
        unsetSessionType();
      } else {
        setSessionType((thrift_gen.oasis_im.rpc.SESSION_TYPE)value);
      }
      break;

    case SESSION_KEY:
      if (value == null) {
        unsetSessionKey();
      } else {
        setSessionKey((String)value);
      }
      break;

    case MUTE:
      if (value == null) {
        unsetMute();
      } else {
        setMute((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HEADER:
      return getHeader();

    case SESSION_TYPE:
      return getSessionType();

    case SESSION_KEY:
      return getSessionKey();

    case MUTE:
      return isMute();

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
    case SESSION_TYPE:
      return isSetSessionType();
    case SESSION_KEY:
      return isSetSessionKey();
    case MUTE:
      return isSetMute();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MuteChatReq)
      return this.equals((MuteChatReq)that);
    return false;
  }

  public boolean equals(MuteChatReq that) {
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

    boolean this_present_mute = true;
    boolean that_present_mute = true;
    if (this_present_mute || that_present_mute) {
      if (!(this_present_mute && that_present_mute))
        return false;
      if (this.mute != that.mute)
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

    boolean present_sessionType = true && (isSetSessionType());
    list.add(present_sessionType);
    if (present_sessionType)
      list.add(sessionType.getValue());

    boolean present_sessionKey = true && (isSetSessionKey());
    list.add(present_sessionKey);
    if (present_sessionKey)
      list.add(sessionKey);

    boolean present_mute = true;
    list.add(present_mute);
    if (present_mute)
      list.add(mute);

    return list.hashCode();
  }

  @Override
  public int compareTo(MuteChatReq other) {
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
    lastComparison = Boolean.valueOf(isSetMute()).compareTo(other.isSetMute());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMute()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mute, other.mute);
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
    StringBuilder sb = new StringBuilder("MuteChatReq(");
    boolean first = true;

    sb.append("header:");
    if (this.header == null) {
      sb.append("null");
    } else {
      sb.append(this.header);
    }
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
    sb.append("mute:");
    sb.append(this.mute);
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

  private static class MuteChatReqStandardSchemeFactory implements SchemeFactory {
    public MuteChatReqStandardScheme getScheme() {
      return new MuteChatReqStandardScheme();
    }
  }

  private static class MuteChatReqStandardScheme extends StandardScheme<MuteChatReq> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MuteChatReq struct) throws org.apache.thrift.TException {
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
          case 2: // SESSION_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.sessionType = thrift_gen.oasis_im.rpc.SESSION_TYPE.findByValue(iprot.readI32());
              struct.setSessionTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SESSION_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sessionKey = iprot.readString();
              struct.setSessionKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MUTE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.mute = iprot.readBool();
              struct.setMuteIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MuteChatReq struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.header != null) {
        oprot.writeFieldBegin(HEADER_FIELD_DESC);
        struct.header.write(oprot);
        oprot.writeFieldEnd();
      }
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
      oprot.writeFieldBegin(MUTE_FIELD_DESC);
      oprot.writeBool(struct.mute);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MuteChatReqTupleSchemeFactory implements SchemeFactory {
    public MuteChatReqTupleScheme getScheme() {
      return new MuteChatReqTupleScheme();
    }
  }

  private static class MuteChatReqTupleScheme extends TupleScheme<MuteChatReq> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MuteChatReq struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetHeader()) {
        optionals.set(0);
      }
      if (struct.isSetSessionType()) {
        optionals.set(1);
      }
      if (struct.isSetSessionKey()) {
        optionals.set(2);
      }
      if (struct.isSetMute()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetHeader()) {
        struct.header.write(oprot);
      }
      if (struct.isSetSessionType()) {
        oprot.writeI32(struct.sessionType.getValue());
      }
      if (struct.isSetSessionKey()) {
        oprot.writeString(struct.sessionKey);
      }
      if (struct.isSetMute()) {
        oprot.writeBool(struct.mute);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MuteChatReq struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.header = new Header();
        struct.header.read(iprot);
        struct.setHeaderIsSet(true);
      }
      if (incoming.get(1)) {
        struct.sessionType = thrift_gen.oasis_im.rpc.SESSION_TYPE.findByValue(iprot.readI32());
        struct.setSessionTypeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.sessionKey = iprot.readString();
        struct.setSessionKeyIsSet(true);
      }
      if (incoming.get(3)) {
        struct.mute = iprot.readBool();
        struct.setMuteIsSet(true);
      }
    }
  }

}

