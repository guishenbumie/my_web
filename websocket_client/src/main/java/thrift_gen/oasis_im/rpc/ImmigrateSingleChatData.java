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
public class ImmigrateSingleChatData implements org.apache.thrift.TBase<ImmigrateSingleChatData, ImmigrateSingleChatData._Fields>, java.io.Serializable, Cloneable, Comparable<ImmigrateSingleChatData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ImmigrateSingleChatData");

  private static final org.apache.thrift.protocol.TField CHATS_FIELD_DESC = new org.apache.thrift.protocol.TField("chats", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ImmigrateSingleChatDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ImmigrateSingleChatDataTupleSchemeFactory());
  }

  public List<ImmigrateSingleChat> chats; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CHATS((short)1, "chats");

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
        case 1: // CHATS
          return CHATS;
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
    tmpMap.put(_Fields.CHATS, new org.apache.thrift.meta_data.FieldMetaData("chats", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ImmigrateSingleChat.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ImmigrateSingleChatData.class, metaDataMap);
  }

  public ImmigrateSingleChatData() {
  }

  public ImmigrateSingleChatData(
    List<ImmigrateSingleChat> chats)
  {
    this();
    this.chats = chats;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ImmigrateSingleChatData(ImmigrateSingleChatData other) {
    if (other.isSetChats()) {
      List<ImmigrateSingleChat> __this__chats = new ArrayList<ImmigrateSingleChat>(other.chats.size());
      for (ImmigrateSingleChat other_element : other.chats) {
        __this__chats.add(new ImmigrateSingleChat(other_element));
      }
      this.chats = __this__chats;
    }
  }

  public ImmigrateSingleChatData deepCopy() {
    return new ImmigrateSingleChatData(this);
  }

  @Override
  public void clear() {
    this.chats = null;
  }

  public int getChatsSize() {
    return (this.chats == null) ? 0 : this.chats.size();
  }

  public java.util.Iterator<ImmigrateSingleChat> getChatsIterator() {
    return (this.chats == null) ? null : this.chats.iterator();
  }

  public void addToChats(ImmigrateSingleChat elem) {
    if (this.chats == null) {
      this.chats = new ArrayList<ImmigrateSingleChat>();
    }
    this.chats.add(elem);
  }

  public List<ImmigrateSingleChat> getChats() {
    return this.chats;
  }

  public ImmigrateSingleChatData setChats(List<ImmigrateSingleChat> chats) {
    this.chats = chats;
    return this;
  }

  public void unsetChats() {
    this.chats = null;
  }

  /** Returns true if field chats is set (has been assigned a value) and false otherwise */
  public boolean isSetChats() {
    return this.chats != null;
  }

  public void setChatsIsSet(boolean value) {
    if (!value) {
      this.chats = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CHATS:
      if (value == null) {
        unsetChats();
      } else {
        setChats((List<ImmigrateSingleChat>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CHATS:
      return getChats();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CHATS:
      return isSetChats();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ImmigrateSingleChatData)
      return this.equals((ImmigrateSingleChatData)that);
    return false;
  }

  public boolean equals(ImmigrateSingleChatData that) {
    if (that == null)
      return false;

    boolean this_present_chats = true && this.isSetChats();
    boolean that_present_chats = true && that.isSetChats();
    if (this_present_chats || that_present_chats) {
      if (!(this_present_chats && that_present_chats))
        return false;
      if (!this.chats.equals(that.chats))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_chats = true && (isSetChats());
    list.add(present_chats);
    if (present_chats)
      list.add(chats);

    return list.hashCode();
  }

  @Override
  public int compareTo(ImmigrateSingleChatData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetChats()).compareTo(other.isSetChats());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChats()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.chats, other.chats);
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
    StringBuilder sb = new StringBuilder("ImmigrateSingleChatData(");
    boolean first = true;

    sb.append("chats:");
    if (this.chats == null) {
      sb.append("null");
    } else {
      sb.append(this.chats);
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

  private static class ImmigrateSingleChatDataStandardSchemeFactory implements SchemeFactory {
    public ImmigrateSingleChatDataStandardScheme getScheme() {
      return new ImmigrateSingleChatDataStandardScheme();
    }
  }

  private static class ImmigrateSingleChatDataStandardScheme extends StandardScheme<ImmigrateSingleChatData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ImmigrateSingleChatData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CHATS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list204 = iprot.readListBegin();
                struct.chats = new ArrayList<ImmigrateSingleChat>(_list204.size);
                ImmigrateSingleChat _elem205;
                for (int _i206 = 0; _i206 < _list204.size; ++_i206)
                {
                  _elem205 = new ImmigrateSingleChat();
                  _elem205.read(iprot);
                  struct.chats.add(_elem205);
                }
                iprot.readListEnd();
              }
              struct.setChatsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ImmigrateSingleChatData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.chats != null) {
        oprot.writeFieldBegin(CHATS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.chats.size()));
          for (ImmigrateSingleChat _iter207 : struct.chats)
          {
            _iter207.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ImmigrateSingleChatDataTupleSchemeFactory implements SchemeFactory {
    public ImmigrateSingleChatDataTupleScheme getScheme() {
      return new ImmigrateSingleChatDataTupleScheme();
    }
  }

  private static class ImmigrateSingleChatDataTupleScheme extends TupleScheme<ImmigrateSingleChatData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ImmigrateSingleChatData struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetChats()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetChats()) {
        {
          oprot.writeI32(struct.chats.size());
          for (ImmigrateSingleChat _iter208 : struct.chats)
          {
            _iter208.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ImmigrateSingleChatData struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list209 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.chats = new ArrayList<ImmigrateSingleChat>(_list209.size);
          ImmigrateSingleChat _elem210;
          for (int _i211 = 0; _i211 < _list209.size; ++_i211)
          {
            _elem210 = new ImmigrateSingleChat();
            _elem210.read(iprot);
            struct.chats.add(_elem210);
          }
        }
        struct.setChatsIsSet(true);
      }
    }
  }

}

