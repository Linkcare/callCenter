package com.espaitic.services;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Endpoint;

import org.apache.axis.types.NonNegativeInteger;
import org.apache.axis.types.PositiveInteger;

import com.alcatel_lucent.test.Phone;
import com.alcatel_lucent.test.Services;
import com.alcatel_lucent.test.Session;
import com.alcatel_lucent.test.soapstub.types.fwmanagement.AlcBasicFrameworkUser;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallLogRequest;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneSchema.GetCallLogResponse;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.phoneService.AlcPhonePortType;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallLogItem;
import com.espaitic.bean.CallCenterLogAlcUser;
import com.espaitic.bean.CallCenterLogCallItem;
import com.espaitic.bean.CallCenterLogPeticioRegistre;
import com.espaitic.bean.CallCenterLogRespostaAlcUsuaris;
import com.espaitic.bean.CallCenterLogRespostaCallItem;
import com.espaitic.util.AlcatelUtils;

public class CallCenterLog {
	
	// Configuration
	public static final String API_HOST = "uc1.linkcare.es";
	public static final String PBX_NAME = "Call Server";
	public static Endpoint endpoint = null;

	public String getUsers(){
		System.out.println("funci� callCenterLog del Server");
		CallCenterLogRespostaAlcUsuaris usuaris = new CallCenterLogRespostaAlcUsuaris();
		try {
			List<CallCenterLogAlcUser> llistaUsuarisRetornar = new ArrayList<CallCenterLogAlcUser>();
			
			List<AlcBasicFrameworkUser> llistaUsuaris = AlcatelUtils.getAllUsers();
			for (AlcBasicFrameworkUser alcBasicFrameworkUser : llistaUsuaris) {
				CallCenterLogAlcUser alcUser = new CallCenterLogAlcUser();
				alcUser.setCompanyPhone(alcBasicFrameworkUser.getCompanyPhone());
				alcUser.setFirstName(alcBasicFrameworkUser.getFirstName());
				alcUser.setLastName(alcBasicFrameworkUser.getLastName());
				alcUser.setLoginName(alcBasicFrameworkUser.getLoginName());
				llistaUsuarisRetornar.add(alcUser);
			}
			//prova ini
			/*
			CallCenterLogAlcUser alcUser = new CallCenterLogAlcUser();
			alcUser.setCompanyPhone("--123");
			alcUser.setFirstName("Jordi");
			alcUser.setLastName("Urmeneta");
			alcUser.setLoginName("jurmeneta");
			llistaUsuarisRetornar.add(alcUser);
			alcUser = new CallCenterLogAlcUser();
			alcUser.setCompanyPhone("12345");
			alcUser.setFirstName("Jordi1");
			alcUser.setLastName("Urmeneta1");
			alcUser.setLoginName("jurmeneta1");
			llistaUsuarisRetornar.add(alcUser);
			*/
			//prova fi
			usuaris.setUsuaris(llistaUsuarisRetornar);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usuaris.toXML();
	}
	
	public String getCallsFromUser(String xml){

		CallCenterLogRespostaCallItem trucades = new CallCenterLogRespostaCallItem();
		try{
			CallCenterLogPeticioRegistre peticio = CallCenterLogPeticioRegistre.toObject(xml);
			System.out.println("getCallsFromUser server: "+peticio);
	
			//Obtenim els regisres que ens soliciten en la peticio
			Services services = new Services(API_HOST);
			Session session = new Session(services);
			session.setPbxName(PBX_NAME);
			String sessionId = session.loginSupervisor(peticio.getCompanyPhone());
			GetCallLogRequest getCallLogRequest = new GetCallLogRequest(sessionId,peticio.getCompanyPhone(),new NonNegativeInteger(peticio.getInici()),new PositiveInteger(peticio.getFi()),false);
			AlcPhonePortType aps = Phone.getServiceAlcPhone();
			GetCallLogResponse getCallLogResponse = aps.getCallLog(getCallLogRequest);
			System.out.println("Trucades del usuari "+peticio.getCompanyPhone()+" :"+getCallLogResponse.getCallLogItems().length);
			List<CallCenterLogCallItem> llistaTrucadesRetornar = new ArrayList<CallCenterLogCallItem>();
			for(int j=0;j<getCallLogResponse.getCallLogItems().length;j++){
				AlcCallLogItem item = getCallLogResponse.getCallLogItems(j);
				CallCenterLogCallItem callItem = new CallCenterLogCallItem();
				callItem.setAcknowledged(item.isAcknowledged());
				callItem.setAnsweredCall(item.isAnsweredCall());
				callItem.setCause(item.getCause().getValue());
				callItem.setCorrCanonicalNumber(item.getCorrCanonicalNumber());
				callItem.setCorrFirstName(item.getCorrFirstName());
				callItem.setCorrName(item.getCorrName());
				callItem.setCorrNumber(item.getCorrNumber().getNumber());
				callItem.setDateOfBegin(item.getDateOfBegin().getTimeInMillis());
				callItem.setDateOfConvers(item.getDateOfConvers().getTimeInMillis());
				callItem.setDateOfEnd(item.getDateOfEnd().getTimeInMillis());
//				callItem.setDiffId(item.getItemId().getDiffId());
				//TODO: Modificar ID per evitar ID LLAMADAS repetits
				callItem.setDiffId(item.getItemId().getDiffId() + item.getItemId().getTimeId());
				callItem.setDirNumber(item.getDirNumber());
				callItem.setExternalCall(item.isExternalCall());
				callItem.setIncomingCall(item.isIncomingCall());
				callItem.setInitialNumber(item.getInitialNumber().getNumber());
				callItem.setNewDestNumber(item.getNewDestNumber());
				callItem.setRedirectedCall(item.isRedirectedCall());
				callItem.setTimeId(item.getItemId().getTimeId());
				llistaTrucadesRetornar.add(callItem);
			}
			//prova ini
			/*
			List<CallCenterLogCallItem> llistaTrucadesRetornar = new ArrayList<CallCenterLogCallItem>();
			CallCenterLogCallItem callItem = new CallCenterLogCallItem();
			callItem.setAcknowledged(true);
			callItem.setCause("BUSY");
			callItem.setCorrNumber("123456789");
			llistaTrucadesRetornar.add(callItem);
			trucades.setTrucades(llistaTrucadesRetornar);
			*/
			//prova fi
			trucades.setTrucades(llistaTrucadesRetornar);
			
		}catch (Exception e) {
			return null;
		}
		return trucades.toXML();
	}
}
