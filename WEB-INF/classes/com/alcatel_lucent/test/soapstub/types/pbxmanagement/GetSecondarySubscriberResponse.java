
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.alcatel_lucent.test.soapstub.types.secondarysubscriber.AlcSecondarySubscriber;


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
 *         &lt;element name="secondarySubscriber" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/secondarysubscriber}AlcSecondarySubscriber"/>
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
    "secondarySubscriber"
})
@XmlRootElement(name = "getSecondarySubscriberResponse")
public class GetSecondarySubscriberResponse
    extends AlcResult
{

    @XmlElement(required = true, nillable = true)
    protected AlcSecondarySubscriber secondarySubscriber;

    /**
     * Gets the value of the secondarySubscriber property.
     * 
     * @return
     *     possible object is
     *     {@link AlcSecondarySubscriber }
     *     
     */
    public AlcSecondarySubscriber getSecondarySubscriber() {
        return secondarySubscriber;
    }

    /**
     * Sets the value of the secondarySubscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcSecondarySubscriber }
     *     
     */
    public void setSecondarySubscriber(AlcSecondarySubscriber value) {
        this.secondarySubscriber = value;
    }

}
