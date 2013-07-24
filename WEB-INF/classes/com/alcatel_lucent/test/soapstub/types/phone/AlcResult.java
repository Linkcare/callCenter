
package com.alcatel_lucent.test.soapstub.types.phone;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Each operation published by this 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;i xmlns:staticstate="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phonesetstaticstate" xmlns:tel="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/telephony" xmlns:tns="http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Web Service&lt;/i&gt;
 * </pre>
 *  returns this kind of result.
 * 
 * <p>Java class for AlcResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultCode" type="{http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema}AlcResultCode"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcResult", propOrder = {
    "resultCode",
    "comment"
})
@XmlSeeAlso({
    MakeCorrelatorCallResponse.class,
    DeflectCallToVoiceMailResponse.class,
    TransferConferenceCallResponse.class,
    ModifyCallLogResponse.class,
    GetCallLogResponse.class,
    GetVoiceMailMessagesNbResponse.class,
    MakeCallResponse.class,
    NomadLogoutResponse.class,
    GetBasicTelephonicStateResponse.class,
    OverflowToVoiceMailResponse.class,
    GetTelephonyCapabilitiesResponse.class,
    StartRecordResponse.class,
    InvokeCallBackResponse.class,
    GetCallRecordCapabilitiesResponse.class,
    TakeCallResponse.class,
    UnParkCallResponse.class,
    BlindTransferCallResponse.class,
    GetVoiceMailInfoResponse.class,
    SendAssociateDataResponse.class,
    GetCallLogCapabilitiesResponse.class,
    DeflectCallResponse.class,
    DeleteAllCallLogResponse.class,
    PutOutOfServiceResponse.class,
    ReleaseConferenceCallResponse.class,
    GetNomadicStateResponse.class,
    ConferenceCallResponse.class,
    InvokeCallBackDuringCallResponse.class,
    PutInServiceResponse.class,
    PermanentNomadLoginResponse.class,
    HoldCallResponse.class,
    GetNomadicRightResponse.class,
    MakePrivateCallResponse.class,
    GetGlobalPhoneStateResponse.class,
    GetNbUnansweredCallResponse.class,
    ClearCallResponse.class,
    GetCurrentCallInfoResponse.class,
    SendMessToPcmmResponse.class,
    DeleteCallBackResponse.class,
    TransferCallResponse.class,
    GetCallBackResponse.class,
    GetAccountInfoResponse.class,
    SendDtmfResponse.class,
    IsPcmmResponse.class,
    ParkCallResponse.class,
    MakeBusinessCallResponse.class,
    GetVoiceMailPrefixesResponse.class,
    CancelConferenceCallResponse.class,
    GetCapabilitiesResponse.class,
    NomadLoginResponse.class,
    DeleteAllCallBackResponse.class,
    GetLineStateResponse.class,
    PauseRecordResponse.class,
    GetRecordStateResponse.class,
    ResumeRecordResponse.class,
    DeleteCallLogResponse.class,
    GetTelephonicStateResponse.class,
    IsVoipReadyResponse.class,
    StopRecordResponse.class
})
public class AlcResult {

    @XmlElement(required = true)
    protected AlcResultCode resultCode;
    @XmlElement(required = true, nillable = true)
    protected String comment;

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link AlcResultCode }
     *     
     */
    public AlcResultCode getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcResultCode }
     *     
     */
    public void setResultCode(AlcResultCode value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
