
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.alcatel_lucent.test.soapstub.types.subscriber.AlcSeplosParameters;


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
 *         &lt;element name="seplosParameters" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber}AlcSeplosParameters"/>
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
    "seplosParameters"
})
@XmlRootElement(name = "getSeplosParametersResponse")
public class GetSeplosParametersResponse
    extends AlcResult
{

    @XmlElement(required = true, nillable = true)
    protected AlcSeplosParameters seplosParameters;

    /**
     * Gets the value of the seplosParameters property.
     * 
     * @return
     *     possible object is
     *     {@link AlcSeplosParameters }
     *     
     */
    public AlcSeplosParameters getSeplosParameters() {
        return seplosParameters;
    }

    /**
     * Sets the value of the seplosParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcSeplosParameters }
     *     
     */
    public void setSeplosParameters(AlcSeplosParameters value) {
        this.seplosParameters = value;
    }

}
