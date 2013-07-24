
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.alcatel_lucent.test.soapstub.types.externalsubscriber.AlcExternalSubscriber;


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
 *         &lt;element name="externalSubscriber" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/externalsubscriber}AlcExternalSubscriber"/>
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
    "externalSubscriber"
})
@XmlRootElement(name = "getExternalSubscriberResponse")
public class GetExternalSubscriberResponse
    extends AlcResult
{

    @XmlElement(required = true, nillable = true)
    protected AlcExternalSubscriber externalSubscriber;

    /**
     * Gets the value of the externalSubscriber property.
     * 
     * @return
     *     possible object is
     *     {@link AlcExternalSubscriber }
     *     
     */
    public AlcExternalSubscriber getExternalSubscriber() {
        return externalSubscriber;
    }

    /**
     * Sets the value of the externalSubscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcExternalSubscriber }
     *     
     */
    public void setExternalSubscriber(AlcExternalSubscriber value) {
        this.externalSubscriber = value;
    }

}
