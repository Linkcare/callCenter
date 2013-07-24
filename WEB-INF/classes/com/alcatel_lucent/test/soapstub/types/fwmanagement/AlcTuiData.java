
package com.alcatel_lucent.test.soapstub.types.fwmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *          Describes the TUI data of the 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Framework User&lt;/i&gt;
 * </pre>
 * . TUI data needs no configuration when TUI is not
 *          available (use 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;getSystemInfo&lt;/code&gt;
 * </pre>
 *  command to know TUI availability).
 *       
 * 
 * <p>Java class for AlcTuiData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcTuiData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="password" type="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcPasswordData"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dtmfMapping" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expertMode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="skipPasswordOnDirectCall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="addressingByName" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcTuiData", propOrder = {
    "password",
    "language",
    "dtmfMapping",
    "expertMode",
    "skipPasswordOnDirectCall",
    "addressingByName"
})
public class AlcTuiData {

    @XmlElement(required = true, nillable = true)
    protected AlcPasswordData password;
    @XmlElement(required = true, nillable = true)
    protected String language;
    @XmlElement(required = true, nillable = true)
    protected String dtmfMapping;
    protected boolean expertMode;
    protected boolean skipPasswordOnDirectCall;
    protected boolean addressingByName;

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link AlcPasswordData }
     *     
     */
    public AlcPasswordData getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcPasswordData }
     *     
     */
    public void setPassword(AlcPasswordData value) {
        this.password = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the dtmfMapping property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtmfMapping() {
        return dtmfMapping;
    }

    /**
     * Sets the value of the dtmfMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtmfMapping(String value) {
        this.dtmfMapping = value;
    }

    /**
     * Gets the value of the expertMode property.
     * 
     */
    public boolean isExpertMode() {
        return expertMode;
    }

    /**
     * Sets the value of the expertMode property.
     * 
     */
    public void setExpertMode(boolean value) {
        this.expertMode = value;
    }

    /**
     * Gets the value of the skipPasswordOnDirectCall property.
     * 
     */
    public boolean isSkipPasswordOnDirectCall() {
        return skipPasswordOnDirectCall;
    }

    /**
     * Sets the value of the skipPasswordOnDirectCall property.
     * 
     */
    public void setSkipPasswordOnDirectCall(boolean value) {
        this.skipPasswordOnDirectCall = value;
    }

    /**
     * Gets the value of the addressingByName property.
     * 
     */
    public boolean isAddressingByName() {
        return addressingByName;
    }

    /**
     * Sets the value of the addressingByName property.
     * 
     */
    public void setAddressingByName(boolean value) {
        this.addressingByName = value;
    }

}
