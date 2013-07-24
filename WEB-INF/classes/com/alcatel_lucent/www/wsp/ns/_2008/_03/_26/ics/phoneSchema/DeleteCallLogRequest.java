/**
 * DeleteCallLogRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema;

public class DeleteCallLogRequest  implements java.io.Serializable {
    private java.lang.String fwSessionId;

    private java.lang.String lineNumber;

    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcItemId[] callLogItems;

    public DeleteCallLogRequest() {
    }

    public DeleteCallLogRequest(
           java.lang.String fwSessionId,
           java.lang.String lineNumber,
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcItemId[] callLogItems) {
           this.fwSessionId = fwSessionId;
           this.lineNumber = lineNumber;
           this.callLogItems = callLogItems;
    }


    /**
     * Gets the fwSessionId value for this DeleteCallLogRequest.
     * 
     * @return fwSessionId
     */
    public java.lang.String getFwSessionId() {
        return fwSessionId;
    }


    /**
     * Sets the fwSessionId value for this DeleteCallLogRequest.
     * 
     * @param fwSessionId
     */
    public void setFwSessionId(java.lang.String fwSessionId) {
        this.fwSessionId = fwSessionId;
    }


    /**
     * Gets the lineNumber value for this DeleteCallLogRequest.
     * 
     * @return lineNumber
     */
    public java.lang.String getLineNumber() {
        return lineNumber;
    }


    /**
     * Sets the lineNumber value for this DeleteCallLogRequest.
     * 
     * @param lineNumber
     */
    public void setLineNumber(java.lang.String lineNumber) {
        this.lineNumber = lineNumber;
    }


    /**
     * Gets the callLogItems value for this DeleteCallLogRequest.
     * 
     * @return callLogItems
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcItemId[] getCallLogItems() {
        return callLogItems;
    }


    /**
     * Sets the callLogItems value for this DeleteCallLogRequest.
     * 
     * @param callLogItems
     */
    public void setCallLogItems(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcItemId[] callLogItems) {
        this.callLogItems = callLogItems;
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcItemId getCallLogItems(int i) {
        return this.callLogItems[i];
    }

    public void setCallLogItems(int i, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcItemId _value) {
        this.callLogItems[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteCallLogRequest)) return false;
        DeleteCallLogRequest other = (DeleteCallLogRequest) obj;
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
            ((this.callLogItems==null && other.getCallLogItems()==null) || 
             (this.callLogItems!=null &&
              java.util.Arrays.equals(this.callLogItems, other.getCallLogItems())));
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
        if (getCallLogItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCallLogItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCallLogItems(), i);
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
        new org.apache.axis.description.TypeDesc(DeleteCallLogRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deleteCallLogRequest"));
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
        elemField.setFieldName("callLogItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "callLogItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcItemId"));
        elemField.setNillable(false);
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
