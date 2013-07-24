/**
 * GetCallLogCapabilitiesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema;

public class GetCallLogCapabilitiesResponse  extends com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcResult  implements java.io.Serializable {
    private boolean deleteAllCallLog;

    private boolean deleteCallLog;

    private boolean getCallLog;

    private boolean getNbUnansweredCall;

    private boolean modifyCallLog;

    public GetCallLogCapabilitiesResponse() {
    }

    public GetCallLogCapabilitiesResponse(
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcResultCode resultCode,
           java.lang.String comment,
           boolean deleteAllCallLog,
           boolean deleteCallLog,
           boolean getCallLog,
           boolean getNbUnansweredCall,
           boolean modifyCallLog) {
        super(
            resultCode,
            comment);
        this.deleteAllCallLog = deleteAllCallLog;
        this.deleteCallLog = deleteCallLog;
        this.getCallLog = getCallLog;
        this.getNbUnansweredCall = getNbUnansweredCall;
        this.modifyCallLog = modifyCallLog;
    }


    /**
     * Gets the deleteAllCallLog value for this GetCallLogCapabilitiesResponse.
     * 
     * @return deleteAllCallLog
     */
    public boolean isDeleteAllCallLog() {
        return deleteAllCallLog;
    }


    /**
     * Sets the deleteAllCallLog value for this GetCallLogCapabilitiesResponse.
     * 
     * @param deleteAllCallLog
     */
    public void setDeleteAllCallLog(boolean deleteAllCallLog) {
        this.deleteAllCallLog = deleteAllCallLog;
    }


    /**
     * Gets the deleteCallLog value for this GetCallLogCapabilitiesResponse.
     * 
     * @return deleteCallLog
     */
    public boolean isDeleteCallLog() {
        return deleteCallLog;
    }


    /**
     * Sets the deleteCallLog value for this GetCallLogCapabilitiesResponse.
     * 
     * @param deleteCallLog
     */
    public void setDeleteCallLog(boolean deleteCallLog) {
        this.deleteCallLog = deleteCallLog;
    }


    /**
     * Gets the getCallLog value for this GetCallLogCapabilitiesResponse.
     * 
     * @return getCallLog
     */
    public boolean isGetCallLog() {
        return getCallLog;
    }


    /**
     * Sets the getCallLog value for this GetCallLogCapabilitiesResponse.
     * 
     * @param getCallLog
     */
    public void setGetCallLog(boolean getCallLog) {
        this.getCallLog = getCallLog;
    }


    /**
     * Gets the getNbUnansweredCall value for this GetCallLogCapabilitiesResponse.
     * 
     * @return getNbUnansweredCall
     */
    public boolean isGetNbUnansweredCall() {
        return getNbUnansweredCall;
    }


    /**
     * Sets the getNbUnansweredCall value for this GetCallLogCapabilitiesResponse.
     * 
     * @param getNbUnansweredCall
     */
    public void setGetNbUnansweredCall(boolean getNbUnansweredCall) {
        this.getNbUnansweredCall = getNbUnansweredCall;
    }


    /**
     * Gets the modifyCallLog value for this GetCallLogCapabilitiesResponse.
     * 
     * @return modifyCallLog
     */
    public boolean isModifyCallLog() {
        return modifyCallLog;
    }


    /**
     * Sets the modifyCallLog value for this GetCallLogCapabilitiesResponse.
     * 
     * @param modifyCallLog
     */
    public void setModifyCallLog(boolean modifyCallLog) {
        this.modifyCallLog = modifyCallLog;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCallLogCapabilitiesResponse)) return false;
        GetCallLogCapabilitiesResponse other = (GetCallLogCapabilitiesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.deleteAllCallLog == other.isDeleteAllCallLog() &&
            this.deleteCallLog == other.isDeleteCallLog() &&
            this.getCallLog == other.isGetCallLog() &&
            this.getNbUnansweredCall == other.isGetNbUnansweredCall() &&
            this.modifyCallLog == other.isModifyCallLog();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += (isDeleteAllCallLog() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDeleteCallLog() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isGetCallLog() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isGetNbUnansweredCall() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isModifyCallLog() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCallLogCapabilitiesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCallLogCapabilitiesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteAllCallLog");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deleteAllCallLog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteCallLog");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deleteCallLog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCallLog");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCallLog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getNbUnansweredCall");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getNbUnansweredCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyCallLog");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "modifyCallLog"));
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
