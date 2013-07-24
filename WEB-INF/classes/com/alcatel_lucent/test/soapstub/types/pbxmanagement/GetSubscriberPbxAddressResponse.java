
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.alcatel_lucent.test.soapstub.types.subscriber.AlcSubscriberPbxAddress;


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
 *         &lt;element name="pbxAddress" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber}AlcSubscriberPbxAddress"/>
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
    "pbxAddress"
})
@XmlRootElement(name = "getSubscriberPbxAddressResponse")
public class GetSubscriberPbxAddressResponse
    extends AlcResult
{

    @XmlElement(required = true, nillable = true)
    protected AlcSubscriberPbxAddress pbxAddress;

    /**
     * Gets the value of the pbxAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AlcSubscriberPbxAddress }
     *     
     */
    public AlcSubscriberPbxAddress getPbxAddress() {
        return pbxAddress;
    }

    /**
     * Sets the value of the pbxAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcSubscriberPbxAddress }
     *     
     */
    public void setPbxAddress(AlcSubscriberPbxAddress value) {
        this.pbxAddress = value;
    }

}
