
package com.alcatel_lucent.test.soapstub.types.phone;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes a call log item identifier. Two identifiers are equal if 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;timeId&lt;/code&gt;
 * </pre>
 *  and 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;code xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;diffId&lt;/code&gt;
 * </pre>
 *  are equal.
 * 
 * <p>Java class for AlcItemId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcItemId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="diffId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="timeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcItemId", propOrder = {
    "diffId",
    "timeId"
})
public class AlcItemId {

    protected long diffId;
    protected long timeId;

    /**
     * Gets the value of the diffId property.
     * 
     */
    public long getDiffId() {
        return diffId;
    }

    /**
     * Sets the value of the diffId property.
     * 
     */
    public void setDiffId(long value) {
        this.diffId = value;
    }

    /**
     * Gets the value of the timeId property.
     * 
     */
    public long getTimeId() {
        return timeId;
    }

    /**
     * Sets the value of the timeId property.
     * 
     */
    public void setTimeId(long value) {
        this.timeId = value;
    }

}
