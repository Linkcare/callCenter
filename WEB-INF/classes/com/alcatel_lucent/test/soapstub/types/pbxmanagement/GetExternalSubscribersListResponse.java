
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.alcatel_lucent.test.soapstub.types.externalsubscriber.AlcExternalSubscriber;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcResult">
 *       &lt;sequence>
 *         &lt;element name="externalSubscribers" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/externalsubscriber}AlcExternalSubscriber" maxOccurs="unbounded" minOccurs="0"/>
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
    "externalSubscribers"
})
@XmlRootElement(name = "getExternalSubscribersListResponse")
public class GetExternalSubscribersListResponse
    extends AlcResult
{

    protected List<AlcExternalSubscriber> externalSubscribers;

    /**
     * Gets the value of the externalSubscribers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalSubscribers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalSubscribers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlcExternalSubscriber }
     * 
     * 
     */
    public List<AlcExternalSubscriber> getExternalSubscribers() {
        if (externalSubscribers == null) {
            externalSubscribers = new ArrayList<AlcExternalSubscriber>();
        }
        return this.externalSubscribers;
    }

}
