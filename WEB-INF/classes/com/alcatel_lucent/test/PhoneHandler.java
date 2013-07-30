package com.alcatel_lucent.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import javax.jws.WebService;

import com.alcatel_lucent.test.soapstub.phonehandler.AlcPhoneHandlerPortType;
import com.alcatel_lucent.test.soapstub.types.phone.AlcCall;
import com.alcatel_lucent.test.soapstub.types.phonehandler.OnCallBackNotificationChangedRequest;
import com.alcatel_lucent.test.soapstub.types.phonehandler.OnCallLogModifiedRequest;
import com.alcatel_lucent.test.soapstub.types.phonehandler.OnLineStateChangedRequest;
import com.alcatel_lucent.test.soapstub.types.phonehandler.OnNomadicStateChangedRequest;
import com.alcatel_lucent.test.soapstub.types.phonehandler.OnOtsLinkDownRequest;
import com.alcatel_lucent.test.soapstub.types.phonehandler.OnOtsLinkUpRequest;
import com.alcatel_lucent.test.soapstub.types.phonehandler.OnPhoneSetLanguageChangedRequest;
import com.alcatel_lucent.test.soapstub.types.phonehandler.OnPhoneSetStaticStateChangedRequest;
import com.alcatel_lucent.test.soapstub.types.phonehandler.OnTelephonicStateChangedRequest;
import com.alcatel_lucent.test.soapstub.types.phonehandler.OnUnansweredCallRequest;
import com.alcatel_lucent.test.soapstub.types.phonehandler.OnVoiceMailMessagesNbChangedRequest;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallState;
import com.espaitic.bean.CallCenterLlamadas;
import com.espaitic.util.Constants;
import com.linkcare.objects.Session;
import com.linkcare.objects.Event;

import desertic.database.LlamadaAlcatel;


@WebService(endpointInterface="com.alcatel_lucent.test.soapstub.phonehandler.AlcPhoneHandlerPortType")
public class PhoneHandler implements AlcPhoneHandlerPortType {

	public static final String URL_CALL_CENTER = "localhost:8080";
	
	private static void lanzarURL(String url){
		try {
			HttpURLConnection conn = (HttpURLConnection)(new URL(url.toString())).openConnection();	
			
			BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			StringBuilder resp = new StringBuilder();
			String line = rd.readLine();
			while(line!=null){
				resp.append(line);
				line = rd.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void lanzarURLPOST(String strUrl, Hashtable<String,String> valores){
		try {
			String data = "";
			Enumeration<String> enumeration = valores.keys();
			int i=0;
			while(enumeration.hasMoreElements()){
				
				String key = enumeration.nextElement();
				if(i>0){
					data+="&";
				}else {
					i++;
				}
				data += URLEncoder.encode(key, "UTF-8") + "=" + URLEncoder.encode(valores.get(key), "UTF-8");
			}
		    URL url = new URL(strUrl);
		    URLConnection conn = url.openConnection();
		    conn.setDoOutput(true);
		    OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
		    wr.write(data);
		    wr.flush();
	
		    // Get the response
		    BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		    String line;
		    while ((line = rd.readLine()) != null) {
		        // Process line...
		    }
		    wr.close();
		    rd.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void onLineStateChanged(OnLineStateChangedRequest input) {
		System.out.println("PhoneHandler.onLineStateChanged lineNumber=" + input.getLineNumber());
	}


	public void onNomadicStateChanged(OnNomadicStateChangedRequest input) {
		System.out.println("PhoneHandler.onNomadicStateChanged lineNumber=" + input.getLineNumber());
	}

	public void onTelephonicStateChanged(OnTelephonicStateChangedRequest input) {
		boolean updateServer = false;
		System.out.println("PhoneHandler.onTelephonicStateChanged lineNumber=" + input.getLineNumber());
		com.alcatel_lucent.test.soapstub.types.phone.AlcTelephonicState alcTelephonicState = input.getState();
		
		List<LlamadaAlcatel> llamadas = new ArrayList<LlamadaAlcatel>();
		long idCallActiva = alcTelephonicState.getCurrentCallRef();
		if(idCallActiva==-1){
			//Si no hay ninguna llamada activa, no hay llamadas. Eliminamos todas las llamadas de la linea
			try{
				System.out.println("idCallActiva==-1. Eliminamos todas las llamadas de la linea "+input.getLineNumber());
				updateServer = true;
				lanzarURL("http://"+URL_CALL_CENTER+"/callCenter/servlets/SRVCallCenter?op=removeAllCalls&idLineNumber="+input.getLineNumber());
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		for(AlcCall a : alcTelephonicState.getCalls()){
//			if(a.getCallRef() == idCallActiva){
				if(a.getState().value().equals(AlcCallState._RINGING_INCOMING) || 
						a.getState().value().equals(AlcCallState._RINGING_OUTGOING)){
					updateServer = true;
					//TODO: añadir resto de casos de llamadas "activas"
					try{
						String numeroQueTruca = "";
						String numeroAlQueTruca = "";
						if(a.getState().value().equals(AlcCallState._RINGING_OUTGOING)){
							numeroQueTruca = input.getLineNumber();
							numeroAlQueTruca = a.getNumber();
						}else if(a.getState().value().equals(AlcCallState._RINGING_INCOMING)){
							numeroQueTruca = a.getNumber();
							numeroAlQueTruca = input.getLineNumber();
						}
						//Nueva llamada, la añadimos a la hash
						LlamadaAlcatel llamada = new LlamadaAlcatel(
								String.valueOf(a.getCallRef()), 	//idCallRef
								numeroQueTruca, 					//numeroQueTruca
								numeroAlQueTruca, 					//numeroAlQueTruca
								null, 								//idPersonaTrucada
								null, 								//nomPersonaTrucada
								a.getState().value(), 				//estat
								null, 								//horaInici
								null, 								//horaIniciConversa
								null);								//horaFi
						llamadas.add(llamada);
						
						String result = "";
						Session s = new Session();
						Event evt = new Event();
						String location = "http://localhost:8000/ServerWSDL.php";
						String user = "carme.hernandez";
						String password = "linkcare";
						s.setLocation(location);
						evt.setLocation(location);
						result = s.init(user,password,"IP","");
						if ( result.equals("-1") ) {
							System.out.println("Resultado erroneo:" + s.getErrorMsg()); 
						} else {
							System.out.println("Resultado correcto: token:" + result + " user:"+ s.user + " " + s.name ); 
							System.out.println("event.insert('session','date', 'case','event_type')"); 
							result = evt.insert( result, "2013-01-01", "", "#EVENT:CARE");
							if ( result.equals("-1") ) {
								System.out.println("Resultado erroneo:" + evt.getErrorMsg()); 
							} else {
								System.out.println("Resultado correcto:" + result); 
							}
						}
						
					}catch(Exception e){
						e.printStackTrace();
					}
					System.out.println(a.getState().value());
				}else if(a.getState().value().equals(AlcCallState._RELEASING) ||
						a.getState().value().equals(AlcCallState._BUSY_TONE) ||
						a.getState().value().equals(AlcCallState._IDLE) ||
						a.getState().value().equals(AlcCallState._UNREACHABLE)){
					try{
						updateServer = true;
						//Fin de llamada
					}catch(Exception e){
						e.printStackTrace();
					}
					System.out.println(a.getState().value());
				}else if(a.getState().value().equals(AlcCallState._INIT)){
					updateServer = true;
					LlamadaAlcatel llamada = new LlamadaAlcatel(
							String.valueOf(a.getCallRef()), 	//idCallRef
							null, 								//numeroQueTruca
							null, 								//numeroAlQueTruca
							null, 								//idPersonaTrucada
							null, 								//nomPersonaTrucada
							a.getState().value(), 				//estat
							null, 								//horaInici
							null, 								//horaIniciConversa
							null);								//horaFi
					llamadas.add(llamada);
					System.out.println(a.getState().value());
				}else if(a.getState().value().equals(AlcCallState._ACTIVE)){
					updateServer = true;
					LlamadaAlcatel llamada = new LlamadaAlcatel(
							String.valueOf(a.getCallRef()), 	//idCallRef
							null, 								//numeroQueTruca
							null, 								//numeroAlQueTruca
							null, 								//idPersonaTrucada
							null, 								//nomPersonaTrucada
							a.getState().value(), 				//estat
							null, 								//horaInici
							null, 								//horaIniciConversa
							null);								//horaFi
					llamadas.add(llamada);
					System.out.println(a.getState().value());
				}else if(a.getState().value().equals(AlcCallState._HELD)){
					updateServer = true;
					LlamadaAlcatel llamada = new LlamadaAlcatel(
							String.valueOf(a.getCallRef()), 	//idCallRef
							null, 								//numeroQueTruca
							null, 								//numeroAlQueTruca
							null, 								//idPersonaTrucada
							null, 								//nomPersonaTrucada
							a.getState().value(), 				//estat
							null, 								//horaInici
							null, 								//horaIniciConversa
							null);								//horaFi
					llamadas.add(llamada);
					System.out.println(a.getState().value());
				}else{
					System.out.println("\n\nEstado no tratado!!!\n"+a.getState().value()+"\n\n\n");
					System.out.println(a.getState().value());
				}
				
//			}
		}
		
		if(updateServer){
			try{
				CallCenterLlamadas ccl = new CallCenterLlamadas(new Integer(Constants.XML_ID_DATOS), llamadas);
				Hashtable<String,String> valores = new Hashtable<String, String>();
				valores.put("op", "updateCalls");
				valores.put("idLineNumber", input.getLineNumber());
				System.out.println("PhoneHandler: updateCalls: idLineNumber = "+input.getLineNumber()+" Llamadas = "+llamadas.toString());
				valores.put("llamadasAlcatel", ccl.toXML());
				valores.put("d", String.valueOf(System.currentTimeMillis()));
				lanzarURLPOST("http://"+URL_CALL_CENTER+"/callCenter/servlets/SRVCallCenter",valores);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	public void onUnansweredCall(OnUnansweredCallRequest input) {
		System.out.println("PhoneHandler.onUnansweredCall lineNumber=" + input.getLineNumber());
	}

	public void onCallLogModified(OnCallLogModifiedRequest input) {
		System.out.println("PhoneHandler.onCallLogModified lineNumber=" + input.getLineNumber());
	}

	public void onCallBackNotificationChanged(OnCallBackNotificationChangedRequest input) {
		System.out.println("PhoneHandler.onCallBackNotificationChanged lineNumber=" + input.getLineNumber());
	}

	public void onVoiceMailMessagesNbChanged(OnVoiceMailMessagesNbChangedRequest input) {
		System.out.println("PhoneHandler.onVoiceMailMessagesNbChanged lineNumber=" + input.getLineNumber());
	}

	public void onPhoneSetLanguageChanged(OnPhoneSetLanguageChangedRequest input) {
		System.out.println("PhoneHandler.onPhoneSetLanguageChanged lineNumber=" + input.getLineNumber());
	}

	public void onPhoneSetStaticStateChanged(OnPhoneSetStaticStateChangedRequest input) {
		System.out.println("PhoneHandler.onPhoneSetStaticStateChanged lineNumber=" + input.getLineNumber());
	}

	public void onOtsLinkDown(OnOtsLinkDownRequest input) {
		System.out.println("PhoneHandler.onOtsLinkDown otsId=" + input.getOtsId());
	}

	public void onOtsLinkUp(OnOtsLinkUpRequest input) {
		System.out.println("PhoneHandler.onOtsLinkUp otsId=" + input.getOtsId());
	}
}
