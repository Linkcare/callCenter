/**
 * SendMessToPcmmRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema;

public class SendMessToPcmmRequest  implements java.io.Serializable {
    private java.lang.String fwSessionId;

    private java.lang.String lineNumber;

    private int operation;

    private java.lang.String argument;

    public SendMessToPcmmRequest() {
    }

    public SendMessToPcmmRequest(
           java.lang.String fwSessionId,
           java.lang.String lineNumber,
           int operation,
           java.lang.String argument) {
           this.fwSessionId = fwSessionId;
           this.lineNumber = lineNumber;
           this.operation = operation;
           this.argument = argument;
    }


    /**
     * Gets the fwSessionId value for this SendMessToPcmmRequest.
     * 
     * @return fwSessionId
     */
    public java.lang.String getFwSessionId() {
        return fwSessionId;
    }


    /**
     * Sets the fwSessionId value for this SendMessToPcmmRequest.
     * 
     * @param fwSessionId
     */
    public void setFwSessionId(java.lang.String fwSessionId) {
        this.fwSessionId = fwSessionId;
    }


    /**
     * Gets the lineNumber value for this SendMessToPcmmRequest.
     * 
     * @return lineNumber
     */
    public java.lang.String getLineNumber() {
        return lineNumber;
    }


    /**
     * Sets the lineNumber value for this SendMessToPcmmRequest.
     * 
     * @param lineNumber
     */
    public void setLineNumber(java.lang.String lineNumber) {
        this.lineNumber = lineNumber;
    }


    /**
     * Gets the operation value for this SendMessToPcmmRequest.
     * 
     * @return operation
     */
    public int getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this SendMessToPcmmRequest.
     * 
     * @param operation
     */
    public void setOperation(int operation) {
        this.operation = operation;
    }


    /**
     * Gets the argument value for this SendMessToPcmmRequest.
     * 
     * @return argument
     */
    public java.lang.String getArgument() {
        return argument;
    }


    /**
     * Sets the argument value for this SendMessToPcmmRequest.
     * 
     * @param argument
     */
    public void setArgument(java.lang.String argument) {
        this.argument = argument;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendMessToPcmmRequest)) return false;
        SendMessToPcmmRequest other = (SendMessToPcmmRequest) obj;
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
            ((this.lineNumber==null && other.getLineNumber()==null) || 
             (this.lineNumber!=null &&
              this.lineNumber.equals(other.getLineNumber()))) &&
            this.operation == other.getOperation() &&
            ((this.argument==null && other.getArgument()==null) || 
             (this.argument!=null &&
              this.argument.equals(other.getArgument())));
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
        if (getLineNumber() != null) {
            _hashCode += getLineNumber().hashCode();
        }
        _hashCode += getOperation();
        if (getArgument() != null) {
            _hashCode += getArgument().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SendMessToPcmmRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "sendMessToPcmmRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fwSessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "fwSessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "lineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("argument");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "argument"));
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
