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
public class AddBlacklist implements org.apache.thrift.TBase<AddBlacklist, AddBlacklist._Fields>, java.io.Serializable, Cloneable, Comparable<AddBlacklist> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AddBlacklist");

  private static final org.apache.thrift.protocol.TField UID_FIELD_DESC = new org.apache.thrift.protocol.TField("uid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField OWNER_UID_FIELD_DESC = new org.apache.thrift.protocol.TField("ownerUid", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AddBlacklistStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AddBlacklistTupleSchemeFactory());
  }

  public String uid; // required
  public String ownerUid; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UID((short)1, "uid"),
    OWNER_UID((short)2, "ownerUid");

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
        case 2: // OWNER_UID
          return OWNER_UID;
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
    tmpMap.put(_Fields.OWNER_UID, new org.apache.thrift.meta_data.FieldMetaData("ownerUid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AddBlacklist.class, metaDataMap);
  }

  public AddBlacklist() {
  }

  public AddBlacklist(
    String uid,
    String ownerUid)
  {
    this();
    this.uid = uid;
    this.ownerUid = ownerUid;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AddBlacklist(AddBlacklist other) {
    if (other.isSetUid()) {
      this.uid = other.uid;
    }
    if (other.isSetOwnerUid()) {
      this.ownerUid = other.ownerUid;
    }
  }

  public AddBlacklist deepCopy() {
    return new AddBlacklist(this);
  }

  @Override
  public void clear() {
    this.uid = null;
    this.ownerUid = null;
  }

  public String getUid() {
    return this.uid;
  }

  public AddBlacklist setUid(String uid) {
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

  public String getOwnerUid() {
    return this.ownerUid;
  }

  public AddBlacklist setOwnerUid(String ownerUid) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case UID:
      if (value == null) {
        unsetUid();
      } else {
        setUid((String)value);
      }
      break;

    case OWNER_UID:
      if (value == null) {
        unsetOwnerUid();
      } else {
        setOwnerUid((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case UID:
      return getUid();

    case OWNER_UID:
      return getOwnerUid();

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
    case OWNER_UID:
      return isSetOwnerUid();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AddBlacklist)
      return this.equals((AddBlacklist)that);
    return false;
  }

  public boolean equals(AddBlacklist that) {
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

    boolean this_present_ownerUid = true && this.isSetOwnerUid();
    boolean that_present_ownerUid = true && that.isSetOwnerUid();
    if (this_present_ownerUid || that_present_ownerUid) {
      if (!(this_present_ownerUid && that_present_ownerUid))
        return false;
      if (!this.ownerUid.equals(that.ownerUid))
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

    boolean present_ownerUid = true && (isSetOwnerUid());
    list.add(present_ownerUid);
    if (present_ownerUid)
      list.add(ownerUid);

    return list.hashCode();
  }

  @Override
  public int compareTo(AddBlacklist other) {
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
    StringBuilder sb = new StringBuilder("AddBlacklist(");
    boolean first = true;

    sb.append("uid:");
    if (this.uid == null) {
      sb.append("null");
    } else {
      sb.append(this.uid);
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

  private static class AddBlacklistStandardSchemeFactory implements SchemeFactory {
    public AddBlacklistStandardScheme getScheme() {
      return new AddBlacklistStandardScheme();
    }
  }

  private static class AddBlacklistStandardScheme extends StandardScheme<AddBlacklist> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AddBlacklist struct) throws org.apache.thrift.TException {
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
          case 2: // OWNER_UID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ownerUid = iprot.readString();
              struct.setOwnerUidIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AddBlacklist struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.uid != null) {
        oprot.writeFieldBegin(UID_FIELD_DESC);
        oprot.writeString(struct.uid);
        oprot.writeFieldEnd();
      }
      if (struct.ownerUid != null) {
        oprot.writeFieldBegin(OWNER_UID_FIELD_DESC);
        oprot.writeString(struct.ownerUid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AddBlacklistTupleSchemeFactory implements SchemeFactory {
    public AddBlacklistTupleScheme getScheme() {
      return new AddBlacklistTupleScheme();
    }
  }

  private static class AddBlacklistTupleScheme extends TupleScheme<AddBlacklist> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AddBlacklist struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUid()) {
        optionals.set(0);
      }
      if (struct.isSetOwnerUid()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUid()) {
        oprot.writeString(struct.uid);
      }
      if (struct.isSetOwnerUid()) {
        oprot.writeString(struct.ownerUid);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AddBlacklist struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.uid = iprot.readString();
        struct.setUidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.ownerUid = iprot.readString();
        struct.setOwnerUidIsSet(true);
      }
    }
  }

}

