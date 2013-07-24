/**
 * GetGlobalPhoneStateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema;

public class GetGlobalPhoneStateResponse  extends com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcResult  implements java.io.Serializable {
    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcLineState lineState;

    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcNomadicState nomadicState;

    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcPcmmState pcmmState;

    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phonesetstaticstate.AlcStaticState staticState;

    private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcTelephonicState telephonicState;

    private org.apache.axis.types.NonNegativeInteger nbCallBackNotif;

    private org.apache.axis.types.NonNegativeInteger voiceMessagesNb;

    private org.apache.axis.types.NonNegativeInteger textMessagesNb;

    private org.apache.axis.types.NonNegativeInteger faxNb;

    public GetGlobalPhoneStateResponse() {
    }

    public GetGlobalPhoneStateResponse(
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcResultCode resultCode,
           java.lang.String comment,
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcLineState lineState,
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcNomadicState nomadicState,
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcPcmmState pcmmState,
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phonesetstaticstate.AlcStaticState staticState,
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcTelephonicState telephonicState,
           org.apache.axis.types.NonNegativeInteger nbCallBackNotif,
           org.apache.axis.types.NonNegativeInteger voiceMessagesNb,
           org.apache.axis.types.NonNegativeInteger textMessagesNb,
           org.apache.axis.types.NonNegativeInteger faxNb) {
        super(
            resultCode,
            comment);
        this.lineState = lineState;
        this.nomadicState = nomadicState;
        this.pcmmState = pcmmState;
        this.staticState = staticState;
        this.telephonicState = telephonicState;
        this.nbCallBackNotif = nbCallBackNotif;
        this.voiceMessagesNb = voiceMessagesNb;
        this.textMessagesNb = textMessagesNb;
        this.faxNb = faxNb;
    }


    /**
     * Gets the lineState value for this GetGlobalPhoneStateResponse.
     * 
     * @return lineState
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcLineState getLineState() {
        return lineState;
    }


    /**
     * Sets the lineState value for this GetGlobalPhoneStateResponse.
     * 
     * @param lineState
     */
    public void setLineState(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcLineState lineState) {
        this.lineState = lineState;
    }


    /**
     * Gets the nomadicState value for this GetGlobalPhoneStateResponse.
     * 
     * @return nomadicState
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcNomadicState getNomadicState() {
        return nomadicState;
    }


    /**
     * Sets the nomadicState value for this GetGlobalPhoneStateResponse.
     * 
     * @param nomadicState
     */
    public void setNomadicState(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcNomadicState nomadicState) {
        this.nomadicState = nomadicState;
    }


    /**
     * Gets the pcmmState value for this GetGlobalPhoneStateResponse.
     * 
     * @return pcmmState
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcPcmmState getPcmmState() {
        return pcmmState;
    }


    /**
     * Sets the pcmmState value for this GetGlobalPhoneStateResponse.
     * 
     * @param pcmmState
     */
    public void setPcmmState(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcPcmmState pcmmState) {
        this.pcmmState = pcmmState;
    }


    /**
     * Gets the staticState value for this GetGlobalPhoneStateResponse.
     * 
     * @return staticState
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phonesetstaticstate.AlcStaticState getStaticState() {
        return staticState;
    }


    /**
     * Sets the staticState value for this GetGlobalPhoneStateResponse.
     * 
     * @param staticState
     */
    public void setStaticState(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phonesetstaticstate.AlcStaticState staticState) {
        this.staticState = staticState;
    }


    /**
     * Gets the telephonicState value for this GetGlobalPhoneStateResponse.
     * 
     * @return telephonicState
     */
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcTelephonicState getTelephonicState() {
        return telephonicState;
    }


    /**
     * Sets the telephonicState value for this GetGlobalPhoneStateResponse.
     * 
     * @param telephonicState
     */
    public void setTelephonicState(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcTelephonicState telephonicState) {
        this.telephonicState = telephonicState;
    }


    /**
     * Gets the nbCallBackNotif value for this GetGlobalPhoneStateResponse.
     * 
     * @return nbCallBackNotif
     */
    public org.apache.axis.types.NonNegativeInteger getNbCallBackNotif() {
        return nbCallBackNotif;
    }


    /**
     * Sets the nbCallBackNotif value for this GetGlobalPhoneStateResponse.
     * 
     * @param nbCallBackNotif
     */
    public void setNbCallBackNotif(org.apache.axis.types.NonNegativeInteger nbCallBackNotif) {
        this.nbCallBackNotif = nbCallBackNotif;
    }


    /**
     * Gets the voiceMessagesNb value for this GetGlobalPhoneStateResponse.
     * 
     * @return voiceMessagesNb
     */
    public org.apache.axis.types.NonNegativeInteger getVoiceMessagesNb() {
        return voiceMessagesNb;
    }


    /**
     * Sets the voiceMessagesNb value for this GetGlobalPhoneStateResponse.
     * 
     * @param voiceMessagesNb
     */
    public void setVoiceMessagesNb(org.apache.axis.types.NonNegativeInteger voiceMessagesNb) {
        this.voiceMessagesNb = voiceMessagesNb;
    }


    /**
     * Gets the textMessagesNb value for this GetGlobalPhoneStateResponse.
     * 
     * @return textMessagesNb
     */
    public org.apache.axis.types.NonNegativeInteger getTextMessagesNb() {
        return textMessagesNb;
    }


    /**
     * Sets the textMessagesNb value for this GetGlobalPhoneStateResponse.
     * 
     * @param textMessagesNb
     */
    public void setTextMessagesNb(org.apache.axis.types.NonNegativeInteger textMessagesNb) {
        this.textMessagesNb = textMessagesNb;
    }


    /**
     * Gets the faxNb value for this GetGlobalPhoneStateResponse.
     * 
     * @return faxNb
     */
    public org.apache.axis.types.NonNegativeInteger getFaxNb() {
        return faxNb;
    }


    /**
     * Sets the faxNb value for this GetGlobalPhoneStateResponse.
     * 
     * @param faxNb
     */
    public void setFaxNb(org.apache.axis.types.NonNegativeInteger faxNb) {
        this.faxNb = faxNb;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetGlobalPhoneStateResponse)) return false;
        GetGlobalPhoneStateResponse other = (GetGlobalPhoneStateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.lineState==null && other.getLineState()==null) || 
             (this.lineState!=null &&
              this.lineState.equals(other.getLineState()))) &&
            ((this.nomadicState==null && other.getNomadicState()==null) || 
             (this.nomadicState!=null &&
              this.nomadicState.equals(other.getNomadicState()))) &&
            ((this.pcmmState==null && other.getPcmmState()==null) || 
             (this.pcmmState!=null &&
              this.pcmmState.equals(other.getPcmmState()))) &&
            ((this.staticState==null && other.getStaticState()==null) || 
             (this.staticState!=null &&
              this.staticState.equals(other.getStaticState()))) &&
            ((this.telephonicState==null && other.getTelephonicState()==null) || 
             (this.telephonicState!=null &&
              this.telephonicState.equals(other.getTelephonicState()))) &&
            ((this.nbCallBackNotif==null && other.getNbCallBackNotif()==null) || 
             (this.nbCallBackNotif!=null &&
              this.nbCallBackNotif.equals(other.getNbCallBackNotif()))) &&
            ((this.voiceMessagesNb==null && other.getVoiceMessagesNb()==null) || 
             (this.voiceMessagesNb!=null &&
              this.voiceMessagesNb.equals(other.getVoiceMessagesNb()))) &&
            ((this.textMessagesNb==null && other.getTextMessagesNb()==null) || 
             (this.textMessagesNb!=null &&
              this.textMessagesNb.equals(other.getTextMessagesNb()))) &&
            ((this.faxNb==null && other.getFaxNb()==null) || 
             (this.faxNb!=null &&
              this.faxNb.equals(other.getFaxNb())));
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
        if (getLineState() != null) {
            _hashCode += getLineState().hashCode();
        }
        if (getNomadicState() != null) {
            _hashCode += getNomadicState().hashCode();
        }
        if (getPcmmState() != null) {
            _hashCode += getPcmmState().hashCode();
        }
        if (getStaticState() != null) {
            _hashCode += getStaticState().hashCode();
        }
        if (getTelephonicState() != null) {
            _hashCode += getTelephonicState().hashCode();
        }
        if (getNbCallBackNotif() != null) {
            _hashCode += getNbCallBackNotif().hashCode();
        }
        if (getVoiceMessagesNb() != null) {
            _hashCode += getVoiceMessagesNb().hashCode();
        }
        if (getTextMessagesNb() != null) {
            _hashCode += getTextMessagesNb().hashCode();
        }
        if (getFaxNb() != null) {
            _hashCode += getFaxNb().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetGlobalPhoneStateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getGlobalPhoneStateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "lineState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcLineState"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomadicState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "nomadicState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcNomadicState"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcmmState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "pcmmState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcPcmmState"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staticState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "staticState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate", "AlcStaticState"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephonicState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "telephonicState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony", "AlcTelephonicState"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbCallBackNotif");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "nbCallBackNotif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voiceMessagesNb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "voiceMessagesNb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textMessagesNb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "textMessagesNb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxNb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "faxNb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
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
