/**
 * AlcApiFrameworkPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkService;

public interface AlcApiFrameworkPortType extends java.rmi.Remote {
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LoginResponse login(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LoginRequest loginRequest) throws java.rmi.RemoteException;
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.OpenFrameworkSessionResponse openFrameworkSession(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.OpenFrameworkSessionRequest openFrameworkSessionRequest) throws java.rmi.RemoteException;
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LoginSupervisorResponse loginSupervisor(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LoginSupervisorRequest loginSupervisorRequest) throws java.rmi.RemoteException;
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.ChangePasswordResponse changePassword(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.ChangePasswordRequest changePasswordRequest) throws java.rmi.RemoteException;
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LogoutResponse logout(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LogoutRequest logoutRequest) throws java.rmi.RemoteException;
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.GetFrameworkAccountInfoResponse getFrameworkAccountInfo(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.GetFrameworkAccountInfoRequest getFrameworkAccountInfoRequest) throws java.rmi.RemoteException;
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.GetFrameworkAccountRightsResponse getFrameworkAccountRights(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.GetFrameworkAccountRightsRequest getFrameworkAccountRightsRequest) throws java.rmi.RemoteException;
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.SetSessionTimerValueResponse setSessionTimerValue(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.SetSessionTimerValueRequest setSessionTimerValueRequest) throws java.rmi.RemoteException;
    public com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.RestartSessionTimerResponse restartSessionTimer(com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.RestartSessionTimerRequest restartSessionTimerRequest) throws java.rmi.RemoteException;
}
