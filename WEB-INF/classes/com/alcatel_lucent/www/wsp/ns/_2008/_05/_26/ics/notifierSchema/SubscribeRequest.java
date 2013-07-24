/**
 * SubscribeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierSchema;

public class SubscribeRequest  implements java.io.Serializable {
    private java.lang.String fwSessionId;

    private java.lang.String notificationUrl;

    private com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierSchema.AlcSelector[] filter;

    private java.lang.Integer expires;

    private com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierSchema.AlcHttpHeader[] httpHeaders;

    public SubscribeRequest() {
    }

    public SubscribeRequest(
           java.lang.String fwSessionId,
           java.lang.String notificationUrl,
           com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierSchema.AlcSelector[] filter,
           java.lang.Integer expires,
           com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierSchema.AlcHttpHeader[] httpHeaders) {
           this.fwSessionId = fwSessionId;
           this.notificationUrl = notificationUrl;
           this.filter = filter;
           this.expires = expires;
           this.httpHeaders = httpHeaders;
    }


    /**
     * Gets the fwSessionId value for this SubscribeRequest.
     * 
     * @return fwSessionId
     */
    public java.lang.String getFwSessionId() {
        return fwSessionId;
    }


    /**
     * Sets the fwSessionId value for this SubscribeRequest.
     * 
     * @param fwSessionId
     */
    public void setFwSessionId(java.lang.String fwSessionId) {
        this.fwSessionId = fwSessionId;
    }


    /**
     * Gets the notificationUrl value for this SubscribeRequest.
     * 
     * @return notificationUrl
     */
    public java.lang.String getNotificationUrl() {
        return notificationUrl;
    }


    /**
     * Sets the notificationUrl value for this SubscribeRequest.
     * 
     * @param notificationUrl
     */
    public void setNotificationUrl(java.lang.String notificationUrl) {
        this.notificationUrl = notificationUrl;
    }


    /**
     * Gets the filter value for this SubscribeRequest.
     * 
     * @return filter
     */
    public com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierSchema.AlcSelector[] getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this SubscribeRequest.
     * 
     * @param filter
     */
    public void setFilter(com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierSchema.AlcSelector[] filter) {
        this.filter = filter;
    }

    public com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierSchema.AlcSelector getFilter(int i) {
        return this.filter[i];
    }

    public void setFilter(int i, com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierSchema.AlcSelector _value) {
        this.filter[i] = _value;
    }


    /**
     * Gets the expires value for this SubscribeRequest.
     * 
     * @return expires
     */
    public java.lang.Integer getExpires() {
        return expires;
    }


    /**
     * Sets the expires value for this SubscribeRequest.
     * 
     * @param expires
     */
    public void setExpires(java.lang.Integer expires) {
        this.expires = expires;
    }


    /**
     * Gets the httpHeaders value for this SubscribeRequest.
     * 
     * @return httpHeaders
     */
    public com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierSchema.AlcHttpHeader[] getHttpHeaders() {
        return httpHeaders;
    }


    /**
     * Sets the httpHeaders value for this SubscribeRequest.
     * 
     * @param httpHeaders
     */
    public void setHttpHeaders(com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierSchema.AlcHttpHeader[] httpHeaders) {
        this.httpHeaders = httpHeaders;
    }

    public com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierSchema.AlcHttpHeader getHttpHeaders(int i) {
        return this.httpHeaders[i];
    }

    public void setHttpHeaders(int i, com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierSchema.AlcHttpHeader _value) {
        this.httpHeaders[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscribeRequest)) return false;
        SubscribeRequest other = (SubscribeRequest) obj;
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
            ((this.notificationUrl==null && other.getNotificationUrl()==null) || 
             (this.notificationUrl!=null &&
              this.notificationUrl.equals(other.getNotificationUrl()))) &&
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              java.util.Arrays.equals(this.filter, other.getFilter()))) &&
            ((this.expires==null && other.getExpires()==null) || 
             (this.expires!=null &&
              this.expires.equals(other.getExpires()))) &&
            ((this.httpHeaders==null && other.getHttpHeaders()==null) || 
             (this.httpHeaders!=null &&
              java.util.Arrays.equals(this.httpHeaders, other.getHttpHeaders())));
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
        if (getNotificationUrl() != null) {
            _hashCode += getNotificationUrl().hashCode();
        }
        if (getFilter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFilter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFilter(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpires() != null) {
            _hashCode += getExpires().hashCode();
        }
        if (getHttpHeaders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHttpHeaders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHttpHeaders(), i);
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
        new org.apache.axis.description.TypeDesc(SubscribeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/05/26/ics/notifierSchema", "subscribeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fwSessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/05/26/ics/notifierSchema", "fwSessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/05/26/ics/notifierSchema", "notificationUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/05/26/ics/notifierSchema", "filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/05/26/ics/notifierSchema", "AlcSelector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expires");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/05/26/ics/notifierSchema", "expires"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpHeaders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/05/26/ics/notifierSchema", "httpHeaders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/05/26/ics/notifierSchema", "AlcHttpHeader"));
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
