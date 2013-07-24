
package com.alcatel_lucent.test.soapstub.types.phone;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="nbUnansweredCalls" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
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
    "nbUnansweredCalls"
})
@XmlRootElement(name = "getNbUnansweredCallResponse")
public class GetNbUnansweredCallResponse
    extends AlcResult
{

    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger nbUnansweredCalls;

    /**
     * Gets the value of the nbUnansweredCalls property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNbUnansweredCalls() {
        return nbUnansweredCalls;
    }

    /**
     * Sets the value of the nbUnansweredCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNbUnansweredCalls(BigInteger value) {
        this.nbUnansweredCalls = value;
    }

}
