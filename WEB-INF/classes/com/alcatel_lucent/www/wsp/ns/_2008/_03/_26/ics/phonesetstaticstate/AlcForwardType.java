/**
 * AlcForwardType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phonesetstaticstate;

public class AlcForwardType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AlcForwardType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NO_FORWARD = "NO_FORWARD";
    public static final java.lang.String _IMMEDIATE = "IMMEDIATE";
    public static final java.lang.String _ON_BUSY = "ON_BUSY";
    public static final java.lang.String _ON_NO_ANSWER = "ON_NO_ANSWER";
    public static final java.lang.String _ON_BUSY_OR_NO_ANSWER = "ON_BUSY_OR_NO_ANSWER";
    public static final AlcForwardType NO_FORWARD = new AlcForwardType(_NO_FORWARD);
    public static final AlcForwardType IMMEDIATE = new AlcForwardType(_IMMEDIATE);
    public static final AlcForwardType ON_BUSY = new AlcForwardType(_ON_BUSY);
    public static final AlcForwardType ON_NO_ANSWER = new AlcForwardType(_ON_NO_ANSWER);
    public static final AlcForwardType ON_BUSY_OR_NO_ANSWER = new AlcForwardType(_ON_BUSY_OR_NO_ANSWER);
    public java.lang.String getValue() { return _value_;}
    public static AlcForwardType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AlcForwardType enumeration = (AlcForwardType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AlcForwardType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AlcForwardType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate", "AlcForwardType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
