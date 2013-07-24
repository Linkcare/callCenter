package com.espaitic.bean;

import java.io.Serializable;

import com.espaitic.util.XMLUtils;

public class CallCenterDatosLlamada implements Serializable{
	
	private static final long serialVersionUID = 250415048800581826L;
	
	private String extension;
	private String idLlamada;

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getIdLlamada() {
		return idLlamada;
	}

	public void setIdLlamada(String idLlamada) {
		this.idLlamada = idLlamada;
	}
	
	public String toXML(){
		return XMLUtils.marshalFromFile(this);
	}
	
	public static CallCenterDatosLlamada toObject(String xml){
		return XMLUtils.unmarshallCallCenterDatosLlamada(xml);
	}

	public String toString() {
		return "CallCenterDatosLlamada [extension=" + extension
				+ ", idLlamada=" + idLlamada + "]";
	}
	

}
