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
public class GetGroupMemberListResp implements org.apache.thrift.TBase<GetGroupMemberListResp, GetGroupMemberListResp._Fields>, java.io.Serializable, Cloneable, Comparable<GetGroupMemberListResp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetGroupMemberListResp");

  private static final org.apache.thrift.protocol.TField BASE_FIELD_DESC = new org.apache.thrift.protocol.TField("base", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField MEMBER_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("memberList", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField NEXT_SEQ_FIELD_DESC = new org.apache.thrift.protocol.TField("nextSeq", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetGroupMemberListRespStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetGroupMemberListRespTupleSchemeFactory());
  }

  public BaseResp base; // required
  public List<GroupMemberFullInfo> memberList; // required
  public int nextSeq; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BASE((short)1, "base"),
    MEMBER_LIST((short)2, "memberList"),
    NEXT_SEQ((short)3, "nextSeq");

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
        case 2: // MEMBER_LIST
          return MEMBER_LIST;
        case 3: // NEXT_SEQ
          return NEXT_SEQ;
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
  private static final int __NEXTSEQ_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BASE, new org.apache.thrift.meta_data.FieldMetaData("base", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BaseResp.class)));
    tmpMap.put(_Fields.MEMBER_LIST, new org.apache.thrift.meta_data.FieldMetaData("memberList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, GroupMemberFullInfo.class))));
    tmpMap.put(_Fields.NEXT_SEQ, new org.apache.thrift.meta_data.FieldMetaData("nextSeq", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetGroupMemberListResp.class, metaDataMap);
  }

  public GetGroupMemberListResp() {
  }

  public GetGroupMemberListResp(
    BaseResp base,
    List<GroupMemberFullInfo> memberList,
    int nextSeq)
  {
    this();
    this.base = base;
    this.memberList = memberList;
    this.nextSeq = nextSeq;
    setNextSeqIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetGroupMemberListResp(GetGroupMemberListResp other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetBase()) {
      this.base = new BaseResp(other.base);
    }
    if (other.isSetMemberList()) {
      List<GroupMemberFullInfo> __this__memberList = new ArrayList<GroupMemberFullInfo>(other.memberList.size());
      for (GroupMemberFullInfo other_element : other.memberList) {
        __this__memberList.add(new GroupMemberFullInfo(other_element));
      }
      this.memberList = __this__memberList;
    }
    this.nextSeq = other.nextSeq;
  }

  public GetGroupMemberListResp deepCopy() {
    return new GetGroupMemberListResp(this);
  }

  @Override
  public void clear() {
    this.base = null;
    this.memberList = null;
    setNextSeqIsSet(false);
    this.nextSeq = 0;
  }

  public BaseResp getBase() {
    return this.base;
  }

  public GetGroupMemberListResp setBase(BaseResp base) {
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

  public int getMemberListSize() {
    return (this.memberList == null) ? 0 : this.memberList.size();
  }

  public java.util.Iterator<GroupMemberFullInfo> getMemberListIterator() {
    return (this.memberList == null) ? null : this.memberList.iterator();
  }

  public void addToMemberList(GroupMemberFullInfo elem) {
    if (this.memberList == null) {
      this.memberList = new ArrayList<GroupMemberFullInfo>();
    }
    this.memberList.add(elem);
  }

  public List<GroupMemberFullInfo> getMemberList() {
    return this.memberList;
  }

  public GetGroupMemberListResp setMemberList(List<GroupMemberFullInfo> memberList) {
    this.memberList = memberList;
    return this;
  }

  public void unsetMemberList() {
    this.memberList = null;
  }

  /** Returns true if field memberList is set (has been assigned a value) and false otherwise */
  public boolean isSetMemberList() {
    return this.memberList != null;
  }

  public void setMemberListIsSet(boolean value) {
    if (!value) {
      this.memberList = null;
    }
  }

  public int getNextSeq() {
    return this.nextSeq;
  }

  public GetGroupMemberListResp setNextSeq(int nextSeq) {
    this.nextSeq = nextSeq;
    setNextSeqIsSet(true);
    return this;
  }

  public void unsetNextSeq() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NEXTSEQ_ISSET_ID);
  }

  /** Returns true if field nextSeq is set (has been assigned a value) and false otherwise */
  public boolean isSetNextSeq() {
    return EncodingUtils.testBit(__isset_bitfield, __NEXTSEQ_ISSET_ID);
  }

  public void setNextSeqIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NEXTSEQ_ISSET_ID, value);
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

    case MEMBER_LIST:
      if (value == null) {
        unsetMemberList();
      } else {
        setMemberList((List<GroupMemberFullInfo>)value);
      }
      break;

    case NEXT_SEQ:
      if (value == null) {
        unsetNextSeq();
      } else {
        setNextSeq((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BASE:
      return getBase();

    case MEMBER_LIST:
      return getMemberList();

    case NEXT_SEQ:
      return getNextSeq();

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
    case MEMBER_LIST:
      return isSetMemberList();
    case NEXT_SEQ:
      return isSetNextSeq();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetGroupMemberListResp)
      return this.equals((GetGroupMemberListResp)that);
    return false;
  }

  public boolean equals(GetGroupMemberListResp that) {
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

    boolean this_present_memberList = true && this.isSetMemberList();
    boolean that_present_memberList = true && that.isSetMemberList();
    if (this_present_memberList || that_present_memberList) {
      if (!(this_present_memberList && that_present_memberList))
        return false;
      if (!this.memberList.equals(that.memberList))
        return false;
    }

    boolean this_present_nextSeq = true;
    boolean that_present_nextSeq = true;
    if (this_present_nextSeq || that_present_nextSeq) {
      if (!(this_present_nextSeq && that_present_nextSeq))
        return false;
      if (this.nextSeq != that.nextSeq)
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

    boolean present_memberList = true && (isSetMemberList());
    list.add(present_memberList);
    if (present_memberList)
      list.add(memberList);

    boolean present_nextSeq = true;
    list.add(present_nextSeq);
    if (present_nextSeq)
      list.add(nextSeq);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetGroupMemberListResp other) {
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
    lastComparison = Boolean.valueOf(isSetMemberList()).compareTo(other.isSetMemberList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMemberList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.memberList, other.memberList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNextSeq()).compareTo(other.isSetNextSeq());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNextSeq()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nextSeq, other.nextSeq);
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
    StringBuilder sb = new StringBuilder("GetGroupMemberListResp(");
    boolean first = true;

    sb.append("base:");
    if (this.base == null) {
      sb.append("null");
    } else {
      sb.append(this.base);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("memberList:");
    if (this.memberList == null) {
      sb.append("null");
    } else {
      sb.append(this.memberList);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nextSeq:");
    sb.append(this.nextSeq);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetGroupMemberListRespStandardSchemeFactory implements SchemeFactory {
    public GetGroupMemberListRespStandardScheme getScheme() {
      return new GetGroupMemberListRespStandardScheme();
    }
  }

  private static class GetGroupMemberListRespStandardScheme extends StandardScheme<GetGroupMemberListResp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetGroupMemberListResp struct) throws org.apache.thrift.TException {
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
          case 2: // MEMBER_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list428 = iprot.readListBegin();
                struct.memberList = new ArrayList<GroupMemberFullInfo>(_list428.size);
                GroupMemberFullInfo _elem429;
                for (int _i430 = 0; _i430 < _list428.size; ++_i430)
                {
                  _elem429 = new GroupMemberFullInfo();
                  _elem429.read(iprot);
                  struct.memberList.add(_elem429);
                }
                iprot.readListEnd();
              }
              struct.setMemberListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NEXT_SEQ
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.nextSeq = iprot.readI32();
              struct.setNextSeqIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetGroupMemberListResp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.base != null) {
        oprot.writeFieldBegin(BASE_FIELD_DESC);
        struct.base.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.memberList != null) {
        oprot.writeFieldBegin(MEMBER_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.memberList.size()));
          for (GroupMemberFullInfo _iter431 : struct.memberList)
          {
            _iter431.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(NEXT_SEQ_FIELD_DESC);
      oprot.writeI32(struct.nextSeq);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetGroupMemberListRespTupleSchemeFactory implements SchemeFactory {
    public GetGroupMemberListRespTupleScheme getScheme() {
      return new GetGroupMemberListRespTupleScheme();
    }
  }

  private static class GetGroupMemberListRespTupleScheme extends TupleScheme<GetGroupMemberListResp> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetGroupMemberListResp struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBase()) {
        optionals.set(0);
      }
      if (struct.isSetMemberList()) {
        optionals.set(1);
      }
      if (struct.isSetNextSeq()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetBase()) {
        struct.base.write(oprot);
      }
      if (struct.isSetMemberList()) {
        {
          oprot.writeI32(struct.memberList.size());
          for (GroupMemberFullInfo _iter432 : struct.memberList)
          {
            _iter432.write(oprot);
          }
        }
      }
      if (struct.isSetNextSeq()) {
        oprot.writeI32(struct.nextSeq);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetGroupMemberListResp struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.base = new BaseResp();
        struct.base.read(iprot);
        struct.setBaseIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list433 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.memberList = new ArrayList<GroupMemberFullInfo>(_list433.size);
          GroupMemberFullInfo _elem434;
          for (int _i435 = 0; _i435 < _list433.size; ++_i435)
          {
            _elem434 = new GroupMemberFullInfo();
            _elem434.read(iprot);
            struct.memberList.add(_elem434);
          }
        }
        struct.setMemberListIsSet(true);
      }
      if (incoming.get(2)) {
        struct.nextSeq = iprot.readI32();
        struct.setNextSeqIsSet(true);
      }
    }
  }

}

