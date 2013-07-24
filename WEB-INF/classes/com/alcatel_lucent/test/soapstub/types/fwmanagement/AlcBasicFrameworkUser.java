
package com.alcatel_lucent.test.soapstub.types.fwmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Basic description of a 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Framework User&lt;/i&gt;
 * </pre>
 * .
 * 
 * <p>Java class for AlcBasicFrameworkUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcBasicFrameworkUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="loginName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcBasicFrameworkUser", propOrder = {
    "companyPhone",
    "firstName",
    "lastName",
    "loginName"
})
public class AlcBasicFrameworkUser {

    @XmlElement(required = true, nillable = true)
    protected String companyPhone;
    @XmlElement(required = true, nillable = true)
    protected String firstName;
    @XmlElement(required = true, nillable = true)
    protected String lastName;
    @XmlElement(required = true, nillable = true)
    protected String loginName;

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
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

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

}
