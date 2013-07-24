
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
 *         &lt;element name="accountInfo" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkSchema}AlcFrameworkAccountInfo"/>
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
    "accountInfo"
})
@XmlRootElement(name = "getFrameworkAccountInfoResponse")
public class GetFrameworkAccountInfoResponse
    extends AlcResult
{

    @XmlElement(required = true, nillable = true)
    protected AlcFrameworkAccountInfo accountInfo;

    /**
     * Gets the value of the accountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AlcFrameworkAccountInfo }
     *     
     */
    public AlcFrameworkAccountInfo getAccountInfo() {
        return accountInfo;
    }

    /**
     * Sets the value of the accountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcFrameworkAccountInfo }
     *     
     */
    public void setAccountInfo(AlcFrameworkAccountInfo value) {
        this.accountInfo = value;
    }

}
