
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.alcatel_lucent.test.soapstub.types.secondarysubscriber.AlcSecondarySubscriber;


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
 *         &lt;element name="pbxName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="secondarySubscriber" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/secondarysubscriber}AlcSecondarySubscriber"/>
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
    "pbxName",
    "secondarySubscriber"
})
@XmlRootElement(name = "setSecondarySubscriberRequest")
public class SetSecondarySubscriberRequest {

    @XmlElement(required = true, nillable = true)
    protected String fwSessionId;
    @XmlElement(required = true, nillable = true)
    protected String pbxName;
    @XmlElement(required = true)
    protected AlcSecondarySubscriber secondarySubscriber;

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
     * Gets the value of the pbxName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPbxName() {
        return pbxName;
    }

    /**
     * Sets the value of the pbxName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPbxName(String value) {
        this.pbxName = value;
    }

    /**
     * Gets the value of the secondarySubscriber property.
     * 
     * @return
     *     possible object is
     *     {@link AlcSecondarySubscriber }
     *     
     */
    public AlcSecondarySubscriber getSecondarySubscriber() {
        return secondarySubscriber;
    }

    /**
     * Sets the value of the secondarySubscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcSecondarySubscriber }
     *     
     */
    public void setSecondarySubscriber(AlcSecondarySubscriber value) {
        this.secondarySubscriber = value;
    }

}
