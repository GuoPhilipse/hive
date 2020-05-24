/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class Schema implements org.apache.thrift.TBase<Schema, Schema._Fields>, java.io.Serializable, Cloneable, Comparable<Schema> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Schema");

  private static final org.apache.thrift.protocol.TField FIELD_SCHEMAS_FIELD_DESC = new org.apache.thrift.protocol.TField("fieldSchemas", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField PROPERTIES_FIELD_DESC = new org.apache.thrift.protocol.TField("properties", org.apache.thrift.protocol.TType.MAP, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SchemaStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SchemaTupleSchemeFactory());
  }

  private List<FieldSchema> fieldSchemas; // required
  private Map<String,String> properties; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FIELD_SCHEMAS((short)1, "fieldSchemas"),
    PROPERTIES((short)2, "properties");

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
        case 1: // FIELD_SCHEMAS
          return FIELD_SCHEMAS;
        case 2: // PROPERTIES
          return PROPERTIES;
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
    tmpMap.put(_Fields.FIELD_SCHEMAS, new org.apache.thrift.meta_data.FieldMetaData("fieldSchemas", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FieldSchema.class))));
    tmpMap.put(_Fields.PROPERTIES, new org.apache.thrift.meta_data.FieldMetaData("properties", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Schema.class, metaDataMap);
  }

  public Schema() {
  }

  public Schema(
    List<FieldSchema> fieldSchemas,
    Map<String,String> properties)
  {
    this();
    this.fieldSchemas = fieldSchemas;
    this.properties = properties;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Schema(Schema other) {
    if (other.isSetFieldSchemas()) {
      List<FieldSchema> __this__fieldSchemas = new ArrayList<FieldSchema>(other.fieldSchemas.size());
      for (FieldSchema other_element : other.fieldSchemas) {
        __this__fieldSchemas.add(new FieldSchema(other_element));
      }
      this.fieldSchemas = __this__fieldSchemas;
    }
    if (other.isSetProperties()) {
      Map<String,String> __this__properties = new HashMap<String,String>(other.properties);
      this.properties = __this__properties;
    }
  }

  public Schema deepCopy() {
    return new Schema(this);
  }

  @Override
  public void clear() {
    this.fieldSchemas = null;
    this.properties = null;
  }

  public int getFieldSchemasSize() {
    return (this.fieldSchemas == null) ? 0 : this.fieldSchemas.size();
  }

  public java.util.Iterator<FieldSchema> getFieldSchemasIterator() {
    return (this.fieldSchemas == null) ? null : this.fieldSchemas.iterator();
  }

  public void addToFieldSchemas(FieldSchema elem) {
    if (this.fieldSchemas == null) {
      this.fieldSchemas = new ArrayList<FieldSchema>();
    }
    this.fieldSchemas.add(elem);
  }

  public List<FieldSchema> getFieldSchemas() {
    return this.fieldSchemas;
  }

  public void setFieldSchemas(List<FieldSchema> fieldSchemas) {
    this.fieldSchemas = fieldSchemas;
  }

  public void unsetFieldSchemas() {
    this.fieldSchemas = null;
  }

  /** Returns true if field fieldSchemas is set (has been assigned a value) and false otherwise */
  public boolean isSetFieldSchemas() {
    return this.fieldSchemas != null;
  }

  public void setFieldSchemasIsSet(boolean value) {
    if (!value) {
      this.fieldSchemas = null;
    }
  }

  public int getPropertiesSize() {
    return (this.properties == null) ? 0 : this.properties.size();
  }

  public void putToProperties(String key, String val) {
    if (this.properties == null) {
      this.properties = new HashMap<String,String>();
    }
    this.properties.put(key, val);
  }

  public Map<String,String> getProperties() {
    return this.properties;
  }

  public void setProperties(Map<String,String> properties) {
    this.properties = properties;
  }

  public void unsetProperties() {
    this.properties = null;
  }

  /** Returns true if field properties is set (has been assigned a value) and false otherwise */
  public boolean isSetProperties() {
    return this.properties != null;
  }

  public void setPropertiesIsSet(boolean value) {
    if (!value) {
      this.properties = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FIELD_SCHEMAS:
      if (value == null) {
        unsetFieldSchemas();
      } else {
        setFieldSchemas((List<FieldSchema>)value);
      }
      break;

    case PROPERTIES:
      if (value == null) {
        unsetProperties();
      } else {
        setProperties((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FIELD_SCHEMAS:
      return getFieldSchemas();

    case PROPERTIES:
      return getProperties();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FIELD_SCHEMAS:
      return isSetFieldSchemas();
    case PROPERTIES:
      return isSetProperties();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Schema)
      return this.equals((Schema)that);
    return false;
  }

  public boolean equals(Schema that) {
    if (that == null)
      return false;

    boolean this_present_fieldSchemas = true && this.isSetFieldSchemas();
    boolean that_present_fieldSchemas = true && that.isSetFieldSchemas();
    if (this_present_fieldSchemas || that_present_fieldSchemas) {
      if (!(this_present_fieldSchemas && that_present_fieldSchemas))
        return false;
      if (!this.fieldSchemas.equals(that.fieldSchemas))
        return false;
    }

    boolean this_present_properties = true && this.isSetProperties();
    boolean that_present_properties = true && that.isSetProperties();
    if (this_present_properties || that_present_properties) {
      if (!(this_present_properties && that_present_properties))
        return false;
      if (!this.properties.equals(that.properties))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_fieldSchemas = true && (isSetFieldSchemas());
    list.add(present_fieldSchemas);
    if (present_fieldSchemas)
      list.add(fieldSchemas);

    boolean present_properties = true && (isSetProperties());
    list.add(present_properties);
    if (present_properties)
      list.add(properties);

    return list.hashCode();
  }

  @Override
  public int compareTo(Schema other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFieldSchemas()).compareTo(other.isSetFieldSchemas());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFieldSchemas()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fieldSchemas, other.fieldSchemas);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetProperties()).compareTo(other.isSetProperties());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProperties()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.properties, other.properties);
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
    StringBuilder sb = new StringBuilder("Schema(");
    boolean first = true;

    sb.append("fieldSchemas:");
    if (this.fieldSchemas == null) {
      sb.append("null");
    } else {
      sb.append(this.fieldSchemas);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("properties:");
    if (this.properties == null) {
      sb.append("null");
    } else {
      sb.append(this.properties);
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

  private static class SchemaStandardSchemeFactory implements SchemeFactory {
    public SchemaStandardScheme getScheme() {
      return new SchemaStandardScheme();
    }
  }

  private static class SchemaStandardScheme extends StandardScheme<Schema> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Schema struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FIELD_SCHEMAS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list324 = iprot.readListBegin();
                struct.fieldSchemas = new ArrayList<FieldSchema>(_list324.size);
                FieldSchema _elem325;
                for (int _i326 = 0; _i326 < _list324.size; ++_i326)
                {
                  _elem325 = new FieldSchema();
                  _elem325.read(iprot);
                  struct.fieldSchemas.add(_elem325);
                }
                iprot.readListEnd();
              }
              struct.setFieldSchemasIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PROPERTIES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map327 = iprot.readMapBegin();
                struct.properties = new HashMap<String,String>(2*_map327.size);
                String _key328;
                String _val329;
                for (int _i330 = 0; _i330 < _map327.size; ++_i330)
                {
                  _key328 = iprot.readString();
                  _val329 = iprot.readString();
                  struct.properties.put(_key328, _val329);
                }
                iprot.readMapEnd();
              }
              struct.setPropertiesIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Schema struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.fieldSchemas != null) {
        oprot.writeFieldBegin(FIELD_SCHEMAS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.fieldSchemas.size()));
          for (FieldSchema _iter331 : struct.fieldSchemas)
          {
            _iter331.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.properties != null) {
        oprot.writeFieldBegin(PROPERTIES_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.properties.size()));
          for (Map.Entry<String, String> _iter332 : struct.properties.entrySet())
          {
            oprot.writeString(_iter332.getKey());
            oprot.writeString(_iter332.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SchemaTupleSchemeFactory implements SchemeFactory {
    public SchemaTupleScheme getScheme() {
      return new SchemaTupleScheme();
    }
  }

  private static class SchemaTupleScheme extends TupleScheme<Schema> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Schema struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetFieldSchemas()) {
        optionals.set(0);
      }
      if (struct.isSetProperties()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetFieldSchemas()) {
        {
          oprot.writeI32(struct.fieldSchemas.size());
          for (FieldSchema _iter333 : struct.fieldSchemas)
          {
            _iter333.write(oprot);
          }
        }
      }
      if (struct.isSetProperties()) {
        {
          oprot.writeI32(struct.properties.size());
          for (Map.Entry<String, String> _iter334 : struct.properties.entrySet())
          {
            oprot.writeString(_iter334.getKey());
            oprot.writeString(_iter334.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Schema struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list335 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.fieldSchemas = new ArrayList<FieldSchema>(_list335.size);
          FieldSchema _elem336;
          for (int _i337 = 0; _i337 < _list335.size; ++_i337)
          {
            _elem336 = new FieldSchema();
            _elem336.read(iprot);
            struct.fieldSchemas.add(_elem336);
          }
        }
        struct.setFieldSchemasIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map338 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.properties = new HashMap<String,String>(2*_map338.size);
          String _key339;
          String _val340;
          for (int _i341 = 0; _i341 < _map338.size; ++_i341)
          {
            _key339 = iprot.readString();
            _val340 = iprot.readString();
            struct.properties.put(_key339, _val340);
          }
        }
        struct.setPropertiesIsSet(true);
      }
    }
  }

}

