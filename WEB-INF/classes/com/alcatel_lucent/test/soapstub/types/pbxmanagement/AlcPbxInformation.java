
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Describes a PBX.
 *             The list of available PBXs can be retrieved using the 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;b xmlns:extsub="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/externalsubscriber" xmlns:hgroup="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/huntinggroup" xmlns:phb="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonebook" xmlns:secsub="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/secondarysubscriber" xmlns:sipconf="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/sipconfig" xmlns:sub="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/subscriber" xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;code&gt;getPbxList&lt;/code&gt;&lt;/b&gt;
 * </pre>
 *  operation.
 *         
 * 
 * <p>Java class for AlcPbxInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcPbxInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pbxName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pbxType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nodeNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="subNetworkNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pbxStatus" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcPbxStatus"/>
 *         &lt;element name="notificationsStarted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcPbxInformation", propOrder = {
    "pbxName",
    "pbxType",
    "nodeNumber",
    "subNetworkNumber",
    "pbxStatus",
    "notificationsStarted",
    "current"
})
public class AlcPbxInformation {

    @XmlElement(required = true)
    protected String pbxName;
    @XmlElement(required = true, nillable = true)
    protected String pbxType;
    protected int nodeNumber;
    protected int subNetworkNumber;
    @XmlElement(required = true)
    protected AlcPbxStatus pbxStatus;
    protected boolean notificationsStarted;
    protected boolean current;

    /**
     * Gets the value of the pbxName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPbxName() {
        return pbxName;
    }

    /**
     * Sets the value of the pbxName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPbxName(String value) {
        this.pbxName = value;
    }

    /**
     * Gets the value of the pbxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPbxType() {
        return pbxType;
    }

    /**
     * Sets the value of the pbxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPbxType(String value) {
        this.pbxType = value;
    }

    /**
     * Gets the value of the nodeNumber property.
     * 
     */
    public int getNodeNumber() {
        return nodeNumber;
    }

    /**
     * Sets the value of the nodeNumber property.
     * 
     */
    public void setNodeNumber(int value) {
        this.nodeNumber = value;
    }

    /**
     * Gets the value of the subNetworkNumber property.
     * 
     */
    public int getSubNetworkNumber() {
        return subNetworkNumber;
    }

    /**
     * Sets the value of the subNetworkNumber property.
     * 
     */
    public void setSubNetworkNumber(int value) {
        this.subNetworkNumber = value;
    }

    /**
     * Gets the value of the pbxStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AlcPbxStatus }
     *     
     */
    public AlcPbxStatus getPbxStatus() {
        return pbxStatus;
    }

    /**
     * Sets the value of the pbxStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcPbxStatus }
     *     
     */
    public void setPbxStatus(AlcPbxStatus value) {
        this.pbxStatus = value;
    }

    /**
     * Gets the value of the notificationsStarted property.
     * 
     */
    public boolean isNotificationsStarted() {
        return notificationsStarted;
    }

    /**
     * Sets the value of the notificationsStarted property.
     * 
     */
    public void setNotificationsStarted(boolean value) {
        this.notificationsStarted = value;
    }

    /**
     * Gets the value of the current property.
     * 
     */
    public boolean isCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     */
    public void setCurrent(boolean value) {
        this.current = value;
    }

}
