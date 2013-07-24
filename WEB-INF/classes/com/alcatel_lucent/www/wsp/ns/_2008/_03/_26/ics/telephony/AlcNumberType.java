/**
 * AlcNumberType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony;

public class AlcNumberType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AlcNumberType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NONE = "NONE";
    public static final java.lang.String _BOSS = "BOSS";
    public static final java.lang.String _SECRETARY = "SECRETARY";
    public static final java.lang.String _GROUP = "GROUP";
    public static final java.lang.String _ASSOCIATE = "ASSOCIATE";
    public static final java.lang.String _VOICEMAIL = "VOICEMAIL";
    public static final java.lang.String _VOICEMAILCONSULT = "VOICEMAILCONSULT";
    public static final AlcNumberType NONE = new AlcNumberType(_NONE);
    public static final AlcNumberType BOSS = new AlcNumberType(_BOSS);
    public static final AlcNumberType SECRETARY = new AlcNumberType(_SECRETARY);
    public static final AlcNumberType GROUP = new AlcNumberType(_GROUP);
    public static final AlcNumberType ASSOCIATE = new AlcNumberType(_ASSOCIATE);
    public static final AlcNumberType VOICEMAIL = new AlcNumberType(_VOICEMAIL);
    public static final AlcNumberType VOICEMAILCONSULT = new AlcNumberType(_VOICEMAILCONSULT);
    public java.lang.String getValue() { return _value_;}
    public static AlcNumberType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AlcNumberType enumeration = (AlcNumberType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AlcNumberType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AlcNumberType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcNumberType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
