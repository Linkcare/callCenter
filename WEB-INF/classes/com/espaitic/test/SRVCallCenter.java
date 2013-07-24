package com.espaitic.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.alcatel_lucent.test.Phone;
import com.alcatel_lucent.test.SimpleTest;
import com.alcatel_lucent.www.wsp.ns._2008._03._26.ics.telephony.AlcCallState;
import com.espaitic.bean.CallCenterLlamadas;

import desertic.database.LlamadaAlcatel;

/**
 * Servlet implementation class SRVCallCenter
 */
public class SRVCallCenter extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(SRVCallCenter.class);
	
	private static int hits = 0;
	private static Hashtable<String, List<LlamadaAlcatel>> calls = new Hashtable<String, List<LlamadaAlcatel>>();

	/**
     * @see HttpServlet#HttpServlet()
     */
    public SRVCallCenter() {
        super();
    }
    
	public static void setCall(String user, List<LlamadaAlcatel> lCalls) {
		if(calls==null){
			List<LlamadaAlcatel> la = new ArrayList<LlamadaAlcatel>();
			calls = new Hashtable<String, List<LlamadaAlcatel>>();
		}
		calls.put(user, lCalls);
//		System.out.println(calls.toString());
	}
	
	public static List<LlamadaAlcatel> getCalls(String user) {
		List<LlamadaAlcatel> lCalls = calls.get(user);
		if(lCalls == null)lCalls = new ArrayList<LlamadaAlcatel>();
//		System.out.println(calls.toString());
		return lCalls;
	}
	
	@Override
	public void init() throws ServletException {
		super.init();
		try{
			SimpleTest.startPhoneHandler();
			PhoneHandlerThread thread = new PhoneHandlerThread();
			thread.start();
			BasicConfigurator.configure();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Override
	public void destroy() {
		try{
			SimpleTest.endPhoneHandler();
		}catch(Exception e){
			e.printStackTrace();
		}
		super.destroy();
	}


	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			String op = request.getParameter("op");
			HttpSession s = request.getSession();
			s.setAttribute("hits",new Integer(hits++));
			
			//MÉTODOS LLAMADOS DESDE WEB
			if("login".equals(op)){
//				String user = request.getParameter("user");
//				String password = request.getParameter("password");
//				//TODO: Check login
//				List<LlamadaAlcatel> lCalls = new ArrayList<LlamadaAlcatel>();
//				setCall(user, lCalls);
//				response.sendRedirect("/callCenter/jsp/callCenter.jsp?d="+System.currentTimeMillis());
			}else if("checkNewCall".equals(op)){
//				//System.out.println("SRVCallcenter. op = checkNewCall");
//				String idLineNumber = request.getParameter("idLineNumber");
//				List<LlamadaAlcatel> lCalls = getCalls(idLineNumber);
//				s.setAttribute("lCalls", lCalls);
//				response.sendRedirect("/callCenter/jsp/incomingCall.jsp?d="+System.currentTimeMillis());
			}else if("hangUp".equals(op)){
//				String idUser = request.getParameter("idUser");
//				String idLineNumber = request.getParameter("idLineNumber");
//				
//				String sessionId = Phone.login(idUser, "0000");
//				Phone.hangUp(sessionId);
//				response.sendRedirect("/callCenter/jsp/hangUp.jsp?d="+System.currentTimeMillis());
			
			}else if("forward".equals(op)){
//				String idUser = request.getParameter("idUser");
//				String idLineNumber = request.getParameter("idLineNumber");
//				String callToFwd = request.getParameter("callToFwd");
//				
//				String sessionId = Phone.login(idUser, "0000");
//				Phone.forward(sessionId,callToFwd);
//				
//				setCall(idLineNumber,"");
//				setCallRef(idLineNumber,"");
//				
//				response.sendRedirect("/callCenter/jsp/hangUp.jsp?d="+System.currentTimeMillis());
//			
			}else if("makeCall".equals(op)){
//				String idUser = request.getParameter("idUser");
//				String idLineNumber = request.getParameter("idLineNumber");
//				String callTo = request.getParameter("callTo");
//				
//				String sessionId = Phone.login(idUser, "0000");
//				Phone.makeCall(sessionId,callTo);
//				response.sendRedirect("/callCenter/jsp/hangUp.jsp?d="+System.currentTimeMillis());
//			
			}else if("endCall".equals(op)){
//				String idUser = request.getParameter("idUser");
//				String idLineNumber = request.getParameter("idLineNumber");
//				
//				String sessionId = Phone.login(idUser, "0000");
//				Phone.hangUp(sessionId);
//				String totalTime = Phone.endCall(sessionId);
//				s.setAttribute("totalTime", totalTime);
//				
//				setCall(idLineNumber,"");
//				setCallRef(idLineNumber,"");
//				response.sendRedirect("/callCenter/jsp/endCall.jsp?d="+System.currentTimeMillis());
//			
			}else if("pingAll".equals(op)){
				try{
					System.out.println("Entrando en pingAll...");
					SimpleTest.pingPhoneHandler();
				}catch(Exception e){
					System.out.println("Error al forzar el pingPhoneHandler");
					e.printStackTrace();
				}
			}
			
			
			//METODOS LLAMADOS DESDE PHONEHANDLER
			if("updateCalls".equals(op)){
				String idLineNumber = request.getParameter("idLineNumber");
				String listCalls = request.getParameter("llamadasAlcatel");
				List<LlamadaAlcatel> lCalls = new ArrayList<LlamadaAlcatel>();
				//Recuperar la lista de Llamadas
				CallCenterLlamadas ccl = new CallCenterLlamadas();
				System.out.println(listCalls);
				ccl = ccl.toObject(listCalls);
				lCalls = ccl.getLlamadas();
				List<LlamadaAlcatel> lCallsOld = getCalls(idLineNumber);
				
				//Modificación para que conserve el máximo de datos posible
				List<LlamadaAlcatel> llamadas = actualizarLlamadas(lCallsOld, lCalls);
				setCall(idLineNumber,llamadas);
				//setCall(idLineNumber,lCalls);
//				response.sendRedirect("about:blank");
			}else if("removeAllCalls".equals(op)){
				String idLineNumber = request.getParameter("idLineNumber");
				List<LlamadaAlcatel> lCalls = new ArrayList<LlamadaAlcatel>();
				setCall(idLineNumber,lCalls);
//				response.sendRedirect("about:blank");
			}else if("x".equals(op)){
				System.out.println();
				//response.sendRedirect("/callCenter/jsp/checkCall.jsp?d="+System.currentTimeMillis());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private static List<LlamadaAlcatel> actualizarLlamadas(List<LlamadaAlcatel> llamadasOld, List<LlamadaAlcatel> llamadasNew){
		//TODO: Eliminar de lCallsOld las llamadas cuyo id no está en lCalls *
		//TODO: Añadir las lCalls que no estan en lCallsOld *
		//TODO: Actualizar el estado de las lCallsOld con el estado de lCalls
		//TODO: Actualizar todo de lCallsOld con lo de lCalls si el estado es RINGING_XXXX

		Map<String, LlamadaAlcatel> mapNew = new HashMap<String, LlamadaAlcatel>();
		List<String> keysRinging = new ArrayList<String>();
		List<String> keysOther = new ArrayList<String>();
		//Añadimos en el map de llamadas nuevas el listado de llamadas. Prepara listados de keys para actualizar los datos de un modo u otro
		for(LlamadaAlcatel llamada: llamadasNew){
			String key = llamada.getIdCallRef();
			mapNew.put(key, llamada);
			String estado = llamada.getEstat();
			if(estado.equals(AlcCallState._RINGING_INCOMING) || estado.equals(AlcCallState._RINGING_OUTGOING)){
				keysRinging.add(key);
			}else{
				keysOther.add(key);
			}
		}
		
		Map<String, LlamadaAlcatel> mapOld = new HashMap<String, LlamadaAlcatel>();
		//Añadimos en el map de llamadas viejas el listado de llamadas
		for(LlamadaAlcatel llamada: llamadasOld){
			String key = llamada.getIdCallRef();
			mapOld.put(key, llamada);
		}
		//Eliminamos las que no están en el nuevo
		Set<String> keysOld = mapOld.keySet();
		List<String> elementosParaBorrar = new ArrayList<String>();
		for(String key: keysOld){
			if(!mapNew.containsKey(key)){
				elementosParaBorrar.add(key);
			}
		}
		for(String key: elementosParaBorrar){
			mapOld.remove(key);
		}
		
		//Añadimos las que no están en el viejo
		Set<String> keysNew = mapNew.keySet();
		for(String key: keysNew){
			if(!mapOld.containsKey(key)){
				mapOld.put(key, mapNew.get(key));
			}
		}
		
		//Si el estado es RINGING, actualizar atributos
		for(String key: keysRinging){
			
			
			//TODO:if(key==alquetruca)//ENTRANTE
			//			buscar idpersona i nombre de getnumeroquetruca
			//else //SALIENTE
			//			buscar idpersona i nombre de getnumeroalquetruca
			LlamadaAlcatel llamadaOld = mapOld.get(key);
			LlamadaAlcatel llamadaNew = mapNew.get(key);
			
			llamadaOld.setEstat(llamadaNew.getEstat());
			llamadaOld.setHoraFi(llamadaNew.getHoraFi());
			llamadaOld.setHoraInici(llamadaNew.getHoraInici());
			llamadaOld.setHoraIniciConversa(llamadaNew.getHoraIniciConversa());
			llamadaOld.setIdCallRef(llamadaNew.getIdCallRef());
			llamadaOld.setIdPersonaTrucada(llamadaNew.getIdPersonaTrucada());
			llamadaOld.setNomPersonaTrucada(llamadaNew.getNomPersonaTrucada());
			llamadaOld.setNumeroAlQueTruca(llamadaNew.getNumeroAlQueTruca());
			llamadaOld.setNumeroQueTruca(llamadaNew.getNumeroQueTruca());
		}
		
		//Si el estado no es RINGING se actualiza el estado
		for(String key: keysOther){
			LlamadaAlcatel llamadaOld = mapOld.get(key);
			LlamadaAlcatel llamadaNew = mapNew.get(key);
			llamadaOld.setEstat(llamadaNew.getEstat());
		}
		
		//Devolver el listado de llamadas actualizado
		List<LlamadaAlcatel> llamadas = new ArrayList<LlamadaAlcatel>();
		for(LlamadaAlcatel llamada: mapOld.values()){
			llamadas.add(llamada);
		}
		return llamadas;
	}
	
	public static String hangUp(String idLineNumber, String idCallRef){
		String sessionId = Phone.login("usu"+idLineNumber, "0000");
		idCallRef = Long.toString(Phone.hangUp(sessionId, idCallRef));
		return idCallRef;
	}
	
	public static String endCall(String idLineNumber, String idCallRef){
		String sessionId = Phone.login("usu"+idLineNumber, "0000");
		return Phone.endCall(sessionId, idCallRef);
	}
	
	public static String holdCall(String idLineNumber, String idCallRef){
		String sessionId = Phone.login("usu"+idLineNumber, "0000");
		idCallRef = Long.toString(Phone.hold(sessionId, idCallRef));
		return idCallRef;
	}

	public static String makeCall(String idLineNumber, String extDesti){
		String sessionId = Phone.login("usu"+idLineNumber, "0000");
		String idCallRef = Long.toString(Phone.makeCall(sessionId, extDesti));
		return idCallRef;
	}

	public static void transferCall(String idLineNumber, String idLlamadaActiva,
			String idLlamadaEnPausa) {
		String sessionId = Phone.login("usu"+idLineNumber, "0000");
		Phone.transferCall(sessionId, idLlamadaActiva, idLlamadaEnPausa);
	}
}
