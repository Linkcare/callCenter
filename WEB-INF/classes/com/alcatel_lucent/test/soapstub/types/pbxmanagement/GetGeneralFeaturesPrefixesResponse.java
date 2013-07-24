
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

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
 *     &lt;extension base="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcResult">
 *       &lt;sequence>
 *         &lt;element name="groupCallPickUp" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="directCallPickUp" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="agentPocessingGroupCallPickUp" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    "groupCallPickUp",
    "directCallPickUp",
    "agentPocessingGroupCallPickUp"
})
@XmlRootElement(name = "getGeneralFeaturesPrefixesResponse")
public class GetGeneralFeaturesPrefixesResponse
    extends AlcResult
{

    @XmlElement(nillable = true)
    protected List<String> groupCallPickUp;
    @XmlElement(nillable = true)
    protected List<String> directCallPickUp;
    @XmlElement(nillable = true)
    protected List<String> agentPocessingGroupCallPickUp;

    /**
     * Gets the value of the groupCallPickUp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupCallPickUp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupCallPickUp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGroupCallPickUp() {
        if (groupCallPickUp == null) {
            groupCallPickUp = new ArrayList<String>();
        }
        return this.groupCallPickUp;
    }

    /**
     * Gets the value of the directCallPickUp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directCallPickUp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectCallPickUp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDirectCallPickUp() {
        if (directCallPickUp == null) {
            directCallPickUp = new ArrayList<String>();
        }
        return this.directCallPickUp;
    }

    /**
     * Gets the value of the agentPocessingGroupCallPickUp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agentPocessingGroupCallPickUp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgentPocessingGroupCallPickUp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAgentPocessingGroupCallPickUp() {
        if (agentPocessingGroupCallPickUp == null) {
            agentPocessingGroupCallPickUp = new ArrayList<String>();
        }
        return this.agentPocessingGroupCallPickUp;
    }

}
