
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fwSessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="nbItems" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="filtered" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "index",
    "nbItems",
    "filtered"
})
@XmlRootElement(name = "getCallLogRequest")
public class GetCallLogRequest {

    @XmlElement(required = true, nillable = true)
    protected String fwSessionId;
    @XmlElement(required = true, nillable = true)
    protected String lineNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger index;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger nbItems;
    protected boolean filtered;

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
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndex(BigInteger value) {
        this.index = value;
    }

    /**
     * Gets the value of the nbItems property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNbItems() {
        return nbItems;
    }

    /**
     * Sets the value of the nbItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNbItems(BigInteger value) {
        this.nbItems = value;
    }

    /**
     * Gets the value of the filtered property.
     * 
     */
    public boolean isFiltered() {
        return filtered;
    }

    /**
     * Sets the value of the filtered property.
     * 
     */
    public void setFiltered(boolean value) {
        this.filtered = value;
    }

}
