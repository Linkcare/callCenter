
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.alcatel_lucent.test.soapstub.types.sipconfig.AlcSipProxy;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcResult">
 *       &lt;sequence>
 *         &lt;element name="sipProxy" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/sipconfig}AlcSipProxy"/>
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
    "sipProxy"
})
@XmlRootElement(name = "getSipProxyResponse")
public class GetSipProxyResponse
    extends AlcResult
{

    @XmlElement(required = true, nillable = true)
    protected AlcSipProxy sipProxy;

    /**
     * Gets the value of the sipProxy property.
     * 
     * @return
     *     possible object is
     *     {@link AlcSipProxy }
     *     
     */
    public AlcSipProxy getSipProxy() {
        return sipProxy;
    }

    /**
     * Sets the value of the sipProxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcSipProxy }
     *     
     */
    public void setSipProxy(AlcSipProxy value) {
        this.sipProxy = value;
    }

}
