
package com.alcatel_lucent.test.soapstub.types.sipconfig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An external gateway represents an SIP user group accessible via a gateway or
 *             a proxy for which the URL and the transport parameters are known.
 *             It also contains authentication data which will be used when the remote
 *             proxy or server requests an authentication. This global data is used for all
 *             remote calls, independently of the request URI.
 *             Remote gateways are accessible via network routing prefixes or ARS seizure.
 *         
 * 
 * <p>Java class for AlcExternalSipGateway complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcExternalSipGateway">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="remoteDomain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transport" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/sipconfig}AlcSipTransportType"/>
 *         &lt;element name="forcePrackUse" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="authenticationDomain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="registrationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="registrationTimer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="outboundProxy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="externalProxyUserPart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="supervisionTimer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="poolNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="outgoingRealm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="outgoingUserName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="outgoingPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="incomingUserName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="incomingPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pAssertedIdentityHeaderSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sdpIn180Response" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sipMinAuthenticationMethod" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/sipconfig}AlcSipAuthenticationMethod"/>
 *         &lt;element name="infoRequestForRemoteExtension" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcExternalSipGateway", propOrder = {
    "id",
    "remoteDomain",
    "port",
    "transport",
    "forcePrackUse",
    "authenticationDomain",
    "registrationId",
    "registrationTimer",
    "outboundProxy",
    "externalProxyUserPart",
    "supervisionTimer",
    "poolNumber",
    "outgoingRealm",
    "outgoingUserName",
    "outgoingPassword",
    "incomingUserName",
    "incomingPassword",
    "pAssertedIdentityHeaderSupported",
    "sdpIn180Response",
    "sipMinAuthenticationMethod",
    "infoRequestForRemoteExtension"
})
public class AlcExternalSipGateway {

    protected int id;
    @XmlElement(required = true)
    protected String remoteDomain;
    @XmlElement(required = true)
    protected String port;
    @XmlElement(required = true)
    protected AlcSipTransportType transport;
    protected boolean forcePrackUse;
    @XmlElement(required = true, nillable = true)
    protected String authenticationDomain;
    @XmlElement(required = true, nillable = true)
    protected String registrationId;
    protected int registrationTimer;
    @XmlElement(required = true, nillable = true)
    protected String outboundProxy;
    @XmlElement(required = true, nillable = true)
    protected String externalProxyUserPart;
    protected int supervisionTimer;
    protected int poolNumber;
    @XmlElement(required = true, nillable = true)
    protected String outgoingRealm;
    @XmlElement(required = true, nillable = true)
    protected String outgoingUserName;
    @XmlElement(required = true, nillable = true)
    protected String outgoingPassword;
    @XmlElement(required = true, nillable = true)
    protected String incomingUserName;
    @XmlElement(required = true, nillable = true)
    protected String incomingPassword;
    protected boolean pAssertedIdentityHeaderSupported;
    protected boolean sdpIn180Response;
    @XmlElement(required = true)
    protected AlcSipAuthenticationMethod sipMinAuthenticationMethod;
    protected boolean infoRequestForRemoteExtension;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the remoteDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteDomain() {
        return remoteDomain;
    }

    /**
     * Sets the value of the remoteDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteDomain(String value) {
        this.remoteDomain = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPort(String value) {
        this.port = value;
    }

    /**
     * Gets the value of the transport property.
     * 
     * @return
     *     possible object is
     *     {@link AlcSipTransportType }
     *     
     */
    public AlcSipTransportType getTransport() {
        return transport;
    }

    /**
     * Sets the value of the transport property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcSipTransportType }
     *     
     */
    public void setTransport(AlcSipTransportType value) {
        this.transport = value;
    }

    /**
     * Gets the value of the forcePrackUse property.
     * 
     */
    public boolean isForcePrackUse() {
        return forcePrackUse;
    }

    /**
     * Sets the value of the forcePrackUse property.
     * 
     */
    public void setForcePrackUse(boolean value) {
        this.forcePrackUse = value;
    }

    /**
     * Gets the value of the authenticationDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationDomain() {
        return authenticationDomain;
    }

    /**
     * Sets the value of the authenticationDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationDomain(String value) {
        this.authenticationDomain = value;
    }

    /**
     * Gets the value of the registrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationId() {
        return registrationId;
    }

    /**
     * Sets the value of the registrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationId(String value) {
        this.registrationId = value;
    }

    /**
     * Gets the value of the registrationTimer property.
     * 
     */
    public int getRegistrationTimer() {
        return registrationTimer;
    }

    /**
     * Sets the value of the registrationTimer property.
     * 
     */
    public void setRegistrationTimer(int value) {
        this.registrationTimer = value;
    }

    /**
     * Gets the value of the outboundProxy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutboundProxy() {
        return outboundProxy;
    }

    /**
     * Sets the value of the outboundProxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutboundProxy(String value) {
        this.outboundProxy = value;
    }

    /**
     * Gets the value of the externalProxyUserPart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalProxyUserPart() {
        return externalProxyUserPart;
    }

    /**
     * Sets the value of the externalProxyUserPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalProxyUserPart(String value) {
        this.externalProxyUserPart = value;
    }

    /**
     * Gets the value of the supervisionTimer property.
     * 
     */
    public int getSupervisionTimer() {
        return supervisionTimer;
    }

    /**
     * Sets the value of the supervisionTimer property.
     * 
     */
    public void setSupervisionTimer(int value) {
        this.supervisionTimer = value;
    }

    /**
     * Gets the value of the poolNumber property.
     * 
     */
    public int getPoolNumber() {
        return poolNumber;
    }

    /**
     * Sets the value of the poolNumber property.
     * 
     */
    public void setPoolNumber(int value) {
        this.poolNumber = value;
    }

    /**
     * Gets the value of the outgoingRealm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutgoingRealm() {
        return outgoingRealm;
    }

    /**
     * Sets the value of the outgoingRealm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutgoingRealm(String value) {
        this.outgoingRealm = value;
    }

    /**
     * Gets the value of the outgoingUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutgoingUserName() {
        return outgoingUserName;
    }

    /**
     * Sets the value of the outgoingUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutgoingUserName(String value) {
        this.outgoingUserName = value;
    }

    /**
     * Gets the value of the outgoingPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutgoingPassword() {
        return outgoingPassword;
    }

    /**
     * Sets the value of the outgoingPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutgoingPassword(String value) {
        this.outgoingPassword = value;
    }

    /**
     * Gets the value of the incomingUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomingUserName() {
        return incomingUserName;
    }

    /**
     * Sets the value of the incomingUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomingUserName(String value) {
        this.incomingUserName = value;
    }

    /**
     * Gets the value of the incomingPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomingPassword() {
        return incomingPassword;
    }

    /**
     * Sets the value of the incomingPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomingPassword(String value) {
        this.incomingPassword = value;
    }

    /**
     * Gets the value of the pAssertedIdentityHeaderSupported property.
     * 
     */
    public boolean isPAssertedIdentityHeaderSupported() {
        return pAssertedIdentityHeaderSupported;
    }

    /**
     * Sets the value of the pAssertedIdentityHeaderSupported property.
     * 
     */
    public void setPAssertedIdentityHeaderSupported(boolean value) {
        this.pAssertedIdentityHeaderSupported = value;
    }

    /**
     * Gets the value of the sdpIn180Response property.
     * 
     */
    public boolean isSdpIn180Response() {
        return sdpIn180Response;
    }

    /**
     * Sets the value of the sdpIn180Response property.
     * 
     */
    public void setSdpIn180Response(boolean value) {
        this.sdpIn180Response = value;
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
     * Gets the value of the infoRequestForRemoteExtension property.
     * 
     */
    public boolean isInfoRequestForRemoteExtension() {
        return infoRequestForRemoteExtension;
    }

    /**
     * Sets the value of the infoRequestForRemoteExtension property.
     * 
     */
    public void setInfoRequestForRemoteExtension(boolean value) {
        this.infoRequestForRemoteExtension = value;
    }

}
