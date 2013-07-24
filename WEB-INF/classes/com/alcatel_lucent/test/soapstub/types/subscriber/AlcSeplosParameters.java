
package com.alcatel_lucent.test.soapstub.types.subscriber;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcSeplosParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcSeplosParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phoneCosId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcSeplosParameters", propOrder = {
    "phoneCosId"
})
public class AlcSeplosParameters {

    protected int phoneCosId;

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

}
