
package com.alcatel_lucent.test.soapstub.types.subscriber;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data for tandem behavior.
 * 
 * <p>Java class for AlcTandemData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcTandemData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tandemNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mainTandem" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="partialBusy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="longRingInPartialBusy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="specificSupervision" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcTandemData", propOrder = {
    "tandemNumber",
    "mainTandem",
    "partialBusy",
    "longRingInPartialBusy",
    "specificSupervision"
})
public class AlcTandemData {

    @XmlElement(required = true, nillable = true)
    protected String tandemNumber;
    protected boolean mainTandem;
    protected boolean partialBusy;
    protected boolean longRingInPartialBusy;
    protected boolean specificSupervision;

    /**
     * Gets the value of the tandemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTandemNumber() {
        return tandemNumber;
    }

    /**
     * Sets the value of the tandemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTandemNumber(String value) {
        this.tandemNumber = value;
    }

    /**
     * Gets the value of the mainTandem property.
     * 
     */
    public boolean isMainTandem() {
        return mainTandem;
    }

    /**
     * Sets the value of the mainTandem property.
     * 
     */
    public void setMainTandem(boolean value) {
        this.mainTandem = value;
    }

    /**
     * Gets the value of the partialBusy property.
     * 
     */
    public boolean isPartialBusy() {
        return partialBusy;
    }

    /**
     * Sets the value of the partialBusy property.
     * 
     */
    public void setPartialBusy(boolean value) {
        this.partialBusy = value;
    }

    /**
     * Gets the value of the longRingInPartialBusy property.
     * 
     */
    public boolean isLongRingInPartialBusy() {
        return longRingInPartialBusy;
    }

    /**
     * Sets the value of the longRingInPartialBusy property.
     * 
     */
    public void setLongRingInPartialBusy(boolean value) {
        this.longRingInPartialBusy = value;
    }

    /**
     * Gets the value of the specificSupervision property.
     * 
     */
    public boolean isSpecificSupervision() {
        return specificSupervision;
    }

    /**
     * Sets the value of the specificSupervision property.
     * 
     */
    public void setSpecificSupervision(boolean value) {
        this.specificSupervision = value;
    }

}
