package com.espaitic.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.espaitic.util.Constants;
import com.espaitic.util.XMLUtils;

import desertic.database.LlamadaAlcatel;

public class CallCenterLlamadas implements Serializable{
	
	private static final long serialVersionUID = 4736030382478349166L;
	
	private Integer xmlType = Constants.XML_ID_DATOS;

	private List<LlamadaAlcatel> llamadas;

	
	public CallCenterLlamadas() {
		super();
	}

	public CallCenterLlamadas(Integer xmlType, List<LlamadaAlcatel> llamadas) {
		super();
		this.xmlType = xmlType;
		this.llamadas = llamadas;
	}

	public Integer getXmlType() {
		return xmlType;
	}

	public void setXmlType(Integer xmlType) {
		this.xmlType = xmlType;
	}

	public List<LlamadaAlcatel> getLlamadas() {
		if(llamadas==null){
			llamadas = new ArrayList<LlamadaAlcatel>();
		}
		return llamadas;
	}

	public void setLlamadas(List<LlamadaAlcatel> llamadas) {
		this.llamadas = llamadas;
	}
	
	public void addLlamada(LlamadaAlcatel llamada){
		if(llamadas==null){
			llamadas = new ArrayList<LlamadaAlcatel>();
		}
		llamadas.add(llamada);
	}
	
	public String toXML(){
		return XMLUtils.marshalFromFile(this);
	}
	
	public static CallCenterLlamadas toObject(String xml){
		return XMLUtils.unmarshallCallCenterLlamadas(xml);
	}

	public String toString() {
		return "CallCenterLlamadas [llamadas=" + llamadas + ", xmlType="
				+ xmlType + "]";
	}
	
}
