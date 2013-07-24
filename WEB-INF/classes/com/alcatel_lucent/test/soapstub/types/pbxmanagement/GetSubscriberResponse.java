
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.alcatel_lucent.test.soapstub.types.subscriber.AlcSubscriber;


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
 *         &lt;element name="subscriber" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber}AlcSubscriber"/>
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
    "subscriber"
})
@XmlRootElement(name = "getSubscriberResponse")
public class GetSubscriberResponse
    extends AlcResult
{

    @XmlElement(required = true, nillable = true)
    protected AlcSubscriber subscriber;

    /**
     * Gets the value of the subscriber property.
     * 
     * @return
     *     possible object is
     *     {@link AlcSubscriber }
     *     
     */
    public AlcSubscriber getSubscriber() {
        return subscriber;
    }

    /**
     * Sets the value of the subscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcSubscriber }
     *     
     */
    public void setSubscriber(AlcSubscriber value) {
        this.subscriber = value;
    }

}
