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
public class GetFriendsInfoReq implements org.apache.thrift.TBase<GetFriendsInfoReq, GetFriendsInfoReq._Fields>, java.io.Serializable, Cloneable, Comparable<GetFriendsInfoReq> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetFriendsInfoReq");

  private static final org.apache.thrift.protocol.TField TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("token", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("data", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField BASE_FIELD_DESC = new org.apache.thrift.protocol.TField("Base", org.apache.thrift.protocol.TType.STRUCT, (short)255);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetFriendsInfoReqStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetFriendsInfoReqTupleSchemeFactory());
  }

  public String token; // required
  public GetFriendsInfo data; // required
  public thrift_gen.base.Base Base; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TOKEN((short)1, "token"),
    DATA((short)2, "data"),
    BASE((short)255, "Base");

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
        case 1: // TOKEN
          return TOKEN;
        case 2: // DATA
          return DATA;
        case 255: // BASE
          return BASE;
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
  private static final _Fields optionals[] = {_Fields.BASE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOKEN, new org.apache.thrift.meta_data.FieldMetaData("token", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DATA, new org.apache.thrift.meta_data.FieldMetaData("data", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, GetFriendsInfo.class)));
    tmpMap.put(_Fields.BASE, new org.apache.thrift.meta_data.FieldMetaData("Base", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, thrift_gen.base.Base.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetFriendsInfoReq.class, metaDataMap);
  }

  public GetFriendsInfoReq() {
  }

  public GetFriendsInfoReq(
    String token,
    GetFriendsInfo data)
  {
    this();
    this.token = token;
    this.data = data;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetFriendsInfoReq(GetFriendsInfoReq other) {
    if (other.isSetToken()) {
      this.token = other.token;
    }
    if (other.isSetData()) {
      this.data = new GetFriendsInfo(other.data);
    }
    if (other.isSetBase()) {
      this.Base = new thrift_gen.base.Base(other.Base);
    }
  }

  public GetFriendsInfoReq deepCopy() {
    return new GetFriendsInfoReq(this);
  }

  @Override
  public void clear() {
    this.token = null;
    this.data = null;
    this.Base = null;
  }

  public String getToken() {
    return this.token;
  }

  public GetFriendsInfoReq setToken(String token) {
    this.token = token;
    return this;
  }

  public void unsetToken() {
    this.token = null;
  }

  /** Returns true if field token is set (has been assigned a value) and false otherwise */
  public boolean isSetToken() {
    return this.token != null;
  }

  public void setTokenIsSet(boolean value) {
    if (!value) {
      this.token = null;
    }
  }

  public GetFriendsInfo getData() {
    return this.data;
  }

  public GetFriendsInfoReq setData(GetFriendsInfo data) {
    this.data = data;
    return this;
  }

  public void unsetData() {
    this.data = null;
  }

  /** Returns true if field data is set (has been assigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }

  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }

  public thrift_gen.base.Base getBase() {
    return this.Base;
  }

  public GetFriendsInfoReq setBase(thrift_gen.base.Base Base) {
    this.Base = Base;
    return this;
  }

  public void unsetBase() {
    this.Base = null;
  }

  /** Returns true if field Base is set (has been assigned a value) and false otherwise */
  public boolean isSetBase() {
    return this.Base != null;
  }

  public void setBaseIsSet(boolean value) {
    if (!value) {
      this.Base = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOKEN:
      if (value == null) {
        unsetToken();
      } else {
        setToken((String)value);
      }
      break;

    case DATA:
      if (value == null) {
        unsetData();
      } else {
        setData((GetFriendsInfo)value);
      }
      break;

    case BASE:
      if (value == null) {
        unsetBase();
      } else {
        setBase((thrift_gen.base.Base)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOKEN:
      return getToken();

    case DATA:
      return getData();

    case BASE:
      return getBase();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOKEN:
      return isSetToken();
    case DATA:
      return isSetData();
    case BASE:
      return isSetBase();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetFriendsInfoReq)
      return this.equals((GetFriendsInfoReq)that);
    return false;
  }

  public boolean equals(GetFriendsInfoReq that) {
    if (that == null)
      return false;

    boolean this_present_token = true && this.isSetToken();
    boolean that_present_token = true && that.isSetToken();
    if (this_present_token || that_present_token) {
      if (!(this_present_token && that_present_token))
        return false;
      if (!this.token.equals(that.token))
        return false;
    }

    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
        return false;
    }

    boolean this_present_Base = true && this.isSetBase();
    boolean that_present_Base = true && that.isSetBase();
    if (this_present_Base || that_present_Base) {
      if (!(this_present_Base && that_present_Base))
        return false;
      if (!this.Base.equals(that.Base))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_token = true && (isSetToken());
    list.add(present_token);
    if (present_token)
      list.add(token);

    boolean present_data = true && (isSetData());
    list.add(present_data);
    if (present_data)
      list.add(data);

    boolean present_Base = true && (isSetBase());
    list.add(present_Base);
    if (present_Base)
      list.add(Base);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetFriendsInfoReq other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetToken()).compareTo(other.isSetToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.token, other.token);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetData()).compareTo(other.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data, other.data);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBase()).compareTo(other.isSetBase());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBase()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Base, other.Base);
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
    StringBuilder sb = new StringBuilder("GetFriendsInfoReq(");
    boolean first = true;

    sb.append("token:");
    if (this.token == null) {
      sb.append("null");
    } else {
      sb.append(this.token);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("data:");
    if (this.data == null) {
      sb.append("null");
    } else {
      sb.append(this.data);
    }
    first = false;
    if (isSetBase()) {
      if (!first) sb.append(", ");
      sb.append("Base:");
      if (this.Base == null) {
        sb.append("null");
      } else {
        sb.append(this.Base);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (data != null) {
      data.validate();
    }
    if (Base != null) {
      Base.validate();
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

  private static class GetFriendsInfoReqStandardSchemeFactory implements SchemeFactory {
    public GetFriendsInfoReqStandardScheme getScheme() {
      return new GetFriendsInfoReqStandardScheme();
    }
  }

  private static class GetFriendsInfoReqStandardScheme extends StandardScheme<GetFriendsInfoReq> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetFriendsInfoReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.token = iprot.readString();
              struct.setTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.data = new GetFriendsInfo();
              struct.data.read(iprot);
              struct.setDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 255: // BASE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.Base = new thrift_gen.base.Base();
              struct.Base.read(iprot);
              struct.setBaseIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetFriendsInfoReq struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.token != null) {
        oprot.writeFieldBegin(TOKEN_FIELD_DESC);
        oprot.writeString(struct.token);
        oprot.writeFieldEnd();
      }
      if (struct.data != null) {
        oprot.writeFieldBegin(DATA_FIELD_DESC);
        struct.data.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.Base != null) {
        if (struct.isSetBase()) {
          oprot.writeFieldBegin(BASE_FIELD_DESC);
          struct.Base.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetFriendsInfoReqTupleSchemeFactory implements SchemeFactory {
    public GetFriendsInfoReqTupleScheme getScheme() {
      return new GetFriendsInfoReqTupleScheme();
    }
  }

  private static class GetFriendsInfoReqTupleScheme extends TupleScheme<GetFriendsInfoReq> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetFriendsInfoReq struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetToken()) {
        optionals.set(0);
      }
      if (struct.isSetData()) {
        optionals.set(1);
      }
      if (struct.isSetBase()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetToken()) {
        oprot.writeString(struct.token);
      }
      if (struct.isSetData()) {
        struct.data.write(oprot);
      }
      if (struct.isSetBase()) {
        struct.Base.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetFriendsInfoReq struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.token = iprot.readString();
        struct.setTokenIsSet(true);
      }
      if (incoming.get(1)) {
        struct.data = new GetFriendsInfo();
        struct.data.read(iprot);
        struct.setDataIsSet(true);
      }
      if (incoming.get(2)) {
        struct.Base = new thrift_gen.base.Base();
        struct.Base.read(iprot);
        struct.setBaseIsSet(true);
      }
    }
  }

}

