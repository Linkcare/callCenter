package com.espaitic.bean;

import java.io.Serializable;
import java.util.List;

import com.espaitic.util.Constants;
import com.espaitic.util.XMLUtils;

public class CallCenterLogRespostaCallItem implements Serializable{

	private static final long serialVersionUID = 5017004977741794240L;

	private List<CallCenterLogCallItem> trucades;

	private Integer xmlType = Constants.XML_ID_DATOS;

	public CallCenterLogRespostaCallItem() {
		super();
	}

	public CallCenterLogRespostaCallItem(List<CallCenterLogCallItem> trucades,
			Integer xmlType) {
		super();
		this.trucades = trucades;
		this.xmlType = xmlType;
	}

	public List<CallCenterLogCallItem> getTrucades() {
		return trucades;
	}

	public void setTrucades(List<CallCenterLogCallItem> trucades) {
		this.trucades = trucades;
	}

	public Integer getXmlType() {
		return xmlType;
	}

	public void setXmlType(Integer xmlType) {
		this.xmlType = xmlType;
	}

	@Override
	public String toString() {
		return "CallCenterLogRespostaCallItem [trucades=" + trucades
				+ ", xmlType=" + xmlType + "]";
	}
	
	public String toXML(){
		return XMLUtils.marshalFromFile(this);
	}
	
	public static CallCenterLogRespostaCallItem toObject(String xml){
		return XMLUtils.unmarshallCallCenterLogRespostaCallItem(xml);
	}
	
}
