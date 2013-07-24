
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Describes a cost center. All cost centers can be retrieved thanks to the
 *             
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;b xmlns:extsub="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/externalsubscriber" xmlns:hgroup="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/huntinggroup" xmlns:phb="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonebook" xmlns:secsub="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/secondarysubscriber" xmlns:sipconf="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/sipconfig" xmlns:sub="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber" xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;code&gt;getAllCostCenters&lt;/code&gt;&lt;/b&gt;
 * </pre>
 *  operation.
 *         
 * 
 * <p>Java class for AlcCostCenter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcCostCenter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="costCenterNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcCostCenter", propOrder = {
    "costCenterNumber",
    "name"
})
public class AlcCostCenter {

    protected int costCenterNumber;
    @XmlElement(required = true)
    protected String name;

    /**
     * Gets the value of the costCenterNumber property.
     * 
     */
    public int getCostCenterNumber() {
        return costCenterNumber;
    }

    /**
     * Sets the value of the costCenterNumber property.
     * 
     */
    public void setCostCenterNumber(int value) {
        this.costCenterNumber = value;
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

}
