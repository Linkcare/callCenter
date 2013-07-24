
package com.alcatel_lucent.test.soapstub.types.fwmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *     &lt;extension base="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcResult">
 *       &lt;sequence>
 *         &lt;element name="availableMyAssistantApiLicensesNb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="availableMyAssistantLicensesNb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="availableMyInstantCommunicatorLicensesNb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="availableMyMessagingApiLicensesNb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="availableMyMessagingLicensesNb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="availableMyPhoneApiLicensesNb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="availableMyPhoneLicensesNb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="availableMyPhoneRestrictedApiLicensesNb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="availableMyTeamworkApiLicensesNb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="availableMyTeamworkLicensesNb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tuiAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "availableMyAssistantApiLicensesNb",
    "availableMyAssistantLicensesNb",
    "availableMyInstantCommunicatorLicensesNb",
    "availableMyMessagingApiLicensesNb",
    "availableMyMessagingLicensesNb",
    "availableMyPhoneApiLicensesNb",
    "availableMyPhoneLicensesNb",
    "availableMyPhoneRestrictedApiLicensesNb",
    "availableMyTeamworkApiLicensesNb",
    "availableMyTeamworkLicensesNb",
    "tuiAvailable"
})
@XmlRootElement(name = "getSystemInfoResponse")
public class GetSystemInfoResponse
    extends AlcResult
{

    protected int availableMyAssistantApiLicensesNb;
    protected int availableMyAssistantLicensesNb;
    protected int availableMyInstantCommunicatorLicensesNb;
    protected int availableMyMessagingApiLicensesNb;
    protected int availableMyMessagingLicensesNb;
    protected int availableMyPhoneApiLicensesNb;
    protected int availableMyPhoneLicensesNb;
    protected int availableMyPhoneRestrictedApiLicensesNb;
    protected int availableMyTeamworkApiLicensesNb;
    protected int availableMyTeamworkLicensesNb;
    protected boolean tuiAvailable;

    /**
     * Gets the value of the availableMyAssistantApiLicensesNb property.
     * 
     */
    public int getAvailableMyAssistantApiLicensesNb() {
        return availableMyAssistantApiLicensesNb;
    }

    /**
     * Sets the value of the availableMyAssistantApiLicensesNb property.
     * 
     */
    public void setAvailableMyAssistantApiLicensesNb(int value) {
        this.availableMyAssistantApiLicensesNb = value;
    }

    /**
     * Gets the value of the availableMyAssistantLicensesNb property.
     * 
     */
    public int getAvailableMyAssistantLicensesNb() {
        return availableMyAssistantLicensesNb;
    }

    /**
     * Sets the value of the availableMyAssistantLicensesNb property.
     * 
     */
    public void setAvailableMyAssistantLicensesNb(int value) {
        this.availableMyAssistantLicensesNb = value;
    }

    /**
     * Gets the value of the availableMyInstantCommunicatorLicensesNb property.
     * 
     */
    public int getAvailableMyInstantCommunicatorLicensesNb() {
        return availableMyInstantCommunicatorLicensesNb;
    }

    /**
     * Sets the value of the availableMyInstantCommunicatorLicensesNb property.
     * 
     */
    public void setAvailableMyInstantCommunicatorLicensesNb(int value) {
        this.availableMyInstantCommunicatorLicensesNb = value;
    }

    /**
     * Gets the value of the availableMyMessagingApiLicensesNb property.
     * 
     */
    public int getAvailableMyMessagingApiLicensesNb() {
        return availableMyMessagingApiLicensesNb;
    }

    /**
     * Sets the value of the availableMyMessagingApiLicensesNb property.
     * 
     */
    public void setAvailableMyMessagingApiLicensesNb(int value) {
        this.availableMyMessagingApiLicensesNb = value;
    }

    /**
     * Gets the value of the availableMyMessagingLicensesNb property.
     * 
     */
    public int getAvailableMyMessagingLicensesNb() {
        return availableMyMessagingLicensesNb;
    }

    /**
     * Sets the value of the availableMyMessagingLicensesNb property.
     * 
     */
    public void setAvailableMyMessagingLicensesNb(int value) {
        this.availableMyMessagingLicensesNb = value;
    }

    /**
     * Gets the value of the availableMyPhoneApiLicensesNb property.
     * 
     */
    public int getAvailableMyPhoneApiLicensesNb() {
        return availableMyPhoneApiLicensesNb;
    }

    /**
     * Sets the value of the availableMyPhoneApiLicensesNb property.
     * 
     */
    public void setAvailableMyPhoneApiLicensesNb(int value) {
        this.availableMyPhoneApiLicensesNb = value;
    }

    /**
     * Gets the value of the availableMyPhoneLicensesNb property.
     * 
     */
    public int getAvailableMyPhoneLicensesNb() {
        return availableMyPhoneLicensesNb;
    }

    /**
     * Sets the value of the availableMyPhoneLicensesNb property.
     * 
     */
    public void setAvailableMyPhoneLicensesNb(int value) {
        this.availableMyPhoneLicensesNb = value;
    }

    /**
     * Gets the value of the availableMyPhoneRestrictedApiLicensesNb property.
     * 
     */
    public int getAvailableMyPhoneRestrictedApiLicensesNb() {
        return availableMyPhoneRestrictedApiLicensesNb;
    }

    /**
     * Sets the value of the availableMyPhoneRestrictedApiLicensesNb property.
     * 
     */
    public void setAvailableMyPhoneRestrictedApiLicensesNb(int value) {
        this.availableMyPhoneRestrictedApiLicensesNb = value;
    }

    /**
     * Gets the value of the availableMyTeamworkApiLicensesNb property.
     * 
     */
    public int getAvailableMyTeamworkApiLicensesNb() {
        return availableMyTeamworkApiLicensesNb;
    }

    /**
     * Sets the value of the availableMyTeamworkApiLicensesNb property.
     * 
     */
    public void setAvailableMyTeamworkApiLicensesNb(int value) {
        this.availableMyTeamworkApiLicensesNb = value;
    }

    /**
     * Gets the value of the availableMyTeamworkLicensesNb property.
     * 
     */
    public int getAvailableMyTeamworkLicensesNb() {
        return availableMyTeamworkLicensesNb;
    }

    /**
     * Sets the value of the availableMyTeamworkLicensesNb property.
     * 
     */
    public void setAvailableMyTeamworkLicensesNb(int value) {
        this.availableMyTeamworkLicensesNb = value;
    }

    /**
     * Gets the value of the tuiAvailable property.
     * 
     */
    public boolean isTuiAvailable() {
        return tuiAvailable;
    }

    /**
     * Sets the value of the tuiAvailable property.
     * 
     */
    public void setTuiAvailable(boolean value) {
        this.tuiAvailable = value;
    }

}
