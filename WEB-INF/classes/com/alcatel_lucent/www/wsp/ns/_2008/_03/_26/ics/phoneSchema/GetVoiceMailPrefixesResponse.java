/**
 * GetVoiceMailPrefixesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema;

public class GetVoiceMailPrefixesResponse  extends com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcResult  implements java.io.Serializable {
    private java.lang.String[] voiceMailPrefixes;

    public GetVoiceMailPrefixesResponse() {
    }

    public GetVoiceMailPrefixesResponse(
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcResultCode resultCode,
           java.lang.String comment,
           java.lang.String[] voiceMailPrefixes) {
        super(
            resultCode,
            comment);
        this.voiceMailPrefixes = voiceMailPrefixes;
    }


    /**
     * Gets the voiceMailPrefixes value for this GetVoiceMailPrefixesResponse.
     * 
     * @return voiceMailPrefixes
     */
    public java.lang.String[] getVoiceMailPrefixes() {
        return voiceMailPrefixes;
    }


    /**
     * Sets the voiceMailPrefixes value for this GetVoiceMailPrefixesResponse.
     * 
     * @param voiceMailPrefixes
     */
    public void setVoiceMailPrefixes(java.lang.String[] voiceMailPrefixes) {
        this.voiceMailPrefixes = voiceMailPrefixes;
    }

    public java.lang.String getVoiceMailPrefixes(int i) {
        return this.voiceMailPrefixes[i];
    }

    public void setVoiceMailPrefixes(int i, java.lang.String _value) {
        this.voiceMailPrefixes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetVoiceMailPrefixesResponse)) return false;
        GetVoiceMailPrefixesResponse other = (GetVoiceMailPrefixesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.voiceMailPrefixes==null && other.getVoiceMailPrefixes()==null) || 
             (this.voiceMailPrefixes!=null &&
              java.util.Arrays.equals(this.voiceMailPrefixes, other.getVoiceMailPrefixes())));
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
        if (getVoiceMailPrefixes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVoiceMailPrefixes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVoiceMailPrefixes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetVoiceMailPrefixesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getVoiceMailPrefixesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voiceMailPrefixes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "voiceMailPrefixes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
