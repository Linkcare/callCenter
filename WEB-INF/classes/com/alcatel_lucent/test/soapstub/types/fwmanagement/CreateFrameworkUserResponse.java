
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
 *         &lt;element name="myAssistantOk" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="myInstantCommunicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="myMessagingOk" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="myPhoneOk" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="myTeamworkOk" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "myAssistantOk",
    "myInstantCommunicator",
    "myMessagingOk",
    "myPhoneOk",
    "myTeamworkOk"
})
@XmlRootElement(name = "createFrameworkUserResponse")
public class CreateFrameworkUserResponse
    extends AlcResult
{

    protected boolean myAssistantOk;
    protected boolean myInstantCommunicator;
    protected boolean myMessagingOk;
    protected boolean myPhoneOk;
    protected boolean myTeamworkOk;

    /**
     * Gets the value of the myAssistantOk property.
     * 
     */
    public boolean isMyAssistantOk() {
        return myAssistantOk;
    }

    /**
     * Sets the value of the myAssistantOk property.
     * 
     */
    public void setMyAssistantOk(boolean value) {
        this.myAssistantOk = value;
    }

    /**
     * Gets the value of the myInstantCommunicator property.
     * 
     */
    public boolean isMyInstantCommunicator() {
        return myInstantCommunicator;
    }

    /**
     * Sets the value of the myInstantCommunicator property.
     * 
     */
    public void setMyInstantCommunicator(boolean value) {
        this.myInstantCommunicator = value;
    }

    /**
     * Gets the value of the myMessagingOk property.
     * 
     */
    public boolean isMyMessagingOk() {
        return myMessagingOk;
    }

    /**
     * Sets the value of the myMessagingOk property.
     * 
     */
    public void setMyMessagingOk(boolean value) {
        this.myMessagingOk = value;
    }

    /**
     * Gets the value of the myPhoneOk property.
     * 
     */
    public boolean isMyPhoneOk() {
        return myPhoneOk;
    }

    /**
     * Sets the value of the myPhoneOk property.
     * 
     */
    public void setMyPhoneOk(boolean value) {
        this.myPhoneOk = value;
    }

    /**
     * Gets the value of the myTeamworkOk property.
     * 
     */
    public boolean isMyTeamworkOk() {
        return myTeamworkOk;
    }

    /**
     * Sets the value of the myTeamworkOk property.
     * 
     */
    public void setMyTeamworkOk(boolean value) {
        this.myTeamworkOk = value;
    }

}
