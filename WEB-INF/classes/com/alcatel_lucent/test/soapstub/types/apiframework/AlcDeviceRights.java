
package com.alcatel_lucent.test.soapstub.types.apiframework;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcDeviceRights complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcDeviceRights">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationAuthorized" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="extensionAuthorized" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="noeAuthorized" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pdaAuthorized" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="thickAuthorized" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tuiAuthorized" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="webAuthorized" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "applicationAuthorized",
    "extensionAuthorized",
    "noeAuthorized",
    "pdaAuthorized",
    "thickAuthorized",
    "tuiAuthorized",
    "webAuthorized"
})
public class AlcDeviceRights {

    protected boolean applicationAuthorized;
    protected boolean extensionAuthorized;
    protected boolean noeAuthorized;
    protected boolean pdaAuthorized;
    protected boolean thickAuthorized;
    protected boolean tuiAuthorized;
    protected boolean webAuthorized;

    /**
     * Gets the value of the applicationAuthorized property.
     * 
     */
    public boolean isApplicationAuthorized() {
        return applicationAuthorized;
    }

    /**
     * Sets the value of the applicationAuthorized property.
     * 
     */
    public void setApplicationAuthorized(boolean value) {
        this.applicationAuthorized = value;
    }

    /**
     * Gets the value of the extensionAuthorized property.
     * 
     */
    public boolean isExtensionAuthorized() {
        return extensionAuthorized;
    }

    /**
     * Sets the value of the extensionAuthorized property.
     * 
     */
    public void setExtensionAuthorized(boolean value) {
        this.extensionAuthorized = value;
    }

    /**
     * Gets the value of the noeAuthorized property.
     * 
     */
    public boolean isNoeAuthorized() {
        return noeAuthorized;
    }

    /**
     * Sets the value of the noeAuthorized property.
     * 
     */
    public void setNoeAuthorized(boolean value) {
        this.noeAuthorized = value;
    }

    /**
     * Gets the value of the pdaAuthorized property.
     * 
     */
    public boolean isPdaAuthorized() {
        return pdaAuthorized;
    }

    /**
     * Sets the value of the pdaAuthorized property.
     * 
     */
    public void setPdaAuthorized(boolean value) {
        this.pdaAuthorized = value;
    }

    /**
     * Gets the value of the thickAuthorized property.
     * 
     */
    public boolean isThickAuthorized() {
        return thickAuthorized;
    }

    /**
     * Sets the value of the thickAuthorized property.
     * 
     */
    public void setThickAuthorized(boolean value) {
        this.thickAuthorized = value;
    }

    /**
     * Gets the value of the tuiAuthorized property.
     * 
     */
    public boolean isTuiAuthorized() {
        return tuiAuthorized;
    }

    /**
     * Sets the value of the tuiAuthorized property.
     * 
     */
    public void setTuiAuthorized(boolean value) {
        this.tuiAuthorized = value;
    }

    /**
     * Gets the value of the webAuthorized property.
     * 
     */
    public boolean isWebAuthorized() {
        return webAuthorized;
    }

    /**
     * Sets the value of the webAuthorized property.
     * 
     */
    public void setWebAuthorized(boolean value) {
        this.webAuthorized = value;
    }

}
