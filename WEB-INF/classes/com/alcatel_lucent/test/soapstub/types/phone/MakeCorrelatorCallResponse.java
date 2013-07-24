
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
 *         &lt;element name="callRef" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "callRef"
})
@XmlRootElement(name = "makeCorrelatorCallResponse")
public class MakeCorrelatorCallResponse
    extends AlcResult
{

    protected long callRef;

    /**
     * Gets the value of the callRef property.
     * 
     */
    public long getCallRef() {
        return callRef;
    }

    /**
     * Sets the value of the callRef property.
     * 
     */
    public void setCallRef(long value) {
        this.callRef = value;
    }

}
