
package com.alcatel_lucent.test.soapstub.types.pbxmanagement;

import java.util.ArrayList;
import java.util.List;
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
 *     &lt;extension base="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/pbxmanagementSchema}AlcResult">
 *       &lt;sequence>
 *         &lt;element name="immediateForward" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="immediateForwardOnBusy" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="forwardOnNoReply" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="forwardOnBusyOrNoReply" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cancelForward" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cancelForwardByDestination" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="remoteForward" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cancelRemoteForward" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="overflowNoReplyOnAssociated" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="overflowOnBusyOnAssociated" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="overflowOnBusyOrNoReplyOnAssociated" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cancelOverflowOnAssociated" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="stationGroupExit" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="stationGroupEntry" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="protectionAgainstBeeps" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="padLock" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="autoAllocation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="substitution" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="passwordModification" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="chargingMeterReadout" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="doNotDisturb" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="stationOutOfService" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="associatedDirectoryNumberModification" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="unused" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cancelAutomaticCallBackOnBusyStation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="personalDirectoryProgrammation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="personalDirectoryUse" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contrastProgrammation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="alarmConsultation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="campOnControl" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="suiteDontDisturb" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="voiceGuideListening" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="noRinging" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tandemAbsentSecretary" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tamdemFilteringActivation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="forceSetTypeIdentification" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="privilegeSubstitution" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ubiquityMobileProgramming" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ubiquityAssistant" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="remoteExtensionActivation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="remoteExtensionDeactivation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    "immediateForward",
    "immediateForwardOnBusy",
    "forwardOnNoReply",
    "forwardOnBusyOrNoReply",
    "cancelForward",
    "cancelForwardByDestination",
    "remoteForward",
    "cancelRemoteForward",
    "overflowNoReplyOnAssociated",
    "overflowOnBusyOnAssociated",
    "overflowOnBusyOrNoReplyOnAssociated",
    "cancelOverflowOnAssociated",
    "stationGroupExit",
    "stationGroupEntry",
    "protectionAgainstBeeps",
    "padLock",
    "autoAllocation",
    "substitution",
    "passwordModification",
    "chargingMeterReadout",
    "doNotDisturb",
    "stationOutOfService",
    "associatedDirectoryNumberModification",
    "unused",
    "cancelAutomaticCallBackOnBusyStation",
    "personalDirectoryProgrammation",
    "personalDirectoryUse",
    "language",
    "contrastProgrammation",
    "alarmConsultation",
    "campOnControl",
    "suiteDontDisturb",
    "voiceGuideListening",
    "noRinging",
    "tandemAbsentSecretary",
    "tamdemFilteringActivation",
    "forceSetTypeIdentification",
    "privilegeSubstitution",
    "ubiquityMobileProgramming",
    "ubiquityAssistant",
    "remoteExtensionActivation",
    "remoteExtensionDeactivation"
})
@XmlRootElement(name = "getStationFeaturesPrefixesResponse")
public class GetStationFeaturesPrefixesResponse
    extends AlcResult
{

    @XmlElement(nillable = true)
    protected List<String> immediateForward;
    @XmlElement(nillable = true)
    protected List<String> immediateForwardOnBusy;
    @XmlElement(nillable = true)
    protected List<String> forwardOnNoReply;
    @XmlElement(nillable = true)
    protected List<String> forwardOnBusyOrNoReply;
    @XmlElement(nillable = true)
    protected List<String> cancelForward;
    @XmlElement(nillable = true)
    protected List<String> cancelForwardByDestination;
    @XmlElement(nillable = true)
    protected List<String> remoteForward;
    @XmlElement(nillable = true)
    protected List<String> cancelRemoteForward;
    @XmlElement(nillable = true)
    protected List<String> overflowNoReplyOnAssociated;
    @XmlElement(nillable = true)
    protected List<String> overflowOnBusyOnAssociated;
    @XmlElement(nillable = true)
    protected List<String> overflowOnBusyOrNoReplyOnAssociated;
    @XmlElement(nillable = true)
    protected List<String> cancelOverflowOnAssociated;
    @XmlElement(nillable = true)
    protected List<String> stationGroupExit;
    @XmlElement(nillable = true)
    protected List<String> stationGroupEntry;
    @XmlElement(nillable = true)
    protected List<String> protectionAgainstBeeps;
    @XmlElement(nillable = true)
    protected List<String> padLock;
    @XmlElement(nillable = true)
    protected List<String> autoAllocation;
    @XmlElement(nillable = true)
    protected List<String> substitution;
    @XmlElement(nillable = true)
    protected List<String> passwordModification;
    @XmlElement(nillable = true)
    protected List<String> chargingMeterReadout;
    @XmlElement(nillable = true)
    protected List<String> doNotDisturb;
    @XmlElement(nillable = true)
    protected List<String> stationOutOfService;
    @XmlElement(nillable = true)
    protected List<String> associatedDirectoryNumberModification;
    @XmlElement(nillable = true)
    protected List<String> unused;
    @XmlElement(nillable = true)
    protected List<String> cancelAutomaticCallBackOnBusyStation;
    @XmlElement(nillable = true)
    protected List<String> personalDirectoryProgrammation;
    @XmlElement(nillable = true)
    protected List<String> personalDirectoryUse;
    @XmlElement(nillable = true)
    protected List<String> language;
    @XmlElement(nillable = true)
    protected List<String> contrastProgrammation;
    @XmlElement(nillable = true)
    protected List<String> alarmConsultation;
    @XmlElement(nillable = true)
    protected List<String> campOnControl;
    @XmlElement(nillable = true)
    protected List<String> suiteDontDisturb;
    @XmlElement(nillable = true)
    protected List<String> voiceGuideListening;
    @XmlElement(nillable = true)
    protected List<String> noRinging;
    @XmlElement(nillable = true)
    protected List<String> tandemAbsentSecretary;
    @XmlElement(nillable = true)
    protected List<String> tamdemFilteringActivation;
    @XmlElement(nillable = true)
    protected List<String> forceSetTypeIdentification;
    @XmlElement(nillable = true)
    protected List<String> privilegeSubstitution;
    @XmlElement(nillable = true)
    protected List<String> ubiquityMobileProgramming;
    @XmlElement(nillable = true)
    protected List<String> ubiquityAssistant;
    @XmlElement(nillable = true)
    protected List<String> remoteExtensionActivation;
    @XmlElement(nillable = true)
    protected List<String> remoteExtensionDeactivation;

    /**
     * Gets the value of the immediateForward property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the immediateForward property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImmediateForward().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getImmediateForward() {
        if (immediateForward == null) {
            immediateForward = new ArrayList<String>();
        }
        return this.immediateForward;
    }

    /**
     * Gets the value of the immediateForwardOnBusy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the immediateForwardOnBusy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImmediateForwardOnBusy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getImmediateForwardOnBusy() {
        if (immediateForwardOnBusy == null) {
            immediateForwardOnBusy = new ArrayList<String>();
        }
        return this.immediateForwardOnBusy;
    }

    /**
     * Gets the value of the forwardOnNoReply property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forwardOnNoReply property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForwardOnNoReply().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getForwardOnNoReply() {
        if (forwardOnNoReply == null) {
            forwardOnNoReply = new ArrayList<String>();
        }
        return this.forwardOnNoReply;
    }

    /**
     * Gets the value of the forwardOnBusyOrNoReply property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forwardOnBusyOrNoReply property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForwardOnBusyOrNoReply().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getForwardOnBusyOrNoReply() {
        if (forwardOnBusyOrNoReply == null) {
            forwardOnBusyOrNoReply = new ArrayList<String>();
        }
        return this.forwardOnBusyOrNoReply;
    }

    /**
     * Gets the value of the cancelForward property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelForward property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelForward().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCancelForward() {
        if (cancelForward == null) {
            cancelForward = new ArrayList<String>();
        }
        return this.cancelForward;
    }

    /**
     * Gets the value of the cancelForwardByDestination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelForwardByDestination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelForwardByDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCancelForwardByDestination() {
        if (cancelForwardByDestination == null) {
            cancelForwardByDestination = new ArrayList<String>();
        }
        return this.cancelForwardByDestination;
    }

    /**
     * Gets the value of the remoteForward property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remoteForward property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoteForward().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRemoteForward() {
        if (remoteForward == null) {
            remoteForward = new ArrayList<String>();
        }
        return this.remoteForward;
    }

    /**
     * Gets the value of the cancelRemoteForward property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelRemoteForward property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelRemoteForward().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCancelRemoteForward() {
        if (cancelRemoteForward == null) {
            cancelRemoteForward = new ArrayList<String>();
        }
        return this.cancelRemoteForward;
    }

    /**
     * Gets the value of the overflowNoReplyOnAssociated property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overflowNoReplyOnAssociated property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverflowNoReplyOnAssociated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOverflowNoReplyOnAssociated() {
        if (overflowNoReplyOnAssociated == null) {
            overflowNoReplyOnAssociated = new ArrayList<String>();
        }
        return this.overflowNoReplyOnAssociated;
    }

    /**
     * Gets the value of the overflowOnBusyOnAssociated property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overflowOnBusyOnAssociated property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverflowOnBusyOnAssociated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOverflowOnBusyOnAssociated() {
        if (overflowOnBusyOnAssociated == null) {
            overflowOnBusyOnAssociated = new ArrayList<String>();
        }
        return this.overflowOnBusyOnAssociated;
    }

    /**
     * Gets the value of the overflowOnBusyOrNoReplyOnAssociated property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overflowOnBusyOrNoReplyOnAssociated property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverflowOnBusyOrNoReplyOnAssociated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOverflowOnBusyOrNoReplyOnAssociated() {
        if (overflowOnBusyOrNoReplyOnAssociated == null) {
            overflowOnBusyOrNoReplyOnAssociated = new ArrayList<String>();
        }
        return this.overflowOnBusyOrNoReplyOnAssociated;
    }

    /**
     * Gets the value of the cancelOverflowOnAssociated property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelOverflowOnAssociated property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelOverflowOnAssociated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCancelOverflowOnAssociated() {
        if (cancelOverflowOnAssociated == null) {
            cancelOverflowOnAssociated = new ArrayList<String>();
        }
        return this.cancelOverflowOnAssociated;
    }

    /**
     * Gets the value of the stationGroupExit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stationGroupExit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStationGroupExit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStationGroupExit() {
        if (stationGroupExit == null) {
            stationGroupExit = new ArrayList<String>();
        }
        return this.stationGroupExit;
    }

    /**
     * Gets the value of the stationGroupEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stationGroupEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStationGroupEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStationGroupEntry() {
        if (stationGroupEntry == null) {
            stationGroupEntry = new ArrayList<String>();
        }
        return this.stationGroupEntry;
    }

    /**
     * Gets the value of the protectionAgainstBeeps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protectionAgainstBeeps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProtectionAgainstBeeps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProtectionAgainstBeeps() {
        if (protectionAgainstBeeps == null) {
            protectionAgainstBeeps = new ArrayList<String>();
        }
        return this.protectionAgainstBeeps;
    }

    /**
     * Gets the value of the padLock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the padLock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPadLock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPadLock() {
        if (padLock == null) {
            padLock = new ArrayList<String>();
        }
        return this.padLock;
    }

    /**
     * Gets the value of the autoAllocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoAllocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoAllocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAutoAllocation() {
        if (autoAllocation == null) {
            autoAllocation = new ArrayList<String>();
        }
        return this.autoAllocation;
    }

    /**
     * Gets the value of the substitution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the substitution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubstitution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubstitution() {
        if (substitution == null) {
            substitution = new ArrayList<String>();
        }
        return this.substitution;
    }

    /**
     * Gets the value of the passwordModification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passwordModification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPasswordModification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPasswordModification() {
        if (passwordModification == null) {
            passwordModification = new ArrayList<String>();
        }
        return this.passwordModification;
    }

    /**
     * Gets the value of the chargingMeterReadout property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargingMeterReadout property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargingMeterReadout().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getChargingMeterReadout() {
        if (chargingMeterReadout == null) {
            chargingMeterReadout = new ArrayList<String>();
        }
        return this.chargingMeterReadout;
    }

    /**
     * Gets the value of the doNotDisturb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doNotDisturb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoNotDisturb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDoNotDisturb() {
        if (doNotDisturb == null) {
            doNotDisturb = new ArrayList<String>();
        }
        return this.doNotDisturb;
    }

    /**
     * Gets the value of the stationOutOfService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stationOutOfService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStationOutOfService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStationOutOfService() {
        if (stationOutOfService == null) {
            stationOutOfService = new ArrayList<String>();
        }
        return this.stationOutOfService;
    }

    /**
     * Gets the value of the associatedDirectoryNumberModification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedDirectoryNumberModification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedDirectoryNumberModification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAssociatedDirectoryNumberModification() {
        if (associatedDirectoryNumberModification == null) {
            associatedDirectoryNumberModification = new ArrayList<String>();
        }
        return this.associatedDirectoryNumberModification;
    }

    /**
     * Gets the value of the unused property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unused property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnused().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUnused() {
        if (unused == null) {
            unused = new ArrayList<String>();
        }
        return this.unused;
    }

    /**
     * Gets the value of the cancelAutomaticCallBackOnBusyStation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelAutomaticCallBackOnBusyStation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelAutomaticCallBackOnBusyStation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCancelAutomaticCallBackOnBusyStation() {
        if (cancelAutomaticCallBackOnBusyStation == null) {
            cancelAutomaticCallBackOnBusyStation = new ArrayList<String>();
        }
        return this.cancelAutomaticCallBackOnBusyStation;
    }

    /**
     * Gets the value of the personalDirectoryProgrammation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personalDirectoryProgrammation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonalDirectoryProgrammation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPersonalDirectoryProgrammation() {
        if (personalDirectoryProgrammation == null) {
            personalDirectoryProgrammation = new ArrayList<String>();
        }
        return this.personalDirectoryProgrammation;
    }

    /**
     * Gets the value of the personalDirectoryUse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personalDirectoryUse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonalDirectoryUse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPersonalDirectoryUse() {
        if (personalDirectoryUse == null) {
            personalDirectoryUse = new ArrayList<String>();
        }
        return this.personalDirectoryUse;
    }

    /**
     * Gets the value of the language property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the language property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLanguage() {
        if (language == null) {
            language = new ArrayList<String>();
        }
        return this.language;
    }

    /**
     * Gets the value of the contrastProgrammation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contrastProgrammation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContrastProgrammation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContrastProgrammation() {
        if (contrastProgrammation == null) {
            contrastProgrammation = new ArrayList<String>();
        }
        return this.contrastProgrammation;
    }

    /**
     * Gets the value of the alarmConsultation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alarmConsultation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlarmConsultation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlarmConsultation() {
        if (alarmConsultation == null) {
            alarmConsultation = new ArrayList<String>();
        }
        return this.alarmConsultation;
    }

    /**
     * Gets the value of the campOnControl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campOnControl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampOnControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCampOnControl() {
        if (campOnControl == null) {
            campOnControl = new ArrayList<String>();
        }
        return this.campOnControl;
    }

    /**
     * Gets the value of the suiteDontDisturb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suiteDontDisturb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuiteDontDisturb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSuiteDontDisturb() {
        if (suiteDontDisturb == null) {
            suiteDontDisturb = new ArrayList<String>();
        }
        return this.suiteDontDisturb;
    }

    /**
     * Gets the value of the voiceGuideListening property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voiceGuideListening property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoiceGuideListening().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVoiceGuideListening() {
        if (voiceGuideListening == null) {
            voiceGuideListening = new ArrayList<String>();
        }
        return this.voiceGuideListening;
    }

    /**
     * Gets the value of the noRinging property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noRinging property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoRinging().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNoRinging() {
        if (noRinging == null) {
            noRinging = new ArrayList<String>();
        }
        return this.noRinging;
    }

    /**
     * Gets the value of the tandemAbsentSecretary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tandemAbsentSecretary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTandemAbsentSecretary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTandemAbsentSecretary() {
        if (tandemAbsentSecretary == null) {
            tandemAbsentSecretary = new ArrayList<String>();
        }
        return this.tandemAbsentSecretary;
    }

    /**
     * Gets the value of the tamdemFilteringActivation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tamdemFilteringActivation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTamdemFilteringActivation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTamdemFilteringActivation() {
        if (tamdemFilteringActivation == null) {
            tamdemFilteringActivation = new ArrayList<String>();
        }
        return this.tamdemFilteringActivation;
    }

    /**
     * Gets the value of the forceSetTypeIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forceSetTypeIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForceSetTypeIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getForceSetTypeIdentification() {
        if (forceSetTypeIdentification == null) {
            forceSetTypeIdentification = new ArrayList<String>();
        }
        return this.forceSetTypeIdentification;
    }

    /**
     * Gets the value of the privilegeSubstitution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the privilegeSubstitution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrivilegeSubstitution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrivilegeSubstitution() {
        if (privilegeSubstitution == null) {
            privilegeSubstitution = new ArrayList<String>();
        }
        return this.privilegeSubstitution;
    }

    /**
     * Gets the value of the ubiquityMobileProgramming property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ubiquityMobileProgramming property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUbiquityMobileProgramming().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUbiquityMobileProgramming() {
        if (ubiquityMobileProgramming == null) {
            ubiquityMobileProgramming = new ArrayList<String>();
        }
        return this.ubiquityMobileProgramming;
    }

    /**
     * Gets the value of the ubiquityAssistant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ubiquityAssistant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUbiquityAssistant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUbiquityAssistant() {
        if (ubiquityAssistant == null) {
            ubiquityAssistant = new ArrayList<String>();
        }
        return this.ubiquityAssistant;
    }

    /**
     * Gets the value of the remoteExtensionActivation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remoteExtensionActivation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoteExtensionActivation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRemoteExtensionActivation() {
        if (remoteExtensionActivation == null) {
            remoteExtensionActivation = new ArrayList<String>();
        }
        return this.remoteExtensionActivation;
    }

    /**
     * Gets the value of the remoteExtensionDeactivation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remoteExtensionDeactivation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoteExtensionDeactivation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRemoteExtensionDeactivation() {
        if (remoteExtensionDeactivation == null) {
            remoteExtensionDeactivation = new ArrayList<String>();
        }
        return this.remoteExtensionDeactivation;
    }

}
