
package com.alcatel_lucent.test.soapstub.types.phone;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the capabilities of a call: the action that can be carried out on the call according to its state.
 * 
 * <p>Java class for AlcCallCapabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcCallCapabilities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="backAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="callBackRequestAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="campOnActivable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cancelConferenceAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="conferenceAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deflectAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="holdAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="intrudeAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="listenAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="maliciousIdentificationAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="overflowToAssociateAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="overflowToPagingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="overflowToVmAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="overrideAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="parkAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="record" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="releaseAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="releaseConferenceAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sendAssociateDataAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sendDtmfAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sendMessageAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="takeAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="transferAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="transferConferenceAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="waitOnBusyAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcCallCapabilities", propOrder = {
    "backAllowed",
    "callBackRequestAllowed",
    "campOnActivable",
    "cancelConferenceAllowed",
    "conferenceAllowed",
    "deflectAllowed",
    "holdAllowed",
    "intrudeAllowed",
    "listenAllowed",
    "maliciousIdentificationAllowed",
    "overflowToAssociateAllowed",
    "overflowToPagingAllowed",
    "overflowToVmAllowed",
    "overrideAllowed",
    "parkAllowed",
    "record",
    "releaseAllowed",
    "releaseConferenceAllowed",
    "sendAssociateDataAllowed",
    "sendDtmfAllowed",
    "sendMessageAllowed",
    "takeAllowed",
    "transferAllowed",
    "transferConferenceAllowed",
    "waitOnBusyAllowed"
})
public class AlcCallCapabilities {

    protected boolean backAllowed;
    protected boolean callBackRequestAllowed;
    protected boolean campOnActivable;
    protected boolean cancelConferenceAllowed;
    protected boolean conferenceAllowed;
    protected boolean deflectAllowed;
    protected boolean holdAllowed;
    protected boolean intrudeAllowed;
    protected boolean listenAllowed;
    protected boolean maliciousIdentificationAllowed;
    protected boolean overflowToAssociateAllowed;
    protected boolean overflowToPagingAllowed;
    protected boolean overflowToVmAllowed;
    protected boolean overrideAllowed;
    protected boolean parkAllowed;
    protected boolean record;
    protected boolean releaseAllowed;
    protected boolean releaseConferenceAllowed;
    protected boolean sendAssociateDataAllowed;
    protected boolean sendDtmfAllowed;
    protected boolean sendMessageAllowed;
    protected boolean takeAllowed;
    protected boolean transferAllowed;
    protected boolean transferConferenceAllowed;
    protected boolean waitOnBusyAllowed;

    /**
     * Gets the value of the backAllowed property.
     * 
     */
    public boolean isBackAllowed() {
        return backAllowed;
    }

    /**
     * Sets the value of the backAllowed property.
     * 
     */
    public void setBackAllowed(boolean value) {
        this.backAllowed = value;
    }

    /**
     * Gets the value of the callBackRequestAllowed property.
     * 
     */
    public boolean isCallBackRequestAllowed() {
        return callBackRequestAllowed;
    }

    /**
     * Sets the value of the callBackRequestAllowed property.
     * 
     */
    public void setCallBackRequestAllowed(boolean value) {
        this.callBackRequestAllowed = value;
    }

    /**
     * Gets the value of the campOnActivable property.
     * 
     */
    public boolean isCampOnActivable() {
        return campOnActivable;
    }

    /**
     * Sets the value of the campOnActivable property.
     * 
     */
    public void setCampOnActivable(boolean value) {
        this.campOnActivable = value;
    }

    /**
     * Gets the value of the cancelConferenceAllowed property.
     * 
     */
    public boolean isCancelConferenceAllowed() {
        return cancelConferenceAllowed;
    }

    /**
     * Sets the value of the cancelConferenceAllowed property.
     * 
     */
    public void setCancelConferenceAllowed(boolean value) {
        this.cancelConferenceAllowed = value;
    }

    /**
     * Gets the value of the conferenceAllowed property.
     * 
     */
    public boolean isConferenceAllowed() {
        return conferenceAllowed;
    }

    /**
     * Sets the value of the conferenceAllowed property.
     * 
     */
    public void setConferenceAllowed(boolean value) {
        this.conferenceAllowed = value;
    }

    /**
     * Gets the value of the deflectAllowed property.
     * 
     */
    public boolean isDeflectAllowed() {
        return deflectAllowed;
    }

    /**
     * Sets the value of the deflectAllowed property.
     * 
     */
    public void setDeflectAllowed(boolean value) {
        this.deflectAllowed = value;
    }

    /**
     * Gets the value of the holdAllowed property.
     * 
     */
    public boolean isHoldAllowed() {
        return holdAllowed;
    }

    /**
     * Sets the value of the holdAllowed property.
     * 
     */
    public void setHoldAllowed(boolean value) {
        this.holdAllowed = value;
    }

    /**
     * Gets the value of the intrudeAllowed property.
     * 
     */
    public boolean isIntrudeAllowed() {
        return intrudeAllowed;
    }

    /**
     * Sets the value of the intrudeAllowed property.
     * 
     */
    public void setIntrudeAllowed(boolean value) {
        this.intrudeAllowed = value;
    }

    /**
     * Gets the value of the listenAllowed property.
     * 
     */
    public boolean isListenAllowed() {
        return listenAllowed;
    }

    /**
     * Sets the value of the listenAllowed property.
     * 
     */
    public void setListenAllowed(boolean value) {
        this.listenAllowed = value;
    }

    /**
     * Gets the value of the maliciousIdentificationAllowed property.
     * 
     */
    public boolean isMaliciousIdentificationAllowed() {
        return maliciousIdentificationAllowed;
    }

    /**
     * Sets the value of the maliciousIdentificationAllowed property.
     * 
     */
    public void setMaliciousIdentificationAllowed(boolean value) {
        this.maliciousIdentificationAllowed = value;
    }

    /**
     * Gets the value of the overflowToAssociateAllowed property.
     * 
     */
    public boolean isOverflowToAssociateAllowed() {
        return overflowToAssociateAllowed;
    }

    /**
     * Sets the value of the overflowToAssociateAllowed property.
     * 
     */
    public void setOverflowToAssociateAllowed(boolean value) {
        this.overflowToAssociateAllowed = value;
    }

    /**
     * Gets the value of the overflowToPagingAllowed property.
     * 
     */
    public boolean isOverflowToPagingAllowed() {
        return overflowToPagingAllowed;
    }

    /**
     * Sets the value of the overflowToPagingAllowed property.
     * 
     */
    public void setOverflowToPagingAllowed(boolean value) {
        this.overflowToPagingAllowed = value;
    }

    /**
     * Gets the value of the overflowToVmAllowed property.
     * 
     */
    public boolean isOverflowToVmAllowed() {
        return overflowToVmAllowed;
    }

    /**
     * Sets the value of the overflowToVmAllowed property.
     * 
     */
    public void setOverflowToVmAllowed(boolean value) {
        this.overflowToVmAllowed = value;
    }

    /**
     * Gets the value of the overrideAllowed property.
     * 
     */
    public boolean isOverrideAllowed() {
        return overrideAllowed;
    }

    /**
     * Sets the value of the overrideAllowed property.
     * 
     */
    public void setOverrideAllowed(boolean value) {
        this.overrideAllowed = value;
    }

    /**
     * Gets the value of the parkAllowed property.
     * 
     */
    public boolean isParkAllowed() {
        return parkAllowed;
    }

    /**
     * Sets the value of the parkAllowed property.
     * 
     */
    public void setParkAllowed(boolean value) {
        this.parkAllowed = value;
    }

    /**
     * Gets the value of the record property.
     * 
     */
    public boolean isRecord() {
        return record;
    }

    /**
     * Sets the value of the record property.
     * 
     */
    public void setRecord(boolean value) {
        this.record = value;
    }

    /**
     * Gets the value of the releaseAllowed property.
     * 
     */
    public boolean isReleaseAllowed() {
        return releaseAllowed;
    }

    /**
     * Sets the value of the releaseAllowed property.
     * 
     */
    public void setReleaseAllowed(boolean value) {
        this.releaseAllowed = value;
    }

    /**
     * Gets the value of the releaseConferenceAllowed property.
     * 
     */
    public boolean isReleaseConferenceAllowed() {
        return releaseConferenceAllowed;
    }

    /**
     * Sets the value of the releaseConferenceAllowed property.
     * 
     */
    public void setReleaseConferenceAllowed(boolean value) {
        this.releaseConferenceAllowed = value;
    }

    /**
     * Gets the value of the sendAssociateDataAllowed property.
     * 
     */
    public boolean isSendAssociateDataAllowed() {
        return sendAssociateDataAllowed;
    }

    /**
     * Sets the value of the sendAssociateDataAllowed property.
     * 
     */
    public void setSendAssociateDataAllowed(boolean value) {
        this.sendAssociateDataAllowed = value;
    }

    /**
     * Gets the value of the sendDtmfAllowed property.
     * 
     */
    public boolean isSendDtmfAllowed() {
        return sendDtmfAllowed;
    }

    /**
     * Sets the value of the sendDtmfAllowed property.
     * 
     */
    public void setSendDtmfAllowed(boolean value) {
        this.sendDtmfAllowed = value;
    }

    /**
     * Gets the value of the sendMessageAllowed property.
     * 
     */
    public boolean isSendMessageAllowed() {
        return sendMessageAllowed;
    }

    /**
     * Sets the value of the sendMessageAllowed property.
     * 
     */
    public void setSendMessageAllowed(boolean value) {
        this.sendMessageAllowed = value;
    }

    /**
     * Gets the value of the takeAllowed property.
     * 
     */
    public boolean isTakeAllowed() {
        return takeAllowed;
    }

    /**
     * Sets the value of the takeAllowed property.
     * 
     */
    public void setTakeAllowed(boolean value) {
        this.takeAllowed = value;
    }

    /**
     * Gets the value of the transferAllowed property.
     * 
     */
    public boolean isTransferAllowed() {
        return transferAllowed;
    }

    /**
     * Sets the value of the transferAllowed property.
     * 
     */
    public void setTransferAllowed(boolean value) {
        this.transferAllowed = value;
    }

    /**
     * Gets the value of the transferConferenceAllowed property.
     * 
     */
    public boolean isTransferConferenceAllowed() {
        return transferConferenceAllowed;
    }

    /**
     * Sets the value of the transferConferenceAllowed property.
     * 
     */
    public void setTransferConferenceAllowed(boolean value) {
        this.transferConferenceAllowed = value;
    }

    /**
     * Gets the value of the waitOnBusyAllowed property.
     * 
     */
    public boolean isWaitOnBusyAllowed() {
        return waitOnBusyAllowed;
    }

    /**
     * Sets the value of the waitOnBusyAllowed property.
     * 
     */
    public void setWaitOnBusyAllowed(boolean value) {
        this.waitOnBusyAllowed = value;
    }

}
