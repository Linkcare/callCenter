/**
 * AlcResultCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierSchema;

public class AlcResultCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AlcResultCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SUCCESS = "SUCCESS";
    public static final java.lang.String _ERROR_BAD_FRAMEWORK_SESSION_IDENTIFIER = "ERROR_BAD_FRAMEWORK_SESSION_IDENTIFIER";
    public static final java.lang.String _ERROR_INVALID_SUBSCRIPTION = "ERROR_INVALID_SUBSCRIPTION";
    public static final java.lang.String _ERROR_SERVICE_UNAVAILABLE = "ERROR_SERVICE_UNAVAILABLE";
    public static final java.lang.String _ERROR_BAD_PARAMETER_VALUE = "ERROR_BAD_PARAMETER_VALUE";
    public static final java.lang.String _ERROR_UNAUTHORIZED = "ERROR_UNAUTHORIZED";
    public static final java.lang.String _ERROR_SERVICE = "ERROR_SERVICE";
    public static final java.lang.String _ERROR_UNEXPECTED = "ERROR_UNEXPECTED";
    public static final AlcResultCode SUCCESS = new AlcResultCode(_SUCCESS);
    public static final AlcResultCode ERROR_BAD_FRAMEWORK_SESSION_IDENTIFIER = new AlcResultCode(_ERROR_BAD_FRAMEWORK_SESSION_IDENTIFIER);
    public static final AlcResultCode ERROR_INVALID_SUBSCRIPTION = new AlcResultCode(_ERROR_INVALID_SUBSCRIPTION);
    public static final AlcResultCode ERROR_SERVICE_UNAVAILABLE = new AlcResultCode(_ERROR_SERVICE_UNAVAILABLE);
    public static final AlcResultCode ERROR_BAD_PARAMETER_VALUE = new AlcResultCode(_ERROR_BAD_PARAMETER_VALUE);
    public static final AlcResultCode ERROR_UNAUTHORIZED = new AlcResultCode(_ERROR_UNAUTHORIZED);
    public static final AlcResultCode ERROR_SERVICE = new AlcResultCode(_ERROR_SERVICE);
    public static final AlcResultCode ERROR_UNEXPECTED = new AlcResultCode(_ERROR_UNEXPECTED);
    public java.lang.String getValue() { return _value_;}
    public static AlcResultCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AlcResultCode enumeration = (AlcResultCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AlcResultCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AlcResultCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/05/26/ics/notifierSchema", "AlcResultCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
