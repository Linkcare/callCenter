
package com.alcatel_lucent.test.soapstub.types.fwmanagement;

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
 *         &lt;element name="fwSessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="frameworkUser" type="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcFrameworkUser"/>
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
    "fwSessionId",
    "frameworkUser"
})
@XmlRootElement(name = "updateFrameworkUserRequest")
public class UpdateFrameworkUserRequest {

    @XmlElement(required = true, nillable = true)
    protected String fwSessionId;
    @XmlElement(required = true, nillable = true)
    protected AlcFrameworkUser frameworkUser;

    /**
     * Gets the value of the fwSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFwSessionId() {
        return fwSessionId;
    }

    /**
     * Sets the value of the fwSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFwSessionId(String value) {
        this.fwSessionId = value;
    }

    /**
     * Gets the value of the frameworkUser property.
     * 
     * @return
     *     possible object is
     *     {@link AlcFrameworkUser }
     *     
     */
    public AlcFrameworkUser getFrameworkUser() {
        return frameworkUser;
    }

    /**
     * Sets the value of the frameworkUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcFrameworkUser }
     *     
     */
    public void setFrameworkUser(AlcFrameworkUser value) {
        this.frameworkUser = value;
    }

}
