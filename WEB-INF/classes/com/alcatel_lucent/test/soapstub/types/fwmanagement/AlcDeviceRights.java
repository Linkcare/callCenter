
package com.alcatel_lucent.test.soapstub.types.fwmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 *             Describes the rights to use an OTUC application device by device.
 *             Device rights can be defined in MyPhone, MyMessaging and MyAssistant data.
 *             You have to check for the number of available licenses before giving new rights
 *             to a user (thanks to the &lt;code&gt;getSystemInfo&lt;/code&gt; command) :
 *             &lt;ul&gt;&lt;li&gt;Adding a device right to a user when another device is already authorized for the
 *                   same application does not change the licenses counters returned by the
 *                   &lt;code&gt;getSystemInfo&lt;/code&gt; command.&lt;/li&gt;&lt;li&gt;Adding a device right to a user when this user has not been authorized to use any
 *                   device of the same application decrements the license counter returned by the
 *                   &lt;code&gt;getSystemInfo&lt;/code&gt; command for this application.&lt;/li&gt;&lt;li&gt;Removing all device rights of a user increments the license counter returned by
 *                   the &lt;code&gt;getSystemInfo&lt;/code&gt; command for this application.&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>Java class for AlcDeviceRights complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcDeviceRights">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extensionDeviceAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="noeDeviceAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mobileDeviceAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="thickDeviceAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tuiDeviceAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="webDeviceAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcDeviceRights", propOrder = {
    "extensionDeviceAllowed",
    "noeDeviceAllowed",
    "mobileDeviceAllowed",
    "thickDeviceAllowed",
    "tuiDeviceAllowed",
    "webDeviceAllowed"
})
public class AlcDeviceRights {

    protected boolean extensionDeviceAllowed;
    protected boolean noeDeviceAllowed;
    protected boolean mobileDeviceAllowed;
    protected boolean thickDeviceAllowed;
    protected boolean tuiDeviceAllowed;
    protected boolean webDeviceAllowed;

    /**
     * Gets the value of the extensionDeviceAllowed property.
     * 
     */
    public boolean isExtensionDeviceAllowed() {
        return extensionDeviceAllowed;
    }

    /**
     * Sets the value of the extensionDeviceAllowed property.
     * 
     */
    public void setExtensionDeviceAllowed(boolean value) {
        this.extensionDeviceAllowed = value;
    }

    /**
     * Gets the value of the noeDeviceAllowed property.
     * 
     */
    public boolean isNoeDeviceAllowed() {
        return noeDeviceAllowed;
    }

    /**
     * Sets the value of the noeDeviceAllowed property.
     * 
     */
    public void setNoeDeviceAllowed(boolean value) {
        this.noeDeviceAllowed = value;
    }

    /**
     * Gets the value of the mobileDeviceAllowed property.
     * 
     */
    public boolean isMobileDeviceAllowed() {
        return mobileDeviceAllowed;
    }

    /**
     * Sets the value of the mobileDeviceAllowed property.
     * 
     */
    public void setMobileDeviceAllowed(boolean value) {
        this.mobileDeviceAllowed = value;
    }

    /**
     * Gets the value of the thickDeviceAllowed property.
     * 
     */
    public boolean isThickDeviceAllowed() {
        return thickDeviceAllowed;
    }

    /**
     * Sets the value of the thickDeviceAllowed property.
     * 
     */
    public void setThickDeviceAllowed(boolean value) {
        this.thickDeviceAllowed = value;
    }

    /**
     * Gets the value of the tuiDeviceAllowed property.
     * 
     */
    public boolean isTuiDeviceAllowed() {
        return tuiDeviceAllowed;
    }

    /**
     * Sets the value of the tuiDeviceAllowed property.
     * 
     */
    public void setTuiDeviceAllowed(boolean value) {
        this.tuiDeviceAllowed = value;
    }

    /**
     * Gets the value of the webDeviceAllowed property.
     * 
     */
    public boolean isWebDeviceAllowed() {
        return webDeviceAllowed;
    }

    /**
     * Sets the value of the webDeviceAllowed property.
     * 
     */
    public void setWebDeviceAllowed(boolean value) {
        this.webDeviceAllowed = value;
    }

}
