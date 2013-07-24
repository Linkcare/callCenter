
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
 *         &lt;element name="speedCallToAssociatedStation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="consultCallBackList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lastCallerCallBack" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pagingCallAnswer" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="voiceMailConsultation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="wakeUpAppointmentRemind" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="toneTest" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="collectTelex" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="collectText" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="collectFax" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="messageDeposit" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="textDeposit" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="imageDeposit" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="acdPrefixes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="meetMeConference" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cancelWakeUp" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="switchOffMessageLED" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="roomStatusManagement" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="miniBar" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="voiceMailManagerAccess" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="voiceMailRecording" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pabxAddressInDPNSS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="directPagingCall" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="infocenter" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="voiceMailDeposit" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="principalLineSelection" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="secondaryLineSelection" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zDialingBehindUA" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="suppressCallingIdentity" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="recordableVocalGuides" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="suiteWakeUp" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="suiteWakeUpCancel" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="physicalRoomCall" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="underA4980Control" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="manualAddOnConference" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="automaticAddOnConference" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="announcement" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="automaticAnswering" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="robinet" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="explicitPriority" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="intercomServiceLoop" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="explicitPrecedenceLevel" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cugCall" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="backgroundMusic" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    "speedCallToAssociatedStation",
    "consultCallBackList",
    "lastCallerCallBack",
    "pagingCallAnswer",
    "voiceMailConsultation",
    "wakeUpAppointmentRemind",
    "toneTest",
    "collectTelex",
    "collectText",
    "collectFax",
    "messageDeposit",
    "textDeposit",
    "imageDeposit",
    "acdPrefixes",
    "meetMeConference",
    "cancelWakeUp",
    "switchOffMessageLED",
    "roomStatusManagement",
    "miniBar",
    "voiceMailManagerAccess",
    "voiceMailRecording",
    "pabxAddressInDPNSS",
    "directPagingCall",
    "infocenter",
    "voiceMailDeposit",
    "principalLineSelection",
    "secondaryLineSelection",
    "zDialingBehindUA",
    "suppressCallingIdentity",
    "recordableVocalGuides",
    "suiteWakeUp",
    "suiteWakeUpCancel",
    "physicalRoomCall",
    "underA4980Control",
    "manualAddOnConference",
    "automaticAddOnConference",
    "announcement",
    "automaticAnswering",
    "robinet",
    "explicitPriority",
    "intercomServiceLoop",
    "explicitPrecedenceLevel",
    "cugCall",
    "backgroundMusic"
})
@XmlRootElement(name = "getLocalFeaturesPrefixesResponse")
public class GetLocalFeaturesPrefixesResponse
    extends AlcResult
{

    @XmlElement(nillable = true)
    protected List<String> speedCallToAssociatedStation;
    @XmlElement(nillable = true)
    protected List<String> consultCallBackList;
    @XmlElement(nillable = true)
    protected List<String> lastCallerCallBack;
    @XmlElement(nillable = true)
    protected List<String> pagingCallAnswer;
    @XmlElement(nillable = true)
    protected List<String> voiceMailConsultation;
    @XmlElement(nillable = true)
    protected List<String> wakeUpAppointmentRemind;
    @XmlElement(nillable = true)
    protected List<String> toneTest;
    @XmlElement(nillable = true)
    protected List<String> collectTelex;
    @XmlElement(nillable = true)
    protected List<String> collectText;
    @XmlElement(nillable = true)
    protected List<String> collectFax;
    @XmlElement(nillable = true)
    protected List<String> messageDeposit;
    @XmlElement(nillable = true)
    protected List<String> textDeposit;
    @XmlElement(nillable = true)
    protected List<String> imageDeposit;
    @XmlElement(nillable = true)
    protected List<String> acdPrefixes;
    @XmlElement(nillable = true)
    protected List<String> meetMeConference;
    @XmlElement(nillable = true)
    protected List<String> cancelWakeUp;
    @XmlElement(nillable = true)
    protected List<String> switchOffMessageLED;
    @XmlElement(nillable = true)
    protected List<String> roomStatusManagement;
    @XmlElement(nillable = true)
    protected List<String> miniBar;
    @XmlElement(nillable = true)
    protected List<String> voiceMailManagerAccess;
    @XmlElement(nillable = true)
    protected List<String> voiceMailRecording;
    @XmlElement(nillable = true)
    protected List<String> pabxAddressInDPNSS;
    @XmlElement(nillable = true)
    protected List<String> directPagingCall;
    @XmlElement(nillable = true)
    protected List<String> infocenter;
    @XmlElement(nillable = true)
    protected List<String> voiceMailDeposit;
    @XmlElement(nillable = true)
    protected List<String> principalLineSelection;
    @XmlElement(nillable = true)
    protected List<String> secondaryLineSelection;
    @XmlElement(nillable = true)
    protected List<String> zDialingBehindUA;
    @XmlElement(nillable = true)
    protected List<String> suppressCallingIdentity;
    @XmlElement(nillable = true)
    protected List<String> recordableVocalGuides;
    @XmlElement(nillable = true)
    protected List<String> suiteWakeUp;
    @XmlElement(nillable = true)
    protected List<String> suiteWakeUpCancel;
    @XmlElement(nillable = true)
    protected List<String> physicalRoomCall;
    @XmlElement(nillable = true)
    protected List<String> underA4980Control;
    @XmlElement(nillable = true)
    protected List<String> manualAddOnConference;
    @XmlElement(nillable = true)
    protected List<String> automaticAddOnConference;
    @XmlElement(nillable = true)
    protected List<String> announcement;
    @XmlElement(nillable = true)
    protected List<String> automaticAnswering;
    @XmlElement(nillable = true)
    protected List<String> robinet;
    @XmlElement(nillable = true)
    protected List<String> explicitPriority;
    @XmlElement(nillable = true)
    protected List<String> intercomServiceLoop;
    @XmlElement(nillable = true)
    protected List<String> explicitPrecedenceLevel;
    @XmlElement(nillable = true)
    protected List<String> cugCall;
    @XmlElement(nillable = true)
    protected List<String> backgroundMusic;

    /**
     * Gets the value of the speedCallToAssociatedStation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the speedCallToAssociatedStation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpeedCallToAssociatedStation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSpeedCallToAssociatedStation() {
        if (speedCallToAssociatedStation == null) {
            speedCallToAssociatedStation = new ArrayList<String>();
        }
        return this.speedCallToAssociatedStation;
    }

    /**
     * Gets the value of the consultCallBackList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consultCallBackList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsultCallBackList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getConsultCallBackList() {
        if (consultCallBackList == null) {
            consultCallBackList = new ArrayList<String>();
        }
        return this.consultCallBackList;
    }

    /**
     * Gets the value of the lastCallerCallBack property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastCallerCallBack property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastCallerCallBack().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLastCallerCallBack() {
        if (lastCallerCallBack == null) {
            lastCallerCallBack = new ArrayList<String>();
        }
        return this.lastCallerCallBack;
    }

    /**
     * Gets the value of the pagingCallAnswer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pagingCallAnswer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPagingCallAnswer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPagingCallAnswer() {
        if (pagingCallAnswer == null) {
            pagingCallAnswer = new ArrayList<String>();
        }
        return this.pagingCallAnswer;
    }

    /**
     * Gets the value of the voiceMailConsultation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voiceMailConsultation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoiceMailConsultation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVoiceMailConsultation() {
        if (voiceMailConsultation == null) {
            voiceMailConsultation = new ArrayList<String>();
        }
        return this.voiceMailConsultation;
    }

    /**
     * Gets the value of the wakeUpAppointmentRemind property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wakeUpAppointmentRemind property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWakeUpAppointmentRemind().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWakeUpAppointmentRemind() {
        if (wakeUpAppointmentRemind == null) {
            wakeUpAppointmentRemind = new ArrayList<String>();
        }
        return this.wakeUpAppointmentRemind;
    }

    /**
     * Gets the value of the toneTest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toneTest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToneTest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getToneTest() {
        if (toneTest == null) {
            toneTest = new ArrayList<String>();
        }
        return this.toneTest;
    }

    /**
     * Gets the value of the collectTelex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collectTelex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollectTelex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCollectTelex() {
        if (collectTelex == null) {
            collectTelex = new ArrayList<String>();
        }
        return this.collectTelex;
    }

    /**
     * Gets the value of the collectText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collectText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollectText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCollectText() {
        if (collectText == null) {
            collectText = new ArrayList<String>();
        }
        return this.collectText;
    }

    /**
     * Gets the value of the collectFax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collectFax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollectFax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCollectFax() {
        if (collectFax == null) {
            collectFax = new ArrayList<String>();
        }
        return this.collectFax;
    }

    /**
     * Gets the value of the messageDeposit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageDeposit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageDeposit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMessageDeposit() {
        if (messageDeposit == null) {
            messageDeposit = new ArrayList<String>();
        }
        return this.messageDeposit;
    }

    /**
     * Gets the value of the textDeposit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textDeposit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextDeposit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTextDeposit() {
        if (textDeposit == null) {
            textDeposit = new ArrayList<String>();
        }
        return this.textDeposit;
    }

    /**
     * Gets the value of the imageDeposit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageDeposit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageDeposit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getImageDeposit() {
        if (imageDeposit == null) {
            imageDeposit = new ArrayList<String>();
        }
        return this.imageDeposit;
    }

    /**
     * Gets the value of the acdPrefixes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acdPrefixes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcdPrefixes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAcdPrefixes() {
        if (acdPrefixes == null) {
            acdPrefixes = new ArrayList<String>();
        }
        return this.acdPrefixes;
    }

    /**
     * Gets the value of the meetMeConference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meetMeConference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeetMeConference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMeetMeConference() {
        if (meetMeConference == null) {
            meetMeConference = new ArrayList<String>();
        }
        return this.meetMeConference;
    }

    /**
     * Gets the value of the cancelWakeUp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelWakeUp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelWakeUp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCancelWakeUp() {
        if (cancelWakeUp == null) {
            cancelWakeUp = new ArrayList<String>();
        }
        return this.cancelWakeUp;
    }

    /**
     * Gets the value of the switchOffMessageLED property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the switchOffMessageLED property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwitchOffMessageLED().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSwitchOffMessageLED() {
        if (switchOffMessageLED == null) {
            switchOffMessageLED = new ArrayList<String>();
        }
        return this.switchOffMessageLED;
    }

    /**
     * Gets the value of the roomStatusManagement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomStatusManagement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomStatusManagement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRoomStatusManagement() {
        if (roomStatusManagement == null) {
            roomStatusManagement = new ArrayList<String>();
        }
        return this.roomStatusManagement;
    }

    /**
     * Gets the value of the miniBar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the miniBar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiniBar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMiniBar() {
        if (miniBar == null) {
            miniBar = new ArrayList<String>();
        }
        return this.miniBar;
    }

    /**
     * Gets the value of the voiceMailManagerAccess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voiceMailManagerAccess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoiceMailManagerAccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVoiceMailManagerAccess() {
        if (voiceMailManagerAccess == null) {
            voiceMailManagerAccess = new ArrayList<String>();
        }
        return this.voiceMailManagerAccess;
    }

    /**
     * Gets the value of the voiceMailRecording property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voiceMailRecording property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoiceMailRecording().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVoiceMailRecording() {
        if (voiceMailRecording == null) {
            voiceMailRecording = new ArrayList<String>();
        }
        return this.voiceMailRecording;
    }

    /**
     * Gets the value of the pabxAddressInDPNSS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pabxAddressInDPNSS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPabxAddressInDPNSS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPabxAddressInDPNSS() {
        if (pabxAddressInDPNSS == null) {
            pabxAddressInDPNSS = new ArrayList<String>();
        }
        return this.pabxAddressInDPNSS;
    }

    /**
     * Gets the value of the directPagingCall property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directPagingCall property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectPagingCall().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDirectPagingCall() {
        if (directPagingCall == null) {
            directPagingCall = new ArrayList<String>();
        }
        return this.directPagingCall;
    }

    /**
     * Gets the value of the infocenter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infocenter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfocenter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInfocenter() {
        if (infocenter == null) {
            infocenter = new ArrayList<String>();
        }
        return this.infocenter;
    }

    /**
     * Gets the value of the voiceMailDeposit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voiceMailDeposit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoiceMailDeposit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVoiceMailDeposit() {
        if (voiceMailDeposit == null) {
            voiceMailDeposit = new ArrayList<String>();
        }
        return this.voiceMailDeposit;
    }

    /**
     * Gets the value of the principalLineSelection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the principalLineSelection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrincipalLineSelection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrincipalLineSelection() {
        if (principalLineSelection == null) {
            principalLineSelection = new ArrayList<String>();
        }
        return this.principalLineSelection;
    }

    /**
     * Gets the value of the secondaryLineSelection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryLineSelection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryLineSelection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSecondaryLineSelection() {
        if (secondaryLineSelection == null) {
            secondaryLineSelection = new ArrayList<String>();
        }
        return this.secondaryLineSelection;
    }

    /**
     * Gets the value of the zDialingBehindUA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zDialingBehindUA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZDialingBehindUA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getZDialingBehindUA() {
        if (zDialingBehindUA == null) {
            zDialingBehindUA = new ArrayList<String>();
        }
        return this.zDialingBehindUA;
    }

    /**
     * Gets the value of the suppressCallingIdentity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suppressCallingIdentity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuppressCallingIdentity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSuppressCallingIdentity() {
        if (suppressCallingIdentity == null) {
            suppressCallingIdentity = new ArrayList<String>();
        }
        return this.suppressCallingIdentity;
    }

    /**
     * Gets the value of the recordableVocalGuides property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordableVocalGuides property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordableVocalGuides().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRecordableVocalGuides() {
        if (recordableVocalGuides == null) {
            recordableVocalGuides = new ArrayList<String>();
        }
        return this.recordableVocalGuides;
    }

    /**
     * Gets the value of the suiteWakeUp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suiteWakeUp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuiteWakeUp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSuiteWakeUp() {
        if (suiteWakeUp == null) {
            suiteWakeUp = new ArrayList<String>();
        }
        return this.suiteWakeUp;
    }

    /**
     * Gets the value of the suiteWakeUpCancel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suiteWakeUpCancel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuiteWakeUpCancel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSuiteWakeUpCancel() {
        if (suiteWakeUpCancel == null) {
            suiteWakeUpCancel = new ArrayList<String>();
        }
        return this.suiteWakeUpCancel;
    }

    /**
     * Gets the value of the physicalRoomCall property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalRoomCall property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalRoomCall().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPhysicalRoomCall() {
        if (physicalRoomCall == null) {
            physicalRoomCall = new ArrayList<String>();
        }
        return this.physicalRoomCall;
    }

    /**
     * Gets the value of the underA4980Control property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the underA4980Control property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnderA4980Control().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUnderA4980Control() {
        if (underA4980Control == null) {
            underA4980Control = new ArrayList<String>();
        }
        return this.underA4980Control;
    }

    /**
     * Gets the value of the manualAddOnConference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manualAddOnConference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManualAddOnConference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getManualAddOnConference() {
        if (manualAddOnConference == null) {
            manualAddOnConference = new ArrayList<String>();
        }
        return this.manualAddOnConference;
    }

    /**
     * Gets the value of the automaticAddOnConference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the automaticAddOnConference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutomaticAddOnConference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAutomaticAddOnConference() {
        if (automaticAddOnConference == null) {
            automaticAddOnConference = new ArrayList<String>();
        }
        return this.automaticAddOnConference;
    }

    /**
     * Gets the value of the announcement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the announcement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnouncement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAnnouncement() {
        if (announcement == null) {
            announcement = new ArrayList<String>();
        }
        return this.announcement;
    }

    /**
     * Gets the value of the automaticAnswering property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the automaticAnswering property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutomaticAnswering().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAutomaticAnswering() {
        if (automaticAnswering == null) {
            automaticAnswering = new ArrayList<String>();
        }
        return this.automaticAnswering;
    }

    /**
     * Gets the value of the robinet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the robinet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRobinet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRobinet() {
        if (robinet == null) {
            robinet = new ArrayList<String>();
        }
        return this.robinet;
    }

    /**
     * Gets the value of the explicitPriority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the explicitPriority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExplicitPriority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExplicitPriority() {
        if (explicitPriority == null) {
            explicitPriority = new ArrayList<String>();
        }
        return this.explicitPriority;
    }

    /**
     * Gets the value of the intercomServiceLoop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intercomServiceLoop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntercomServiceLoop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIntercomServiceLoop() {
        if (intercomServiceLoop == null) {
            intercomServiceLoop = new ArrayList<String>();
        }
        return this.intercomServiceLoop;
    }

    /**
     * Gets the value of the explicitPrecedenceLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the explicitPrecedenceLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExplicitPrecedenceLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExplicitPrecedenceLevel() {
        if (explicitPrecedenceLevel == null) {
            explicitPrecedenceLevel = new ArrayList<String>();
        }
        return this.explicitPrecedenceLevel;
    }

    /**
     * Gets the value of the cugCall property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cugCall property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCugCall().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCugCall() {
        if (cugCall == null) {
            cugCall = new ArrayList<String>();
        }
        return this.cugCall;
    }

    /**
     * Gets the value of the backgroundMusic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the backgroundMusic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBackgroundMusic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBackgroundMusic() {
        if (backgroundMusic == null) {
            backgroundMusic = new ArrayList<String>();
        }
        return this.backgroundMusic;
    }

}
