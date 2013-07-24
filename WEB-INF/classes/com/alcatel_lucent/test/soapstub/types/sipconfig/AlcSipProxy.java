
package com.alcatel_lucent.test.soapstub.types.sipconfig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The proxy is used to locate and authenticate SIP users on the network.
 *         
 * 
 * <p>Java class for AlcSipProxy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcSipProxy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sipRetransmissionInitialTimer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sipTimerT2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sipConnectionDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="recursiveSearch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sipMinAuthenticationMethod" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/sipconfig}AlcSipAuthenticationMethod"/>
 *         &lt;element name="authenticationRealm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="authenticatedIncomingCallsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="quarantineObservationPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxNbMessagesDuringObservation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="quarantineDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcSipProxy", propOrder = {
    "sipRetransmissionInitialTimer",
    "sipTimerT2",
    "sipConnectionDuration",
    "recursiveSearch",
    "sipMinAuthenticationMethod",
    "authenticationRealm",
    "authenticatedIncomingCallsOnly",
    "quarantineObservationPeriod",
    "maxNbMessagesDuringObservation",
    "quarantineDuration"
})
public class AlcSipProxy {

    protected int sipRetransmissionInitialTimer;
    protected int sipTimerT2;
    protected int sipConnectionDuration;
    protected boolean recursiveSearch;
    @XmlElement(required = true)
    protected AlcSipAuthenticationMethod sipMinAuthenticationMethod;
    @XmlElement(required = true, nillable = true)
    protected String authenticationRealm;
    protected boolean authenticatedIncomingCallsOnly;
    protected int quarantineObservationPeriod;
    protected int maxNbMessagesDuringObservation;
    protected int quarantineDuration;

    /**
     * Gets the value of the sipRetransmissionInitialTimer property.
     * 
     */
    public int getSipRetransmissionInitialTimer() {
        return sipRetransmissionInitialTimer;
    }

    /**
     * Sets the value of the sipRetransmissionInitialTimer property.
     * 
     */
    public void setSipRetransmissionInitialTimer(int value) {
        this.sipRetransmissionInitialTimer = value;
    }

    /**
     * Gets the value of the sipTimerT2 property.
     * 
     */
    public int getSipTimerT2() {
        return sipTimerT2;
    }

    /**
     * Sets the value of the sipTimerT2 property.
     * 
     */
    public void setSipTimerT2(int value) {
        this.sipTimerT2 = value;
    }

    /**
     * Gets the value of the sipConnectionDuration property.
     * 
     */
    public int getSipConnectionDuration() {
        return sipConnectionDuration;
    }

    /**
     * Sets the value of the sipConnectionDuration property.
     * 
     */
    public void setSipConnectionDuration(int value) {
        this.sipConnectionDuration = value;
    }

    /**
     * Gets the value of the recursiveSearch property.
     * 
     */
    public boolean isRecursiveSearch() {
        return recursiveSearch;
    }

    /**
     * Sets the value of the recursiveSearch property.
     * 
     */
    public void setRecursiveSearch(boolean value) {
        this.recursiveSearch = value;
    }

    /**
     * Gets the value of the sipMinAuthenticationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link AlcSipAuthenticationMethod }
     *     
     */
    public AlcSipAuthenticationMethod getSipMinAuthenticationMethod() {
        return sipMinAuthenticationMethod;
    }

    /**
     * Sets the value of the sipMinAuthenticationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcSipAuthenticationMethod }
     *     
     */
    public void setSipMinAuthenticationMethod(AlcSipAuthenticationMethod value) {
        this.sipMinAuthenticationMethod = value;
    }

    /**
     * Gets the value of the authenticationRealm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationRealm() {
        return authenticationRealm;
    }

    /**
     * Sets the value of the authenticationRealm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationRealm(String value) {
        this.authenticationRealm = value;
    }

    /**
     * Gets the value of the authenticatedIncomingCallsOnly property.
     * 
     */
    public boolean isAuthenticatedIncomingCallsOnly() {
        return authenticatedIncomingCallsOnly;
    }

    /**
     * Sets the value of the authenticatedIncomingCallsOnly property.
     * 
     */
    public void setAuthenticatedIncomingCallsOnly(boolean value) {
        this.authenticatedIncomingCallsOnly = value;
    }

    /**
     * Gets the value of the quarantineObservationPeriod property.
     * 
     */
    public int getQuarantineObservationPeriod() {
        return quarantineObservationPeriod;
    }

    /**
     * Sets the value of the quarantineObservationPeriod property.
     * 
     */
    public void setQuarantineObservationPeriod(int value) {
        this.quarantineObservationPeriod = value;
    }

    /**
     * Gets the value of the maxNbMessagesDuringObservation property.
     * 
     */
    public int getMaxNbMessagesDuringObservation() {
        return maxNbMessagesDuringObservation;
    }

    /**
     * Sets the value of the maxNbMessagesDuringObservation property.
     * 
     */
    public void setMaxNbMessagesDuringObservation(int value) {
        this.maxNbMessagesDuringObservation = value;
    }

    /**
     * Gets the value of the quarantineDuration property.
     * 
     */
    public int getQuarantineDuration() {
        return quarantineDuration;
    }

    /**
     * Sets the value of the quarantineDuration property.
     * 
     */
    public void setQuarantineDuration(int value) {
        this.quarantineDuration = value;
    }

}
