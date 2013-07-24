/**
 * GetAccountInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema;

public class GetAccountInfoResponse  extends com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcResult  implements java.io.Serializable {
    private java.lang.String firstName;

    private java.lang.String name;

    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcLineInfo mainLine;

    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcLineInfo[] secondaryLines;

    private java.lang.String otsAddress;

    private java.lang.String otsPort;

    private java.lang.String otsId;

    private java.lang.String atapiPort;

    public GetAccountInfoResponse() {
    }

    public GetAccountInfoResponse(
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcResultCode resultCode,
           java.lang.String comment,
           java.lang.String firstName,
           java.lang.String name,
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcLineInfo mainLine,
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcLineInfo[] secondaryLines,
           java.lang.String otsAddress,
           java.lang.String otsPort,
           java.lang.String otsId,
           java.lang.String atapiPort) {
        super(
            resultCode,
            comment);
        this.firstName = firstName;
        this.name = name;
        this.mainLine = mainLine;
        this.secondaryLines = secondaryLines;
        this.otsAddress = otsAddress;
        this.otsPort = otsPort;
        this.otsId = otsId;
        this.atapiPort = atapiPort;
    }


    /**
     * Gets the firstName value for this GetAccountInfoResponse.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this GetAccountInfoResponse.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the name value for this GetAccountInfoResponse.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this GetAccountInfoResponse.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the mainLine value for this GetAccountInfoResponse.
     * 
     * @return mainLine
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcLineInfo getMainLine() {
        return mainLine;
    }


    /**
     * Sets the mainLine value for this GetAccountInfoResponse.
     * 
     * @param mainLine
     */
    public void setMainLine(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcLineInfo mainLine) {
        this.mainLine = mainLine;
    }


    /**
     * Gets the secondaryLines value for this GetAccountInfoResponse.
     * 
     * @return secondaryLines
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcLineInfo[] getSecondaryLines() {
        return secondaryLines;
    }


    /**
     * Sets the secondaryLines value for this GetAccountInfoResponse.
     * 
     * @param secondaryLines
     */
    public void setSecondaryLines(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcLineInfo[] secondaryLines) {
        this.secondaryLines = secondaryLines;
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcLineInfo getSecondaryLines(int i) {
        return this.secondaryLines[i];
    }

    public void setSecondaryLines(int i, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcLineInfo _value) {
        this.secondaryLines[i] = _value;
    }


    /**
     * Gets the otsAddress value for this GetAccountInfoResponse.
     * 
     * @return otsAddress
     */
    public java.lang.String getOtsAddress() {
        return otsAddress;
    }


    /**
     * Sets the otsAddress value for this GetAccountInfoResponse.
     * 
     * @param otsAddress
     */
    public void setOtsAddress(java.lang.String otsAddress) {
        this.otsAddress = otsAddress;
    }


    /**
     * Gets the otsPort value for this GetAccountInfoResponse.
     * 
     * @return otsPort
     */
    public java.lang.String getOtsPort() {
        return otsPort;
    }


    /**
     * Sets the otsPort value for this GetAccountInfoResponse.
     * 
     * @param otsPort
     */
    public void setOtsPort(java.lang.String otsPort) {
        this.otsPort = otsPort;
    }


    /**
     * Gets the otsId value for this GetAccountInfoResponse.
     * 
     * @return otsId
     */
    public java.lang.String getOtsId() {
        return otsId;
    }


    /**
     * Sets the otsId value for this GetAccountInfoResponse.
     * 
     * @param otsId
     */
    public void setOtsId(java.lang.String otsId) {
        this.otsId = otsId;
    }


    /**
     * Gets the atapiPort value for this GetAccountInfoResponse.
     * 
     * @return atapiPort
     */
    public java.lang.String getAtapiPort() {
        return atapiPort;
    }


    /**
     * Sets the atapiPort value for this GetAccountInfoResponse.
     * 
     * @param atapiPort
     */
    public void setAtapiPort(java.lang.String atapiPort) {
        this.atapiPort = atapiPort;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAccountInfoResponse)) return false;
        GetAccountInfoResponse other = (GetAccountInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.mainLine==null && other.getMainLine()==null) || 
             (this.mainLine!=null &&
              this.mainLine.equals(other.getMainLine()))) &&
            ((this.secondaryLines==null && other.getSecondaryLines()==null) || 
             (this.secondaryLines!=null &&
              java.util.Arrays.equals(this.secondaryLines, other.getSecondaryLines()))) &&
            ((this.otsAddress==null && other.getOtsAddress()==null) || 
             (this.otsAddress!=null &&
              this.otsAddress.equals(other.getOtsAddress()))) &&
            ((this.otsPort==null && other.getOtsPort()==null) || 
             (this.otsPort!=null &&
              this.otsPort.equals(other.getOtsPort()))) &&
            ((this.otsId==null && other.getOtsId()==null) || 
             (this.otsId!=null &&
              this.otsId.equals(other.getOtsId()))) &&
            ((this.atapiPort==null && other.getAtapiPort()==null) || 
             (this.atapiPort!=null &&
              this.atapiPort.equals(other.getAtapiPort())));
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
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getMainLine() != null) {
            _hashCode += getMainLine().hashCode();
        }
        if (getSecondaryLines() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSecondaryLines());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSecondaryLines(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOtsAddress() != null) {
            _hashCode += getOtsAddress().hashCode();
        }
        if (getOtsPort() != null) {
            _hashCode += getOtsPort().hashCode();
        }
        if (getOtsId() != null) {
            _hashCode += getOtsId().hashCode();
        }
        if (getAtapiPort() != null) {
            _hashCode += getAtapiPort().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccountInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getAccountInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "firstName"));
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
        elemField.setFieldName("mainLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "mainLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "AlcLineInfo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryLines");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "secondaryLines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "AlcLineInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otsAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "otsAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otsPort");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "otsPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otsId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "otsId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atapiPort");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "atapiPort"));
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
