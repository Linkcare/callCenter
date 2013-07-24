/**
 * AlcBasicTelephonicStateInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony;

public class AlcBasicTelephonicStateInfo  implements java.io.Serializable {
    private java.lang.String lineNumber;

    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcBasicTelephonicState lineState;

    public AlcBasicTelephonicStateInfo() {
    }

    public AlcBasicTelephonicStateInfo(
           java.lang.String lineNumber,
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcBasicTelephonicState lineState) {
           this.lineNumber = lineNumber;
           this.lineState = lineState;
    }


    /**
     * Gets the lineNumber value for this AlcBasicTelephonicStateInfo.
     * 
     * @return lineNumber
     */
    public java.lang.String getLineNumber() {
        return lineNumber;
    }


    /**
     * Sets the lineNumber value for this AlcBasicTelephonicStateInfo.
     * 
     * @param lineNumber
     */
    public void setLineNumber(java.lang.String lineNumber) {
        this.lineNumber = lineNumber;
    }


    /**
     * Gets the lineState value for this AlcBasicTelephonicStateInfo.
     * 
     * @return lineState
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcBasicTelephonicState getLineState() {
        return lineState;
    }


    /**
     * Sets the lineState value for this AlcBasicTelephonicStateInfo.
     * 
     * @param lineState
     */
    public void setLineState(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcBasicTelephonicState lineState) {
        this.lineState = lineState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlcBasicTelephonicStateInfo)) return false;
        AlcBasicTelephonicStateInfo other = (AlcBasicTelephonicStateInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineNumber==null && other.getLineNumber()==null) || 
             (this.lineNumber!=null &&
              this.lineNumber.equals(other.getLineNumber()))) &&
            ((this.lineState==null && other.getLineState()==null) || 
             (this.lineState!=null &&
              this.lineState.equals(other.getLineState())));
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
        if (getLineNumber() != null) {
            _hashCode += getLineNumber().hashCode();
        }
        if (getLineState() != null) {
            _hashCode += getLineState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlcBasicTelephonicStateInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcBasicTelephonicStateInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "lineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "lineState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcBasicTelephonicState"));
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
