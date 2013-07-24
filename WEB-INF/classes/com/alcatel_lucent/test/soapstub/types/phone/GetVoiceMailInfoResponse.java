
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
 *         &lt;element name="externalVoiceMail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="voiceMail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="voicemailNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "externalVoiceMail",
    "voiceMail",
    "voicemailNumber"
})
@XmlRootElement(name = "getVoiceMailInfoResponse")
public class GetVoiceMailInfoResponse
    extends AlcResult
{

    protected boolean externalVoiceMail;
    protected boolean voiceMail;
    @XmlElement(required = true, nillable = true)
    protected String voicemailNumber;

    /**
     * Gets the value of the externalVoiceMail property.
     * 
     */
    public boolean isExternalVoiceMail() {
        return externalVoiceMail;
    }

    /**
     * Sets the value of the externalVoiceMail property.
     * 
     */
    public void setExternalVoiceMail(boolean value) {
        this.externalVoiceMail = value;
    }

    /**
     * Gets the value of the voiceMail property.
     * 
     */
    public boolean isVoiceMail() {
        return voiceMail;
    }

    /**
     * Sets the value of the voiceMail property.
     * 
     */
    public void setVoiceMail(boolean value) {
        this.voiceMail = value;
    }

    /**
     * Gets the value of the voicemailNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoicemailNumber() {
        return voicemailNumber;
    }

    /**
     * Sets the value of the voicemailNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoicemailNumber(String value) {
        this.voicemailNumber = value;
    }

}
