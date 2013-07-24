
package com.alcatel_lucent.test.soapstub.types.phone;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the basic telephonic state of a line.
 * 
 * <p>Java class for AlcBasicTelephonicStateInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcBasicTelephonicStateInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lineState" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony}AlcBasicTelephonicState"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcBasicTelephonicStateInfo", propOrder = {
    "lineNumber",
    "lineState"
})
public class AlcBasicTelephonicStateInfo {

    @XmlElement(required = true)
    protected String lineNumber;
    @XmlElement(required = true)
    protected AlcBasicTelephonicState lineState;

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNumber(String value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the lineState property.
     * 
     * @return
     *     possible object is
     *     {@link AlcBasicTelephonicState }
     *     
     */
    public AlcBasicTelephonicState getLineState() {
        return lineState;
    }

    /**
     * Sets the value of the lineState property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcBasicTelephonicState }
     *     
     */
    public void setLineState(AlcBasicTelephonicState value) {
        this.lineState = value;
    }

}
