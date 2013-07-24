package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneService;

public class AlcPhonePortTypeProxy implements com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneService.AlcPhonePortType {
  private String _endpoint = null;
  private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneService.AlcPhonePortType alcPhonePortType = null;
  
  public AlcPhonePortTypeProxy() {
    _initAlcPhonePortTypeProxy();
  }
  
  public AlcPhonePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initAlcPhonePortTypeProxy();
  }
  
  private void _initAlcPhonePortTypeProxy() {
    try {
      alcPhonePortType = (new com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneService.AlcPhoneServiceLocator()).getAlcPhonePort();
      if (alcPhonePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)alcPhonePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)alcPhonePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (alcPhonePortType != null)
      ((javax.xml.rpc.Stub)alcPhonePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneService.AlcPhonePortType getAlcPhonePortType() {
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType;
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetAccountInfoResponse getAccountInfo(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetAccountInfoRequest getAccountInfoRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.getAccountInfo(getAccountInfoRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCapabilitiesResponse getCapabilities(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCapabilitiesRequest getCapabilitiesRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.getCapabilities(getCapabilitiesRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetGlobalPhoneStateResponse getGlobalPhoneState(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetGlobalPhoneStateRequest getGlobalPhoneStateRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.getGlobalPhoneState(getGlobalPhoneStateRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.NomadLoginResponse nomadLogin(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.NomadLoginRequest nomadLoginRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.nomadLogin(nomadLoginRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.PermanentNomadLoginResponse permanentNomadLogin(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.PermanentNomadLoginRequest permanentNomadLoginRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.permanentNomadLogin(permanentNomadLoginRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.NomadLogoutResponse nomadLogout(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.NomadLogoutRequest nomadLogoutRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.nomadLogout(nomadLogoutRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNomadicStateResponse getNomadicState(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNomadicStateRequest getNomadicStateRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.getNomadicState(getNomadicStateRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNomadicRightResponse getNomadicRight(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNomadicRightRequest getNomadicRightRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.getNomadicRight(getNomadicRightRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetLineStateResponse getLineState(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetLineStateRequest getLineStateRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.getLineState(getLineStateRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeCallResponse makeCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeCallRequest makeCallRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.makeCall(makeCallRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakePrivateCallResponse makePrivateCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakePrivateCallRequest makePrivateCallRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.makePrivateCall(makePrivateCallRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeBusinessCallResponse makeBusinessCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeBusinessCallRequest makeBusinessCallRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.makeBusinessCall(makeBusinessCallRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeCorrelatorCallResponse makeCorrelatorCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeCorrelatorCallRequest makeCorrelatorCallRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.makeCorrelatorCall(makeCorrelatorCallRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendAssociateDataResponse sendAssociateData(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendAssociateDataRequest sendAssociateDataRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.sendAssociateData(sendAssociateDataRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TakeCallResponse takeCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TakeCallRequest takeCallRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.takeCall(takeCallRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.HoldCallResponse holdCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.HoldCallRequest holdCallRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.holdCall(holdCallRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ClearCallResponse clearCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ClearCallRequest clearCallRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.clearCall(clearCallRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ConferenceCallResponse conferenceCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ConferenceCallRequest conferenceCallRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.conferenceCall(conferenceCallRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TransferCallResponse transferCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TransferCallRequest transferCallRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.transferCall(transferCallRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeflectCallResponse deflectCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeflectCallRequest deflectCallRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.deflectCall(deflectCallRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeflectCallToVoiceMailResponse deflectCallToVoiceMail(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeflectCallToVoiceMailRequest deflectCallToVoiceMailRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.deflectCallToVoiceMail(deflectCallToVoiceMailRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.CancelConferenceCallResponse cancelConferenceCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.CancelConferenceCallRequest cancelConferenceCallRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.cancelConferenceCall(cancelConferenceCallRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TransferConferenceCallResponse transferConferenceCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TransferConferenceCallRequest transferConferenceCallRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.transferConferenceCall(transferConferenceCallRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ReleaseConferenceCallResponse releaseConferenceCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ReleaseConferenceCallRequest releaseConferenceCallRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.releaseConferenceCall(releaseConferenceCallRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.BlindTransferCallResponse blindTransferCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.BlindTransferCallRequest blindTransferCallRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.blindTransferCall(blindTransferCallRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ParkCallResponse parkCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ParkCallRequest parkCallRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.parkCall(parkCallRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.UnParkCallResponse unParkCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.UnParkCallRequest unParkCallRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.unParkCall(unParkCallRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.OverflowToVoiceMailResponse overflowToVoiceMail(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.OverflowToVoiceMailRequest overflowToVoiceMailRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.overflowToVoiceMail(overflowToVoiceMailRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallRecordCapabilitiesResponse getCallRecordCapabilities(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallRecordCapabilitiesRequest getCallRecordCapabilitiesRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.getCallRecordCapabilities(getCallRecordCapabilitiesRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetTelephonyCapabilitiesResponse getTelephonyCapabilities(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetTelephonyCapabilitiesRequest getTelephonyCapabilitiesRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.getTelephonyCapabilities(getTelephonyCapabilitiesRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendDtmfResponse sendDtmf(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendDtmfRequest sendDtmfRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.sendDtmf(sendDtmfRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallLogCapabilitiesResponse getCallLogCapabilities(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallLogCapabilitiesRequest getCallLogCapabilitiesRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.getCallLogCapabilities(getCallLogCapabilitiesRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNbUnansweredCallResponse getNbUnansweredCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetNbUnansweredCallRequest getNbUnansweredCallRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.getNbUnansweredCall(getNbUnansweredCallRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallLogResponse getCallLog(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallLogRequest getCallLogRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.getCallLog(getCallLogRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ModifyCallLogResponse modifyCallLog(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ModifyCallLogRequest modifyCallLogRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.modifyCallLog(modifyCallLogRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteCallLogResponse deleteCallLog(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteCallLogRequest deleteCallLogRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.deleteCallLog(deleteCallLogRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteAllCallLogResponse deleteAllCallLog(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteAllCallLogRequest deleteAllCallLogRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.deleteAllCallLog(deleteAllCallLogRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailMessagesNbResponse getVoiceMailMessagesNb(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailMessagesNbRequest getVoiceMailMessagesNbRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.getVoiceMailMessagesNb(getVoiceMailMessagesNbRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailInfoResponse getVoiceMailInfo(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailInfoRequest getVoiceMailInfoRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.getVoiceMailInfo(getVoiceMailInfoRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailPrefixesResponse getVoiceMailPrefixes(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetVoiceMailPrefixesRequest getVoiceMailPrefixesRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.getVoiceMailPrefixes(getVoiceMailPrefixesRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallBackResponse getCallBack(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallBackRequest getCallBackRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.getCallBack(getCallBackRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteCallBackResponse deleteCallBack(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteCallBackRequest deleteCallBackRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.deleteCallBack(deleteCallBackRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteAllCallBackResponse deleteAllCallBack(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeleteAllCallBackRequest deleteAllCallBackRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.deleteAllCallBack(deleteAllCallBackRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.InvokeCallBackResponse invokeCallBack(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.InvokeCallBackRequest invokeCallBackRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.invokeCallBack(invokeCallBackRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.InvokeCallBackDuringCallResponse invokeCallBackDuringCall(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.InvokeCallBackDuringCallRequest invokeCallBackDuringCallRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.invokeCallBackDuringCall(invokeCallBackDuringCallRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.StartRecordResponse startRecord(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.StartRecordRequest startRecordRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.startRecord(startRecordRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.StopRecordResponse stopRecord(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.StopRecordRequest stopRecordRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.stopRecord(stopRecordRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.PauseRecordResponse pauseRecord(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.PauseRecordRequest pauseRecordRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.pauseRecord(pauseRecordRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ResumeRecordResponse resumeRecord(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ResumeRecordRequest resumeRecordRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.resumeRecord(resumeRecordRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetRecordStateResponse getRecordState(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetRecordStateRequest getRecordStateRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.getRecordState(getRecordStateRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCurrentCallInfoResponse getCurrentCallInfo(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCurrentCallInfoRequest getCurrentCallInfoRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.getCurrentCallInfo(getCurrentCallInfoRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetTelephonicStateResponse getTelephonicState(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetTelephonicStateRequest getTelephonicStateRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.getTelephonicState(getTelephonicStateRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetBasicTelephonicStateResponse getBasicTelephonicState(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetBasicTelephonicStateRequest getBasicTelephonicStateRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.getBasicTelephonicState(getBasicTelephonicStateRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.IsPcmmResponse isPcmm(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.IsPcmmRequest isPcmmRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.isPcmm(isPcmmRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendMessToPcmmResponse sendMessToPcmm(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.SendMessToPcmmRequest sendMessToPcmmRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.sendMessToPcmm(sendMessToPcmmRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.IsVoipReadyResponse isVoipReady(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.IsVoipReadyRequest isVoipReadyRequest) throws java.rmi.RemoteException{
    if (alcPhonePortType == null)
      _initAlcPhonePortTypeProxy();
    return alcPhonePortType.isVoipReady(isVoipReadyRequest);
  }
  
  
}