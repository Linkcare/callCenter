/**
 * GetVoiceMailInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema;

public class GetVoiceMailInfoResponse  extends com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcResult  implements java.io.Serializable {
    private boolean externalVoiceMail;

    private boolean voiceMail;

    private java.lang.String voicemailNumber;

    public GetVoiceMailInfoResponse() {
    }

    public GetVoiceMailInfoResponse(
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcResultCode resultCode,
           java.lang.String comment,
           boolean externalVoiceMail,
           boolean voiceMail,
           java.lang.String voicemailNumber) {
        super(
            resultCode,
            comment);
        this.externalVoiceMail = externalVoiceMail;
        this.voiceMail = voiceMail;
        this.voicemailNumber = voicemailNumber;
    }


    /**
     * Gets the externalVoiceMail value for this GetVoiceMailInfoResponse.
     * 
     * @return externalVoiceMail
     */
    public boolean isExternalVoiceMail() {
        return externalVoiceMail;
    }


    /**
     * Sets the externalVoiceMail value for this GetVoiceMailInfoResponse.
     * 
     * @param externalVoiceMail
     */
    public void setExternalVoiceMail(boolean externalVoiceMail) {
        this.externalVoiceMail = externalVoiceMail;
    }


    /**
     * Gets the voiceMail value for this GetVoiceMailInfoResponse.
     * 
     * @return voiceMail
     */
    public boolean isVoiceMail() {
        return voiceMail;
    }


    /**
     * Sets the voiceMail value for this GetVoiceMailInfoResponse.
     * 
     * @param voiceMail
     */
    public void setVoiceMail(boolean voiceMail) {
        this.voiceMail = voiceMail;
    }


    /**
     * Gets the voicemailNumber value for this GetVoiceMailInfoResponse.
     * 
     * @return voicemailNumber
     */
    public java.lang.String getVoicemailNumber() {
        return voicemailNumber;
    }


    /**
     * Sets the voicemailNumber value for this GetVoiceMailInfoResponse.
     * 
     * @param voicemailNumber
     */
    public void setVoicemailNumber(java.lang.String voicemailNumber) {
        this.voicemailNumber = voicemailNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetVoiceMailInfoResponse)) return false;
        GetVoiceMailInfoResponse other = (GetVoiceMailInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.externalVoiceMail == other.isExternalVoiceMail() &&
            this.voiceMail == other.isVoiceMail() &&
            ((this.voicemailNumber==null && other.getVoicemailNumber()==null) || 
             (this.voicemailNumber!=null &&
              this.voicemailNumber.equals(other.getVoicemailNumber())));
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
        _hashCode += (isExternalVoiceMail() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isVoiceMail() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getVoicemailNumber() != null) {
            _hashCode += getVoicemailNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetVoiceMailInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getVoiceMailInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalVoiceMail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "externalVoiceMail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voiceMail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "voiceMail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voicemailNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "voicemailNumber"));
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
