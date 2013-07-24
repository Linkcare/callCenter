
package com.alcatel_lucent.test.soapstub.types.phone;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AlcCallLogItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcCallLogItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acknowledged" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="answeredCall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cause" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony}AlcCallCause"/>
 *         &lt;element name="corrFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="corrName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="corrNumber" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony}AlcTypedNumber"/>
 *         &lt;element name="corrCanonicalNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateOfBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dateOfConvers" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dateOfEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dirNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="externalCall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="incomingCall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="initialNumber" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony}AlcTypedNumber"/>
 *         &lt;element name="itemId" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony}AlcItemId"/>
 *         &lt;element name="newDestNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="redirectedCall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcCallLogItem", propOrder = {
    "acknowledged",
    "answeredCall",
    "cause",
    "corrFirstName",
    "corrName",
    "corrNumber",
    "corrCanonicalNumber",
    "dateOfBegin",
    "dateOfConvers",
    "dateOfEnd",
    "dirNumber",
    "externalCall",
    "incomingCall",
    "initialNumber",
    "itemId",
    "newDestNumber",
    "redirectedCall"
})
public class AlcCallLogItem {

    protected boolean acknowledged;
    protected boolean answeredCall;
    @XmlElement(required = true, nillable = true)
    protected AlcCallCause cause;
    @XmlElement(required = true, nillable = true)
    protected String corrFirstName;
    @XmlElement(required = true, nillable = true)
    protected String corrName;
    @XmlElement(required = true, nillable = true)
    protected AlcTypedNumber corrNumber;
    @XmlElement(required = true, nillable = true)
    protected String corrCanonicalNumber;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBegin;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfConvers;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfEnd;
    @XmlElement(required = true, nillable = true)
    protected String dirNumber;
    protected boolean externalCall;
    protected boolean incomingCall;
    @XmlElement(required = true, nillable = true)
    protected AlcTypedNumber initialNumber;
    @XmlElement(required = true)
    protected AlcItemId itemId;
    @XmlElement(required = true, nillable = true)
    protected String newDestNumber;
    protected boolean redirectedCall;

    /**
     * Gets the value of the acknowledged property.
     * 
     */
    public boolean isAcknowledged() {
        return acknowledged;
    }

    /**
     * Sets the value of the acknowledged property.
     * 
     */
    public void setAcknowledged(boolean value) {
        this.acknowledged = value;
    }

    /**
     * Gets the value of the answeredCall property.
     * 
     */
    public boolean isAnsweredCall() {
        return answeredCall;
    }

    /**
     * Sets the value of the answeredCall property.
     * 
     */
    public void setAnsweredCall(boolean value) {
        this.answeredCall = value;
    }

    /**
     * Gets the value of the cause property.
     * 
     * @return
     *     possible object is
     *     {@link AlcCallCause }
     *     
     */
    public AlcCallCause getCause() {
        return cause;
    }

    /**
     * Sets the value of the cause property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcCallCause }
     *     
     */
    public void setCause(AlcCallCause value) {
        this.cause = value;
    }

    /**
     * Gets the value of the corrFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrFirstName() {
        return corrFirstName;
    }

    /**
     * Sets the value of the corrFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrFirstName(String value) {
        this.corrFirstName = value;
    }

    /**
     * Gets the value of the corrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrName() {
        return corrName;
    }

    /**
     * Sets the value of the corrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrName(String value) {
        this.corrName = value;
    }

    /**
     * Gets the value of the corrNumber property.
     * 
     * @return
     *     possible object is
     *     {@link AlcTypedNumber }
     *     
     */
    public AlcTypedNumber getCorrNumber() {
        return corrNumber;
    }

    /**
     * Sets the value of the corrNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcTypedNumber }
     *     
     */
    public void setCorrNumber(AlcTypedNumber value) {
        this.corrNumber = value;
    }

    /**
     * Gets the value of the corrCanonicalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrCanonicalNumber() {
        return corrCanonicalNumber;
    }

    /**
     * Sets the value of the corrCanonicalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrCanonicalNumber(String value) {
        this.corrCanonicalNumber = value;
    }

    /**
     * Gets the value of the dateOfBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBegin() {
        return dateOfBegin;
    }

    /**
     * Sets the value of the dateOfBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBegin(XMLGregorianCalendar value) {
        this.dateOfBegin = value;
    }

    /**
     * Gets the value of the dateOfConvers property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfConvers() {
        return dateOfConvers;
    }

    /**
     * Sets the value of the dateOfConvers property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfConvers(XMLGregorianCalendar value) {
        this.dateOfConvers = value;
    }

    /**
     * Gets the value of the dateOfEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfEnd() {
        return dateOfEnd;
    }

    /**
     * Sets the value of the dateOfEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfEnd(XMLGregorianCalendar value) {
        this.dateOfEnd = value;
    }

    /**
     * Gets the value of the dirNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirNumber() {
        return dirNumber;
    }

    /**
     * Sets the value of the dirNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirNumber(String value) {
        this.dirNumber = value;
    }

    /**
     * Gets the value of the externalCall property.
     * 
     */
    public boolean isExternalCall() {
        return externalCall;
    }

    /**
     * Sets the value of the externalCall property.
     * 
     */
    public void setExternalCall(boolean value) {
        this.externalCall = value;
    }

    /**
     * Gets the value of the incomingCall property.
     * 
     */
    public boolean isIncomingCall() {
        return incomingCall;
    }

    /**
     * Sets the value of the incomingCall property.
     * 
     */
    public void setIncomingCall(boolean value) {
        this.incomingCall = value;
    }

    /**
     * Gets the value of the initialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link AlcTypedNumber }
     *     
     */
    public AlcTypedNumber getInitialNumber() {
        return initialNumber;
    }

    /**
     * Sets the value of the initialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcTypedNumber }
     *     
     */
    public void setInitialNumber(AlcTypedNumber value) {
        this.initialNumber = value;
    }

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link AlcItemId }
     *     
     */
    public AlcItemId getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcItemId }
     *     
     */
    public void setItemId(AlcItemId value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the newDestNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewDestNumber() {
        return newDestNumber;
    }

    /**
     * Sets the value of the newDestNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewDestNumber(String value) {
        this.newDestNumber = value;
    }

    /**
     * Gets the value of the redirectedCall property.
     * 
     */
    public boolean isRedirectedCall() {
        return redirectedCall;
    }

    /**
     * Sets the value of the redirectedCall property.
     * 
     */
    public void setRedirectedCall(boolean value) {
        this.redirectedCall = value;
    }

}
