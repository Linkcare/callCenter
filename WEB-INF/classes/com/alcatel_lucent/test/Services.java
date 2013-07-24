package com.alcatel_lucent.test;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import com.alcatel_lucent.test.soapstub.apiframework.AlcApiFrameworkPortType;
import com.alcatel_lucent.test.soapstub.apiframework.AlcApiFrameworkService;
import com.alcatel_lucent.test.soapstub.fwmanagement.AlcFwManagementPortType;
import com.alcatel_lucent.test.soapstub.fwmanagement.AlcFwManagementService;
import com.alcatel_lucent.test.soapstub.notifier.AlcNotifierPortType;
import com.alcatel_lucent.test.soapstub.notifier.AlcNotifierService;
import com.alcatel_lucent.test.soapstub.pbxmanagement.AlcPbxManagementPortType;
import com.alcatel_lucent.test.soapstub.pbxmanagement.AlcPbxManagementService;
import com.alcatel_lucent.test.soapstub.phone.AlcPhonePortType;
import com.alcatel_lucent.test.soapstub.phone.AlcPhoneService;


public class Services {

	private final String m_host;

	private AlcApiFrameworkPortType m_apiFramework;
	private AlcFwManagementPortType m_fwManagement;
	private AlcPhonePortType m_phone;
	private AlcPbxManagementPortType m_pbxmanagement;
	private AlcNotifierPortType m_notifier;
	
	public Services(String pHost) {
		m_host = pHost;
		m_apiFramework = null;
		m_fwManagement = null;
		m_phone = null;
		m_pbxmanagement = null;
		m_notifier = null;
	}
	
	public AlcApiFrameworkPortType getApiFramework() throws MalformedURLException {
		if (m_apiFramework == null) {
			URL url = new URL("http://" + m_host + "/api/services/AlcApiFramework?wsdl");
			QName qname = new QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/frameworkService", "AlcApiFrameworkService");
			m_apiFramework = (new AlcApiFrameworkService(url, qname)).getAlcApiFrameworkPort();
		}
		return m_apiFramework;
	}
	
	
	
	public AlcPhonePortType getPhone() throws MalformedURLException {
		if (m_phone == null) {
			URL url = new URL("http://" + m_host + "/api/services/AlcPhone?wsdl");
			QName qname = new QName("http://www.alcatel-lucent.com/wsp/ns/2008/03/26/ics/phoneService", "AlcPhoneService");
			m_phone = (new AlcPhoneService(url, qname)).getAlcPhonePort();
		}
		return m_phone;
	}
	
	
	
	public AlcNotifierPortType getNotifier() throws MalformedURLException {
		if (m_notifier == null) {
			URL url = new URL("http://" + m_host + "/api/services/AlcNotifier?wsdl");
			QName qname = new QName("http://www.alcatel-lucent.com/wsp/ns/2008/05/26/ics/notifierService", "AlcNotifierService");
			m_notifier = (new AlcNotifierService(url, qname)).getAlcNotifierPort();
		}
		return m_notifier;
	}
}
