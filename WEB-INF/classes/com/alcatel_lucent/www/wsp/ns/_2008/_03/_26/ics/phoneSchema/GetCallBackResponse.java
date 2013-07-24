/**
 * GetCallBackResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema;

public class GetCallBackResponse  extends com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcResult  implements java.io.Serializable {
    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallBack[] callBackRequests;

    public GetCallBackResponse() {
    }

    public GetCallBackResponse(
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcResultCode resultCode,
           java.lang.String comment,
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallBack[] callBackRequests) {
        super(
            resultCode,
            comment);
        this.callBackRequests = callBackRequests;
    }


    /**
     * Gets the callBackRequests value for this GetCallBackResponse.
     * 
     * @return callBackRequests
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallBack[] getCallBackRequests() {
        return callBackRequests;
    }


    /**
     * Sets the callBackRequests value for this GetCallBackResponse.
     * 
     * @param callBackRequests
     */
    public void setCallBackRequests(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallBack[] callBackRequests) {
        this.callBackRequests = callBackRequests;
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallBack getCallBackRequests(int i) {
        return this.callBackRequests[i];
    }

    public void setCallBackRequests(int i, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallBack _value) {
        this.callBackRequests[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCallBackResponse)) return false;
        GetCallBackResponse other = (GetCallBackResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.callBackRequests==null && other.getCallBackRequests()==null) || 
             (this.callBackRequests!=null &&
              java.util.Arrays.equals(this.callBackRequests, other.getCallBackRequests())));
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
        if (getCallBackRequests() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCallBackRequests());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCallBackRequests(), i);
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
        new org.apache.axis.description.TypeDesc(GetCallBackResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCallBackResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callBackRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "callBackRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcCallBack"));
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
