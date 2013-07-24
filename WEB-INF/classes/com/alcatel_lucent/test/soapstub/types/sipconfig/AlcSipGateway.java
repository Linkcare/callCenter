
package com.alcatel_lucent.test.soapstub.types.sipconfig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The SIP gateway allows (authorized) SIP sets to access the legacy network of
 *             the company, and therefore to use a number of its services (forwarding,
 *             transfer, voice mail). It also allows legacy sets to contact SIP sets or another
 *             network (public or private) via an opposite remote SIP gateway.                
 *         
 * 
 * <p>Java class for AlcSipGateway complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcSipGateway">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subnetworkNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="trunkGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="proxyPort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="registrationMinDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="registrationMaxDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sessionTimer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dnsLocalDomainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstDnsIpAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="secondDnsIpAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sdpIn180Response" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cac" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcSipGateway", propOrder = {
    "subnetworkNumber",
    "trunkGroup",
    "ipAddress",
    "hostName",
    "proxyPort",
    "registrationMinDuration",
    "registrationMaxDuration",
    "sessionTimer",
    "dnsLocalDomainName",
    "firstDnsIpAddress",
    "secondDnsIpAddress",
    "sdpIn180Response",
    "cac"
})
public class AlcSipGateway {

    protected int subnetworkNumber;
    protected int trunkGroup;
    @XmlElement(required = true)
    protected String ipAddress;
    @XmlElement(required = true)
    protected String hostName;
    @XmlElement(required = true)
    protected String proxyPort;
    protected int registrationMinDuration;
    protected int registrationMaxDuration;
    protected int sessionTimer;
    @XmlElement(required = true)
    protected String dnsLocalDomainName;
    @XmlElement(required = true)
    protected String firstDnsIpAddress;
    @XmlElement(required = true)
    protected String secondDnsIpAddress;
    protected boolean sdpIn180Response;
    protected boolean cac;

    /**
     * Gets the value of the subnetworkNumber property.
     * 
     */
    public int getSubnetworkNumber() {
        return subnetworkNumber;
    }

    /**
     * Sets the value of the subnetworkNumber property.
     * 
     */
    public void setSubnetworkNumber(int value) {
        this.subnetworkNumber = value;
    }

    /**
     * Gets the value of the trunkGroup property.
     * 
     */
    public int getTrunkGroup() {
        return trunkGroup;
    }

    /**
     * Sets the value of the trunkGroup property.
     * 
     */
    public void setTrunkGroup(int value) {
        this.trunkGroup = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the hostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * Sets the value of the hostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostName(String value) {
        this.hostName = value;
    }

    /**
     * Gets the value of the proxyPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyPort() {
        return proxyPort;
    }

    /**
     * Sets the value of the proxyPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyPort(String value) {
        this.proxyPort = value;
    }

    /**
     * Gets the value of the registrationMinDuration property.
     * 
     */
    public int getRegistrationMinDuration() {
        return registrationMinDuration;
    }

    /**
     * Sets the value of the registrationMinDuration property.
     * 
     */
    public void setRegistrationMinDuration(int value) {
        this.registrationMinDuration = value;
    }

    /**
     * Gets the value of the registrationMaxDuration property.
     * 
     */
    public int getRegistrationMaxDuration() {
        return registrationMaxDuration;
    }

    /**
     * Sets the value of the registrationMaxDuration property.
     * 
     */
    public void setRegistrationMaxDuration(int value) {
        this.registrationMaxDuration = value;
    }

    /**
     * Gets the value of the sessionTimer property.
     * 
     */
    public int getSessionTimer() {
        return sessionTimer;
    }

    /**
     * Sets the value of the sessionTimer property.
     * 
     */
    public void setSessionTimer(int value) {
        this.sessionTimer = value;
    }

    /**
     * Gets the value of the dnsLocalDomainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnsLocalDomainName() {
        return dnsLocalDomainName;
    }

    /**
     * Sets the value of the dnsLocalDomainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnsLocalDomainName(String value) {
        this.dnsLocalDomainName = value;
    }

    /**
     * Gets the value of the firstDnsIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstDnsIpAddress() {
        return firstDnsIpAddress;
    }

    /**
     * Sets the value of the firstDnsIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstDnsIpAddress(String value) {
        this.firstDnsIpAddress = value;
    }

    /**
     * Gets the value of the secondDnsIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondDnsIpAddress() {
        return secondDnsIpAddress;
    }

    /**
     * Sets the value of the secondDnsIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondDnsIpAddress(String value) {
        this.secondDnsIpAddress = value;
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
     * Gets the value of the cac property.
     * 
     */
    public boolean isCac() {
        return cac;
    }

    /**
     * Sets the value of the cac property.
     * 
     */
    public void setCac(boolean value) {
        this.cac = value;
    }

}
