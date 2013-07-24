
package com.alcatel_lucent.test.soapstub.types.fwmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 *             Describes an OTS account. When a user is authorized to use MyPhone (application, API or restricted API),
 *             an account is created on OTS. The OTS account is composed of one main OTS line and up to two secondary OTS lines.
 *          &lt;/p&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 *             At &lt;i&gt;Framework User&lt;/i&gt; creation (&lt;code&gt;createFrameworkUser&lt;/code&gt; command), the OTS account is automaticaly created 
 *             with the main line matching the company phone.&lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>Java class for AlcOtsAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcOtsAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mainLine" type="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcOtsLine"/>
 *         &lt;element name="secondaryLines" type="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcOtsLine" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcOtsAccount", propOrder = {
    "mainLine",
    "secondaryLines"
})
public class AlcOtsAccount {

    @XmlElement(required = true)
    protected AlcOtsLine mainLine;
    @XmlElement(nillable = true)
    protected List<AlcOtsLine> secondaryLines;

    /**
     * Gets the value of the mainLine property.
     * 
     * @return
     *     possible object is
     *     {@link AlcOtsLine }
     *     
     */
    public AlcOtsLine getMainLine() {
        return mainLine;
    }

    /**
     * Sets the value of the mainLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcOtsLine }
     *     
     */
    public void setMainLine(AlcOtsLine value) {
        this.mainLine = value;
    }

    /**
     * Gets the value of the secondaryLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlcOtsLine }
     * 
     * 
     */
    public List<AlcOtsLine> getSecondaryLines() {
        if (secondaryLines == null) {
            secondaryLines = new ArrayList<AlcOtsLine>();
        }
        return this.secondaryLines;
    }

}
