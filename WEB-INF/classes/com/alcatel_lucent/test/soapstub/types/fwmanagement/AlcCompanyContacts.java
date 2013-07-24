
package com.alcatel_lucent.test.soapstub.types.fwmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the company contacts of the 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Framework User&lt;/i&gt;
 * </pre>
 * .
 * 
 * <p>Java class for AlcCompanyContacts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcCompanyContacts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attendant" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="colleague" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dect" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="officePhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pager" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sipUri" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tamdem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcCompanyContacts", propOrder = {
    "attendant",
    "colleague",
    "dect",
    "email",
    "fax",
    "mobile",
    "officePhone",
    "pager",
    "sipUri",
    "tamdem"
})
public class AlcCompanyContacts {

    @XmlElement(required = true, nillable = true)
    protected String attendant;
    @XmlElement(required = true, nillable = true)
    protected String colleague;
    @XmlElement(required = true, nillable = true)
    protected String dect;
    @XmlElement(required = true, nillable = true)
    protected String email;
    @XmlElement(required = true, nillable = true)
    protected String fax;
    @XmlElement(required = true, nillable = true)
    protected String mobile;
    @XmlElement(required = true, nillable = true)
    protected String officePhone;
    @XmlElement(required = true, nillable = true)
    protected String pager;
    @XmlElement(required = true, nillable = true)
    protected String sipUri;
    @XmlElement(required = true, nillable = true)
    protected String tamdem;

    /**
     * Gets the value of the attendant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendant() {
        return attendant;
    }

    /**
     * Sets the value of the attendant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendant(String value) {
        this.attendant = value;
    }

    /**
     * Gets the value of the colleague property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColleague() {
        return colleague;
    }

    /**
     * Sets the value of the colleague property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColleague(String value) {
        this.colleague = value;
    }

    /**
     * Gets the value of the dect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDect() {
        return dect;
    }

    /**
     * Sets the value of the dect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDect(String value) {
        this.dect = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the officePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficePhone() {
        return officePhone;
    }

    /**
     * Sets the value of the officePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficePhone(String value) {
        this.officePhone = value;
    }

    /**
     * Gets the value of the pager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPager() {
        return pager;
    }

    /**
     * Sets the value of the pager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPager(String value) {
        this.pager = value;
    }

    /**
     * Gets the value of the sipUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSipUri() {
        return sipUri;
    }

    /**
     * Sets the value of the sipUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSipUri(String value) {
        this.sipUri = value;
    }

    /**
     * Gets the value of the tamdem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTamdem() {
        return tamdem;
    }

    /**
     * Sets the value of the tamdem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTamdem(String value) {
        this.tamdem = value;
    }

}
