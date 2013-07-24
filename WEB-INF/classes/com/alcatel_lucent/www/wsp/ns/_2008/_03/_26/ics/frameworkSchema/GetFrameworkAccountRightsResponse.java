/**
 * GetFrameworkAccountRightsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema;

public class GetFrameworkAccountRightsResponse  extends com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.AlcResult  implements java.io.Serializable {
    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.AlcFrameworkAccountRights accountRights;

    public GetFrameworkAccountRightsResponse() {
    }

    public GetFrameworkAccountRightsResponse(
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.AlcResultCode resultCode,
           java.lang.String comment,
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.AlcFrameworkAccountRights accountRights) {
        super(
            resultCode,
            comment);
        this.accountRights = accountRights;
    }


    /**
     * Gets the accountRights value for this GetFrameworkAccountRightsResponse.
     * 
     * @return accountRights
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.AlcFrameworkAccountRights getAccountRights() {
        return accountRights;
    }


    /**
     * Sets the accountRights value for this GetFrameworkAccountRightsResponse.
     * 
     * @param accountRights
     */
    public void setAccountRights(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.AlcFrameworkAccountRights accountRights) {
        this.accountRights = accountRights;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFrameworkAccountRightsResponse)) return false;
        GetFrameworkAccountRightsResponse other = (GetFrameworkAccountRightsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountRights==null && other.getAccountRights()==null) || 
             (this.accountRights!=null &&
              this.accountRights.equals(other.getAccountRights())));
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
        if (getAccountRights() != null) {
            _hashCode += getAccountRights().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFrameworkAccountRightsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "getFrameworkAccountRightsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountRights");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "accountRights"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema", "AlcFrameworkAccountRights"));
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
