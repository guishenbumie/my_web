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
public class CreateCrossGlobalChannelResp implements org.apache.thrift.TBase<CreateCrossGlobalChannelResp, CreateCrossGlobalChannelResp._Fields>, java.io.Serializable, Cloneable, Comparable<CreateCrossGlobalChannelResp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CreateCrossGlobalChannelResp");

  private static final org.apache.thrift.protocol.TField BASE_FIELD_DESC = new org.apache.thrift.protocol.TField("base", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField KEY_ID_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("keyIdMap", org.apache.thrift.protocol.TType.MAP, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CreateCrossGlobalChannelRespStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CreateCrossGlobalChannelRespTupleSchemeFactory());
  }

  public BaseResp base; // required
  public Map<String,String> keyIdMap; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BASE((short)1, "base"),
    KEY_ID_MAP((short)2, "keyIdMap");

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
        case 2: // KEY_ID_MAP
          return KEY_ID_MAP;
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
    tmpMap.put(_Fields.KEY_ID_MAP, new org.apache.thrift.meta_data.FieldMetaData("keyIdMap", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CreateCrossGlobalChannelResp.class, metaDataMap);
  }

  public CreateCrossGlobalChannelResp() {
  }

  public CreateCrossGlobalChannelResp(
    BaseResp base,
    Map<String,String> keyIdMap)
  {
    this();
    this.base = base;
    this.keyIdMap = keyIdMap;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CreateCrossGlobalChannelResp(CreateCrossGlobalChannelResp other) {
    if (other.isSetBase()) {
      this.base = new BaseResp(other.base);
    }
    if (other.isSetKeyIdMap()) {
      Map<String,String> __this__keyIdMap = new HashMap<String,String>(other.keyIdMap);
      this.keyIdMap = __this__keyIdMap;
    }
  }

  public CreateCrossGlobalChannelResp deepCopy() {
    return new CreateCrossGlobalChannelResp(this);
  }

  @Override
  public void clear() {
    this.base = null;
    this.keyIdMap = null;
  }

  public BaseResp getBase() {
    return this.base;
  }

  public CreateCrossGlobalChannelResp setBase(BaseResp base) {
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

  public int getKeyIdMapSize() {
    return (this.keyIdMap == null) ? 0 : this.keyIdMap.size();
  }

  public void putToKeyIdMap(String key, String val) {
    if (this.keyIdMap == null) {
      this.keyIdMap = new HashMap<String,String>();
    }
    this.keyIdMap.put(key, val);
  }

  public Map<String,String> getKeyIdMap() {
    return this.keyIdMap;
  }

  public CreateCrossGlobalChannelResp setKeyIdMap(Map<String,String> keyIdMap) {
    this.keyIdMap = keyIdMap;
    return this;
  }

  public void unsetKeyIdMap() {
    this.keyIdMap = null;
  }

  /** Returns true if field keyIdMap is set (has been assigned a value) and false otherwise */
  public boolean isSetKeyIdMap() {
    return this.keyIdMap != null;
  }

  public void setKeyIdMapIsSet(boolean value) {
    if (!value) {
      this.keyIdMap = null;
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

    case KEY_ID_MAP:
      if (value == null) {
        unsetKeyIdMap();
      } else {
        setKeyIdMap((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BASE:
      return getBase();

    case KEY_ID_MAP:
      return getKeyIdMap();

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
    case KEY_ID_MAP:
      return isSetKeyIdMap();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CreateCrossGlobalChannelResp)
      return this.equals((CreateCrossGlobalChannelResp)that);
    return false;
  }

  public boolean equals(CreateCrossGlobalChannelResp that) {
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

    boolean this_present_keyIdMap = true && this.isSetKeyIdMap();
    boolean that_present_keyIdMap = true && that.isSetKeyIdMap();
    if (this_present_keyIdMap || that_present_keyIdMap) {
      if (!(this_present_keyIdMap && that_present_keyIdMap))
        return false;
      if (!this.keyIdMap.equals(that.keyIdMap))
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

    boolean present_keyIdMap = true && (isSetKeyIdMap());
    list.add(present_keyIdMap);
    if (present_keyIdMap)
      list.add(keyIdMap);

    return list.hashCode();
  }

  @Override
  public int compareTo(CreateCrossGlobalChannelResp other) {
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
    lastComparison = Boolean.valueOf(isSetKeyIdMap()).compareTo(other.isSetKeyIdMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKeyIdMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.keyIdMap, other.keyIdMap);
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
    StringBuilder sb = new StringBuilder("CreateCrossGlobalChannelResp(");
    boolean first = true;

    sb.append("base:");
    if (this.base == null) {
      sb.append("null");
    } else {
      sb.append(this.base);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("keyIdMap:");
    if (this.keyIdMap == null) {
      sb.append("null");
    } else {
      sb.append(this.keyIdMap);
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

  private static class CreateCrossGlobalChannelRespStandardSchemeFactory implements SchemeFactory {
    public CreateCrossGlobalChannelRespStandardScheme getScheme() {
      return new CreateCrossGlobalChannelRespStandardScheme();
    }
  }

  private static class CreateCrossGlobalChannelRespStandardScheme extends StandardScheme<CreateCrossGlobalChannelResp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CreateCrossGlobalChannelResp struct) throws org.apache.thrift.TException {
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
          case 2: // KEY_ID_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map592 = iprot.readMapBegin();
                struct.keyIdMap = new HashMap<String,String>(2*_map592.size);
                String _key593;
                String _val594;
                for (int _i595 = 0; _i595 < _map592.size; ++_i595)
                {
                  _key593 = iprot.readString();
                  _val594 = iprot.readString();
                  struct.keyIdMap.put(_key593, _val594);
                }
                iprot.readMapEnd();
              }
              struct.setKeyIdMapIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CreateCrossGlobalChannelResp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.base != null) {
        oprot.writeFieldBegin(BASE_FIELD_DESC);
        struct.base.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.keyIdMap != null) {
        oprot.writeFieldBegin(KEY_ID_MAP_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.keyIdMap.size()));
          for (Map.Entry<String, String> _iter596 : struct.keyIdMap.entrySet())
          {
            oprot.writeString(_iter596.getKey());
            oprot.writeString(_iter596.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CreateCrossGlobalChannelRespTupleSchemeFactory implements SchemeFactory {
    public CreateCrossGlobalChannelRespTupleScheme getScheme() {
      return new CreateCrossGlobalChannelRespTupleScheme();
    }
  }

  private static class CreateCrossGlobalChannelRespTupleScheme extends TupleScheme<CreateCrossGlobalChannelResp> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CreateCrossGlobalChannelResp struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBase()) {
        optionals.set(0);
      }
      if (struct.isSetKeyIdMap()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetBase()) {
        struct.base.write(oprot);
      }
      if (struct.isSetKeyIdMap()) {
        {
          oprot.writeI32(struct.keyIdMap.size());
          for (Map.Entry<String, String> _iter597 : struct.keyIdMap.entrySet())
          {
            oprot.writeString(_iter597.getKey());
            oprot.writeString(_iter597.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CreateCrossGlobalChannelResp struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.base = new BaseResp();
        struct.base.read(iprot);
        struct.setBaseIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map598 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.keyIdMap = new HashMap<String,String>(2*_map598.size);
          String _key599;
          String _val600;
          for (int _i601 = 0; _i601 < _map598.size; ++_i601)
          {
            _key599 = iprot.readString();
            _val600 = iprot.readString();
            struct.keyIdMap.put(_key599, _val600);
          }
        }
        struct.setKeyIdMapIsSet(true);
      }
    }
  }

}

