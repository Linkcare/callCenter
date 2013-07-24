
package com.alcatel_lucent.test.soapstub.types.fwmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *          Describes add-on management information for the 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Framework User&lt;/i&gt;
 * </pre>
 * .
 *       
 * 
 * <p>Java class for AlcAddOn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcAddOn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operationType" type="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcAddOnOperationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcAddOn", propOrder = {
    "applicationName",
    "data",
    "operationType"
})
public class AlcAddOn {

    @XmlElement(required = true, nillable = true)
    protected String applicationName;
    @XmlElement(required = true, nillable = true)
    protected String data;
    @XmlElement(required = true, nillable = true)
    protected AlcAddOnOperationType operationType;

    /**
     * Gets the value of the applicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * Sets the value of the applicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationName(String value) {
        this.applicationName = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link AlcAddOnOperationType }
     *     
     */
    public AlcAddOnOperationType getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcAddOnOperationType }
     *     
     */
    public void setOperationType(AlcAddOnOperationType value) {
        this.operationType = value;
    }

}
