
package com.alcatel_lucent.test.soapstub.types.subscriber;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcNoeParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcNoeParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationCos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="phoneCosId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="defaultHomePage" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber}AlcNoeHomePage"/>
 *         &lt;element name="applicationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcNoeParameters", propOrder = {
    "applicationCos",
    "phoneCosId",
    "serialNumber",
    "defaultHomePage",
    "applicationId"
})
public class AlcNoeParameters {

    protected int applicationCos;
    protected int phoneCosId;
    @XmlElement(required = true, nillable = true)
    protected String serialNumber;
    @XmlElement(required = true)
    protected AlcNoeHomePage defaultHomePage;
    @XmlElement(required = true, nillable = true)
    protected String applicationId;

    /**
     * Gets the value of the applicationCos property.
     * 
     */
    public int getApplicationCos() {
        return applicationCos;
    }

    /**
     * Sets the value of the applicationCos property.
     * 
     */
    public void setApplicationCos(int value) {
        this.applicationCos = value;
    }

    /**
     * Gets the value of the phoneCosId property.
     * 
     */
    public int getPhoneCosId() {
        return phoneCosId;
    }

    /**
     * Sets the value of the phoneCosId property.
     * 
     */
    public void setPhoneCosId(int value) {
        this.phoneCosId = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the defaultHomePage property.
     * 
     * @return
     *     possible object is
     *     {@link AlcNoeHomePage }
     *     
     */
    public AlcNoeHomePage getDefaultHomePage() {
        return defaultHomePage;
    }

    /**
     * Sets the value of the defaultHomePage property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcNoeHomePage }
     *     
     */
    public void setDefaultHomePage(AlcNoeHomePage value) {
        this.defaultHomePage = value;
    }

    /**
     * Gets the value of the applicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationId(String value) {
        this.applicationId = value;
    }

}
