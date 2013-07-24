
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes a filter used to load a phone book from a PBX (
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;b xmlns:extsub="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/externalsubscriber" xmlns:hgroup="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/huntinggroup" xmlns:phb="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonebook" xmlns:secsub="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/secondarysubscriber" xmlns:sipconf="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/sipconfig" xmlns:sub="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber" xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;code&gt;loadPhoneBook&lt;/code&gt;&lt;/b&gt;
 * </pre>
 *  operation).
 * 
 * <p>Java class for AlcLoadPhoneBookFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcLoadPhoneBookFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="field" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcPhoneBookEntryField"/>
 *         &lt;element name="operator" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcOperator"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filterCommand" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcBooleanOperator"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcLoadPhoneBookFilter", propOrder = {
    "field",
    "operator",
    "value",
    "filterCommand"
})
public class AlcLoadPhoneBookFilter {

    @XmlElement(required = true)
    protected AlcPhoneBookEntryField field;
    @XmlElement(required = true)
    protected AlcOperator operator;
    @XmlElement(required = true)
    protected String value;
    @XmlElement(required = true)
    protected AlcBooleanOperator filterCommand;

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link AlcPhoneBookEntryField }
     *     
     */
    public AlcPhoneBookEntryField getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcPhoneBookEntryField }
     *     
     */
    public void setField(AlcPhoneBookEntryField value) {
        this.field = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link AlcOperator }
     *     
     */
    public AlcOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcOperator }
     *     
     */
    public void setOperator(AlcOperator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the filterCommand property.
     * 
     * @return
     *     possible object is
     *     {@link AlcBooleanOperator }
     *     
     */
    public AlcBooleanOperator getFilterCommand() {
        return filterCommand;
    }

    /**
     * Sets the value of the filterCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcBooleanOperator }
     *     
     */
    public void setFilterCommand(AlcBooleanOperator value) {
        this.filterCommand = value;
    }

}
