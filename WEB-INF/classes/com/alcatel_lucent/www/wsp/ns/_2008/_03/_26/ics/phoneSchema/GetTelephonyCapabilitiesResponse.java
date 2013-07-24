/**
 * GetTelephonyCapabilitiesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema;

public class GetTelephonyCapabilitiesResponse  extends com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcResult  implements java.io.Serializable {
    private boolean clearCall;

    private boolean conferenceCall;

    private boolean getTelephonicState;

    private boolean getCurrentCallInfo;

    private boolean holdCall;

    private boolean makeBusinessCall;

    private boolean makeCall;

    private boolean makeCorrelatorCall;

    private boolean makePrivateCall;

    private boolean sendAssociateData;

    private boolean sendDtmf;

    private boolean takeCall;

    private boolean deflectCall;

    private boolean transferCall;

    private boolean getLineState;

    private boolean cancelConferenceCall;

    private boolean transferConferenceCall;

    private boolean releaseConferenceCall;

    private boolean blindTransferCall;

    private boolean parkCall;

    private boolean unParkCall;

    private boolean overflowToVoiceMail;

    private boolean deflectCallToVoiceMail;

    private boolean getBasicTelephonicState;

    public GetTelephonyCapabilitiesResponse() {
    }

    public GetTelephonyCapabilitiesResponse(
           com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.AlcResultCode resultCode,
           java.lang.String comment,
           boolean clearCall,
           boolean conferenceCall,
           boolean getTelephonicState,
           boolean getCurrentCallInfo,
           boolean holdCall,
           boolean makeBusinessCall,
           boolean makeCall,
           boolean makeCorrelatorCall,
           boolean makePrivateCall,
           boolean sendAssociateData,
           boolean sendDtmf,
           boolean takeCall,
           boolean deflectCall,
           boolean transferCall,
           boolean getLineState,
           boolean cancelConferenceCall,
           boolean transferConferenceCall,
           boolean releaseConferenceCall,
           boolean blindTransferCall,
           boolean parkCall,
           boolean unParkCall,
           boolean overflowToVoiceMail,
           boolean deflectCallToVoiceMail,
           boolean getBasicTelephonicState) {
        super(
            resultCode,
            comment);
        this.clearCall = clearCall;
        this.conferenceCall = conferenceCall;
        this.getTelephonicState = getTelephonicState;
        this.getCurrentCallInfo = getCurrentCallInfo;
        this.holdCall = holdCall;
        this.makeBusinessCall = makeBusinessCall;
        this.makeCall = makeCall;
        this.makeCorrelatorCall = makeCorrelatorCall;
        this.makePrivateCall = makePrivateCall;
        this.sendAssociateData = sendAssociateData;
        this.sendDtmf = sendDtmf;
        this.takeCall = takeCall;
        this.deflectCall = deflectCall;
        this.transferCall = transferCall;
        this.getLineState = getLineState;
        this.cancelConferenceCall = cancelConferenceCall;
        this.transferConferenceCall = transferConferenceCall;
        this.releaseConferenceCall = releaseConferenceCall;
        this.blindTransferCall = blindTransferCall;
        this.parkCall = parkCall;
        this.unParkCall = unParkCall;
        this.overflowToVoiceMail = overflowToVoiceMail;
        this.deflectCallToVoiceMail = deflectCallToVoiceMail;
        this.getBasicTelephonicState = getBasicTelephonicState;
    }


    /**
     * Gets the clearCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @return clearCall
     */
    public boolean isClearCall() {
        return clearCall;
    }


    /**
     * Sets the clearCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @param clearCall
     */
    public void setClearCall(boolean clearCall) {
        this.clearCall = clearCall;
    }


    /**
     * Gets the conferenceCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @return conferenceCall
     */
    public boolean isConferenceCall() {
        return conferenceCall;
    }


    /**
     * Sets the conferenceCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @param conferenceCall
     */
    public void setConferenceCall(boolean conferenceCall) {
        this.conferenceCall = conferenceCall;
    }


    /**
     * Gets the getTelephonicState value for this GetTelephonyCapabilitiesResponse.
     * 
     * @return getTelephonicState
     */
    public boolean isGetTelephonicState() {
        return getTelephonicState;
    }


    /**
     * Sets the getTelephonicState value for this GetTelephonyCapabilitiesResponse.
     * 
     * @param getTelephonicState
     */
    public void setGetTelephonicState(boolean getTelephonicState) {
        this.getTelephonicState = getTelephonicState;
    }


    /**
     * Gets the getCurrentCallInfo value for this GetTelephonyCapabilitiesResponse.
     * 
     * @return getCurrentCallInfo
     */
    public boolean isGetCurrentCallInfo() {
        return getCurrentCallInfo;
    }


    /**
     * Sets the getCurrentCallInfo value for this GetTelephonyCapabilitiesResponse.
     * 
     * @param getCurrentCallInfo
     */
    public void setGetCurrentCallInfo(boolean getCurrentCallInfo) {
        this.getCurrentCallInfo = getCurrentCallInfo;
    }


    /**
     * Gets the holdCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @return holdCall
     */
    public boolean isHoldCall() {
        return holdCall;
    }


    /**
     * Sets the holdCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @param holdCall
     */
    public void setHoldCall(boolean holdCall) {
        this.holdCall = holdCall;
    }


    /**
     * Gets the makeBusinessCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @return makeBusinessCall
     */
    public boolean isMakeBusinessCall() {
        return makeBusinessCall;
    }


    /**
     * Sets the makeBusinessCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @param makeBusinessCall
     */
    public void setMakeBusinessCall(boolean makeBusinessCall) {
        this.makeBusinessCall = makeBusinessCall;
    }


    /**
     * Gets the makeCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @return makeCall
     */
    public boolean isMakeCall() {
        return makeCall;
    }


    /**
     * Sets the makeCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @param makeCall
     */
    public void setMakeCall(boolean makeCall) {
        this.makeCall = makeCall;
    }


    /**
     * Gets the makeCorrelatorCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @return makeCorrelatorCall
     */
    public boolean isMakeCorrelatorCall() {
        return makeCorrelatorCall;
    }


    /**
     * Sets the makeCorrelatorCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @param makeCorrelatorCall
     */
    public void setMakeCorrelatorCall(boolean makeCorrelatorCall) {
        this.makeCorrelatorCall = makeCorrelatorCall;
    }


    /**
     * Gets the makePrivateCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @return makePrivateCall
     */
    public boolean isMakePrivateCall() {
        return makePrivateCall;
    }


    /**
     * Sets the makePrivateCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @param makePrivateCall
     */
    public void setMakePrivateCall(boolean makePrivateCall) {
        this.makePrivateCall = makePrivateCall;
    }


    /**
     * Gets the sendAssociateData value for this GetTelephonyCapabilitiesResponse.
     * 
     * @return sendAssociateData
     */
    public boolean isSendAssociateData() {
        return sendAssociateData;
    }


    /**
     * Sets the sendAssociateData value for this GetTelephonyCapabilitiesResponse.
     * 
     * @param sendAssociateData
     */
    public void setSendAssociateData(boolean sendAssociateData) {
        this.sendAssociateData = sendAssociateData;
    }


    /**
     * Gets the sendDtmf value for this GetTelephonyCapabilitiesResponse.
     * 
     * @return sendDtmf
     */
    public boolean isSendDtmf() {
        return sendDtmf;
    }


    /**
     * Sets the sendDtmf value for this GetTelephonyCapabilitiesResponse.
     * 
     * @param sendDtmf
     */
    public void setSendDtmf(boolean sendDtmf) {
        this.sendDtmf = sendDtmf;
    }


    /**
     * Gets the takeCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @return takeCall
     */
    public boolean isTakeCall() {
        return takeCall;
    }


    /**
     * Sets the takeCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @param takeCall
     */
    public void setTakeCall(boolean takeCall) {
        this.takeCall = takeCall;
    }


    /**
     * Gets the deflectCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @return deflectCall
     */
    public boolean isDeflectCall() {
        return deflectCall;
    }


    /**
     * Sets the deflectCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @param deflectCall
     */
    public void setDeflectCall(boolean deflectCall) {
        this.deflectCall = deflectCall;
    }


    /**
     * Gets the transferCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @return transferCall
     */
    public boolean isTransferCall() {
        return transferCall;
    }


    /**
     * Sets the transferCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @param transferCall
     */
    public void setTransferCall(boolean transferCall) {
        this.transferCall = transferCall;
    }


    /**
     * Gets the getLineState value for this GetTelephonyCapabilitiesResponse.
     * 
     * @return getLineState
     */
    public boolean isGetLineState() {
        return getLineState;
    }


    /**
     * Sets the getLineState value for this GetTelephonyCapabilitiesResponse.
     * 
     * @param getLineState
     */
    public void setGetLineState(boolean getLineState) {
        this.getLineState = getLineState;
    }


    /**
     * Gets the cancelConferenceCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @return cancelConferenceCall
     */
    public boolean isCancelConferenceCall() {
        return cancelConferenceCall;
    }


    /**
     * Sets the cancelConferenceCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @param cancelConferenceCall
     */
    public void setCancelConferenceCall(boolean cancelConferenceCall) {
        this.cancelConferenceCall = cancelConferenceCall;
    }


    /**
     * Gets the transferConferenceCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @return transferConferenceCall
     */
    public boolean isTransferConferenceCall() {
        return transferConferenceCall;
    }


    /**
     * Sets the transferConferenceCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @param transferConferenceCall
     */
    public void setTransferConferenceCall(boolean transferConferenceCall) {
        this.transferConferenceCall = transferConferenceCall;
    }


    /**
     * Gets the releaseConferenceCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @return releaseConferenceCall
     */
    public boolean isReleaseConferenceCall() {
        return releaseConferenceCall;
    }


    /**
     * Sets the releaseConferenceCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @param releaseConferenceCall
     */
    public void setReleaseConferenceCall(boolean releaseConferenceCall) {
        this.releaseConferenceCall = releaseConferenceCall;
    }


    /**
     * Gets the blindTransferCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @return blindTransferCall
     */
    public boolean isBlindTransferCall() {
        return blindTransferCall;
    }


    /**
     * Sets the blindTransferCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @param blindTransferCall
     */
    public void setBlindTransferCall(boolean blindTransferCall) {
        this.blindTransferCall = blindTransferCall;
    }


    /**
     * Gets the parkCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @return parkCall
     */
    public boolean isParkCall() {
        return parkCall;
    }


    /**
     * Sets the parkCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @param parkCall
     */
    public void setParkCall(boolean parkCall) {
        this.parkCall = parkCall;
    }


    /**
     * Gets the unParkCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @return unParkCall
     */
    public boolean isUnParkCall() {
        return unParkCall;
    }


    /**
     * Sets the unParkCall value for this GetTelephonyCapabilitiesResponse.
     * 
     * @param unParkCall
     */
    public void setUnParkCall(boolean unParkCall) {
        this.unParkCall = unParkCall;
    }


    /**
     * Gets the overflowToVoiceMail value for this GetTelephonyCapabilitiesResponse.
     * 
     * @return overflowToVoiceMail
     */
    public boolean isOverflowToVoiceMail() {
        return overflowToVoiceMail;
    }


    /**
     * Sets the overflowToVoiceMail value for this GetTelephonyCapabilitiesResponse.
     * 
     * @param overflowToVoiceMail
     */
    public void setOverflowToVoiceMail(boolean overflowToVoiceMail) {
        this.overflowToVoiceMail = overflowToVoiceMail;
    }


    /**
     * Gets the deflectCallToVoiceMail value for this GetTelephonyCapabilitiesResponse.
     * 
     * @return deflectCallToVoiceMail
     */
    public boolean isDeflectCallToVoiceMail() {
        return deflectCallToVoiceMail;
    }


    /**
     * Sets the deflectCallToVoiceMail value for this GetTelephonyCapabilitiesResponse.
     * 
     * @param deflectCallToVoiceMail
     */
    public void setDeflectCallToVoiceMail(boolean deflectCallToVoiceMail) {
        this.deflectCallToVoiceMail = deflectCallToVoiceMail;
    }


    /**
     * Gets the getBasicTelephonicState value for this GetTelephonyCapabilitiesResponse.
     * 
     * @return getBasicTelephonicState
     */
    public boolean isGetBasicTelephonicState() {
        return getBasicTelephonicState;
    }


    /**
     * Sets the getBasicTelephonicState value for this GetTelephonyCapabilitiesResponse.
     * 
     * @param getBasicTelephonicState
     */
    public void setGetBasicTelephonicState(boolean getBasicTelephonicState) {
        this.getBasicTelephonicState = getBasicTelephonicState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTelephonyCapabilitiesResponse)) return false;
        GetTelephonyCapabilitiesResponse other = (GetTelephonyCapabilitiesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.clearCall == other.isClearCall() &&
            this.conferenceCall == other.isConferenceCall() &&
            this.getTelephonicState == other.isGetTelephonicState() &&
            this.getCurrentCallInfo == other.isGetCurrentCallInfo() &&
            this.holdCall == other.isHoldCall() &&
            this.makeBusinessCall == other.isMakeBusinessCall() &&
            this.makeCall == other.isMakeCall() &&
            this.makeCorrelatorCall == other.isMakeCorrelatorCall() &&
            this.makePrivateCall == other.isMakePrivateCall() &&
            this.sendAssociateData == other.isSendAssociateData() &&
            this.sendDtmf == other.isSendDtmf() &&
            this.takeCall == other.isTakeCall() &&
            this.deflectCall == other.isDeflectCall() &&
            this.transferCall == other.isTransferCall() &&
            this.getLineState == other.isGetLineState() &&
            this.cancelConferenceCall == other.isCancelConferenceCall() &&
            this.transferConferenceCall == other.isTransferConferenceCall() &&
            this.releaseConferenceCall == other.isReleaseConferenceCall() &&
            this.blindTransferCall == other.isBlindTransferCall() &&
            this.parkCall == other.isParkCall() &&
            this.unParkCall == other.isUnParkCall() &&
            this.overflowToVoiceMail == other.isOverflowToVoiceMail() &&
            this.deflectCallToVoiceMail == other.isDeflectCallToVoiceMail() &&
            this.getBasicTelephonicState == other.isGetBasicTelephonicState();
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
        _hashCode += (isClearCall() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isConferenceCall() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isGetTelephonicState() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isGetCurrentCallInfo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHoldCall() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMakeBusinessCall() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMakeCall() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMakeCorrelatorCall() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMakePrivateCall() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSendAssociateData() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSendDtmf() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTakeCall() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDeflectCall() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTransferCall() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isGetLineState() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCancelConferenceCall() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTransferConferenceCall() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isReleaseConferenceCall() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isBlindTransferCall() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isParkCall() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isUnParkCall() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOverflowToVoiceMail() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDeflectCallToVoiceMail() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isGetBasicTelephonicState() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTelephonyCapabilitiesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getTelephonyCapabilitiesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearCall");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "clearCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conferenceCall");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "conferenceCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getTelephonicState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getTelephonicState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCurrentCallInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getCurrentCallInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holdCall");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "holdCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("makeBusinessCall");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "makeBusinessCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("makeCall");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "makeCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("makeCorrelatorCall");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "makeCorrelatorCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("makePrivateCall");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "makePrivateCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendAssociateData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "sendAssociateData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendDtmf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "sendDtmf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("takeCall");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "takeCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deflectCall");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deflectCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferCall");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "transferCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getLineState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getLineState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelConferenceCall");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "cancelConferenceCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferConferenceCall");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "transferConferenceCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releaseConferenceCall");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "releaseConferenceCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blindTransferCall");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "blindTransferCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parkCall");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "parkCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unParkCall");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "unParkCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overflowToVoiceMail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "overflowToVoiceMail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deflectCallToVoiceMail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "deflectCallToVoiceMail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getBasicTelephonicState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", "getBasicTelephonicState"));
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
