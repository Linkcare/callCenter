
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.alcatel_lucent.test.soapstub.types.subscriber.AlcSubscriberIpAddress;


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
 *         &lt;element name="ipAddress" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber}AlcSubscriberIpAddress"/>
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
    "ipAddress"
})
@XmlRootElement(name = "getSubscriberIpAddressResponse")
public class GetSubscriberIpAddressResponse
    extends AlcResult
{

    @XmlElement(required = true, nillable = true)
    protected AlcSubscriberIpAddress ipAddress;

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AlcSubscriberIpAddress }
     *     
     */
    public AlcSubscriberIpAddress getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcSubscriberIpAddress }
     *     
     */
    public void setIpAddress(AlcSubscriberIpAddress value) {
        this.ipAddress = value;
    }

}
