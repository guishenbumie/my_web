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
public class CloseCrossGlobalChannelReq implements org.apache.thrift.TBase<CloseCrossGlobalChannelReq, CloseCrossGlobalChannelReq._Fields>, java.io.Serializable, Cloneable, Comparable<CloseCrossGlobalChannelReq> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CloseCrossGlobalChannelReq");

  private static final org.apache.thrift.protocol.TField TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("token", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("ids", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField BASE_FIELD_DESC = new org.apache.thrift.protocol.TField("Base", org.apache.thrift.protocol.TType.STRUCT, (short)255);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CloseCrossGlobalChannelReqStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CloseCrossGlobalChannelReqTupleSchemeFactory());
  }

  public String token; // required
  public List<String> ids; // required
  public thrift_gen.base.Base Base; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TOKEN((short)1, "token"),
    IDS((short)2, "ids"),
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
        case 2: // IDS
          return IDS;
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
    tmpMap.put(_Fields.IDS, new org.apache.thrift.meta_data.FieldMetaData("ids", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.BASE, new org.apache.thrift.meta_data.FieldMetaData("Base", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, thrift_gen.base.Base.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CloseCrossGlobalChannelReq.class, metaDataMap);
  }

  public CloseCrossGlobalChannelReq() {
  }

  public CloseCrossGlobalChannelReq(
    String token,
    List<String> ids)
  {
    this();
    this.token = token;
    this.ids = ids;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CloseCrossGlobalChannelReq(CloseCrossGlobalChannelReq other) {
    if (other.isSetToken()) {
      this.token = other.token;
    }
    if (other.isSetIds()) {
      List<String> __this__ids = new ArrayList<String>(other.ids);
      this.ids = __this__ids;
    }
    if (other.isSetBase()) {
      this.Base = new thrift_gen.base.Base(other.Base);
    }
  }

  public CloseCrossGlobalChannelReq deepCopy() {
    return new CloseCrossGlobalChannelReq(this);
  }

  @Override
  public void clear() {
    this.token = null;
    this.ids = null;
    this.Base = null;
  }

  public String getToken() {
    return this.token;
  }

  public CloseCrossGlobalChannelReq setToken(String token) {
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

  public int getIdsSize() {
    return (this.ids == null) ? 0 : this.ids.size();
  }

  public java.util.Iterator<String> getIdsIterator() {
    return (this.ids == null) ? null : this.ids.iterator();
  }

  public void addToIds(String elem) {
    if (this.ids == null) {
      this.ids = new ArrayList<String>();
    }
    this.ids.add(elem);
  }

  public List<String> getIds() {
    return this.ids;
  }

  public CloseCrossGlobalChannelReq setIds(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public void unsetIds() {
    this.ids = null;
  }

  /** Returns true if field ids is set (has been assigned a value) and false otherwise */
  public boolean isSetIds() {
    return this.ids != null;
  }

  public void setIdsIsSet(boolean value) {
    if (!value) {
      this.ids = null;
    }
  }

  public thrift_gen.base.Base getBase() {
    return this.Base;
  }

  public CloseCrossGlobalChannelReq setBase(thrift_gen.base.Base Base) {
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

    case IDS:
      if (value == null) {
        unsetIds();
      } else {
        setIds((List<String>)value);
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

    case IDS:
      return getIds();

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
    case IDS:
      return isSetIds();
    case BASE:
      return isSetBase();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CloseCrossGlobalChannelReq)
      return this.equals((CloseCrossGlobalChannelReq)that);
    return false;
  }

  public boolean equals(CloseCrossGlobalChannelReq that) {
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

    boolean this_present_ids = true && this.isSetIds();
    boolean that_present_ids = true && that.isSetIds();
    if (this_present_ids || that_present_ids) {
      if (!(this_present_ids && that_present_ids))
        return false;
      if (!this.ids.equals(that.ids))
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

    boolean present_ids = true && (isSetIds());
    list.add(present_ids);
    if (present_ids)
      list.add(ids);

    boolean present_Base = true && (isSetBase());
    list.add(present_Base);
    if (present_Base)
      list.add(Base);

    return list.hashCode();
  }

  @Override
  public int compareTo(CloseCrossGlobalChannelReq other) {
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
    lastComparison = Boolean.valueOf(isSetIds()).compareTo(other.isSetIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ids, other.ids);
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
    StringBuilder sb = new StringBuilder("CloseCrossGlobalChannelReq(");
    boolean first = true;

    sb.append("token:");
    if (this.token == null) {
      sb.append("null");
    } else {
      sb.append(this.token);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ids:");
    if (this.ids == null) {
      sb.append("null");
    } else {
      sb.append(this.ids);
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

  private static class CloseCrossGlobalChannelReqStandardSchemeFactory implements SchemeFactory {
    public CloseCrossGlobalChannelReqStandardScheme getScheme() {
      return new CloseCrossGlobalChannelReqStandardScheme();
    }
  }

  private static class CloseCrossGlobalChannelReqStandardScheme extends StandardScheme<CloseCrossGlobalChannelReq> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CloseCrossGlobalChannelReq struct) throws org.apache.thrift.TException {
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
          case 2: // IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list602 = iprot.readListBegin();
                struct.ids = new ArrayList<String>(_list602.size);
                String _elem603;
                for (int _i604 = 0; _i604 < _list602.size; ++_i604)
                {
                  _elem603 = iprot.readString();
                  struct.ids.add(_elem603);
                }
                iprot.readListEnd();
              }
              struct.setIdsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CloseCrossGlobalChannelReq struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.token != null) {
        oprot.writeFieldBegin(TOKEN_FIELD_DESC);
        oprot.writeString(struct.token);
        oprot.writeFieldEnd();
      }
      if (struct.ids != null) {
        oprot.writeFieldBegin(IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.ids.size()));
          for (String _iter605 : struct.ids)
          {
            oprot.writeString(_iter605);
          }
          oprot.writeListEnd();
        }
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

  private static class CloseCrossGlobalChannelReqTupleSchemeFactory implements SchemeFactory {
    public CloseCrossGlobalChannelReqTupleScheme getScheme() {
      return new CloseCrossGlobalChannelReqTupleScheme();
    }
  }

  private static class CloseCrossGlobalChannelReqTupleScheme extends TupleScheme<CloseCrossGlobalChannelReq> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CloseCrossGlobalChannelReq struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetToken()) {
        optionals.set(0);
      }
      if (struct.isSetIds()) {
        optionals.set(1);
      }
      if (struct.isSetBase()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetToken()) {
        oprot.writeString(struct.token);
      }
      if (struct.isSetIds()) {
        {
          oprot.writeI32(struct.ids.size());
          for (String _iter606 : struct.ids)
          {
            oprot.writeString(_iter606);
          }
        }
      }
      if (struct.isSetBase()) {
        struct.Base.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CloseCrossGlobalChannelReq struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.token = iprot.readString();
        struct.setTokenIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list607 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.ids = new ArrayList<String>(_list607.size);
          String _elem608;
          for (int _i609 = 0; _i609 < _list607.size; ++_i609)
          {
            _elem608 = iprot.readString();
            struct.ids.add(_elem608);
          }
        }
        struct.setIdsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.Base = new thrift_gen.base.Base();
        struct.Base.read(iprot);
        struct.setBaseIsSet(true);
      }
    }
  }

}

