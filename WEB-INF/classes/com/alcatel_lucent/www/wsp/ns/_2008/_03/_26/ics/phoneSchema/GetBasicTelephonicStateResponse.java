/**
 * GetBasicTelephonicStateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema;

public class GetBasicTelephonicStateResponse  extends com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcResult  implements java.io.Serializable {
    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcBasicTelephonicStateInfo mainLine;

    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcBasicTelephonicStateInfo[] secondaryLines;

    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcBasicTelephonicState globalState;

    public GetBasicTelephonicStateResponse() {
    }

    public GetBasicTelephonicStateResponse(
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcResultCode resultCode,
           java.lang.String comment,
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcBasicTelephonicStateInfo mainLine,
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcBasicTelephonicStateInfo[] secondaryLines,
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcBasicTelephonicState globalState) {
        super(
            resultCode,
            comment);
        this.mainLine = mainLine;
        this.secondaryLines = secondaryLines;
        this.globalState = globalState;
    }


    /**
     * Gets the mainLine value for this GetBasicTelephonicStateResponse.
     * 
     * @return mainLine
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcBasicTelephonicStateInfo getMainLine() {
        return mainLine;
    }


    /**
     * Sets the mainLine value for this GetBasicTelephonicStateResponse.
     * 
     * @param mainLine
     */
    public void setMainLine(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcBasicTelephonicStateInfo mainLine) {
        this.mainLine = mainLine;
    }


    /**
     * Gets the secondaryLines value for this GetBasicTelephonicStateResponse.
     * 
     * @return secondaryLines
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcBasicTelephonicStateInfo[] getSecondaryLines() {
        return secondaryLines;
    }


    /**
     * Sets the secondaryLines value for this GetBasicTelephonicStateResponse.
     * 
     * @param secondaryLines
     */
    public void setSecondaryLines(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcBasicTelephonicStateInfo[] secondaryLines) {
        this.secondaryLines = secondaryLines;
    }

    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcBasicTelephonicStateInfo getSecondaryLines(int i) {
        return this.secondaryLines[i];
    }

    public void setSecondaryLines(int i, com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcBasicTelephonicStateInfo _value) {
        this.secondaryLines[i] = _value;
    }


    /**
     * Gets the globalState value for this GetBasicTelephonicStateResponse.
     * 
     * @return globalState
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcBasicTelephonicState getGlobalState() {
        return globalState;
    }


    /**
     * Sets the globalState value for this GetBasicTelephonicStateResponse.
     * 
     * @param globalState
     */
    public void setGlobalState(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcBasicTelephonicState globalState) {
        this.globalState = globalState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBasicTelephonicStateResponse)) return false;
        GetBasicTelephonicStateResponse other = (GetBasicTelephonicStateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.mainLine==null && other.getMainLine()==null) || 
             (this.mainLine!=null &&
              this.mainLine.equals(other.getMainLine()))) &&
            ((this.secondaryLines==null && other.getSecondaryLines()==null) || 
             (this.secondaryLines!=null &&
              java.util.Arrays.equals(this.secondaryLines, other.getSecondaryLines()))) &&
            ((this.globalState==null && other.getGlobalState()==null) || 
             (this.globalState!=null &&
              this.globalState.equals(other.getGlobalState())));
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
        if (getGlobalState() != null) {
            _hashCode += getGlobalState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBasicTelephonicStateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getBasicTelephonicStateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "mainLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcBasicTelephonicStateInfo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryLines");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "secondaryLines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcBasicTelephonicStateInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "globalState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcBasicTelephonicState"));
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
