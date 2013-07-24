
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcLoadExternalSubscribersFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcLoadExternalSubscribersFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="field" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcExternalSubscriberField"/>
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
@XmlType(name = "AlcLoadExternalSubscribersFilter", propOrder = {
    "field",
    "operator",
    "value",
    "filterCommand"
})
public class AlcLoadExternalSubscribersFilter {

    @XmlElement(required = true)
    protected AlcExternalSubscriberField field;
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
     *     {@link AlcExternalSubscriberField }
     *     
     */
    public AlcExternalSubscriberField getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcExternalSubscriberField }
     *     
     */
    public void setField(AlcExternalSubscriberField value) {
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
