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
public class GetUserInfo implements org.apache.thrift.TBase<GetUserInfo, GetUserInfo._Fields>, java.io.Serializable, Cloneable, Comparable<GetUserInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetUserInfo");

  private static final org.apache.thrift.protocol.TField UID_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("uidList", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetUserInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetUserInfoTupleSchemeFactory());
  }

  public List<String> uidList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UID_LIST((short)1, "uidList");

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
        case 1: // UID_LIST
          return UID_LIST;
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
    tmpMap.put(_Fields.UID_LIST, new org.apache.thrift.meta_data.FieldMetaData("uidList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetUserInfo.class, metaDataMap);
  }

  public GetUserInfo() {
  }

  public GetUserInfo(
    List<String> uidList)
  {
    this();
    this.uidList = uidList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetUserInfo(GetUserInfo other) {
    if (other.isSetUidList()) {
      List<String> __this__uidList = new ArrayList<String>(other.uidList);
      this.uidList = __this__uidList;
    }
  }

  public GetUserInfo deepCopy() {
    return new GetUserInfo(this);
  }

  @Override
  public void clear() {
    this.uidList = null;
  }

  public int getUidListSize() {
    return (this.uidList == null) ? 0 : this.uidList.size();
  }

  public java.util.Iterator<String> getUidListIterator() {
    return (this.uidList == null) ? null : this.uidList.iterator();
  }

  public void addToUidList(String elem) {
    if (this.uidList == null) {
      this.uidList = new ArrayList<String>();
    }
    this.uidList.add(elem);
  }

  public List<String> getUidList() {
    return this.uidList;
  }

  public GetUserInfo setUidList(List<String> uidList) {
    this.uidList = uidList;
    return this;
  }

  public void unsetUidList() {
    this.uidList = null;
  }

  /** Returns true if field uidList is set (has been assigned a value) and false otherwise */
  public boolean isSetUidList() {
    return this.uidList != null;
  }

  public void setUidListIsSet(boolean value) {
    if (!value) {
      this.uidList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case UID_LIST:
      if (value == null) {
        unsetUidList();
      } else {
        setUidList((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case UID_LIST:
      return getUidList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case UID_LIST:
      return isSetUidList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetUserInfo)
      return this.equals((GetUserInfo)that);
    return false;
  }

  public boolean equals(GetUserInfo that) {
    if (that == null)
      return false;

    boolean this_present_uidList = true && this.isSetUidList();
    boolean that_present_uidList = true && that.isSetUidList();
    if (this_present_uidList || that_present_uidList) {
      if (!(this_present_uidList && that_present_uidList))
        return false;
      if (!this.uidList.equals(that.uidList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_uidList = true && (isSetUidList());
    list.add(present_uidList);
    if (present_uidList)
      list.add(uidList);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetUserInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUidList()).compareTo(other.isSetUidList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUidList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uidList, other.uidList);
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
    StringBuilder sb = new StringBuilder("GetUserInfo(");
    boolean first = true;

    sb.append("uidList:");
    if (this.uidList == null) {
      sb.append("null");
    } else {
      sb.append(this.uidList);
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

  private static class GetUserInfoStandardSchemeFactory implements SchemeFactory {
    public GetUserInfoStandardScheme getScheme() {
      return new GetUserInfoStandardScheme();
    }
  }

  private static class GetUserInfoStandardScheme extends StandardScheme<GetUserInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetUserInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // UID_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list24 = iprot.readListBegin();
                struct.uidList = new ArrayList<String>(_list24.size);
                String _elem25;
                for (int _i26 = 0; _i26 < _list24.size; ++_i26)
                {
                  _elem25 = iprot.readString();
                  struct.uidList.add(_elem25);
                }
                iprot.readListEnd();
              }
              struct.setUidListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetUserInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.uidList != null) {
        oprot.writeFieldBegin(UID_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.uidList.size()));
          for (String _iter27 : struct.uidList)
          {
            oprot.writeString(_iter27);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetUserInfoTupleSchemeFactory implements SchemeFactory {
    public GetUserInfoTupleScheme getScheme() {
      return new GetUserInfoTupleScheme();
    }
  }

  private static class GetUserInfoTupleScheme extends TupleScheme<GetUserInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetUserInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUidList()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetUidList()) {
        {
          oprot.writeI32(struct.uidList.size());
          for (String _iter28 : struct.uidList)
          {
            oprot.writeString(_iter28);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetUserInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list29 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.uidList = new ArrayList<String>(_list29.size);
          String _elem30;
          for (int _i31 = 0; _i31 < _list29.size; ++_i31)
          {
            _elem30 = iprot.readString();
            struct.uidList.add(_elem30);
          }
        }
        struct.setUidListIsSet(true);
      }
    }
  }

}

