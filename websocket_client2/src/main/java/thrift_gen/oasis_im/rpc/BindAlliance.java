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
public class BindAlliance implements org.apache.thrift.TBase<BindAlliance, BindAlliance._Fields>, java.io.Serializable, Cloneable, Comparable<BindAlliance> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BindAlliance");

  private static final org.apache.thrift.protocol.TField UID_FIELD_DESC = new org.apache.thrift.protocol.TField("uid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ALLIANCE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("allianceId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField GROUP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("groupId", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField MEMBERS_FIELD_DESC = new org.apache.thrift.protocol.TField("members", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BindAllianceStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BindAllianceTupleSchemeFactory());
  }

  public String uid; // required
  public String allianceId; // required
  public String groupId; // required
  public List<String> members; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UID((short)1, "uid"),
    ALLIANCE_ID((short)2, "allianceId"),
    GROUP_ID((short)3, "groupId"),
    MEMBERS((short)4, "members");

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
        case 2: // ALLIANCE_ID
          return ALLIANCE_ID;
        case 3: // GROUP_ID
          return GROUP_ID;
        case 4: // MEMBERS
          return MEMBERS;
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
    tmpMap.put(_Fields.UID, new org.apache.thrift.meta_data.FieldMetaData("uid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ALLIANCE_ID, new org.apache.thrift.meta_data.FieldMetaData("allianceId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GROUP_ID, new org.apache.thrift.meta_data.FieldMetaData("groupId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MEMBERS, new org.apache.thrift.meta_data.FieldMetaData("members", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BindAlliance.class, metaDataMap);
  }

  public BindAlliance() {
  }

  public BindAlliance(
    String uid,
    String allianceId,
    String groupId,
    List<String> members)
  {
    this();
    this.uid = uid;
    this.allianceId = allianceId;
    this.groupId = groupId;
    this.members = members;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BindAlliance(BindAlliance other) {
    if (other.isSetUid()) {
      this.uid = other.uid;
    }
    if (other.isSetAllianceId()) {
      this.allianceId = other.allianceId;
    }
    if (other.isSetGroupId()) {
      this.groupId = other.groupId;
    }
    if (other.isSetMembers()) {
      List<String> __this__members = new ArrayList<String>(other.members);
      this.members = __this__members;
    }
  }

  public BindAlliance deepCopy() {
    return new BindAlliance(this);
  }

  @Override
  public void clear() {
    this.uid = null;
    this.allianceId = null;
    this.groupId = null;
    this.members = null;
  }

  public String getUid() {
    return this.uid;
  }

  public BindAlliance setUid(String uid) {
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

  public String getAllianceId() {
    return this.allianceId;
  }

  public BindAlliance setAllianceId(String allianceId) {
    this.allianceId = allianceId;
    return this;
  }

  public void unsetAllianceId() {
    this.allianceId = null;
  }

  /** Returns true if field allianceId is set (has been assigned a value) and false otherwise */
  public boolean isSetAllianceId() {
    return this.allianceId != null;
  }

  public void setAllianceIdIsSet(boolean value) {
    if (!value) {
      this.allianceId = null;
    }
  }

  public String getGroupId() {
    return this.groupId;
  }

  public BindAlliance setGroupId(String groupId) {
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

  public int getMembersSize() {
    return (this.members == null) ? 0 : this.members.size();
  }

  public java.util.Iterator<String> getMembersIterator() {
    return (this.members == null) ? null : this.members.iterator();
  }

  public void addToMembers(String elem) {
    if (this.members == null) {
      this.members = new ArrayList<String>();
    }
    this.members.add(elem);
  }

  public List<String> getMembers() {
    return this.members;
  }

  public BindAlliance setMembers(List<String> members) {
    this.members = members;
    return this;
  }

  public void unsetMembers() {
    this.members = null;
  }

  /** Returns true if field members is set (has been assigned a value) and false otherwise */
  public boolean isSetMembers() {
    return this.members != null;
  }

  public void setMembersIsSet(boolean value) {
    if (!value) {
      this.members = null;
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

    case ALLIANCE_ID:
      if (value == null) {
        unsetAllianceId();
      } else {
        setAllianceId((String)value);
      }
      break;

    case GROUP_ID:
      if (value == null) {
        unsetGroupId();
      } else {
        setGroupId((String)value);
      }
      break;

    case MEMBERS:
      if (value == null) {
        unsetMembers();
      } else {
        setMembers((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case UID:
      return getUid();

    case ALLIANCE_ID:
      return getAllianceId();

    case GROUP_ID:
      return getGroupId();

    case MEMBERS:
      return getMembers();

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
    case ALLIANCE_ID:
      return isSetAllianceId();
    case GROUP_ID:
      return isSetGroupId();
    case MEMBERS:
      return isSetMembers();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BindAlliance)
      return this.equals((BindAlliance)that);
    return false;
  }

  public boolean equals(BindAlliance that) {
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

    boolean this_present_allianceId = true && this.isSetAllianceId();
    boolean that_present_allianceId = true && that.isSetAllianceId();
    if (this_present_allianceId || that_present_allianceId) {
      if (!(this_present_allianceId && that_present_allianceId))
        return false;
      if (!this.allianceId.equals(that.allianceId))
        return false;
    }

    boolean this_present_groupId = true && this.isSetGroupId();
    boolean that_present_groupId = true && that.isSetGroupId();
    if (this_present_groupId || that_present_groupId) {
      if (!(this_present_groupId && that_present_groupId))
        return false;
      if (!this.groupId.equals(that.groupId))
        return false;
    }

    boolean this_present_members = true && this.isSetMembers();
    boolean that_present_members = true && that.isSetMembers();
    if (this_present_members || that_present_members) {
      if (!(this_present_members && that_present_members))
        return false;
      if (!this.members.equals(that.members))
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

    boolean present_allianceId = true && (isSetAllianceId());
    list.add(present_allianceId);
    if (present_allianceId)
      list.add(allianceId);

    boolean present_groupId = true && (isSetGroupId());
    list.add(present_groupId);
    if (present_groupId)
      list.add(groupId);

    boolean present_members = true && (isSetMembers());
    list.add(present_members);
    if (present_members)
      list.add(members);

    return list.hashCode();
  }

  @Override
  public int compareTo(BindAlliance other) {
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
    lastComparison = Boolean.valueOf(isSetAllianceId()).compareTo(other.isSetAllianceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAllianceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.allianceId, other.allianceId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = Boolean.valueOf(isSetMembers()).compareTo(other.isSetMembers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMembers()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.members, other.members);
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
    StringBuilder sb = new StringBuilder("BindAlliance(");
    boolean first = true;

    sb.append("uid:");
    if (this.uid == null) {
      sb.append("null");
    } else {
      sb.append(this.uid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("allianceId:");
    if (this.allianceId == null) {
      sb.append("null");
    } else {
      sb.append(this.allianceId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("groupId:");
    if (this.groupId == null) {
      sb.append("null");
    } else {
      sb.append(this.groupId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("members:");
    if (this.members == null) {
      sb.append("null");
    } else {
      sb.append(this.members);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BindAllianceStandardSchemeFactory implements SchemeFactory {
    public BindAllianceStandardScheme getScheme() {
      return new BindAllianceStandardScheme();
    }
  }

  private static class BindAllianceStandardScheme extends StandardScheme<BindAlliance> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BindAlliance struct) throws org.apache.thrift.TException {
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
          case 2: // ALLIANCE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.allianceId = iprot.readString();
              struct.setAllianceIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // GROUP_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.groupId = iprot.readString();
              struct.setGroupIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MEMBERS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list510 = iprot.readListBegin();
                struct.members = new ArrayList<String>(_list510.size);
                String _elem511;
                for (int _i512 = 0; _i512 < _list510.size; ++_i512)
                {
                  _elem511 = iprot.readString();
                  struct.members.add(_elem511);
                }
                iprot.readListEnd();
              }
              struct.setMembersIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BindAlliance struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.uid != null) {
        oprot.writeFieldBegin(UID_FIELD_DESC);
        oprot.writeString(struct.uid);
        oprot.writeFieldEnd();
      }
      if (struct.allianceId != null) {
        oprot.writeFieldBegin(ALLIANCE_ID_FIELD_DESC);
        oprot.writeString(struct.allianceId);
        oprot.writeFieldEnd();
      }
      if (struct.groupId != null) {
        oprot.writeFieldBegin(GROUP_ID_FIELD_DESC);
        oprot.writeString(struct.groupId);
        oprot.writeFieldEnd();
      }
      if (struct.members != null) {
        oprot.writeFieldBegin(MEMBERS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.members.size()));
          for (String _iter513 : struct.members)
          {
            oprot.writeString(_iter513);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BindAllianceTupleSchemeFactory implements SchemeFactory {
    public BindAllianceTupleScheme getScheme() {
      return new BindAllianceTupleScheme();
    }
  }

  private static class BindAllianceTupleScheme extends TupleScheme<BindAlliance> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BindAlliance struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUid()) {
        optionals.set(0);
      }
      if (struct.isSetAllianceId()) {
        optionals.set(1);
      }
      if (struct.isSetGroupId()) {
        optionals.set(2);
      }
      if (struct.isSetMembers()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetUid()) {
        oprot.writeString(struct.uid);
      }
      if (struct.isSetAllianceId()) {
        oprot.writeString(struct.allianceId);
      }
      if (struct.isSetGroupId()) {
        oprot.writeString(struct.groupId);
      }
      if (struct.isSetMembers()) {
        {
          oprot.writeI32(struct.members.size());
          for (String _iter514 : struct.members)
          {
            oprot.writeString(_iter514);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BindAlliance struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.uid = iprot.readString();
        struct.setUidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.allianceId = iprot.readString();
        struct.setAllianceIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.groupId = iprot.readString();
        struct.setGroupIdIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list515 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.members = new ArrayList<String>(_list515.size);
          String _elem516;
          for (int _i517 = 0; _i517 < _list515.size; ++_i517)
          {
            _elem516 = iprot.readString();
            struct.members.add(_elem516);
          }
        }
        struct.setMembersIsSet(true);
      }
    }
  }

}

