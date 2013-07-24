
package com.alcatel_lucent.test.soapstub.types.subscriber;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Call by name data of the 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;I xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Subscriber&lt;/I&gt;
 * </pre>
 * .
 * 
 * <p>Java class for AlcCallByNameData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcCallByNameData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="validForCallByName" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="firstNameForCallByName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nameForCallByName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcCallByNameData", propOrder = {
    "validForCallByName",
    "firstNameForCallByName",
    "nameForCallByName"
})
public class AlcCallByNameData {

    protected boolean validForCallByName;
    @XmlElement(required = true, nillable = true)
    protected String firstNameForCallByName;
    @XmlElement(required = true, nillable = true)
    protected String nameForCallByName;

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

}
