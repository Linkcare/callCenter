
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

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
 *     &lt;extension base="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcResult">
 *       &lt;sequence>
 *         &lt;element name="nbLoadedExternalSubscribers" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "nbLoadedExternalSubscribers"
})
@XmlRootElement(name = "loadExternalSubscribersResponse")
public class LoadExternalSubscribersResponse
    extends AlcResult
{

    protected int nbLoadedExternalSubscribers;

    /**
     * Gets the value of the nbLoadedExternalSubscribers property.
     * 
     */
    public int getNbLoadedExternalSubscribers() {
        return nbLoadedExternalSubscribers;
    }

    /**
     * Sets the value of the nbLoadedExternalSubscribers property.
     * 
     */
    public void setNbLoadedExternalSubscribers(int value) {
        this.nbLoadedExternalSubscribers = value;
    }

}
