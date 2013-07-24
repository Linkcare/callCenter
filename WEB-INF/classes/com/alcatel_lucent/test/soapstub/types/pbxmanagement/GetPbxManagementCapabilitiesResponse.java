
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

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
 *     &lt;extension base="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcResult">
 *       &lt;sequence>
 *         &lt;element name="notifications" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entities" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="costCenters" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pickupGroups" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="languages" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="stationTypes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sipGateway" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sipProxy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="externalSipGateway" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="phoneBook" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="subscribers" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="externalSubscribers" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="secondarySubscribers" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="huntingGroups" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="phoneSetProgramming" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "notifications",
    "entities",
    "costCenters",
    "pickupGroups",
    "languages",
    "stationTypes",
    "sipGateway",
    "sipProxy",
    "externalSipGateway",
    "phoneBook",
    "subscribers",
    "externalSubscribers",
    "secondarySubscribers",
    "huntingGroups",
    "phoneSetProgramming"
})
@XmlRootElement(name = "getPbxManagementCapabilitiesResponse")
public class GetPbxManagementCapabilitiesResponse
    extends AlcResult
{

    protected boolean notifications;
    protected boolean entities;
    protected boolean costCenters;
    protected boolean pickupGroups;
    protected boolean languages;
    protected boolean stationTypes;
    protected boolean sipGateway;
    protected boolean sipProxy;
    protected boolean externalSipGateway;
    protected boolean phoneBook;
    protected boolean subscribers;
    protected boolean externalSubscribers;
    protected boolean secondarySubscribers;
    protected boolean huntingGroups;
    protected boolean phoneSetProgramming;

    /**
     * Gets the value of the notifications property.
     * 
     */
    public boolean isNotifications() {
        return notifications;
    }

    /**
     * Sets the value of the notifications property.
     * 
     */
    public void setNotifications(boolean value) {
        this.notifications = value;
    }

    /**
     * Gets the value of the entities property.
     * 
     */
    public boolean isEntities() {
        return entities;
    }

    /**
     * Sets the value of the entities property.
     * 
     */
    public void setEntities(boolean value) {
        this.entities = value;
    }

    /**
     * Gets the value of the costCenters property.
     * 
     */
    public boolean isCostCenters() {
        return costCenters;
    }

    /**
     * Sets the value of the costCenters property.
     * 
     */
    public void setCostCenters(boolean value) {
        this.costCenters = value;
    }

    /**
     * Gets the value of the pickupGroups property.
     * 
     */
    public boolean isPickupGroups() {
        return pickupGroups;
    }

    /**
     * Sets the value of the pickupGroups property.
     * 
     */
    public void setPickupGroups(boolean value) {
        this.pickupGroups = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     */
    public boolean isLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     */
    public void setLanguages(boolean value) {
        this.languages = value;
    }

    /**
     * Gets the value of the stationTypes property.
     * 
     */
    public boolean isStationTypes() {
        return stationTypes;
    }

    /**
     * Sets the value of the stationTypes property.
     * 
     */
    public void setStationTypes(boolean value) {
        this.stationTypes = value;
    }

    /**
     * Gets the value of the sipGateway property.
     * 
     */
    public boolean isSipGateway() {
        return sipGateway;
    }

    /**
     * Sets the value of the sipGateway property.
     * 
     */
    public void setSipGateway(boolean value) {
        this.sipGateway = value;
    }

    /**
     * Gets the value of the sipProxy property.
     * 
     */
    public boolean isSipProxy() {
        return sipProxy;
    }

    /**
     * Sets the value of the sipProxy property.
     * 
     */
    public void setSipProxy(boolean value) {
        this.sipProxy = value;
    }

    /**
     * Gets the value of the externalSipGateway property.
     * 
     */
    public boolean isExternalSipGateway() {
        return externalSipGateway;
    }

    /**
     * Sets the value of the externalSipGateway property.
     * 
     */
    public void setExternalSipGateway(boolean value) {
        this.externalSipGateway = value;
    }

    /**
     * Gets the value of the phoneBook property.
     * 
     */
    public boolean isPhoneBook() {
        return phoneBook;
    }

    /**
     * Sets the value of the phoneBook property.
     * 
     */
    public void setPhoneBook(boolean value) {
        this.phoneBook = value;
    }

    /**
     * Gets the value of the subscribers property.
     * 
     */
    public boolean isSubscribers() {
        return subscribers;
    }

    /**
     * Sets the value of the subscribers property.
     * 
     */
    public void setSubscribers(boolean value) {
        this.subscribers = value;
    }

    /**
     * Gets the value of the externalSubscribers property.
     * 
     */
    public boolean isExternalSubscribers() {
        return externalSubscribers;
    }

    /**
     * Sets the value of the externalSubscribers property.
     * 
     */
    public void setExternalSubscribers(boolean value) {
        this.externalSubscribers = value;
    }

    /**
     * Gets the value of the secondarySubscribers property.
     * 
     */
    public boolean isSecondarySubscribers() {
        return secondarySubscribers;
    }

    /**
     * Sets the value of the secondarySubscribers property.
     * 
     */
    public void setSecondarySubscribers(boolean value) {
        this.secondarySubscribers = value;
    }

    /**
     * Gets the value of the huntingGroups property.
     * 
     */
    public boolean isHuntingGroups() {
        return huntingGroups;
    }

    /**
     * Sets the value of the huntingGroups property.
     * 
     */
    public void setHuntingGroups(boolean value) {
        this.huntingGroups = value;
    }

    /**
     * Gets the value of the phoneSetProgramming property.
     * 
     */
    public boolean isPhoneSetProgramming() {
        return phoneSetProgramming;
    }

    /**
     * Sets the value of the phoneSetProgramming property.
     * 
     */
    public void setPhoneSetProgramming(boolean value) {
        this.phoneSetProgramming = value;
    }

}
