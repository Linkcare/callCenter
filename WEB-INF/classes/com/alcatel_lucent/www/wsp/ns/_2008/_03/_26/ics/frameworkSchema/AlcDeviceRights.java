/**
 * AlcDeviceRights.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema;

public class AlcDeviceRights  implements java.io.Serializable {
    private boolean applicationAuthorized;

    private boolean extensionAuthorized;

    private boolean noeAuthorized;

    private boolean pdaAuthorized;

    private boolean thickAuthorized;

    private boolean tuiAuthorized;

    private boolean webAuthorized;

    public AlcDeviceRights() {
    }

    public AlcDeviceRights(
           boolean applicationAuthorized,
           boolean extensionAuthorized,
           boolean noeAuthorized,
           boolean pdaAuthorized,
           boolean thickAuthorized,
           boolean tuiAuthorized,
           boolean webAuthorized) {
           this.applicationAuthorized = applicationAuthorized;
           this.extensionAuthorized = extensionAuthorized;
           this.noeAuthorized = noeAuthorized;
           this.pdaAuthorized = pdaAuthorized;
           this.thickAuthorized = thickAuthorized;
           this.tuiAuthorized = tuiAuthorized;
           this.webAuthorized = webAuthorized;
    }


    /**
     * Gets the applicationAuthorized value for this AlcDeviceRights.
     * 
     * @return applicationAuthorized
     */
    public boolean isApplicationAuthorized() {
        return applicationAuthorized;
    }


    /**
     * Sets the applicationAuthorized value for this AlcDeviceRights.
     * 
     * @param applicationAuthorized
     */
    public void setApplicationAuthorized(boolean applicationAuthorized) {
        this.applicationAuthorized = applicationAuthorized;
    }


    /**
     * Gets the extensionAuthorized value for this AlcDeviceRights.
     * 
     * @return extensionAuthorized
     */
    public boolean isExtensionAuthorized() {
        return extensionAuthorized;
    }


    /**
     * Sets the extensionAuthorized value for this AlcDeviceRights.
     * 
     * @param extensionAuthorized
     */
    public void setExtensionAuthorized(boolean extensionAuthorized) {
        this.extensionAuthorized = extensionAuthorized;
    }


    /**
     * Gets the noeAuthorized value for this AlcDeviceRights.
     * 
     * @return noeAuthorized
     */
    public boolean isNoeAuthorized() {
        return noeAuthorized;
    }


    /**
     * Sets the noeAuthorized value for this AlcDeviceRights.
     * 
     * @param noeAuthorized
     */
    public void setNoeAuthorized(boolean noeAuthorized) {
        this.noeAuthorized = noeAuthorized;
    }


    /**
     * Gets the pdaAuthorized value for this AlcDeviceRights.
     * 
     * @return pdaAuthorized
     */
    public boolean isPdaAuthorized() {
        return pdaAuthorized;
    }


    /**
     * Sets the pdaAuthorized value for this AlcDeviceRights.
     * 
     * @param pdaAuthorized
     */
    public void setPdaAuthorized(boolean pdaAuthorized) {
        this.pdaAuthorized = pdaAuthorized;
    }


    /**
     * Gets the thickAuthorized value for this AlcDeviceRights.
     * 
     * @return thickAuthorized
     */
    public boolean isThickAuthorized() {
        return thickAuthorized;
    }


    /**
     * Sets the thickAuthorized value for this AlcDeviceRights.
     * 
     * @param thickAuthorized
     */
    public void setThickAuthorized(boolean thickAuthorized) {
        this.thickAuthorized = thickAuthorized;
    }


    /**
     * Gets the tuiAuthorized value for this AlcDeviceRights.
     * 
     * @return tuiAuthorized
     */
    public boolean isTuiAuthorized() {
        return tuiAuthorized;
    }


    /**
     * Sets the tuiAuthorized value for this AlcDeviceRights.
     * 
     * @param tuiAuthorized
     */
    public void setTuiAuthorized(boolean tuiAuthorized) {
        this.tuiAuthorized = tuiAuthorized;
    }


    /**
     * Gets the webAuthorized value for this AlcDeviceRights.
     * 
     * @return webAuthorized
     */
    public boolean isWebAuthorized() {
        return webAuthorized;
    }


    /**
     * Sets the webAuthorized value for this AlcDeviceRights.
     * 
     * @param webAuthorized
     */
    public void setWebAuthorized(boolean webAuthorized) {
        this.webAuthorized = webAuthorized;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlcDeviceRights)) return false;
        AlcDeviceRights other = (AlcDeviceRights) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.applicationAuthorized == other.isApplicationAuthorized() &&
            this.extensionAuthorized == other.isExtensionAuthorized() &&
            this.noeAuthorized == other.isNoeAuthorized() &&
            this.pdaAuthorized == other.isPdaAuthorized() &&
            this.thickAuthorized == other.isThickAuthorized() &&
            this.tuiAuthorized == other.isTuiAuthorized() &&
            this.webAuthorized == other.isWebAuthorized();
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
        _hashCode += (isApplicationAuthorized() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isExtensionAuthorized() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isNoeAuthorized() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPdaAuthorized() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isThickAuthorized() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTuiAuthorized() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isWebAuthorized() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlcDeviceRights.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "AlcDeviceRights"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationAuthorized");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "applicationAuthorized"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionAuthorized");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "extensionAuthorized"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noeAuthorized");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "noeAuthorized"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pdaAuthorized");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "pdaAuthorized"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thickAuthorized");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "thickAuthorized"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tuiAuthorized");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "tuiAuthorized"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webAuthorized");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "webAuthorized"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
