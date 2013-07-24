
package com.alcatel_lucent.test.soapstub.types.subscriber;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identity of a 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;I xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Subscriber&lt;/I&gt;
 * </pre>
 * .
 * 
 * <p>Java class for AlcSubscriberIdentity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcSubscriberIdentity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extendedName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extendedFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="languageId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcSubscriberIdentity", propOrder = {
    "name",
    "firstName",
    "extendedName",
    "extendedFirstName",
    "languageId"
})
public class AlcSubscriberIdentity {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String firstName;
    @XmlElement(required = true, nillable = true)
    protected String extendedName;
    @XmlElement(required = true, nillable = true)
    protected String extendedFirstName;
    protected int languageId;

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
     * Gets the value of the languageId property.
     * 
     */
    public int getLanguageId() {
        return languageId;
    }

    /**
     * Sets the value of the languageId property.
     * 
     */
    public void setLanguageId(int value) {
        this.languageId = value;
    }

}
