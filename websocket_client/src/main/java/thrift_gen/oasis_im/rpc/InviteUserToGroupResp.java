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
public class InviteUserToGroupResp implements org.apache.thrift.TBase<InviteUserToGroupResp, InviteUserToGroupResp._Fields>, java.io.Serializable, Cloneable, Comparable<InviteUserToGroupResp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("InviteUserToGroupResp");

  private static final org.apache.thrift.protocol.TField BASE_FIELD_DESC = new org.apache.thrift.protocol.TField("base", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField ID2_RESULT_FIELD_DESC = new org.apache.thrift.protocol.TField("id2Result", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new InviteUserToGroupRespStandardSchemeFactory());
    schemes.put(TupleScheme.class, new InviteUserToGroupRespTupleSchemeFactory());
  }

  public BaseResp base; // required
  public List<Id2Result> id2Result; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BASE((short)1, "base"),
    ID2_RESULT((short)2, "id2Result");

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
        case 2: // ID2_RESULT
          return ID2_RESULT;
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
    tmpMap.put(_Fields.ID2_RESULT, new org.apache.thrift.meta_data.FieldMetaData("id2Result", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Id2Result.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(InviteUserToGroupResp.class, metaDataMap);
  }

  public InviteUserToGroupResp() {
  }

  public InviteUserToGroupResp(
    BaseResp base,
    List<Id2Result> id2Result)
  {
    this();
    this.base = base;
    this.id2Result = id2Result;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public InviteUserToGroupResp(InviteUserToGroupResp other) {
    if (other.isSetBase()) {
      this.base = new BaseResp(other.base);
    }
    if (other.isSetId2Result()) {
      List<Id2Result> __this__id2Result = new ArrayList<Id2Result>(other.id2Result.size());
      for (Id2Result other_element : other.id2Result) {
        __this__id2Result.add(new Id2Result(other_element));
      }
      this.id2Result = __this__id2Result;
    }
  }

  public InviteUserToGroupResp deepCopy() {
    return new InviteUserToGroupResp(this);
  }

  @Override
  public void clear() {
    this.base = null;
    this.id2Result = null;
  }

  public BaseResp getBase() {
    return this.base;
  }

  public InviteUserToGroupResp setBase(BaseResp base) {
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

  public int getId2ResultSize() {
    return (this.id2Result == null) ? 0 : this.id2Result.size();
  }

  public java.util.Iterator<Id2Result> getId2ResultIterator() {
    return (this.id2Result == null) ? null : this.id2Result.iterator();
  }

  public void addToId2Result(Id2Result elem) {
    if (this.id2Result == null) {
      this.id2Result = new ArrayList<Id2Result>();
    }
    this.id2Result.add(elem);
  }

  public List<Id2Result> getId2Result() {
    return this.id2Result;
  }

  public InviteUserToGroupResp setId2Result(List<Id2Result> id2Result) {
    this.id2Result = id2Result;
    return this;
  }

  public void unsetId2Result() {
    this.id2Result = null;
  }

  /** Returns true if field id2Result is set (has been assigned a value) and false otherwise */
  public boolean isSetId2Result() {
    return this.id2Result != null;
  }

  public void setId2ResultIsSet(boolean value) {
    if (!value) {
      this.id2Result = null;
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

    case ID2_RESULT:
      if (value == null) {
        unsetId2Result();
      } else {
        setId2Result((List<Id2Result>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BASE:
      return getBase();

    case ID2_RESULT:
      return getId2Result();

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
    case ID2_RESULT:
      return isSetId2Result();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof InviteUserToGroupResp)
      return this.equals((InviteUserToGroupResp)that);
    return false;
  }

  public boolean equals(InviteUserToGroupResp that) {
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

    boolean this_present_id2Result = true && this.isSetId2Result();
    boolean that_present_id2Result = true && that.isSetId2Result();
    if (this_present_id2Result || that_present_id2Result) {
      if (!(this_present_id2Result && that_present_id2Result))
        return false;
      if (!this.id2Result.equals(that.id2Result))
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

    boolean present_id2Result = true && (isSetId2Result());
    list.add(present_id2Result);
    if (present_id2Result)
      list.add(id2Result);

    return list.hashCode();
  }

  @Override
  public int compareTo(InviteUserToGroupResp other) {
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
    lastComparison = Boolean.valueOf(isSetId2Result()).compareTo(other.isSetId2Result());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId2Result()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id2Result, other.id2Result);
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
    StringBuilder sb = new StringBuilder("InviteUserToGroupResp(");
    boolean first = true;

    sb.append("base:");
    if (this.base == null) {
      sb.append("null");
    } else {
      sb.append(this.base);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("id2Result:");
    if (this.id2Result == null) {
      sb.append("null");
    } else {
      sb.append(this.id2Result);
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

  private static class InviteUserToGroupRespStandardSchemeFactory implements SchemeFactory {
    public InviteUserToGroupRespStandardScheme getScheme() {
      return new InviteUserToGroupRespStandardScheme();
    }
  }

  private static class InviteUserToGroupRespStandardScheme extends StandardScheme<InviteUserToGroupResp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, InviteUserToGroupResp struct) throws org.apache.thrift.TException {
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
          case 2: // ID2_RESULT
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list494 = iprot.readListBegin();
                struct.id2Result = new ArrayList<Id2Result>(_list494.size);
                Id2Result _elem495;
                for (int _i496 = 0; _i496 < _list494.size; ++_i496)
                {
                  _elem495 = new Id2Result();
                  _elem495.read(iprot);
                  struct.id2Result.add(_elem495);
                }
                iprot.readListEnd();
              }
              struct.setId2ResultIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, InviteUserToGroupResp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.base != null) {
        oprot.writeFieldBegin(BASE_FIELD_DESC);
        struct.base.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.id2Result != null) {
        oprot.writeFieldBegin(ID2_RESULT_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.id2Result.size()));
          for (Id2Result _iter497 : struct.id2Result)
          {
            _iter497.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class InviteUserToGroupRespTupleSchemeFactory implements SchemeFactory {
    public InviteUserToGroupRespTupleScheme getScheme() {
      return new InviteUserToGroupRespTupleScheme();
    }
  }

  private static class InviteUserToGroupRespTupleScheme extends TupleScheme<InviteUserToGroupResp> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, InviteUserToGroupResp struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBase()) {
        optionals.set(0);
      }
      if (struct.isSetId2Result()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetBase()) {
        struct.base.write(oprot);
      }
      if (struct.isSetId2Result()) {
        {
          oprot.writeI32(struct.id2Result.size());
          for (Id2Result _iter498 : struct.id2Result)
          {
            _iter498.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, InviteUserToGroupResp struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.base = new BaseResp();
        struct.base.read(iprot);
        struct.setBaseIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list499 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.id2Result = new ArrayList<Id2Result>(_list499.size);
          Id2Result _elem500;
          for (int _i501 = 0; _i501 < _list499.size; ++_i501)
          {
            _elem500 = new Id2Result();
            _elem500.read(iprot);
            struct.id2Result.add(_elem500);
          }
        }
        struct.setId2ResultIsSet(true);
      }
    }
  }

}

