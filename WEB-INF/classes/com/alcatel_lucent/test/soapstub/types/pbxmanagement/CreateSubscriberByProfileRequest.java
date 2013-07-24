
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fwSessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pbxName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="directoryNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="phoneSetProfileDirectoryNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="keyProfileDirectoryNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fwSessionId",
    "pbxName",
    "directoryNumber",
    "name",
    "firstName",
    "stationType",
    "entity",
    "phoneSetProfileDirectoryNumber",
    "keyProfileDirectoryNumber"
})
@XmlRootElement(name = "createSubscriberByProfileRequest")
public class CreateSubscriberByProfileRequest {

    @XmlElement(required = true, nillable = true)
    protected String fwSessionId;
    @XmlElement(required = true, nillable = true)
    protected String pbxName;
    @XmlElement(required = true)
    protected String directoryNumber;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String firstName;
    @XmlElement(required = true, nillable = true)
    protected String stationType;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer entity;
    @XmlElement(required = true)
    protected String phoneSetProfileDirectoryNumber;
    @XmlElement(required = true, nillable = true)
    protected String keyProfileDirectoryNumber;

    /**
     * Gets the value of the fwSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFwSessionId() {
        return fwSessionId;
    }

    /**
     * Sets the value of the fwSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFwSessionId(String value) {
        this.fwSessionId = value;
    }

    /**
     * Gets the value of the pbxName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPbxName() {
        return pbxName;
    }

    /**
     * Sets the value of the pbxName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPbxName(String value) {
        this.pbxName = value;
    }

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
     * Gets the value of the stationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationType() {
        return stationType;
    }

    /**
     * Sets the value of the stationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationType(String value) {
        this.stationType = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntity(Integer value) {
        this.entity = value;
    }

    /**
     * Gets the value of the phoneSetProfileDirectoryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneSetProfileDirectoryNumber() {
        return phoneSetProfileDirectoryNumber;
    }

    /**
     * Sets the value of the phoneSetProfileDirectoryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneSetProfileDirectoryNumber(String value) {
        this.phoneSetProfileDirectoryNumber = value;
    }

    /**
     * Gets the value of the keyProfileDirectoryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyProfileDirectoryNumber() {
        return keyProfileDirectoryNumber;
    }

    /**
     * Sets the value of the keyProfileDirectoryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyProfileDirectoryNumber(String value) {
        this.keyProfileDirectoryNumber = value;
    }

}
