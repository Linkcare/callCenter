
package com.alcatel_lucent.test.soapstub.types.phone;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes a forward state.
 * 
 * <p>Java class for AlcForwardState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcForwardState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate}AlcForwardType"/>
 *         &lt;element name="targetType" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate}AlcForwardTargetType"/>
 *         &lt;element name="targetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ringingDuration" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcForwardState", namespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate", propOrder = {
    "type",
    "targetType",
    "targetNumber",
    "name",
    "firstName",
    "ringingDuration"
})
public class AlcForwardState {

    @XmlElement(required = true)
    protected AlcForwardType type;
    @XmlElement(required = true)
    protected AlcForwardTargetType targetType;
    @XmlElement(required = true, nillable = true)
    protected String targetNumber;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String firstName;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger ringingDuration;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AlcForwardType }
     *     
     */
    public AlcForwardType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcForwardType }
     *     
     */
    public void setType(AlcForwardType value) {
        this.type = value;
    }

    /**
     * Gets the value of the targetType property.
     * 
     * @return
     *     possible object is
     *     {@link AlcForwardTargetType }
     *     
     */
    public AlcForwardTargetType getTargetType() {
        return targetType;
    }

    /**
     * Sets the value of the targetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcForwardTargetType }
     *     
     */
    public void setTargetType(AlcForwardTargetType value) {
        this.targetType = value;
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
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the ringingDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRingingDuration() {
        return ringingDuration;
    }

    /**
     * Sets the value of the ringingDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRingingDuration(BigInteger value) {
        this.ringingDuration = value;
    }

}
