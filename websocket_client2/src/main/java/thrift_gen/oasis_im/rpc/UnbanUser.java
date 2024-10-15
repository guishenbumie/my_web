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
public class UnbanUser implements org.apache.thrift.TBase<UnbanUser, UnbanUser._Fields>, java.io.Serializable, Cloneable, Comparable<UnbanUser> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UnbanUser");

  private static final org.apache.thrift.protocol.TField UID_FIELD_DESC = new org.apache.thrift.protocol.TField("uid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField BANNED_UID_FIELD_DESC = new org.apache.thrift.protocol.TField("bannedUid", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SERVER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("serverID", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new UnbanUserStandardSchemeFactory());
    schemes.put(TupleScheme.class, new UnbanUserTupleSchemeFactory());
  }

  public String uid; // required
  public String bannedUid; // required
  public String serverID; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UID((short)1, "uid"),
    BANNED_UID((short)2, "bannedUid"),
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
        case 1: // UID
          return UID;
        case 2: // BANNED_UID
          return BANNED_UID;
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
    tmpMap.put(_Fields.UID, new org.apache.thrift.meta_data.FieldMetaData("uid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BANNED_UID, new org.apache.thrift.meta_data.FieldMetaData("bannedUid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SERVER_ID, new org.apache.thrift.meta_data.FieldMetaData("serverID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UnbanUser.class, metaDataMap);
  }

  public UnbanUser() {
  }

  public UnbanUser(
    String uid,
    String bannedUid,
    String serverID)
  {
    this();
    this.uid = uid;
    this.bannedUid = bannedUid;
    this.serverID = serverID;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UnbanUser(UnbanUser other) {
    if (other.isSetUid()) {
      this.uid = other.uid;
    }
    if (other.isSetBannedUid()) {
      this.bannedUid = other.bannedUid;
    }
    if (other.isSetServerID()) {
      this.serverID = other.serverID;
    }
  }

  public UnbanUser deepCopy() {
    return new UnbanUser(this);
  }

  @Override
  public void clear() {
    this.uid = null;
    this.bannedUid = null;
    this.serverID = null;
  }

  public String getUid() {
    return this.uid;
  }

  public UnbanUser setUid(String uid) {
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

  public UnbanUser setBannedUid(String bannedUid) {
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

  public String getServerID() {
    return this.serverID;
  }

  public UnbanUser setServerID(String serverID) {
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
    case SERVER_ID:
      return isSetServerID();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UnbanUser)
      return this.equals((UnbanUser)that);
    return false;
  }

  public boolean equals(UnbanUser that) {
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

    boolean present_serverID = true && (isSetServerID());
    list.add(present_serverID);
    if (present_serverID)
      list.add(serverID);

    return list.hashCode();
  }

  @Override
  public int compareTo(UnbanUser other) {
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
    StringBuilder sb = new StringBuilder("UnbanUser(");
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

  private static class UnbanUserStandardSchemeFactory implements SchemeFactory {
    public UnbanUserStandardScheme getScheme() {
      return new UnbanUserStandardScheme();
    }
  }

  private static class UnbanUserStandardScheme extends StandardScheme<UnbanUser> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UnbanUser struct) throws org.apache.thrift.TException {
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, UnbanUser struct) throws org.apache.thrift.TException {
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
      if (struct.serverID != null) {
        oprot.writeFieldBegin(SERVER_ID_FIELD_DESC);
        oprot.writeString(struct.serverID);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UnbanUserTupleSchemeFactory implements SchemeFactory {
    public UnbanUserTupleScheme getScheme() {
      return new UnbanUserTupleScheme();
    }
  }

  private static class UnbanUserTupleScheme extends TupleScheme<UnbanUser> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UnbanUser struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUid()) {
        optionals.set(0);
      }
      if (struct.isSetBannedUid()) {
        optionals.set(1);
      }
      if (struct.isSetServerID()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetUid()) {
        oprot.writeString(struct.uid);
      }
      if (struct.isSetBannedUid()) {
        oprot.writeString(struct.bannedUid);
      }
      if (struct.isSetServerID()) {
        oprot.writeString(struct.serverID);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UnbanUser struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.uid = iprot.readString();
        struct.setUidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.bannedUid = iprot.readString();
        struct.setBannedUidIsSet(true);
      }
      if (incoming.get(2)) {
        struct.serverID = iprot.readString();
        struct.setServerIDIsSet(true);
      }
    }
  }

}

