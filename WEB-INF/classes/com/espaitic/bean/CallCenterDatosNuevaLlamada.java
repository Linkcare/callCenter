package com.espaitic.bean;

import java.io.Serializable;

import com.espaitic.util.XMLUtils;

public class CallCenterDatosNuevaLlamada implements Serializable {

	private static final long serialVersionUID = -4263437279982262117L;

	private String extension;
	private String nuevoNumero;

	public CallCenterDatosNuevaLlamada() {
		super();
	}

	public CallCenterDatosNuevaLlamada(String extension, String idLlamada,
			String nuevoNumero) {
		super();
		this.extension = extension;
		this.nuevoNumero = nuevoNumero;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getNuevoNumero() {
		return nuevoNumero;
	}

	public void setNuevoNumero(String nuevoNumero) {
		this.nuevoNumero = nuevoNumero;
	}

	public String toXML() {
		return XMLUtils.marshalFromFile(this);
	}

	public static CallCenterDatosNuevaLlamada toObject(String xml) {
		return XMLUtils.unmarshallCallCenterDatosNuevaLlamada(xml);
	}

	public String toString() {
		return "CallCenterDatosNuevaLlamada [extension=" + extension
				+ ", nuevoNumero=" + nuevoNumero
				+ "]";
	}

}
