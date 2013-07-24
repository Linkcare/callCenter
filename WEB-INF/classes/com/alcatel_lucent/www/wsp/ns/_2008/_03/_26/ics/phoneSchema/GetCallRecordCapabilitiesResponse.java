/**
 * GetCallRecordCapabilitiesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema;

public class GetCallRecordCapabilitiesResponse  extends com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcResult  implements java.io.Serializable {
    private boolean continueRecord;

    private boolean getRecordState;

    private boolean pauseRecord;

    private boolean startRecord;

    private boolean stopRecord;

    public GetCallRecordCapabilitiesResponse() {
    }

    public GetCallRecordCapabilitiesResponse(
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcResultCode resultCode,
           java.lang.String comment,
           boolean continueRecord,
           boolean getRecordState,
           boolean pauseRecord,
           boolean startRecord,
           boolean stopRecord) {
        super(
            resultCode,
            comment);
        this.continueRecord = continueRecord;
        this.getRecordState = getRecordState;
        this.pauseRecord = pauseRecord;
        this.startRecord = startRecord;
        this.stopRecord = stopRecord;
    }


    /**
     * Gets the continueRecord value for this GetCallRecordCapabilitiesResponse.
     * 
     * @return continueRecord
     */
    public boolean isContinueRecord() {
        return continueRecord;
    }


    /**
     * Sets the continueRecord value for this GetCallRecordCapabilitiesResponse.
     * 
     * @param continueRecord
     */
    public void setContinueRecord(boolean continueRecord) {
        this.continueRecord = continueRecord;
    }


    /**
     * Gets the getRecordState value for this GetCallRecordCapabilitiesResponse.
     * 
     * @return getRecordState
     */
    public boolean isGetRecordState() {
        return getRecordState;
    }


    /**
     * Sets the getRecordState value for this GetCallRecordCapabilitiesResponse.
     * 
     * @param getRecordState
     */
    public void setGetRecordState(boolean getRecordState) {
        this.getRecordState = getRecordState;
    }


    /**
     * Gets the pauseRecord value for this GetCallRecordCapabilitiesResponse.
     * 
     * @return pauseRecord
     */
    public boolean isPauseRecord() {
        return pauseRecord;
    }


    /**
     * Sets the pauseRecord value for this GetCallRecordCapabilitiesResponse.
     * 
     * @param pauseRecord
     */
    public void setPauseRecord(boolean pauseRecord) {
        this.pauseRecord = pauseRecord;
    }


    /**
     * Gets the startRecord value for this GetCallRecordCapabilitiesResponse.
     * 
     * @return startRecord
     */
    public boolean isStartRecord() {
        return startRecord;
    }


    /**
     * Sets the startRecord value for this GetCallRecordCapabilitiesResponse.
     * 
     * @param startRecord
     */
    public void setStartRecord(boolean startRecord) {
        this.startRecord = startRecord;
    }


    /**
     * Gets the stopRecord value for this GetCallRecordCapabilitiesResponse.
     * 
     * @return stopRecord
     */
    public boolean isStopRecord() {
        return stopRecord;
    }


    /**
     * Sets the stopRecord value for this GetCallRecordCapabilitiesResponse.
     * 
     * @param stopRecord
     */
    public void setStopRecord(boolean stopRecord) {
        this.stopRecord = stopRecord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCallRecordCapabilitiesResponse)) return false;
        GetCallRecordCapabilitiesResponse other = (GetCallRecordCapabilitiesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.continueRecord == other.isContinueRecord() &&
            this.getRecordState == other.isGetRecordState() &&
            this.pauseRecord == other.isPauseRecord() &&
            this.startRecord == other.isStartRecord() &&
            this.stopRecord == other.isStopRecord();
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
        _hashCode += (isContinueRecord() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isGetRecordState() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPauseRecord() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isStartRecord() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isStopRecord() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCallRecordCapabilitiesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCallRecordCapabilitiesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("continueRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "continueRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getRecordState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getRecordState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pauseRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "pauseRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "startRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "stopRecord"));
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
