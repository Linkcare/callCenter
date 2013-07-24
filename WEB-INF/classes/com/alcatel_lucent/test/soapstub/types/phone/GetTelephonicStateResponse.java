
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
 *         &lt;element name="telephonicState" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony}AlcTelephonicState"/>
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
    "telephonicState"
})
@XmlRootElement(name = "getTelephonicStateResponse")
public class GetTelephonicStateResponse
    extends AlcResult
{

    @XmlElement(required = true, nillable = true)
    protected AlcTelephonicState telephonicState;

    /**
     * Gets the value of the telephonicState property.
     * 
     * @return
     *     possible object is
     *     {@link AlcTelephonicState }
     *     
     */
    public AlcTelephonicState getTelephonicState() {
        return telephonicState;
    }

    /**
     * Sets the value of the telephonicState property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcTelephonicState }
     *     
     */
    public void setTelephonicState(AlcTelephonicState value) {
        this.telephonicState = value;
    }

}
