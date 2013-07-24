package com.espaitic.services;

import java.util.List;

import org.apache.log4j.Logger;

import com.espaitic.bean.CallCenterDatosExtension;
import com.espaitic.bean.CallCenterDatosLlamada;
import com.espaitic.bean.CallCenterDatosNuevaLlamada;
import com.espaitic.bean.CallCenterDatosRedireccion;
import com.espaitic.bean.CallCenterLlamadas;
import com.espaitic.bean.CallCenterRespuesta;
import com.espaitic.test.SRVCallCenter;
import com.espaitic.util.Constants;

import desertic.database.LlamadaAlcatel;

/**
 * WebService al que se conecta LinkCare para establecer la comunicaci�n con la centralita telef�nica
 * 
 * @author Jose M. Morles�n
 */
public class CallCenter {
	
	private static Logger log = Logger.getLogger(CallCenter.class);

	/**
	 * Devuelve el listado de llamadas de un usuario
	 * @param xml XML serializado de un objeto de tipo CallCenterDatosExtension
	 * @return Devuelve un XML serializado que contiene un List<LlamadaAlcatel>: (CallCenterLlamadas)
	 */
	public String getLlamadasFromUser(String xml){
//		log.info("Entrada en getLlamadasFromUser: " + xml);
		CallCenterDatosExtension ccde = CallCenterDatosExtension.toObject(xml);
		List<LlamadaAlcatel> la = SRVCallCenter.getCalls(ccde.getExtension());
		CallCenterLlamadas ccl = new CallCenterLlamadas(Constants.XML_ID_DATOS, la);
		return ccl.toXML();
	}
	
	/**
	 * Descuelga la llamada indicada
	 * @param xml Datos de la llamada (CallCenterDatosLlamada)
	 * @return
	 */
	public String descolgar(String xml){
		log.info("Entrada en descolgar: " + xml);
		CallCenterDatosLlamada ccdl = CallCenterDatosLlamada.toObject(xml);
		SRVCallCenter.hangUp(ccdl.getExtension(), ccdl.getIdLlamada());
		CallCenterRespuesta ccr = new CallCenterRespuesta();
		return ccr.toXML();
	}
	
	/**
	 * Cuelga la llamada indicada
	 * @param xml Datos de la llamada (CallCenterDatosLlamada)
	 * @return
	 */
	public String colgar(String xml){
		log.info("Entrada en colgar: " + xml);
		CallCenterDatosLlamada ccdl = CallCenterDatosLlamada.toObject(xml);
		SRVCallCenter.endCall(ccdl.getExtension(), ccdl.getIdLlamada());
		CallCenterRespuesta ccr = new CallCenterRespuesta();
		return ccr.toXML();
	}
	
	
	public String redirigir(String xml){
		log.info("Entrada en redirigir: " + xml);
		CallCenterDatosRedireccion ccdr = CallCenterDatosRedireccion.toObject(xml);
		SRVCallCenter.transferCall(ccdr.getExtension(), ccdr.getIdLlamadaActiva(), ccdr.getIdLlamadaEnPausa());
		CallCenterRespuesta ccr = new CallCenterRespuesta();
		return ccr.toXML();
	}
	
	/**
	 * Llama al telefono indicado
	 * @param xml Datos de la llamada (CallCenterDatosLlamada)
	 * @return
	 */
	public String llamar(String xml){
		log.info("Entrada en llamar: " + xml);
		CallCenterDatosNuevaLlamada ccdnl = CallCenterDatosNuevaLlamada.toObject(xml);
		SRVCallCenter.makeCall(ccdnl.getExtension(), ccdnl.getNuevoNumero());
		CallCenterRespuesta ccr = new CallCenterRespuesta();
		return ccr.toXML();
	}
	
	/**
	 * Pausa la llamada indicada
	 * @param xml Datos de la llamada (CallCenterDatosLlamada)
	 * @return
	 */
	public String pausar(String xml){
		log.info("Entrada en pausar: " + xml);
		CallCenterDatosLlamada ccdl = CallCenterDatosLlamada.toObject(xml);
		SRVCallCenter.holdCall(ccdl.getExtension(), ccdl.getIdLlamada());
		CallCenterRespuesta ccr = new CallCenterRespuesta();
		return ccr.toXML();
	}
	
	/**
	 * Reestablecer la llamada indicada
	 * @param xml Datos de la llamada (CallCenterDatosLlamada)
	 * @return
	 */
	public String reestablecer(String xml){
		log.info("Entrada en reestablecer: " + xml);
		CallCenterDatosLlamada ccdl = CallCenterDatosLlamada.toObject(xml);
		SRVCallCenter.hangUp(ccdl.getExtension(), ccdl.getIdLlamada());
		CallCenterRespuesta ccr = new CallCenterRespuesta();
		return ccr.toXML();
	}
	
}
