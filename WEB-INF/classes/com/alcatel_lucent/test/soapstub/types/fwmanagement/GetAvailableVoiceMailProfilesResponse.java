
package com.alcatel_lucent.test.soapstub.types.fwmanagement;

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
 *     &lt;extension base="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcResult">
 *       &lt;sequence>
 *         &lt;element name="voiceMailProfiles" type="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcVoiceMailProfile" maxOccurs="unbounded" minOccurs="0"/>
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
    "voiceMailProfiles"
})
@XmlRootElement(name = "getAvailableVoiceMailProfilesResponse")
public class GetAvailableVoiceMailProfilesResponse
    extends AlcResult
{

    @XmlElement(nillable = true)
    protected List<AlcVoiceMailProfile> voiceMailProfiles;

    /**
     * Gets the value of the voiceMailProfiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voiceMailProfiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoiceMailProfiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlcVoiceMailProfile }
     * 
     * 
     */
    public List<AlcVoiceMailProfile> getVoiceMailProfiles() {
        if (voiceMailProfiles == null) {
            voiceMailProfiles = new ArrayList<AlcVoiceMailProfile>();
        }
        return this.voiceMailProfiles;
    }

}
