package com.espaitic.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.espaitic.util.Constants;
import com.espaitic.util.XMLUtils;

import desertic.database.LlamadaAlcatel;

public class CallCenterRespuesta implements Serializable{
	
	private static final long serialVersionUID = 4736030382478349166L;
	
	private Integer xmlType = Constants.XML_ID_DATOS;
	private String descripcion;

	
	public CallCenterRespuesta() {
		super();
	}

	public CallCenterRespuesta(Integer xmlType, String descripcion) {
		super();
		this.xmlType = xmlType;
		this.descripcion = descripcion;
	}

	public Integer getXmlType() {
		return xmlType;
	}

	public void setXmlType(Integer xmlType) {
		this.xmlType = xmlType;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String toXML(){
		return XMLUtils.marshalFromFile(this);
	}
	
	public static CallCenterRespuesta toObject(String xml){
		return XMLUtils.unmarshallCallCenterRespuesta(xml);
	}

	public String toString() {
		return "CallCenterRespuesta [descripcion=" + descripcion + ", xmlType="
				+ xmlType + "]";
	}

}
