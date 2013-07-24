
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
 *         &lt;element name="callLog" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="callRecord" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nomadic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="phonesetprogramming" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="repertory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="telephony" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "callLog",
    "callRecord",
    "nomadic",
    "phonesetprogramming",
    "repertory",
    "telephony"
})
@XmlRootElement(name = "getCapabilitiesResponse")
public class GetCapabilitiesResponse
    extends AlcResult
{

    protected boolean callLog;
    protected boolean callRecord;
    protected boolean nomadic;
    protected boolean phonesetprogramming;
    protected boolean repertory;
    protected boolean telephony;

    /**
     * Gets the value of the callLog property.
     * 
     */
    public boolean isCallLog() {
        return callLog;
    }

    /**
     * Sets the value of the callLog property.
     * 
     */
    public void setCallLog(boolean value) {
        this.callLog = value;
    }

    /**
     * Gets the value of the callRecord property.
     * 
     */
    public boolean isCallRecord() {
        return callRecord;
    }

    /**
     * Sets the value of the callRecord property.
     * 
     */
    public void setCallRecord(boolean value) {
        this.callRecord = value;
    }

    /**
     * Gets the value of the nomadic property.
     * 
     */
    public boolean isNomadic() {
        return nomadic;
    }

    /**
     * Sets the value of the nomadic property.
     * 
     */
    public void setNomadic(boolean value) {
        this.nomadic = value;
    }

    /**
     * Gets the value of the phonesetprogramming property.
     * 
     */
    public boolean isPhonesetprogramming() {
        return phonesetprogramming;
    }

    /**
     * Sets the value of the phonesetprogramming property.
     * 
     */
    public void setPhonesetprogramming(boolean value) {
        this.phonesetprogramming = value;
    }

    /**
     * Gets the value of the repertory property.
     * 
     */
    public boolean isRepertory() {
        return repertory;
    }

    /**
     * Sets the value of the repertory property.
     * 
     */
    public void setRepertory(boolean value) {
        this.repertory = value;
    }

    /**
     * Gets the value of the telephony property.
     * 
     */
    public boolean isTelephony() {
        return telephony;
    }

    /**
     * Sets the value of the telephony property.
     * 
     */
    public void setTelephony(boolean value) {
        this.telephony = value;
    }

}
