
package com.alcatel_lucent.test.soapstub.types.subscriber;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcIpParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcIpParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="voiceCodingAlgorithm" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber}AlcVoiceCodingAlgorithm"/>
 *         &lt;element name="useVolumeInSystem" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="localVolume" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="resetForUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ipSoftphoneEmulation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcIpParameters", propOrder = {
    "voiceCodingAlgorithm",
    "useVolumeInSystem",
    "localVolume",
    "resetForUpdate",
    "ipSoftphoneEmulation"
})
public class AlcIpParameters {

    @XmlElement(required = true)
    protected AlcVoiceCodingAlgorithm voiceCodingAlgorithm;
    protected boolean useVolumeInSystem;
    protected int localVolume;
    protected boolean resetForUpdate;
    protected boolean ipSoftphoneEmulation;

    /**
     * Gets the value of the voiceCodingAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link AlcVoiceCodingAlgorithm }
     *     
     */
    public AlcVoiceCodingAlgorithm getVoiceCodingAlgorithm() {
        return voiceCodingAlgorithm;
    }

    /**
     * Sets the value of the voiceCodingAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcVoiceCodingAlgorithm }
     *     
     */
    public void setVoiceCodingAlgorithm(AlcVoiceCodingAlgorithm value) {
        this.voiceCodingAlgorithm = value;
    }

    /**
     * Gets the value of the useVolumeInSystem property.
     * 
     */
    public boolean isUseVolumeInSystem() {
        return useVolumeInSystem;
    }

    /**
     * Sets the value of the useVolumeInSystem property.
     * 
     */
    public void setUseVolumeInSystem(boolean value) {
        this.useVolumeInSystem = value;
    }

    /**
     * Gets the value of the localVolume property.
     * 
     */
    public int getLocalVolume() {
        return localVolume;
    }

    /**
     * Sets the value of the localVolume property.
     * 
     */
    public void setLocalVolume(int value) {
        this.localVolume = value;
    }

    /**
     * Gets the value of the resetForUpdate property.
     * 
     */
    public boolean isResetForUpdate() {
        return resetForUpdate;
    }

    /**
     * Sets the value of the resetForUpdate property.
     * 
     */
    public void setResetForUpdate(boolean value) {
        this.resetForUpdate = value;
    }

    /**
     * Gets the value of the ipSoftphoneEmulation property.
     * 
     */
    public boolean isIpSoftphoneEmulation() {
        return ipSoftphoneEmulation;
    }

    /**
     * Sets the value of the ipSoftphoneEmulation property.
     * 
     */
    public void setIpSoftphoneEmulation(boolean value) {
        this.ipSoftphoneEmulation = value;
    }

}
