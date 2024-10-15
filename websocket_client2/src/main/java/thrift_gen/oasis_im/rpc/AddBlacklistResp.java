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
public class AddBlacklistResp implements org.apache.thrift.TBase<AddBlacklistResp, AddBlacklistResp._Fields>, java.io.Serializable, Cloneable, Comparable<AddBlacklistResp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AddBlacklistResp");

  private static final org.apache.thrift.protocol.TField BASE_FIELD_DESC = new org.apache.thrift.protocol.TField("base", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField USERINFO_FIELD_DESC = new org.apache.thrift.protocol.TField("userinfo", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AddBlacklistRespStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AddBlacklistRespTupleSchemeFactory());
  }

  public BaseResp base; // required
  public UserInfo userinfo; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BASE((short)1, "base"),
    USERINFO((short)2, "userinfo");

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
        case 2: // USERINFO
          return USERINFO;
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
    tmpMap.put(_Fields.USERINFO, new org.apache.thrift.meta_data.FieldMetaData("userinfo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, UserInfo.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AddBlacklistResp.class, metaDataMap);
  }

  public AddBlacklistResp() {
  }

  public AddBlacklistResp(
    BaseResp base,
    UserInfo userinfo)
  {
    this();
    this.base = base;
    this.userinfo = userinfo;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AddBlacklistResp(AddBlacklistResp other) {
    if (other.isSetBase()) {
      this.base = new BaseResp(other.base);
    }
    if (other.isSetUserinfo()) {
      this.userinfo = new UserInfo(other.userinfo);
    }
  }

  public AddBlacklistResp deepCopy() {
    return new AddBlacklistResp(this);
  }

  @Override
  public void clear() {
    this.base = null;
    this.userinfo = null;
  }

  public BaseResp getBase() {
    return this.base;
  }

  public AddBlacklistResp setBase(BaseResp base) {
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

  public UserInfo getUserinfo() {
    return this.userinfo;
  }

  public AddBlacklistResp setUserinfo(UserInfo userinfo) {
    this.userinfo = userinfo;
    return this;
  }

  public void unsetUserinfo() {
    this.userinfo = null;
  }

  /** Returns true if field userinfo is set (has been assigned a value) and false otherwise */
  public boolean isSetUserinfo() {
    return this.userinfo != null;
  }

  public void setUserinfoIsSet(boolean value) {
    if (!value) {
      this.userinfo = null;
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

    case USERINFO:
      if (value == null) {
        unsetUserinfo();
      } else {
        setUserinfo((UserInfo)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BASE:
      return getBase();

    case USERINFO:
      return getUserinfo();

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
    case USERINFO:
      return isSetUserinfo();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AddBlacklistResp)
      return this.equals((AddBlacklistResp)that);
    return false;
  }

  public boolean equals(AddBlacklistResp that) {
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

    boolean this_present_userinfo = true && this.isSetUserinfo();
    boolean that_present_userinfo = true && that.isSetUserinfo();
    if (this_present_userinfo || that_present_userinfo) {
      if (!(this_present_userinfo && that_present_userinfo))
        return false;
      if (!this.userinfo.equals(that.userinfo))
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

    boolean present_userinfo = true && (isSetUserinfo());
    list.add(present_userinfo);
    if (present_userinfo)
      list.add(userinfo);

    return list.hashCode();
  }

  @Override
  public int compareTo(AddBlacklistResp other) {
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
    lastComparison = Boolean.valueOf(isSetUserinfo()).compareTo(other.isSetUserinfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserinfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userinfo, other.userinfo);
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
    StringBuilder sb = new StringBuilder("AddBlacklistResp(");
    boolean first = true;

    sb.append("base:");
    if (this.base == null) {
      sb.append("null");
    } else {
      sb.append(this.base);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userinfo:");
    if (this.userinfo == null) {
      sb.append("null");
    } else {
      sb.append(this.userinfo);
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
    if (userinfo != null) {
      userinfo.validate();
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

  private static class AddBlacklistRespStandardSchemeFactory implements SchemeFactory {
    public AddBlacklistRespStandardScheme getScheme() {
      return new AddBlacklistRespStandardScheme();
    }
  }

  private static class AddBlacklistRespStandardScheme extends StandardScheme<AddBlacklistResp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AddBlacklistResp struct) throws org.apache.thrift.TException {
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
          case 2: // USERINFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.userinfo = new UserInfo();
              struct.userinfo.read(iprot);
              struct.setUserinfoIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AddBlacklistResp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.base != null) {
        oprot.writeFieldBegin(BASE_FIELD_DESC);
        struct.base.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.userinfo != null) {
        oprot.writeFieldBegin(USERINFO_FIELD_DESC);
        struct.userinfo.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AddBlacklistRespTupleSchemeFactory implements SchemeFactory {
    public AddBlacklistRespTupleScheme getScheme() {
      return new AddBlacklistRespTupleScheme();
    }
  }

  private static class AddBlacklistRespTupleScheme extends TupleScheme<AddBlacklistResp> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AddBlacklistResp struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBase()) {
        optionals.set(0);
      }
      if (struct.isSetUserinfo()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetBase()) {
        struct.base.write(oprot);
      }
      if (struct.isSetUserinfo()) {
        struct.userinfo.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AddBlacklistResp struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.base = new BaseResp();
        struct.base.read(iprot);
        struct.setBaseIsSet(true);
      }
      if (incoming.get(1)) {
        struct.userinfo = new UserInfo();
        struct.userinfo.read(iprot);
        struct.setUserinfoIsSet(true);
      }
    }
  }

}

