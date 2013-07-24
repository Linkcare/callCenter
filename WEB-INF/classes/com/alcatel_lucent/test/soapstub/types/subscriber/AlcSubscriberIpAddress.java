
package com.alcatel_lucent.test.soapstub.types.subscriber;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcSubscriberIpAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcSubscriberIpAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ethernetAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="domainNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcSubscriberIpAddress", propOrder = {
    "ethernetAddress",
    "ipAddress",
    "domainNumber"
})
public class AlcSubscriberIpAddress {

    @XmlElement(required = true)
    protected String ethernetAddress;
    @XmlElement(required = true)
    protected String ipAddress;
    protected int domainNumber;

    /**
     * Gets the value of the ethernetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEthernetAddress() {
        return ethernetAddress;
    }

    /**
     * Sets the value of the ethernetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEthernetAddress(String value) {
        this.ethernetAddress = value;
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
     * Gets the value of the domainNumber property.
     * 
     */
    public int getDomainNumber() {
        return domainNumber;
    }

    /**
     * Sets the value of the domainNumber property.
     * 
     */
    public void setDomainNumber(int value) {
        this.domainNumber = value;
    }

}
