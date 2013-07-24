
package com.alcatel_lucent.test.soapstub.types.apiframework;

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
 *         &lt;element name="application" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema}AlcApplicationType"/>
 *         &lt;element name="device" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema}AlcDeviceType"/>
 *         &lt;element name="fwSessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "application",
    "device",
    "fwSessionId"
})
@XmlRootElement(name = "openFrameworkSessionRequest")
public class OpenFrameworkSessionRequest {

    @XmlElement(required = true, nillable = true)
    protected AlcApplicationType application;
    @XmlElement(required = true, nillable = true)
    protected AlcDeviceType device;
    @XmlElement(required = true, nillable = true)
    protected String fwSessionId;

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link AlcApplicationType }
     *     
     */
    public AlcApplicationType getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcApplicationType }
     *     
     */
    public void setApplication(AlcApplicationType value) {
        this.application = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link AlcDeviceType }
     *     
     */
    public AlcDeviceType getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcDeviceType }
     *     
     */
    public void setDevice(AlcDeviceType value) {
        this.device = value;
    }

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

}
