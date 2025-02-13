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
public class BanUser implements org.apache.thrift.TBase<BanUser, BanUser._Fields>, java.io.Serializable, Cloneable, Comparable<BanUser> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BanUser");

  private static final org.apache.thrift.protocol.TField UID_FIELD_DESC = new org.apache.thrift.protocol.TField("uid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField BANNED_UID_FIELD_DESC = new org.apache.thrift.protocol.TField("bannedUid", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField RELEASE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("releaseTime", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField EXTRA_FIELD_DESC = new org.apache.thrift.protocol.TField("extra", org.apache.thrift.protocol.TType.MAP, (short)4);
  private static final org.apache.thrift.protocol.TField SERVER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("serverID", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BanUserStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BanUserTupleSchemeFactory());
  }

  public String uid; // required
  public String bannedUid; // required
  public long releaseTime; // required
  public Map<String,String> extra; // required
  public String serverID; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UID((short)1, "uid"),
    BANNED_UID((short)2, "bannedUid"),
    RELEASE_TIME((short)3, "releaseTime"),
    EXTRA((short)4, "extra"),
    SERVER_ID((short)5, "serverID");

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
        case 1: // UID
          return UID;
        case 2: // BANNED_UID
          return BANNED_UID;
        case 3: // RELEASE_TIME
          return RELEASE_TIME;
        case 4: // EXTRA
          return EXTRA;
        case 5: // SERVER_ID
          return SERVER_ID;
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
  private static final int __RELEASETIME_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UID, new org.apache.thrift.meta_data.FieldMetaData("uid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BANNED_UID, new org.apache.thrift.meta_data.FieldMetaData("bannedUid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RELEASE_TIME, new org.apache.thrift.meta_data.FieldMetaData("releaseTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.EXTRA, new org.apache.thrift.meta_data.FieldMetaData("extra", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.SERVER_ID, new org.apache.thrift.meta_data.FieldMetaData("serverID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BanUser.class, metaDataMap);
  }

  public BanUser() {
  }

  public BanUser(
    String uid,
    String bannedUid,
    long releaseTime,
    Map<String,String> extra,
    String serverID)
  {
    this();
    this.uid = uid;
    this.bannedUid = bannedUid;
    this.releaseTime = releaseTime;
    setReleaseTimeIsSet(true);
    this.extra = extra;
    this.serverID = serverID;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BanUser(BanUser other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetUid()) {
      this.uid = other.uid;
    }
    if (other.isSetBannedUid()) {
      this.bannedUid = other.bannedUid;
    }
    this.releaseTime = other.releaseTime;
    if (other.isSetExtra()) {
      Map<String,String> __this__extra = new HashMap<String,String>(other.extra);
      this.extra = __this__extra;
    }
    if (other.isSetServerID()) {
      this.serverID = other.serverID;
    }
  }

  public BanUser deepCopy() {
    return new BanUser(this);
  }

  @Override
  public void clear() {
    this.uid = null;
    this.bannedUid = null;
    setReleaseTimeIsSet(false);
    this.releaseTime = 0;
    this.extra = null;
    this.serverID = null;
  }

  public String getUid() {
    return this.uid;
  }

  public BanUser setUid(String uid) {
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

  public String getBannedUid() {
    return this.bannedUid;
  }

  public BanUser setBannedUid(String bannedUid) {
    this.bannedUid = bannedUid;
    return this;
  }

  public void unsetBannedUid() {
    this.bannedUid = null;
  }

  /** Returns true if field bannedUid is set (has been assigned a value) and false otherwise */
  public boolean isSetBannedUid() {
    return this.bannedUid != null;
  }

  public void setBannedUidIsSet(boolean value) {
    if (!value) {
      this.bannedUid = null;
    }
  }

  public long getReleaseTime() {
    return this.releaseTime;
  }

  public BanUser setReleaseTime(long releaseTime) {
    this.releaseTime = releaseTime;
    setReleaseTimeIsSet(true);
    return this;
  }

  public void unsetReleaseTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RELEASETIME_ISSET_ID);
  }

  /** Returns true if field releaseTime is set (has been assigned a value) and false otherwise */
  public boolean isSetReleaseTime() {
    return EncodingUtils.testBit(__isset_bitfield, __RELEASETIME_ISSET_ID);
  }

  public void setReleaseTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RELEASETIME_ISSET_ID, value);
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

  public BanUser setExtra(Map<String,String> extra) {
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

  public String getServerID() {
    return this.serverID;
  }

  public BanUser setServerID(String serverID) {
    this.serverID = serverID;
    return this;
  }

  public void unsetServerID() {
    this.serverID = null;
  }

  /** Returns true if field serverID is set (has been assigned a value) and false otherwise */
  public boolean isSetServerID() {
    return this.serverID != null;
  }

  public void setServerIDIsSet(boolean value) {
    if (!value) {
      this.serverID = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case UID:
      if (value == null) {
        unsetUid();
      } else {
        setUid((String)value);
      }
      break;

    case BANNED_UID:
      if (value == null) {
        unsetBannedUid();
      } else {
        setBannedUid((String)value);
      }
      break;

    case RELEASE_TIME:
      if (value == null) {
        unsetReleaseTime();
      } else {
        setReleaseTime((Long)value);
      }
      break;

    case EXTRA:
      if (value == null) {
        unsetExtra();
      } else {
        setExtra((Map<String,String>)value);
      }
      break;

    case SERVER_ID:
      if (value == null) {
        unsetServerID();
      } else {
        setServerID((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case UID:
      return getUid();

    case BANNED_UID:
      return getBannedUid();

    case RELEASE_TIME:
      return getReleaseTime();

    case EXTRA:
      return getExtra();

    case SERVER_ID:
      return getServerID();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case UID:
      return isSetUid();
    case BANNED_UID:
      return isSetBannedUid();
    case RELEASE_TIME:
      return isSetReleaseTime();
    case EXTRA:
      return isSetExtra();
    case SERVER_ID:
      return isSetServerID();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BanUser)
      return this.equals((BanUser)that);
    return false;
  }

  public boolean equals(BanUser that) {
    if (that == null)
      return false;

    boolean this_present_uid = true && this.isSetUid();
    boolean that_present_uid = true && that.isSetUid();
    if (this_present_uid || that_present_uid) {
      if (!(this_present_uid && that_present_uid))
        return false;
      if (!this.uid.equals(that.uid))
        return false;
    }

    boolean this_present_bannedUid = true && this.isSetBannedUid();
    boolean that_present_bannedUid = true && that.isSetBannedUid();
    if (this_present_bannedUid || that_present_bannedUid) {
      if (!(this_present_bannedUid && that_present_bannedUid))
        return false;
      if (!this.bannedUid.equals(that.bannedUid))
        return false;
    }

    boolean this_present_releaseTime = true;
    boolean that_present_releaseTime = true;
    if (this_present_releaseTime || that_present_releaseTime) {
      if (!(this_present_releaseTime && that_present_releaseTime))
        return false;
      if (this.releaseTime != that.releaseTime)
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

    boolean this_present_serverID = true && this.isSetServerID();
    boolean that_present_serverID = true && that.isSetServerID();
    if (this_present_serverID || that_present_serverID) {
      if (!(this_present_serverID && that_present_serverID))
        return false;
      if (!this.serverID.equals(that.serverID))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_uid = true && (isSetUid());
    list.add(present_uid);
    if (present_uid)
      list.add(uid);

    boolean present_bannedUid = true && (isSetBannedUid());
    list.add(present_bannedUid);
    if (present_bannedUid)
      list.add(bannedUid);

    boolean present_releaseTime = true;
    list.add(present_releaseTime);
    if (present_releaseTime)
      list.add(releaseTime);

    boolean present_extra = true && (isSetExtra());
    list.add(present_extra);
    if (present_extra)
      list.add(extra);

    boolean present_serverID = true && (isSetServerID());
    list.add(present_serverID);
    if (present_serverID)
      list.add(serverID);

    return list.hashCode();
  }

  @Override
  public int compareTo(BanUser other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = Boolean.valueOf(isSetBannedUid()).compareTo(other.isSetBannedUid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBannedUid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bannedUid, other.bannedUid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReleaseTime()).compareTo(other.isSetReleaseTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReleaseTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.releaseTime, other.releaseTime);
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
    lastComparison = Boolean.valueOf(isSetServerID()).compareTo(other.isSetServerID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServerID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serverID, other.serverID);
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
    StringBuilder sb = new StringBuilder("BanUser(");
    boolean first = true;

    sb.append("uid:");
    if (this.uid == null) {
      sb.append("null");
    } else {
      sb.append(this.uid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("bannedUid:");
    if (this.bannedUid == null) {
      sb.append("null");
    } else {
      sb.append(this.bannedUid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("releaseTime:");
    sb.append(this.releaseTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("extra:");
    if (this.extra == null) {
      sb.append("null");
    } else {
      sb.append(this.extra);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("serverID:");
    if (this.serverID == null) {
      sb.append("null");
    } else {
      sb.append(this.serverID);
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

  private static class BanUserStandardSchemeFactory implements SchemeFactory {
    public BanUserStandardScheme getScheme() {
      return new BanUserStandardScheme();
    }
  }

  private static class BanUserStandardScheme extends StandardScheme<BanUser> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BanUser struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // UID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.uid = iprot.readString();
              struct.setUidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BANNED_UID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.bannedUid = iprot.readString();
              struct.setBannedUidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RELEASE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.releaseTime = iprot.readI64();
              struct.setReleaseTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EXTRA
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map40 = iprot.readMapBegin();
                struct.extra = new HashMap<String,String>(2*_map40.size);
                String _key41;
                String _val42;
                for (int _i43 = 0; _i43 < _map40.size; ++_i43)
                {
                  _key41 = iprot.readString();
                  _val42 = iprot.readString();
                  struct.extra.put(_key41, _val42);
                }
                iprot.readMapEnd();
              }
              struct.setExtraIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SERVER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.serverID = iprot.readString();
              struct.setServerIDIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BanUser struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.uid != null) {
        oprot.writeFieldBegin(UID_FIELD_DESC);
        oprot.writeString(struct.uid);
        oprot.writeFieldEnd();
      }
      if (struct.bannedUid != null) {
        oprot.writeFieldBegin(BANNED_UID_FIELD_DESC);
        oprot.writeString(struct.bannedUid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(RELEASE_TIME_FIELD_DESC);
      oprot.writeI64(struct.releaseTime);
      oprot.writeFieldEnd();
      if (struct.extra != null) {
        oprot.writeFieldBegin(EXTRA_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.extra.size()));
          for (Map.Entry<String, String> _iter44 : struct.extra.entrySet())
          {
            oprot.writeString(_iter44.getKey());
            oprot.writeString(_iter44.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.serverID != null) {
        oprot.writeFieldBegin(SERVER_ID_FIELD_DESC);
        oprot.writeString(struct.serverID);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BanUserTupleSchemeFactory implements SchemeFactory {
    public BanUserTupleScheme getScheme() {
      return new BanUserTupleScheme();
    }
  }

  private static class BanUserTupleScheme extends TupleScheme<BanUser> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BanUser struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUid()) {
        optionals.set(0);
      }
      if (struct.isSetBannedUid()) {
        optionals.set(1);
      }
      if (struct.isSetReleaseTime()) {
        optionals.set(2);
      }
      if (struct.isSetExtra()) {
        optionals.set(3);
      }
      if (struct.isSetServerID()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetUid()) {
        oprot.writeString(struct.uid);
      }
      if (struct.isSetBannedUid()) {
        oprot.writeString(struct.bannedUid);
      }
      if (struct.isSetReleaseTime()) {
        oprot.writeI64(struct.releaseTime);
      }
      if (struct.isSetExtra()) {
        {
          oprot.writeI32(struct.extra.size());
          for (Map.Entry<String, String> _iter45 : struct.extra.entrySet())
          {
            oprot.writeString(_iter45.getKey());
            oprot.writeString(_iter45.getValue());
          }
        }
      }
      if (struct.isSetServerID()) {
        oprot.writeString(struct.serverID);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BanUser struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.uid = iprot.readString();
        struct.setUidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.bannedUid = iprot.readString();
        struct.setBannedUidIsSet(true);
      }
      if (incoming.get(2)) {
        struct.releaseTime = iprot.readI64();
        struct.setReleaseTimeIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TMap _map46 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.extra = new HashMap<String,String>(2*_map46.size);
          String _key47;
          String _val48;
          for (int _i49 = 0; _i49 < _map46.size; ++_i49)
          {
            _key47 = iprot.readString();
            _val48 = iprot.readString();
            struct.extra.put(_key47, _val48);
          }
        }
        struct.setExtraIsSet(true);
      }
      if (incoming.get(4)) {
        struct.serverID = iprot.readString();
        struct.setServerIDIsSet(true);
      }
    }
  }

}

