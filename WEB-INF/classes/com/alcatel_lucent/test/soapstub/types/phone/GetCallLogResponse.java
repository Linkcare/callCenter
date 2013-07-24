
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
 *     &lt;extension base="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema}AlcResult">
 *       &lt;sequence>
 *         &lt;element name="callLogItems" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony}AlcCallLogItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "callLogItems",
    "total"
})
@XmlRootElement(name = "getCallLogResponse")
public class GetCallLogResponse
    extends AlcResult
{

    @XmlElement(nillable = true)
    protected List<AlcCallLogItem> callLogItems;
    protected int total;

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
     * {@link AlcCallLogItem }
     * 
     * 
     */
    public List<AlcCallLogItem> getCallLogItems() {
        if (callLogItems == null) {
            callLogItems = new ArrayList<AlcCallLogItem>();
        }
        return this.callLogItems;
    }

    /**
     * Gets the value of the total property.
     * 
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     */
    public void setTotal(int value) {
        this.total = value;
    }

}
