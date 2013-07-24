
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
 *     &lt;extension base="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcResult">
 *       &lt;sequence>
 *         &lt;element name="frameworkUser" type="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcFrameworkUser"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "frameworkUser"
})
@XmlRootElement(name = "getFrameworkUserResponse")
public class GetFrameworkUserResponse
    extends AlcResult
{

    @XmlElement(required = true, nillable = true)
    protected AlcFrameworkUser frameworkUser;

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
