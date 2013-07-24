/**
 * AlcResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierSchema;

public class AlcResult  implements java.io.Serializable {
    private com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierSchema.AlcResultCode resultCode;

    private java.lang.String comment;

    public AlcResult() {
    }

    public AlcResult(
           com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierSchema.AlcResultCode resultCode,
           java.lang.String comment) {
           this.resultCode = resultCode;
           this.comment = comment;
    }


    /**
     * Gets the resultCode value for this AlcResult.
     * 
     * @return resultCode
     */
    public com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierSchema.AlcResultCode getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this AlcResult.
     * 
     * @param resultCode
     */
    public void setResultCode(com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierSchema.AlcResultCode resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the comment value for this AlcResult.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this AlcResult.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlcResult)) return false;
        AlcResult other = (AlcResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resultCode==null && other.getResultCode()==null) || 
             (this.resultCode!=null &&
              this.resultCode.equals(other.getResultCode()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment())));
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
        if (getResultCode() != null) {
            _hashCode += getResultCode().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlcResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/05/26/ics/notifierSchema", "AlcResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/05/26/ics/notifierSchema", "resultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/05/26/ics/notifierSchema", "AlcResultCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/05/26/ics/notifierSchema", "comment"));
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
