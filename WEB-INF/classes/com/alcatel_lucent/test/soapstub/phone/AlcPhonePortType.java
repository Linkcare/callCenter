
package com.alcatel_lucent.test.soapstub.phone;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import com.alcatel_lucent.test.soapstub.types.phone.BlindTransferCallRequest;
import com.alcatel_lucent.test.soapstub.types.phone.BlindTransferCallResponse;
import com.alcatel_lucent.test.soapstub.types.phone.CancelConferenceCallRequest;
import com.alcatel_lucent.test.soapstub.types.phone.CancelConferenceCallResponse;
import com.alcatel_lucent.test.soapstub.types.phone.ClearCallRequest;
import com.alcatel_lucent.test.soapstub.types.phone.ClearCallResponse;
import com.alcatel_lucent.test.soapstub.types.phone.ConferenceCallRequest;
import com.alcatel_lucent.test.soapstub.types.phone.ConferenceCallResponse;
import com.alcatel_lucent.test.soapstub.types.phone.DeflectCallRequest;
import com.alcatel_lucent.test.soapstub.types.phone.DeflectCallResponse;
import com.alcatel_lucent.test.soapstub.types.phone.DeflectCallToVoiceMailRequest;
import com.alcatel_lucent.test.soapstub.types.phone.DeflectCallToVoiceMailResponse;
import com.alcatel_lucent.test.soapstub.types.phone.DeleteAllCallBackRequest;
import com.alcatel_lucent.test.soapstub.types.phone.DeleteAllCallBackResponse;
import com.alcatel_lucent.test.soapstub.types.phone.DeleteAllCallLogRequest;
import com.alcatel_lucent.test.soapstub.types.phone.DeleteAllCallLogResponse;
import com.alcatel_lucent.test.soapstub.types.phone.DeleteCallBackRequest;
import com.alcatel_lucent.test.soapstub.types.phone.DeleteCallBackResponse;
import com.alcatel_lucent.test.soapstub.types.phone.DeleteCallLogRequest;
import com.alcatel_lucent.test.soapstub.types.phone.DeleteCallLogResponse;
import com.alcatel_lucent.test.soapstub.types.phone.GetAccountInfoRequest;
import com.alcatel_lucent.test.soapstub.types.phone.GetAccountInfoResponse;
import com.alcatel_lucent.test.soapstub.types.phone.GetBasicTelephonicStateRequest;
import com.alcatel_lucent.test.soapstub.types.phone.GetBasicTelephonicStateResponse;
import com.alcatel_lucent.test.soapstub.types.phone.GetCallBackRequest;
import com.alcatel_lucent.test.soapstub.types.phone.GetCallBackResponse;
import com.alcatel_lucent.test.soapstub.types.phone.GetCallLogCapabilitiesRequest;
import com.alcatel_lucent.test.soapstub.types.phone.GetCallLogCapabilitiesResponse;
import com.alcatel_lucent.test.soapstub.types.phone.GetCallLogRequest;
import com.alcatel_lucent.test.soapstub.types.phone.GetCallLogResponse;
import com.alcatel_lucent.test.soapstub.types.phone.GetCallRecordCapabilitiesRequest;
import com.alcatel_lucent.test.soapstub.types.phone.GetCallRecordCapabilitiesResponse;
import com.alcatel_lucent.test.soapstub.types.phone.GetCapabilitiesRequest;
import com.alcatel_lucent.test.soapstub.types.phone.GetCapabilitiesResponse;
import com.alcatel_lucent.test.soapstub.types.phone.GetCurrentCallInfoRequest;
import com.alcatel_lucent.test.soapstub.types.phone.GetCurrentCallInfoResponse;
import com.alcatel_lucent.test.soapstub.types.phone.GetGlobalPhoneStateRequest;
import com.alcatel_lucent.test.soapstub.types.phone.GetGlobalPhoneStateResponse;
import com.alcatel_lucent.test.soapstub.types.phone.GetLineStateRequest;
import com.alcatel_lucent.test.soapstub.types.phone.GetLineStateResponse;
import com.alcatel_lucent.test.soapstub.types.phone.GetNbUnansweredCallRequest;
import com.alcatel_lucent.test.soapstub.types.phone.GetNbUnansweredCallResponse;
import com.alcatel_lucent.test.soapstub.types.phone.GetNomadicRightRequest;
import com.alcatel_lucent.test.soapstub.types.phone.GetNomadicRightResponse;
import com.alcatel_lucent.test.soapstub.types.phone.GetNomadicStateRequest;
import com.alcatel_lucent.test.soapstub.types.phone.GetNomadicStateResponse;
import com.alcatel_lucent.test.soapstub.types.phone.GetRecordStateRequest;
import com.alcatel_lucent.test.soapstub.types.phone.GetRecordStateResponse;
import com.alcatel_lucent.test.soapstub.types.phone.GetTelephonicStateRequest;
import com.alcatel_lucent.test.soapstub.types.phone.GetTelephonicStateResponse;
import com.alcatel_lucent.test.soapstub.types.phone.GetTelephonyCapabilitiesRequest;
import com.alcatel_lucent.test.soapstub.types.phone.GetTelephonyCapabilitiesResponse;
import com.alcatel_lucent.test.soapstub.types.phone.GetVoiceMailInfoRequest;
import com.alcatel_lucent.test.soapstub.types.phone.GetVoiceMailInfoResponse;
import com.alcatel_lucent.test.soapstub.types.phone.GetVoiceMailMessagesNbRequest;
import com.alcatel_lucent.test.soapstub.types.phone.GetVoiceMailMessagesNbResponse;
import com.alcatel_lucent.test.soapstub.types.phone.GetVoiceMailPrefixesRequest;
import com.alcatel_lucent.test.soapstub.types.phone.GetVoiceMailPrefixesResponse;
import com.alcatel_lucent.test.soapstub.types.phone.HoldCallRequest;
import com.alcatel_lucent.test.soapstub.types.phone.HoldCallResponse;
import com.alcatel_lucent.test.soapstub.types.phone.InvokeCallBackDuringCallRequest;
import com.alcatel_lucent.test.soapstub.types.phone.InvokeCallBackDuringCallResponse;
import com.alcatel_lucent.test.soapstub.types.phone.InvokeCallBackRequest;
import com.alcatel_lucent.test.soapstub.types.phone.InvokeCallBackResponse;
import com.alcatel_lucent.test.soapstub.types.phone.IsPcmmRequest;
import com.alcatel_lucent.test.soapstub.types.phone.IsPcmmResponse;
import com.alcatel_lucent.test.soapstub.types.phone.IsVoipReadyRequest;
import com.alcatel_lucent.test.soapstub.types.phone.IsVoipReadyResponse;
import com.alcatel_lucent.test.soapstub.types.phone.MakeBusinessCallRequest;
import com.alcatel_lucent.test.soapstub.types.phone.MakeBusinessCallResponse;
import com.alcatel_lucent.test.soapstub.types.phone.MakeCallRequest;
import com.alcatel_lucent.test.soapstub.types.phone.MakeCallResponse;
import com.alcatel_lucent.test.soapstub.types.phone.MakeCorrelatorCallRequest;
import com.alcatel_lucent.test.soapstub.types.phone.MakeCorrelatorCallResponse;
import com.alcatel_lucent.test.soapstub.types.phone.MakePrivateCallRequest;
import com.alcatel_lucent.test.soapstub.types.phone.MakePrivateCallResponse;
import com.alcatel_lucent.test.soapstub.types.phone.ModifyCallLogRequest;
import com.alcatel_lucent.test.soapstub.types.phone.ModifyCallLogResponse;
import com.alcatel_lucent.test.soapstub.types.phone.NomadLoginRequest;
import com.alcatel_lucent.test.soapstub.types.phone.NomadLoginResponse;
import com.alcatel_lucent.test.soapstub.types.phone.NomadLogoutRequest;
import com.alcatel_lucent.test.soapstub.types.phone.NomadLogoutResponse;
import com.alcatel_lucent.test.soapstub.types.phone.ObjectFactory;
import com.alcatel_lucent.test.soapstub.types.phone.OverflowToVoiceMailRequest;
import com.alcatel_lucent.test.soapstub.types.phone.OverflowToVoiceMailResponse;
import com.alcatel_lucent.test.soapstub.types.phone.ParkCallRequest;
import com.alcatel_lucent.test.soapstub.types.phone.ParkCallResponse;
import com.alcatel_lucent.test.soapstub.types.phone.PauseRecordRequest;
import com.alcatel_lucent.test.soapstub.types.phone.PauseRecordResponse;
import com.alcatel_lucent.test.soapstub.types.phone.PermanentNomadLoginRequest;
import com.alcatel_lucent.test.soapstub.types.phone.PermanentNomadLoginResponse;
import com.alcatel_lucent.test.soapstub.types.phone.PutInServiceRequest;
import com.alcatel_lucent.test.soapstub.types.phone.PutInServiceResponse;
import com.alcatel_lucent.test.soapstub.types.phone.PutOutOfServiceRequest;
import com.alcatel_lucent.test.soapstub.types.phone.PutOutOfServiceResponse;
import com.alcatel_lucent.test.soapstub.types.phone.ReleaseConferenceCallRequest;
import com.alcatel_lucent.test.soapstub.types.phone.ReleaseConferenceCallResponse;
import com.alcatel_lucent.test.soapstub.types.phone.ResumeRecordRequest;
import com.alcatel_lucent.test.soapstub.types.phone.ResumeRecordResponse;
import com.alcatel_lucent.test.soapstub.types.phone.SendAssociateDataRequest;
import com.alcatel_lucent.test.soapstub.types.phone.SendAssociateDataResponse;
import com.alcatel_lucent.test.soapstub.types.phone.SendDtmfRequest;
import com.alcatel_lucent.test.soapstub.types.phone.SendDtmfResponse;
import com.alcatel_lucent.test.soapstub.types.phone.SendMessToPcmmRequest;
import com.alcatel_lucent.test.soapstub.types.phone.SendMessToPcmmResponse;
import com.alcatel_lucent.test.soapstub.types.phone.StartRecordRequest;
import com.alcatel_lucent.test.soapstub.types.phone.StartRecordResponse;
import com.alcatel_lucent.test.soapstub.types.phone.StopRecordRequest;
import com.alcatel_lucent.test.soapstub.types.phone.StopRecordResponse;
import com.alcatel_lucent.test.soapstub.types.phone.TakeCallRequest;
import com.alcatel_lucent.test.soapstub.types.phone.TakeCallResponse;
import com.alcatel_lucent.test.soapstub.types.phone.TransferCallRequest;
import com.alcatel_lucent.test.soapstub.types.phone.TransferCallResponse;
import com.alcatel_lucent.test.soapstub.types.phone.TransferConferenceCallRequest;
import com.alcatel_lucent.test.soapstub.types.phone.TransferConferenceCallResponse;
import com.alcatel_lucent.test.soapstub.types.phone.UnParkCallRequest;
import com.alcatel_lucent.test.soapstub.types.phone.UnParkCallResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AlcPhonePortType", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneDefinitions")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AlcPhonePortType {


    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.GetAccountInfoResponse
     */
    @WebMethod(action = "getAccountInfo")
    @WebResult(name = "getAccountInfoResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public GetAccountInfoResponse getAccountInfo(
        @WebParam(name = "getAccountInfoRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        GetAccountInfoRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.GetCapabilitiesResponse
     */
    @WebMethod(action = "getCapabilities")
    @WebResult(name = "getCapabilitiesResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public GetCapabilitiesResponse getCapabilities(
        @WebParam(name = "getCapabilitiesRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        GetCapabilitiesRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.GetGlobalPhoneStateResponse
     */
    @WebMethod(action = "getGlobalPhoneState")
    @WebResult(name = "getGlobalPhoneStateResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public GetGlobalPhoneStateResponse getGlobalPhoneState(
        @WebParam(name = "getGlobalPhoneStateRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        GetGlobalPhoneStateRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.NomadLoginResponse
     */
    @WebMethod(action = "nomadLogin")
    @WebResult(name = "nomadLoginResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public NomadLoginResponse nomadLogin(
        @WebParam(name = "nomadLoginRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        NomadLoginRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.PermanentNomadLoginResponse
     */
    @WebMethod(action = "permanentNomadLogin")
    @WebResult(name = "permanentNomadLoginResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public PermanentNomadLoginResponse permanentNomadLogin(
        @WebParam(name = "permanentNomadLoginRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        PermanentNomadLoginRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.NomadLogoutResponse
     */
    @WebMethod(action = "nomadLogout")
    @WebResult(name = "nomadLogoutResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public NomadLogoutResponse nomadLogout(
        @WebParam(name = "nomadLogoutRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        NomadLogoutRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.GetNomadicStateResponse
     */
    @WebMethod(action = "getNomadicState")
    @WebResult(name = "getNomadicStateResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public GetNomadicStateResponse getNomadicState(
        @WebParam(name = "getNomadicStateRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        GetNomadicStateRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.GetNomadicRightResponse
     */
    @WebMethod(action = "getNomadicRight")
    @WebResult(name = "getNomadicRightResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public GetNomadicRightResponse getNomadicRight(
        @WebParam(name = "getNomadicRightRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        GetNomadicRightRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.GetLineStateResponse
     */
    @WebMethod(action = "getLineState")
    @WebResult(name = "getLineStateResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public GetLineStateResponse getLineState(
        @WebParam(name = "getLineStateRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        GetLineStateRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.MakeCallResponse
     */
    @WebMethod(action = "makeCall")
    @WebResult(name = "makeCallResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public MakeCallResponse makeCall(
        @WebParam(name = "makeCallRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        MakeCallRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.MakePrivateCallResponse
     */
    @WebMethod(action = "makePrivateCall")
    @WebResult(name = "makePrivateCallResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public MakePrivateCallResponse makePrivateCall(
        @WebParam(name = "makePrivateCallRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        MakePrivateCallRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.MakeBusinessCallResponse
     */
    @WebMethod(action = "makeBusinessCall")
    @WebResult(name = "makeBusinessCallResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public MakeBusinessCallResponse makeBusinessCall(
        @WebParam(name = "makeBusinessCallRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        MakeBusinessCallRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.MakeCorrelatorCallResponse
     */
    @WebMethod(action = "makeCorrelatorCall")
    @WebResult(name = "makeCorrelatorCallResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public MakeCorrelatorCallResponse makeCorrelatorCall(
        @WebParam(name = "makeCorrelatorCallRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        MakeCorrelatorCallRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.SendAssociateDataResponse
     */
    @WebMethod(action = "sendAssociateData")
    @WebResult(name = "sendAssociateDataResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public SendAssociateDataResponse sendAssociateData(
        @WebParam(name = "sendAssociateDataRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        SendAssociateDataRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.TakeCallResponse
     */
    @WebMethod(action = "takeCall")
    @WebResult(name = "takeCallResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public TakeCallResponse takeCall(
        @WebParam(name = "takeCallRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        TakeCallRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.HoldCallResponse
     */
    @WebMethod(action = "holdCall")
    @WebResult(name = "holdCallResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public HoldCallResponse holdCall(
        @WebParam(name = "holdCallRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        HoldCallRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.ClearCallResponse
     */
    @WebMethod(action = "clearCall")
    @WebResult(name = "clearCallResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public ClearCallResponse clearCall(
        @WebParam(name = "clearCallRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        ClearCallRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.ConferenceCallResponse
     */
    @WebMethod(action = "conferenceCall")
    @WebResult(name = "conferenceCallResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public ConferenceCallResponse conferenceCall(
        @WebParam(name = "conferenceCallRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        ConferenceCallRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.TransferCallResponse
     */
    @WebMethod(action = "transferCall")
    @WebResult(name = "transferCallResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public TransferCallResponse transferCall(
        @WebParam(name = "transferCallRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        TransferCallRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.DeflectCallResponse
     */
    @WebMethod(action = "deflectCall")
    @WebResult(name = "deflectCallResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public DeflectCallResponse deflectCall(
        @WebParam(name = "deflectCallRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        DeflectCallRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.DeflectCallToVoiceMailResponse
     */
    @WebMethod(action = "deflectCallToVoiceMail")
    @WebResult(name = "deflectCallToVoiceMailResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public DeflectCallToVoiceMailResponse deflectCallToVoiceMail(
        @WebParam(name = "deflectCallToVoiceMailRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        DeflectCallToVoiceMailRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.CancelConferenceCallResponse
     */
    @WebMethod(action = "cancelConferenceCall")
    @WebResult(name = "cancelConferenceCallResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public CancelConferenceCallResponse cancelConferenceCall(
        @WebParam(name = "cancelConferenceCallRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        CancelConferenceCallRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.TransferConferenceCallResponse
     */
    @WebMethod(action = "transferConferenceCall")
    @WebResult(name = "transferConferenceCallResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public TransferConferenceCallResponse transferConferenceCall(
        @WebParam(name = "transferConferenceCallRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        TransferConferenceCallRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.ReleaseConferenceCallResponse
     */
    @WebMethod(action = "releaseConferenceCall")
    @WebResult(name = "releaseConferenceCallResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public ReleaseConferenceCallResponse releaseConferenceCall(
        @WebParam(name = "releaseConferenceCallRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        ReleaseConferenceCallRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.BlindTransferCallResponse
     */
    @WebMethod(action = "blindTransferCall")
    @WebResult(name = "blindTransferCallResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public BlindTransferCallResponse blindTransferCall(
        @WebParam(name = "blindTransferCallRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        BlindTransferCallRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.ParkCallResponse
     */
    @WebMethod
    @WebResult(name = "parkCallResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public ParkCallResponse parkCall(
        @WebParam(name = "parkCallRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        ParkCallRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.UnParkCallResponse
     */
    @WebMethod(action = "unParkCall")
    @WebResult(name = "unParkCallResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public UnParkCallResponse unParkCall(
        @WebParam(name = "unParkCallRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        UnParkCallRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.OverflowToVoiceMailResponse
     */
    @WebMethod(action = "overflowToVoiceMail")
    @WebResult(name = "overflowToVoiceMailResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public OverflowToVoiceMailResponse overflowToVoiceMail(
        @WebParam(name = "overflowToVoiceMailRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        OverflowToVoiceMailRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.GetCallRecordCapabilitiesResponse
     */
    @WebMethod(action = "getCallRecordCapabilities")
    @WebResult(name = "getCallRecordCapabilitiesResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public GetCallRecordCapabilitiesResponse getCallRecordCapabilities(
        @WebParam(name = "getCallRecordCapabilitiesRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        GetCallRecordCapabilitiesRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.GetTelephonyCapabilitiesResponse
     */
    @WebMethod(action = "getTelephonyCapabilities")
    @WebResult(name = "getTelephonyCapabilitiesResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public GetTelephonyCapabilitiesResponse getTelephonyCapabilities(
        @WebParam(name = "getTelephonyCapabilitiesRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        GetTelephonyCapabilitiesRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.SendDtmfResponse
     */
    @WebMethod(action = "sendDtmf")
    @WebResult(name = "sendDtmfResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public SendDtmfResponse sendDtmf(
        @WebParam(name = "sendDtmfRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        SendDtmfRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.GetCallLogCapabilitiesResponse
     */
    @WebMethod(action = "getCallLogCapabilities")
    @WebResult(name = "getCallLogCapabilitiesResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public GetCallLogCapabilitiesResponse getCallLogCapabilities(
        @WebParam(name = "getCallLogCapabilitiesRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        GetCallLogCapabilitiesRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.GetNbUnansweredCallResponse
     */
    @WebMethod(action = "getNbUnansweredCall")
    @WebResult(name = "getNbUnansweredCallResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public GetNbUnansweredCallResponse getNbUnansweredCall(
        @WebParam(name = "getNbUnansweredCallRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        GetNbUnansweredCallRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.GetCallLogResponse
     */
    @WebMethod(action = "getCallLog")
    @WebResult(name = "getCallLogResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public GetCallLogResponse getCallLog(
        @WebParam(name = "getCallLogRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        GetCallLogRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.ModifyCallLogResponse
     */
    @WebMethod(action = "modifyCallLog")
    @WebResult(name = "modifyCallLogResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public ModifyCallLogResponse modifyCallLog(
        @WebParam(name = "modifyCallLogRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        ModifyCallLogRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.DeleteCallLogResponse
     */
    @WebMethod(action = "deleteCallLog")
    @WebResult(name = "deleteCallLogResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public DeleteCallLogResponse deleteCallLog(
        @WebParam(name = "deleteCallLogRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        DeleteCallLogRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.DeleteAllCallLogResponse
     */
    @WebMethod(action = "deleteAllCallLog")
    @WebResult(name = "deleteAllCallLogResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public DeleteAllCallLogResponse deleteAllCallLog(
        @WebParam(name = "deleteAllCallLogRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        DeleteAllCallLogRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.GetVoiceMailMessagesNbResponse
     */
    @WebMethod(action = "getVoiceMailMessagesNb")
    @WebResult(name = "getVoiceMailMessagesNbResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public GetVoiceMailMessagesNbResponse getVoiceMailMessagesNb(
        @WebParam(name = "getVoiceMailMessagesNbRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        GetVoiceMailMessagesNbRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.GetVoiceMailInfoResponse
     */
    @WebMethod(action = "getVoiceMailInfo")
    @WebResult(name = "getVoiceMailInfoResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public GetVoiceMailInfoResponse getVoiceMailInfo(
        @WebParam(name = "getVoiceMailInfoRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        GetVoiceMailInfoRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.GetVoiceMailPrefixesResponse
     */
    @WebMethod(action = "getVoiceMailPrefixes")
    @WebResult(name = "getVoiceMailPrefixesResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public GetVoiceMailPrefixesResponse getVoiceMailPrefixes(
        @WebParam(name = "getVoiceMailPrefixesRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        GetVoiceMailPrefixesRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.GetCallBackResponse
     */
    @WebMethod(action = "getCallBack")
    @WebResult(name = "getCallBackResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public GetCallBackResponse getCallBack(
        @WebParam(name = "getCallBackRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        GetCallBackRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.DeleteCallBackResponse
     */
    @WebMethod(action = "deleteCallBack")
    @WebResult(name = "deleteCallBackResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public DeleteCallBackResponse deleteCallBack(
        @WebParam(name = "deleteCallBackRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        DeleteCallBackRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.DeleteAllCallBackResponse
     */
    @WebMethod(action = "deleteAllCallBack")
    @WebResult(name = "deleteAllCallBackResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public DeleteAllCallBackResponse deleteAllCallBack(
        @WebParam(name = "deleteAllCallBackRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        DeleteAllCallBackRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.InvokeCallBackResponse
     */
    @WebMethod(action = "invokeCallBack")
    @WebResult(name = "invokeCallBackResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public InvokeCallBackResponse invokeCallBack(
        @WebParam(name = "invokeCallBackRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        InvokeCallBackRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.InvokeCallBackDuringCallResponse
     */
    @WebMethod(action = "invokeCallBackDuringCall")
    @WebResult(name = "invokeCallBackDuringCallResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public InvokeCallBackDuringCallResponse invokeCallBackDuringCall(
        @WebParam(name = "invokeCallBackDuringCallRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        InvokeCallBackDuringCallRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.StartRecordResponse
     */
    @WebMethod(action = "startRecord")
    @WebResult(name = "startRecordResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public StartRecordResponse startRecord(
        @WebParam(name = "startRecordRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        StartRecordRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.StopRecordResponse
     */
    @WebMethod(action = "stopRecord")
    @WebResult(name = "stopRecordResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public StopRecordResponse stopRecord(
        @WebParam(name = "stopRecordRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        StopRecordRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.PauseRecordResponse
     */
    @WebMethod(action = "pauseRecord")
    @WebResult(name = "pauseRecordResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public PauseRecordResponse pauseRecord(
        @WebParam(name = "pauseRecordRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        PauseRecordRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.ResumeRecordResponse
     */
    @WebMethod(action = "resumeRecord")
    @WebResult(name = "resumeRecordResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public ResumeRecordResponse resumeRecord(
        @WebParam(name = "resumeRecordRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        ResumeRecordRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.GetRecordStateResponse
     */
    @WebMethod(action = "getRecordState")
    @WebResult(name = "getRecordStateResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public GetRecordStateResponse getRecordState(
        @WebParam(name = "getRecordStateRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        GetRecordStateRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.GetCurrentCallInfoResponse
     */
    @WebMethod(action = "getCurrentCallInfo")
    @WebResult(name = "getCurrentCallInfoResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public GetCurrentCallInfoResponse getCurrentCallInfo(
        @WebParam(name = "getCurrentCallInfoRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        GetCurrentCallInfoRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.GetTelephonicStateResponse
     */
    @WebMethod(action = "getTelephonicState")
    @WebResult(name = "getTelephonicStateResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public GetTelephonicStateResponse getTelephonicState(
        @WebParam(name = "getTelephonicStateRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        GetTelephonicStateRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.GetBasicTelephonicStateResponse
     */
    @WebMethod(action = "getBasicTelephonicState")
    @WebResult(name = "getBasicTelephonicStateResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public GetBasicTelephonicStateResponse getBasicTelephonicState(
        @WebParam(name = "getBasicTelephonicStateRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        GetBasicTelephonicStateRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.IsPcmmResponse
     */
    @WebMethod(action = "isPcmm")
    @WebResult(name = "isPcmmResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public IsPcmmResponse isPcmm(
        @WebParam(name = "isPcmmRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        IsPcmmRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.SendMessToPcmmResponse
     */
    @WebMethod(action = "sendMessToPcmm")
    @WebResult(name = "sendMessToPcmmResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public SendMessToPcmmResponse sendMessToPcmm(
        @WebParam(name = "sendMessToPcmmRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        SendMessToPcmmRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.IsVoipReadyResponse
     */
    @WebMethod(action = "isVoipReady")
    @WebResult(name = "isVoipReadyResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public IsVoipReadyResponse isVoipReady(
        @WebParam(name = "isVoipReadyRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        IsVoipReadyRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.PutInServiceResponse
     */
    @WebMethod(action = "putInService")
    @WebResult(name = "putInServiceResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public PutInServiceResponse putInService(
        @WebParam(name = "putInServiceRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        PutInServiceRequest input);

    /**
     * 
     * @param input
     * @return
     *     returns com.alcatel_lucent.test.soapstub.types.phone.PutOutOfServiceResponse
     */
    @WebMethod(action = "putOutOfService")
    @WebResult(name = "putOutOfServiceResponse", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "output")
    public PutOutOfServiceResponse putOutOfService(
        @WebParam(name = "putOutOfServiceRequest", targetNamespace = "http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneSchema", partName = "input")
        PutOutOfServiceRequest input);

}
