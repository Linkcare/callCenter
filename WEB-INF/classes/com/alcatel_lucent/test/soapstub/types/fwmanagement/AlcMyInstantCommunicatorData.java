
package com.alcatel_lucent.test.soapstub.types.fwmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *          Describes the data necessary to use My Instant Communicator OTUC applications.
 *       
 * 
 * <p>Java class for AlcMyInstantCommunicatorData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcMyInstantCommunicatorData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deviceRights" type="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcDeviceRights"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcMyInstantCommunicatorData", propOrder = {
    "deviceRights"
})
public class AlcMyInstantCommunicatorData {

    @XmlElement(required = true, nillable = true)
    protected AlcDeviceRights deviceRights;

    /**
     * Gets the value of the deviceRights property.
     * 
     * @return
     *     possible object is
     *     {@link AlcDeviceRights }
     *     
     */
    public AlcDeviceRights getDeviceRights() {
        return deviceRights;
    }

    /**
     * Sets the value of the deviceRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcDeviceRights }
     *     
     */
    public void setDeviceRights(AlcDeviceRights value) {
        this.deviceRights = value;
    }

}
