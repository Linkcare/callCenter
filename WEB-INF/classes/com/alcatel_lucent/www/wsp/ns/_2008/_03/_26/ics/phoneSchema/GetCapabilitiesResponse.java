/**
 * GetCapabilitiesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema;

public class GetCapabilitiesResponse  extends com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcResult  implements java.io.Serializable {
    private boolean callLog;

    private boolean callRecord;

    private boolean nomadic;

    private boolean phonesetprogramming;

    private boolean repertory;

    private boolean telephony;

    public GetCapabilitiesResponse() {
    }

    public GetCapabilitiesResponse(
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcResultCode resultCode,
           java.lang.String comment,
           boolean callLog,
           boolean callRecord,
           boolean nomadic,
           boolean phonesetprogramming,
           boolean repertory,
           boolean telephony) {
        super(
            resultCode,
            comment);
        this.callLog = callLog;
        this.callRecord = callRecord;
        this.nomadic = nomadic;
        this.phonesetprogramming = phonesetprogramming;
        this.repertory = repertory;
        this.telephony = telephony;
    }


    /**
     * Gets the callLog value for this GetCapabilitiesResponse.
     * 
     * @return callLog
     */
    public boolean isCallLog() {
        return callLog;
    }


    /**
     * Sets the callLog value for this GetCapabilitiesResponse.
     * 
     * @param callLog
     */
    public void setCallLog(boolean callLog) {
        this.callLog = callLog;
    }


    /**
     * Gets the callRecord value for this GetCapabilitiesResponse.
     * 
     * @return callRecord
     */
    public boolean isCallRecord() {
        return callRecord;
    }


    /**
     * Sets the callRecord value for this GetCapabilitiesResponse.
     * 
     * @param callRecord
     */
    public void setCallRecord(boolean callRecord) {
        this.callRecord = callRecord;
    }


    /**
     * Gets the nomadic value for this GetCapabilitiesResponse.
     * 
     * @return nomadic
     */
    public boolean isNomadic() {
        return nomadic;
    }


    /**
     * Sets the nomadic value for this GetCapabilitiesResponse.
     * 
     * @param nomadic
     */
    public void setNomadic(boolean nomadic) {
        this.nomadic = nomadic;
    }


    /**
     * Gets the phonesetprogramming value for this GetCapabilitiesResponse.
     * 
     * @return phonesetprogramming
     */
    public boolean isPhonesetprogramming() {
        return phonesetprogramming;
    }


    /**
     * Sets the phonesetprogramming value for this GetCapabilitiesResponse.
     * 
     * @param phonesetprogramming
     */
    public void setPhonesetprogramming(boolean phonesetprogramming) {
        this.phonesetprogramming = phonesetprogramming;
    }


    /**
     * Gets the repertory value for this GetCapabilitiesResponse.
     * 
     * @return repertory
     */
    public boolean isRepertory() {
        return repertory;
    }


    /**
     * Sets the repertory value for this GetCapabilitiesResponse.
     * 
     * @param repertory
     */
    public void setRepertory(boolean repertory) {
        this.repertory = repertory;
    }


    /**
     * Gets the telephony value for this GetCapabilitiesResponse.
     * 
     * @return telephony
     */
    public boolean isTelephony() {
        return telephony;
    }


    /**
     * Sets the telephony value for this GetCapabilitiesResponse.
     * 
     * @param telephony
     */
    public void setTelephony(boolean telephony) {
        this.telephony = telephony;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCapabilitiesResponse)) return false;
        GetCapabilitiesResponse other = (GetCapabilitiesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.callLog == other.isCallLog() &&
            this.callRecord == other.isCallRecord() &&
            this.nomadic == other.isNomadic() &&
            this.phonesetprogramming == other.isPhonesetprogramming() &&
            this.repertory == other.isRepertory() &&
            this.telephony == other.isTelephony();
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
        _hashCode += (isCallLog() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCallRecord() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isNomadic() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPhonesetprogramming() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRepertory() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTelephony() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCapabilitiesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCapabilitiesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callLog");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "callLog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "callRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomadic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "nomadic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phonesetprogramming");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "phonesetprogramming"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repertory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "repertory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephony");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "telephony"));
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
