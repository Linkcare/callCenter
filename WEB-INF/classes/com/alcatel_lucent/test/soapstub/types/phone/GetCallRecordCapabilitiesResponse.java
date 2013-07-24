
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
 *         &lt;element name="continueRecord" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="getRecordState" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pauseRecord" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="startRecord" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="stopRecord" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "continueRecord",
    "getRecordState",
    "pauseRecord",
    "startRecord",
    "stopRecord"
})
@XmlRootElement(name = "getCallRecordCapabilitiesResponse")
public class GetCallRecordCapabilitiesResponse
    extends AlcResult
{

    protected boolean continueRecord;
    protected boolean getRecordState;
    protected boolean pauseRecord;
    protected boolean startRecord;
    protected boolean stopRecord;

    /**
     * Gets the value of the continueRecord property.
     * 
     */
    public boolean isContinueRecord() {
        return continueRecord;
    }

    /**
     * Sets the value of the continueRecord property.
     * 
     */
    public void setContinueRecord(boolean value) {
        this.continueRecord = value;
    }

    /**
     * Gets the value of the getRecordState property.
     * 
     */
    public boolean isGetRecordState() {
        return getRecordState;
    }

    /**
     * Sets the value of the getRecordState property.
     * 
     */
    public void setGetRecordState(boolean value) {
        this.getRecordState = value;
    }

    /**
     * Gets the value of the pauseRecord property.
     * 
     */
    public boolean isPauseRecord() {
        return pauseRecord;
    }

    /**
     * Sets the value of the pauseRecord property.
     * 
     */
    public void setPauseRecord(boolean value) {
        this.pauseRecord = value;
    }

    /**
     * Gets the value of the startRecord property.
     * 
     */
    public boolean isStartRecord() {
        return startRecord;
    }

    /**
     * Sets the value of the startRecord property.
     * 
     */
    public void setStartRecord(boolean value) {
        this.startRecord = value;
    }

    /**
     * Gets the value of the stopRecord property.
     * 
     */
    public boolean isStopRecord() {
        return stopRecord;
    }

    /**
     * Sets the value of the stopRecord property.
     * 
     */
    public void setStopRecord(boolean value) {
        this.stopRecord = value;
    }

}
