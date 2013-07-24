/**
 * AlcResultCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema;

public class AlcResultCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AlcResultCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SUCCESS = "SUCCESS";
    public static final java.lang.String _ERROR_DTA_CONNECTION = "ERROR_DTA_CONNECTION";
    public static final java.lang.String _ERROR_BAD_FRAMEWORK_SESSION_IDENTIFIER = "ERROR_BAD_FRAMEWORK_SESSION_IDENTIFIER";
    public static final java.lang.String _ERROR_INVALID_OPERATION = "ERROR_INVALID_OPERATION";
    public static final java.lang.String _ERROR_LICENSE_REQUIRED = "ERROR_LICENSE_REQUIRED";
    public static final java.lang.String _ERROR_SERVICE_UNAVAILABLE = "ERROR_SERVICE_UNAVAILABLE";
    public static final java.lang.String _ERROR_BAD_PARAMETER_VALUE = "ERROR_BAD_PARAMETER_VALUE";
    public static final java.lang.String _ERROR_UNAUTHORIZED = "ERROR_UNAUTHORIZED";
    public static final java.lang.String _ERROR_SERVICE = "ERROR_SERVICE";
    public static final java.lang.String _ERROR_RETRY_AFTER = "ERROR_RETRY_AFTER";
    public static final java.lang.String _ERROR_PBX_LINK_NOT_CONNECTED = "ERROR_PBX_LINK_NOT_CONNECTED";
    public static final java.lang.String _ERROR_LINE_NOT_MONITORED = "ERROR_LINE_NOT_MONITORED";
    public static final java.lang.String _ERROR_UNKNOWN_LINE = "ERROR_UNKNOWN_LINE";
    public static final java.lang.String _ERROR_OPERATION_NOT_AUTHORIZED = "ERROR_OPERATION_NOT_AUTHORIZED";
    public static final java.lang.String _ERROR_INCOMPATIBLE_WITH_STATE = "ERROR_INCOMPATIBLE_WITH_STATE";
    public static final java.lang.String _ERROR_SERVICE_NOT_PROVIDED = "ERROR_SERVICE_NOT_PROVIDED";
    public static final java.lang.String _ERROR_ACAPI_NOT_READY = "ERROR_ACAPI_NOT_READY";
    public static final java.lang.String _ERROR_INCORRECT_PARAMETER = "ERROR_INCORRECT_PARAMETER";
    public static final java.lang.String _ERROR_NOMAD_LOGIN = "ERROR_NOMAD_LOGIN";
    public static final java.lang.String _ERROR_ACAPI_LOCK_NOT_LOADED = "ERROR_ACAPI_LOCK_NOT_LOADED";
    public static final java.lang.String _ERROR_NOT_PROVIDED_ON_THIS_SERVER = "ERROR_NOT_PROVIDED_ON_THIS_SERVER";
    public static final java.lang.String _ERROR_INVALID_SERVERS_CONFIG = "ERROR_INVALID_SERVERS_CONFIG";
    public static final java.lang.String _ERROR_INVALID_USERS_CONFIG = "ERROR_INVALID_USERS_CONFIG";
    public static final java.lang.String _ERROR_BAD_SOAP_PARAMETERS_NUMBER = "ERROR_BAD_SOAP_PARAMETERS_NUMBER";
    public static final java.lang.String _ERROR_VALUE_OUT_OF_BOUND = "ERROR_VALUE_OUT_OF_BOUND";
    public static final java.lang.String _ERROR_OPERATION_NOT_IMPLEMENTED = "ERROR_OPERATION_NOT_IMPLEMENTED";
    public static final java.lang.String _ERROR_FILE_NOT_FOUND = "ERROR_FILE_NOT_FOUND";
    public static final java.lang.String _ERROR_ACAPI_SERVER = "ERROR_ACAPI_SERVER";
    public static final java.lang.String _ERROR_UPK_REFRESH_REQUIRED = "ERROR_UPK_REFRESH_REQUIRED";
    public static final java.lang.String _ERROR_UNEXPECTED = "ERROR_UNEXPECTED";
    public static final AlcResultCode SUCCESS = new AlcResultCode(_SUCCESS);
    public static final AlcResultCode ERROR_DTA_CONNECTION = new AlcResultCode(_ERROR_DTA_CONNECTION);
    public static final AlcResultCode ERROR_BAD_FRAMEWORK_SESSION_IDENTIFIER = new AlcResultCode(_ERROR_BAD_FRAMEWORK_SESSION_IDENTIFIER);
    public static final AlcResultCode ERROR_INVALID_OPERATION = new AlcResultCode(_ERROR_INVALID_OPERATION);
    public static final AlcResultCode ERROR_LICENSE_REQUIRED = new AlcResultCode(_ERROR_LICENSE_REQUIRED);
    public static final AlcResultCode ERROR_SERVICE_UNAVAILABLE = new AlcResultCode(_ERROR_SERVICE_UNAVAILABLE);
    public static final AlcResultCode ERROR_BAD_PARAMETER_VALUE = new AlcResultCode(_ERROR_BAD_PARAMETER_VALUE);
    public static final AlcResultCode ERROR_UNAUTHORIZED = new AlcResultCode(_ERROR_UNAUTHORIZED);
    public static final AlcResultCode ERROR_SERVICE = new AlcResultCode(_ERROR_SERVICE);
    public static final AlcResultCode ERROR_RETRY_AFTER = new AlcResultCode(_ERROR_RETRY_AFTER);
    public static final AlcResultCode ERROR_PBX_LINK_NOT_CONNECTED = new AlcResultCode(_ERROR_PBX_LINK_NOT_CONNECTED);
    public static final AlcResultCode ERROR_LINE_NOT_MONITORED = new AlcResultCode(_ERROR_LINE_NOT_MONITORED);
    public static final AlcResultCode ERROR_UNKNOWN_LINE = new AlcResultCode(_ERROR_UNKNOWN_LINE);
    public static final AlcResultCode ERROR_OPERATION_NOT_AUTHORIZED = new AlcResultCode(_ERROR_OPERATION_NOT_AUTHORIZED);
    public static final AlcResultCode ERROR_INCOMPATIBLE_WITH_STATE = new AlcResultCode(_ERROR_INCOMPATIBLE_WITH_STATE);
    public static final AlcResultCode ERROR_SERVICE_NOT_PROVIDED = new AlcResultCode(_ERROR_SERVICE_NOT_PROVIDED);
    public static final AlcResultCode ERROR_ACAPI_NOT_READY = new AlcResultCode(_ERROR_ACAPI_NOT_READY);
    public static final AlcResultCode ERROR_INCORRECT_PARAMETER = new AlcResultCode(_ERROR_INCORRECT_PARAMETER);
    public static final AlcResultCode ERROR_NOMAD_LOGIN = new AlcResultCode(_ERROR_NOMAD_LOGIN);
    public static final AlcResultCode ERROR_ACAPI_LOCK_NOT_LOADED = new AlcResultCode(_ERROR_ACAPI_LOCK_NOT_LOADED);
    public static final AlcResultCode ERROR_NOT_PROVIDED_ON_THIS_SERVER = new AlcResultCode(_ERROR_NOT_PROVIDED_ON_THIS_SERVER);
    public static final AlcResultCode ERROR_INVALID_SERVERS_CONFIG = new AlcResultCode(_ERROR_INVALID_SERVERS_CONFIG);
    public static final AlcResultCode ERROR_INVALID_USERS_CONFIG = new AlcResultCode(_ERROR_INVALID_USERS_CONFIG);
    public static final AlcResultCode ERROR_BAD_SOAP_PARAMETERS_NUMBER = new AlcResultCode(_ERROR_BAD_SOAP_PARAMETERS_NUMBER);
    public static final AlcResultCode ERROR_VALUE_OUT_OF_BOUND = new AlcResultCode(_ERROR_VALUE_OUT_OF_BOUND);
    public static final AlcResultCode ERROR_OPERATION_NOT_IMPLEMENTED = new AlcResultCode(_ERROR_OPERATION_NOT_IMPLEMENTED);
    public static final AlcResultCode ERROR_FILE_NOT_FOUND = new AlcResultCode(_ERROR_FILE_NOT_FOUND);
    public static final AlcResultCode ERROR_ACAPI_SERVER = new AlcResultCode(_ERROR_ACAPI_SERVER);
    public static final AlcResultCode ERROR_UPK_REFRESH_REQUIRED = new AlcResultCode(_ERROR_UPK_REFRESH_REQUIRED);
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "AlcResultCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
