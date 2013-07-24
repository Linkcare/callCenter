/**
 * GetCallLogRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema;

public class GetCallLogRequest  implements java.io.Serializable {
    private java.lang.String fwSessionId;

    private java.lang.String lineNumber;

    private org.apache.axis.types.NonNegativeInteger index;

    private org.apache.axis.types.PositiveInteger nbItems;

    private boolean filtered;

    public GetCallLogRequest() {
    }

    public GetCallLogRequest(
           java.lang.String fwSessionId,
           java.lang.String lineNumber,
           org.apache.axis.types.NonNegativeInteger index,
           org.apache.axis.types.PositiveInteger nbItems,
           boolean filtered) {
           this.fwSessionId = fwSessionId;
           this.lineNumber = lineNumber;
           this.index = index;
           this.nbItems = nbItems;
           this.filtered = filtered;
    }


    /**
     * Gets the fwSessionId value for this GetCallLogRequest.
     * 
     * @return fwSessionId
     */
    public java.lang.String getFwSessionId() {
        return fwSessionId;
    }


    /**
     * Sets the fwSessionId value for this GetCallLogRequest.
     * 
     * @param fwSessionId
     */
    public void setFwSessionId(java.lang.String fwSessionId) {
        this.fwSessionId = fwSessionId;
    }


    /**
     * Gets the lineNumber value for this GetCallLogRequest.
     * 
     * @return lineNumber
     */
    public java.lang.String getLineNumber() {
        return lineNumber;
    }


    /**
     * Sets the lineNumber value for this GetCallLogRequest.
     * 
     * @param lineNumber
     */
    public void setLineNumber(java.lang.String lineNumber) {
        this.lineNumber = lineNumber;
    }


    /**
     * Gets the index value for this GetCallLogRequest.
     * 
     * @return index
     */
    public org.apache.axis.types.NonNegativeInteger getIndex() {
        return index;
    }


    /**
     * Sets the index value for this GetCallLogRequest.
     * 
     * @param index
     */
    public void setIndex(org.apache.axis.types.NonNegativeInteger index) {
        this.index = index;
    }


    /**
     * Gets the nbItems value for this GetCallLogRequest.
     * 
     * @return nbItems
     */
    public org.apache.axis.types.PositiveInteger getNbItems() {
        return nbItems;
    }


    /**
     * Sets the nbItems value for this GetCallLogRequest.
     * 
     * @param nbItems
     */
    public void setNbItems(org.apache.axis.types.PositiveInteger nbItems) {
        this.nbItems = nbItems;
    }


    /**
     * Gets the filtered value for this GetCallLogRequest.
     * 
     * @return filtered
     */
    public boolean isFiltered() {
        return filtered;
    }


    /**
     * Sets the filtered value for this GetCallLogRequest.
     * 
     * @param filtered
     */
    public void setFiltered(boolean filtered) {
        this.filtered = filtered;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCallLogRequest)) return false;
        GetCallLogRequest other = (GetCallLogRequest) obj;
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
            ((this.index==null && other.getIndex()==null) || 
             (this.index!=null &&
              this.index.equals(other.getIndex()))) &&
            ((this.nbItems==null && other.getNbItems()==null) || 
             (this.nbItems!=null &&
              this.nbItems.equals(other.getNbItems()))) &&
            this.filtered == other.isFiltered();
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
        if (getIndex() != null) {
            _hashCode += getIndex().hashCode();
        }
        if (getNbItems() != null) {
            _hashCode += getNbItems().hashCode();
        }
        _hashCode += (isFiltered() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCallLogRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCallLogRequest"));
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
        elemField.setFieldName("index");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "index"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "nbItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filtered");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "filtered"));
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
