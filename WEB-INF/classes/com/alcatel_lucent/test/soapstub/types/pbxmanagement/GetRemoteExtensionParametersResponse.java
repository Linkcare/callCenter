
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

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
 *     &lt;extension base="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcResult">
 *       &lt;sequence>
 *         &lt;element name="remoteExtensionParameters" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcRemoteExtensionParameters"/>
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
    "remoteExtensionParameters"
})
@XmlRootElement(name = "getRemoteExtensionParametersResponse")
public class GetRemoteExtensionParametersResponse
    extends AlcResult
{

    @XmlElement(required = true, nillable = true)
    protected AlcRemoteExtensionParameters remoteExtensionParameters;

    /**
     * Gets the value of the remoteExtensionParameters property.
     * 
     * @return
     *     possible object is
     *     {@link AlcRemoteExtensionParameters }
     *     
     */
    public AlcRemoteExtensionParameters getRemoteExtensionParameters() {
        return remoteExtensionParameters;
    }

    /**
     * Sets the value of the remoteExtensionParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcRemoteExtensionParameters }
     *     
     */
    public void setRemoteExtensionParameters(AlcRemoteExtensionParameters value) {
        this.remoteExtensionParameters = value;
    }

}
