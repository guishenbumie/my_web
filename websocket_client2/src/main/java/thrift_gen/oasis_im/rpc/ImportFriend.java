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
public class ImportFriend implements org.apache.thrift.TBase<ImportFriend, ImportFriend._Fields>, java.io.Serializable, Cloneable, Comparable<ImportFriend> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ImportFriend");

  private static final org.apache.thrift.protocol.TField UID_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("uidList", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField OWNER_UID_FIELD_DESC = new org.apache.thrift.protocol.TField("ownerUid", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SERVER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("serverID", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ImportFriendStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ImportFriendTupleSchemeFactory());
  }

  public List<String> uidList; // required
  public String ownerUid; // required
  public String serverID; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UID_LIST((short)1, "uidList"),
    OWNER_UID((short)2, "ownerUid"),
    SERVER_ID((short)3, "serverID");

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
        case 1: // UID_LIST
          return UID_LIST;
        case 2: // OWNER_UID
          return OWNER_UID;
        case 3: // SERVER_ID
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UID_LIST, new org.apache.thrift.meta_data.FieldMetaData("uidList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.OWNER_UID, new org.apache.thrift.meta_data.FieldMetaData("ownerUid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SERVER_ID, new org.apache.thrift.meta_data.FieldMetaData("serverID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ImportFriend.class, metaDataMap);
  }

  public ImportFriend() {
  }

  public ImportFriend(
    List<String> uidList,
    String ownerUid,
    String serverID)
  {
    this();
    this.uidList = uidList;
    this.ownerUid = ownerUid;
    this.serverID = serverID;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ImportFriend(ImportFriend other) {
    if (other.isSetUidList()) {
      List<String> __this__uidList = new ArrayList<String>(other.uidList);
      this.uidList = __this__uidList;
    }
    if (other.isSetOwnerUid()) {
      this.ownerUid = other.ownerUid;
    }
    if (other.isSetServerID()) {
      this.serverID = other.serverID;
    }
  }

  public ImportFriend deepCopy() {
    return new ImportFriend(this);
  }

  @Override
  public void clear() {
    this.uidList = null;
    this.ownerUid = null;
    this.serverID = null;
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

  public ImportFriend setUidList(List<String> uidList) {
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

  public String getOwnerUid() {
    return this.ownerUid;
  }

  public ImportFriend setOwnerUid(String ownerUid) {
    this.ownerUid = ownerUid;
    return this;
  }

  public void unsetOwnerUid() {
    this.ownerUid = null;
  }

  /** Returns true if field ownerUid is set (has been assigned a value) and false otherwise */
  public boolean isSetOwnerUid() {
    return this.ownerUid != null;
  }

  public void setOwnerUidIsSet(boolean value) {
    if (!value) {
      this.ownerUid = null;
    }
  }

  public String getServerID() {
    return this.serverID;
  }

  public ImportFriend setServerID(String serverID) {
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
    case UID_LIST:
      if (value == null) {
        unsetUidList();
      } else {
        setUidList((List<String>)value);
      }
      break;

    case OWNER_UID:
      if (value == null) {
        unsetOwnerUid();
      } else {
        setOwnerUid((String)value);
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
    case UID_LIST:
      return getUidList();

    case OWNER_UID:
      return getOwnerUid();

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
    case UID_LIST:
      return isSetUidList();
    case OWNER_UID:
      return isSetOwnerUid();
    case SERVER_ID:
      return isSetServerID();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ImportFriend)
      return this.equals((ImportFriend)that);
    return false;
  }

  public boolean equals(ImportFriend that) {
    if (that == null)
      return false;

    boolean this_present_uidList = true && this.isSetUidList();
    boolean that_present_uidList = true && that.isSetUidList();
    if (this_present_uidList || that_present_uidList) {
      if (!(this_present_uidList && that_present_uidList))
        return false;
      if (!this.uidList.equals(that.uidList))
        return false;
    }

    boolean this_present_ownerUid = true && this.isSetOwnerUid();
    boolean that_present_ownerUid = true && that.isSetOwnerUid();
    if (this_present_ownerUid || that_present_ownerUid) {
      if (!(this_present_ownerUid && that_present_ownerUid))
        return false;
      if (!this.ownerUid.equals(that.ownerUid))
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

    boolean present_uidList = true && (isSetUidList());
    list.add(present_uidList);
    if (present_uidList)
      list.add(uidList);

    boolean present_ownerUid = true && (isSetOwnerUid());
    list.add(present_ownerUid);
    if (present_ownerUid)
      list.add(ownerUid);

    boolean present_serverID = true && (isSetServerID());
    list.add(present_serverID);
    if (present_serverID)
      list.add(serverID);

    return list.hashCode();
  }

  @Override
  public int compareTo(ImportFriend other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = Boolean.valueOf(isSetOwnerUid()).compareTo(other.isSetOwnerUid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOwnerUid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ownerUid, other.ownerUid);
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
    StringBuilder sb = new StringBuilder("ImportFriend(");
    boolean first = true;

    sb.append("uidList:");
    if (this.uidList == null) {
      sb.append("null");
    } else {
      sb.append(this.uidList);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ownerUid:");
    if (this.ownerUid == null) {
      sb.append("null");
    } else {
      sb.append(this.ownerUid);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ImportFriendStandardSchemeFactory implements SchemeFactory {
    public ImportFriendStandardScheme getScheme() {
      return new ImportFriendStandardScheme();
    }
  }

  private static class ImportFriendStandardScheme extends StandardScheme<ImportFriend> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ImportFriend struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // UID_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list518 = iprot.readListBegin();
                struct.uidList = new ArrayList<String>(_list518.size);
                String _elem519;
                for (int _i520 = 0; _i520 < _list518.size; ++_i520)
                {
                  _elem519 = iprot.readString();
                  struct.uidList.add(_elem519);
                }
                iprot.readListEnd();
              }
              struct.setUidListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OWNER_UID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ownerUid = iprot.readString();
              struct.setOwnerUidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SERVER_ID
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ImportFriend struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.uidList != null) {
        oprot.writeFieldBegin(UID_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.uidList.size()));
          for (String _iter521 : struct.uidList)
          {
            oprot.writeString(_iter521);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.ownerUid != null) {
        oprot.writeFieldBegin(OWNER_UID_FIELD_DESC);
        oprot.writeString(struct.ownerUid);
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

  private static class ImportFriendTupleSchemeFactory implements SchemeFactory {
    public ImportFriendTupleScheme getScheme() {
      return new ImportFriendTupleScheme();
    }
  }

  private static class ImportFriendTupleScheme extends TupleScheme<ImportFriend> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ImportFriend struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUidList()) {
        optionals.set(0);
      }
      if (struct.isSetOwnerUid()) {
        optionals.set(1);
      }
      if (struct.isSetServerID()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetUidList()) {
        {
          oprot.writeI32(struct.uidList.size());
          for (String _iter522 : struct.uidList)
          {
            oprot.writeString(_iter522);
          }
        }
      }
      if (struct.isSetOwnerUid()) {
        oprot.writeString(struct.ownerUid);
      }
      if (struct.isSetServerID()) {
        oprot.writeString(struct.serverID);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ImportFriend struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list523 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.uidList = new ArrayList<String>(_list523.size);
          String _elem524;
          for (int _i525 = 0; _i525 < _list523.size; ++_i525)
          {
            _elem524 = iprot.readString();
            struct.uidList.add(_elem524);
          }
        }
        struct.setUidListIsSet(true);
      }
      if (incoming.get(1)) {
        struct.ownerUid = iprot.readString();
        struct.setOwnerUidIsSet(true);
      }
      if (incoming.get(2)) {
        struct.serverID = iprot.readString();
        struct.setServerIDIsSet(true);
      }
    }
  }

}

