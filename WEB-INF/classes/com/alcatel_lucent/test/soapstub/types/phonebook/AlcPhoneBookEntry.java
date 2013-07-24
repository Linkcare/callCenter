
package com.alcatel_lucent.test.soapstub.types.phonebook;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes a phone book entry.
 * 
 * <p>Java class for AlcPhoneBookEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcPhoneBookEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="directoryNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pbxName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nodeNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="subNetworkNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="alias" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="validForCallByName" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nameForCallByName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstNameForCallByName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonebook}AlcPhoneBookEntryType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcPhoneBookEntry", propOrder = {
    "directoryNumber",
    "pbxName",
    "nodeNumber",
    "subNetworkNumber",
    "alias",
    "name",
    "firstName",
    "validForCallByName",
    "nameForCallByName",
    "firstNameForCallByName",
    "type"
})
public class AlcPhoneBookEntry {

    @XmlElement(required = true)
    protected String directoryNumber;
    @XmlElement(required = true, nillable = true)
    protected String pbxName;
    protected int nodeNumber;
    protected int subNetworkNumber;
    protected int alias;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String firstName;
    protected boolean validForCallByName;
    @XmlElement(required = true, nillable = true)
    protected String nameForCallByName;
    @XmlElement(required = true, nillable = true)
    protected String firstNameForCallByName;
    @XmlElement(required = true)
    protected AlcPhoneBookEntryType type;

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
     * Gets the value of the nodeNumber property.
     * 
     */
    public int getNodeNumber() {
        return nodeNumber;
    }

    /**
     * Sets the value of the nodeNumber property.
     * 
     */
    public void setNodeNumber(int value) {
        this.nodeNumber = value;
    }

    /**
     * Gets the value of the subNetworkNumber property.
     * 
     */
    public int getSubNetworkNumber() {
        return subNetworkNumber;
    }

    /**
     * Sets the value of the subNetworkNumber property.
     * 
     */
    public void setSubNetworkNumber(int value) {
        this.subNetworkNumber = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     */
    public int getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     */
    public void setAlias(int value) {
        this.alias = value;
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

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AlcPhoneBookEntryType }
     *     
     */
    public AlcPhoneBookEntryType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcPhoneBookEntryType }
     *     
     */
    public void setType(AlcPhoneBookEntryType value) {
        this.type = value;
    }

}
