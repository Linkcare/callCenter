package com.espaitic.bean;

import java.io.Serializable;

import com.espaitic.util.XMLUtils;

public class CallCenterDatosRedireccion implements Serializable{

	private static final long serialVersionUID = 5326547527391191685L;
	
	private String extension;
	private String idLlamadaActiva;
	private String idLlamadaEnPausa;
	
	public CallCenterDatosRedireccion() {
		super();
	}

	public CallCenterDatosRedireccion(String extension, String idLlamada,
			String nuevoNumero) {
		super();
		this.extension = extension;
		this.idLlamadaActiva = idLlamada;
		this.idLlamadaEnPausa = nuevoNumero;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getIdLlamadaActiva() {
		return idLlamadaActiva;
	}

	public void setIdLlamadaActiva(String idLlamadaActiva) {
		this.idLlamadaActiva = idLlamadaActiva;
	}

	public String getIdLlamadaEnPausa() {
		return idLlamadaEnPausa;
	}

	public void setIdLlamadaEnPausa(String idLlamadaEnPausa) {
		this.idLlamadaEnPausa = idLlamadaEnPausa;
	}

	public String toXML(){
		return XMLUtils.marshalFromFile(this);
	}
	
	public static CallCenterDatosRedireccion toObject(String xml){
		return XMLUtils.unmarshallCallCenterDatosRedireccion(xml);
	}

	public String toString() {
		return "CallCenterDatosRedireccion [extension=" + extension
				+ ", idLlamadaActiva=" + idLlamadaActiva + ", idLlamadaEnPausa=" + idLlamadaEnPausa
				+ "]";
	}

}
