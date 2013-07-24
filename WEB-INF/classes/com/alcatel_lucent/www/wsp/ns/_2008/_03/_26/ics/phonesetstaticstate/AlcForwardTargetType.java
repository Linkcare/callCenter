/**
 * AlcForwardTargetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phonesetstaticstate;

public class AlcForwardTargetType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AlcForwardTargetType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NONE = "NONE";
    public static final java.lang.String _NUMBER = "NUMBER";
    public static final java.lang.String _VOICE_MAIL = "VOICE_MAIL";
    public static final java.lang.String _ROUTING_SERVICE = "ROUTING_SERVICE";
    public static final java.lang.String _PERSONAL_ATTENDANT = "PERSONAL_ATTENDANT";
    public static final AlcForwardTargetType NONE = new AlcForwardTargetType(_NONE);
    public static final AlcForwardTargetType NUMBER = new AlcForwardTargetType(_NUMBER);
    public static final AlcForwardTargetType VOICE_MAIL = new AlcForwardTargetType(_VOICE_MAIL);
    public static final AlcForwardTargetType ROUTING_SERVICE = new AlcForwardTargetType(_ROUTING_SERVICE);
    public static final AlcForwardTargetType PERSONAL_ATTENDANT = new AlcForwardTargetType(_PERSONAL_ATTENDANT);
    public java.lang.String getValue() { return _value_;}
    public static AlcForwardTargetType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AlcForwardTargetType enumeration = (AlcForwardTargetType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AlcForwardTargetType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AlcForwardTargetType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate", "AlcForwardTargetType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
