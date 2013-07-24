
package com.alcatel_lucent.test.soapstub.types.subscriber;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data of the 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;I xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Subscriber&lt;/I&gt;
 * </pre>
 *  groups.
 * 
 * <p>Java class for AlcGroupsData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcGroupsData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pickupGroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcGroupsData", propOrder = {
    "pickupGroup"
})
public class AlcGroupsData {

    @XmlElement(required = true, nillable = true)
    protected String pickupGroup;

    /**
     * Gets the value of the pickupGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupGroup() {
        return pickupGroup;
    }

    /**
     * Sets the value of the pickupGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupGroup(String value) {
        this.pickupGroup = value;
    }

}
