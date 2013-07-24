/**
 * GetVoiceMailMessagesNbResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema;

public class GetVoiceMailMessagesNbResponse  extends com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcResult  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger faxNb;

    private org.apache.axis.types.NonNegativeInteger textMessagesNb;

    private org.apache.axis.types.NonNegativeInteger voiceMessagesNb;

    public GetVoiceMailMessagesNbResponse() {
    }

    public GetVoiceMailMessagesNbResponse(
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcResultCode resultCode,
           java.lang.String comment,
           org.apache.axis.types.NonNegativeInteger faxNb,
           org.apache.axis.types.NonNegativeInteger textMessagesNb,
           org.apache.axis.types.NonNegativeInteger voiceMessagesNb) {
        super(
            resultCode,
            comment);
        this.faxNb = faxNb;
        this.textMessagesNb = textMessagesNb;
        this.voiceMessagesNb = voiceMessagesNb;
    }


    /**
     * Gets the faxNb value for this GetVoiceMailMessagesNbResponse.
     * 
     * @return faxNb
     */
    public org.apache.axis.types.NonNegativeInteger getFaxNb() {
        return faxNb;
    }


    /**
     * Sets the faxNb value for this GetVoiceMailMessagesNbResponse.
     * 
     * @param faxNb
     */
    public void setFaxNb(org.apache.axis.types.NonNegativeInteger faxNb) {
        this.faxNb = faxNb;
    }


    /**
     * Gets the textMessagesNb value for this GetVoiceMailMessagesNbResponse.
     * 
     * @return textMessagesNb
     */
    public org.apache.axis.types.NonNegativeInteger getTextMessagesNb() {
        return textMessagesNb;
    }


    /**
     * Sets the textMessagesNb value for this GetVoiceMailMessagesNbResponse.
     * 
     * @param textMessagesNb
     */
    public void setTextMessagesNb(org.apache.axis.types.NonNegativeInteger textMessagesNb) {
        this.textMessagesNb = textMessagesNb;
    }


    /**
     * Gets the voiceMessagesNb value for this GetVoiceMailMessagesNbResponse.
     * 
     * @return voiceMessagesNb
     */
    public org.apache.axis.types.NonNegativeInteger getVoiceMessagesNb() {
        return voiceMessagesNb;
    }


    /**
     * Sets the voiceMessagesNb value for this GetVoiceMailMessagesNbResponse.
     * 
     * @param voiceMessagesNb
     */
    public void setVoiceMessagesNb(org.apache.axis.types.NonNegativeInteger voiceMessagesNb) {
        this.voiceMessagesNb = voiceMessagesNb;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetVoiceMailMessagesNbResponse)) return false;
        GetVoiceMailMessagesNbResponse other = (GetVoiceMailMessagesNbResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.faxNb==null && other.getFaxNb()==null) || 
             (this.faxNb!=null &&
              this.faxNb.equals(other.getFaxNb()))) &&
            ((this.textMessagesNb==null && other.getTextMessagesNb()==null) || 
             (this.textMessagesNb!=null &&
              this.textMessagesNb.equals(other.getTextMessagesNb()))) &&
            ((this.voiceMessagesNb==null && other.getVoiceMessagesNb()==null) || 
             (this.voiceMessagesNb!=null &&
              this.voiceMessagesNb.equals(other.getVoiceMessagesNb())));
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
        if (getFaxNb() != null) {
            _hashCode += getFaxNb().hashCode();
        }
        if (getTextMessagesNb() != null) {
            _hashCode += getTextMessagesNb().hashCode();
        }
        if (getVoiceMessagesNb() != null) {
            _hashCode += getVoiceMessagesNb().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetVoiceMailMessagesNbResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getVoiceMailMessagesNbResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxNb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "faxNb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textMessagesNb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "textMessagesNb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voiceMessagesNb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "voiceMessagesNb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
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
