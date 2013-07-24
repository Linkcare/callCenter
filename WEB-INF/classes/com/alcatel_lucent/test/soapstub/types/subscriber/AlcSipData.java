
package com.alcatel_lucent.test.soapstub.types.subscriber;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data for SIP behavior.
 * 
 * <p>Java class for AlcSipData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcSipData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="urlUserName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="urlDomain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="authenticationLogin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcSipData", propOrder = {
    "urlUserName",
    "urlDomain",
    "password",
    "authenticationLogin"
})
public class AlcSipData {

    @XmlElement(required = true, nillable = true)
    protected String urlUserName;
    @XmlElement(required = true, nillable = true)
    protected String urlDomain;
    @XmlElement(required = true, nillable = true)
    protected String password;
    @XmlElement(required = true, nillable = true)
    protected String authenticationLogin;

    /**
     * Gets the value of the urlUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlUserName() {
        return urlUserName;
    }

    /**
     * Sets the value of the urlUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlUserName(String value) {
        this.urlUserName = value;
    }

    /**
     * Gets the value of the urlDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlDomain() {
        return urlDomain;
    }

    /**
     * Sets the value of the urlDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlDomain(String value) {
        this.urlDomain = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the authenticationLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationLogin() {
        return authenticationLogin;
    }

    /**
     * Sets the value of the authenticationLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationLogin(String value) {
        this.authenticationLogin = value;
    }

}
