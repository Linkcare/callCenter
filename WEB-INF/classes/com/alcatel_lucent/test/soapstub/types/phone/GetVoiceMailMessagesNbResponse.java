
package com.alcatel_lucent.test.soapstub.types.phone;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="faxNb" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="textMessagesNb" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="voiceMessagesNb" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
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
    "faxNb",
    "textMessagesNb",
    "voiceMessagesNb"
})
@XmlRootElement(name = "getVoiceMailMessagesNbResponse")
public class GetVoiceMailMessagesNbResponse
    extends AlcResult
{

    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger faxNb;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger textMessagesNb;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger voiceMessagesNb;

    /**
     * Gets the value of the faxNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFaxNb() {
        return faxNb;
    }

    /**
     * Sets the value of the faxNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFaxNb(BigInteger value) {
        this.faxNb = value;
    }

    /**
     * Gets the value of the textMessagesNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTextMessagesNb() {
        return textMessagesNb;
    }

    /**
     * Sets the value of the textMessagesNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTextMessagesNb(BigInteger value) {
        this.textMessagesNb = value;
    }

    /**
     * Gets the value of the voiceMessagesNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVoiceMessagesNb() {
        return voiceMessagesNb;
    }

    /**
     * Sets the value of the voiceMessagesNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVoiceMessagesNb(BigInteger value) {
        this.voiceMessagesNb = value;
    }

}
