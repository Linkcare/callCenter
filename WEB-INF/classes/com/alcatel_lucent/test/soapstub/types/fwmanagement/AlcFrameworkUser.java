
package com.alcatel_lucent.test.soapstub.types.fwmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *          Describes a 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Framework User&lt;/i&gt;
 * </pre>
 * .
 *       
 * 
 * <p>Java class for AlcFrameworkUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcFrameworkUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addOns" type="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcAddOn" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="companyContacts" type="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcCompanyContacts"/>
 *         &lt;element name="customizableField1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customizableField2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customizableField3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="departmentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dialingRuleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="externalId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identity" type="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcIdentity"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="loginName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="myAssistantData" type="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcMyAssistantData"/>
 *         &lt;element name="myInstantCommunicatorData" type="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcMyInstantCommunicatorData"/>
 *         &lt;element name="myMessagingData" type="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcMyMessagingData"/>
 *         &lt;element name="myPhoneData" type="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcMyPhoneData"/>
 *         &lt;element name="myTeamworkData" type="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcMyTeamworkData"/>
 *         &lt;element name="password" type="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcPasswordData"/>
 *         &lt;element name="presenceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tuiData" type="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcTuiData"/>
 *         &lt;element name="voiceMailBoxId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcFrameworkUser", propOrder = {
    "addOns",
    "companyContacts",
    "customizableField1",
    "customizableField2",
    "customizableField3",
    "departmentName",
    "dialingRuleName",
    "externalId",
    "identity",
    "language",
    "loginName",
    "myAssistantData",
    "myInstantCommunicatorData",
    "myMessagingData",
    "myPhoneData",
    "myTeamworkData",
    "password",
    "presenceId",
    "timeZone",
    "tuiData",
    "voiceMailBoxId"
})
public class AlcFrameworkUser {

    @XmlElement(nillable = true)
    protected List<AlcAddOn> addOns;
    @XmlElement(required = true, nillable = true)
    protected AlcCompanyContacts companyContacts;
    @XmlElement(required = true, nillable = true)
    protected String customizableField1;
    @XmlElement(required = true, nillable = true)
    protected String customizableField2;
    @XmlElement(required = true, nillable = true)
    protected String customizableField3;
    @XmlElement(required = true, nillable = true)
    protected String departmentName;
    @XmlElement(required = true, nillable = true)
    protected String dialingRuleName;
    @XmlElement(required = true, nillable = true)
    protected String externalId;
    @XmlElement(required = true, nillable = true)
    protected AlcIdentity identity;
    @XmlElement(required = true, nillable = true)
    protected String language;
    @XmlElement(required = true, nillable = true)
    protected String loginName;
    @XmlElement(required = true, nillable = true)
    protected AlcMyAssistantData myAssistantData;
    @XmlElement(required = true, nillable = true)
    protected AlcMyInstantCommunicatorData myInstantCommunicatorData;
    @XmlElement(required = true, nillable = true)
    protected AlcMyMessagingData myMessagingData;
    @XmlElement(required = true, nillable = true)
    protected AlcMyPhoneData myPhoneData;
    @XmlElement(required = true, nillable = true)
    protected AlcMyTeamworkData myTeamworkData;
    @XmlElement(required = true, nillable = true)
    protected AlcPasswordData password;
    @XmlElement(required = true, nillable = true)
    protected String presenceId;
    @XmlElement(required = true, nillable = true)
    protected String timeZone;
    @XmlElement(required = true, nillable = true)
    protected AlcTuiData tuiData;
    @XmlElement(nillable = true)
    protected List<String> voiceMailBoxId;

    /**
     * Gets the value of the addOns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addOns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddOns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlcAddOn }
     * 
     * 
     */
    public List<AlcAddOn> getAddOns() {
        if (addOns == null) {
            addOns = new ArrayList<AlcAddOn>();
        }
        return this.addOns;
    }

    /**
     * Gets the value of the companyContacts property.
     * 
     * @return
     *     possible object is
     *     {@link AlcCompanyContacts }
     *     
     */
    public AlcCompanyContacts getCompanyContacts() {
        return companyContacts;
    }

    /**
     * Sets the value of the companyContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcCompanyContacts }
     *     
     */
    public void setCompanyContacts(AlcCompanyContacts value) {
        this.companyContacts = value;
    }

    /**
     * Gets the value of the customizableField1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomizableField1() {
        return customizableField1;
    }

    /**
     * Sets the value of the customizableField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomizableField1(String value) {
        this.customizableField1 = value;
    }

    /**
     * Gets the value of the customizableField2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomizableField2() {
        return customizableField2;
    }

    /**
     * Sets the value of the customizableField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomizableField2(String value) {
        this.customizableField2 = value;
    }

    /**
     * Gets the value of the customizableField3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomizableField3() {
        return customizableField3;
    }

    /**
     * Sets the value of the customizableField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomizableField3(String value) {
        this.customizableField3 = value;
    }

    /**
     * Gets the value of the departmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * Sets the value of the departmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentName(String value) {
        this.departmentName = value;
    }

    /**
     * Gets the value of the dialingRuleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialingRuleName() {
        return dialingRuleName;
    }

    /**
     * Sets the value of the dialingRuleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialingRuleName(String value) {
        this.dialingRuleName = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link AlcIdentity }
     *     
     */
    public AlcIdentity getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcIdentity }
     *     
     */
    public void setIdentity(AlcIdentity value) {
        this.identity = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the loginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * Sets the value of the loginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginName(String value) {
        this.loginName = value;
    }

    /**
     * Gets the value of the myAssistantData property.
     * 
     * @return
     *     possible object is
     *     {@link AlcMyAssistantData }
     *     
     */
    public AlcMyAssistantData getMyAssistantData() {
        return myAssistantData;
    }

    /**
     * Sets the value of the myAssistantData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcMyAssistantData }
     *     
     */
    public void setMyAssistantData(AlcMyAssistantData value) {
        this.myAssistantData = value;
    }

    /**
     * Gets the value of the myInstantCommunicatorData property.
     * 
     * @return
     *     possible object is
     *     {@link AlcMyInstantCommunicatorData }
     *     
     */
    public AlcMyInstantCommunicatorData getMyInstantCommunicatorData() {
        return myInstantCommunicatorData;
    }

    /**
     * Sets the value of the myInstantCommunicatorData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcMyInstantCommunicatorData }
     *     
     */
    public void setMyInstantCommunicatorData(AlcMyInstantCommunicatorData value) {
        this.myInstantCommunicatorData = value;
    }

    /**
     * Gets the value of the myMessagingData property.
     * 
     * @return
     *     possible object is
     *     {@link AlcMyMessagingData }
     *     
     */
    public AlcMyMessagingData getMyMessagingData() {
        return myMessagingData;
    }

    /**
     * Sets the value of the myMessagingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcMyMessagingData }
     *     
     */
    public void setMyMessagingData(AlcMyMessagingData value) {
        this.myMessagingData = value;
    }

    /**
     * Gets the value of the myPhoneData property.
     * 
     * @return
     *     possible object is
     *     {@link AlcMyPhoneData }
     *     
     */
    public AlcMyPhoneData getMyPhoneData() {
        return myPhoneData;
    }

    /**
     * Sets the value of the myPhoneData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcMyPhoneData }
     *     
     */
    public void setMyPhoneData(AlcMyPhoneData value) {
        this.myPhoneData = value;
    }

    /**
     * Gets the value of the myTeamworkData property.
     * 
     * @return
     *     possible object is
     *     {@link AlcMyTeamworkData }
     *     
     */
    public AlcMyTeamworkData getMyTeamworkData() {
        return myTeamworkData;
    }

    /**
     * Sets the value of the myTeamworkData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcMyTeamworkData }
     *     
     */
    public void setMyTeamworkData(AlcMyTeamworkData value) {
        this.myTeamworkData = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link AlcPasswordData }
     *     
     */
    public AlcPasswordData getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcPasswordData }
     *     
     */
    public void setPassword(AlcPasswordData value) {
        this.password = value;
    }

    /**
     * Gets the value of the presenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresenceId() {
        return presenceId;
    }

    /**
     * Sets the value of the presenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresenceId(String value) {
        this.presenceId = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the tuiData property.
     * 
     * @return
     *     possible object is
     *     {@link AlcTuiData }
     *     
     */
    public AlcTuiData getTuiData() {
        return tuiData;
    }

    /**
     * Sets the value of the tuiData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcTuiData }
     *     
     */
    public void setTuiData(AlcTuiData value) {
        this.tuiData = value;
    }

    /**
     * Gets the value of the voiceMailBoxId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voiceMailBoxId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoiceMailBoxId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVoiceMailBoxId() {
        if (voiceMailBoxId == null) {
            voiceMailBoxId = new ArrayList<String>();
        }
        return this.voiceMailBoxId;
    }

}
