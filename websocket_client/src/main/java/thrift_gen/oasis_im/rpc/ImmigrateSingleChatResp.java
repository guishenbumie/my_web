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
public class ImmigrateSingleChatResp implements org.apache.thrift.TBase<ImmigrateSingleChatResp, ImmigrateSingleChatResp._Fields>, java.io.Serializable, Cloneable, Comparable<ImmigrateSingleChatResp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ImmigrateSingleChatResp");

  private static final org.apache.thrift.protocol.TField BASE_FIELD_DESC = new org.apache.thrift.protocol.TField("base", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField KEYS_FIELD_DESC = new org.apache.thrift.protocol.TField("keys", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ImmigrateSingleChatRespStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ImmigrateSingleChatRespTupleSchemeFactory());
  }

  public BaseResp base; // required
  public List<String> keys; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BASE((short)1, "base"),
    KEYS((short)2, "keys");

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
        case 2: // KEYS
          return KEYS;
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
    tmpMap.put(_Fields.KEYS, new org.apache.thrift.meta_data.FieldMetaData("keys", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ImmigrateSingleChatResp.class, metaDataMap);
  }

  public ImmigrateSingleChatResp() {
  }

  public ImmigrateSingleChatResp(
    BaseResp base,
    List<String> keys)
  {
    this();
    this.base = base;
    this.keys = keys;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ImmigrateSingleChatResp(ImmigrateSingleChatResp other) {
    if (other.isSetBase()) {
      this.base = new BaseResp(other.base);
    }
    if (other.isSetKeys()) {
      List<String> __this__keys = new ArrayList<String>(other.keys);
      this.keys = __this__keys;
    }
  }

  public ImmigrateSingleChatResp deepCopy() {
    return new ImmigrateSingleChatResp(this);
  }

  @Override
  public void clear() {
    this.base = null;
    this.keys = null;
  }

  public BaseResp getBase() {
    return this.base;
  }

  public ImmigrateSingleChatResp setBase(BaseResp base) {
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

  public int getKeysSize() {
    return (this.keys == null) ? 0 : this.keys.size();
  }

  public java.util.Iterator<String> getKeysIterator() {
    return (this.keys == null) ? null : this.keys.iterator();
  }

  public void addToKeys(String elem) {
    if (this.keys == null) {
      this.keys = new ArrayList<String>();
    }
    this.keys.add(elem);
  }

  public List<String> getKeys() {
    return this.keys;
  }

  public ImmigrateSingleChatResp setKeys(List<String> keys) {
    this.keys = keys;
    return this;
  }

  public void unsetKeys() {
    this.keys = null;
  }

  /** Returns true if field keys is set (has been assigned a value) and false otherwise */
  public boolean isSetKeys() {
    return this.keys != null;
  }

  public void setKeysIsSet(boolean value) {
    if (!value) {
      this.keys = null;
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

    case KEYS:
      if (value == null) {
        unsetKeys();
      } else {
        setKeys((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BASE:
      return getBase();

    case KEYS:
      return getKeys();

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
    case KEYS:
      return isSetKeys();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ImmigrateSingleChatResp)
      return this.equals((ImmigrateSingleChatResp)that);
    return false;
  }

  public boolean equals(ImmigrateSingleChatResp that) {
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

    boolean this_present_keys = true && this.isSetKeys();
    boolean that_present_keys = true && that.isSetKeys();
    if (this_present_keys || that_present_keys) {
      if (!(this_present_keys && that_present_keys))
        return false;
      if (!this.keys.equals(that.keys))
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

    boolean present_keys = true && (isSetKeys());
    list.add(present_keys);
    if (present_keys)
      list.add(keys);

    return list.hashCode();
  }

  @Override
  public int compareTo(ImmigrateSingleChatResp other) {
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
    lastComparison = Boolean.valueOf(isSetKeys()).compareTo(other.isSetKeys());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKeys()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.keys, other.keys);
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
    StringBuilder sb = new StringBuilder("ImmigrateSingleChatResp(");
    boolean first = true;

    sb.append("base:");
    if (this.base == null) {
      sb.append("null");
    } else {
      sb.append(this.base);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("keys:");
    if (this.keys == null) {
      sb.append("null");
    } else {
      sb.append(this.keys);
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

  private static class ImmigrateSingleChatRespStandardSchemeFactory implements SchemeFactory {
    public ImmigrateSingleChatRespStandardScheme getScheme() {
      return new ImmigrateSingleChatRespStandardScheme();
    }
  }

  private static class ImmigrateSingleChatRespStandardScheme extends StandardScheme<ImmigrateSingleChatResp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ImmigrateSingleChatResp struct) throws org.apache.thrift.TException {
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
          case 2: // KEYS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list212 = iprot.readListBegin();
                struct.keys = new ArrayList<String>(_list212.size);
                String _elem213;
                for (int _i214 = 0; _i214 < _list212.size; ++_i214)
                {
                  _elem213 = iprot.readString();
                  struct.keys.add(_elem213);
                }
                iprot.readListEnd();
              }
              struct.setKeysIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ImmigrateSingleChatResp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.base != null) {
        oprot.writeFieldBegin(BASE_FIELD_DESC);
        struct.base.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.keys != null) {
        oprot.writeFieldBegin(KEYS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.keys.size()));
          for (String _iter215 : struct.keys)
          {
            oprot.writeString(_iter215);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ImmigrateSingleChatRespTupleSchemeFactory implements SchemeFactory {
    public ImmigrateSingleChatRespTupleScheme getScheme() {
      return new ImmigrateSingleChatRespTupleScheme();
    }
  }

  private static class ImmigrateSingleChatRespTupleScheme extends TupleScheme<ImmigrateSingleChatResp> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ImmigrateSingleChatResp struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBase()) {
        optionals.set(0);
      }
      if (struct.isSetKeys()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetBase()) {
        struct.base.write(oprot);
      }
      if (struct.isSetKeys()) {
        {
          oprot.writeI32(struct.keys.size());
          for (String _iter216 : struct.keys)
          {
            oprot.writeString(_iter216);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ImmigrateSingleChatResp struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.base = new BaseResp();
        struct.base.read(iprot);
        struct.setBaseIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list217 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.keys = new ArrayList<String>(_list217.size);
          String _elem218;
          for (int _i219 = 0; _i219 < _list217.size; ++_i219)
          {
            _elem218 = iprot.readString();
            struct.keys.add(_elem218);
          }
        }
        struct.setKeysIsSet(true);
      }
    }
  }

}

