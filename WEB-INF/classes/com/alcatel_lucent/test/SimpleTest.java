package com.alcatel_lucent.test;

import java.io.InputStream;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;

import javax.xml.ws.Endpoint;

import org.apache.axis.types.PositiveInteger;
import org.apache.axis.types.NonNegativeInteger;

import com.alcatel_lucent.test.soapstub.fwmanagement.AlcFwManagementPortType;
import com.alcatel_lucent.test.soapstub.fwmanagement.AlcFwManagementService;
import com.alcatel_lucent.test.soapstub.types.fwmanagement.AlcBasicFrameworkUser;
import com.alcatel_lucent.test.soapstub.types.fwmanagement.GetFrameworkUsersRequest;
import com.alcatel_lucent.test.soapstub.types.fwmanagement.GetFrameworkUsersResponse;
import com.alcatel_lucent.test.soapstub.types.fwmanagement.LoadFrameworkUsersRequest;
import com.alcatel_lucent.test.soapstub.types.fwmanagement.LoadFrameworkUsersResponse;
import com.alcatel_lucent.test.soapstub.types.notifier.AlcSelector;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkService.AlcApiFrameworkPortType;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.frameworkService.AlcApiFrameworkServiceLocator;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallLogRequest;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallLogResponse;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneService.AlcPhonePortType;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallLogItem;

public class SimpleTest {

	// Configuration
	public static final String API_HOST = "uc1.linkcare.es";
	public static final String PBX_NAME = "Call Server";
//	public static String NOTIFICATION_URL = "http://pre.linkcare.es:8443/services/PhoneHandler";
	public static String NOTIFICATION_URL;
	public static Endpoint endpoint = null;
	public static Properties properties = new Properties();
	
	private final static String PROPERTIES_FILE = "config.properties";
	
	static{
		try{
			InputStream is = SimpleTest.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE);
			properties.load(is);
			NOTIFICATION_URL = properties.getProperty("NOTIFICATION_URL");
		}catch(Exception e){
		}
	}
	
	public static void delai(long pTime) {
		try {
			Thread.sleep(pTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private static List<AlcSelector> getAlcPhoneHandlerSelectors() {
		AlcSelector selector = new AlcSelector();
		selector.getNames().add("onLineStateChanged");
		selector.getNames().add("onNomadicStateChanged");
		selector.getNames().add("onTelephonicStateChanged");
		selector.getNames().add("onUnansweredCall");
		selector.getNames().add("onCallLogModified");
		selector.getNames().add("onCallBackNotificationChanged");
		selector.getNames().add("onVoiceMailMessagesNbChanged");
		selector.getNames().add("onPhoneSetLanguageChanged");
		selector.getNames().add("onPhoneSetStaticStateChanged");
		//selector.getNames().add("onOtsLinkDown");
		//selector.getNames().add("onOtsLinkUp");

		List<AlcSelector> selectors = new ArrayList<AlcSelector>();
		selectors.add(selector);
		return selectors;
	}
	
	public static void main(String[] pArgs) throws Exception {
		Session session = getSession();

//		// Start PhoneHandler server
//		Endpoint endpoint = Endpoint.publish(NOTIFICATION_URL, new PhoneHandler());
//		 System.out.println("isPublished: " + endpoint.isPublished());
//         System.out.println("getProperties: " + endpoint.getProperties());
//         System.out.println("getMetadata: " + endpoint.getMetadata());
//         System.out.println("getEndpointReference: " + endpoint.getEndpointReference());
//		// login
//		session.login("usu152", "0000");
//		
//		// subscribe to phone events
//		session.subcribe(NOTIFICATION_URL, getAlcPhoneHandlerSelectors());
//		
//		// delay of the test
//		delai(1000*60*60*24);
//
//		// stop the endpoint
//		endpoint.stop();
		
		List<AlcBasicFrameworkUser> llistaUsuaris = getAllUsers();
		int i = 0;
		for(AlcBasicFrameworkUser user : llistaUsuaris){
			if(user.getCompanyPhone().equals("152") || true){
				String sessionId = session.loginSupervisor(user.getCompanyPhone());
				GetCallLogRequest getCallLogRequest = new GetCallLogRequest(sessionId,user.getCompanyPhone(),new NonNegativeInteger("0"),new PositiveInteger("2000"),false);
				AlcPhonePortType aps = Phone.getServiceAlcPhone();
				GetCallLogResponse getCallLogResponse = aps.getCallLog(getCallLogRequest);
				System.out.println("Llamadas del usuario "+user.getCompanyPhone()+" :"+getCallLogResponse.getCallLogItems().length);
				for(int j=0;j<getCallLogResponse.getCallLogItems().length;j++){
					AlcCallLogItem item = getCallLogResponse.getCallLogItems(j);
					Calendar dateOfBegin = item.getDateOfBegin();
					Calendar dateOfConvers = item.getDateOfConvers();
					Calendar dateOfEnd = item.getDateOfEnd();
					System.out.println("---------------------------------------");
					System.out.println("Id. trucada"+item.getItemId().getTimeId()+":"+item.getItemId().getDiffId());
					System.out.println(item.isIncomingCall()?"Entrante":"Saliente");
					System.out.println("Jo soc el "+user.getCompanyPhone());
					System.out.println("L'altre pallo és el "+item.getCorrNumber().getNumber());
					System.out.println("Data Inici:"+dateOfBegin.getTime());
					System.out.println(" Data Fi:"+dateOfEnd.getTime());
					System.out.println("Data de conversacio "+dateOfConvers.getTime());
					long durationInMillis = dateOfEnd.getTimeInMillis() -
					dateOfConvers.getTimeInMillis();
					long seconds = (durationInMillis/1000)%60;
					long minutes = (durationInMillis/1000)/60;
					DecimalFormat df = new DecimalFormat("00");
					System.out.println("Tiempo de conversacion"+df.format(minutes)+":"+df.format(seconds));
					durationInMillis = dateOfEnd.getTimeInMillis() -
					dateOfBegin.getTimeInMillis();
					seconds = (durationInMillis/1000)%60;
					minutes = (durationInMillis/1000)/60;
					System.out.println("Tiempo de llamada"+df.format(minutes)+":"+df.format(seconds));
					
					//TODO
					//item.isAnsweredCall() Indica si se contestó la llamada
				}
			}
			i++;
		}
		
	}
	
	
	public static AlcFwManagementPortType getService() throws Exception{
		AlcFwManagementPortType service=null;
		AlcFwManagementService afms = new AlcFwManagementService();
		service = afms.getAlcFwManagementPort();
		return service;
	}
	
	public static void startPhoneHandler() throws Exception {
		Session session = getSession();

		// Start PhoneHandler server
		endpoint = Endpoint.publish(NOTIFICATION_URL, new PhoneHandler());
		System.out.println("isPublished: " + endpoint.isPublished());
        System.out.println("getProperties: " + endpoint.getProperties());
        System.out.println("getMetadata: " + endpoint.getMetadata());
        System.out.println("getEndpointReference: " + endpoint.getEndpointReference());
         
		
        //TODO: Pasar a login supervisor. Bucle for de login/subscribe
        // login
         
        List<AlcBasicFrameworkUser> llistaUsuaris = getAllUsers();
        for(AlcBasicFrameworkUser user : llistaUsuaris){
        	session.loginSupervisor(user.getCompanyPhone());
        	session.subcribe(NOTIFICATION_URL, getAlcPhoneHandlerSelectors());
        }
         
// 		session.login("usu150", "0000");
// 		// subscribe to phone events
// 		session.subcribe(NOTIFICATION_URL, getAlcPhoneHandlerSelectors());
//
//        // login
//		session.login("usu151", "0000");
//		// subscribe to phone events
//		session.subcribe(NOTIFICATION_URL, getAlcPhoneHandlerSelectors());
//
//		
//        // login
//		session.login("usu152", "0000");
//		// subscribe to phone events
//		session.subcribe(NOTIFICATION_URL, getAlcPhoneHandlerSelectors());
////		
////		// login
////		session.login("usu153", "0000");
////		// subscribe to phone events
//		session.subcribe(NOTIFICATION_URL, getAlcPhoneHandlerSelectors());
	}
	
	public static List<AlcBasicFrameworkUser> getAllUsers() throws Exception{
		Session session = getSession();
		session.login("espaitic","clinic@espaitic");
		
		String sessionId = session.getFwSessionId();
		AlcFwManagementPortType afms = getService();
		LoadFrameworkUsersRequest loadFrameworkUsersRequest = new LoadFrameworkUsersRequest();
		loadFrameworkUsersRequest.setFwSessionId(sessionId);
		LoadFrameworkUsersResponse loadFrameworkUsersResponse = afms.loadFrameworkUsers(loadFrameworkUsersRequest);
		
		GetFrameworkUsersRequest getFrameworkUsersRequest = new GetFrameworkUsersRequest();
		getFrameworkUsersRequest.setFwSessionId(sessionId);
		getFrameworkUsersRequest.setIndex(0);
		getFrameworkUsersRequest.setNbItems(loadFrameworkUsersResponse.getNbLoadedFrameworkUsers());
		
		GetFrameworkUsersResponse getFrameworkUsersResponse = afms.getFrameworkUsers(getFrameworkUsersRequest );
		List<AlcBasicFrameworkUser> llistaUsuaris = getFrameworkUsersResponse.getFrameworkUsers();
//		for(AlcBasicFrameworkUser user : llistaUsuaris){
//			String userName = user.getLoginName();
//			System.out.println(userName);
//		}
		return llistaUsuaris;
	}
	
	public static void endPhoneHandler() throws Exception {
		// stop the endpoint
		endpoint.stop();
	}
	
	private static Session getSession(){
		Services services = new Services(API_HOST);
		Session session = new Session(services);
		session.setPbxName(PBX_NAME);
		return session;
	}
	
	public static void pingPhoneHandler() throws Exception {
		System.out.println("Ejecutando pingPhoneHandler...");
		Session session = getSession();
         
         List<AlcBasicFrameworkUser> llistaUsuaris = getAllUsers();
         for(AlcBasicFrameworkUser user : llistaUsuaris){
        	 session.loginSupervisor(user.getCompanyPhone());
        	 try{
        		 session.ping(NOTIFICATION_URL);
        		 System.out.println("Usuario " + user.getCompanyPhone() + ". OK.");
        	 }catch(SessionException e){
        		 System.out.println("Error en el ping de " + user.getCompanyPhone() + " suscribiendo de nuevo.");
        		 try{
        			 session.subcribe(NOTIFICATION_URL, getAlcPhoneHandlerSelectors());
        			 System.out.println("Usuario " + user.getCompanyPhone() + " suscrito.");
        		 }catch(SessionException e1){
        			 System.out.println("Error al intentar suscribir de nuevo a " + user.getCompanyPhone());
        			 e1.printStackTrace();
        		 }
        	 }
         }
         System.out.println("Fin pingPhoneHandler");
	}

}
