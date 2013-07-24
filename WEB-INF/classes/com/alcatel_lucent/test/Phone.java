package com.alcatel_lucent.test;

import java.net.URL;

import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.AlcFrameworkAccountInfo;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.GetFrameworkAccountInfoRequest;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.GetFrameworkAccountInfoResponse;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LoginRequest;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LoginResponse;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkSchema.LogoutRequest;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkService.AlcApiFrameworkPortType;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkService.AlcApiFrameworkServiceLocator;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ClearCallRequest;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.ClearCallResponse;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeflectCallRequest;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.DeflectCallResponse;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetTelephonicStateRequest;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetTelephonicStateResponse;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.HoldCallRequest;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeCallRequest;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.MakeCallResponse;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TakeCallRequest;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TransferCallRequest;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.TransferCallResponse;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneService.AlcPhonePortType;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneService.AlcPhoneServiceLocator;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCall;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallState;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcTelephonicState;
import com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierService.AlcNotifierPortType;
import com.alcatel_lucent.www.wsp.ns._2008._05._26.ics.notifierService.AlcNotifierServiceLocator;

public class Phone {

	public static final String API_HOST = "uc1.linkcare.es";
	
	public static AlcApiFrameworkPortType serviceFw = null;
	public static AlcPhonePortType servicePhone = null;
	public static AlcNotifierPortType serviceNotifier = null;
	
	public static AlcFrameworkAccountInfo getUserInfo(String fwSessionId){
		AlcFrameworkAccountInfo afAccountInfo = null;
		try{
			GetFrameworkAccountInfoResponse usuario = getServiceAlcFw().getFrameworkAccountInfo(new GetFrameworkAccountInfoRequest(fwSessionId));
			afAccountInfo = usuario.getAccountInfo();
			System.out.println("Session Id:"+afAccountInfo.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return afAccountInfo;
	}
	
	public static long makeCall(String sessionId, String extDesti){
		long idTrucada = 0;
		try {
			String extOrigen = getUserInfo(sessionId).getCompanyPhone();
			AlcPhonePortType aps = getServiceAlcPhone();
			MakeCallRequest makeCallRequest = new MakeCallRequest(sessionId, extOrigen, extDesti);
			MakeCallResponse makeCallResponse = aps.makeCall(makeCallRequest);
			
			idTrucada = makeCallResponse.getCallRef();
			
			
//			GetTelephonicStateRequest getTelephonicStateRequest = new GetTelephonicStateRequest(sessionId, extOrigen);
//			GetTelephonicStateResponse getTelephonicStateResponse = aps.getTelephonicState(getTelephonicStateRequest);
//			
//			AlcTelephonicState alcTelephonicState = getTelephonicStateResponse.getTelephonicState();
//			
//			AlcCall[] calls = alcTelephonicState.getCalls();
//			if (calls!=null && calls.length > 0){
//				for(int i=0; i<calls.length; i++){
//					if(calls[i].getCallRef() == idTrucada){//No hi ha forma millor de fer-ho, però un teèfon no tindrà més de 2/3? calls actives
//						System.out.println("STATE Actual Call: "+alcTelephonicState.getCalls(i).getState().toString());
//					}
//				}
//				
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return idTrucada;
	}
	
	public static long hangUp(String sessionId, String idCallToHangUp) {
		long idCall = Long.parseLong(idCallToHangUp);
		
		try {
			String extension = getUserInfo(sessionId).getCompanyPhone();
			AlcPhonePortType aps = getServiceAlcPhone();
			GetTelephonicStateRequest getTelephonicStateRequest = new GetTelephonicStateRequest(sessionId, extension);
			GetTelephonicStateResponse getTelephonicStateResponse = aps.getTelephonicState(getTelephonicStateRequest);

			AlcTelephonicState alcTelephonicState = getTelephonicStateResponse.getTelephonicState();
			
			AlcCall[] calls = alcTelephonicState.getCalls();
			if (calls!=null && calls.length > 0){
				for(int i=0; i<calls.length; i++){
					if(idCall == calls[i].getCallRef()){
						//System.out.println("Hello "+calls[0].getName()+" you're calling from "+calls[0].getNumber());
						TakeCallRequest takeCallRequest = new TakeCallRequest(sessionId, extension, idCall);
						aps.takeCall(takeCallRequest);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return idCall;
	}
	
	public static long hold(String sessionId, String idCallToHeld) {
		long idCall = Long.parseLong(idCallToHeld);
		
		try {
			String extension = getUserInfo(sessionId).getCompanyPhone();
			AlcPhonePortType aps = getServiceAlcPhone();
			GetTelephonicStateRequest getTelephonicStateRequest = new GetTelephonicStateRequest(sessionId, extension);
			GetTelephonicStateResponse getTelephonicStateResponse = aps.getTelephonicState(getTelephonicStateRequest);

			AlcTelephonicState alcTelephonicState = getTelephonicStateResponse.getTelephonicState();
			
			AlcCall[] calls = alcTelephonicState.getCalls();
			if (calls!=null && calls.length > 0){
				for(int i=0; i<calls.length; i++){
					if(idCall == calls[i].getCallRef()){
						//System.out.println("Hello "+calls[0].getName()+" you're calling from "+calls[0].getNumber());
						HoldCallRequest holdCallRequest = new HoldCallRequest(sessionId, extension, idCall);
						aps.holdCall(holdCallRequest);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return idCall;
	}
	
	public static String endCall(String sessionId, String idCallToHangUp) {
		long idCall = Long.parseLong(idCallToHangUp);
		try {
			AlcPhonePortType aps = getServiceAlcPhone();
			GetTelephonicStateRequest getTelephonicStateRequest = new GetTelephonicStateRequest(sessionId, getUserInfo(sessionId).getCompanyPhone());
			GetTelephonicStateResponse getTelephonicStateResponse = aps.getTelephonicState(getTelephonicStateRequest);

			AlcTelephonicState alcTelephonicState = getTelephonicStateResponse.getTelephonicState();
			
			AlcCall[] calls = alcTelephonicState.getCalls();
			
			return endCall(sessionId, getUserInfo(sessionId).getCompanyPhone(), idCall);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public static String forward(String sessionId, String newNumber) {
		long idCall = 0;
		try {
			AlcPhonePortType aps = getServiceAlcPhone();
			GetTelephonicStateRequest getTelephonicStateRequest = new GetTelephonicStateRequest(sessionId, getUserInfo(sessionId).getCompanyPhone());
			GetTelephonicStateResponse getTelephonicStateResponse = aps.getTelephonicState(getTelephonicStateRequest);

			AlcTelephonicState alcTelephonicState = getTelephonicStateResponse.getTelephonicState();
			
			AlcCall[] calls = alcTelephonicState.getCalls();
			if (calls!=null && calls.length > 0){
				idCall = calls[0].getCallRef();
			}
			
			//HoldCallRequest holdCallRequest = new HoldCallRequest(sessionId, getUserInfo(sessionId).getCompanyPhone(), idCall);
			//aps.holdCall(holdCallRequest);
			
			DeflectCallRequest deflectCallRequest = new DeflectCallRequest(sessionId, getUserInfo(sessionId).getCompanyPhone(), idCall, newNumber);
			DeflectCallResponse deflectCallResponse = aps.deflectCall(deflectCallRequest);
			deflectCallResponse.getResultCode();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public static void transferCall(String sessionId, String idCallActive, String idCallHeld) {
		long idCall = 0;
		try {
//			hold(sessionId, idCallHeld);
			AlcPhonePortType aps = getServiceAlcPhone();
			GetTelephonicStateRequest getTelephonicStateRequest = new GetTelephonicStateRequest(sessionId, getUserInfo(sessionId).getCompanyPhone());
			GetTelephonicStateResponse getTelephonicStateResponse = aps.getTelephonicState(getTelephonicStateRequest);

			AlcTelephonicState alcTelephonicState = getTelephonicStateResponse.getTelephonicState();
			AlcCallState estadoLlamadaActual = null;
			AlcCall[] calls = alcTelephonicState.getCalls();
			if (calls!=null && calls.length > 0){
				for(int i=0; i<calls.length; i++){
					if(Long.parseLong(idCallHeld) == calls[i].getCallRef()){
						//System.out.println("Hello "+calls[0].getName()+" you're calling from "+calls[0].getNumber());
						AlcCall trucadaActiva = calls[i];
						estadoLlamadaActual = trucadaActiva.getState();
					}
				}
			}
			if(estadoLlamadaActual.getValue().equals(AlcCallState._ACTIVE)){
				TransferCallRequest transferCallRequest = new TransferCallRequest(sessionId, getUserInfo(sessionId).getCompanyPhone(), Long.parseLong(idCallHeld), Long.parseLong(idCallActive));
				TransferCallResponse transferCallResponse = aps.transferCall(transferCallRequest);
				transferCallResponse.getResultCode();
			}else{
				TransferCallRequest transferCallRequest = new TransferCallRequest(sessionId, getUserInfo(sessionId).getCompanyPhone(), Long.parseLong(idCallActive), Long.parseLong(idCallHeld));
				TransferCallResponse transferCallResponse = aps.transferCall(transferCallRequest);
				transferCallResponse.getResultCode();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private static String endCall(String sessionId, String extOrigen, long idCall){
		try{
			AlcPhonePortType aps = getServiceAlcPhone();
			ClearCallRequest clearCallRequest = new ClearCallRequest(sessionId, extOrigen, idCall);
			ClearCallResponse clearCallResponse =  aps.clearCall(clearCallRequest);
			clearCallResponse.getResultCode();
			
//			GetCallLogRequest getCallLogRequest = new GetCallLogRequest(sessionId,getUserInfo(sessionId).getCompanyPhone(),new NonNegativeInteger("0"),new PositiveInteger("1"),true);
//			GetCallLogResponse getCallLogResponse = aps.getCallLog(getCallLogRequest);
//			long durationInMillis = getCallLogResponse.getCallLogItems(0).getDateOfEnd().getTime().getTime() -
//			getCallLogResponse.getCallLogItems(0).getDateOfConvers().getTime().getTime();
//			long seconds = (durationInMillis/1000)%60;
//			long minutes = (durationInMillis/1000);
//			return Long.toString(minutes)+":"+Long.toString(seconds);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String login(String user, String password){
		LoginResponse loginResponse = null;
		try {
			LoginRequest loginRequest = new LoginRequest(user, password);
			loginResponse = getServiceAlcFw().login(loginRequest);
			if(loginResponse!=null 
					&& loginResponse.getFwSessionId()!=null
					&& (!("".equals(loginResponse.getFwSessionId().trim())))){
				System.out.println("Login !");
//				AlcFrameworkAccountInfo afAccountInfo = getUserInfo(loginResponse.getFwSessionId());
//				
//				System.out.println("My Number("+user+") is: "+afAccountInfo.getCompanyPhone());
				return loginResponse.getFwSessionId();
			}
			System.out.println("Login Failed");
		} catch (Exception e) {
			System.out.println("Login Failed");
			e.printStackTrace();
		}
		return null;
	}
	
	public static void logout(String fwSessionId){
		try {
			LogoutRequest logoutRequest = new LogoutRequest(fwSessionId);
			getServiceAlcFw().logout(logoutRequest);
		} catch (Exception e) {
			System.out.println("Logout Failed");
			e.printStackTrace();
		}
	}

	public static AlcApiFrameworkPortType getServiceAlcFw() throws Exception{
		if (serviceFw==null){
			AlcApiFrameworkServiceLocator xafsl = new AlcApiFrameworkServiceLocator();
			serviceFw = xafsl.getAlcApiFrameworkPort(new URL("http://"+API_HOST+"/api/services/AlcApiFrameworkPort"));
		}
		return serviceFw;
	}
	
	public static AlcPhonePortType getServiceAlcPhone() throws Exception{
		if (servicePhone==null){
			AlcPhoneServiceLocator apsl = new AlcPhoneServiceLocator();
			servicePhone = apsl.getAlcPhonePort(new URL("http://"+API_HOST+"/api/services/AlcPhone"));
		}else{
			System.out.println(""+servicePhone.hashCode());
		}
		return servicePhone;
	}

	public static AlcNotifierPortType getServiceNotifierPortType() throws Exception{
		if (serviceNotifier==null){
			AlcNotifierServiceLocator ansl = new AlcNotifierServiceLocator();
			serviceNotifier = ansl.getAlcNotifierPort(new URL("http://"+API_HOST+"/api/services/AlcNotifier"));
		}
		return serviceNotifier;
	}
}
