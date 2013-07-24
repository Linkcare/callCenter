
package com.alcatel_lucent.test.soapstub.types.fwmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="nbLoadedVoiceMailBoxes" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "nbLoadedVoiceMailBoxes"
})
@XmlRootElement(name = "loadVoiceMailBoxesResponse")
public class LoadVoiceMailBoxesResponse
    extends AlcResult
{

    protected int nbLoadedVoiceMailBoxes;

    /**
     * Gets the value of the nbLoadedVoiceMailBoxes property.
     * 
     */
    public int getNbLoadedVoiceMailBoxes() {
        return nbLoadedVoiceMailBoxes;
    }

    /**
     * Sets the value of the nbLoadedVoiceMailBoxes property.
     * 
     */
    public void setNbLoadedVoiceMailBoxes(int value) {
        this.nbLoadedVoiceMailBoxes = value;
    }

}
