/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.shankarsan.raspi.pin.invoke.dto.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class RaspiPinInvokePayload extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5332431809779663685L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RaspiPinInvokePayload\",\"namespace\":\"com.shankarsan.raspi.pin.invoke.dto.avro\",\"fields\":[{\"name\":\"intervalMillis\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"pin\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"pulseCount\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"pulseMillis\",\"type\":[\"null\",\"int\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<RaspiPinInvokePayload> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<RaspiPinInvokePayload> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<RaspiPinInvokePayload> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<RaspiPinInvokePayload> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<RaspiPinInvokePayload> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this RaspiPinInvokePayload to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a RaspiPinInvokePayload from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a RaspiPinInvokePayload instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static RaspiPinInvokePayload fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private Integer intervalMillis;
  private Integer pin;
  private Integer pulseCount;
  private Integer pulseMillis;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public RaspiPinInvokePayload() {}

  /**
   * All-args constructor.
   * @param intervalMillis The new value for intervalMillis
   * @param pin The new value for pin
   * @param pulseCount The new value for pulseCount
   * @param pulseMillis The new value for pulseMillis
   */
  public RaspiPinInvokePayload(Integer intervalMillis, Integer pin, Integer pulseCount, Integer pulseMillis) {
    this.intervalMillis = intervalMillis;
    this.pin = pin;
    this.pulseCount = pulseCount;
    this.pulseMillis = pulseMillis;
  }

  @Override
  public SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public Object get(int field$) {
    switch (field$) {
    case 0: return intervalMillis;
    case 1: return pin;
    case 2: return pulseCount;
    case 3: return pulseMillis;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: intervalMillis = (Integer)value$; break;
    case 1: pin = (Integer)value$; break;
    case 2: pulseCount = (Integer)value$; break;
    case 3: pulseMillis = (Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'intervalMillis' field.
   * @return The value of the 'intervalMillis' field.
   */
  public Integer getIntervalMillis() {
    return intervalMillis;
  }


  /**
   * Sets the value of the 'intervalMillis' field.
   * @param value the value to set.
   */
  public void setIntervalMillis(Integer value) {
    this.intervalMillis = value;
  }

  /**
   * Gets the value of the 'pin' field.
   * @return The value of the 'pin' field.
   */
  public Integer getPin() {
    return pin;
  }


  /**
   * Sets the value of the 'pin' field.
   * @param value the value to set.
   */
  public void setPin(Integer value) {
    this.pin = value;
  }

  /**
   * Gets the value of the 'pulseCount' field.
   * @return The value of the 'pulseCount' field.
   */
  public Integer getPulseCount() {
    return pulseCount;
  }


  /**
   * Sets the value of the 'pulseCount' field.
   * @param value the value to set.
   */
  public void setPulseCount(Integer value) {
    this.pulseCount = value;
  }

  /**
   * Gets the value of the 'pulseMillis' field.
   * @return The value of the 'pulseMillis' field.
   */
  public Integer getPulseMillis() {
    return pulseMillis;
  }


  /**
   * Sets the value of the 'pulseMillis' field.
   * @param value the value to set.
   */
  public void setPulseMillis(Integer value) {
    this.pulseMillis = value;
  }

  /**
   * Creates a new RaspiPinInvokePayload RecordBuilder.
   * @return A new RaspiPinInvokePayload RecordBuilder
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Creates a new RaspiPinInvokePayload RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new RaspiPinInvokePayload RecordBuilder
   */
  public static Builder newBuilder(Builder other) {
    if (other == null) {
      return new Builder();
    } else {
      return new Builder(other);
    }
  }

  /**
   * Creates a new RaspiPinInvokePayload RecordBuilder by copying an existing RaspiPinInvokePayload instance.
   * @param other The existing instance to copy.
   * @return A new RaspiPinInvokePayload RecordBuilder
   */
  public static Builder newBuilder(RaspiPinInvokePayload other) {
    if (other == null) {
      return new Builder();
    } else {
      return new Builder(other);
    }
  }

  /**
   * RecordBuilder for RaspiPinInvokePayload instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RaspiPinInvokePayload>
    implements org.apache.avro.data.RecordBuilder<RaspiPinInvokePayload> {

    private Integer intervalMillis;
    private Integer pin;
    private Integer pulseCount;
    private Integer pulseMillis;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.intervalMillis)) {
        this.intervalMillis = data().deepCopy(fields()[0].schema(), other.intervalMillis);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.pin)) {
        this.pin = data().deepCopy(fields()[1].schema(), other.pin);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.pulseCount)) {
        this.pulseCount = data().deepCopy(fields()[2].schema(), other.pulseCount);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.pulseMillis)) {
        this.pulseMillis = data().deepCopy(fields()[3].schema(), other.pulseMillis);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing RaspiPinInvokePayload instance
     * @param other The existing instance to copy.
     */
    private Builder(RaspiPinInvokePayload other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.intervalMillis)) {
        this.intervalMillis = data().deepCopy(fields()[0].schema(), other.intervalMillis);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.pin)) {
        this.pin = data().deepCopy(fields()[1].schema(), other.pin);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.pulseCount)) {
        this.pulseCount = data().deepCopy(fields()[2].schema(), other.pulseCount);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.pulseMillis)) {
        this.pulseMillis = data().deepCopy(fields()[3].schema(), other.pulseMillis);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'intervalMillis' field.
      * @return The value.
      */
    public Integer getIntervalMillis() {
      return intervalMillis;
    }


    /**
      * Sets the value of the 'intervalMillis' field.
      * @param value The value of 'intervalMillis'.
      * @return This builder.
      */
    public Builder setIntervalMillis(Integer value) {
      validate(fields()[0], value);
      this.intervalMillis = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'intervalMillis' field has been set.
      * @return True if the 'intervalMillis' field has been set, false otherwise.
      */
    public boolean hasIntervalMillis() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'intervalMillis' field.
      * @return This builder.
      */
    public Builder clearIntervalMillis() {
      intervalMillis = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'pin' field.
      * @return The value.
      */
    public Integer getPin() {
      return pin;
    }


    /**
      * Sets the value of the 'pin' field.
      * @param value The value of 'pin'.
      * @return This builder.
      */
    public Builder setPin(Integer value) {
      validate(fields()[1], value);
      this.pin = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'pin' field has been set.
      * @return True if the 'pin' field has been set, false otherwise.
      */
    public boolean hasPin() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'pin' field.
      * @return This builder.
      */
    public Builder clearPin() {
      pin = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'pulseCount' field.
      * @return The value.
      */
    public Integer getPulseCount() {
      return pulseCount;
    }


    /**
      * Sets the value of the 'pulseCount' field.
      * @param value The value of 'pulseCount'.
      * @return This builder.
      */
    public Builder setPulseCount(Integer value) {
      validate(fields()[2], value);
      this.pulseCount = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'pulseCount' field has been set.
      * @return True if the 'pulseCount' field has been set, false otherwise.
      */
    public boolean hasPulseCount() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'pulseCount' field.
      * @return This builder.
      */
    public Builder clearPulseCount() {
      pulseCount = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'pulseMillis' field.
      * @return The value.
      */
    public Integer getPulseMillis() {
      return pulseMillis;
    }


    /**
      * Sets the value of the 'pulseMillis' field.
      * @param value The value of 'pulseMillis'.
      * @return This builder.
      */
    public Builder setPulseMillis(Integer value) {
      validate(fields()[3], value);
      this.pulseMillis = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'pulseMillis' field has been set.
      * @return True if the 'pulseMillis' field has been set, false otherwise.
      */
    public boolean hasPulseMillis() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'pulseMillis' field.
      * @return This builder.
      */
    public Builder clearPulseMillis() {
      pulseMillis = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public RaspiPinInvokePayload build() {
      try {
        RaspiPinInvokePayload record = new RaspiPinInvokePayload();
        record.intervalMillis = fieldSetFlags()[0] ? this.intervalMillis : (Integer) defaultValue(fields()[0]);
        record.pin = fieldSetFlags()[1] ? this.pin : (Integer) defaultValue(fields()[1]);
        record.pulseCount = fieldSetFlags()[2] ? this.pulseCount : (Integer) defaultValue(fields()[2]);
        record.pulseMillis = fieldSetFlags()[3] ? this.pulseMillis : (Integer) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<RaspiPinInvokePayload>
    WRITER$ = (org.apache.avro.io.DatumWriter<RaspiPinInvokePayload>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<RaspiPinInvokePayload>
    READER$ = (org.apache.avro.io.DatumReader<RaspiPinInvokePayload>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.intervalMillis == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeInt(this.intervalMillis);
    }

    if (this.pin == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeInt(this.pin);
    }

    if (this.pulseCount == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeInt(this.pulseCount);
    }

    if (this.pulseMillis == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeInt(this.pulseMillis);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.intervalMillis = null;
      } else {
        this.intervalMillis = in.readInt();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.pin = null;
      } else {
        this.pin = in.readInt();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.pulseCount = null;
      } else {
        this.pulseCount = in.readInt();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.pulseMillis = null;
      } else {
        this.pulseMillis = in.readInt();
      }

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.intervalMillis = null;
          } else {
            this.intervalMillis = in.readInt();
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.pin = null;
          } else {
            this.pin = in.readInt();
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.pulseCount = null;
          } else {
            this.pulseCount = in.readInt();
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.pulseMillis = null;
          } else {
            this.pulseMillis = in.readInt();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










