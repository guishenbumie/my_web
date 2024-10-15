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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2024-09-05")
public class MuteChatResp implements org.apache.thrift.TBase<MuteChatResp, MuteChatResp._Fields>, java.io.Serializable, Cloneable, Comparable<MuteChatResp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MuteChatResp");

  private static final org.apache.thrift.protocol.TField BASE_FIELD_DESC = new org.apache.thrift.protocol.TField("base", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField SESSION_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("sessionType", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField SESSION_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("sessionKey", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField SETTING_FIELD_DESC = new org.apache.thrift.protocol.TField("setting", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MuteChatRespStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MuteChatRespTupleSchemeFactory());
  }

  public BaseResp base; // required
  /**
   * 
   * @see SESSION_TYPE
   */
  public SESSION_TYPE sessionType; // required
  public String sessionKey; // required
  public String setting; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BASE((short)1, "base"),
    /**
     * 
     * @see SESSION_TYPE
     */
    SESSION_TYPE((short)2, "sessionType"),
    SESSION_KEY((short)3, "sessionKey"),
    SETTING((short)4, "setting");

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
        case 1: // BASE
          return BASE;
        case 2: // SESSION_TYPE
          return SESSION_TYPE;
        case 3: // SESSION_KEY
          return SESSION_KEY;
        case 4: // SETTING
          return SETTING;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BASE, new org.apache.thrift.meta_data.FieldMetaData("base", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BaseResp.class)));
    tmpMap.put(_Fields.SESSION_TYPE, new org.apache.thrift.meta_data.FieldMetaData("sessionType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SESSION_TYPE.class)));
    tmpMap.put(_Fields.SESSION_KEY, new org.apache.thrift.meta_data.FieldMetaData("sessionKey", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SETTING, new org.apache.thrift.meta_data.FieldMetaData("setting", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MuteChatResp.class, metaDataMap);
  }

  public MuteChatResp() {
  }

  public MuteChatResp(
    BaseResp base,
    SESSION_TYPE sessionType,
    String sessionKey,
    String setting)
  {
    this();
    this.base = base;
    this.sessionType = sessionType;
    this.sessionKey = sessionKey;
    this.setting = setting;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MuteChatResp(MuteChatResp other) {
    if (other.isSetBase()) {
      this.base = new BaseResp(other.base);
    }
    if (other.isSetSessionType()) {
      this.sessionType = other.sessionType;
    }
    if (other.isSetSessionKey()) {
      this.sessionKey = other.sessionKey;
    }
    if (other.isSetSetting()) {
      this.setting = other.setting;
    }
  }

  public MuteChatResp deepCopy() {
    return new MuteChatResp(this);
  }

  @Override
  public void clear() {
    this.base = null;
    this.sessionType = null;
    this.sessionKey = null;
    this.setting = null;
  }

  public BaseResp getBase() {
    return this.base;
  }

  public MuteChatResp setBase(BaseResp base) {
    this.base = base;
    return this;
  }

  public void unsetBase() {
    this.base = null;
  }

  /** Returns true if field base is set (has been assigned a value) and false otherwise */
  public boolean isSetBase() {
    return this.base != null;
  }

  public void setBaseIsSet(boolean value) {
    if (!value) {
      this.base = null;
    }
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
  public MuteChatResp setSessionType(SESSION_TYPE sessionType) {
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

  public MuteChatResp setSessionKey(String sessionKey) {
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

  public String getSetting() {
    return this.setting;
  }

  public MuteChatResp setSetting(String setting) {
    this.setting = setting;
    return this;
  }

  public void unsetSetting() {
    this.setting = null;
  }

  /** Returns true if field setting is set (has been assigned a value) and false otherwise */
  public boolean isSetSetting() {
    return this.setting != null;
  }

  public void setSettingIsSet(boolean value) {
    if (!value) {
      this.setting = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BASE:
      if (value == null) {
        unsetBase();
      } else {
        setBase((BaseResp)value);
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

    case SETTING:
      if (value == null) {
        unsetSetting();
      } else {
        setSetting((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BASE:
      return getBase();

    case SESSION_TYPE:
      return getSessionType();

    case SESSION_KEY:
      return getSessionKey();

    case SETTING:
      return getSetting();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BASE:
      return isSetBase();
    case SESSION_TYPE:
      return isSetSessionType();
    case SESSION_KEY:
      return isSetSessionKey();
    case SETTING:
      return isSetSetting();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MuteChatResp)
      return this.equals((MuteChatResp)that);
    return false;
  }

  public boolean equals(MuteChatResp that) {
    if (that == null)
      return false;

    boolean this_present_base = true && this.isSetBase();
    boolean that_present_base = true && that.isSetBase();
    if (this_present_base || that_present_base) {
      if (!(this_present_base && that_present_base))
        return false;
      if (!this.base.equals(that.base))
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

    boolean this_present_setting = true && this.isSetSetting();
    boolean that_present_setting = true && that.isSetSetting();
    if (this_present_setting || that_present_setting) {
      if (!(this_present_setting && that_present_setting))
        return false;
      if (!this.setting.equals(that.setting))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_base = true && (isSetBase());
    list.add(present_base);
    if (present_base)
      list.add(base);

    boolean present_sessionType = true && (isSetSessionType());
    list.add(present_sessionType);
    if (present_sessionType)
      list.add(sessionType.getValue());

    boolean present_sessionKey = true && (isSetSessionKey());
    list.add(present_sessionKey);
    if (present_sessionKey)
      list.add(sessionKey);

    boolean present_setting = true && (isSetSetting());
    list.add(present_setting);
    if (present_setting)
      list.add(setting);

    return list.hashCode();
  }

  @Override
  public int compareTo(MuteChatResp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBase()).compareTo(other.isSetBase());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBase()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.base, other.base);
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
    lastComparison = Boolean.valueOf(isSetSetting()).compareTo(other.isSetSetting());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSetting()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.setting, other.setting);
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
    StringBuilder sb = new StringBuilder("MuteChatResp(");
    boolean first = true;

    sb.append("base:");
    if (this.base == null) {
      sb.append("null");
    } else {
      sb.append(this.base);
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
    sb.append("setting:");
    if (this.setting == null) {
      sb.append("null");
    } else {
      sb.append(this.setting);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (base != null) {
      base.validate();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MuteChatRespStandardSchemeFactory implements SchemeFactory {
    public MuteChatRespStandardScheme getScheme() {
      return new MuteChatRespStandardScheme();
    }
  }

  private static class MuteChatRespStandardScheme extends StandardScheme<MuteChatResp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MuteChatResp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BASE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.base = new BaseResp();
              struct.base.read(iprot);
              struct.setBaseIsSet(true);
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
          case 4: // SETTING
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.setting = iprot.readString();
              struct.setSettingIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MuteChatResp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.base != null) {
        oprot.writeFieldBegin(BASE_FIELD_DESC);
        struct.base.write(oprot);
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
      if (struct.setting != null) {
        oprot.writeFieldBegin(SETTING_FIELD_DESC);
        oprot.writeString(struct.setting);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MuteChatRespTupleSchemeFactory implements SchemeFactory {
    public MuteChatRespTupleScheme getScheme() {
      return new MuteChatRespTupleScheme();
    }
  }

  private static class MuteChatRespTupleScheme extends TupleScheme<MuteChatResp> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MuteChatResp struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBase()) {
        optionals.set(0);
      }
      if (struct.isSetSessionType()) {
        optionals.set(1);
      }
      if (struct.isSetSessionKey()) {
        optionals.set(2);
      }
      if (struct.isSetSetting()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetBase()) {
        struct.base.write(oprot);
      }
      if (struct.isSetSessionType()) {
        oprot.writeI32(struct.sessionType.getValue());
      }
      if (struct.isSetSessionKey()) {
        oprot.writeString(struct.sessionKey);
      }
      if (struct.isSetSetting()) {
        oprot.writeString(struct.setting);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MuteChatResp struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.base = new BaseResp();
        struct.base.read(iprot);
        struct.setBaseIsSet(true);
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
        struct.setting = iprot.readString();
        struct.setSettingIsSet(true);
      }
    }
  }

}

