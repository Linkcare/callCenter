
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
 *         &lt;element name="callPresent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="initialCalledNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="redirectedCall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="state" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony}AlcCallState"/>
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
    "callPresent",
    "initialCalledNumber",
    "name",
    "number",
    "redirectedCall",
    "state"
})
@XmlRootElement(name = "getCurrentCallInfoResponse")
public class GetCurrentCallInfoResponse
    extends AlcResult
{

    protected boolean callPresent;
    @XmlElement(required = true, nillable = true)
    protected String initialCalledNumber;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String number;
    protected boolean redirectedCall;
    @XmlElement(required = true, nillable = true)
    protected AlcCallState state;

    /**
     * Gets the value of the callPresent property.
     * 
     */
    public boolean isCallPresent() {
        return callPresent;
    }

    /**
     * Sets the value of the callPresent property.
     * 
     */
    public void setCallPresent(boolean value) {
        this.callPresent = value;
    }

    /**
     * Gets the value of the initialCalledNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialCalledNumber() {
        return initialCalledNumber;
    }

    /**
     * Sets the value of the initialCalledNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialCalledNumber(String value) {
        this.initialCalledNumber = value;
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
     * Gets the value of the redirectedCall property.
     * 
     */
    public boolean isRedirectedCall() {
        return redirectedCall;
    }

    /**
     * Sets the value of the redirectedCall property.
     * 
     */
    public void setRedirectedCall(boolean value) {
        this.redirectedCall = value;
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
