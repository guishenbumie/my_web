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
public class JoinGroup implements org.apache.thrift.TBase<JoinGroup, JoinGroup._Fields>, java.io.Serializable, Cloneable, Comparable<JoinGroup> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JoinGroup");

  private static final org.apache.thrift.protocol.TField GROUP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("groupID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("message", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SERVER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("serverID", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new JoinGroupStandardSchemeFactory());
    schemes.put(TupleScheme.class, new JoinGroupTupleSchemeFactory());
  }

  public String groupID; // required
  public String message; // required
  public String serverID; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    GROUP_ID((short)1, "groupID"),
    MESSAGE((short)2, "message"),
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
        case 1: // GROUP_ID
          return GROUP_ID;
        case 2: // MESSAGE
          return MESSAGE;
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
    tmpMap.put(_Fields.GROUP_ID, new org.apache.thrift.meta_data.FieldMetaData("groupID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("message", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SERVER_ID, new org.apache.thrift.meta_data.FieldMetaData("serverID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JoinGroup.class, metaDataMap);
  }

  public JoinGroup() {
  }

  public JoinGroup(
    String groupID,
    String message,
    String serverID)
  {
    this();
    this.groupID = groupID;
    this.message = message;
    this.serverID = serverID;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JoinGroup(JoinGroup other) {
    if (other.isSetGroupID()) {
      this.groupID = other.groupID;
    }
    if (other.isSetMessage()) {
      this.message = other.message;
    }
    if (other.isSetServerID()) {
      this.serverID = other.serverID;
    }
  }

  public JoinGroup deepCopy() {
    return new JoinGroup(this);
  }

  @Override
  public void clear() {
    this.groupID = null;
    this.message = null;
    this.serverID = null;
  }

  public String getGroupID() {
    return this.groupID;
  }

  public JoinGroup setGroupID(String groupID) {
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

  public String getMessage() {
    return this.message;
  }

  public JoinGroup setMessage(String message) {
    this.message = message;
    return this;
  }

  public void unsetMessage() {
    this.message = null;
  }

  /** Returns true if field message is set (has been assigned a value) and false otherwise */
  public boolean isSetMessage() {
    return this.message != null;
  }

  public void setMessageIsSet(boolean value) {
    if (!value) {
      this.message = null;
    }
  }

  public String getServerID() {
    return this.serverID;
  }

  public JoinGroup setServerID(String serverID) {
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
    case GROUP_ID:
      if (value == null) {
        unsetGroupID();
      } else {
        setGroupID((String)value);
      }
      break;

    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        setMessage((String)value);
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
    case GROUP_ID:
      return getGroupID();

    case MESSAGE:
      return getMessage();

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
    case GROUP_ID:
      return isSetGroupID();
    case MESSAGE:
      return isSetMessage();
    case SERVER_ID:
      return isSetServerID();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JoinGroup)
      return this.equals((JoinGroup)that);
    return false;
  }

  public boolean equals(JoinGroup that) {
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

    boolean this_present_message = true && this.isSetMessage();
    boolean that_present_message = true && that.isSetMessage();
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
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

    boolean present_groupID = true && (isSetGroupID());
    list.add(present_groupID);
    if (present_groupID)
      list.add(groupID);

    boolean present_message = true && (isSetMessage());
    list.add(present_message);
    if (present_message)
      list.add(message);

    boolean present_serverID = true && (isSetServerID());
    list.add(present_serverID);
    if (present_serverID)
      list.add(serverID);

    return list.hashCode();
  }

  @Override
  public int compareTo(JoinGroup other) {
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
    lastComparison = Boolean.valueOf(isSetMessage()).compareTo(other.isSetMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.message, other.message);
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
    StringBuilder sb = new StringBuilder("JoinGroup(");
    boolean first = true;

    sb.append("groupID:");
    if (this.groupID == null) {
      sb.append("null");
    } else {
      sb.append(this.groupID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("message:");
    if (this.message == null) {
      sb.append("null");
    } else {
      sb.append(this.message);
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

  private static class JoinGroupStandardSchemeFactory implements SchemeFactory {
    public JoinGroupStandardScheme getScheme() {
      return new JoinGroupStandardScheme();
    }
  }

  private static class JoinGroupStandardScheme extends StandardScheme<JoinGroup> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JoinGroup struct) throws org.apache.thrift.TException {
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
          case 2: // MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.message = iprot.readString();
              struct.setMessageIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, JoinGroup struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.groupID != null) {
        oprot.writeFieldBegin(GROUP_ID_FIELD_DESC);
        oprot.writeString(struct.groupID);
        oprot.writeFieldEnd();
      }
      if (struct.message != null) {
        oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
        oprot.writeString(struct.message);
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

  private static class JoinGroupTupleSchemeFactory implements SchemeFactory {
    public JoinGroupTupleScheme getScheme() {
      return new JoinGroupTupleScheme();
    }
  }

  private static class JoinGroupTupleScheme extends TupleScheme<JoinGroup> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, JoinGroup struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetGroupID()) {
        optionals.set(0);
      }
      if (struct.isSetMessage()) {
        optionals.set(1);
      }
      if (struct.isSetServerID()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetGroupID()) {
        oprot.writeString(struct.groupID);
      }
      if (struct.isSetMessage()) {
        oprot.writeString(struct.message);
      }
      if (struct.isSetServerID()) {
        oprot.writeString(struct.serverID);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, JoinGroup struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.groupID = iprot.readString();
        struct.setGroupIDIsSet(true);
      }
      if (incoming.get(1)) {
        struct.message = iprot.readString();
        struct.setMessageIsSet(true);
      }
      if (incoming.get(2)) {
        struct.serverID = iprot.readString();
        struct.setServerIDIsSet(true);
      }
    }
  }

}

