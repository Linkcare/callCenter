
package com.alcatel_lucent.test.soapstub.types.fwmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes a voice mail system.
 * 
 * <p>Java class for AlcVoiceMailSystem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcVoiceMailSystem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="httpHost" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="httpPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="httpPort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imap" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcVoiceMailSystemType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcVoiceMailSystem", propOrder = {
    "id",
    "displayName",
    "httpHost",
    "httpPath",
    "httpPort",
    "imap",
    "number",
    "type"
})
public class AlcVoiceMailSystem {

    @XmlElement(required = true, nillable = true)
    protected String id;
    @XmlElement(required = true, nillable = true)
    protected String displayName;
    @XmlElement(required = true, nillable = true)
    protected String httpHost;
    @XmlElement(required = true, nillable = true)
    protected String httpPath;
    @XmlElement(required = true, nillable = true)
    protected String httpPort;
    protected boolean imap;
    @XmlElement(required = true, nillable = true)
    protected String number;
    @XmlElement(required = true, nillable = true)
    protected AlcVoiceMailSystemType type;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the httpHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpHost() {
        return httpHost;
    }

    /**
     * Sets the value of the httpHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpHost(String value) {
        this.httpHost = value;
    }

    /**
     * Gets the value of the httpPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpPath() {
        return httpPath;
    }

    /**
     * Sets the value of the httpPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpPath(String value) {
        this.httpPath = value;
    }

    /**
     * Gets the value of the httpPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpPort() {
        return httpPort;
    }

    /**
     * Sets the value of the httpPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpPort(String value) {
        this.httpPort = value;
    }

    /**
     * Gets the value of the imap property.
     * 
     */
    public boolean isImap() {
        return imap;
    }

    /**
     * Sets the value of the imap property.
     * 
     */
    public void setImap(boolean value) {
        this.imap = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AlcVoiceMailSystemType }
     *     
     */
    public AlcVoiceMailSystemType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcVoiceMailSystemType }
     *     
     */
    public void setType(AlcVoiceMailSystemType value) {
        this.type = value;
    }

}
