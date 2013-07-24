
package com.alcatel_lucent.test.soapstub.types.subscriber;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Description of the 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;I xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Subscriber&lt;/I&gt;
 * </pre>
 * 's phone set.
 * 
 * <p>Java class for AlcPhoneSetData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcPhoneSetData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phoneSetType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="addons" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber}AlcAddOnType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcPhoneSetData", propOrder = {
    "phoneSetType",
    "addons"
})
public class AlcPhoneSetData {

    @XmlElement(required = true, nillable = true)
    protected String phoneSetType;
    protected List<AlcAddOnType> addons;

    /**
     * Gets the value of the phoneSetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneSetType() {
        return phoneSetType;
    }

    /**
     * Sets the value of the phoneSetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneSetType(String value) {
        this.phoneSetType = value;
    }

    /**
     * Gets the value of the addons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlcAddOnType }
     * 
     * 
     */
    public List<AlcAddOnType> getAddons() {
        if (addons == null) {
            addons = new ArrayList<AlcAddOnType>();
        }
        return this.addons;
    }

}
