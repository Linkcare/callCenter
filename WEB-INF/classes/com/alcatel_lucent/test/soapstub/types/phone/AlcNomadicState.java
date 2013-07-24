
package com.alcatel_lucent.test.soapstub.types.phone;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the Nomadic state
 * 
 * <p>Java class for AlcNomadicState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcNomadicState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="homeNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mode" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony}AlcNomadicMode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcNomadicState", propOrder = {
    "homeNumber",
    "mode"
})
public class AlcNomadicState {

    @XmlElement(required = true, nillable = true)
    protected String homeNumber;
    @XmlElement(required = true, nillable = true)
    protected AlcNomadicMode mode;

    /**
     * Gets the value of the homeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeNumber() {
        return homeNumber;
    }

    /**
     * Sets the value of the homeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeNumber(String value) {
        this.homeNumber = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link AlcNomadicMode }
     *     
     */
    public AlcNomadicMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcNomadicMode }
     *     
     */
    public void setMode(AlcNomadicMode value) {
        this.mode = value;
    }

}
