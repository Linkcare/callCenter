
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.alcatel_lucent.test.soapstub.types.sipconfig.AlcSipGateway;


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
 *         &lt;element name="sipGateway" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/sipconfig}AlcSipGateway"/>
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
    "sipGateway"
})
@XmlRootElement(name = "getSipGatewayResponse")
public class GetSipGatewayResponse
    extends AlcResult
{

    @XmlElement(required = true, nillable = true)
    protected AlcSipGateway sipGateway;

    /**
     * Gets the value of the sipGateway property.
     * 
     * @return
     *     possible object is
     *     {@link AlcSipGateway }
     *     
     */
    public AlcSipGateway getSipGateway() {
        return sipGateway;
    }

    /**
     * Sets the value of the sipGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcSipGateway }
     *     
     */
    public void setSipGateway(AlcSipGateway value) {
        this.sipGateway = value;
    }

}
