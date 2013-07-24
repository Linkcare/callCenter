/**
 * LoginSupervisorRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema;

public class LoginSupervisorRequest  implements java.io.Serializable {
    private java.lang.String supervisorLoginName;

    private java.lang.String supervisorPassword;

    private java.lang.String supervisedAccountId;

    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.AlcUserIdType supervisedAccountIdType;

    public LoginSupervisorRequest() {
    }

    public LoginSupervisorRequest(
           java.lang.String supervisorLoginName,
           java.lang.String supervisorPassword,
           java.lang.String supervisedAccountId,
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.AlcUserIdType supervisedAccountIdType) {
           this.supervisorLoginName = supervisorLoginName;
           this.supervisorPassword = supervisorPassword;
           this.supervisedAccountId = supervisedAccountId;
           this.supervisedAccountIdType = supervisedAccountIdType;
    }


    /**
     * Gets the supervisorLoginName value for this LoginSupervisorRequest.
     * 
     * @return supervisorLoginName
     */
    public java.lang.String getSupervisorLoginName() {
        return supervisorLoginName;
    }


    /**
     * Sets the supervisorLoginName value for this LoginSupervisorRequest.
     * 
     * @param supervisorLoginName
     */
    public void setSupervisorLoginName(java.lang.String supervisorLoginName) {
        this.supervisorLoginName = supervisorLoginName;
    }


    /**
     * Gets the supervisorPassword value for this LoginSupervisorRequest.
     * 
     * @return supervisorPassword
     */
    public java.lang.String getSupervisorPassword() {
        return supervisorPassword;
    }


    /**
     * Sets the supervisorPassword value for this LoginSupervisorRequest.
     * 
     * @param supervisorPassword
     */
    public void setSupervisorPassword(java.lang.String supervisorPassword) {
        this.supervisorPassword = supervisorPassword;
    }


    /**
     * Gets the supervisedAccountId value for this LoginSupervisorRequest.
     * 
     * @return supervisedAccountId
     */
    public java.lang.String getSupervisedAccountId() {
        return supervisedAccountId;
    }


    /**
     * Sets the supervisedAccountId value for this LoginSupervisorRequest.
     * 
     * @param supervisedAccountId
     */
    public void setSupervisedAccountId(java.lang.String supervisedAccountId) {
        this.supervisedAccountId = supervisedAccountId;
    }


    /**
     * Gets the supervisedAccountIdType value for this LoginSupervisorRequest.
     * 
     * @return supervisedAccountIdType
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.AlcUserIdType getSupervisedAccountIdType() {
        return supervisedAccountIdType;
    }


    /**
     * Sets the supervisedAccountIdType value for this LoginSupervisorRequest.
     * 
     * @param supervisedAccountIdType
     */
    public void setSupervisedAccountIdType(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.AlcUserIdType supervisedAccountIdType) {
        this.supervisedAccountIdType = supervisedAccountIdType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoginSupervisorRequest)) return false;
        LoginSupervisorRequest other = (LoginSupervisorRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.supervisorLoginName==null && other.getSupervisorLoginName()==null) || 
             (this.supervisorLoginName!=null &&
              this.supervisorLoginName.equals(other.getSupervisorLoginName()))) &&
            ((this.supervisorPassword==null && other.getSupervisorPassword()==null) || 
             (this.supervisorPassword!=null &&
              this.supervisorPassword.equals(other.getSupervisorPassword()))) &&
            ((this.supervisedAccountId==null && other.getSupervisedAccountId()==null) || 
             (this.supervisedAccountId!=null &&
              this.supervisedAccountId.equals(other.getSupervisedAccountId()))) &&
            ((this.supervisedAccountIdType==null && other.getSupervisedAccountIdType()==null) || 
             (this.supervisedAccountIdType!=null &&
              this.supervisedAccountIdType.equals(other.getSupervisedAccountIdType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSupervisorLoginName() != null) {
            _hashCode += getSupervisorLoginName().hashCode();
        }
        if (getSupervisorPassword() != null) {
            _hashCode += getSupervisorPassword().hashCode();
        }
        if (getSupervisedAccountId() != null) {
            _hashCode += getSupervisedAccountId().hashCode();
        }
        if (getSupervisedAccountIdType() != null) {
            _hashCode += getSupervisedAccountIdType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoginSupervisorRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "loginSupervisorRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisorLoginName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "supervisorLoginName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisorPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "supervisorPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisedAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "supervisedAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisedAccountIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "supervisedAccountIdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "AlcUserIdType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
