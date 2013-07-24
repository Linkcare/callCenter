
package com.alcatel_lucent.test.soapstub.types.fwmanagement;

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
 *         &lt;element name="otsAccount" type="{http://www.alcatel-lucent.com/wsp/ns/2008/07/30/ics/fwmanagementSchema}AlcOtsAccount"/>
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
    "otsAccount"
})
@XmlRootElement(name = "getOtsAccountResponse")
public class GetOtsAccountResponse
    extends AlcResult
{

    @XmlElement(required = true, nillable = true)
    protected AlcOtsAccount otsAccount;

    /**
     * Gets the value of the otsAccount property.
     * 
     * @return
     *     possible object is
     *     {@link AlcOtsAccount }
     *     
     */
    public AlcOtsAccount getOtsAccount() {
        return otsAccount;
    }

    /**
     * Sets the value of the otsAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcOtsAccount }
     *     
     */
    public void setOtsAccount(AlcOtsAccount value) {
        this.otsAccount = value;
    }

}
