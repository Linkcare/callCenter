
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
 *         &lt;element name="lineState" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony}AlcLineState"/>
 *         &lt;element name="nomadicState" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony}AlcNomadicState"/>
 *         &lt;element name="pcmmState" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony}AlcPcmmState"/>
 *         &lt;element name="staticState" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate}AlcStaticState"/>
 *         &lt;element name="telephonicState" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony}AlcTelephonicState"/>
 *         &lt;element name="nbCallBackNotif" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="voiceMessagesNb" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="textMessagesNb" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="faxNb" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
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
    "lineState",
    "nomadicState",
    "pcmmState",
    "staticState",
    "telephonicState",
    "nbCallBackNotif",
    "voiceMessagesNb",
    "textMessagesNb",
    "faxNb"
})
@XmlRootElement(name = "getGlobalPhoneStateResponse")
public class GetGlobalPhoneStateResponse
    extends AlcResult
{

    @XmlElement(required = true, nillable = true)
    protected AlcLineState lineState;
    @XmlElement(required = true, nillable = true)
    protected AlcNomadicState nomadicState;
    @XmlElement(required = true, nillable = true)
    protected AlcPcmmState pcmmState;
    @XmlElement(required = true, nillable = true)
    protected AlcStaticState staticState;
    @XmlElement(required = true, nillable = true)
    protected AlcTelephonicState telephonicState;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger nbCallBackNotif;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger voiceMessagesNb;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger textMessagesNb;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger faxNb;

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

    /**
     * Gets the value of the pcmmState property.
     * 
     * @return
     *     possible object is
     *     {@link AlcPcmmState }
     *     
     */
    public AlcPcmmState getPcmmState() {
        return pcmmState;
    }

    /**
     * Sets the value of the pcmmState property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcPcmmState }
     *     
     */
    public void setPcmmState(AlcPcmmState value) {
        this.pcmmState = value;
    }

    /**
     * Gets the value of the staticState property.
     * 
     * @return
     *     possible object is
     *     {@link AlcStaticState }
     *     
     */
    public AlcStaticState getStaticState() {
        return staticState;
    }

    /**
     * Sets the value of the staticState property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcStaticState }
     *     
     */
    public void setStaticState(AlcStaticState value) {
        this.staticState = value;
    }

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

    /**
     * Gets the value of the nbCallBackNotif property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNbCallBackNotif() {
        return nbCallBackNotif;
    }

    /**
     * Sets the value of the nbCallBackNotif property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNbCallBackNotif(BigInteger value) {
        this.nbCallBackNotif = value;
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

}
