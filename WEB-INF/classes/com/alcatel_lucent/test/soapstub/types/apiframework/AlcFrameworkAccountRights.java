
package com.alcatel_lucent.test.soapstub.types.apiframework;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcFrameworkAccountRights complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcFrameworkAccountRights">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="homePageDeviceRights" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema}AlcDeviceRights"/>
 *         &lt;element name="myAssistantApiAuthorized" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="myAssistantDeviceRights" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema}AlcDeviceRights"/>
 *         &lt;element name="myManagementApiAuthorized" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="myMessagingApiAuthorized" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="myMessagingDeviceRights" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema}AlcDeviceRights"/>
 *         &lt;element name="myPhoneApiAuthorized" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="myPhoneDeviceRights" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema}AlcDeviceRights"/>
 *         &lt;element name="myTeamworkDeviceRights" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema}AlcDeviceRights"/>
 *         &lt;element name="myTeamworkApiAuthorized" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="myInstantCommunicatorDeviceRights" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema}AlcDeviceRights"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcFrameworkAccountRights", propOrder = {
    "homePageDeviceRights",
    "myAssistantApiAuthorized",
    "myAssistantDeviceRights",
    "myManagementApiAuthorized",
    "myMessagingApiAuthorized",
    "myMessagingDeviceRights",
    "myPhoneApiAuthorized",
    "myPhoneDeviceRights",
    "myTeamworkDeviceRights",
    "myTeamworkApiAuthorized",
    "myInstantCommunicatorDeviceRights"
})
public class AlcFrameworkAccountRights {

    @XmlElement(required = true, nillable = true)
    protected AlcDeviceRights homePageDeviceRights;
    protected boolean myAssistantApiAuthorized;
    @XmlElement(required = true, nillable = true)
    protected AlcDeviceRights myAssistantDeviceRights;
    protected boolean myManagementApiAuthorized;
    protected boolean myMessagingApiAuthorized;
    @XmlElement(required = true, nillable = true)
    protected AlcDeviceRights myMessagingDeviceRights;
    protected boolean myPhoneApiAuthorized;
    @XmlElement(required = true, nillable = true)
    protected AlcDeviceRights myPhoneDeviceRights;
    @XmlElement(required = true, nillable = true)
    protected AlcDeviceRights myTeamworkDeviceRights;
    protected boolean myTeamworkApiAuthorized;
    @XmlElement(required = true, nillable = true)
    protected AlcDeviceRights myInstantCommunicatorDeviceRights;

    /**
     * Gets the value of the homePageDeviceRights property.
     * 
     * @return
     *     possible object is
     *     {@link AlcDeviceRights }
     *     
     */
    public AlcDeviceRights getHomePageDeviceRights() {
        return homePageDeviceRights;
    }

    /**
     * Sets the value of the homePageDeviceRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcDeviceRights }
     *     
     */
    public void setHomePageDeviceRights(AlcDeviceRights value) {
        this.homePageDeviceRights = value;
    }

    /**
     * Gets the value of the myAssistantApiAuthorized property.
     * 
     */
    public boolean isMyAssistantApiAuthorized() {
        return myAssistantApiAuthorized;
    }

    /**
     * Sets the value of the myAssistantApiAuthorized property.
     * 
     */
    public void setMyAssistantApiAuthorized(boolean value) {
        this.myAssistantApiAuthorized = value;
    }

    /**
     * Gets the value of the myAssistantDeviceRights property.
     * 
     * @return
     *     possible object is
     *     {@link AlcDeviceRights }
     *     
     */
    public AlcDeviceRights getMyAssistantDeviceRights() {
        return myAssistantDeviceRights;
    }

    /**
     * Sets the value of the myAssistantDeviceRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcDeviceRights }
     *     
     */
    public void setMyAssistantDeviceRights(AlcDeviceRights value) {
        this.myAssistantDeviceRights = value;
    }

    /**
     * Gets the value of the myManagementApiAuthorized property.
     * 
     */
    public boolean isMyManagementApiAuthorized() {
        return myManagementApiAuthorized;
    }

    /**
     * Sets the value of the myManagementApiAuthorized property.
     * 
     */
    public void setMyManagementApiAuthorized(boolean value) {
        this.myManagementApiAuthorized = value;
    }

    /**
     * Gets the value of the myMessagingApiAuthorized property.
     * 
     */
    public boolean isMyMessagingApiAuthorized() {
        return myMessagingApiAuthorized;
    }

    /**
     * Sets the value of the myMessagingApiAuthorized property.
     * 
     */
    public void setMyMessagingApiAuthorized(boolean value) {
        this.myMessagingApiAuthorized = value;
    }

    /**
     * Gets the value of the myMessagingDeviceRights property.
     * 
     * @return
     *     possible object is
     *     {@link AlcDeviceRights }
     *     
     */
    public AlcDeviceRights getMyMessagingDeviceRights() {
        return myMessagingDeviceRights;
    }

    /**
     * Sets the value of the myMessagingDeviceRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcDeviceRights }
     *     
     */
    public void setMyMessagingDeviceRights(AlcDeviceRights value) {
        this.myMessagingDeviceRights = value;
    }

    /**
     * Gets the value of the myPhoneApiAuthorized property.
     * 
     */
    public boolean isMyPhoneApiAuthorized() {
        return myPhoneApiAuthorized;
    }

    /**
     * Sets the value of the myPhoneApiAuthorized property.
     * 
     */
    public void setMyPhoneApiAuthorized(boolean value) {
        this.myPhoneApiAuthorized = value;
    }

    /**
     * Gets the value of the myPhoneDeviceRights property.
     * 
     * @return
     *     possible object is
     *     {@link AlcDeviceRights }
     *     
     */
    public AlcDeviceRights getMyPhoneDeviceRights() {
        return myPhoneDeviceRights;
    }

    /**
     * Sets the value of the myPhoneDeviceRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcDeviceRights }
     *     
     */
    public void setMyPhoneDeviceRights(AlcDeviceRights value) {
        this.myPhoneDeviceRights = value;
    }

    /**
     * Gets the value of the myTeamworkDeviceRights property.
     * 
     * @return
     *     possible object is
     *     {@link AlcDeviceRights }
     *     
     */
    public AlcDeviceRights getMyTeamworkDeviceRights() {
        return myTeamworkDeviceRights;
    }

    /**
     * Sets the value of the myTeamworkDeviceRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcDeviceRights }
     *     
     */
    public void setMyTeamworkDeviceRights(AlcDeviceRights value) {
        this.myTeamworkDeviceRights = value;
    }

    /**
     * Gets the value of the myTeamworkApiAuthorized property.
     * 
     */
    public boolean isMyTeamworkApiAuthorized() {
        return myTeamworkApiAuthorized;
    }

    /**
     * Sets the value of the myTeamworkApiAuthorized property.
     * 
     */
    public void setMyTeamworkApiAuthorized(boolean value) {
        this.myTeamworkApiAuthorized = value;
    }

    /**
     * Gets the value of the myInstantCommunicatorDeviceRights property.
     * 
     * @return
     *     possible object is
     *     {@link AlcDeviceRights }
     *     
     */
    public AlcDeviceRights getMyInstantCommunicatorDeviceRights() {
        return myInstantCommunicatorDeviceRights;
    }

    /**
     * Sets the value of the myInstantCommunicatorDeviceRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcDeviceRights }
     *     
     */
    public void setMyInstantCommunicatorDeviceRights(AlcDeviceRights value) {
        this.myInstantCommunicatorDeviceRights = value;
    }

}
