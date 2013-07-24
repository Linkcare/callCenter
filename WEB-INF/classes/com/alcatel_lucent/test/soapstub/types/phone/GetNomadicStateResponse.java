
package com.alcatel_lucent.test.soapstub.types.phone;

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
 *     &lt;extension base="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema}AlcResult">
 *       &lt;sequence>
 *         &lt;element name="nomadicState" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony}AlcNomadicState"/>
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
    "nomadicState"
})
@XmlRootElement(name = "getNomadicStateResponse")
public class GetNomadicStateResponse
    extends AlcResult
{

    @XmlElement(required = true, nillable = true)
    protected AlcNomadicState nomadicState;

    /**
     * Gets the value of the nomadicState property.
     * 
     * @return
     *     possible object is
     *     {@link AlcNomadicState }
     *     
     */
    public AlcNomadicState getNomadicState() {
        return nomadicState;
    }

    /**
     * Sets the value of the nomadicState property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcNomadicState }
     *     
     */
    public void setNomadicState(AlcNomadicState value) {
        this.nomadicState = value;
    }

}
