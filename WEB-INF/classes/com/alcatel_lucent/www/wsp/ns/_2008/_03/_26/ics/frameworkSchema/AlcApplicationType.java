/**
 * AlcApplicationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema;

public class AlcApplicationType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AlcApplicationType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _HOME_PAGE = "HOME_PAGE";
    public static final java.lang.String _MY_ASSISTANT = "MY_ASSISTANT";
    public static final java.lang.String _MY_MESSAGING = "MY_MESSAGING";
    public static final java.lang.String _MY_PHONE = "MY_PHONE";
    public static final java.lang.String _MY_TEAMWORK = "MY_TEAMWORK";
    public static final java.lang.String _MY_INSTANT_COMMUNICATOR = "MY_INSTANT_COMMUNICATOR";
    public static final AlcApplicationType HOME_PAGE = new AlcApplicationType(_HOME_PAGE);
    public static final AlcApplicationType MY_ASSISTANT = new AlcApplicationType(_MY_ASSISTANT);
    public static final AlcApplicationType MY_MESSAGING = new AlcApplicationType(_MY_MESSAGING);
    public static final AlcApplicationType MY_PHONE = new AlcApplicationType(_MY_PHONE);
    public static final AlcApplicationType MY_TEAMWORK = new AlcApplicationType(_MY_TEAMWORK);
    public static final AlcApplicationType MY_INSTANT_COMMUNICATOR = new AlcApplicationType(_MY_INSTANT_COMMUNICATOR);
    public java.lang.String getValue() { return _value_;}
    public static AlcApplicationType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AlcApplicationType enumeration = (AlcApplicationType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AlcApplicationType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AlcApplicationType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "AlcApplicationType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
