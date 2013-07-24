
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
 *         &lt;element name="recordState" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony}AlcRecordState"/>
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
    "recordState"
})
@XmlRootElement(name = "getRecordStateResponse")
public class GetRecordStateResponse
    extends AlcResult
{

    @XmlElement(required = true, nillable = true)
    protected AlcRecordState recordState;

    /**
     * Gets the value of the recordState property.
     * 
     * @return
     *     possible object is
     *     {@link AlcRecordState }
     *     
     */
    public AlcRecordState getRecordState() {
        return recordState;
    }

    /**
     * Sets the value of the recordState property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcRecordState }
     *     
     */
    public void setRecordState(AlcRecordState value) {
        this.recordState = value;
    }

}
