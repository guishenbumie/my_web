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
public class CheckReport implements org.apache.thrift.TBase<CheckReport, CheckReport._Fields>, java.io.Serializable, Cloneable, Comparable<CheckReport> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CheckReport");

  private static final org.apache.thrift.protocol.TField SERVER_MSG_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("serverMsgId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SENDER_FIELD_DESC = new org.apache.thrift.protocol.TField("sender", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("text", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CheckReportStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CheckReportTupleSchemeFactory());
  }

  public String serverMsgId; // required
  public String sender; // required
  public String text; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SERVER_MSG_ID((short)1, "serverMsgId"),
    SENDER((short)2, "sender"),
    TEXT((short)3, "text");

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
        case 1: // SERVER_MSG_ID
          return SERVER_MSG_ID;
        case 2: // SENDER
          return SENDER;
        case 3: // TEXT
          return TEXT;
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
    tmpMap.put(_Fields.SERVER_MSG_ID, new org.apache.thrift.meta_data.FieldMetaData("serverMsgId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SENDER, new org.apache.thrift.meta_data.FieldMetaData("sender", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TEXT, new org.apache.thrift.meta_data.FieldMetaData("text", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CheckReport.class, metaDataMap);
  }

  public CheckReport() {
  }

  public CheckReport(
    String serverMsgId,
    String sender,
    String text)
  {
    this();
    this.serverMsgId = serverMsgId;
    this.sender = sender;
    this.text = text;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CheckReport(CheckReport other) {
    if (other.isSetServerMsgId()) {
      this.serverMsgId = other.serverMsgId;
    }
    if (other.isSetSender()) {
      this.sender = other.sender;
    }
    if (other.isSetText()) {
      this.text = other.text;
    }
  }

  public CheckReport deepCopy() {
    return new CheckReport(this);
  }

  @Override
  public void clear() {
    this.serverMsgId = null;
    this.sender = null;
    this.text = null;
  }

  public String getServerMsgId() {
    return this.serverMsgId;
  }

  public CheckReport setServerMsgId(String serverMsgId) {
    this.serverMsgId = serverMsgId;
    return this;
  }

  public void unsetServerMsgId() {
    this.serverMsgId = null;
  }

  /** Returns true if field serverMsgId is set (has been assigned a value) and false otherwise */
  public boolean isSetServerMsgId() {
    return this.serverMsgId != null;
  }

  public void setServerMsgIdIsSet(boolean value) {
    if (!value) {
      this.serverMsgId = null;
    }
  }

  public String getSender() {
    return this.sender;
  }

  public CheckReport setSender(String sender) {
    this.sender = sender;
    return this;
  }

  public void unsetSender() {
    this.sender = null;
  }

  /** Returns true if field sender is set (has been assigned a value) and false otherwise */
  public boolean isSetSender() {
    return this.sender != null;
  }

  public void setSenderIsSet(boolean value) {
    if (!value) {
      this.sender = null;
    }
  }

  public String getText() {
    return this.text;
  }

  public CheckReport setText(String text) {
    this.text = text;
    return this;
  }

  public void unsetText() {
    this.text = null;
  }

  /** Returns true if field text is set (has been assigned a value) and false otherwise */
  public boolean isSetText() {
    return this.text != null;
  }

  public void setTextIsSet(boolean value) {
    if (!value) {
      this.text = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SERVER_MSG_ID:
      if (value == null) {
        unsetServerMsgId();
      } else {
        setServerMsgId((String)value);
      }
      break;

    case SENDER:
      if (value == null) {
        unsetSender();
      } else {
        setSender((String)value);
      }
      break;

    case TEXT:
      if (value == null) {
        unsetText();
      } else {
        setText((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SERVER_MSG_ID:
      return getServerMsgId();

    case SENDER:
      return getSender();

    case TEXT:
      return getText();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SERVER_MSG_ID:
      return isSetServerMsgId();
    case SENDER:
      return isSetSender();
    case TEXT:
      return isSetText();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CheckReport)
      return this.equals((CheckReport)that);
    return false;
  }

  public boolean equals(CheckReport that) {
    if (that == null)
      return false;

    boolean this_present_serverMsgId = true && this.isSetServerMsgId();
    boolean that_present_serverMsgId = true && that.isSetServerMsgId();
    if (this_present_serverMsgId || that_present_serverMsgId) {
      if (!(this_present_serverMsgId && that_present_serverMsgId))
        return false;
      if (!this.serverMsgId.equals(that.serverMsgId))
        return false;
    }

    boolean this_present_sender = true && this.isSetSender();
    boolean that_present_sender = true && that.isSetSender();
    if (this_present_sender || that_present_sender) {
      if (!(this_present_sender && that_present_sender))
        return false;
      if (!this.sender.equals(that.sender))
        return false;
    }

    boolean this_present_text = true && this.isSetText();
    boolean that_present_text = true && that.isSetText();
    if (this_present_text || that_present_text) {
      if (!(this_present_text && that_present_text))
        return false;
      if (!this.text.equals(that.text))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_serverMsgId = true && (isSetServerMsgId());
    list.add(present_serverMsgId);
    if (present_serverMsgId)
      list.add(serverMsgId);

    boolean present_sender = true && (isSetSender());
    list.add(present_sender);
    if (present_sender)
      list.add(sender);

    boolean present_text = true && (isSetText());
    list.add(present_text);
    if (present_text)
      list.add(text);

    return list.hashCode();
  }

  @Override
  public int compareTo(CheckReport other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetServerMsgId()).compareTo(other.isSetServerMsgId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServerMsgId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serverMsgId, other.serverMsgId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSender()).compareTo(other.isSetSender());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSender()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sender, other.sender);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetText()).compareTo(other.isSetText());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetText()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.text, other.text);
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
    StringBuilder sb = new StringBuilder("CheckReport(");
    boolean first = true;

    sb.append("serverMsgId:");
    if (this.serverMsgId == null) {
      sb.append("null");
    } else {
      sb.append(this.serverMsgId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sender:");
    if (this.sender == null) {
      sb.append("null");
    } else {
      sb.append(this.sender);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("text:");
    if (this.text == null) {
      sb.append("null");
    } else {
      sb.append(this.text);
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

  private static class CheckReportStandardSchemeFactory implements SchemeFactory {
    public CheckReportStandardScheme getScheme() {
      return new CheckReportStandardScheme();
    }
  }

  private static class CheckReportStandardScheme extends StandardScheme<CheckReport> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CheckReport struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SERVER_MSG_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.serverMsgId = iprot.readString();
              struct.setServerMsgIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SENDER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sender = iprot.readString();
              struct.setSenderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.text = iprot.readString();
              struct.setTextIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CheckReport struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.serverMsgId != null) {
        oprot.writeFieldBegin(SERVER_MSG_ID_FIELD_DESC);
        oprot.writeString(struct.serverMsgId);
        oprot.writeFieldEnd();
      }
      if (struct.sender != null) {
        oprot.writeFieldBegin(SENDER_FIELD_DESC);
        oprot.writeString(struct.sender);
        oprot.writeFieldEnd();
      }
      if (struct.text != null) {
        oprot.writeFieldBegin(TEXT_FIELD_DESC);
        oprot.writeString(struct.text);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CheckReportTupleSchemeFactory implements SchemeFactory {
    public CheckReportTupleScheme getScheme() {
      return new CheckReportTupleScheme();
    }
  }

  private static class CheckReportTupleScheme extends TupleScheme<CheckReport> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CheckReport struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetServerMsgId()) {
        optionals.set(0);
      }
      if (struct.isSetSender()) {
        optionals.set(1);
      }
      if (struct.isSetText()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetServerMsgId()) {
        oprot.writeString(struct.serverMsgId);
      }
      if (struct.isSetSender()) {
        oprot.writeString(struct.sender);
      }
      if (struct.isSetText()) {
        oprot.writeString(struct.text);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CheckReport struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.serverMsgId = iprot.readString();
        struct.setServerMsgIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.sender = iprot.readString();
        struct.setSenderIsSet(true);
      }
      if (incoming.get(2)) {
        struct.text = iprot.readString();
        struct.setTextIsSet(true);
      }
    }
  }

}

