package com.espaitic.util;

import java.util.List;

import com.alcatel_lucent.test.SimpleTest;
import com.alcatel_lucent.test.soapstub.fwmanagement.AlcFwManagementPortType;
import com.alcatel_lucent.test.soapstub.fwmanagement.AlcFwManagementService;
import com.alcatel_lucent.test.soapstub.types.fwmanagement.AlcBasicFrameworkUser;

public class AlcatelUtils {
	
	// Configuration
	public static final String API_HOST = "uc1.linkcare.es";
	public static final String PBX_NAME = "Call Server";

	
	public static List<AlcBasicFrameworkUser> getAllUsers() throws Exception{
		return SimpleTest.getAllUsers();
	}
	
	public static AlcFwManagementPortType getService() throws Exception{
		AlcFwManagementPortType service=null;
		AlcFwManagementService afms = new AlcFwManagementService();
		service = afms.getAlcFwManagementPort();
		return service;
	}

}
