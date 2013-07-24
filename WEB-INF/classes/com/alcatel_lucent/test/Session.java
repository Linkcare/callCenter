package com.alcatel_lucent.test;

import java.net.MalformedURLException;
import java.util.List;

import com.alcatel_lucent.test.soapstub.types.apiframework.AlcUserIdType;
import com.alcatel_lucent.test.soapstub.types.apiframework.LoginRequest;
import com.alcatel_lucent.test.soapstub.types.apiframework.LoginResponse;
import com.alcatel_lucent.test.soapstub.types.apiframework.LoginSupervisorRequest;
import com.alcatel_lucent.test.soapstub.types.apiframework.LoginSupervisorResponse;
import com.alcatel_lucent.test.soapstub.types.apiframework.LogoutRequest;
import com.alcatel_lucent.test.soapstub.types.apiframework.LogoutResponse;
import com.alcatel_lucent.test.soapstub.types.notifier.AlcSelector;
import com.alcatel_lucent.test.soapstub.types.notifier.PingRequest;
import com.alcatel_lucent.test.soapstub.types.notifier.PingResponse;
import com.alcatel_lucent.test.soapstub.types.notifier.SubscribeRequest;
import com.alcatel_lucent.test.soapstub.types.notifier.SubscribeResponse;
 

public class Session {
	
	private final Services m_services;
	private String m_sessionId;
	private String m_pbxName;
	
	public Session(Services pServices) {
		m_services = pServices;
		m_sessionId = null;
		m_pbxName = null;
	}
	
	public String getFwSessionId() {
		return m_sessionId;
	}
	
	public String getPbxName() {
		return m_pbxName;
	}
	
	public void setPbxName(String pPbxName) {
		m_pbxName = pPbxName;
	}
	
	public void login(String pLogin, String pPassword) throws SessionException {
		LoginRequest request = new LoginRequest();
		request.setLoginName(pLogin);
		request.setPassword(pPassword);
		LoginResponse response;
		try {
			response = m_services.getApiFramework().login(request);
		} catch (MalformedURLException e) {
			throw new SessionException(e);
		}
		if (response.getResultCode() != com.alcatel_lucent.test.soapstub.types.apiframework.AlcResultCode.SUCCESS) {
			throw new SessionException("login failed login=" + pLogin + " password=" + pPassword + " : " + response.getResultCode() + " / " + response.getComment());
		}
		m_sessionId = response.getFwSessionId();
	}
	
	public String loginSupervisor(String telefonoSupervisado) throws SessionException {
		LoginSupervisorResponse response = null;
		try {
			LoginSupervisorRequest loginSupervisorRequest = new LoginSupervisorRequest();
			loginSupervisorRequest.setSupervisorLoginName("espaitic");
			loginSupervisorRequest.setSupervisorPassword("clinic@espaitic");
			loginSupervisorRequest.setSupervisedAccountId(telefonoSupervisado);
			loginSupervisorRequest.setSupervisedAccountIdType(AlcUserIdType.PHONE_NUMBER);
			response = m_services.getApiFramework().loginSupervisor(loginSupervisorRequest);
		} catch (Exception e) {
			System.out.println("Login Failed");
			e.printStackTrace();
		}
		
		if (response.getResultCode() != com.alcatel_lucent.test.soapstub.types.apiframework.AlcResultCode.SUCCESS) {
			throw new SessionException("login failed telefonoSupervisado=" + telefonoSupervisado + " : " + response.getResultCode() + " / " + response.getComment());
		}
		m_sessionId = response.getFwSessionId();
		return m_sessionId;
	}
	
	public void logout() throws SessionException {
		LogoutRequest request = new LogoutRequest();
		request.setFwSessionId(m_sessionId);
		LogoutResponse response;
		try {
			response = m_services.getApiFramework().logout(request);
		} catch (MalformedURLException e) {
			throw new SessionException(e);
		}
		if (response.getResultCode() != com.alcatel_lucent.test.soapstub.types.apiframework.AlcResultCode.SUCCESS) {
			throw new SessionException("logout failed sessionId=" + m_sessionId + " : " + response.getResultCode() + " / " + response.getComment());
		}
	}
	
	
	
	public void subcribe(String pUrl, List<AlcSelector> pSelectors) throws SessionException {
		SubscribeRequest request = new SubscribeRequest();
		request.setFwSessionId(m_sessionId);
		request.setNotificationUrl(pUrl);
		request.getFilter().addAll(pSelectors);
		request.setExpires(0); //No expires
		SubscribeResponse response;
		try {
			response = m_services.getNotifier().subscribe(request);
		} catch (MalformedURLException e) {
			throw new SessionException(e);
		}
		if (response.getResultCode() != com.alcatel_lucent.test.soapstub.types.notifier.AlcResultCode.SUCCESS) {
			throw new SessionException("subcribe failed url=" + pUrl + " : " + response.getResultCode() + " / " + response.getComment());
		}
	}
	
	/**
	 * Nuevo método para verificar si funciona el ping
	 * @throws SessionException
	 */
	public void ping(String notificationURL) throws SessionException{
		PingResponse response = null;
		try {
			PingRequest pingRequest = new PingRequest();
			pingRequest.setFwSessionId(getFwSessionId());
			pingRequest.setNotificationUrl(notificationURL);
			response = m_services.getNotifier().ping(pingRequest);
		} catch (MalformedURLException e) {
			throw new SessionException(e);
		}
		if (response.getResultCode() != com.alcatel_lucent.test.soapstub.types.notifier.AlcResultCode.SUCCESS) {
			throw new SessionException("ping failed : " + response.getResultCode() + " / " + response.getComment());
		}
	}
	
}
