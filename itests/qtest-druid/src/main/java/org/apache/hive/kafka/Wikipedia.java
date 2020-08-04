/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hive.kafka;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Wikipedia extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 960374719287820723L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Wikipedia\",\"namespace\":\"org.apache.hive.kafka\",\"fields\":[{\"name\":\"isrobot\",\"type\":\"boolean\"},{\"name\":\"channel\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"timestamp\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"flags\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"isunpatrolled\",\"type\":\"boolean\"},{\"name\":\"page\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"diffurl\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"added\",\"type\":\"long\"},{\"name\":\"comment\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"commentlength\",\"type\":\"long\"},{\"name\":\"isnew\",\"type\":\"boolean\"},{\"name\":\"isminor\",\"type\":\"boolean\"},{\"name\":\"delta\",\"type\":\"long\"},{\"name\":\"isanonymous\",\"type\":\"boolean\"},{\"name\":\"user\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"deltabucket\",\"type\":\"double\"},{\"name\":\"deleted\",\"type\":\"long\"},{\"name\":\"namespace\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"version\":\"1\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Wikipedia> ENCODER =
      new BinaryMessageEncoder<Wikipedia>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Wikipedia> DECODER =
      new BinaryMessageDecoder<Wikipedia>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Wikipedia> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Wikipedia> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Wikipedia>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Wikipedia to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Wikipedia from a ByteBuffer. */
  public static Wikipedia fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public boolean isrobot;
  @Deprecated public java.lang.String channel;
  @Deprecated public java.lang.String timestamp;
  @Deprecated public java.lang.String flags;
  @Deprecated public boolean isunpatrolled;
  @Deprecated public java.lang.String page;
  @Deprecated public java.lang.String diffurl;
  @Deprecated public long added;
  @Deprecated public java.lang.String comment;
  @Deprecated public long commentlength;
  @Deprecated public boolean isnew;
  @Deprecated public boolean isminor;
  @Deprecated public long delta;
  @Deprecated public boolean isanonymous;
  @Deprecated public java.lang.String user;
  @Deprecated public double deltabucket;
  @Deprecated public long deleted;
  @Deprecated public java.lang.String namespace;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Wikipedia() {}

  /**
   * All-args constructor.
   * @param isrobot The new value for isrobot
   * @param channel The new value for channel
   * @param timestamp The new value for timestamp
   * @param flags The new value for flags
   * @param isunpatrolled The new value for isunpatrolled
   * @param page The new value for page
   * @param diffurl The new value for diffurl
   * @param added The new value for added
   * @param comment The new value for comment
   * @param commentlength The new value for commentlength
   * @param isnew The new value for isnew
   * @param isminor The new value for isminor
   * @param delta The new value for delta
   * @param isanonymous The new value for isanonymous
   * @param user The new value for user
   * @param deltabucket The new value for deltabucket
   * @param deleted The new value for deleted
   * @param namespace The new value for namespace
   */
  public Wikipedia(java.lang.Boolean isrobot, java.lang.String channel, java.lang.String timestamp, java.lang.String flags, java.lang.Boolean isunpatrolled, java.lang.String page, java.lang.String diffurl, java.lang.Long added, java.lang.String comment, java.lang.Long commentlength, java.lang.Boolean isnew, java.lang.Boolean isminor, java.lang.Long delta, java.lang.Boolean isanonymous, java.lang.String user, java.lang.Double deltabucket, java.lang.Long deleted, java.lang.String namespace) {
    this.isrobot = isrobot;
    this.channel = channel;
    this.timestamp = timestamp;
    this.flags = flags;
    this.isunpatrolled = isunpatrolled;
    this.page = page;
    this.diffurl = diffurl;
    this.added = added;
    this.comment = comment;
    this.commentlength = commentlength;
    this.isnew = isnew;
    this.isminor = isminor;
    this.delta = delta;
    this.isanonymous = isanonymous;
    this.user = user;
    this.deltabucket = deltabucket;
    this.deleted = deleted;
    this.namespace = namespace;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return isrobot;
    case 1: return channel;
    case 2: return timestamp;
    case 3: return flags;
    case 4: return isunpatrolled;
    case 5: return page;
    case 6: return diffurl;
    case 7: return added;
    case 8: return comment;
    case 9: return commentlength;
    case 10: return isnew;
    case 11: return isminor;
    case 12: return delta;
    case 13: return isanonymous;
    case 14: return user;
    case 15: return deltabucket;
    case 16: return deleted;
    case 17: return namespace;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: isrobot = (java.lang.Boolean)value$; break;
    case 1: channel = (java.lang.String)value$.toString(); break;
    case 2: timestamp = (java.lang.String)value$.toString(); break;
    case 3: flags = (java.lang.String)value$.toString(); break;
    case 4: isunpatrolled = (java.lang.Boolean)value$; break;
    case 5: page = (java.lang.String)value$.toString(); break;
    case 6: diffurl = (java.lang.String)value$.toString(); break;
    case 7: added = (java.lang.Long)value$; break;
    case 8: comment = (java.lang.String)value$.toString(); break;
    case 9: commentlength = (java.lang.Long)value$; break;
    case 10: isnew = (java.lang.Boolean)value$; break;
    case 11: isminor = (java.lang.Boolean)value$; break;
    case 12: delta = (java.lang.Long)value$; break;
    case 13: isanonymous = (java.lang.Boolean)value$; break;
    case 14: user = (java.lang.String)value$.toString(); break;
    case 15: deltabucket = (java.lang.Double)value$; break;
    case 16: deleted = (java.lang.Long)value$; break;
    case 17: namespace = (java.lang.String)value$.toString(); break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'isrobot' field.
   * @return The value of the 'isrobot' field.
   */
  public java.lang.Boolean getIsrobot() {
    return isrobot;
  }

  /**
   * Sets the value of the 'isrobot' field.
   * @param value the value to set.
   */
  public void setIsrobot(java.lang.Boolean value) {
    this.isrobot = value;
  }

  /**
   * Gets the value of the 'channel' field.
   * @return The value of the 'channel' field.
   */
  public java.lang.String getChannel() {
    return channel;
  }

  /**
   * Sets the value of the 'channel' field.
   * @param value the value to set.
   */
  public void setChannel(java.lang.String value) {
    this.channel = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public java.lang.String getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.String value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'flags' field.
   * @return The value of the 'flags' field.
   */
  public java.lang.String getFlags() {
    return flags;
  }

  /**
   * Sets the value of the 'flags' field.
   * @param value the value to set.
   */
  public void setFlags(java.lang.String value) {
    this.flags = value;
  }

  /**
   * Gets the value of the 'isunpatrolled' field.
   * @return The value of the 'isunpatrolled' field.
   */
  public java.lang.Boolean getIsunpatrolled() {
    return isunpatrolled;
  }

  /**
   * Sets the value of the 'isunpatrolled' field.
   * @param value the value to set.
   */
  public void setIsunpatrolled(java.lang.Boolean value) {
    this.isunpatrolled = value;
  }

  /**
   * Gets the value of the 'page' field.
   * @return The value of the 'page' field.
   */
  public java.lang.String getPage() {
    return page;
  }

  /**
   * Sets the value of the 'page' field.
   * @param value the value to set.
   */
  public void setPage(java.lang.String value) {
    this.page = value;
  }

  /**
   * Gets the value of the 'diffurl' field.
   * @return The value of the 'diffurl' field.
   */
  public java.lang.String getDiffurl() {
    return diffurl;
  }

  /**
   * Sets the value of the 'diffurl' field.
   * @param value the value to set.
   */
  public void setDiffurl(java.lang.String value) {
    this.diffurl = value;
  }

  /**
   * Gets the value of the 'added' field.
   * @return The value of the 'added' field.
   */
  public java.lang.Long getAdded() {
    return added;
  }

  /**
   * Sets the value of the 'added' field.
   * @param value the value to set.
   */
  public void setAdded(java.lang.Long value) {
    this.added = value;
  }

  /**
   * Gets the value of the 'comment' field.
   * @return The value of the 'comment' field.
   */
  public java.lang.String getComment() {
    return comment;
  }

  /**
   * Sets the value of the 'comment' field.
   * @param value the value to set.
   */
  public void setComment(java.lang.String value) {
    this.comment = value;
  }

  /**
   * Gets the value of the 'commentlength' field.
   * @return The value of the 'commentlength' field.
   */
  public java.lang.Long getCommentlength() {
    return commentlength;
  }

  /**
   * Sets the value of the 'commentlength' field.
   * @param value the value to set.
   */
  public void setCommentlength(java.lang.Long value) {
    this.commentlength = value;
  }

  /**
   * Gets the value of the 'isnew' field.
   * @return The value of the 'isnew' field.
   */
  public java.lang.Boolean getIsnew() {
    return isnew;
  }

  /**
   * Sets the value of the 'isnew' field.
   * @param value the value to set.
   */
  public void setIsnew(java.lang.Boolean value) {
    this.isnew = value;
  }

  /**
   * Gets the value of the 'isminor' field.
   * @return The value of the 'isminor' field.
   */
  public java.lang.Boolean getIsminor() {
    return isminor;
  }

  /**
   * Sets the value of the 'isminor' field.
   * @param value the value to set.
   */
  public void setIsminor(java.lang.Boolean value) {
    this.isminor = value;
  }

  /**
   * Gets the value of the 'delta' field.
   * @return The value of the 'delta' field.
   */
  public java.lang.Long getDelta() {
    return delta;
  }

  /**
   * Sets the value of the 'delta' field.
   * @param value the value to set.
   */
  public void setDelta(java.lang.Long value) {
    this.delta = value;
  }

  /**
   * Gets the value of the 'isanonymous' field.
   * @return The value of the 'isanonymous' field.
   */
  public java.lang.Boolean getIsanonymous() {
    return isanonymous;
  }

  /**
   * Sets the value of the 'isanonymous' field.
   * @param value the value to set.
   */
  public void setIsanonymous(java.lang.Boolean value) {
    this.isanonymous = value;
  }

  /**
   * Gets the value of the 'user' field.
   * @return The value of the 'user' field.
   */
  public java.lang.String getUser() {
    return user;
  }

  /**
   * Sets the value of the 'user' field.
   * @param value the value to set.
   */
  public void setUser(java.lang.String value) {
    this.user = value;
  }

  /**
   * Gets the value of the 'deltabucket' field.
   * @return The value of the 'deltabucket' field.
   */
  public java.lang.Double getDeltabucket() {
    return deltabucket;
  }

  /**
   * Sets the value of the 'deltabucket' field.
   * @param value the value to set.
   */
  public void setDeltabucket(java.lang.Double value) {
    this.deltabucket = value;
  }

  /**
   * Gets the value of the 'deleted' field.
   * @return The value of the 'deleted' field.
   */
  public java.lang.Long getDeleted() {
    return deleted;
  }

  /**
   * Sets the value of the 'deleted' field.
   * @param value the value to set.
   */
  public void setDeleted(java.lang.Long value) {
    this.deleted = value;
  }

  /**
   * Gets the value of the 'namespace' field.
   * @return The value of the 'namespace' field.
   */
  public java.lang.String getNamespace() {
    return namespace;
  }

  /**
   * Sets the value of the 'namespace' field.
   * @param value the value to set.
   */
  public void setNamespace(java.lang.String value) {
    this.namespace = value;
  }

  /**
   * Creates a new Wikipedia RecordBuilder.
   * @return A new Wikipedia RecordBuilder
   */
  public static org.apache.hive.kafka.Wikipedia.Builder newBuilder() {
    return new org.apache.hive.kafka.Wikipedia.Builder();
  }

  /**
   * Creates a new Wikipedia RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Wikipedia RecordBuilder
   */
  public static org.apache.hive.kafka.Wikipedia.Builder newBuilder(org.apache.hive.kafka.Wikipedia.Builder other) {
    return new org.apache.hive.kafka.Wikipedia.Builder(other);
  }

  /**
   * Creates a new Wikipedia RecordBuilder by copying an existing Wikipedia instance.
   * @param other The existing instance to copy.
   * @return A new Wikipedia RecordBuilder
   */
  public static org.apache.hive.kafka.Wikipedia.Builder newBuilder(org.apache.hive.kafka.Wikipedia other) {
    return new org.apache.hive.kafka.Wikipedia.Builder(other);
  }

  /**
   * RecordBuilder for Wikipedia instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Wikipedia>
      implements org.apache.avro.data.RecordBuilder<Wikipedia> {

    private boolean isrobot;
    private java.lang.String channel;
    private java.lang.String timestamp;
    private java.lang.String flags;
    private boolean isunpatrolled;
    private java.lang.String page;
    private java.lang.String diffurl;
    private long added;
    private java.lang.String comment;
    private long commentlength;
    private boolean isnew;
    private boolean isminor;
    private long delta;
    private boolean isanonymous;
    private java.lang.String user;
    private double deltabucket;
    private long deleted;
    private java.lang.String namespace;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.hive.kafka.Wikipedia.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.isrobot)) {
        this.isrobot = data().deepCopy(fields()[0].schema(), other.isrobot);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.channel)) {
        this.channel = data().deepCopy(fields()[1].schema(), other.channel);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.flags)) {
        this.flags = data().deepCopy(fields()[3].schema(), other.flags);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.isunpatrolled)) {
        this.isunpatrolled = data().deepCopy(fields()[4].schema(), other.isunpatrolled);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.page)) {
        this.page = data().deepCopy(fields()[5].schema(), other.page);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.diffurl)) {
        this.diffurl = data().deepCopy(fields()[6].schema(), other.diffurl);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.added)) {
        this.added = data().deepCopy(fields()[7].schema(), other.added);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.comment)) {
        this.comment = data().deepCopy(fields()[8].schema(), other.comment);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.commentlength)) {
        this.commentlength = data().deepCopy(fields()[9].schema(), other.commentlength);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.isnew)) {
        this.isnew = data().deepCopy(fields()[10].schema(), other.isnew);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.isminor)) {
        this.isminor = data().deepCopy(fields()[11].schema(), other.isminor);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.delta)) {
        this.delta = data().deepCopy(fields()[12].schema(), other.delta);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.isanonymous)) {
        this.isanonymous = data().deepCopy(fields()[13].schema(), other.isanonymous);
        fieldSetFlags()[13] = true;
      }
      if (isValidValue(fields()[14], other.user)) {
        this.user = data().deepCopy(fields()[14].schema(), other.user);
        fieldSetFlags()[14] = true;
      }
      if (isValidValue(fields()[15], other.deltabucket)) {
        this.deltabucket = data().deepCopy(fields()[15].schema(), other.deltabucket);
        fieldSetFlags()[15] = true;
      }
      if (isValidValue(fields()[16], other.deleted)) {
        this.deleted = data().deepCopy(fields()[16].schema(), other.deleted);
        fieldSetFlags()[16] = true;
      }
      if (isValidValue(fields()[17], other.namespace)) {
        this.namespace = data().deepCopy(fields()[17].schema(), other.namespace);
        fieldSetFlags()[17] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Wikipedia instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.hive.kafka.Wikipedia other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.isrobot)) {
        this.isrobot = data().deepCopy(fields()[0].schema(), other.isrobot);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.channel)) {
        this.channel = data().deepCopy(fields()[1].schema(), other.channel);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.flags)) {
        this.flags = data().deepCopy(fields()[3].schema(), other.flags);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.isunpatrolled)) {
        this.isunpatrolled = data().deepCopy(fields()[4].schema(), other.isunpatrolled);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.page)) {
        this.page = data().deepCopy(fields()[5].schema(), other.page);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.diffurl)) {
        this.diffurl = data().deepCopy(fields()[6].schema(), other.diffurl);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.added)) {
        this.added = data().deepCopy(fields()[7].schema(), other.added);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.comment)) {
        this.comment = data().deepCopy(fields()[8].schema(), other.comment);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.commentlength)) {
        this.commentlength = data().deepCopy(fields()[9].schema(), other.commentlength);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.isnew)) {
        this.isnew = data().deepCopy(fields()[10].schema(), other.isnew);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.isminor)) {
        this.isminor = data().deepCopy(fields()[11].schema(), other.isminor);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.delta)) {
        this.delta = data().deepCopy(fields()[12].schema(), other.delta);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.isanonymous)) {
        this.isanonymous = data().deepCopy(fields()[13].schema(), other.isanonymous);
        fieldSetFlags()[13] = true;
      }
      if (isValidValue(fields()[14], other.user)) {
        this.user = data().deepCopy(fields()[14].schema(), other.user);
        fieldSetFlags()[14] = true;
      }
      if (isValidValue(fields()[15], other.deltabucket)) {
        this.deltabucket = data().deepCopy(fields()[15].schema(), other.deltabucket);
        fieldSetFlags()[15] = true;
      }
      if (isValidValue(fields()[16], other.deleted)) {
        this.deleted = data().deepCopy(fields()[16].schema(), other.deleted);
        fieldSetFlags()[16] = true;
      }
      if (isValidValue(fields()[17], other.namespace)) {
        this.namespace = data().deepCopy(fields()[17].schema(), other.namespace);
        fieldSetFlags()[17] = true;
      }
    }

    /**
     * Gets the value of the 'isrobot' field.
     * @return The value.
     */
    public java.lang.Boolean getIsrobot() {
      return isrobot;
    }

    /**
     * Sets the value of the 'isrobot' field.
     * @param value The value of 'isrobot'.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder setIsrobot(boolean value) {
      validate(fields()[0], value);
      this.isrobot = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
     * Checks whether the 'isrobot' field has been set.
     * @return True if the 'isrobot' field has been set, false otherwise.
     */
    public boolean hasIsrobot() {
      return fieldSetFlags()[0];
    }


    /**
     * Clears the value of the 'isrobot' field.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder clearIsrobot() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
     * Gets the value of the 'channel' field.
     * @return The value.
     */
    public java.lang.String getChannel() {
      return channel;
    }

    /**
     * Sets the value of the 'channel' field.
     * @param value The value of 'channel'.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder setChannel(java.lang.String value) {
      validate(fields()[1], value);
      this.channel = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
     * Checks whether the 'channel' field has been set.
     * @return True if the 'channel' field has been set, false otherwise.
     */
    public boolean hasChannel() {
      return fieldSetFlags()[1];
    }


    /**
     * Clears the value of the 'channel' field.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder clearChannel() {
      channel = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
     * Gets the value of the 'timestamp' field.
     * @return The value.
     */
    public java.lang.String getTimestamp() {
      return timestamp;
    }

    /**
     * Sets the value of the 'timestamp' field.
     * @param value The value of 'timestamp'.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder setTimestamp(java.lang.String value) {
      validate(fields()[2], value);
      this.timestamp = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
     * Checks whether the 'timestamp' field has been set.
     * @return True if the 'timestamp' field has been set, false otherwise.
     */
    public boolean hasTimestamp() {
      return fieldSetFlags()[2];
    }


    /**
     * Clears the value of the 'timestamp' field.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder clearTimestamp() {
      timestamp = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
     * Gets the value of the 'flags' field.
     * @return The value.
     */
    public java.lang.String getFlags() {
      return flags;
    }

    /**
     * Sets the value of the 'flags' field.
     * @param value The value of 'flags'.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder setFlags(java.lang.String value) {
      validate(fields()[3], value);
      this.flags = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
     * Checks whether the 'flags' field has been set.
     * @return True if the 'flags' field has been set, false otherwise.
     */
    public boolean hasFlags() {
      return fieldSetFlags()[3];
    }


    /**
     * Clears the value of the 'flags' field.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder clearFlags() {
      flags = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
     * Gets the value of the 'isunpatrolled' field.
     * @return The value.
     */
    public java.lang.Boolean getIsunpatrolled() {
      return isunpatrolled;
    }

    /**
     * Sets the value of the 'isunpatrolled' field.
     * @param value The value of 'isunpatrolled'.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder setIsunpatrolled(boolean value) {
      validate(fields()[4], value);
      this.isunpatrolled = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
     * Checks whether the 'isunpatrolled' field has been set.
     * @return True if the 'isunpatrolled' field has been set, false otherwise.
     */
    public boolean hasIsunpatrolled() {
      return fieldSetFlags()[4];
    }


    /**
     * Clears the value of the 'isunpatrolled' field.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder clearIsunpatrolled() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
     * Gets the value of the 'page' field.
     * @return The value.
     */
    public java.lang.String getPage() {
      return page;
    }

    /**
     * Sets the value of the 'page' field.
     * @param value The value of 'page'.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder setPage(java.lang.String value) {
      validate(fields()[5], value);
      this.page = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
     * Checks whether the 'page' field has been set.
     * @return True if the 'page' field has been set, false otherwise.
     */
    public boolean hasPage() {
      return fieldSetFlags()[5];
    }


    /**
     * Clears the value of the 'page' field.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder clearPage() {
      page = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
     * Gets the value of the 'diffurl' field.
     * @return The value.
     */
    public java.lang.String getDiffurl() {
      return diffurl;
    }

    /**
     * Sets the value of the 'diffurl' field.
     * @param value The value of 'diffurl'.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder setDiffurl(java.lang.String value) {
      validate(fields()[6], value);
      this.diffurl = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
     * Checks whether the 'diffurl' field has been set.
     * @return True if the 'diffurl' field has been set, false otherwise.
     */
    public boolean hasDiffurl() {
      return fieldSetFlags()[6];
    }


    /**
     * Clears the value of the 'diffurl' field.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder clearDiffurl() {
      diffurl = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
     * Gets the value of the 'added' field.
     * @return The value.
     */
    public java.lang.Long getAdded() {
      return added;
    }

    /**
     * Sets the value of the 'added' field.
     * @param value The value of 'added'.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder setAdded(long value) {
      validate(fields()[7], value);
      this.added = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
     * Checks whether the 'added' field has been set.
     * @return True if the 'added' field has been set, false otherwise.
     */
    public boolean hasAdded() {
      return fieldSetFlags()[7];
    }


    /**
     * Clears the value of the 'added' field.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder clearAdded() {
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
     * Gets the value of the 'comment' field.
     * @return The value.
     */
    public java.lang.String getComment() {
      return comment;
    }

    /**
     * Sets the value of the 'comment' field.
     * @param value The value of 'comment'.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder setComment(java.lang.String value) {
      validate(fields()[8], value);
      this.comment = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
     * Checks whether the 'comment' field has been set.
     * @return True if the 'comment' field has been set, false otherwise.
     */
    public boolean hasComment() {
      return fieldSetFlags()[8];
    }


    /**
     * Clears the value of the 'comment' field.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder clearComment() {
      comment = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
     * Gets the value of the 'commentlength' field.
     * @return The value.
     */
    public java.lang.Long getCommentlength() {
      return commentlength;
    }

    /**
     * Sets the value of the 'commentlength' field.
     * @param value The value of 'commentlength'.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder setCommentlength(long value) {
      validate(fields()[9], value);
      this.commentlength = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
     * Checks whether the 'commentlength' field has been set.
     * @return True if the 'commentlength' field has been set, false otherwise.
     */
    public boolean hasCommentlength() {
      return fieldSetFlags()[9];
    }


    /**
     * Clears the value of the 'commentlength' field.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder clearCommentlength() {
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
     * Gets the value of the 'isnew' field.
     * @return The value.
     */
    public java.lang.Boolean getIsnew() {
      return isnew;
    }

    /**
     * Sets the value of the 'isnew' field.
     * @param value The value of 'isnew'.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder setIsnew(boolean value) {
      validate(fields()[10], value);
      this.isnew = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
     * Checks whether the 'isnew' field has been set.
     * @return True if the 'isnew' field has been set, false otherwise.
     */
    public boolean hasIsnew() {
      return fieldSetFlags()[10];
    }


    /**
     * Clears the value of the 'isnew' field.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder clearIsnew() {
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
     * Gets the value of the 'isminor' field.
     * @return The value.
     */
    public java.lang.Boolean getIsminor() {
      return isminor;
    }

    /**
     * Sets the value of the 'isminor' field.
     * @param value The value of 'isminor'.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder setIsminor(boolean value) {
      validate(fields()[11], value);
      this.isminor = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
     * Checks whether the 'isminor' field has been set.
     * @return True if the 'isminor' field has been set, false otherwise.
     */
    public boolean hasIsminor() {
      return fieldSetFlags()[11];
    }


    /**
     * Clears the value of the 'isminor' field.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder clearIsminor() {
      fieldSetFlags()[11] = false;
      return this;
    }

    /**
     * Gets the value of the 'delta' field.
     * @return The value.
     */
    public java.lang.Long getDelta() {
      return delta;
    }

    /**
     * Sets the value of the 'delta' field.
     * @param value The value of 'delta'.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder setDelta(long value) {
      validate(fields()[12], value);
      this.delta = value;
      fieldSetFlags()[12] = true;
      return this;
    }

    /**
     * Checks whether the 'delta' field has been set.
     * @return True if the 'delta' field has been set, false otherwise.
     */
    public boolean hasDelta() {
      return fieldSetFlags()[12];
    }


    /**
     * Clears the value of the 'delta' field.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder clearDelta() {
      fieldSetFlags()[12] = false;
      return this;
    }

    /**
     * Gets the value of the 'isanonymous' field.
     * @return The value.
     */
    public java.lang.Boolean getIsanonymous() {
      return isanonymous;
    }

    /**
     * Sets the value of the 'isanonymous' field.
     * @param value The value of 'isanonymous'.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder setIsanonymous(boolean value) {
      validate(fields()[13], value);
      this.isanonymous = value;
      fieldSetFlags()[13] = true;
      return this;
    }

    /**
     * Checks whether the 'isanonymous' field has been set.
     * @return True if the 'isanonymous' field has been set, false otherwise.
     */
    public boolean hasIsanonymous() {
      return fieldSetFlags()[13];
    }


    /**
     * Clears the value of the 'isanonymous' field.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder clearIsanonymous() {
      fieldSetFlags()[13] = false;
      return this;
    }

    /**
     * Gets the value of the 'user' field.
     * @return The value.
     */
    public java.lang.String getUser() {
      return user;
    }

    /**
     * Sets the value of the 'user' field.
     * @param value The value of 'user'.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder setUser(java.lang.String value) {
      validate(fields()[14], value);
      this.user = value;
      fieldSetFlags()[14] = true;
      return this;
    }

    /**
     * Checks whether the 'user' field has been set.
     * @return True if the 'user' field has been set, false otherwise.
     */
    public boolean hasUser() {
      return fieldSetFlags()[14];
    }


    /**
     * Clears the value of the 'user' field.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder clearUser() {
      user = null;
      fieldSetFlags()[14] = false;
      return this;
    }

    /**
     * Gets the value of the 'deltabucket' field.
     * @return The value.
     */
    public java.lang.Double getDeltabucket() {
      return deltabucket;
    }

    /**
     * Sets the value of the 'deltabucket' field.
     * @param value The value of 'deltabucket'.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder setDeltabucket(double value) {
      validate(fields()[15], value);
      this.deltabucket = value;
      fieldSetFlags()[15] = true;
      return this;
    }

    /**
     * Checks whether the 'deltabucket' field has been set.
     * @return True if the 'deltabucket' field has been set, false otherwise.
     */
    public boolean hasDeltabucket() {
      return fieldSetFlags()[15];
    }


    /**
     * Clears the value of the 'deltabucket' field.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder clearDeltabucket() {
      fieldSetFlags()[15] = false;
      return this;
    }

    /**
     * Gets the value of the 'deleted' field.
     * @return The value.
     */
    public java.lang.Long getDeleted() {
      return deleted;
    }

    /**
     * Sets the value of the 'deleted' field.
     * @param value The value of 'deleted'.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder setDeleted(long value) {
      validate(fields()[16], value);
      this.deleted = value;
      fieldSetFlags()[16] = true;
      return this;
    }

    /**
     * Checks whether the 'deleted' field has been set.
     * @return True if the 'deleted' field has been set, false otherwise.
     */
    public boolean hasDeleted() {
      return fieldSetFlags()[16];
    }


    /**
     * Clears the value of the 'deleted' field.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder clearDeleted() {
      fieldSetFlags()[16] = false;
      return this;
    }

    /**
     * Gets the value of the 'namespace' field.
     * @return The value.
     */
    public java.lang.String getNamespace() {
      return namespace;
    }

    /**
     * Sets the value of the 'namespace' field.
     * @param value The value of 'namespace'.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder setNamespace(java.lang.String value) {
      validate(fields()[17], value);
      this.namespace = value;
      fieldSetFlags()[17] = true;
      return this;
    }

    /**
     * Checks whether the 'namespace' field has been set.
     * @return True if the 'namespace' field has been set, false otherwise.
     */
    public boolean hasNamespace() {
      return fieldSetFlags()[17];
    }


    /**
     * Clears the value of the 'namespace' field.
     * @return This builder.
     */
    public org.apache.hive.kafka.Wikipedia.Builder clearNamespace() {
      namespace = null;
      fieldSetFlags()[17] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Wikipedia build() {
      try {
        Wikipedia record = new Wikipedia();
        record.isrobot = fieldSetFlags()[0] ? this.isrobot : (java.lang.Boolean) defaultValue(fields()[0]);
        record.channel = fieldSetFlags()[1] ? this.channel : (java.lang.String) defaultValue(fields()[1]);
        record.timestamp = fieldSetFlags()[2] ? this.timestamp : (java.lang.String) defaultValue(fields()[2]);
        record.flags = fieldSetFlags()[3] ? this.flags : (java.lang.String) defaultValue(fields()[3]);
        record.isunpatrolled = fieldSetFlags()[4] ? this.isunpatrolled : (java.lang.Boolean) defaultValue(fields()[4]);
        record.page = fieldSetFlags()[5] ? this.page : (java.lang.String) defaultValue(fields()[5]);
        record.diffurl = fieldSetFlags()[6] ? this.diffurl : (java.lang.String) defaultValue(fields()[6]);
        record.added = fieldSetFlags()[7] ? this.added : (java.lang.Long) defaultValue(fields()[7]);
        record.comment = fieldSetFlags()[8] ? this.comment : (java.lang.String) defaultValue(fields()[8]);
        record.commentlength = fieldSetFlags()[9] ? this.commentlength : (java.lang.Long) defaultValue(fields()[9]);
        record.isnew = fieldSetFlags()[10] ? this.isnew : (java.lang.Boolean) defaultValue(fields()[10]);
        record.isminor = fieldSetFlags()[11] ? this.isminor : (java.lang.Boolean) defaultValue(fields()[11]);
        record.delta = fieldSetFlags()[12] ? this.delta : (java.lang.Long) defaultValue(fields()[12]);
        record.isanonymous = fieldSetFlags()[13] ? this.isanonymous : (java.lang.Boolean) defaultValue(fields()[13]);
        record.user = fieldSetFlags()[14] ? this.user : (java.lang.String) defaultValue(fields()[14]);
        record.deltabucket = fieldSetFlags()[15] ? this.deltabucket : (java.lang.Double) defaultValue(fields()[15]);
        record.deleted = fieldSetFlags()[16] ? this.deleted : (java.lang.Long) defaultValue(fields()[16]);
        record.namespace = fieldSetFlags()[17] ? this.namespace : (java.lang.String) defaultValue(fields()[17]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Wikipedia>
      WRITER$ = (org.apache.avro.io.DatumWriter<Wikipedia>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
      throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Wikipedia>
      READER$ = (org.apache.avro.io.DatumReader<Wikipedia>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
      throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
