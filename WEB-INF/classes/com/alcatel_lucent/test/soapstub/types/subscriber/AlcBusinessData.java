
package com.alcatel_lucent.test.soapstub.types.subscriber;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Description of the business data of the 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;I xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Subscriber&lt;/I&gt;
 * </pre>
 * .
 * 
 * <p>Java class for AlcBusinessData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcBusinessData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="costCenter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="entity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcBusinessData", propOrder = {
    "costCenter",
    "entity"
})
public class AlcBusinessData {

    protected int costCenter;
    protected int entity;

    /**
     * Gets the value of the costCenter property.
     * 
     */
    public int getCostCenter() {
        return costCenter;
    }

    /**
     * Sets the value of the costCenter property.
     * 
     */
    public void setCostCenter(int value) {
        this.costCenter = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     */
    public int getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     */
    public void setEntity(int value) {
        this.entity = value;
    }

}
