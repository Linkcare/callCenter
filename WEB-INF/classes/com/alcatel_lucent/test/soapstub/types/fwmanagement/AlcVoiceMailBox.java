
package com.alcatel_lucent.test.soapstub.types.fwmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *          Describes a voice mail box.
 *       
 * 
 * <p>Java class for AlcVoiceMailBox complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcVoiceMailBox">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcVoiceMailBoxType"/>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imapLogin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imapPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="voiceMailSystemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="voiceMailProfileId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="greeting" type="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcVoiceMailBoxGreetings"/>
 *         &lt;element name="faxNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mode24Hour" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="addressingByName" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="automaticReading" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deleteConfirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="assistantMenu" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="answerOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcVoiceMailBox", propOrder = {
    "id",
    "displayName",
    "type",
    "login",
    "password",
    "imapLogin",
    "imapPassword",
    "voiceMailSystemId",
    "voiceMailProfileId",
    "greeting",
    "faxNumber",
    "mode24Hour",
    "addressingByName",
    "automaticReading",
    "deleteConfirm",
    "assistantMenu",
    "answerOnly"
})
public class AlcVoiceMailBox {

    @XmlElement(required = true, nillable = true)
    protected String id;
    @XmlElement(required = true, nillable = true)
    protected String displayName;
    @XmlElement(required = true, nillable = true)
    protected AlcVoiceMailBoxType type;
    @XmlElement(required = true, nillable = true)
    protected String login;
    @XmlElement(required = true, nillable = true)
    protected String password;
    @XmlElement(required = true, nillable = true)
    protected String imapLogin;
    @XmlElement(required = true, nillable = true)
    protected String imapPassword;
    @XmlElement(required = true, nillable = true)
    protected String voiceMailSystemId;
    @XmlElement(required = true, nillable = true)
    protected String voiceMailProfileId;
    @XmlElement(required = true, nillable = true)
    protected AlcVoiceMailBoxGreetings greeting;
    @XmlElement(required = true, nillable = true)
    protected String faxNumber;
    protected boolean mode24Hour;
    protected boolean addressingByName;
    protected boolean automaticReading;
    protected boolean deleteConfirm;
    protected boolean assistantMenu;
    protected boolean answerOnly;

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
     *     {@link AlcVoiceMailBoxType }
     *     
     */
    public AlcVoiceMailBoxType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcVoiceMailBoxType }
     *     
     */
    public void setType(AlcVoiceMailBoxType value) {
        this.type = value;
    }

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the imapLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImapLogin() {
        return imapLogin;
    }

    /**
     * Sets the value of the imapLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImapLogin(String value) {
        this.imapLogin = value;
    }

    /**
     * Gets the value of the imapPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImapPassword() {
        return imapPassword;
    }

    /**
     * Sets the value of the imapPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImapPassword(String value) {
        this.imapPassword = value;
    }

    /**
     * Gets the value of the voiceMailSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoiceMailSystemId() {
        return voiceMailSystemId;
    }

    /**
     * Sets the value of the voiceMailSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoiceMailSystemId(String value) {
        this.voiceMailSystemId = value;
    }

    /**
     * Gets the value of the voiceMailProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoiceMailProfileId() {
        return voiceMailProfileId;
    }

    /**
     * Sets the value of the voiceMailProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoiceMailProfileId(String value) {
        this.voiceMailProfileId = value;
    }

    /**
     * Gets the value of the greeting property.
     * 
     * @return
     *     possible object is
     *     {@link AlcVoiceMailBoxGreetings }
     *     
     */
    public AlcVoiceMailBoxGreetings getGreeting() {
        return greeting;
    }

    /**
     * Sets the value of the greeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcVoiceMailBoxGreetings }
     *     
     */
    public void setGreeting(AlcVoiceMailBoxGreetings value) {
        this.greeting = value;
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumber(String value) {
        this.faxNumber = value;
    }

    /**
     * Gets the value of the mode24Hour property.
     * 
     */
    public boolean isMode24Hour() {
        return mode24Hour;
    }

    /**
     * Sets the value of the mode24Hour property.
     * 
     */
    public void setMode24Hour(boolean value) {
        this.mode24Hour = value;
    }

    /**
     * Gets the value of the addressingByName property.
     * 
     */
    public boolean isAddressingByName() {
        return addressingByName;
    }

    /**
     * Sets the value of the addressingByName property.
     * 
     */
    public void setAddressingByName(boolean value) {
        this.addressingByName = value;
    }

    /**
     * Gets the value of the automaticReading property.
     * 
     */
    public boolean isAutomaticReading() {
        return automaticReading;
    }

    /**
     * Sets the value of the automaticReading property.
     * 
     */
    public void setAutomaticReading(boolean value) {
        this.automaticReading = value;
    }

    /**
     * Gets the value of the deleteConfirm property.
     * 
     */
    public boolean isDeleteConfirm() {
        return deleteConfirm;
    }

    /**
     * Sets the value of the deleteConfirm property.
     * 
     */
    public void setDeleteConfirm(boolean value) {
        this.deleteConfirm = value;
    }

    /**
     * Gets the value of the assistantMenu property.
     * 
     */
    public boolean isAssistantMenu() {
        return assistantMenu;
    }

    /**
     * Sets the value of the assistantMenu property.
     * 
     */
    public void setAssistantMenu(boolean value) {
        this.assistantMenu = value;
    }

    /**
     * Gets the value of the answerOnly property.
     * 
     */
    public boolean isAnswerOnly() {
        return answerOnly;
    }

    /**
     * Sets the value of the answerOnly property.
     * 
     */
    public void setAnswerOnly(boolean value) {
        this.answerOnly = value;
    }

}
