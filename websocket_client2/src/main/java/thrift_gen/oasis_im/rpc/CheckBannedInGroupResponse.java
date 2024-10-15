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
public class CheckBannedInGroupResponse implements org.apache.thrift.TBase<CheckBannedInGroupResponse, CheckBannedInGroupResponse._Fields>, java.io.Serializable, Cloneable, Comparable<CheckBannedInGroupResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CheckBannedInGroupResponse");

  private static final org.apache.thrift.protocol.TField BASE_FIELD_DESC = new org.apache.thrift.protocol.TField("base", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField IS_BANNED_FIELD_DESC = new org.apache.thrift.protocol.TField("isBanned", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField BEGIN_BAN_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("beginBanTime", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField END_BAN_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("endBanTime", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField EXTRA_FIELD_DESC = new org.apache.thrift.protocol.TField("extra", org.apache.thrift.protocol.TType.MAP, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CheckBannedInGroupResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CheckBannedInGroupResponseTupleSchemeFactory());
  }

  public BaseResp base; // required
  public boolean isBanned; // required
  public long beginBanTime; // required
  public long endBanTime; // required
  public Map<String,String> extra; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BASE((short)1, "base"),
    IS_BANNED((short)2, "isBanned"),
    BEGIN_BAN_TIME((short)3, "beginBanTime"),
    END_BAN_TIME((short)4, "endBanTime"),
    EXTRA((short)5, "extra");

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
        case 2: // IS_BANNED
          return IS_BANNED;
        case 3: // BEGIN_BAN_TIME
          return BEGIN_BAN_TIME;
        case 4: // END_BAN_TIME
          return END_BAN_TIME;
        case 5: // EXTRA
          return EXTRA;
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
  private static final int __ISBANNED_ISSET_ID = 0;
  private static final int __BEGINBANTIME_ISSET_ID = 1;
  private static final int __ENDBANTIME_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BASE, new org.apache.thrift.meta_data.FieldMetaData("base", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BaseResp.class)));
    tmpMap.put(_Fields.IS_BANNED, new org.apache.thrift.meta_data.FieldMetaData("isBanned", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.BEGIN_BAN_TIME, new org.apache.thrift.meta_data.FieldMetaData("beginBanTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.END_BAN_TIME, new org.apache.thrift.meta_data.FieldMetaData("endBanTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.EXTRA, new org.apache.thrift.meta_data.FieldMetaData("extra", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CheckBannedInGroupResponse.class, metaDataMap);
  }

  public CheckBannedInGroupResponse() {
  }

  public CheckBannedInGroupResponse(
    BaseResp base,
    boolean isBanned,
    long beginBanTime,
    long endBanTime,
    Map<String,String> extra)
  {
    this();
    this.base = base;
    this.isBanned = isBanned;
    setIsBannedIsSet(true);
    this.beginBanTime = beginBanTime;
    setBeginBanTimeIsSet(true);
    this.endBanTime = endBanTime;
    setEndBanTimeIsSet(true);
    this.extra = extra;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CheckBannedInGroupResponse(CheckBannedInGroupResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetBase()) {
      this.base = new BaseResp(other.base);
    }
    this.isBanned = other.isBanned;
    this.beginBanTime = other.beginBanTime;
    this.endBanTime = other.endBanTime;
    if (other.isSetExtra()) {
      Map<String,String> __this__extra = new HashMap<String,String>(other.extra);
      this.extra = __this__extra;
    }
  }

  public CheckBannedInGroupResponse deepCopy() {
    return new CheckBannedInGroupResponse(this);
  }

  @Override
  public void clear() {
    this.base = null;
    setIsBannedIsSet(false);
    this.isBanned = false;
    setBeginBanTimeIsSet(false);
    this.beginBanTime = 0;
    setEndBanTimeIsSet(false);
    this.endBanTime = 0;
    this.extra = null;
  }

  public BaseResp getBase() {
    return this.base;
  }

  public CheckBannedInGroupResponse setBase(BaseResp base) {
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

  public boolean isIsBanned() {
    return this.isBanned;
  }

  public CheckBannedInGroupResponse setIsBanned(boolean isBanned) {
    this.isBanned = isBanned;
    setIsBannedIsSet(true);
    return this;
  }

  public void unsetIsBanned() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISBANNED_ISSET_ID);
  }

  /** Returns true if field isBanned is set (has been assigned a value) and false otherwise */
  public boolean isSetIsBanned() {
    return EncodingUtils.testBit(__isset_bitfield, __ISBANNED_ISSET_ID);
  }

  public void setIsBannedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISBANNED_ISSET_ID, value);
  }

  public long getBeginBanTime() {
    return this.beginBanTime;
  }

  public CheckBannedInGroupResponse setBeginBanTime(long beginBanTime) {
    this.beginBanTime = beginBanTime;
    setBeginBanTimeIsSet(true);
    return this;
  }

  public void unsetBeginBanTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BEGINBANTIME_ISSET_ID);
  }

  /** Returns true if field beginBanTime is set (has been assigned a value) and false otherwise */
  public boolean isSetBeginBanTime() {
    return EncodingUtils.testBit(__isset_bitfield, __BEGINBANTIME_ISSET_ID);
  }

  public void setBeginBanTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BEGINBANTIME_ISSET_ID, value);
  }

  public long getEndBanTime() {
    return this.endBanTime;
  }

  public CheckBannedInGroupResponse setEndBanTime(long endBanTime) {
    this.endBanTime = endBanTime;
    setEndBanTimeIsSet(true);
    return this;
  }

  public void unsetEndBanTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ENDBANTIME_ISSET_ID);
  }

  /** Returns true if field endBanTime is set (has been assigned a value) and false otherwise */
  public boolean isSetEndBanTime() {
    return EncodingUtils.testBit(__isset_bitfield, __ENDBANTIME_ISSET_ID);
  }

  public void setEndBanTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ENDBANTIME_ISSET_ID, value);
  }

  public int getExtraSize() {
    return (this.extra == null) ? 0 : this.extra.size();
  }

  public void putToExtra(String key, String val) {
    if (this.extra == null) {
      this.extra = new HashMap<String,String>();
    }
    this.extra.put(key, val);
  }

  public Map<String,String> getExtra() {
    return this.extra;
  }

  public CheckBannedInGroupResponse setExtra(Map<String,String> extra) {
    this.extra = extra;
    return this;
  }

  public void unsetExtra() {
    this.extra = null;
  }

  /** Returns true if field extra is set (has been assigned a value) and false otherwise */
  public boolean isSetExtra() {
    return this.extra != null;
  }

  public void setExtraIsSet(boolean value) {
    if (!value) {
      this.extra = null;
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

    case IS_BANNED:
      if (value == null) {
        unsetIsBanned();
      } else {
        setIsBanned((Boolean)value);
      }
      break;

    case BEGIN_BAN_TIME:
      if (value == null) {
        unsetBeginBanTime();
      } else {
        setBeginBanTime((Long)value);
      }
      break;

    case END_BAN_TIME:
      if (value == null) {
        unsetEndBanTime();
      } else {
        setEndBanTime((Long)value);
      }
      break;

    case EXTRA:
      if (value == null) {
        unsetExtra();
      } else {
        setExtra((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BASE:
      return getBase();

    case IS_BANNED:
      return isIsBanned();

    case BEGIN_BAN_TIME:
      return getBeginBanTime();

    case END_BAN_TIME:
      return getEndBanTime();

    case EXTRA:
      return getExtra();

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
    case IS_BANNED:
      return isSetIsBanned();
    case BEGIN_BAN_TIME:
      return isSetBeginBanTime();
    case END_BAN_TIME:
      return isSetEndBanTime();
    case EXTRA:
      return isSetExtra();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CheckBannedInGroupResponse)
      return this.equals((CheckBannedInGroupResponse)that);
    return false;
  }

  public boolean equals(CheckBannedInGroupResponse that) {
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

    boolean this_present_isBanned = true;
    boolean that_present_isBanned = true;
    if (this_present_isBanned || that_present_isBanned) {
      if (!(this_present_isBanned && that_present_isBanned))
        return false;
      if (this.isBanned != that.isBanned)
        return false;
    }

    boolean this_present_beginBanTime = true;
    boolean that_present_beginBanTime = true;
    if (this_present_beginBanTime || that_present_beginBanTime) {
      if (!(this_present_beginBanTime && that_present_beginBanTime))
        return false;
      if (this.beginBanTime != that.beginBanTime)
        return false;
    }

    boolean this_present_endBanTime = true;
    boolean that_present_endBanTime = true;
    if (this_present_endBanTime || that_present_endBanTime) {
      if (!(this_present_endBanTime && that_present_endBanTime))
        return false;
      if (this.endBanTime != that.endBanTime)
        return false;
    }

    boolean this_present_extra = true && this.isSetExtra();
    boolean that_present_extra = true && that.isSetExtra();
    if (this_present_extra || that_present_extra) {
      if (!(this_present_extra && that_present_extra))
        return false;
      if (!this.extra.equals(that.extra))
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

    boolean present_isBanned = true;
    list.add(present_isBanned);
    if (present_isBanned)
      list.add(isBanned);

    boolean present_beginBanTime = true;
    list.add(present_beginBanTime);
    if (present_beginBanTime)
      list.add(beginBanTime);

    boolean present_endBanTime = true;
    list.add(present_endBanTime);
    if (present_endBanTime)
      list.add(endBanTime);

    boolean present_extra = true && (isSetExtra());
    list.add(present_extra);
    if (present_extra)
      list.add(extra);

    return list.hashCode();
  }

  @Override
  public int compareTo(CheckBannedInGroupResponse other) {
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
    lastComparison = Boolean.valueOf(isSetIsBanned()).compareTo(other.isSetIsBanned());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsBanned()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isBanned, other.isBanned);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBeginBanTime()).compareTo(other.isSetBeginBanTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBeginBanTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.beginBanTime, other.beginBanTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEndBanTime()).compareTo(other.isSetEndBanTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndBanTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.endBanTime, other.endBanTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExtra()).compareTo(other.isSetExtra());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExtra()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.extra, other.extra);
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
    StringBuilder sb = new StringBuilder("CheckBannedInGroupResponse(");
    boolean first = true;

    sb.append("base:");
    if (this.base == null) {
      sb.append("null");
    } else {
      sb.append(this.base);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("isBanned:");
    sb.append(this.isBanned);
    first = false;
    if (!first) sb.append(", ");
    sb.append("beginBanTime:");
    sb.append(this.beginBanTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("endBanTime:");
    sb.append(this.endBanTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("extra:");
    if (this.extra == null) {
      sb.append("null");
    } else {
      sb.append(this.extra);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CheckBannedInGroupResponseStandardSchemeFactory implements SchemeFactory {
    public CheckBannedInGroupResponseStandardScheme getScheme() {
      return new CheckBannedInGroupResponseStandardScheme();
    }
  }

  private static class CheckBannedInGroupResponseStandardScheme extends StandardScheme<CheckBannedInGroupResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CheckBannedInGroupResponse struct) throws org.apache.thrift.TException {
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
          case 2: // IS_BANNED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isBanned = iprot.readBool();
              struct.setIsBannedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BEGIN_BAN_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.beginBanTime = iprot.readI64();
              struct.setBeginBanTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // END_BAN_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.endBanTime = iprot.readI64();
              struct.setEndBanTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // EXTRA
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map154 = iprot.readMapBegin();
                struct.extra = new HashMap<String,String>(2*_map154.size);
                String _key155;
                String _val156;
                for (int _i157 = 0; _i157 < _map154.size; ++_i157)
                {
                  _key155 = iprot.readString();
                  _val156 = iprot.readString();
                  struct.extra.put(_key155, _val156);
                }
                iprot.readMapEnd();
              }
              struct.setExtraIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CheckBannedInGroupResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.base != null) {
        oprot.writeFieldBegin(BASE_FIELD_DESC);
        struct.base.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(IS_BANNED_FIELD_DESC);
      oprot.writeBool(struct.isBanned);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(BEGIN_BAN_TIME_FIELD_DESC);
      oprot.writeI64(struct.beginBanTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(END_BAN_TIME_FIELD_DESC);
      oprot.writeI64(struct.endBanTime);
      oprot.writeFieldEnd();
      if (struct.extra != null) {
        oprot.writeFieldBegin(EXTRA_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.extra.size()));
          for (Map.Entry<String, String> _iter158 : struct.extra.entrySet())
          {
            oprot.writeString(_iter158.getKey());
            oprot.writeString(_iter158.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CheckBannedInGroupResponseTupleSchemeFactory implements SchemeFactory {
    public CheckBannedInGroupResponseTupleScheme getScheme() {
      return new CheckBannedInGroupResponseTupleScheme();
    }
  }

  private static class CheckBannedInGroupResponseTupleScheme extends TupleScheme<CheckBannedInGroupResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CheckBannedInGroupResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBase()) {
        optionals.set(0);
      }
      if (struct.isSetIsBanned()) {
        optionals.set(1);
      }
      if (struct.isSetBeginBanTime()) {
        optionals.set(2);
      }
      if (struct.isSetEndBanTime()) {
        optionals.set(3);
      }
      if (struct.isSetExtra()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetBase()) {
        struct.base.write(oprot);
      }
      if (struct.isSetIsBanned()) {
        oprot.writeBool(struct.isBanned);
      }
      if (struct.isSetBeginBanTime()) {
        oprot.writeI64(struct.beginBanTime);
      }
      if (struct.isSetEndBanTime()) {
        oprot.writeI64(struct.endBanTime);
      }
      if (struct.isSetExtra()) {
        {
          oprot.writeI32(struct.extra.size());
          for (Map.Entry<String, String> _iter159 : struct.extra.entrySet())
          {
            oprot.writeString(_iter159.getKey());
            oprot.writeString(_iter159.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CheckBannedInGroupResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.base = new BaseResp();
        struct.base.read(iprot);
        struct.setBaseIsSet(true);
      }
      if (incoming.get(1)) {
        struct.isBanned = iprot.readBool();
        struct.setIsBannedIsSet(true);
      }
      if (incoming.get(2)) {
        struct.beginBanTime = iprot.readI64();
        struct.setBeginBanTimeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.endBanTime = iprot.readI64();
        struct.setEndBanTimeIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TMap _map160 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.extra = new HashMap<String,String>(2*_map160.size);
          String _key161;
          String _val162;
          for (int _i163 = 0; _i163 < _map160.size; ++_i163)
          {
            _key161 = iprot.readString();
            _val162 = iprot.readString();
            struct.extra.put(_key161, _val162);
          }
        }
        struct.setExtraIsSet(true);
      }
    }
  }

}

