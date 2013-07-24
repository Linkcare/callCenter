
package com.alcatel_lucent.test.soapstub.types.phone;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema}AlcResult">
 *       &lt;sequence>
 *         &lt;element name="clearCall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="conferenceCall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="getTelephonicState" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="getCurrentCallInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="holdCall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="makeBusinessCall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="makeCall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="makeCorrelatorCall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="makePrivateCall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sendAssociateData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sendDtmf" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="takeCall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deflectCall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="transferCall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="getLineState" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cancelConferenceCall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="transferConferenceCall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="releaseConferenceCall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="blindTransferCall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="parkCall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="unParkCall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="overflowToVoiceMail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deflectCallToVoiceMail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="getBasicTelephonicState" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clearCall",
    "conferenceCall",
    "getTelephonicState",
    "getCurrentCallInfo",
    "holdCall",
    "makeBusinessCall",
    "makeCall",
    "makeCorrelatorCall",
    "makePrivateCall",
    "sendAssociateData",
    "sendDtmf",
    "takeCall",
    "deflectCall",
    "transferCall",
    "getLineState",
    "cancelConferenceCall",
    "transferConferenceCall",
    "releaseConferenceCall",
    "blindTransferCall",
    "parkCall",
    "unParkCall",
    "overflowToVoiceMail",
    "deflectCallToVoiceMail",
    "getBasicTelephonicState"
})
@XmlRootElement(name = "getTelephonyCapabilitiesResponse")
public class GetTelephonyCapabilitiesResponse
    extends AlcResult
{

    protected boolean clearCall;
    protected boolean conferenceCall;
    protected boolean getTelephonicState;
    protected boolean getCurrentCallInfo;
    protected boolean holdCall;
    protected boolean makeBusinessCall;
    protected boolean makeCall;
    protected boolean makeCorrelatorCall;
    protected boolean makePrivateCall;
    protected boolean sendAssociateData;
    protected boolean sendDtmf;
    protected boolean takeCall;
    protected boolean deflectCall;
    protected boolean transferCall;
    protected boolean getLineState;
    protected boolean cancelConferenceCall;
    protected boolean transferConferenceCall;
    protected boolean releaseConferenceCall;
    protected boolean blindTransferCall;
    protected boolean parkCall;
    protected boolean unParkCall;
    protected boolean overflowToVoiceMail;
    protected boolean deflectCallToVoiceMail;
    protected boolean getBasicTelephonicState;

    /**
     * Gets the value of the clearCall property.
     * 
     */
    public boolean isClearCall() {
        return clearCall;
    }

    /**
     * Sets the value of the clearCall property.
     * 
     */
    public void setClearCall(boolean value) {
        this.clearCall = value;
    }

    /**
     * Gets the value of the conferenceCall property.
     * 
     */
    public boolean isConferenceCall() {
        return conferenceCall;
    }

    /**
     * Sets the value of the conferenceCall property.
     * 
     */
    public void setConferenceCall(boolean value) {
        this.conferenceCall = value;
    }

    /**
     * Gets the value of the getTelephonicState property.
     * 
     */
    public boolean isGetTelephonicState() {
        return getTelephonicState;
    }

    /**
     * Sets the value of the getTelephonicState property.
     * 
     */
    public void setGetTelephonicState(boolean value) {
        this.getTelephonicState = value;
    }

    /**
     * Gets the value of the getCurrentCallInfo property.
     * 
     */
    public boolean isGetCurrentCallInfo() {
        return getCurrentCallInfo;
    }

    /**
     * Sets the value of the getCurrentCallInfo property.
     * 
     */
    public void setGetCurrentCallInfo(boolean value) {
        this.getCurrentCallInfo = value;
    }

    /**
     * Gets the value of the holdCall property.
     * 
     */
    public boolean isHoldCall() {
        return holdCall;
    }

    /**
     * Sets the value of the holdCall property.
     * 
     */
    public void setHoldCall(boolean value) {
        this.holdCall = value;
    }

    /**
     * Gets the value of the makeBusinessCall property.
     * 
     */
    public boolean isMakeBusinessCall() {
        return makeBusinessCall;
    }

    /**
     * Sets the value of the makeBusinessCall property.
     * 
     */
    public void setMakeBusinessCall(boolean value) {
        this.makeBusinessCall = value;
    }

    /**
     * Gets the value of the makeCall property.
     * 
     */
    public boolean isMakeCall() {
        return makeCall;
    }

    /**
     * Sets the value of the makeCall property.
     * 
     */
    public void setMakeCall(boolean value) {
        this.makeCall = value;
    }

    /**
     * Gets the value of the makeCorrelatorCall property.
     * 
     */
    public boolean isMakeCorrelatorCall() {
        return makeCorrelatorCall;
    }

    /**
     * Sets the value of the makeCorrelatorCall property.
     * 
     */
    public void setMakeCorrelatorCall(boolean value) {
        this.makeCorrelatorCall = value;
    }

    /**
     * Gets the value of the makePrivateCall property.
     * 
     */
    public boolean isMakePrivateCall() {
        return makePrivateCall;
    }

    /**
     * Sets the value of the makePrivateCall property.
     * 
     */
    public void setMakePrivateCall(boolean value) {
        this.makePrivateCall = value;
    }

    /**
     * Gets the value of the sendAssociateData property.
     * 
     */
    public boolean isSendAssociateData() {
        return sendAssociateData;
    }

    /**
     * Sets the value of the sendAssociateData property.
     * 
     */
    public void setSendAssociateData(boolean value) {
        this.sendAssociateData = value;
    }

    /**
     * Gets the value of the sendDtmf property.
     * 
     */
    public boolean isSendDtmf() {
        return sendDtmf;
    }

    /**
     * Sets the value of the sendDtmf property.
     * 
     */
    public void setSendDtmf(boolean value) {
        this.sendDtmf = value;
    }

    /**
     * Gets the value of the takeCall property.
     * 
     */
    public boolean isTakeCall() {
        return takeCall;
    }

    /**
     * Sets the value of the takeCall property.
     * 
     */
    public void setTakeCall(boolean value) {
        this.takeCall = value;
    }

    /**
     * Gets the value of the deflectCall property.
     * 
     */
    public boolean isDeflectCall() {
        return deflectCall;
    }

    /**
     * Sets the value of the deflectCall property.
     * 
     */
    public void setDeflectCall(boolean value) {
        this.deflectCall = value;
    }

    /**
     * Gets the value of the transferCall property.
     * 
     */
    public boolean isTransferCall() {
        return transferCall;
    }

    /**
     * Sets the value of the transferCall property.
     * 
     */
    public void setTransferCall(boolean value) {
        this.transferCall = value;
    }

    /**
     * Gets the value of the getLineState property.
     * 
     */
    public boolean isGetLineState() {
        return getLineState;
    }

    /**
     * Sets the value of the getLineState property.
     * 
     */
    public void setGetLineState(boolean value) {
        this.getLineState = value;
    }

    /**
     * Gets the value of the cancelConferenceCall property.
     * 
     */
    public boolean isCancelConferenceCall() {
        return cancelConferenceCall;
    }

    /**
     * Sets the value of the cancelConferenceCall property.
     * 
     */
    public void setCancelConferenceCall(boolean value) {
        this.cancelConferenceCall = value;
    }

    /**
     * Gets the value of the transferConferenceCall property.
     * 
     */
    public boolean isTransferConferenceCall() {
        return transferConferenceCall;
    }

    /**
     * Sets the value of the transferConferenceCall property.
     * 
     */
    public void setTransferConferenceCall(boolean value) {
        this.transferConferenceCall = value;
    }

    /**
     * Gets the value of the releaseConferenceCall property.
     * 
     */
    public boolean isReleaseConferenceCall() {
        return releaseConferenceCall;
    }

    /**
     * Sets the value of the releaseConferenceCall property.
     * 
     */
    public void setReleaseConferenceCall(boolean value) {
        this.releaseConferenceCall = value;
    }

    /**
     * Gets the value of the blindTransferCall property.
     * 
     */
    public boolean isBlindTransferCall() {
        return blindTransferCall;
    }

    /**
     * Sets the value of the blindTransferCall property.
     * 
     */
    public void setBlindTransferCall(boolean value) {
        this.blindTransferCall = value;
    }

    /**
     * Gets the value of the parkCall property.
     * 
     */
    public boolean isParkCall() {
        return parkCall;
    }

    /**
     * Sets the value of the parkCall property.
     * 
     */
    public void setParkCall(boolean value) {
        this.parkCall = value;
    }

    /**
     * Gets the value of the unParkCall property.
     * 
     */
    public boolean isUnParkCall() {
        return unParkCall;
    }

    /**
     * Sets the value of the unParkCall property.
     * 
     */
    public void setUnParkCall(boolean value) {
        this.unParkCall = value;
    }

    /**
     * Gets the value of the overflowToVoiceMail property.
     * 
     */
    public boolean isOverflowToVoiceMail() {
        return overflowToVoiceMail;
    }

    /**
     * Sets the value of the overflowToVoiceMail property.
     * 
     */
    public void setOverflowToVoiceMail(boolean value) {
        this.overflowToVoiceMail = value;
    }

    /**
     * Gets the value of the deflectCallToVoiceMail property.
     * 
     */
    public boolean isDeflectCallToVoiceMail() {
        return deflectCallToVoiceMail;
    }

    /**
     * Sets the value of the deflectCallToVoiceMail property.
     * 
     */
    public void setDeflectCallToVoiceMail(boolean value) {
        this.deflectCallToVoiceMail = value;
    }

    /**
     * Gets the value of the getBasicTelephonicState property.
     * 
     */
    public boolean isGetBasicTelephonicState() {
        return getBasicTelephonicState;
    }

    /**
     * Sets the value of the getBasicTelephonicState property.
     * 
     */
    public void setGetBasicTelephonicState(boolean value) {
        this.getBasicTelephonicState = value;
    }

}
