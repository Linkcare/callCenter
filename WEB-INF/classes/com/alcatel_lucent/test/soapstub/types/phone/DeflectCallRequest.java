
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fwSessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="callRef" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="targetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fwSessionId",
    "lineNumber",
    "callRef",
    "targetNumber"
})
@XmlRootElement(name = "deflectCallRequest")
public class DeflectCallRequest {

    @XmlElement(required = true, nillable = true)
    protected String fwSessionId;
    @XmlElement(required = true, nillable = true)
    protected String lineNumber;
    protected long callRef;
    @XmlElement(required = true)
    protected String targetNumber;

    /**
     * Gets the value of the fwSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFwSessionId() {
        return fwSessionId;
    }

    /**
     * Sets the value of the fwSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFwSessionId(String value) {
        this.fwSessionId = value;
    }

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
     * Gets the value of the targetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetNumber() {
        return targetNumber;
    }

    /**
     * Sets the value of the targetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetNumber(String value) {
        this.targetNumber = value;
    }

}
