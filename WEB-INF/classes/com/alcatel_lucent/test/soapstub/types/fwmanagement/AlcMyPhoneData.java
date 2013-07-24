
package com.alcatel_lucent.test.soapstub.types.fwmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *          Describes the data necessary to use MyPhone OTUC applications or 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Web Services&lt;/i&gt;
 * </pre>
 * .
 *       
 * 
 * <p>Java class for AlcMyPhoneData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcMyPhoneData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deviceRights" type="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcDeviceRights"/>
 *         &lt;element name="restrictedWebServicesAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="webServicesAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcMyPhoneData", propOrder = {
    "deviceRights",
    "restrictedWebServicesAllowed",
    "webServicesAllowed"
})
public class AlcMyPhoneData {

    @XmlElement(required = true, nillable = true)
    protected AlcDeviceRights deviceRights;
    protected boolean restrictedWebServicesAllowed;
    protected boolean webServicesAllowed;

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

    /**
     * Gets the value of the restrictedWebServicesAllowed property.
     * 
     */
    public boolean isRestrictedWebServicesAllowed() {
        return restrictedWebServicesAllowed;
    }

    /**
     * Sets the value of the restrictedWebServicesAllowed property.
     * 
     */
    public void setRestrictedWebServicesAllowed(boolean value) {
        this.restrictedWebServicesAllowed = value;
    }

    /**
     * Gets the value of the webServicesAllowed property.
     * 
     */
    public boolean isWebServicesAllowed() {
        return webServicesAllowed;
    }

    /**
     * Sets the value of the webServicesAllowed property.
     * 
     */
    public void setWebServicesAllowed(boolean value) {
        this.webServicesAllowed = value;
    }

}
