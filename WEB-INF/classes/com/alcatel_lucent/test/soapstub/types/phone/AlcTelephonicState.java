
package com.alcatel_lucent.test.soapstub.types.phone;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the telephonic state of a line.
 * 
 * <p>Java class for AlcTelephonicState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcTelephonicState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calls" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony}AlcCall" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="capabilities" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony}AlcLineCapabilities"/>
 *         &lt;element name="currentCallRef" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcTelephonicState", propOrder = {
    "calls",
    "capabilities",
    "currentCallRef"
})
public class AlcTelephonicState {

    @XmlElement(nillable = true)
    protected List<AlcCall> calls;
    @XmlElement(required = true, nillable = true)
    protected AlcLineCapabilities capabilities;
    protected long currentCallRef;

    /**
     * Gets the value of the calls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlcCall }
     * 
     * 
     */
    public List<AlcCall> getCalls() {
        if (calls == null) {
            calls = new ArrayList<AlcCall>();
        }
        return this.calls;
    }

    /**
     * Gets the value of the capabilities property.
     * 
     * @return
     *     possible object is
     *     {@link AlcLineCapabilities }
     *     
     */
    public AlcLineCapabilities getCapabilities() {
        return capabilities;
    }

    /**
     * Sets the value of the capabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcLineCapabilities }
     *     
     */
    public void setCapabilities(AlcLineCapabilities value) {
        this.capabilities = value;
    }

    /**
     * Gets the value of the currentCallRef property.
     * 
     */
    public long getCurrentCallRef() {
        return currentCallRef;
    }

    /**
     * Sets the value of the currentCallRef property.
     * 
     */
    public void setCurrentCallRef(long value) {
        this.currentCallRef = value;
    }

}
