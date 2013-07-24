
package com.alcatel_lucent.test.soapstub.types.apiframework;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcFrameworkAccountInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcFrameworkAccountInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loginName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="companyPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="companyDect" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mobilePhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="presenceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeToLive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcFrameworkAccountInfo", propOrder = {
    "loginName",
    "firstName",
    "name",
    "language",
    "companyPhone",
    "companyDect",
    "mobilePhone",
    "email",
    "presenceId",
    "timeToLive"
})
public class AlcFrameworkAccountInfo {

    @XmlElement(required = true, nillable = true)
    protected String loginName;
    @XmlElement(required = true, nillable = true)
    protected String firstName;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String language;
    @XmlElement(required = true, nillable = true)
    protected String companyPhone;
    @XmlElement(required = true, nillable = true)
    protected String companyDect;
    @XmlElement(required = true, nillable = true)
    protected String mobilePhone;
    @XmlElement(required = true, nillable = true)
    protected String email;
    @XmlElement(required = true, nillable = true)
    protected String presenceId;
    protected int timeToLive;

    /**
     * Gets the value of the loginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * Sets the value of the loginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginName(String value) {
        this.loginName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the companyPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyPhone() {
        return companyPhone;
    }

    /**
     * Sets the value of the companyPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyPhone(String value) {
        this.companyPhone = value;
    }

    /**
     * Gets the value of the companyDect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyDect() {
        return companyDect;
    }

    /**
     * Sets the value of the companyDect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyDect(String value) {
        this.companyDect = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
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
     * Gets the value of the presenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresenceId() {
        return presenceId;
    }

    /**
     * Sets the value of the presenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresenceId(String value) {
        this.presenceId = value;
    }

    /**
     * Gets the value of the timeToLive property.
     * 
     */
    public int getTimeToLive() {
        return timeToLive;
    }

    /**
     * Sets the value of the timeToLive property.
     * 
     */
    public void setTimeToLive(int value) {
        this.timeToLive = value;
    }

}
