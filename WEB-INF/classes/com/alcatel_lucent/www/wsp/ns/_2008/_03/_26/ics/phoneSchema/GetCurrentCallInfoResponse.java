/**
 * GetCurrentCallInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema;

public class GetCurrentCallInfoResponse  extends com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcResult  implements java.io.Serializable {
    private boolean callPresent;

    private java.lang.String initialCalledNumber;

    private java.lang.String name;

    private java.lang.String number;

    private boolean redirectedCall;

    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallState state;

    public GetCurrentCallInfoResponse() {
    }

    public GetCurrentCallInfoResponse(
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcResultCode resultCode,
           java.lang.String comment,
           boolean callPresent,
           java.lang.String initialCalledNumber,
           java.lang.String name,
           java.lang.String number,
           boolean redirectedCall,
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallState state) {
        super(
            resultCode,
            comment);
        this.callPresent = callPresent;
        this.initialCalledNumber = initialCalledNumber;
        this.name = name;
        this.number = number;
        this.redirectedCall = redirectedCall;
        this.state = state;
    }


    /**
     * Gets the callPresent value for this GetCurrentCallInfoResponse.
     * 
     * @return callPresent
     */
    public boolean isCallPresent() {
        return callPresent;
    }


    /**
     * Sets the callPresent value for this GetCurrentCallInfoResponse.
     * 
     * @param callPresent
     */
    public void setCallPresent(boolean callPresent) {
        this.callPresent = callPresent;
    }


    /**
     * Gets the initialCalledNumber value for this GetCurrentCallInfoResponse.
     * 
     * @return initialCalledNumber
     */
    public java.lang.String getInitialCalledNumber() {
        return initialCalledNumber;
    }


    /**
     * Sets the initialCalledNumber value for this GetCurrentCallInfoResponse.
     * 
     * @param initialCalledNumber
     */
    public void setInitialCalledNumber(java.lang.String initialCalledNumber) {
        this.initialCalledNumber = initialCalledNumber;
    }


    /**
     * Gets the name value for this GetCurrentCallInfoResponse.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this GetCurrentCallInfoResponse.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the number value for this GetCurrentCallInfoResponse.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this GetCurrentCallInfoResponse.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the redirectedCall value for this GetCurrentCallInfoResponse.
     * 
     * @return redirectedCall
     */
    public boolean isRedirectedCall() {
        return redirectedCall;
    }


    /**
     * Sets the redirectedCall value for this GetCurrentCallInfoResponse.
     * 
     * @param redirectedCall
     */
    public void setRedirectedCall(boolean redirectedCall) {
        this.redirectedCall = redirectedCall;
    }


    /**
     * Gets the state value for this GetCurrentCallInfoResponse.
     * 
     * @return state
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallState getState() {
        return state;
    }


    /**
     * Sets the state value for this GetCurrentCallInfoResponse.
     * 
     * @param state
     */
    public void setState(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallState state) {
        this.state = state;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCurrentCallInfoResponse)) return false;
        GetCurrentCallInfoResponse other = (GetCurrentCallInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.callPresent == other.isCallPresent() &&
            ((this.initialCalledNumber==null && other.getInitialCalledNumber()==null) || 
             (this.initialCalledNumber!=null &&
              this.initialCalledNumber.equals(other.getInitialCalledNumber()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            this.redirectedCall == other.isRedirectedCall() &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState())));
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
        _hashCode += (isCallPresent() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getInitialCalledNumber() != null) {
            _hashCode += getInitialCalledNumber().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        _hashCode += (isRedirectedCall() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCurrentCallInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCurrentCallInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callPresent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "callPresent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialCalledNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "initialCalledNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redirectedCall");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "redirectedCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcCallState"));
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
