
package com.alcatel_lucent.test.soapstub.types.phone;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes a call
 * 
 * <p>Java class for AlcCall complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcCall">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="callRef" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="capabilities" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony}AlcCallCapabilities"/>
 *         &lt;element name="correlator" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="msgType" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony}AlcMessageType"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony}AlcCallState"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcCall", propOrder = {
    "callRef",
    "capabilities",
    "correlator",
    "message",
    "msgType",
    "name",
    "number",
    "state"
})
public class AlcCall {

    protected long callRef;
    @XmlElement(required = true, nillable = true)
    protected AlcCallCapabilities capabilities;
    @XmlElement(required = true, nillable = true)
    protected byte[] correlator;
    @XmlElement(required = true, nillable = true)
    protected String message;
    @XmlElement(required = true, nillable = true)
    protected AlcMessageType msgType;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String number;
    @XmlElement(required = true, nillable = true)
    protected AlcCallState state;

    /**
     * Gets the value of the callRef property.
     * 
     */
    public long getCallRef() {
        return callRef;
    }

    /**
     * Sets the value of the callRef property.
     * 
     */
    public void setCallRef(long value) {
        this.callRef = value;
    }

    /**
     * Gets the value of the capabilities property.
     * 
     * @return
     *     possible object is
     *     {@link AlcCallCapabilities }
     *     
     */
    public AlcCallCapabilities getCapabilities() {
        return capabilities;
    }

    /**
     * Sets the value of the capabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcCallCapabilities }
     *     
     */
    public void setCapabilities(AlcCallCapabilities value) {
        this.capabilities = value;
    }

    /**
     * Gets the value of the correlator property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCorrelator() {
        return correlator;
    }

    /**
     * Sets the value of the correlator property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCorrelator(byte[] value) {
        this.correlator = ((byte[]) value);
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the msgType property.
     * 
     * @return
     *     possible object is
     *     {@link AlcMessageType }
     *     
     */
    public AlcMessageType getMsgType() {
        return msgType;
    }

    /**
     * Sets the value of the msgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcMessageType }
     *     
     */
    public void setMsgType(AlcMessageType value) {
        this.msgType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link AlcCallState }
     *     
     */
    public AlcCallState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcCallState }
     *     
     */
    public void setState(AlcCallState value) {
        this.state = value;
    }

}
