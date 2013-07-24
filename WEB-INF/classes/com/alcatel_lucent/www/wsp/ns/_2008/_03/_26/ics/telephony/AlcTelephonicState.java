/**
 * AlcTelephonicState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony;

public class AlcTelephonicState  implements java.io.Serializable {
    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCall[] calls;

    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcLineCapabilities capabilities;

    private long currentCallRef;

    public AlcTelephonicState() {
    }

    public AlcTelephonicState(
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCall[] calls,
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcLineCapabilities capabilities,
           long currentCallRef) {
           this.calls = calls;
           this.capabilities = capabilities;
           this.currentCallRef = currentCallRef;
    }


    /**
     * Gets the calls value for this AlcTelephonicState.
     * 
     * @return calls
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCall[] getCalls() {
        return calls;
    }


    /**
     * Sets the calls value for this AlcTelephonicState.
     * 
     * @param calls
     */
    public void setCalls(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCall[] calls) {
        this.calls = calls;
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCall getCalls(int i) {
        return this.calls[i];
    }

    public void setCalls(int i, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCall _value) {
        this.calls[i] = _value;
    }


    /**
     * Gets the capabilities value for this AlcTelephonicState.
     * 
     * @return capabilities
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcLineCapabilities getCapabilities() {
        return capabilities;
    }


    /**
     * Sets the capabilities value for this AlcTelephonicState.
     * 
     * @param capabilities
     */
    public void setCapabilities(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcLineCapabilities capabilities) {
        this.capabilities = capabilities;
    }


    /**
     * Gets the currentCallRef value for this AlcTelephonicState.
     * 
     * @return currentCallRef
     */
    public long getCurrentCallRef() {
        return currentCallRef;
    }


    /**
     * Sets the currentCallRef value for this AlcTelephonicState.
     * 
     * @param currentCallRef
     */
    public void setCurrentCallRef(long currentCallRef) {
        this.currentCallRef = currentCallRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlcTelephonicState)) return false;
        AlcTelephonicState other = (AlcTelephonicState) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.calls==null && other.getCalls()==null) || 
             (this.calls!=null &&
              java.util.Arrays.equals(this.calls, other.getCalls()))) &&
            ((this.capabilities==null && other.getCapabilities()==null) || 
             (this.capabilities!=null &&
              this.capabilities.equals(other.getCapabilities()))) &&
            this.currentCallRef == other.getCurrentCallRef();
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
        if (getCalls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCalls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCalls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCapabilities() != null) {
            _hashCode += getCapabilities().hashCode();
        }
        _hashCode += new Long(getCurrentCallRef()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlcTelephonicState.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcTelephonicState"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "calls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcCall"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "capabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcLineCapabilities"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentCallRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "currentCallRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
