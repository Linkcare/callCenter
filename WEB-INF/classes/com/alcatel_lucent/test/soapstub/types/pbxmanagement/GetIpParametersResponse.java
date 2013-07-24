
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.alcatel_lucent.test.soapstub.types.subscriber.AlcIpParameters;


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
 *         &lt;element name="ipParameters" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber}AlcIpParameters"/>
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
    "ipParameters"
})
@XmlRootElement(name = "getIpParametersResponse")
public class GetIpParametersResponse
    extends AlcResult
{

    @XmlElement(required = true, nillable = true)
    protected AlcIpParameters ipParameters;

    /**
     * Gets the value of the ipParameters property.
     * 
     * @return
     *     possible object is
     *     {@link AlcIpParameters }
     *     
     */
    public AlcIpParameters getIpParameters() {
        return ipParameters;
    }

    /**
     * Sets the value of the ipParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcIpParameters }
     *     
     */
    public void setIpParameters(AlcIpParameters value) {
        this.ipParameters = value;
    }

}
