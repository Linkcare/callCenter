/**
 * AlcDeviceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema;

public class AlcDeviceType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AlcDeviceType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _EXTENSION = "EXTENSION";
    public static final java.lang.String _NOE = "NOE";
    public static final java.lang.String _PDA = "PDA";
    public static final java.lang.String _THICK = "THICK";
    public static final java.lang.String _TUI = "TUI";
    public static final java.lang.String _WEB = "WEB";
    public static final AlcDeviceType EXTENSION = new AlcDeviceType(_EXTENSION);
    public static final AlcDeviceType NOE = new AlcDeviceType(_NOE);
    public static final AlcDeviceType PDA = new AlcDeviceType(_PDA);
    public static final AlcDeviceType THICK = new AlcDeviceType(_THICK);
    public static final AlcDeviceType TUI = new AlcDeviceType(_TUI);
    public static final AlcDeviceType WEB = new AlcDeviceType(_WEB);
    public java.lang.String getValue() { return _value_;}
    public static AlcDeviceType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AlcDeviceType enumeration = (AlcDeviceType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AlcDeviceType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AlcDeviceType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "AlcDeviceType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
