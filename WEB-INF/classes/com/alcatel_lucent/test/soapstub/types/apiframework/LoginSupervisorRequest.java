
package com.alcatel_lucent.test.soapstub.types.apiframework;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="supervisorLoginName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="supervisorPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="supervisedAccountId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="supervisedAccountIdType" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema}AlcUserIdType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "supervisorLoginName",
    "supervisorPassword",
    "supervisedAccountId",
    "supervisedAccountIdType"
})
@XmlRootElement(name = "loginSupervisorRequest")
public class LoginSupervisorRequest {

    @XmlElement(required = true)
    protected String supervisorLoginName;
    @XmlElement(required = true)
    protected String supervisorPassword;
    @XmlElement(required = true)
    protected String supervisedAccountId;
    @XmlElement(required = true)
    protected AlcUserIdType supervisedAccountIdType;

    /**
     * Gets the value of the supervisorLoginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisorLoginName() {
        return supervisorLoginName;
    }

    /**
     * Sets the value of the supervisorLoginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisorLoginName(String value) {
        this.supervisorLoginName = value;
    }

    /**
     * Gets the value of the supervisorPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisorPassword() {
        return supervisorPassword;
    }

    /**
     * Sets the value of the supervisorPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisorPassword(String value) {
        this.supervisorPassword = value;
    }

    /**
     * Gets the value of the supervisedAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisedAccountId() {
        return supervisedAccountId;
    }

    /**
     * Sets the value of the supervisedAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisedAccountId(String value) {
        this.supervisedAccountId = value;
    }

    /**
     * Gets the value of the supervisedAccountIdType property.
     * 
     * @return
     *     possible object is
     *     {@link AlcUserIdType }
     *     
     */
    public AlcUserIdType getSupervisedAccountIdType() {
        return supervisedAccountIdType;
    }

    /**
     * Sets the value of the supervisedAccountIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcUserIdType }
     *     
     */
    public void setSupervisedAccountIdType(AlcUserIdType value) {
        this.supervisedAccountIdType = value;
    }

}
