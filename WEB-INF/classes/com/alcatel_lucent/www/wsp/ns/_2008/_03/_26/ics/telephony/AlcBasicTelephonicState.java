/**
 * AlcBasicTelephonicState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony;

public class AlcBasicTelephonicState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AlcBasicTelephonicState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FREE = "FREE";
    public static final java.lang.String _RINGING_INCOMING = "RINGING_INCOMING";
    public static final java.lang.String _BUSY = "BUSY";
    public static final java.lang.String _OUT_OF_SERVICE = "OUT_OF_SERVICE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final AlcBasicTelephonicState FREE = new AlcBasicTelephonicState(_FREE);
    public static final AlcBasicTelephonicState RINGING_INCOMING = new AlcBasicTelephonicState(_RINGING_INCOMING);
    public static final AlcBasicTelephonicState BUSY = new AlcBasicTelephonicState(_BUSY);
    public static final AlcBasicTelephonicState OUT_OF_SERVICE = new AlcBasicTelephonicState(_OUT_OF_SERVICE);
    public static final AlcBasicTelephonicState UNKNOWN = new AlcBasicTelephonicState(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static AlcBasicTelephonicState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AlcBasicTelephonicState enumeration = (AlcBasicTelephonicState)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AlcBasicTelephonicState fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlcBasicTelephonicState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcBasicTelephonicState"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
