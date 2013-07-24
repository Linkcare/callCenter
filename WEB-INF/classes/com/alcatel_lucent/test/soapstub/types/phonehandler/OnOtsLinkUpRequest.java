
package com.alcatel_lucent.test.soapstub.types.phonehandler;

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
 *         &lt;element name="otsId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "otsId"
})
@XmlRootElement(name = "onOtsLinkUpRequest")
public class OnOtsLinkUpRequest {

    @XmlElement(required = true)
    protected String otsId;

    /**
     * Gets the value of the otsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtsId() {
        return otsId;
    }

    /**
     * Sets the value of the otsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtsId(String value) {
        this.otsId = value;
    }

}
