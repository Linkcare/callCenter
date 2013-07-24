
package com.alcatel_lucent.test.soapstub.types.phone;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes a phone set's static state.
 * 
 * <p>Java class for AlcStaticState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcStaticState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="campOnActivated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="remoteExtensionActivated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="doNotDisturbActivated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="forwardState" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate}AlcForwardState"/>
 *         &lt;element name="overflowType" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate}AlcOverflowType"/>
 *         &lt;element name="associate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcStaticState", namespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate", propOrder = {
    "locked",
    "campOnActivated",
    "remoteExtensionActivated",
    "doNotDisturbActivated",
    "forwardState",
    "overflowType",
    "associate"
})
public class AlcStaticState {

    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean locked;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean campOnActivated;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean remoteExtensionActivated;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean doNotDisturbActivated;
    @XmlElement(required = true, nillable = true)
    protected AlcForwardState forwardState;
    @XmlElement(required = true, nillable = true)
    protected AlcOverflowType overflowType;
    @XmlElement(required = true, nillable = true)
    protected String associate;

    /**
     * Gets the value of the locked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocked() {
        return locked;
    }

    /**
     * Sets the value of the locked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocked(Boolean value) {
        this.locked = value;
    }

    /**
     * Gets the value of the campOnActivated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCampOnActivated() {
        return campOnActivated;
    }

    /**
     * Sets the value of the campOnActivated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCampOnActivated(Boolean value) {
        this.campOnActivated = value;
    }

    /**
     * Gets the value of the remoteExtensionActivated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoteExtensionActivated() {
        return remoteExtensionActivated;
    }

    /**
     * Sets the value of the remoteExtensionActivated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoteExtensionActivated(Boolean value) {
        this.remoteExtensionActivated = value;
    }

    /**
     * Gets the value of the doNotDisturbActivated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoNotDisturbActivated() {
        return doNotDisturbActivated;
    }

    /**
     * Sets the value of the doNotDisturbActivated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoNotDisturbActivated(Boolean value) {
        this.doNotDisturbActivated = value;
    }

    /**
     * Gets the value of the forwardState property.
     * 
     * @return
     *     possible object is
     *     {@link AlcForwardState }
     *     
     */
    public AlcForwardState getForwardState() {
        return forwardState;
    }

    /**
     * Sets the value of the forwardState property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcForwardState }
     *     
     */
    public void setForwardState(AlcForwardState value) {
        this.forwardState = value;
    }

    /**
     * Gets the value of the overflowType property.
     * 
     * @return
     *     possible object is
     *     {@link AlcOverflowType }
     *     
     */
    public AlcOverflowType getOverflowType() {
        return overflowType;
    }

    /**
     * Sets the value of the overflowType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcOverflowType }
     *     
     */
    public void setOverflowType(AlcOverflowType value) {
        this.overflowType = value;
    }

    /**
     * Gets the value of the associate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociate() {
        return associate;
    }

    /**
     * Sets the value of the associate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociate(String value) {
        this.associate = value;
    }

}
