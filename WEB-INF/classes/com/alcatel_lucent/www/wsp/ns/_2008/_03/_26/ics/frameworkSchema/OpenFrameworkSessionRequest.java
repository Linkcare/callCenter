/**
 * OpenFrameworkSessionRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema;

public class OpenFrameworkSessionRequest  implements java.io.Serializable {
    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.AlcApplicationType application;

    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.AlcDeviceType device;

    private java.lang.String fwSessionId;

    public OpenFrameworkSessionRequest() {
    }

    public OpenFrameworkSessionRequest(
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.AlcApplicationType application,
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.AlcDeviceType device,
           java.lang.String fwSessionId) {
           this.application = application;
           this.device = device;
           this.fwSessionId = fwSessionId;
    }


    /**
     * Gets the application value for this OpenFrameworkSessionRequest.
     * 
     * @return application
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.AlcApplicationType getApplication() {
        return application;
    }


    /**
     * Sets the application value for this OpenFrameworkSessionRequest.
     * 
     * @param application
     */
    public void setApplication(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.AlcApplicationType application) {
        this.application = application;
    }


    /**
     * Gets the device value for this OpenFrameworkSessionRequest.
     * 
     * @return device
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.AlcDeviceType getDevice() {
        return device;
    }


    /**
     * Sets the device value for this OpenFrameworkSessionRequest.
     * 
     * @param device
     */
    public void setDevice(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.AlcDeviceType device) {
        this.device = device;
    }


    /**
     * Gets the fwSessionId value for this OpenFrameworkSessionRequest.
     * 
     * @return fwSessionId
     */
    public java.lang.String getFwSessionId() {
        return fwSessionId;
    }


    /**
     * Sets the fwSessionId value for this OpenFrameworkSessionRequest.
     * 
     * @param fwSessionId
     */
    public void setFwSessionId(java.lang.String fwSessionId) {
        this.fwSessionId = fwSessionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OpenFrameworkSessionRequest)) return false;
        OpenFrameworkSessionRequest other = (OpenFrameworkSessionRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.application==null && other.getApplication()==null) || 
             (this.application!=null &&
              this.application.equals(other.getApplication()))) &&
            ((this.device==null && other.getDevice()==null) || 
             (this.device!=null &&
              this.device.equals(other.getDevice()))) &&
            ((this.fwSessionId==null && other.getFwSessionId()==null) || 
             (this.fwSessionId!=null &&
              this.fwSessionId.equals(other.getFwSessionId())));
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
        if (getApplication() != null) {
            _hashCode += getApplication().hashCode();
        }
        if (getDevice() != null) {
            _hashCode += getDevice().hashCode();
        }
        if (getFwSessionId() != null) {
            _hashCode += getFwSessionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OpenFrameworkSessionRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "openFrameworkSessionRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("application");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "application"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "AlcApplicationType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("device");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "device"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "AlcDeviceType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fwSessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "fwSessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
