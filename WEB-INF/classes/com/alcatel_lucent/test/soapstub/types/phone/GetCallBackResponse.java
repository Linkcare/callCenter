
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
 *         &lt;element name="callBackRequests" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony}AlcCallBack" maxOccurs="unbounded" minOccurs="0"/>
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
    "callBackRequests"
})
@XmlRootElement(name = "getCallBackResponse")
public class GetCallBackResponse
    extends AlcResult
{

    @XmlElement(nillable = true)
    protected List<AlcCallBack> callBackRequests;

    /**
     * Gets the value of the callBackRequests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callBackRequests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallBackRequests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlcCallBack }
     * 
     * 
     */
    public List<AlcCallBack> getCallBackRequests() {
        if (callBackRequests == null) {
            callBackRequests = new ArrayList<AlcCallBack>();
        }
        return this.callBackRequests;
    }

}
