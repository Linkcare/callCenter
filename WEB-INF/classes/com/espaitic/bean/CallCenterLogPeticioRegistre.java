package com.espaitic.bean;

import java.io.Serializable;

import com.espaitic.util.XMLUtils;

public class CallCenterLogPeticioRegistre implements Serializable{

	private static final long serialVersionUID = 5165528279632898553L;
	
	private String companyPhone;//terminal
    private String inici;
    private String fi;
	public CallCenterLogPeticioRegistre() {
		super();
	}
	public CallCenterLogPeticioRegistre(String companyPhone, String inici,
			String fi) {
		super();
		this.companyPhone = companyPhone;
		this.inici = inici;
		this.fi = fi;
	}
	public String getCompanyPhone() {
		return companyPhone;
	}
	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
	}
	public String getInici() {
		return inici;
	}
	public void setInici(String inici) {
		this.inici = inici;
	}
	public String getFi() {
		return fi;
	}
	public void setFi(String fi) {
		this.fi = fi;
	}
	
	public String toString() {
		return "CallCenterLogPeticioRegistre [companyPhone=" + companyPhone
				+ ", fi=" + fi + ", inici=" + inici + "]";
	}
    
	public String toXML(){
		return XMLUtils.marshalFromFile(this);
	}
	
	public static CallCenterLogPeticioRegistre toObject(String xml){
		return XMLUtils.unmarshallCallCenterLogPeticioRegistre(xml);
	}
    
}
