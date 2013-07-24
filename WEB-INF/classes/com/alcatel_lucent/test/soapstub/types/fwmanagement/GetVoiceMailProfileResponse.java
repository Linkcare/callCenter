
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
 *         &lt;element name="voiceMailProfile" type="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcVoiceMailProfile"/>
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
    "voiceMailProfile"
})
@XmlRootElement(name = "getVoiceMailProfileResponse")
public class GetVoiceMailProfileResponse
    extends AlcResult
{

    @XmlElement(required = true, nillable = true)
    protected AlcVoiceMailProfile voiceMailProfile;

    /**
     * Gets the value of the voiceMailProfile property.
     * 
     * @return
     *     possible object is
     *     {@link AlcVoiceMailProfile }
     *     
     */
    public AlcVoiceMailProfile getVoiceMailProfile() {
        return voiceMailProfile;
    }

    /**
     * Sets the value of the voiceMailProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcVoiceMailProfile }
     *     
     */
    public void setVoiceMailProfile(AlcVoiceMailProfile value) {
        this.voiceMailProfile = value;
    }

}
