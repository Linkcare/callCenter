
package com.alcatel_lucent.test.soapstub.types.fwmanagement;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes a voice mail profile.
 * 
 * <p>Java class for AlcVoiceMailProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcVoiceMailProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcVoiceMailProfileType"/>
 *         &lt;element name="maxGreetingDuration" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="maxLiveRecordDuration" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="maxMessageDuration" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="maxSizePerMailbox" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="agingOfNewMessages" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="agingOfSavedMessages" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="accessibleViaImap" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="accessibleViaNetwork" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="announcedReceivedDateAndTime" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="checkQuota" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="directCallback" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="extendedAbsenceGreetingBlocksMessage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="keepCall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="limitedAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recordInvite" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="skipMemo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="warning" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcVoiceMailProfile", propOrder = {
    "id",
    "displayName",
    "type",
    "maxGreetingDuration",
    "maxLiveRecordDuration",
    "maxMessageDuration",
    "maxSizePerMailbox",
    "agingOfNewMessages",
    "agingOfSavedMessages",
    "accessibleViaImap",
    "accessibleViaNetwork",
    "announcedReceivedDateAndTime",
    "checkQuota",
    "directCallback",
    "extendedAbsenceGreetingBlocksMessage",
    "keepCall",
    "limitedAccess",
    "recordInvite",
    "skipMemo",
    "warning"
})
public class AlcVoiceMailProfile {

    @XmlElement(required = true, nillable = true)
    protected String id;
    @XmlElement(required = true, nillable = true)
    protected String displayName;
    @XmlElement(required = true, nillable = true)
    protected AlcVoiceMailProfileType type;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxGreetingDuration;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxLiveRecordDuration;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxMessageDuration;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxSizePerMailbox;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger agingOfNewMessages;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger agingOfSavedMessages;
    protected boolean accessibleViaImap;
    protected boolean accessibleViaNetwork;
    protected boolean announcedReceivedDateAndTime;
    protected boolean checkQuota;
    protected boolean directCallback;
    protected boolean extendedAbsenceGreetingBlocksMessage;
    protected boolean keepCall;
    protected boolean limitedAccess;
    protected boolean recordInvite;
    protected boolean skipMemo;
    protected boolean warning;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AlcVoiceMailProfileType }
     *     
     */
    public AlcVoiceMailProfileType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcVoiceMailProfileType }
     *     
     */
    public void setType(AlcVoiceMailProfileType value) {
        this.type = value;
    }

    /**
     * Gets the value of the maxGreetingDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxGreetingDuration() {
        return maxGreetingDuration;
    }

    /**
     * Sets the value of the maxGreetingDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxGreetingDuration(BigInteger value) {
        this.maxGreetingDuration = value;
    }

    /**
     * Gets the value of the maxLiveRecordDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxLiveRecordDuration() {
        return maxLiveRecordDuration;
    }

    /**
     * Sets the value of the maxLiveRecordDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxLiveRecordDuration(BigInteger value) {
        this.maxLiveRecordDuration = value;
    }

    /**
     * Gets the value of the maxMessageDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxMessageDuration() {
        return maxMessageDuration;
    }

    /**
     * Sets the value of the maxMessageDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxMessageDuration(BigInteger value) {
        this.maxMessageDuration = value;
    }

    /**
     * Gets the value of the maxSizePerMailbox property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxSizePerMailbox() {
        return maxSizePerMailbox;
    }

    /**
     * Sets the value of the maxSizePerMailbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxSizePerMailbox(BigInteger value) {
        this.maxSizePerMailbox = value;
    }

    /**
     * Gets the value of the agingOfNewMessages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAgingOfNewMessages() {
        return agingOfNewMessages;
    }

    /**
     * Sets the value of the agingOfNewMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAgingOfNewMessages(BigInteger value) {
        this.agingOfNewMessages = value;
    }

    /**
     * Gets the value of the agingOfSavedMessages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAgingOfSavedMessages() {
        return agingOfSavedMessages;
    }

    /**
     * Sets the value of the agingOfSavedMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAgingOfSavedMessages(BigInteger value) {
        this.agingOfSavedMessages = value;
    }

    /**
     * Gets the value of the accessibleViaImap property.
     * 
     */
    public boolean isAccessibleViaImap() {
        return accessibleViaImap;
    }

    /**
     * Sets the value of the accessibleViaImap property.
     * 
     */
    public void setAccessibleViaImap(boolean value) {
        this.accessibleViaImap = value;
    }

    /**
     * Gets the value of the accessibleViaNetwork property.
     * 
     */
    public boolean isAccessibleViaNetwork() {
        return accessibleViaNetwork;
    }

    /**
     * Sets the value of the accessibleViaNetwork property.
     * 
     */
    public void setAccessibleViaNetwork(boolean value) {
        this.accessibleViaNetwork = value;
    }

    /**
     * Gets the value of the announcedReceivedDateAndTime property.
     * 
     */
    public boolean isAnnouncedReceivedDateAndTime() {
        return announcedReceivedDateAndTime;
    }

    /**
     * Sets the value of the announcedReceivedDateAndTime property.
     * 
     */
    public void setAnnouncedReceivedDateAndTime(boolean value) {
        this.announcedReceivedDateAndTime = value;
    }

    /**
     * Gets the value of the checkQuota property.
     * 
     */
    public boolean isCheckQuota() {
        return checkQuota;
    }

    /**
     * Sets the value of the checkQuota property.
     * 
     */
    public void setCheckQuota(boolean value) {
        this.checkQuota = value;
    }

    /**
     * Gets the value of the directCallback property.
     * 
     */
    public boolean isDirectCallback() {
        return directCallback;
    }

    /**
     * Sets the value of the directCallback property.
     * 
     */
    public void setDirectCallback(boolean value) {
        this.directCallback = value;
    }

    /**
     * Gets the value of the extendedAbsenceGreetingBlocksMessage property.
     * 
     */
    public boolean isExtendedAbsenceGreetingBlocksMessage() {
        return extendedAbsenceGreetingBlocksMessage;
    }

    /**
     * Sets the value of the extendedAbsenceGreetingBlocksMessage property.
     * 
     */
    public void setExtendedAbsenceGreetingBlocksMessage(boolean value) {
        this.extendedAbsenceGreetingBlocksMessage = value;
    }

    /**
     * Gets the value of the keepCall property.
     * 
     */
    public boolean isKeepCall() {
        return keepCall;
    }

    /**
     * Sets the value of the keepCall property.
     * 
     */
    public void setKeepCall(boolean value) {
        this.keepCall = value;
    }

    /**
     * Gets the value of the limitedAccess property.
     * 
     */
    public boolean isLimitedAccess() {
        return limitedAccess;
    }

    /**
     * Sets the value of the limitedAccess property.
     * 
     */
    public void setLimitedAccess(boolean value) {
        this.limitedAccess = value;
    }

    /**
     * Gets the value of the recordInvite property.
     * 
     */
    public boolean isRecordInvite() {
        return recordInvite;
    }

    /**
     * Sets the value of the recordInvite property.
     * 
     */
    public void setRecordInvite(boolean value) {
        this.recordInvite = value;
    }

    /**
     * Gets the value of the skipMemo property.
     * 
     */
    public boolean isSkipMemo() {
        return skipMemo;
    }

    /**
     * Sets the value of the skipMemo property.
     * 
     */
    public void setSkipMemo(boolean value) {
        this.skipMemo = value;
    }

    /**
     * Gets the value of the warning property.
     * 
     */
    public boolean isWarning() {
        return warning;
    }

    /**
     * Sets the value of the warning property.
     * 
     */
    public void setWarning(boolean value) {
        this.warning = value;
    }

}
