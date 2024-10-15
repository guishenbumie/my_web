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
public class BatchBanUserInGroup implements org.apache.thrift.TBase<BatchBanUserInGroup, BatchBanUserInGroup._Fields>, java.io.Serializable, Cloneable, Comparable<BatchBanUserInGroup> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BatchBanUserInGroup");

  private static final org.apache.thrift.protocol.TField GROUP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("groupID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField UID_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("uidList", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField RELEASE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("releaseTime", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField SERVER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("serverID", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField EXTRA_FIELD_DESC = new org.apache.thrift.protocol.TField("extra", org.apache.thrift.protocol.TType.MAP, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BatchBanUserInGroupStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BatchBanUserInGroupTupleSchemeFactory());
  }

  public String groupID; // required
  public List<String> uidList; // required
  public long releaseTime; // required
  public String serverID; // required
  public Map<String,String> extra; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    GROUP_ID((short)1, "groupID"),
    UID_LIST((short)2, "uidList"),
    RELEASE_TIME((short)3, "releaseTime"),
    SERVER_ID((short)4, "serverID"),
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
        case 1: // GROUP_ID
          return GROUP_ID;
        case 2: // UID_LIST
          return UID_LIST;
        case 3: // RELEASE_TIME
          return RELEASE_TIME;
        case 4: // SERVER_ID
          return SERVER_ID;
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
  private static final int __RELEASETIME_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.GROUP_ID, new org.apache.thrift.meta_data.FieldMetaData("groupID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UID_LIST, new org.apache.thrift.meta_data.FieldMetaData("uidList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.RELEASE_TIME, new org.apache.thrift.meta_data.FieldMetaData("releaseTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SERVER_ID, new org.apache.thrift.meta_data.FieldMetaData("serverID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXTRA, new org.apache.thrift.meta_data.FieldMetaData("extra", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BatchBanUserInGroup.class, metaDataMap);
  }

  public BatchBanUserInGroup() {
  }

  public BatchBanUserInGroup(
    String groupID,
    List<String> uidList,
    long releaseTime,
    String serverID,
    Map<String,String> extra)
  {
    this();
    this.groupID = groupID;
    this.uidList = uidList;
    this.releaseTime = releaseTime;
    setReleaseTimeIsSet(true);
    this.serverID = serverID;
    this.extra = extra;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BatchBanUserInGroup(BatchBanUserInGroup other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetGroupID()) {
      this.groupID = other.groupID;
    }
    if (other.isSetUidList()) {
      List<String> __this__uidList = new ArrayList<String>(other.uidList);
      this.uidList = __this__uidList;
    }
    this.releaseTime = other.releaseTime;
    if (other.isSetServerID()) {
      this.serverID = other.serverID;
    }
    if (other.isSetExtra()) {
      Map<String,String> __this__extra = new HashMap<String,String>(other.extra);
      this.extra = __this__extra;
    }
  }

  public BatchBanUserInGroup deepCopy() {
    return new BatchBanUserInGroup(this);
  }

  @Override
  public void clear() {
    this.groupID = null;
    this.uidList = null;
    setReleaseTimeIsSet(false);
    this.releaseTime = 0;
    this.serverID = null;
    this.extra = null;
  }

  public String getGroupID() {
    return this.groupID;
  }

  public BatchBanUserInGroup setGroupID(String groupID) {
    this.groupID = groupID;
    return this;
  }

  public void unsetGroupID() {
    this.groupID = null;
  }

  /** Returns true if field groupID is set (has been assigned a value) and false otherwise */
  public boolean isSetGroupID() {
    return this.groupID != null;
  }

  public void setGroupIDIsSet(boolean value) {
    if (!value) {
      this.groupID = null;
    }
  }

  public int getUidListSize() {
    return (this.uidList == null) ? 0 : this.uidList.size();
  }

  public java.util.Iterator<String> getUidListIterator() {
    return (this.uidList == null) ? null : this.uidList.iterator();
  }

  public void addToUidList(String elem) {
    if (this.uidList == null) {
      this.uidList = new ArrayList<String>();
    }
    this.uidList.add(elem);
  }

  public List<String> getUidList() {
    return this.uidList;
  }

  public BatchBanUserInGroup setUidList(List<String> uidList) {
    this.uidList = uidList;
    return this;
  }

  public void unsetUidList() {
    this.uidList = null;
  }

  /** Returns true if field uidList is set (has been assigned a value) and false otherwise */
  public boolean isSetUidList() {
    return this.uidList != null;
  }

  public void setUidListIsSet(boolean value) {
    if (!value) {
      this.uidList = null;
    }
  }

  public long getReleaseTime() {
    return this.releaseTime;
  }

  public BatchBanUserInGroup setReleaseTime(long releaseTime) {
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

  public String getServerID() {
    return this.serverID;
  }

  public BatchBanUserInGroup setServerID(String serverID) {
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

  public BatchBanUserInGroup setExtra(Map<String,String> extra) {
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
    case GROUP_ID:
      if (value == null) {
        unsetGroupID();
      } else {
        setGroupID((String)value);
      }
      break;

    case UID_LIST:
      if (value == null) {
        unsetUidList();
      } else {
        setUidList((List<String>)value);
      }
      break;

    case RELEASE_TIME:
      if (value == null) {
        unsetReleaseTime();
      } else {
        setReleaseTime((Long)value);
      }
      break;

    case SERVER_ID:
      if (value == null) {
        unsetServerID();
      } else {
        setServerID((String)value);
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
    case GROUP_ID:
      return getGroupID();

    case UID_LIST:
      return getUidList();

    case RELEASE_TIME:
      return getReleaseTime();

    case SERVER_ID:
      return getServerID();

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
    case GROUP_ID:
      return isSetGroupID();
    case UID_LIST:
      return isSetUidList();
    case RELEASE_TIME:
      return isSetReleaseTime();
    case SERVER_ID:
      return isSetServerID();
    case EXTRA:
      return isSetExtra();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BatchBanUserInGroup)
      return this.equals((BatchBanUserInGroup)that);
    return false;
  }

  public boolean equals(BatchBanUserInGroup that) {
    if (that == null)
      return false;

    boolean this_present_groupID = true && this.isSetGroupID();
    boolean that_present_groupID = true && that.isSetGroupID();
    if (this_present_groupID || that_present_groupID) {
      if (!(this_present_groupID && that_present_groupID))
        return false;
      if (!this.groupID.equals(that.groupID))
        return false;
    }

    boolean this_present_uidList = true && this.isSetUidList();
    boolean that_present_uidList = true && that.isSetUidList();
    if (this_present_uidList || that_present_uidList) {
      if (!(this_present_uidList && that_present_uidList))
        return false;
      if (!this.uidList.equals(that.uidList))
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

    boolean this_present_serverID = true && this.isSetServerID();
    boolean that_present_serverID = true && that.isSetServerID();
    if (this_present_serverID || that_present_serverID) {
      if (!(this_present_serverID && that_present_serverID))
        return false;
      if (!this.serverID.equals(that.serverID))
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

    boolean present_groupID = true && (isSetGroupID());
    list.add(present_groupID);
    if (present_groupID)
      list.add(groupID);

    boolean present_uidList = true && (isSetUidList());
    list.add(present_uidList);
    if (present_uidList)
      list.add(uidList);

    boolean present_releaseTime = true;
    list.add(present_releaseTime);
    if (present_releaseTime)
      list.add(releaseTime);

    boolean present_serverID = true && (isSetServerID());
    list.add(present_serverID);
    if (present_serverID)
      list.add(serverID);

    boolean present_extra = true && (isSetExtra());
    list.add(present_extra);
    if (present_extra)
      list.add(extra);

    return list.hashCode();
  }

  @Override
  public int compareTo(BatchBanUserInGroup other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetGroupID()).compareTo(other.isSetGroupID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGroupID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.groupID, other.groupID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUidList()).compareTo(other.isSetUidList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUidList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uidList, other.uidList);
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
    StringBuilder sb = new StringBuilder("BatchBanUserInGroup(");
    boolean first = true;

    sb.append("groupID:");
    if (this.groupID == null) {
      sb.append("null");
    } else {
      sb.append(this.groupID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("uidList:");
    if (this.uidList == null) {
      sb.append("null");
    } else {
      sb.append(this.uidList);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("releaseTime:");
    sb.append(this.releaseTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("serverID:");
    if (this.serverID == null) {
      sb.append("null");
    } else {
      sb.append(this.serverID);
    }
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

  private static class BatchBanUserInGroupStandardSchemeFactory implements SchemeFactory {
    public BatchBanUserInGroupStandardScheme getScheme() {
      return new BatchBanUserInGroupStandardScheme();
    }
  }

  private static class BatchBanUserInGroupStandardScheme extends StandardScheme<BatchBanUserInGroup> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BatchBanUserInGroup struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // GROUP_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.groupID = iprot.readString();
              struct.setGroupIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // UID_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list112 = iprot.readListBegin();
                struct.uidList = new ArrayList<String>(_list112.size);
                String _elem113;
                for (int _i114 = 0; _i114 < _list112.size; ++_i114)
                {
                  _elem113 = iprot.readString();
                  struct.uidList.add(_elem113);
                }
                iprot.readListEnd();
              }
              struct.setUidListIsSet(true);
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
          case 4: // SERVER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.serverID = iprot.readString();
              struct.setServerIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // EXTRA
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map115 = iprot.readMapBegin();
                struct.extra = new HashMap<String,String>(2*_map115.size);
                String _key116;
                String _val117;
                for (int _i118 = 0; _i118 < _map115.size; ++_i118)
                {
                  _key116 = iprot.readString();
                  _val117 = iprot.readString();
                  struct.extra.put(_key116, _val117);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BatchBanUserInGroup struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.groupID != null) {
        oprot.writeFieldBegin(GROUP_ID_FIELD_DESC);
        oprot.writeString(struct.groupID);
        oprot.writeFieldEnd();
      }
      if (struct.uidList != null) {
        oprot.writeFieldBegin(UID_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.uidList.size()));
          for (String _iter119 : struct.uidList)
          {
            oprot.writeString(_iter119);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(RELEASE_TIME_FIELD_DESC);
      oprot.writeI64(struct.releaseTime);
      oprot.writeFieldEnd();
      if (struct.serverID != null) {
        oprot.writeFieldBegin(SERVER_ID_FIELD_DESC);
        oprot.writeString(struct.serverID);
        oprot.writeFieldEnd();
      }
      if (struct.extra != null) {
        oprot.writeFieldBegin(EXTRA_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.extra.size()));
          for (Map.Entry<String, String> _iter120 : struct.extra.entrySet())
          {
            oprot.writeString(_iter120.getKey());
            oprot.writeString(_iter120.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BatchBanUserInGroupTupleSchemeFactory implements SchemeFactory {
    public BatchBanUserInGroupTupleScheme getScheme() {
      return new BatchBanUserInGroupTupleScheme();
    }
  }

  private static class BatchBanUserInGroupTupleScheme extends TupleScheme<BatchBanUserInGroup> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BatchBanUserInGroup struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetGroupID()) {
        optionals.set(0);
      }
      if (struct.isSetUidList()) {
        optionals.set(1);
      }
      if (struct.isSetReleaseTime()) {
        optionals.set(2);
      }
      if (struct.isSetServerID()) {
        optionals.set(3);
      }
      if (struct.isSetExtra()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetGroupID()) {
        oprot.writeString(struct.groupID);
      }
      if (struct.isSetUidList()) {
        {
          oprot.writeI32(struct.uidList.size());
          for (String _iter121 : struct.uidList)
          {
            oprot.writeString(_iter121);
          }
        }
      }
      if (struct.isSetReleaseTime()) {
        oprot.writeI64(struct.releaseTime);
      }
      if (struct.isSetServerID()) {
        oprot.writeString(struct.serverID);
      }
      if (struct.isSetExtra()) {
        {
          oprot.writeI32(struct.extra.size());
          for (Map.Entry<String, String> _iter122 : struct.extra.entrySet())
          {
            oprot.writeString(_iter122.getKey());
            oprot.writeString(_iter122.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BatchBanUserInGroup struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.groupID = iprot.readString();
        struct.setGroupIDIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list123 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.uidList = new ArrayList<String>(_list123.size);
          String _elem124;
          for (int _i125 = 0; _i125 < _list123.size; ++_i125)
          {
            _elem124 = iprot.readString();
            struct.uidList.add(_elem124);
          }
        }
        struct.setUidListIsSet(true);
      }
      if (incoming.get(2)) {
        struct.releaseTime = iprot.readI64();
        struct.setReleaseTimeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.serverID = iprot.readString();
        struct.setServerIDIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TMap _map126 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.extra = new HashMap<String,String>(2*_map126.size);
          String _key127;
          String _val128;
          for (int _i129 = 0; _i129 < _map126.size; ++_i129)
          {
            _key127 = iprot.readString();
            _val128 = iprot.readString();
            struct.extra.put(_key127, _val128);
          }
        }
        struct.setExtraIsSet(true);
      }
    }
  }

}

