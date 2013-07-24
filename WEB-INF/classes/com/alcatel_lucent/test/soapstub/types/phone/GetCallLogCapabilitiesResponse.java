
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
 *         &lt;element name="deleteAllCallLog" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deleteCallLog" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="getCallLog" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="getNbUnansweredCall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="modifyCallLog" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "deleteAllCallLog",
    "deleteCallLog",
    "getCallLog",
    "getNbUnansweredCall",
    "modifyCallLog"
})
@XmlRootElement(name = "getCallLogCapabilitiesResponse")
public class GetCallLogCapabilitiesResponse
    extends AlcResult
{

    protected boolean deleteAllCallLog;
    protected boolean deleteCallLog;
    protected boolean getCallLog;
    protected boolean getNbUnansweredCall;
    protected boolean modifyCallLog;

    /**
     * Gets the value of the deleteAllCallLog property.
     * 
     */
    public boolean isDeleteAllCallLog() {
        return deleteAllCallLog;
    }

    /**
     * Sets the value of the deleteAllCallLog property.
     * 
     */
    public void setDeleteAllCallLog(boolean value) {
        this.deleteAllCallLog = value;
    }

    /**
     * Gets the value of the deleteCallLog property.
     * 
     */
    public boolean isDeleteCallLog() {
        return deleteCallLog;
    }

    /**
     * Sets the value of the deleteCallLog property.
     * 
     */
    public void setDeleteCallLog(boolean value) {
        this.deleteCallLog = value;
    }

    /**
     * Gets the value of the getCallLog property.
     * 
     */
    public boolean isGetCallLog() {
        return getCallLog;
    }

    /**
     * Sets the value of the getCallLog property.
     * 
     */
    public void setGetCallLog(boolean value) {
        this.getCallLog = value;
    }

    /**
     * Gets the value of the getNbUnansweredCall property.
     * 
     */
    public boolean isGetNbUnansweredCall() {
        return getNbUnansweredCall;
    }

    /**
     * Sets the value of the getNbUnansweredCall property.
     * 
     */
    public void setGetNbUnansweredCall(boolean value) {
        this.getNbUnansweredCall = value;
    }

    /**
     * Gets the value of the modifyCallLog property.
     * 
     */
    public boolean isModifyCallLog() {
        return modifyCallLog;
    }

    /**
     * Sets the value of the modifyCallLog property.
     * 
     */
    public void setModifyCallLog(boolean value) {
        this.modifyCallLog = value;
    }

}
