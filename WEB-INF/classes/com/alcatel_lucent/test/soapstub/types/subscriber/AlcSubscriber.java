
package com.alcatel_lucent.test.soapstub.types.subscriber;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This type describes a PBX 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;I xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Subscriber&lt;/I&gt;
 * </pre>
 * .
 * 
 * <p>Java class for AlcSubscriber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcSubscriber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="directoryNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identity" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber}AlcSubscriberIdentity"/>
 *         &lt;element name="callByNameData" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber}AlcCallByNameData"/>
 *         &lt;element name="phoneSetData" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber}AlcPhoneSetData"/>
 *         &lt;element name="rights" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber}AlcSubscriberRights"/>
 *         &lt;element name="businessData" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber}AlcBusinessData"/>
 *         &lt;element name="tandemData" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber}AlcTandemData"/>
 *         &lt;element name="sipData" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber}AlcSipData"/>
 *         &lt;element name="groupsData" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber}AlcGroupsData"/>
 *         &lt;element name="voiceMailData" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber}AlcVoiceMailData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcSubscriber", propOrder = {
    "directoryNumber",
    "identity",
    "callByNameData",
    "phoneSetData",
    "rights",
    "businessData",
    "tandemData",
    "sipData",
    "groupsData",
    "voiceMailData"
})
public class AlcSubscriber {

    @XmlElement(required = true)
    protected String directoryNumber;
    @XmlElement(required = true, nillable = true)
    protected AlcSubscriberIdentity identity;
    @XmlElement(required = true, nillable = true)
    protected AlcCallByNameData callByNameData;
    @XmlElement(required = true, nillable = true)
    protected AlcPhoneSetData phoneSetData;
    @XmlElement(required = true, nillable = true)
    protected AlcSubscriberRights rights;
    @XmlElement(required = true, nillable = true)
    protected AlcBusinessData businessData;
    @XmlElement(required = true, nillable = true)
    protected AlcTandemData tandemData;
    @XmlElement(required = true, nillable = true)
    protected AlcSipData sipData;
    @XmlElement(required = true, nillable = true)
    protected AlcGroupsData groupsData;
    @XmlElement(required = true, nillable = true)
    protected AlcVoiceMailData voiceMailData;

    /**
     * Gets the value of the directoryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectoryNumber() {
        return directoryNumber;
    }

    /**
     * Sets the value of the directoryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectoryNumber(String value) {
        this.directoryNumber = value;
    }

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link AlcSubscriberIdentity }
     *     
     */
    public AlcSubscriberIdentity getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcSubscriberIdentity }
     *     
     */
    public void setIdentity(AlcSubscriberIdentity value) {
        this.identity = value;
    }

    /**
     * Gets the value of the callByNameData property.
     * 
     * @return
     *     possible object is
     *     {@link AlcCallByNameData }
     *     
     */
    public AlcCallByNameData getCallByNameData() {
        return callByNameData;
    }

    /**
     * Sets the value of the callByNameData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcCallByNameData }
     *     
     */
    public void setCallByNameData(AlcCallByNameData value) {
        this.callByNameData = value;
    }

    /**
     * Gets the value of the phoneSetData property.
     * 
     * @return
     *     possible object is
     *     {@link AlcPhoneSetData }
     *     
     */
    public AlcPhoneSetData getPhoneSetData() {
        return phoneSetData;
    }

    /**
     * Sets the value of the phoneSetData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcPhoneSetData }
     *     
     */
    public void setPhoneSetData(AlcPhoneSetData value) {
        this.phoneSetData = value;
    }

    /**
     * Gets the value of the rights property.
     * 
     * @return
     *     possible object is
     *     {@link AlcSubscriberRights }
     *     
     */
    public AlcSubscriberRights getRights() {
        return rights;
    }

    /**
     * Sets the value of the rights property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcSubscriberRights }
     *     
     */
    public void setRights(AlcSubscriberRights value) {
        this.rights = value;
    }

    /**
     * Gets the value of the businessData property.
     * 
     * @return
     *     possible object is
     *     {@link AlcBusinessData }
     *     
     */
    public AlcBusinessData getBusinessData() {
        return businessData;
    }

    /**
     * Sets the value of the businessData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcBusinessData }
     *     
     */
    public void setBusinessData(AlcBusinessData value) {
        this.businessData = value;
    }

    /**
     * Gets the value of the tandemData property.
     * 
     * @return
     *     possible object is
     *     {@link AlcTandemData }
     *     
     */
    public AlcTandemData getTandemData() {
        return tandemData;
    }

    /**
     * Sets the value of the tandemData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcTandemData }
     *     
     */
    public void setTandemData(AlcTandemData value) {
        this.tandemData = value;
    }

    /**
     * Gets the value of the sipData property.
     * 
     * @return
     *     possible object is
     *     {@link AlcSipData }
     *     
     */
    public AlcSipData getSipData() {
        return sipData;
    }

    /**
     * Sets the value of the sipData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcSipData }
     *     
     */
    public void setSipData(AlcSipData value) {
        this.sipData = value;
    }

    /**
     * Gets the value of the groupsData property.
     * 
     * @return
     *     possible object is
     *     {@link AlcGroupsData }
     *     
     */
    public AlcGroupsData getGroupsData() {
        return groupsData;
    }

    /**
     * Sets the value of the groupsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcGroupsData }
     *     
     */
    public void setGroupsData(AlcGroupsData value) {
        this.groupsData = value;
    }

    /**
     * Gets the value of the voiceMailData property.
     * 
     * @return
     *     possible object is
     *     {@link AlcVoiceMailData }
     *     
     */
    public AlcVoiceMailData getVoiceMailData() {
        return voiceMailData;
    }

    /**
     * Sets the value of the voiceMailData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcVoiceMailData }
     *     
     */
    public void setVoiceMailData(AlcVoiceMailData value) {
        this.voiceMailData = value;
    }

}
