
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.alcatel_lucent.test.soapstub.types.huntinggroup.AlcHuntingGroup;


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
 *         &lt;element name="huntingGroup" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/huntinggroup}AlcHuntingGroup"/>
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
    "huntingGroup"
})
@XmlRootElement(name = "getHuntingGroupResponse")
public class GetHuntingGroupResponse
    extends AlcResult
{

    @XmlElement(required = true, nillable = true)
    protected AlcHuntingGroup huntingGroup;

    /**
     * Gets the value of the huntingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link AlcHuntingGroup }
     *     
     */
    public AlcHuntingGroup getHuntingGroup() {
        return huntingGroup;
    }

    /**
     * Sets the value of the huntingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcHuntingGroup }
     *     
     */
    public void setHuntingGroup(AlcHuntingGroup value) {
        this.huntingGroup = value;
    }

}
