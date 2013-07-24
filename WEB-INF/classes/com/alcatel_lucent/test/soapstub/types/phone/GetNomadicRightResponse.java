
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
 *         &lt;element name="privatePhone" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="voip" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "privatePhone",
    "voip"
})
@XmlRootElement(name = "getNomadicRightResponse")
public class GetNomadicRightResponse
    extends AlcResult
{

    protected boolean privatePhone;
    protected boolean voip;

    /**
     * Gets the value of the privatePhone property.
     * 
     */
    public boolean isPrivatePhone() {
        return privatePhone;
    }

    /**
     * Sets the value of the privatePhone property.
     * 
     */
    public void setPrivatePhone(boolean value) {
        this.privatePhone = value;
    }

    /**
     * Gets the value of the voip property.
     * 
     */
    public boolean isVoip() {
        return voip;
    }

    /**
     * Sets the value of the voip property.
     * 
     */
    public void setVoip(boolean value) {
        this.voip = value;
    }

}
