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
public class GetNewestSeqBatchResp implements org.apache.thrift.TBase<GetNewestSeqBatchResp, GetNewestSeqBatchResp._Fields>, java.io.Serializable, Cloneable, Comparable<GetNewestSeqBatchResp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetNewestSeqBatchResp");

  private static final org.apache.thrift.protocol.TField BASE_FIELD_DESC = new org.apache.thrift.protocol.TField("base", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField SINGLE_SEQ_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("singleSeqMap", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField GROUP_SEQ_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("groupSeqMap", org.apache.thrift.protocol.TType.MAP, (short)3);
  private static final org.apache.thrift.protocol.TField GLOBAL_SEQ_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("globalSeqMap", org.apache.thrift.protocol.TType.MAP, (short)4);
  private static final org.apache.thrift.protocol.TField CROSS_SEQ_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("crossSeqMap", org.apache.thrift.protocol.TType.MAP, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetNewestSeqBatchRespStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetNewestSeqBatchRespTupleSchemeFactory());
  }

  public BaseResp base; // required
  public Map<String,Long> singleSeqMap; // required
  public Map<String,Long> groupSeqMap; // required
  public Map<String,Long> globalSeqMap; // required
  public Map<String,Long> crossSeqMap; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BASE((short)1, "base"),
    SINGLE_SEQ_MAP((short)2, "singleSeqMap"),
    GROUP_SEQ_MAP((short)3, "groupSeqMap"),
    GLOBAL_SEQ_MAP((short)4, "globalSeqMap"),
    CROSS_SEQ_MAP((short)5, "crossSeqMap");

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
        case 2: // SINGLE_SEQ_MAP
          return SINGLE_SEQ_MAP;
        case 3: // GROUP_SEQ_MAP
          return GROUP_SEQ_MAP;
        case 4: // GLOBAL_SEQ_MAP
          return GLOBAL_SEQ_MAP;
        case 5: // CROSS_SEQ_MAP
          return CROSS_SEQ_MAP;
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
    tmpMap.put(_Fields.SINGLE_SEQ_MAP, new org.apache.thrift.meta_data.FieldMetaData("singleSeqMap", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.GROUP_SEQ_MAP, new org.apache.thrift.meta_data.FieldMetaData("groupSeqMap", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.GLOBAL_SEQ_MAP, new org.apache.thrift.meta_data.FieldMetaData("globalSeqMap", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.CROSS_SEQ_MAP, new org.apache.thrift.meta_data.FieldMetaData("crossSeqMap", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetNewestSeqBatchResp.class, metaDataMap);
  }

  public GetNewestSeqBatchResp() {
  }

  public GetNewestSeqBatchResp(
    BaseResp base,
    Map<String,Long> singleSeqMap,
    Map<String,Long> groupSeqMap,
    Map<String,Long> globalSeqMap,
    Map<String,Long> crossSeqMap)
  {
    this();
    this.base = base;
    this.singleSeqMap = singleSeqMap;
    this.groupSeqMap = groupSeqMap;
    this.globalSeqMap = globalSeqMap;
    this.crossSeqMap = crossSeqMap;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetNewestSeqBatchResp(GetNewestSeqBatchResp other) {
    if (other.isSetBase()) {
      this.base = new BaseResp(other.base);
    }
    if (other.isSetSingleSeqMap()) {
      Map<String,Long> __this__singleSeqMap = new HashMap<String,Long>(other.singleSeqMap);
      this.singleSeqMap = __this__singleSeqMap;
    }
    if (other.isSetGroupSeqMap()) {
      Map<String,Long> __this__groupSeqMap = new HashMap<String,Long>(other.groupSeqMap);
      this.groupSeqMap = __this__groupSeqMap;
    }
    if (other.isSetGlobalSeqMap()) {
      Map<String,Long> __this__globalSeqMap = new HashMap<String,Long>(other.globalSeqMap);
      this.globalSeqMap = __this__globalSeqMap;
    }
    if (other.isSetCrossSeqMap()) {
      Map<String,Long> __this__crossSeqMap = new HashMap<String,Long>(other.crossSeqMap);
      this.crossSeqMap = __this__crossSeqMap;
    }
  }

  public GetNewestSeqBatchResp deepCopy() {
    return new GetNewestSeqBatchResp(this);
  }

  @Override
  public void clear() {
    this.base = null;
    this.singleSeqMap = null;
    this.groupSeqMap = null;
    this.globalSeqMap = null;
    this.crossSeqMap = null;
  }

  public BaseResp getBase() {
    return this.base;
  }

  public GetNewestSeqBatchResp setBase(BaseResp base) {
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

  public int getSingleSeqMapSize() {
    return (this.singleSeqMap == null) ? 0 : this.singleSeqMap.size();
  }

  public void putToSingleSeqMap(String key, long val) {
    if (this.singleSeqMap == null) {
      this.singleSeqMap = new HashMap<String,Long>();
    }
    this.singleSeqMap.put(key, val);
  }

  public Map<String,Long> getSingleSeqMap() {
    return this.singleSeqMap;
  }

  public GetNewestSeqBatchResp setSingleSeqMap(Map<String,Long> singleSeqMap) {
    this.singleSeqMap = singleSeqMap;
    return this;
  }

  public void unsetSingleSeqMap() {
    this.singleSeqMap = null;
  }

  /** Returns true if field singleSeqMap is set (has been assigned a value) and false otherwise */
  public boolean isSetSingleSeqMap() {
    return this.singleSeqMap != null;
  }

  public void setSingleSeqMapIsSet(boolean value) {
    if (!value) {
      this.singleSeqMap = null;
    }
  }

  public int getGroupSeqMapSize() {
    return (this.groupSeqMap == null) ? 0 : this.groupSeqMap.size();
  }

  public void putToGroupSeqMap(String key, long val) {
    if (this.groupSeqMap == null) {
      this.groupSeqMap = new HashMap<String,Long>();
    }
    this.groupSeqMap.put(key, val);
  }

  public Map<String,Long> getGroupSeqMap() {
    return this.groupSeqMap;
  }

  public GetNewestSeqBatchResp setGroupSeqMap(Map<String,Long> groupSeqMap) {
    this.groupSeqMap = groupSeqMap;
    return this;
  }

  public void unsetGroupSeqMap() {
    this.groupSeqMap = null;
  }

  /** Returns true if field groupSeqMap is set (has been assigned a value) and false otherwise */
  public boolean isSetGroupSeqMap() {
    return this.groupSeqMap != null;
  }

  public void setGroupSeqMapIsSet(boolean value) {
    if (!value) {
      this.groupSeqMap = null;
    }
  }

  public int getGlobalSeqMapSize() {
    return (this.globalSeqMap == null) ? 0 : this.globalSeqMap.size();
  }

  public void putToGlobalSeqMap(String key, long val) {
    if (this.globalSeqMap == null) {
      this.globalSeqMap = new HashMap<String,Long>();
    }
    this.globalSeqMap.put(key, val);
  }

  public Map<String,Long> getGlobalSeqMap() {
    return this.globalSeqMap;
  }

  public GetNewestSeqBatchResp setGlobalSeqMap(Map<String,Long> globalSeqMap) {
    this.globalSeqMap = globalSeqMap;
    return this;
  }

  public void unsetGlobalSeqMap() {
    this.globalSeqMap = null;
  }

  /** Returns true if field globalSeqMap is set (has been assigned a value) and false otherwise */
  public boolean isSetGlobalSeqMap() {
    return this.globalSeqMap != null;
  }

  public void setGlobalSeqMapIsSet(boolean value) {
    if (!value) {
      this.globalSeqMap = null;
    }
  }

  public int getCrossSeqMapSize() {
    return (this.crossSeqMap == null) ? 0 : this.crossSeqMap.size();
  }

  public void putToCrossSeqMap(String key, long val) {
    if (this.crossSeqMap == null) {
      this.crossSeqMap = new HashMap<String,Long>();
    }
    this.crossSeqMap.put(key, val);
  }

  public Map<String,Long> getCrossSeqMap() {
    return this.crossSeqMap;
  }

  public GetNewestSeqBatchResp setCrossSeqMap(Map<String,Long> crossSeqMap) {
    this.crossSeqMap = crossSeqMap;
    return this;
  }

  public void unsetCrossSeqMap() {
    this.crossSeqMap = null;
  }

  /** Returns true if field crossSeqMap is set (has been assigned a value) and false otherwise */
  public boolean isSetCrossSeqMap() {
    return this.crossSeqMap != null;
  }

  public void setCrossSeqMapIsSet(boolean value) {
    if (!value) {
      this.crossSeqMap = null;
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

    case SINGLE_SEQ_MAP:
      if (value == null) {
        unsetSingleSeqMap();
      } else {
        setSingleSeqMap((Map<String,Long>)value);
      }
      break;

    case GROUP_SEQ_MAP:
      if (value == null) {
        unsetGroupSeqMap();
      } else {
        setGroupSeqMap((Map<String,Long>)value);
      }
      break;

    case GLOBAL_SEQ_MAP:
      if (value == null) {
        unsetGlobalSeqMap();
      } else {
        setGlobalSeqMap((Map<String,Long>)value);
      }
      break;

    case CROSS_SEQ_MAP:
      if (value == null) {
        unsetCrossSeqMap();
      } else {
        setCrossSeqMap((Map<String,Long>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BASE:
      return getBase();

    case SINGLE_SEQ_MAP:
      return getSingleSeqMap();

    case GROUP_SEQ_MAP:
      return getGroupSeqMap();

    case GLOBAL_SEQ_MAP:
      return getGlobalSeqMap();

    case CROSS_SEQ_MAP:
      return getCrossSeqMap();

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
    case SINGLE_SEQ_MAP:
      return isSetSingleSeqMap();
    case GROUP_SEQ_MAP:
      return isSetGroupSeqMap();
    case GLOBAL_SEQ_MAP:
      return isSetGlobalSeqMap();
    case CROSS_SEQ_MAP:
      return isSetCrossSeqMap();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetNewestSeqBatchResp)
      return this.equals((GetNewestSeqBatchResp)that);
    return false;
  }

  public boolean equals(GetNewestSeqBatchResp that) {
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

    boolean this_present_singleSeqMap = true && this.isSetSingleSeqMap();
    boolean that_present_singleSeqMap = true && that.isSetSingleSeqMap();
    if (this_present_singleSeqMap || that_present_singleSeqMap) {
      if (!(this_present_singleSeqMap && that_present_singleSeqMap))
        return false;
      if (!this.singleSeqMap.equals(that.singleSeqMap))
        return false;
    }

    boolean this_present_groupSeqMap = true && this.isSetGroupSeqMap();
    boolean that_present_groupSeqMap = true && that.isSetGroupSeqMap();
    if (this_present_groupSeqMap || that_present_groupSeqMap) {
      if (!(this_present_groupSeqMap && that_present_groupSeqMap))
        return false;
      if (!this.groupSeqMap.equals(that.groupSeqMap))
        return false;
    }

    boolean this_present_globalSeqMap = true && this.isSetGlobalSeqMap();
    boolean that_present_globalSeqMap = true && that.isSetGlobalSeqMap();
    if (this_present_globalSeqMap || that_present_globalSeqMap) {
      if (!(this_present_globalSeqMap && that_present_globalSeqMap))
        return false;
      if (!this.globalSeqMap.equals(that.globalSeqMap))
        return false;
    }

    boolean this_present_crossSeqMap = true && this.isSetCrossSeqMap();
    boolean that_present_crossSeqMap = true && that.isSetCrossSeqMap();
    if (this_present_crossSeqMap || that_present_crossSeqMap) {
      if (!(this_present_crossSeqMap && that_present_crossSeqMap))
        return false;
      if (!this.crossSeqMap.equals(that.crossSeqMap))
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

    boolean present_singleSeqMap = true && (isSetSingleSeqMap());
    list.add(present_singleSeqMap);
    if (present_singleSeqMap)
      list.add(singleSeqMap);

    boolean present_groupSeqMap = true && (isSetGroupSeqMap());
    list.add(present_groupSeqMap);
    if (present_groupSeqMap)
      list.add(groupSeqMap);

    boolean present_globalSeqMap = true && (isSetGlobalSeqMap());
    list.add(present_globalSeqMap);
    if (present_globalSeqMap)
      list.add(globalSeqMap);

    boolean present_crossSeqMap = true && (isSetCrossSeqMap());
    list.add(present_crossSeqMap);
    if (present_crossSeqMap)
      list.add(crossSeqMap);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetNewestSeqBatchResp other) {
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
    lastComparison = Boolean.valueOf(isSetSingleSeqMap()).compareTo(other.isSetSingleSeqMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSingleSeqMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.singleSeqMap, other.singleSeqMap);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGroupSeqMap()).compareTo(other.isSetGroupSeqMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGroupSeqMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.groupSeqMap, other.groupSeqMap);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGlobalSeqMap()).compareTo(other.isSetGlobalSeqMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGlobalSeqMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.globalSeqMap, other.globalSeqMap);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCrossSeqMap()).compareTo(other.isSetCrossSeqMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCrossSeqMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.crossSeqMap, other.crossSeqMap);
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
    StringBuilder sb = new StringBuilder("GetNewestSeqBatchResp(");
    boolean first = true;

    sb.append("base:");
    if (this.base == null) {
      sb.append("null");
    } else {
      sb.append(this.base);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("singleSeqMap:");
    if (this.singleSeqMap == null) {
      sb.append("null");
    } else {
      sb.append(this.singleSeqMap);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("groupSeqMap:");
    if (this.groupSeqMap == null) {
      sb.append("null");
    } else {
      sb.append(this.groupSeqMap);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("globalSeqMap:");
    if (this.globalSeqMap == null) {
      sb.append("null");
    } else {
      sb.append(this.globalSeqMap);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("crossSeqMap:");
    if (this.crossSeqMap == null) {
      sb.append("null");
    } else {
      sb.append(this.crossSeqMap);
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

  private static class GetNewestSeqBatchRespStandardSchemeFactory implements SchemeFactory {
    public GetNewestSeqBatchRespStandardScheme getScheme() {
      return new GetNewestSeqBatchRespStandardScheme();
    }
  }

  private static class GetNewestSeqBatchRespStandardScheme extends StandardScheme<GetNewestSeqBatchResp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetNewestSeqBatchResp struct) throws org.apache.thrift.TException {
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
          case 2: // SINGLE_SEQ_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map276 = iprot.readMapBegin();
                struct.singleSeqMap = new HashMap<String,Long>(2*_map276.size);
                String _key277;
                long _val278;
                for (int _i279 = 0; _i279 < _map276.size; ++_i279)
                {
                  _key277 = iprot.readString();
                  _val278 = iprot.readI64();
                  struct.singleSeqMap.put(_key277, _val278);
                }
                iprot.readMapEnd();
              }
              struct.setSingleSeqMapIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // GROUP_SEQ_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map280 = iprot.readMapBegin();
                struct.groupSeqMap = new HashMap<String,Long>(2*_map280.size);
                String _key281;
                long _val282;
                for (int _i283 = 0; _i283 < _map280.size; ++_i283)
                {
                  _key281 = iprot.readString();
                  _val282 = iprot.readI64();
                  struct.groupSeqMap.put(_key281, _val282);
                }
                iprot.readMapEnd();
              }
              struct.setGroupSeqMapIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // GLOBAL_SEQ_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map284 = iprot.readMapBegin();
                struct.globalSeqMap = new HashMap<String,Long>(2*_map284.size);
                String _key285;
                long _val286;
                for (int _i287 = 0; _i287 < _map284.size; ++_i287)
                {
                  _key285 = iprot.readString();
                  _val286 = iprot.readI64();
                  struct.globalSeqMap.put(_key285, _val286);
                }
                iprot.readMapEnd();
              }
              struct.setGlobalSeqMapIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CROSS_SEQ_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map288 = iprot.readMapBegin();
                struct.crossSeqMap = new HashMap<String,Long>(2*_map288.size);
                String _key289;
                long _val290;
                for (int _i291 = 0; _i291 < _map288.size; ++_i291)
                {
                  _key289 = iprot.readString();
                  _val290 = iprot.readI64();
                  struct.crossSeqMap.put(_key289, _val290);
                }
                iprot.readMapEnd();
              }
              struct.setCrossSeqMapIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetNewestSeqBatchResp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.base != null) {
        oprot.writeFieldBegin(BASE_FIELD_DESC);
        struct.base.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.singleSeqMap != null) {
        oprot.writeFieldBegin(SINGLE_SEQ_MAP_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I64, struct.singleSeqMap.size()));
          for (Map.Entry<String, Long> _iter292 : struct.singleSeqMap.entrySet())
          {
            oprot.writeString(_iter292.getKey());
            oprot.writeI64(_iter292.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.groupSeqMap != null) {
        oprot.writeFieldBegin(GROUP_SEQ_MAP_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I64, struct.groupSeqMap.size()));
          for (Map.Entry<String, Long> _iter293 : struct.groupSeqMap.entrySet())
          {
            oprot.writeString(_iter293.getKey());
            oprot.writeI64(_iter293.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.globalSeqMap != null) {
        oprot.writeFieldBegin(GLOBAL_SEQ_MAP_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I64, struct.globalSeqMap.size()));
          for (Map.Entry<String, Long> _iter294 : struct.globalSeqMap.entrySet())
          {
            oprot.writeString(_iter294.getKey());
            oprot.writeI64(_iter294.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.crossSeqMap != null) {
        oprot.writeFieldBegin(CROSS_SEQ_MAP_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I64, struct.crossSeqMap.size()));
          for (Map.Entry<String, Long> _iter295 : struct.crossSeqMap.entrySet())
          {
            oprot.writeString(_iter295.getKey());
            oprot.writeI64(_iter295.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetNewestSeqBatchRespTupleSchemeFactory implements SchemeFactory {
    public GetNewestSeqBatchRespTupleScheme getScheme() {
      return new GetNewestSeqBatchRespTupleScheme();
    }
  }

  private static class GetNewestSeqBatchRespTupleScheme extends TupleScheme<GetNewestSeqBatchResp> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetNewestSeqBatchResp struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBase()) {
        optionals.set(0);
      }
      if (struct.isSetSingleSeqMap()) {
        optionals.set(1);
      }
      if (struct.isSetGroupSeqMap()) {
        optionals.set(2);
      }
      if (struct.isSetGlobalSeqMap()) {
        optionals.set(3);
      }
      if (struct.isSetCrossSeqMap()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetBase()) {
        struct.base.write(oprot);
      }
      if (struct.isSetSingleSeqMap()) {
        {
          oprot.writeI32(struct.singleSeqMap.size());
          for (Map.Entry<String, Long> _iter296 : struct.singleSeqMap.entrySet())
          {
            oprot.writeString(_iter296.getKey());
            oprot.writeI64(_iter296.getValue());
          }
        }
      }
      if (struct.isSetGroupSeqMap()) {
        {
          oprot.writeI32(struct.groupSeqMap.size());
          for (Map.Entry<String, Long> _iter297 : struct.groupSeqMap.entrySet())
          {
            oprot.writeString(_iter297.getKey());
            oprot.writeI64(_iter297.getValue());
          }
        }
      }
      if (struct.isSetGlobalSeqMap()) {
        {
          oprot.writeI32(struct.globalSeqMap.size());
          for (Map.Entry<String, Long> _iter298 : struct.globalSeqMap.entrySet())
          {
            oprot.writeString(_iter298.getKey());
            oprot.writeI64(_iter298.getValue());
          }
        }
      }
      if (struct.isSetCrossSeqMap()) {
        {
          oprot.writeI32(struct.crossSeqMap.size());
          for (Map.Entry<String, Long> _iter299 : struct.crossSeqMap.entrySet())
          {
            oprot.writeString(_iter299.getKey());
            oprot.writeI64(_iter299.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetNewestSeqBatchResp struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.base = new BaseResp();
        struct.base.read(iprot);
        struct.setBaseIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map300 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.singleSeqMap = new HashMap<String,Long>(2*_map300.size);
          String _key301;
          long _val302;
          for (int _i303 = 0; _i303 < _map300.size; ++_i303)
          {
            _key301 = iprot.readString();
            _val302 = iprot.readI64();
            struct.singleSeqMap.put(_key301, _val302);
          }
        }
        struct.setSingleSeqMapIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map304 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.groupSeqMap = new HashMap<String,Long>(2*_map304.size);
          String _key305;
          long _val306;
          for (int _i307 = 0; _i307 < _map304.size; ++_i307)
          {
            _key305 = iprot.readString();
            _val306 = iprot.readI64();
            struct.groupSeqMap.put(_key305, _val306);
          }
        }
        struct.setGroupSeqMapIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TMap _map308 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.globalSeqMap = new HashMap<String,Long>(2*_map308.size);
          String _key309;
          long _val310;
          for (int _i311 = 0; _i311 < _map308.size; ++_i311)
          {
            _key309 = iprot.readString();
            _val310 = iprot.readI64();
            struct.globalSeqMap.put(_key309, _val310);
          }
        }
        struct.setGlobalSeqMapIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TMap _map312 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.crossSeqMap = new HashMap<String,Long>(2*_map312.size);
          String _key313;
          long _val314;
          for (int _i315 = 0; _i315 < _map312.size; ++_i315)
          {
            _key313 = iprot.readString();
            _val314 = iprot.readI64();
            struct.crossSeqMap.put(_key313, _val314);
          }
        }
        struct.setCrossSeqMapIsSet(true);
      }
    }
  }

}

