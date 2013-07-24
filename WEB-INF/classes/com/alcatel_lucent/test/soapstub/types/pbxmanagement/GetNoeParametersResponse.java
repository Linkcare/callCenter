
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.alcatel_lucent.test.soapstub.types.subscriber.AlcNoeParameters;


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
 *         &lt;element name="noeParameters" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber}AlcNoeParameters"/>
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
    "noeParameters"
})
@XmlRootElement(name = "getNoeParametersResponse")
public class GetNoeParametersResponse
    extends AlcResult
{

    @XmlElement(required = true, nillable = true)
    protected AlcNoeParameters noeParameters;

    /**
     * Gets the value of the noeParameters property.
     * 
     * @return
     *     possible object is
     *     {@link AlcNoeParameters }
     *     
     */
    public AlcNoeParameters getNoeParameters() {
        return noeParameters;
    }

    /**
     * Sets the value of the noeParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcNoeParameters }
     *     
     */
    public void setNoeParameters(AlcNoeParameters value) {
        this.noeParameters = value;
    }

}
