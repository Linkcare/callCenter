package com.espaitic.bean;

import java.io.Serializable;
import java.util.List;

import com.espaitic.util.Constants;
import com.espaitic.util.XMLUtils;

public class CallCenterLogRespostaAlcUsuaris implements Serializable{

	private static final long serialVersionUID = 5713743231836624436L;
	
	private List<CallCenterLogAlcUser> usuaris;

	private Integer xmlType = Constants.XML_ID_DATOS;

	public CallCenterLogRespostaAlcUsuaris() {
		super();
	}

	public CallCenterLogRespostaAlcUsuaris(List<CallCenterLogAlcUser> usuaris,
			Integer xmlType) {
		super();
		this.usuaris = usuaris;
		this.xmlType = xmlType;
	}

	public List<CallCenterLogAlcUser> getUsuaris() {
		return usuaris;
	}

	public void setUsuaris(List<CallCenterLogAlcUser> usuaris) {
		this.usuaris = usuaris;
	}

	public Integer getXmlType() {
		return xmlType;
	}

	public void setXmlType(Integer xmlType) {
		this.xmlType = xmlType;
	}

	public String toString() {
		return "CallCenterLogRespostaAlcUsuaris [usuaris=" + usuaris
				+ ", xmlType=" + xmlType + "]";
	}
	
	public String toXML(){
		return XMLUtils.marshalFromFile(this);
	}
	
	public static CallCenterLogRespostaAlcUsuaris toObject(String xml){
		return XMLUtils.unmarshallCallCenterLogRespostaAlcUsuaris(xml);
	}
	
	
}
