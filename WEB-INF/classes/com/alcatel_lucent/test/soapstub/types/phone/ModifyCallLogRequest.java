
package com.alcatel_lucent.test.soapstub.types.phone;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="fwSessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="callLogItems" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony}AlcItemId" maxOccurs="unbounded"/>
 *         &lt;element name="acknowledge" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "lineNumber",
    "callLogItems",
    "acknowledge"
})
@XmlRootElement(name = "modifyCallLogRequest")
public class ModifyCallLogRequest {

    @XmlElement(required = true, nillable = true)
    protected String fwSessionId;
    @XmlElement(required = true, nillable = true)
    protected String lineNumber;
    @XmlElement(required = true)
    protected List<AlcItemId> callLogItems;
    protected boolean acknowledge;

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
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNumber(String value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the callLogItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callLogItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallLogItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlcItemId }
     * 
     * 
     */
    public List<AlcItemId> getCallLogItems() {
        if (callLogItems == null) {
            callLogItems = new ArrayList<AlcItemId>();
        }
        return this.callLogItems;
    }

    /**
     * Gets the value of the acknowledge property.
     * 
     */
    public boolean isAcknowledge() {
        return acknowledge;
    }

    /**
     * Sets the value of the acknowledge property.
     * 
     */
    public void setAcknowledge(boolean value) {
        this.acknowledge = value;
    }

}
