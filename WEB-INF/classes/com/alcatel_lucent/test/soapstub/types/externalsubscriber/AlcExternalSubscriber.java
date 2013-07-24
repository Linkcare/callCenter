
package com.alcatel_lucent.test.soapstub.types.externalsubscriber;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Describes an 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/externalsubscriber" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;External Subscriber&lt;/i&gt;
 * </pre>
 * .
 *         
 * 
 * <p>Java class for AlcExternalSubscriber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcExternalSubscriber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="speedDialingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="externalCallNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extendedName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extendedFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="validForCallByName" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nameForCallByName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstNameForCallByName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcExternalSubscriber", propOrder = {
    "speedDialingNumber",
    "externalCallNumber",
    "name",
    "firstName",
    "extendedName",
    "extendedFirstName",
    "validForCallByName",
    "nameForCallByName",
    "firstNameForCallByName"
})
public class AlcExternalSubscriber {

    @XmlElement(required = true)
    protected String speedDialingNumber;
    @XmlElement(required = true)
    protected String externalCallNumber;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String firstName;
    @XmlElement(required = true, nillable = true)
    protected String extendedName;
    @XmlElement(required = true, nillable = true)
    protected String extendedFirstName;
    protected boolean validForCallByName;
    @XmlElement(required = true, nillable = true)
    protected String nameForCallByName;
    @XmlElement(required = true, nillable = true)
    protected String firstNameForCallByName;

    /**
     * Gets the value of the speedDialingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeedDialingNumber() {
        return speedDialingNumber;
    }

    /**
     * Sets the value of the speedDialingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeedDialingNumber(String value) {
        this.speedDialingNumber = value;
    }

    /**
     * Gets the value of the externalCallNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalCallNumber() {
        return externalCallNumber;
    }

    /**
     * Sets the value of the externalCallNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalCallNumber(String value) {
        this.externalCallNumber = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the extendedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedName() {
        return extendedName;
    }

    /**
     * Sets the value of the extendedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedName(String value) {
        this.extendedName = value;
    }

    /**
     * Gets the value of the extendedFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedFirstName() {
        return extendedFirstName;
    }

    /**
     * Sets the value of the extendedFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedFirstName(String value) {
        this.extendedFirstName = value;
    }

    /**
     * Gets the value of the validForCallByName property.
     * 
     */
    public boolean isValidForCallByName() {
        return validForCallByName;
    }

    /**
     * Sets the value of the validForCallByName property.
     * 
     */
    public void setValidForCallByName(boolean value) {
        this.validForCallByName = value;
    }

    /**
     * Gets the value of the nameForCallByName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameForCallByName() {
        return nameForCallByName;
    }

    /**
     * Sets the value of the nameForCallByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameForCallByName(String value) {
        this.nameForCallByName = value;
    }

    /**
     * Gets the value of the firstNameForCallByName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstNameForCallByName() {
        return firstNameForCallByName;
    }

    /**
     * Sets the value of the firstNameForCallByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstNameForCallByName(String value) {
        this.firstNameForCallByName = value;
    }

}
