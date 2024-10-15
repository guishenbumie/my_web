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
public class DeleteUsersResp implements org.apache.thrift.TBase<DeleteUsersResp, DeleteUsersResp._Fields>, java.io.Serializable, Cloneable, Comparable<DeleteUsersResp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DeleteUsersResp");

  private static final org.apache.thrift.protocol.TField BASE_FIELD_DESC = new org.apache.thrift.protocol.TField("base", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField FAILED_UID_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("failedUidList", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DeleteUsersRespStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DeleteUsersRespTupleSchemeFactory());
  }

  public BaseResp base; // required
  public List<String> failedUidList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BASE((short)1, "base"),
    FAILED_UID_LIST((short)2, "failedUidList");

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
        case 2: // FAILED_UID_LIST
          return FAILED_UID_LIST;
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
    tmpMap.put(_Fields.BASE, new org.apache.thrift.meta_data.FieldMetaData("base", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BaseResp.class)));
    tmpMap.put(_Fields.FAILED_UID_LIST, new org.apache.thrift.meta_data.FieldMetaData("failedUidList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DeleteUsersResp.class, metaDataMap);
  }

  public DeleteUsersResp() {
  }

  public DeleteUsersResp(
    BaseResp base,
    List<String> failedUidList)
  {
    this();
    this.base = base;
    this.failedUidList = failedUidList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DeleteUsersResp(DeleteUsersResp other) {
    if (other.isSetBase()) {
      this.base = new BaseResp(other.base);
    }
    if (other.isSetFailedUidList()) {
      List<String> __this__failedUidList = new ArrayList<String>(other.failedUidList);
      this.failedUidList = __this__failedUidList;
    }
  }

  public DeleteUsersResp deepCopy() {
    return new DeleteUsersResp(this);
  }

  @Override
  public void clear() {
    this.base = null;
    this.failedUidList = null;
  }

  public BaseResp getBase() {
    return this.base;
  }

  public DeleteUsersResp setBase(BaseResp base) {
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

  public int getFailedUidListSize() {
    return (this.failedUidList == null) ? 0 : this.failedUidList.size();
  }

  public java.util.Iterator<String> getFailedUidListIterator() {
    return (this.failedUidList == null) ? null : this.failedUidList.iterator();
  }

  public void addToFailedUidList(String elem) {
    if (this.failedUidList == null) {
      this.failedUidList = new ArrayList<String>();
    }
    this.failedUidList.add(elem);
  }

  public List<String> getFailedUidList() {
    return this.failedUidList;
  }

  public DeleteUsersResp setFailedUidList(List<String> failedUidList) {
    this.failedUidList = failedUidList;
    return this;
  }

  public void unsetFailedUidList() {
    this.failedUidList = null;
  }

  /** Returns true if field failedUidList is set (has been assigned a value) and false otherwise */
  public boolean isSetFailedUidList() {
    return this.failedUidList != null;
  }

  public void setFailedUidListIsSet(boolean value) {
    if (!value) {
      this.failedUidList = null;
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

    case FAILED_UID_LIST:
      if (value == null) {
        unsetFailedUidList();
      } else {
        setFailedUidList((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BASE:
      return getBase();

    case FAILED_UID_LIST:
      return getFailedUidList();

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
    case FAILED_UID_LIST:
      return isSetFailedUidList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DeleteUsersResp)
      return this.equals((DeleteUsersResp)that);
    return false;
  }

  public boolean equals(DeleteUsersResp that) {
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

    boolean this_present_failedUidList = true && this.isSetFailedUidList();
    boolean that_present_failedUidList = true && that.isSetFailedUidList();
    if (this_present_failedUidList || that_present_failedUidList) {
      if (!(this_present_failedUidList && that_present_failedUidList))
        return false;
      if (!this.failedUidList.equals(that.failedUidList))
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

    boolean present_failedUidList = true && (isSetFailedUidList());
    list.add(present_failedUidList);
    if (present_failedUidList)
      list.add(failedUidList);

    return list.hashCode();
  }

  @Override
  public int compareTo(DeleteUsersResp other) {
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
    lastComparison = Boolean.valueOf(isSetFailedUidList()).compareTo(other.isSetFailedUidList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFailedUidList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.failedUidList, other.failedUidList);
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
    StringBuilder sb = new StringBuilder("DeleteUsersResp(");
    boolean first = true;

    sb.append("base:");
    if (this.base == null) {
      sb.append("null");
    } else {
      sb.append(this.base);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("failedUidList:");
    if (this.failedUidList == null) {
      sb.append("null");
    } else {
      sb.append(this.failedUidList);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DeleteUsersRespStandardSchemeFactory implements SchemeFactory {
    public DeleteUsersRespStandardScheme getScheme() {
      return new DeleteUsersRespStandardScheme();
    }
  }

  private static class DeleteUsersRespStandardScheme extends StandardScheme<DeleteUsersResp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DeleteUsersResp struct) throws org.apache.thrift.TException {
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
          case 2: // FAILED_UID_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.failedUidList = new ArrayList<String>(_list8.size);
                String _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = iprot.readString();
                  struct.failedUidList.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setFailedUidListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DeleteUsersResp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.base != null) {
        oprot.writeFieldBegin(BASE_FIELD_DESC);
        struct.base.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.failedUidList != null) {
        oprot.writeFieldBegin(FAILED_UID_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.failedUidList.size()));
          for (String _iter11 : struct.failedUidList)
          {
            oprot.writeString(_iter11);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DeleteUsersRespTupleSchemeFactory implements SchemeFactory {
    public DeleteUsersRespTupleScheme getScheme() {
      return new DeleteUsersRespTupleScheme();
    }
  }

  private static class DeleteUsersRespTupleScheme extends TupleScheme<DeleteUsersResp> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DeleteUsersResp struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBase()) {
        optionals.set(0);
      }
      if (struct.isSetFailedUidList()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetBase()) {
        struct.base.write(oprot);
      }
      if (struct.isSetFailedUidList()) {
        {
          oprot.writeI32(struct.failedUidList.size());
          for (String _iter12 : struct.failedUidList)
          {
            oprot.writeString(_iter12);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DeleteUsersResp struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.base = new BaseResp();
        struct.base.read(iprot);
        struct.setBaseIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.failedUidList = new ArrayList<String>(_list13.size);
          String _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = iprot.readString();
            struct.failedUidList.add(_elem14);
          }
        }
        struct.setFailedUidListIsSet(true);
      }
    }
  }

}

