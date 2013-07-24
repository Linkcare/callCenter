
package com.alcatel_lucent.test.soapstub.types.phone;

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
 *     &lt;extension base="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema}AlcResult">
 *       &lt;sequence>
 *         &lt;element name="voipReady" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "voipReady"
})
@XmlRootElement(name = "isVoipReadyResponse")
public class IsVoipReadyResponse
    extends AlcResult
{

    protected boolean voipReady;

    /**
     * Gets the value of the voipReady property.
     * 
     */
    public boolean isVoipReady() {
        return voipReady;
    }

    /**
     * Sets the value of the voipReady property.
     * 
     */
    public void setVoipReady(boolean value) {
        this.voipReady = value;
    }

}
