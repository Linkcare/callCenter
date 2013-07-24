
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.alcatel_lucent.test.soapstub.types.secondarysubscriber.AlcSecondarySubscriber;


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
 *         &lt;element name="secondarySubscribers" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/secondarysubscriber}AlcSecondarySubscriber" maxOccurs="unbounded" minOccurs="0"/>
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
    "secondarySubscribers"
})
@XmlRootElement(name = "getSecondarySubscribersListResponse")
public class GetSecondarySubscribersListResponse
    extends AlcResult
{

    protected List<AlcSecondarySubscriber> secondarySubscribers;

    /**
     * Gets the value of the secondarySubscribers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondarySubscribers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondarySubscribers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlcSecondarySubscriber }
     * 
     * 
     */
    public List<AlcSecondarySubscriber> getSecondarySubscribers() {
        if (secondarySubscribers == null) {
            secondarySubscribers = new ArrayList<AlcSecondarySubscriber>();
        }
        return this.secondarySubscribers;
    }

}
