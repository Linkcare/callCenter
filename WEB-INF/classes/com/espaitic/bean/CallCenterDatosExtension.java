package com.espaitic.bean;

import java.io.Serializable;

import com.espaitic.util.XMLUtils;

public class CallCenterDatosExtension implements Serializable{
	
	private static final long serialVersionUID = 7365646565782253040L;
	
	private String extension;

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
	
	public String toXML(){
		return XMLUtils.marshalFromFile(this);
	}
	
	public static CallCenterDatosExtension toObject(String xml){
		return XMLUtils.unmarshallCallCenterDatosExtension(xml);
	}

	public String toString() {
		return "CallCenterDatosExtension [extension=" + extension + "]";
	}

}
