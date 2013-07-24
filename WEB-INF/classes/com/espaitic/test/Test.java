package com.espaitic.test;

import com.espaitic.bean.CallCenterLlamadas;
import com.espaitic.util.XMLUtils;

import desertic.database.LlamadaAlcatel;

public class Test {
	
	public static void main(String[] args) {
		LlamadaAlcatel llamada = new LlamadaAlcatel("idCallRef", "150", "151", 1l, "Jose", "estat", "horaInici", "horaIniciConversa", "horaFi");
		String xml = llamada.toXML();
		System.out.println(xml);
		
		System.out.println("-----------------1");
		LlamadaAlcatel llamada2 = XMLUtils.unmarshallLlamadaAlcatel(xml);
		System.out.println(llamada2);
		
		System.out.println("-----------------2");
		
		CallCenterLlamadas llamadas = new CallCenterLlamadas();
		llamadas.addLlamada(llamada);
		llamadas.addLlamada(llamada2);
		
		xml = llamadas.toXML();
		System.out.println(xml);
		
		System.out.println("-----------------3");
		CallCenterLlamadas llamadas2 = XMLUtils.unmarshallCallCenterLlamadas(xml);
		System.out.println(llamadas2);
	}

}
