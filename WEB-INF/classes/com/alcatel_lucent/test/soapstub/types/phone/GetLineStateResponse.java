
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
 *         &lt;element name="lineState" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony}AlcLineState"/>
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
    "lineState"
})
@XmlRootElement(name = "getLineStateResponse")
public class GetLineStateResponse
    extends AlcResult
{

    @XmlElement(required = true, nillable = true)
    protected AlcLineState lineState;

    /**
     * Gets the value of the lineState property.
     * 
     * @return
     *     possible object is
     *     {@link AlcLineState }
     *     
     */
    public AlcLineState getLineState() {
        return lineState;
    }

    /**
     * Sets the value of the lineState property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcLineState }
     *     
     */
    public void setLineState(AlcLineState value) {
        this.lineState = value;
    }

}
