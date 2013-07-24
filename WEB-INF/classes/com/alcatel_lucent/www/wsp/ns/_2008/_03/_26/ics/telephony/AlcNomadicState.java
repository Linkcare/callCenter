/**
 * AlcNomadicState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony;

public class AlcNomadicState  implements java.io.Serializable {
    private java.lang.String homeNumber;

    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcNomadicMode mode;

    public AlcNomadicState() {
    }

    public AlcNomadicState(
           java.lang.String homeNumber,
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcNomadicMode mode) {
           this.homeNumber = homeNumber;
           this.mode = mode;
    }


    /**
     * Gets the homeNumber value for this AlcNomadicState.
     * 
     * @return homeNumber
     */
    public java.lang.String getHomeNumber() {
        return homeNumber;
    }


    /**
     * Sets the homeNumber value for this AlcNomadicState.
     * 
     * @param homeNumber
     */
    public void setHomeNumber(java.lang.String homeNumber) {
        this.homeNumber = homeNumber;
    }


    /**
     * Gets the mode value for this AlcNomadicState.
     * 
     * @return mode
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcNomadicMode getMode() {
        return mode;
    }


    /**
     * Sets the mode value for this AlcNomadicState.
     * 
     * @param mode
     */
    public void setMode(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcNomadicMode mode) {
        this.mode = mode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlcNomadicState)) return false;
        AlcNomadicState other = (AlcNomadicState) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.homeNumber==null && other.getHomeNumber()==null) || 
             (this.homeNumber!=null &&
              this.homeNumber.equals(other.getHomeNumber()))) &&
            ((this.mode==null && other.getMode()==null) || 
             (this.mode!=null &&
              this.mode.equals(other.getMode())));
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
        if (getHomeNumber() != null) {
            _hashCode += getHomeNumber().hashCode();
        }
        if (getMode() != null) {
            _hashCode += getMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlcNomadicState.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcNomadicState"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "homeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "mode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcNomadicMode"));
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
