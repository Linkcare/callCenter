package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkService;

public class AlcApiFrameworkPortTypeProxy implements com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkService.AlcApiFrameworkPortType {
  private String _endpoint = null;
  private com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkService.AlcApiFrameworkPortType alcApiFrameworkPortType = null;
  
  public AlcApiFrameworkPortTypeProxy() {
    _initAlcApiFrameworkPortTypeProxy();
  }
  
  public AlcApiFrameworkPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initAlcApiFrameworkPortTypeProxy();
  }
  
  private void _initAlcApiFrameworkPortTypeProxy() {
    try {
      alcApiFrameworkPortType = (new com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkService.AlcApiFrameworkServiceLocator()).getAlcApiFrameworkPort();
      if (alcApiFrameworkPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)alcApiFrameworkPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)alcApiFrameworkPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (alcApiFrameworkPortType != null)
      ((javax.xml.rpc.Stub)alcApiFrameworkPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkService.AlcApiFrameworkPortType getAlcApiFrameworkPortType() {
    if (alcApiFrameworkPortType == null)
      _initAlcApiFrameworkPortTypeProxy();
    return alcApiFrameworkPortType;
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LoginResponse login(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LoginRequest loginRequest) throws java.rmi.RemoteException{
    if (alcApiFrameworkPortType == null)
      _initAlcApiFrameworkPortTypeProxy();
    return alcApiFrameworkPortType.login(loginRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.OpenFrameworkSessionResponse openFrameworkSession(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.OpenFrameworkSessionRequest openFrameworkSessionRequest) throws java.rmi.RemoteException{
    if (alcApiFrameworkPortType == null)
      _initAlcApiFrameworkPortTypeProxy();
    return alcApiFrameworkPortType.openFrameworkSession(openFrameworkSessionRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LoginSupervisorResponse loginSupervisor(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LoginSupervisorRequest loginSupervisorRequest) throws java.rmi.RemoteException{
    if (alcApiFrameworkPortType == null)
      _initAlcApiFrameworkPortTypeProxy();
    return alcApiFrameworkPortType.loginSupervisor(loginSupervisorRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.ChangePasswordResponse changePassword(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.ChangePasswordRequest changePasswordRequest) throws java.rmi.RemoteException{
    if (alcApiFrameworkPortType == null)
      _initAlcApiFrameworkPortTypeProxy();
    return alcApiFrameworkPortType.changePassword(changePasswordRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LogoutResponse logout(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LogoutRequest logoutRequest) throws java.rmi.RemoteException{
    if (alcApiFrameworkPortType == null)
      _initAlcApiFrameworkPortTypeProxy();
    return alcApiFrameworkPortType.logout(logoutRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.GetFrameworkAccountInfoResponse getFrameworkAccountInfo(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.GetFrameworkAccountInfoRequest getFrameworkAccountInfoRequest) throws java.rmi.RemoteException{
    if (alcApiFrameworkPortType == null)
      _initAlcApiFrameworkPortTypeProxy();
    return alcApiFrameworkPortType.getFrameworkAccountInfo(getFrameworkAccountInfoRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.GetFrameworkAccountRightsResponse getFrameworkAccountRights(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.GetFrameworkAccountRightsRequest getFrameworkAccountRightsRequest) throws java.rmi.RemoteException{
    if (alcApiFrameworkPortType == null)
      _initAlcApiFrameworkPortTypeProxy();
    return alcApiFrameworkPortType.getFrameworkAccountRights(getFrameworkAccountRightsRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.SetSessionTimerValueResponse setSessionTimerValue(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.SetSessionTimerValueRequest setSessionTimerValueRequest) throws java.rmi.RemoteException{
    if (alcApiFrameworkPortType == null)
      _initAlcApiFrameworkPortTypeProxy();
    return alcApiFrameworkPortType.setSessionTimerValue(setSessionTimerValueRequest);
  }
  
  public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.RestartSessionTimerResponse restartSessionTimer(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.RestartSessionTimerRequest restartSessionTimerRequest) throws java.rmi.RemoteException{
    if (alcApiFrameworkPortType == null)
      _initAlcApiFrameworkPortTypeProxy();
    return alcApiFrameworkPortType.restartSessionTimer(restartSessionTimerRequest);
  }
  
  
}