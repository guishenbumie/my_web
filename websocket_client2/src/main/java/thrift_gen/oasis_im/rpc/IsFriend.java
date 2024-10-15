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
public class IsFriend implements org.apache.thrift.TBase<IsFriend, IsFriend._Fields>, java.io.Serializable, Cloneable, Comparable<IsFriend> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("IsFriend");

  private static final org.apache.thrift.protocol.TField RECEIVE_UID_FIELD_DESC = new org.apache.thrift.protocol.TField("receiveUid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SERVER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("serverID", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new IsFriendStandardSchemeFactory());
    schemes.put(TupleScheme.class, new IsFriendTupleSchemeFactory());
  }

  public String receiveUid; // required
  public String serverID; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RECEIVE_UID((short)1, "receiveUid"),
    SERVER_ID((short)2, "serverID");

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
        case 1: // RECEIVE_UID
          return RECEIVE_UID;
        case 2: // SERVER_ID
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
    tmpMap.put(_Fields.RECEIVE_UID, new org.apache.thrift.meta_data.FieldMetaData("receiveUid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SERVER_ID, new org.apache.thrift.meta_data.FieldMetaData("serverID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(IsFriend.class, metaDataMap);
  }

  public IsFriend() {
  }

  public IsFriend(
    String receiveUid,
    String serverID)
  {
    this();
    this.receiveUid = receiveUid;
    this.serverID = serverID;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public IsFriend(IsFriend other) {
    if (other.isSetReceiveUid()) {
      this.receiveUid = other.receiveUid;
    }
    if (other.isSetServerID()) {
      this.serverID = other.serverID;
    }
  }

  public IsFriend deepCopy() {
    return new IsFriend(this);
  }

  @Override
  public void clear() {
    this.receiveUid = null;
    this.serverID = null;
  }

  public String getReceiveUid() {
    return this.receiveUid;
  }

  public IsFriend setReceiveUid(String receiveUid) {
    this.receiveUid = receiveUid;
    return this;
  }

  public void unsetReceiveUid() {
    this.receiveUid = null;
  }

  /** Returns true if field receiveUid is set (has been assigned a value) and false otherwise */
  public boolean isSetReceiveUid() {
    return this.receiveUid != null;
  }

  public void setReceiveUidIsSet(boolean value) {
    if (!value) {
      this.receiveUid = null;
    }
  }

  public String getServerID() {
    return this.serverID;
  }

  public IsFriend setServerID(String serverID) {
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
    case RECEIVE_UID:
      if (value == null) {
        unsetReceiveUid();
      } else {
        setReceiveUid((String)value);
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
    case RECEIVE_UID:
      return getReceiveUid();

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
    case RECEIVE_UID:
      return isSetReceiveUid();
    case SERVER_ID:
      return isSetServerID();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof IsFriend)
      return this.equals((IsFriend)that);
    return false;
  }

  public boolean equals(IsFriend that) {
    if (that == null)
      return false;

    boolean this_present_receiveUid = true && this.isSetReceiveUid();
    boolean that_present_receiveUid = true && that.isSetReceiveUid();
    if (this_present_receiveUid || that_present_receiveUid) {
      if (!(this_present_receiveUid && that_present_receiveUid))
        return false;
      if (!this.receiveUid.equals(that.receiveUid))
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

    boolean present_receiveUid = true && (isSetReceiveUid());
    list.add(present_receiveUid);
    if (present_receiveUid)
      list.add(receiveUid);

    boolean present_serverID = true && (isSetServerID());
    list.add(present_serverID);
    if (present_serverID)
      list.add(serverID);

    return list.hashCode();
  }

  @Override
  public int compareTo(IsFriend other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetReceiveUid()).compareTo(other.isSetReceiveUid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReceiveUid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.receiveUid, other.receiveUid);
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
    StringBuilder sb = new StringBuilder("IsFriend(");
    boolean first = true;

    sb.append("receiveUid:");
    if (this.receiveUid == null) {
      sb.append("null");
    } else {
      sb.append(this.receiveUid);
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

  private static class IsFriendStandardSchemeFactory implements SchemeFactory {
    public IsFriendStandardScheme getScheme() {
      return new IsFriendStandardScheme();
    }
  }

  private static class IsFriendStandardScheme extends StandardScheme<IsFriend> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, IsFriend struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RECEIVE_UID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.receiveUid = iprot.readString();
              struct.setReceiveUidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SERVER_ID
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, IsFriend struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.receiveUid != null) {
        oprot.writeFieldBegin(RECEIVE_UID_FIELD_DESC);
        oprot.writeString(struct.receiveUid);
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

  private static class IsFriendTupleSchemeFactory implements SchemeFactory {
    public IsFriendTupleScheme getScheme() {
      return new IsFriendTupleScheme();
    }
  }

  private static class IsFriendTupleScheme extends TupleScheme<IsFriend> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, IsFriend struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetReceiveUid()) {
        optionals.set(0);
      }
      if (struct.isSetServerID()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetReceiveUid()) {
        oprot.writeString(struct.receiveUid);
      }
      if (struct.isSetServerID()) {
        oprot.writeString(struct.serverID);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, IsFriend struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.receiveUid = iprot.readString();
        struct.setReceiveUidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.serverID = iprot.readString();
        struct.setServerIDIsSet(true);
      }
    }
  }

}

