/**
 * AlcCall.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony;

public class AlcCall  implements java.io.Serializable {
    private long callRef;

    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallCapabilities capabilities;

    private byte[] correlator;

    private java.lang.String message;

    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcMessageType msgType;

    private java.lang.String name;

    private java.lang.String number;

    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallState state;

    public AlcCall() {
    }

    public AlcCall(
           long callRef,
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallCapabilities capabilities,
           byte[] correlator,
           java.lang.String message,
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcMessageType msgType,
           java.lang.String name,
           java.lang.String number,
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallState state) {
           this.callRef = callRef;
           this.capabilities = capabilities;
           this.correlator = correlator;
           this.message = message;
           this.msgType = msgType;
           this.name = name;
           this.number = number;
           this.state = state;
    }


    /**
     * Gets the callRef value for this AlcCall.
     * 
     * @return callRef
     */
    public long getCallRef() {
        return callRef;
    }


    /**
     * Sets the callRef value for this AlcCall.
     * 
     * @param callRef
     */
    public void setCallRef(long callRef) {
        this.callRef = callRef;
    }


    /**
     * Gets the capabilities value for this AlcCall.
     * 
     * @return capabilities
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallCapabilities getCapabilities() {
        return capabilities;
    }


    /**
     * Sets the capabilities value for this AlcCall.
     * 
     * @param capabilities
     */
    public void setCapabilities(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallCapabilities capabilities) {
        this.capabilities = capabilities;
    }


    /**
     * Gets the correlator value for this AlcCall.
     * 
     * @return correlator
     */
    public byte[] getCorrelator() {
        return correlator;
    }


    /**
     * Sets the correlator value for this AlcCall.
     * 
     * @param correlator
     */
    public void setCorrelator(byte[] correlator) {
        this.correlator = correlator;
    }


    /**
     * Gets the message value for this AlcCall.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this AlcCall.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the msgType value for this AlcCall.
     * 
     * @return msgType
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcMessageType getMsgType() {
        return msgType;
    }


    /**
     * Sets the msgType value for this AlcCall.
     * 
     * @param msgType
     */
    public void setMsgType(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcMessageType msgType) {
        this.msgType = msgType;
    }


    /**
     * Gets the name value for this AlcCall.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AlcCall.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the number value for this AlcCall.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this AlcCall.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the state value for this AlcCall.
     * 
     * @return state
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallState getState() {
        return state;
    }


    /**
     * Sets the state value for this AlcCall.
     * 
     * @param state
     */
    public void setState(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallState state) {
        this.state = state;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlcCall)) return false;
        AlcCall other = (AlcCall) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.callRef == other.getCallRef() &&
            ((this.capabilities==null && other.getCapabilities()==null) || 
             (this.capabilities!=null &&
              this.capabilities.equals(other.getCapabilities()))) &&
            ((this.correlator==null && other.getCorrelator()==null) || 
             (this.correlator!=null &&
              java.util.Arrays.equals(this.correlator, other.getCorrelator()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.msgType==null && other.getMsgType()==null) || 
             (this.msgType!=null &&
              this.msgType.equals(other.getMsgType()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState())));
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
        _hashCode += new Long(getCallRef()).hashCode();
        if (getCapabilities() != null) {
            _hashCode += getCapabilities().hashCode();
        }
        if (getCorrelator() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCorrelator());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCorrelator(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getMsgType() != null) {
            _hashCode += getMsgType().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlcCall.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcCall"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "callRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "capabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcCallCapabilities"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "correlator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "msgType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcMessageType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcCallState"));
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
