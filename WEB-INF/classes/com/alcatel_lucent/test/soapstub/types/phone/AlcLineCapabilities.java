
package com.alcatel_lucent.test.soapstub.types.phone;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the capabilities of a line: the action that can be carried out on the line according to its state.
 * 
 * <p>Java class for AlcLineCapabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcLineCapabilities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="associateModificationAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="businessCallAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="callBackRequestAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="callPickupAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="campOnAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cancelCallBackAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cancelForwardAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cancelOverflowAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="doNotDisturbAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="forwardOnBusyAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="forwardOnBusyOrNoAnswerAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="forwardOnNoAnswerAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="forwardToExternalNumberAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="groupCallPickupAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="immediateForwardAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="lineProgrammable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="lockPhoneSetAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="makeCallAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="overflowOnBusyAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="overflowOnBusyOrNoAnswerAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="overflowOnNoAnswerAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="secretCodeModificationAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="secretIdentityAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="unparkCallAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcLineCapabilities", propOrder = {
    "associateModificationAllowed",
    "businessCallAllowed",
    "callBackRequestAllowed",
    "callPickupAllowed",
    "campOnAllowed",
    "cancelCallBackAllowed",
    "cancelForwardAllowed",
    "cancelOverflowAllowed",
    "doNotDisturbAllowed",
    "forwardOnBusyAllowed",
    "forwardOnBusyOrNoAnswerAllowed",
    "forwardOnNoAnswerAllowed",
    "forwardToExternalNumberAllowed",
    "groupCallPickupAllowed",
    "immediateForwardAllowed",
    "lineProgrammable",
    "lockPhoneSetAllowed",
    "makeCallAllowed",
    "overflowOnBusyAllowed",
    "overflowOnBusyOrNoAnswerAllowed",
    "overflowOnNoAnswerAllowed",
    "secretCodeModificationAllowed",
    "secretIdentityAllowed",
    "unparkCallAllowed"
})
public class AlcLineCapabilities {

    protected boolean associateModificationAllowed;
    protected boolean businessCallAllowed;
    protected boolean callBackRequestAllowed;
    protected boolean callPickupAllowed;
    protected boolean campOnAllowed;
    protected boolean cancelCallBackAllowed;
    protected boolean cancelForwardAllowed;
    protected boolean cancelOverflowAllowed;
    protected boolean doNotDisturbAllowed;
    protected boolean forwardOnBusyAllowed;
    protected boolean forwardOnBusyOrNoAnswerAllowed;
    protected boolean forwardOnNoAnswerAllowed;
    protected boolean forwardToExternalNumberAllowed;
    protected boolean groupCallPickupAllowed;
    protected boolean immediateForwardAllowed;
    protected boolean lineProgrammable;
    protected boolean lockPhoneSetAllowed;
    protected boolean makeCallAllowed;
    protected boolean overflowOnBusyAllowed;
    protected boolean overflowOnBusyOrNoAnswerAllowed;
    protected boolean overflowOnNoAnswerAllowed;
    protected boolean secretCodeModificationAllowed;
    protected boolean secretIdentityAllowed;
    protected boolean unparkCallAllowed;

    /**
     * Gets the value of the associateModificationAllowed property.
     * 
     */
    public boolean isAssociateModificationAllowed() {
        return associateModificationAllowed;
    }

    /**
     * Sets the value of the associateModificationAllowed property.
     * 
     */
    public void setAssociateModificationAllowed(boolean value) {
        this.associateModificationAllowed = value;
    }

    /**
     * Gets the value of the businessCallAllowed property.
     * 
     */
    public boolean isBusinessCallAllowed() {
        return businessCallAllowed;
    }

    /**
     * Sets the value of the businessCallAllowed property.
     * 
     */
    public void setBusinessCallAllowed(boolean value) {
        this.businessCallAllowed = value;
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
     * Gets the value of the callPickupAllowed property.
     * 
     */
    public boolean isCallPickupAllowed() {
        return callPickupAllowed;
    }

    /**
     * Sets the value of the callPickupAllowed property.
     * 
     */
    public void setCallPickupAllowed(boolean value) {
        this.callPickupAllowed = value;
    }

    /**
     * Gets the value of the campOnAllowed property.
     * 
     */
    public boolean isCampOnAllowed() {
        return campOnAllowed;
    }

    /**
     * Sets the value of the campOnAllowed property.
     * 
     */
    public void setCampOnAllowed(boolean value) {
        this.campOnAllowed = value;
    }

    /**
     * Gets the value of the cancelCallBackAllowed property.
     * 
     */
    public boolean isCancelCallBackAllowed() {
        return cancelCallBackAllowed;
    }

    /**
     * Sets the value of the cancelCallBackAllowed property.
     * 
     */
    public void setCancelCallBackAllowed(boolean value) {
        this.cancelCallBackAllowed = value;
    }

    /**
     * Gets the value of the cancelForwardAllowed property.
     * 
     */
    public boolean isCancelForwardAllowed() {
        return cancelForwardAllowed;
    }

    /**
     * Sets the value of the cancelForwardAllowed property.
     * 
     */
    public void setCancelForwardAllowed(boolean value) {
        this.cancelForwardAllowed = value;
    }

    /**
     * Gets the value of the cancelOverflowAllowed property.
     * 
     */
    public boolean isCancelOverflowAllowed() {
        return cancelOverflowAllowed;
    }

    /**
     * Sets the value of the cancelOverflowAllowed property.
     * 
     */
    public void setCancelOverflowAllowed(boolean value) {
        this.cancelOverflowAllowed = value;
    }

    /**
     * Gets the value of the doNotDisturbAllowed property.
     * 
     */
    public boolean isDoNotDisturbAllowed() {
        return doNotDisturbAllowed;
    }

    /**
     * Sets the value of the doNotDisturbAllowed property.
     * 
     */
    public void setDoNotDisturbAllowed(boolean value) {
        this.doNotDisturbAllowed = value;
    }

    /**
     * Gets the value of the forwardOnBusyAllowed property.
     * 
     */
    public boolean isForwardOnBusyAllowed() {
        return forwardOnBusyAllowed;
    }

    /**
     * Sets the value of the forwardOnBusyAllowed property.
     * 
     */
    public void setForwardOnBusyAllowed(boolean value) {
        this.forwardOnBusyAllowed = value;
    }

    /**
     * Gets the value of the forwardOnBusyOrNoAnswerAllowed property.
     * 
     */
    public boolean isForwardOnBusyOrNoAnswerAllowed() {
        return forwardOnBusyOrNoAnswerAllowed;
    }

    /**
     * Sets the value of the forwardOnBusyOrNoAnswerAllowed property.
     * 
     */
    public void setForwardOnBusyOrNoAnswerAllowed(boolean value) {
        this.forwardOnBusyOrNoAnswerAllowed = value;
    }

    /**
     * Gets the value of the forwardOnNoAnswerAllowed property.
     * 
     */
    public boolean isForwardOnNoAnswerAllowed() {
        return forwardOnNoAnswerAllowed;
    }

    /**
     * Sets the value of the forwardOnNoAnswerAllowed property.
     * 
     */
    public void setForwardOnNoAnswerAllowed(boolean value) {
        this.forwardOnNoAnswerAllowed = value;
    }

    /**
     * Gets the value of the forwardToExternalNumberAllowed property.
     * 
     */
    public boolean isForwardToExternalNumberAllowed() {
        return forwardToExternalNumberAllowed;
    }

    /**
     * Sets the value of the forwardToExternalNumberAllowed property.
     * 
     */
    public void setForwardToExternalNumberAllowed(boolean value) {
        this.forwardToExternalNumberAllowed = value;
    }

    /**
     * Gets the value of the groupCallPickupAllowed property.
     * 
     */
    public boolean isGroupCallPickupAllowed() {
        return groupCallPickupAllowed;
    }

    /**
     * Sets the value of the groupCallPickupAllowed property.
     * 
     */
    public void setGroupCallPickupAllowed(boolean value) {
        this.groupCallPickupAllowed = value;
    }

    /**
     * Gets the value of the immediateForwardAllowed property.
     * 
     */
    public boolean isImmediateForwardAllowed() {
        return immediateForwardAllowed;
    }

    /**
     * Sets the value of the immediateForwardAllowed property.
     * 
     */
    public void setImmediateForwardAllowed(boolean value) {
        this.immediateForwardAllowed = value;
    }

    /**
     * Gets the value of the lineProgrammable property.
     * 
     */
    public boolean isLineProgrammable() {
        return lineProgrammable;
    }

    /**
     * Sets the value of the lineProgrammable property.
     * 
     */
    public void setLineProgrammable(boolean value) {
        this.lineProgrammable = value;
    }

    /**
     * Gets the value of the lockPhoneSetAllowed property.
     * 
     */
    public boolean isLockPhoneSetAllowed() {
        return lockPhoneSetAllowed;
    }

    /**
     * Sets the value of the lockPhoneSetAllowed property.
     * 
     */
    public void setLockPhoneSetAllowed(boolean value) {
        this.lockPhoneSetAllowed = value;
    }

    /**
     * Gets the value of the makeCallAllowed property.
     * 
     */
    public boolean isMakeCallAllowed() {
        return makeCallAllowed;
    }

    /**
     * Sets the value of the makeCallAllowed property.
     * 
     */
    public void setMakeCallAllowed(boolean value) {
        this.makeCallAllowed = value;
    }

    /**
     * Gets the value of the overflowOnBusyAllowed property.
     * 
     */
    public boolean isOverflowOnBusyAllowed() {
        return overflowOnBusyAllowed;
    }

    /**
     * Sets the value of the overflowOnBusyAllowed property.
     * 
     */
    public void setOverflowOnBusyAllowed(boolean value) {
        this.overflowOnBusyAllowed = value;
    }

    /**
     * Gets the value of the overflowOnBusyOrNoAnswerAllowed property.
     * 
     */
    public boolean isOverflowOnBusyOrNoAnswerAllowed() {
        return overflowOnBusyOrNoAnswerAllowed;
    }

    /**
     * Sets the value of the overflowOnBusyOrNoAnswerAllowed property.
     * 
     */
    public void setOverflowOnBusyOrNoAnswerAllowed(boolean value) {
        this.overflowOnBusyOrNoAnswerAllowed = value;
    }

    /**
     * Gets the value of the overflowOnNoAnswerAllowed property.
     * 
     */
    public boolean isOverflowOnNoAnswerAllowed() {
        return overflowOnNoAnswerAllowed;
    }

    /**
     * Sets the value of the overflowOnNoAnswerAllowed property.
     * 
     */
    public void setOverflowOnNoAnswerAllowed(boolean value) {
        this.overflowOnNoAnswerAllowed = value;
    }

    /**
     * Gets the value of the secretCodeModificationAllowed property.
     * 
     */
    public boolean isSecretCodeModificationAllowed() {
        return secretCodeModificationAllowed;
    }

    /**
     * Sets the value of the secretCodeModificationAllowed property.
     * 
     */
    public void setSecretCodeModificationAllowed(boolean value) {
        this.secretCodeModificationAllowed = value;
    }

    /**
     * Gets the value of the secretIdentityAllowed property.
     * 
     */
    public boolean isSecretIdentityAllowed() {
        return secretIdentityAllowed;
    }

    /**
     * Sets the value of the secretIdentityAllowed property.
     * 
     */
    public void setSecretIdentityAllowed(boolean value) {
        this.secretIdentityAllowed = value;
    }

    /**
     * Gets the value of the unparkCallAllowed property.
     * 
     */
    public boolean isUnparkCallAllowed() {
        return unparkCallAllowed;
    }

    /**
     * Sets the value of the unparkCallAllowed property.
     * 
     */
    public void setUnparkCallAllowed(boolean value) {
        this.unparkCallAllowed = value;
    }

}
