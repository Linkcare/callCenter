
package com.alcatel_lucent.test.soapstub.types.fwmanagement;

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
 *     &lt;extension base="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcResult">
 *       &lt;sequence>
 *         &lt;element name="voiceMailBox" type="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcVoiceMailBox"/>
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
    "voiceMailBox"
})
@XmlRootElement(name = "getVoiceMailBoxResponse")
public class GetVoiceMailBoxResponse
    extends AlcResult
{

    @XmlElement(required = true, nillable = true)
    protected AlcVoiceMailBox voiceMailBox;

    /**
     * Gets the value of the voiceMailBox property.
     * 
     * @return
     *     possible object is
     *     {@link AlcVoiceMailBox }
     *     
     */
    public AlcVoiceMailBox getVoiceMailBox() {
        return voiceMailBox;
    }

    /**
     * Sets the value of the voiceMailBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcVoiceMailBox }
     *     
     */
    public void setVoiceMailBox(AlcVoiceMailBox value) {
        this.voiceMailBox = value;
    }

}
