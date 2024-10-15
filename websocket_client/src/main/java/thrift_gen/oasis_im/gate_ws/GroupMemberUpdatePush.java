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
public class GroupMemberUpdatePush implements org.apache.thrift.TBase<GroupMemberUpdatePush, GroupMemberUpdatePush._Fields>, java.io.Serializable, Cloneable, Comparable<GroupMemberUpdatePush> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GroupMemberUpdatePush");

  private static final org.apache.thrift.protocol.TField GROUP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("groupId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField UPDATE_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("updateList", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField ADD_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("addList", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField REMOVED_FIELD_DESC = new org.apache.thrift.protocol.TField("removed", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField MEMBER_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("memberCount", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GroupMemberUpdatePushStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GroupMemberUpdatePushTupleSchemeFactory());
  }

  public String groupId; // required
  public List<thrift_gen.oasis_im.rpc.ModifyGroupMemberInfo> updateList; // required
  public List<thrift_gen.oasis_im.rpc.GroupMemberFullInfo> addList; // required
  public List<String> removed; // required
  public int memberCount; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    GROUP_ID((short)1, "groupId"),
    UPDATE_LIST((short)2, "updateList"),
    ADD_LIST((short)3, "addList"),
    REMOVED((short)4, "removed"),
    MEMBER_COUNT((short)5, "memberCount");

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
        case 2: // UPDATE_LIST
          return UPDATE_LIST;
        case 3: // ADD_LIST
          return ADD_LIST;
        case 4: // REMOVED
          return REMOVED;
        case 5: // MEMBER_COUNT
          return MEMBER_COUNT;
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
  private static final int __MEMBERCOUNT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.GROUP_ID, new org.apache.thrift.meta_data.FieldMetaData("groupId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UPDATE_LIST, new org.apache.thrift.meta_data.FieldMetaData("updateList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, thrift_gen.oasis_im.rpc.ModifyGroupMemberInfo.class))));
    tmpMap.put(_Fields.ADD_LIST, new org.apache.thrift.meta_data.FieldMetaData("addList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, thrift_gen.oasis_im.rpc.GroupMemberFullInfo.class))));
    tmpMap.put(_Fields.REMOVED, new org.apache.thrift.meta_data.FieldMetaData("removed", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.MEMBER_COUNT, new org.apache.thrift.meta_data.FieldMetaData("memberCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GroupMemberUpdatePush.class, metaDataMap);
  }

  public GroupMemberUpdatePush() {
  }

  public GroupMemberUpdatePush(
    String groupId,
    List<thrift_gen.oasis_im.rpc.ModifyGroupMemberInfo> updateList,
    List<thrift_gen.oasis_im.rpc.GroupMemberFullInfo> addList,
    List<String> removed,
    int memberCount)
  {
    this();
    this.groupId = groupId;
    this.updateList = updateList;
    this.addList = addList;
    this.removed = removed;
    this.memberCount = memberCount;
    setMemberCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GroupMemberUpdatePush(GroupMemberUpdatePush other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetGroupId()) {
      this.groupId = other.groupId;
    }
    if (other.isSetUpdateList()) {
      List<thrift_gen.oasis_im.rpc.ModifyGroupMemberInfo> __this__updateList = new ArrayList<thrift_gen.oasis_im.rpc.ModifyGroupMemberInfo>(other.updateList.size());
      for (thrift_gen.oasis_im.rpc.ModifyGroupMemberInfo other_element : other.updateList) {
        __this__updateList.add(new thrift_gen.oasis_im.rpc.ModifyGroupMemberInfo(other_element));
      }
      this.updateList = __this__updateList;
    }
    if (other.isSetAddList()) {
      List<thrift_gen.oasis_im.rpc.GroupMemberFullInfo> __this__addList = new ArrayList<thrift_gen.oasis_im.rpc.GroupMemberFullInfo>(other.addList.size());
      for (thrift_gen.oasis_im.rpc.GroupMemberFullInfo other_element : other.addList) {
        __this__addList.add(new thrift_gen.oasis_im.rpc.GroupMemberFullInfo(other_element));
      }
      this.addList = __this__addList;
    }
    if (other.isSetRemoved()) {
      List<String> __this__removed = new ArrayList<String>(other.removed);
      this.removed = __this__removed;
    }
    this.memberCount = other.memberCount;
  }

  public GroupMemberUpdatePush deepCopy() {
    return new GroupMemberUpdatePush(this);
  }

  @Override
  public void clear() {
    this.groupId = null;
    this.updateList = null;
    this.addList = null;
    this.removed = null;
    setMemberCountIsSet(false);
    this.memberCount = 0;
  }

  public String getGroupId() {
    return this.groupId;
  }

  public GroupMemberUpdatePush setGroupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  public void unsetGroupId() {
    this.groupId = null;
  }

  /** Returns true if field groupId is set (has been assigned a value) and false otherwise */
  public boolean isSetGroupId() {
    return this.groupId != null;
  }

  public void setGroupIdIsSet(boolean value) {
    if (!value) {
      this.groupId = null;
    }
  }

  public int getUpdateListSize() {
    return (this.updateList == null) ? 0 : this.updateList.size();
  }

  public java.util.Iterator<thrift_gen.oasis_im.rpc.ModifyGroupMemberInfo> getUpdateListIterator() {
    return (this.updateList == null) ? null : this.updateList.iterator();
  }

  public void addToUpdateList(thrift_gen.oasis_im.rpc.ModifyGroupMemberInfo elem) {
    if (this.updateList == null) {
      this.updateList = new ArrayList<thrift_gen.oasis_im.rpc.ModifyGroupMemberInfo>();
    }
    this.updateList.add(elem);
  }

  public List<thrift_gen.oasis_im.rpc.ModifyGroupMemberInfo> getUpdateList() {
    return this.updateList;
  }

  public GroupMemberUpdatePush setUpdateList(List<thrift_gen.oasis_im.rpc.ModifyGroupMemberInfo> updateList) {
    this.updateList = updateList;
    return this;
  }

  public void unsetUpdateList() {
    this.updateList = null;
  }

  /** Returns true if field updateList is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdateList() {
    return this.updateList != null;
  }

  public void setUpdateListIsSet(boolean value) {
    if (!value) {
      this.updateList = null;
    }
  }

  public int getAddListSize() {
    return (this.addList == null) ? 0 : this.addList.size();
  }

  public java.util.Iterator<thrift_gen.oasis_im.rpc.GroupMemberFullInfo> getAddListIterator() {
    return (this.addList == null) ? null : this.addList.iterator();
  }

  public void addToAddList(thrift_gen.oasis_im.rpc.GroupMemberFullInfo elem) {
    if (this.addList == null) {
      this.addList = new ArrayList<thrift_gen.oasis_im.rpc.GroupMemberFullInfo>();
    }
    this.addList.add(elem);
  }

  public List<thrift_gen.oasis_im.rpc.GroupMemberFullInfo> getAddList() {
    return this.addList;
  }

  public GroupMemberUpdatePush setAddList(List<thrift_gen.oasis_im.rpc.GroupMemberFullInfo> addList) {
    this.addList = addList;
    return this;
  }

  public void unsetAddList() {
    this.addList = null;
  }

  /** Returns true if field addList is set (has been assigned a value) and false otherwise */
  public boolean isSetAddList() {
    return this.addList != null;
  }

  public void setAddListIsSet(boolean value) {
    if (!value) {
      this.addList = null;
    }
  }

  public int getRemovedSize() {
    return (this.removed == null) ? 0 : this.removed.size();
  }

  public java.util.Iterator<String> getRemovedIterator() {
    return (this.removed == null) ? null : this.removed.iterator();
  }

  public void addToRemoved(String elem) {
    if (this.removed == null) {
      this.removed = new ArrayList<String>();
    }
    this.removed.add(elem);
  }

  public List<String> getRemoved() {
    return this.removed;
  }

  public GroupMemberUpdatePush setRemoved(List<String> removed) {
    this.removed = removed;
    return this;
  }

  public void unsetRemoved() {
    this.removed = null;
  }

  /** Returns true if field removed is set (has been assigned a value) and false otherwise */
  public boolean isSetRemoved() {
    return this.removed != null;
  }

  public void setRemovedIsSet(boolean value) {
    if (!value) {
      this.removed = null;
    }
  }

  public int getMemberCount() {
    return this.memberCount;
  }

  public GroupMemberUpdatePush setMemberCount(int memberCount) {
    this.memberCount = memberCount;
    setMemberCountIsSet(true);
    return this;
  }

  public void unsetMemberCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MEMBERCOUNT_ISSET_ID);
  }

  /** Returns true if field memberCount is set (has been assigned a value) and false otherwise */
  public boolean isSetMemberCount() {
    return EncodingUtils.testBit(__isset_bitfield, __MEMBERCOUNT_ISSET_ID);
  }

  public void setMemberCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MEMBERCOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case GROUP_ID:
      if (value == null) {
        unsetGroupId();
      } else {
        setGroupId((String)value);
      }
      break;

    case UPDATE_LIST:
      if (value == null) {
        unsetUpdateList();
      } else {
        setUpdateList((List<thrift_gen.oasis_im.rpc.ModifyGroupMemberInfo>)value);
      }
      break;

    case ADD_LIST:
      if (value == null) {
        unsetAddList();
      } else {
        setAddList((List<thrift_gen.oasis_im.rpc.GroupMemberFullInfo>)value);
      }
      break;

    case REMOVED:
      if (value == null) {
        unsetRemoved();
      } else {
        setRemoved((List<String>)value);
      }
      break;

    case MEMBER_COUNT:
      if (value == null) {
        unsetMemberCount();
      } else {
        setMemberCount((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case GROUP_ID:
      return getGroupId();

    case UPDATE_LIST:
      return getUpdateList();

    case ADD_LIST:
      return getAddList();

    case REMOVED:
      return getRemoved();

    case MEMBER_COUNT:
      return getMemberCount();

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
      return isSetGroupId();
    case UPDATE_LIST:
      return isSetUpdateList();
    case ADD_LIST:
      return isSetAddList();
    case REMOVED:
      return isSetRemoved();
    case MEMBER_COUNT:
      return isSetMemberCount();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GroupMemberUpdatePush)
      return this.equals((GroupMemberUpdatePush)that);
    return false;
  }

  public boolean equals(GroupMemberUpdatePush that) {
    if (that == null)
      return false;

    boolean this_present_groupId = true && this.isSetGroupId();
    boolean that_present_groupId = true && that.isSetGroupId();
    if (this_present_groupId || that_present_groupId) {
      if (!(this_present_groupId && that_present_groupId))
        return false;
      if (!this.groupId.equals(that.groupId))
        return false;
    }

    boolean this_present_updateList = true && this.isSetUpdateList();
    boolean that_present_updateList = true && that.isSetUpdateList();
    if (this_present_updateList || that_present_updateList) {
      if (!(this_present_updateList && that_present_updateList))
        return false;
      if (!this.updateList.equals(that.updateList))
        return false;
    }

    boolean this_present_addList = true && this.isSetAddList();
    boolean that_present_addList = true && that.isSetAddList();
    if (this_present_addList || that_present_addList) {
      if (!(this_present_addList && that_present_addList))
        return false;
      if (!this.addList.equals(that.addList))
        return false;
    }

    boolean this_present_removed = true && this.isSetRemoved();
    boolean that_present_removed = true && that.isSetRemoved();
    if (this_present_removed || that_present_removed) {
      if (!(this_present_removed && that_present_removed))
        return false;
      if (!this.removed.equals(that.removed))
        return false;
    }

    boolean this_present_memberCount = true;
    boolean that_present_memberCount = true;
    if (this_present_memberCount || that_present_memberCount) {
      if (!(this_present_memberCount && that_present_memberCount))
        return false;
      if (this.memberCount != that.memberCount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_groupId = true && (isSetGroupId());
    list.add(present_groupId);
    if (present_groupId)
      list.add(groupId);

    boolean present_updateList = true && (isSetUpdateList());
    list.add(present_updateList);
    if (present_updateList)
      list.add(updateList);

    boolean present_addList = true && (isSetAddList());
    list.add(present_addList);
    if (present_addList)
      list.add(addList);

    boolean present_removed = true && (isSetRemoved());
    list.add(present_removed);
    if (present_removed)
      list.add(removed);

    boolean present_memberCount = true;
    list.add(present_memberCount);
    if (present_memberCount)
      list.add(memberCount);

    return list.hashCode();
  }

  @Override
  public int compareTo(GroupMemberUpdatePush other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetGroupId()).compareTo(other.isSetGroupId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGroupId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.groupId, other.groupId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUpdateList()).compareTo(other.isSetUpdateList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdateList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updateList, other.updateList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAddList()).compareTo(other.isSetAddList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAddList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.addList, other.addList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRemoved()).compareTo(other.isSetRemoved());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRemoved()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.removed, other.removed);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMemberCount()).compareTo(other.isSetMemberCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMemberCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.memberCount, other.memberCount);
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
    StringBuilder sb = new StringBuilder("GroupMemberUpdatePush(");
    boolean first = true;

    sb.append("groupId:");
    if (this.groupId == null) {
      sb.append("null");
    } else {
      sb.append(this.groupId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("updateList:");
    if (this.updateList == null) {
      sb.append("null");
    } else {
      sb.append(this.updateList);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("addList:");
    if (this.addList == null) {
      sb.append("null");
    } else {
      sb.append(this.addList);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("removed:");
    if (this.removed == null) {
      sb.append("null");
    } else {
      sb.append(this.removed);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("memberCount:");
    sb.append(this.memberCount);
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

  private static class GroupMemberUpdatePushStandardSchemeFactory implements SchemeFactory {
    public GroupMemberUpdatePushStandardScheme getScheme() {
      return new GroupMemberUpdatePushStandardScheme();
    }
  }

  private static class GroupMemberUpdatePushStandardScheme extends StandardScheme<GroupMemberUpdatePush> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GroupMemberUpdatePush struct) throws org.apache.thrift.TException {
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
              struct.groupId = iprot.readString();
              struct.setGroupIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // UPDATE_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list160 = iprot.readListBegin();
                struct.updateList = new ArrayList<thrift_gen.oasis_im.rpc.ModifyGroupMemberInfo>(_list160.size);
                thrift_gen.oasis_im.rpc.ModifyGroupMemberInfo _elem161;
                for (int _i162 = 0; _i162 < _list160.size; ++_i162)
                {
                  _elem161 = new thrift_gen.oasis_im.rpc.ModifyGroupMemberInfo();
                  _elem161.read(iprot);
                  struct.updateList.add(_elem161);
                }
                iprot.readListEnd();
              }
              struct.setUpdateListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ADD_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list163 = iprot.readListBegin();
                struct.addList = new ArrayList<thrift_gen.oasis_im.rpc.GroupMemberFullInfo>(_list163.size);
                thrift_gen.oasis_im.rpc.GroupMemberFullInfo _elem164;
                for (int _i165 = 0; _i165 < _list163.size; ++_i165)
                {
                  _elem164 = new thrift_gen.oasis_im.rpc.GroupMemberFullInfo();
                  _elem164.read(iprot);
                  struct.addList.add(_elem164);
                }
                iprot.readListEnd();
              }
              struct.setAddListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // REMOVED
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list166 = iprot.readListBegin();
                struct.removed = new ArrayList<String>(_list166.size);
                String _elem167;
                for (int _i168 = 0; _i168 < _list166.size; ++_i168)
                {
                  _elem167 = iprot.readString();
                  struct.removed.add(_elem167);
                }
                iprot.readListEnd();
              }
              struct.setRemovedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MEMBER_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.memberCount = iprot.readI32();
              struct.setMemberCountIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GroupMemberUpdatePush struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.groupId != null) {
        oprot.writeFieldBegin(GROUP_ID_FIELD_DESC);
        oprot.writeString(struct.groupId);
        oprot.writeFieldEnd();
      }
      if (struct.updateList != null) {
        oprot.writeFieldBegin(UPDATE_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.updateList.size()));
          for (thrift_gen.oasis_im.rpc.ModifyGroupMemberInfo _iter169 : struct.updateList)
          {
            _iter169.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.addList != null) {
        oprot.writeFieldBegin(ADD_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.addList.size()));
          for (thrift_gen.oasis_im.rpc.GroupMemberFullInfo _iter170 : struct.addList)
          {
            _iter170.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.removed != null) {
        oprot.writeFieldBegin(REMOVED_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.removed.size()));
          for (String _iter171 : struct.removed)
          {
            oprot.writeString(_iter171);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(MEMBER_COUNT_FIELD_DESC);
      oprot.writeI32(struct.memberCount);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GroupMemberUpdatePushTupleSchemeFactory implements SchemeFactory {
    public GroupMemberUpdatePushTupleScheme getScheme() {
      return new GroupMemberUpdatePushTupleScheme();
    }
  }

  private static class GroupMemberUpdatePushTupleScheme extends TupleScheme<GroupMemberUpdatePush> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GroupMemberUpdatePush struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetGroupId()) {
        optionals.set(0);
      }
      if (struct.isSetUpdateList()) {
        optionals.set(1);
      }
      if (struct.isSetAddList()) {
        optionals.set(2);
      }
      if (struct.isSetRemoved()) {
        optionals.set(3);
      }
      if (struct.isSetMemberCount()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetGroupId()) {
        oprot.writeString(struct.groupId);
      }
      if (struct.isSetUpdateList()) {
        {
          oprot.writeI32(struct.updateList.size());
          for (thrift_gen.oasis_im.rpc.ModifyGroupMemberInfo _iter172 : struct.updateList)
          {
            _iter172.write(oprot);
          }
        }
      }
      if (struct.isSetAddList()) {
        {
          oprot.writeI32(struct.addList.size());
          for (thrift_gen.oasis_im.rpc.GroupMemberFullInfo _iter173 : struct.addList)
          {
            _iter173.write(oprot);
          }
        }
      }
      if (struct.isSetRemoved()) {
        {
          oprot.writeI32(struct.removed.size());
          for (String _iter174 : struct.removed)
          {
            oprot.writeString(_iter174);
          }
        }
      }
      if (struct.isSetMemberCount()) {
        oprot.writeI32(struct.memberCount);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GroupMemberUpdatePush struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.groupId = iprot.readString();
        struct.setGroupIdIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list175 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.updateList = new ArrayList<thrift_gen.oasis_im.rpc.ModifyGroupMemberInfo>(_list175.size);
          thrift_gen.oasis_im.rpc.ModifyGroupMemberInfo _elem176;
          for (int _i177 = 0; _i177 < _list175.size; ++_i177)
          {
            _elem176 = new thrift_gen.oasis_im.rpc.ModifyGroupMemberInfo();
            _elem176.read(iprot);
            struct.updateList.add(_elem176);
          }
        }
        struct.setUpdateListIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list178 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.addList = new ArrayList<thrift_gen.oasis_im.rpc.GroupMemberFullInfo>(_list178.size);
          thrift_gen.oasis_im.rpc.GroupMemberFullInfo _elem179;
          for (int _i180 = 0; _i180 < _list178.size; ++_i180)
          {
            _elem179 = new thrift_gen.oasis_im.rpc.GroupMemberFullInfo();
            _elem179.read(iprot);
            struct.addList.add(_elem179);
          }
        }
        struct.setAddListIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list181 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.removed = new ArrayList<String>(_list181.size);
          String _elem182;
          for (int _i183 = 0; _i183 < _list181.size; ++_i183)
          {
            _elem182 = iprot.readString();
            struct.removed.add(_elem182);
          }
        }
        struct.setRemovedIsSet(true);
      }
      if (incoming.get(4)) {
        struct.memberCount = iprot.readI32();
        struct.setMemberCountIsSet(true);
      }
    }
  }

}

