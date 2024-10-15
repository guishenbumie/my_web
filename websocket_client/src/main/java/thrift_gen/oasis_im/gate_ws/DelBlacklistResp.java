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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2024-09-05")
public class DelBlacklistResp implements org.apache.thrift.TBase<DelBlacklistResp, DelBlacklistResp._Fields>, java.io.Serializable, Cloneable, Comparable<DelBlacklistResp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DelBlacklistResp");

  private static final org.apache.thrift.protocol.TField MSG_INCR_FIELD_DESC = new org.apache.thrift.protocol.TField("msgIncr", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ERR_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("errCode", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField ERR_MSG_FIELD_DESC = new org.apache.thrift.protocol.TField("errMsg", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField BLOCK_UID_FIELD_DESC = new org.apache.thrift.protocol.TField("blockUid", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DelBlacklistRespStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DelBlacklistRespTupleSchemeFactory());
  }

  public int msgIncr; // required
  public int errCode; // required
  public String errMsg; // required
  public String blockUid; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MSG_INCR((short)1, "msgIncr"),
    ERR_CODE((short)2, "errCode"),
    ERR_MSG((short)3, "errMsg"),
    BLOCK_UID((short)4, "blockUid");

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
        case 1: // MSG_INCR
          return MSG_INCR;
        case 2: // ERR_CODE
          return ERR_CODE;
        case 3: // ERR_MSG
          return ERR_MSG;
        case 4: // BLOCK_UID
          return BLOCK_UID;
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
  private static final int __ERRCODE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MSG_INCR, new org.apache.thrift.meta_data.FieldMetaData("msgIncr", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ERR_CODE, new org.apache.thrift.meta_data.FieldMetaData("errCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ERR_MSG, new org.apache.thrift.meta_data.FieldMetaData("errMsg", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BLOCK_UID, new org.apache.thrift.meta_data.FieldMetaData("blockUid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DelBlacklistResp.class, metaDataMap);
  }

  public DelBlacklistResp() {
  }

  public DelBlacklistResp(
    int msgIncr,
    int errCode,
    String errMsg,
    String blockUid)
  {
    this();
    this.msgIncr = msgIncr;
    setMsgIncrIsSet(true);
    this.errCode = errCode;
    setErrCodeIsSet(true);
    this.errMsg = errMsg;
    this.blockUid = blockUid;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DelBlacklistResp(DelBlacklistResp other) {
    __isset_bitfield = other.__isset_bitfield;
    this.msgIncr = other.msgIncr;
    this.errCode = other.errCode;
    if (other.isSetErrMsg()) {
      this.errMsg = other.errMsg;
    }
    if (other.isSetBlockUid()) {
      this.blockUid = other.blockUid;
    }
  }

  public DelBlacklistResp deepCopy() {
    return new DelBlacklistResp(this);
  }

  @Override
  public void clear() {
    setMsgIncrIsSet(false);
    this.msgIncr = 0;
    setErrCodeIsSet(false);
    this.errCode = 0;
    this.errMsg = null;
    this.blockUid = null;
  }

  public int getMsgIncr() {
    return this.msgIncr;
  }

  public DelBlacklistResp setMsgIncr(int msgIncr) {
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

  public int getErrCode() {
    return this.errCode;
  }

  public DelBlacklistResp setErrCode(int errCode) {
    this.errCode = errCode;
    setErrCodeIsSet(true);
    return this;
  }

  public void unsetErrCode() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ERRCODE_ISSET_ID);
  }

  /** Returns true if field errCode is set (has been assigned a value) and false otherwise */
  public boolean isSetErrCode() {
    return EncodingUtils.testBit(__isset_bitfield, __ERRCODE_ISSET_ID);
  }

  public void setErrCodeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ERRCODE_ISSET_ID, value);
  }

  public String getErrMsg() {
    return this.errMsg;
  }

  public DelBlacklistResp setErrMsg(String errMsg) {
    this.errMsg = errMsg;
    return this;
  }

  public void unsetErrMsg() {
    this.errMsg = null;
  }

  /** Returns true if field errMsg is set (has been assigned a value) and false otherwise */
  public boolean isSetErrMsg() {
    return this.errMsg != null;
  }

  public void setErrMsgIsSet(boolean value) {
    if (!value) {
      this.errMsg = null;
    }
  }

  public String getBlockUid() {
    return this.blockUid;
  }

  public DelBlacklistResp setBlockUid(String blockUid) {
    this.blockUid = blockUid;
    return this;
  }

  public void unsetBlockUid() {
    this.blockUid = null;
  }

  /** Returns true if field blockUid is set (has been assigned a value) and false otherwise */
  public boolean isSetBlockUid() {
    return this.blockUid != null;
  }

  public void setBlockUidIsSet(boolean value) {
    if (!value) {
      this.blockUid = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MSG_INCR:
      if (value == null) {
        unsetMsgIncr();
      } else {
        setMsgIncr((Integer)value);
      }
      break;

    case ERR_CODE:
      if (value == null) {
        unsetErrCode();
      } else {
        setErrCode((Integer)value);
      }
      break;

    case ERR_MSG:
      if (value == null) {
        unsetErrMsg();
      } else {
        setErrMsg((String)value);
      }
      break;

    case BLOCK_UID:
      if (value == null) {
        unsetBlockUid();
      } else {
        setBlockUid((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MSG_INCR:
      return getMsgIncr();

    case ERR_CODE:
      return getErrCode();

    case ERR_MSG:
      return getErrMsg();

    case BLOCK_UID:
      return getBlockUid();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MSG_INCR:
      return isSetMsgIncr();
    case ERR_CODE:
      return isSetErrCode();
    case ERR_MSG:
      return isSetErrMsg();
    case BLOCK_UID:
      return isSetBlockUid();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DelBlacklistResp)
      return this.equals((DelBlacklistResp)that);
    return false;
  }

  public boolean equals(DelBlacklistResp that) {
    if (that == null)
      return false;

    boolean this_present_msgIncr = true;
    boolean that_present_msgIncr = true;
    if (this_present_msgIncr || that_present_msgIncr) {
      if (!(this_present_msgIncr && that_present_msgIncr))
        return false;
      if (this.msgIncr != that.msgIncr)
        return false;
    }

    boolean this_present_errCode = true;
    boolean that_present_errCode = true;
    if (this_present_errCode || that_present_errCode) {
      if (!(this_present_errCode && that_present_errCode))
        return false;
      if (this.errCode != that.errCode)
        return false;
    }

    boolean this_present_errMsg = true && this.isSetErrMsg();
    boolean that_present_errMsg = true && that.isSetErrMsg();
    if (this_present_errMsg || that_present_errMsg) {
      if (!(this_present_errMsg && that_present_errMsg))
        return false;
      if (!this.errMsg.equals(that.errMsg))
        return false;
    }

    boolean this_present_blockUid = true && this.isSetBlockUid();
    boolean that_present_blockUid = true && that.isSetBlockUid();
    if (this_present_blockUid || that_present_blockUid) {
      if (!(this_present_blockUid && that_present_blockUid))
        return false;
      if (!this.blockUid.equals(that.blockUid))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_msgIncr = true;
    list.add(present_msgIncr);
    if (present_msgIncr)
      list.add(msgIncr);

    boolean present_errCode = true;
    list.add(present_errCode);
    if (present_errCode)
      list.add(errCode);

    boolean present_errMsg = true && (isSetErrMsg());
    list.add(present_errMsg);
    if (present_errMsg)
      list.add(errMsg);

    boolean present_blockUid = true && (isSetBlockUid());
    list.add(present_blockUid);
    if (present_blockUid)
      list.add(blockUid);

    return list.hashCode();
  }

  @Override
  public int compareTo(DelBlacklistResp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = Boolean.valueOf(isSetErrCode()).compareTo(other.isSetErrCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errCode, other.errCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetErrMsg()).compareTo(other.isSetErrMsg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrMsg()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errMsg, other.errMsg);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBlockUid()).compareTo(other.isSetBlockUid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBlockUid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.blockUid, other.blockUid);
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
    StringBuilder sb = new StringBuilder("DelBlacklistResp(");
    boolean first = true;

    sb.append("msgIncr:");
    sb.append(this.msgIncr);
    first = false;
    if (!first) sb.append(", ");
    sb.append("errCode:");
    sb.append(this.errCode);
    first = false;
    if (!first) sb.append(", ");
    sb.append("errMsg:");
    if (this.errMsg == null) {
      sb.append("null");
    } else {
      sb.append(this.errMsg);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("blockUid:");
    if (this.blockUid == null) {
      sb.append("null");
    } else {
      sb.append(this.blockUid);
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

  private static class DelBlacklistRespStandardSchemeFactory implements SchemeFactory {
    public DelBlacklistRespStandardScheme getScheme() {
      return new DelBlacklistRespStandardScheme();
    }
  }

  private static class DelBlacklistRespStandardScheme extends StandardScheme<DelBlacklistResp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DelBlacklistResp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MSG_INCR
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.msgIncr = iprot.readI32();
              struct.setMsgIncrIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ERR_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.errCode = iprot.readI32();
              struct.setErrCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ERR_MSG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.errMsg = iprot.readString();
              struct.setErrMsgIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // BLOCK_UID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.blockUid = iprot.readString();
              struct.setBlockUidIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DelBlacklistResp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(MSG_INCR_FIELD_DESC);
      oprot.writeI32(struct.msgIncr);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ERR_CODE_FIELD_DESC);
      oprot.writeI32(struct.errCode);
      oprot.writeFieldEnd();
      if (struct.errMsg != null) {
        oprot.writeFieldBegin(ERR_MSG_FIELD_DESC);
        oprot.writeString(struct.errMsg);
        oprot.writeFieldEnd();
      }
      if (struct.blockUid != null) {
        oprot.writeFieldBegin(BLOCK_UID_FIELD_DESC);
        oprot.writeString(struct.blockUid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DelBlacklistRespTupleSchemeFactory implements SchemeFactory {
    public DelBlacklistRespTupleScheme getScheme() {
      return new DelBlacklistRespTupleScheme();
    }
  }

  private static class DelBlacklistRespTupleScheme extends TupleScheme<DelBlacklistResp> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DelBlacklistResp struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMsgIncr()) {
        optionals.set(0);
      }
      if (struct.isSetErrCode()) {
        optionals.set(1);
      }
      if (struct.isSetErrMsg()) {
        optionals.set(2);
      }
      if (struct.isSetBlockUid()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetMsgIncr()) {
        oprot.writeI32(struct.msgIncr);
      }
      if (struct.isSetErrCode()) {
        oprot.writeI32(struct.errCode);
      }
      if (struct.isSetErrMsg()) {
        oprot.writeString(struct.errMsg);
      }
      if (struct.isSetBlockUid()) {
        oprot.writeString(struct.blockUid);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DelBlacklistResp struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.msgIncr = iprot.readI32();
        struct.setMsgIncrIsSet(true);
      }
      if (incoming.get(1)) {
        struct.errCode = iprot.readI32();
        struct.setErrCodeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.errMsg = iprot.readString();
        struct.setErrMsgIsSet(true);
      }
      if (incoming.get(3)) {
        struct.blockUid = iprot.readString();
        struct.setBlockUidIsSet(true);
      }
    }
  }

}

