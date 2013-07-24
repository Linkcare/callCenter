
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
 *     &lt;extension base="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema}AlcResult">
 *       &lt;sequence>
 *         &lt;element name="accountRights" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema}AlcFrameworkAccountRights"/>
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
    "accountRights"
})
@XmlRootElement(name = "getFrameworkAccountRightsResponse")
public class GetFrameworkAccountRightsResponse
    extends AlcResult
{

    @XmlElement(required = true, nillable = true)
    protected AlcFrameworkAccountRights accountRights;

    /**
     * Gets the value of the accountRights property.
     * 
     * @return
     *     possible object is
     *     {@link AlcFrameworkAccountRights }
     *     
     */
    public AlcFrameworkAccountRights getAccountRights() {
        return accountRights;
    }

    /**
     * Sets the value of the accountRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcFrameworkAccountRights }
     *     
     */
    public void setAccountRights(AlcFrameworkAccountRights value) {
        this.accountRights = value;
    }

}
