/**
 * ChangePasswordRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema;

public class ChangePasswordRequest  implements java.io.Serializable {
    private java.lang.String fwSessionId;

    private java.lang.String oldPassword;

    private java.lang.String newPassword;

    public ChangePasswordRequest() {
    }

    public ChangePasswordRequest(
           java.lang.String fwSessionId,
           java.lang.String oldPassword,
           java.lang.String newPassword) {
           this.fwSessionId = fwSessionId;
           this.oldPassword = oldPassword;
           this.newPassword = newPassword;
    }


    /**
     * Gets the fwSessionId value for this ChangePasswordRequest.
     * 
     * @return fwSessionId
     */
    public java.lang.String getFwSessionId() {
        return fwSessionId;
    }


    /**
     * Sets the fwSessionId value for this ChangePasswordRequest.
     * 
     * @param fwSessionId
     */
    public void setFwSessionId(java.lang.String fwSessionId) {
        this.fwSessionId = fwSessionId;
    }


    /**
     * Gets the oldPassword value for this ChangePasswordRequest.
     * 
     * @return oldPassword
     */
    public java.lang.String getOldPassword() {
        return oldPassword;
    }


    /**
     * Sets the oldPassword value for this ChangePasswordRequest.
     * 
     * @param oldPassword
     */
    public void setOldPassword(java.lang.String oldPassword) {
        this.oldPassword = oldPassword;
    }


    /**
     * Gets the newPassword value for this ChangePasswordRequest.
     * 
     * @return newPassword
     */
    public java.lang.String getNewPassword() {
        return newPassword;
    }


    /**
     * Sets the newPassword value for this ChangePasswordRequest.
     * 
     * @param newPassword
     */
    public void setNewPassword(java.lang.String newPassword) {
        this.newPassword = newPassword;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangePasswordRequest)) return false;
        ChangePasswordRequest other = (ChangePasswordRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fwSessionId==null && other.getFwSessionId()==null) || 
             (this.fwSessionId!=null &&
              this.fwSessionId.equals(other.getFwSessionId()))) &&
            ((this.oldPassword==null && other.getOldPassword()==null) || 
             (this.oldPassword!=null &&
              this.oldPassword.equals(other.getOldPassword()))) &&
            ((this.newPassword==null && other.getNewPassword()==null) || 
             (this.newPassword!=null &&
              this.newPassword.equals(other.getNewPassword())));
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
        if (getFwSessionId() != null) {
            _hashCode += getFwSessionId().hashCode();
        }
        if (getOldPassword() != null) {
            _hashCode += getOldPassword().hashCode();
        }
        if (getNewPassword() != null) {
            _hashCode += getNewPassword().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangePasswordRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "changePasswordRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fwSessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "fwSessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "oldPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "newPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
