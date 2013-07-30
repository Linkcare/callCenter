package com.linkcare.objects; 

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.namespace.QName;
 
public class Session {

	private String ServerLocation = "http://localhost:8000/ServerWSDL.php";
	private String errorMsg = null;
	public String token = null;
	public String user = null;
	public String language = null;
	public String role = null;
	public String center = null;
	public String name = null;
	public String WS = null;
	
	
	public String discover( String USER, String PASSWORD, String IP, String HOST ) {
		try {
			this.errorMsg = null;
			Service  service = new Service();
     		Call call = (Call) service.createCall();
			call.setTargetEndpointAddress( new java.net.URL(this.ServerLocation) );
			call.setOperationName(new QName("http://linkcare.es/", "session_discover"));
			String[] params = { USER, PASSWORD, IP, HOST };
			String result = (String) call.invoke( params );
			java.util.Map map = call.getOutputParams();
			String user = (String) map.get(new QName("user"));
			String language = (String) map.get(new QName("language"));
			String role = (String) map.get(new QName("role"));
			String center = (String) map.get(new QName("center"));
			String name = (String) map.get(new QName("name"));
			String WS = (String) map.get(new QName("WS"));
			String error = (String) map.get(new QName("ErrorMsg"));
			if ( error.length() >= 5 ) { 
				this.errorMsg = error;
				return "-1";
			}
			if ( result.length() < 5 ) return result;
			if ( result.substring(0,5).equals("ERROR")) {
				this.errorMsg = result;
				return "-1";
			} else {
				this.token = result;
				this.role = role;
				this.center = center;
				this.language = language;
				this.user = user;
				this.name = name;
				this.WS = WS;
				return result;
			}
		} catch (Exception e) {
			this.errorMsg = e.toString();
			return "-1";
		}

	}
	
	public String init( String USER, String PASSWORD, String IP, String HOST ) {
		try {
			this.errorMsg = null;
			Service  service = new Service();
     		Call call = (Call) service.createCall();
			call.setTargetEndpointAddress( new java.net.URL(this.ServerLocation) );
			call.setOperationName(new QName("http://linkcare.es/", "session_init"));
			String[] params = { USER, PASSWORD, IP, HOST };
			String result = (String) call.invoke( params );
			java.util.Map map = call.getOutputParams();
			String user = (String) map.get(new QName("user"));
			String language = (String) map.get(new QName("language"));
			String role = (String) map.get(new QName("role"));
			String center = (String) map.get(new QName("center"));
			String name = (String) map.get(new QName("name"));
			String error = (String) map.get(new QName("ErrorMsg"));
			if ( error.length() >= 5 ) { 
				this.errorMsg = error;
				return "-1";
			}
			if ( result.length() < 5 ) return result;
			if ( result.substring(0,5).equals("ERROR")) {
				this.errorMsg = result;
				return "-1";
			} else {
				this.token = result;
				this.role = role;
				this.center = center;
				this.language = language;
				this.user = user;
				this.name = name;
				return result;
			}
		} catch (Exception e) {
			this.errorMsg = e.toString();
			return "-1";
		}

	}
	
	public String center( String token, String center ) {
		try {
			this.errorMsg = null;
			Service  service = new Service();
     		Call call = (Call) service.createCall();
			call.setTargetEndpointAddress( new java.net.URL(this.ServerLocation) );
			call.setOperationName(new QName("http://linkcare.es/", "session_center"));
			String[] params = { token, center };
			String result = (String) call.invoke( params );
			if ( result.length() < 5 ) return result;
			if ( result.substring(0,5).equals("ERROR")) {
				this.errorMsg = result;
				return "-1";
			} else {
				this.center = center;
				return result;
			}
		} catch (Exception e) {
			this.errorMsg = e.toString();
			return "-1";
		}

	}
	
	public String role( String token, String role ) {
		try {
			this.errorMsg = null;
			Service  service = new Service();
     		Call call = (Call) service.createCall();
			call.setTargetEndpointAddress( new java.net.URL(this.ServerLocation) );
			call.setOperationName(new QName("http://linkcare.es/", "session_role"));
			String[] params = { token, role };
			String result = (String) call.invoke( params );
			if ( result.length() < 5 ) return result;
			if ( result.substring(0,5).equals("ERROR")) {
				this.errorMsg = result;
				return "-1";
			} else {
				this.role = role;
				return result;
			}
		} catch (Exception e) {
			this.errorMsg = e.toString();
			return "-1";
		}

	}
	
	public String language( String token, String language ) {
		try {
			this.errorMsg = null;
			Service  service = new Service();
     		Call call = (Call) service.createCall();
			call.setTargetEndpointAddress( new java.net.URL(this.ServerLocation) );
			call.setOperationName(new QName("http://linkcare.es/", "session_language"));
			String[] params = { token, language };
			String result = (String) call.invoke( params );
			if ( result.length() < 5 ) return result;
			if ( result.substring(0,5).equals("ERROR")) {
				this.errorMsg = result;
				return "-1";
			} else {
				this.language = language;
				return result;
			}
		} catch (Exception e) {
			this.errorMsg = e.toString();
			return "-1";
		}

	}
	
	public String get_user( String token ) {
		try {
			this.errorMsg = null;
			Service  service = new Service();
     		Call call = (Call) service.createCall();
			call.setTargetEndpointAddress( new java.net.URL(this.ServerLocation) );
			call.setOperationName(new QName("http://linkcare.es/", "session_get_user"));
			String[] params = { token};
			String result = (String) call.invoke( params );
			java.util.Map map = call.getOutputParams();
			String error = (String) map.get(new QName("ErrorMsg"));
			if ( error.length() >= 5 ) { 
				this.errorMsg = error;
				return "-1";
			}
			if ( result.length() < 5 ) return result;
			if ( result.substring(0,5).equals("ERROR")) {
				this.errorMsg = result;
				return "-1";
			} else {
				this.user = user;
				return result;
			}
		} catch (Exception e) {
			this.errorMsg = e.toString();
			return "-1";
		}

	}
	
	public String[] get_role_list( String token ) {
		try {
			this.errorMsg = null;
			Service  service = new Service();
     			Call call = (Call) service.createCall();
			call.setTargetEndpointAddress( new java.net.URL(this.ServerLocation) );
			call.setOperationName(new QName("http://linkcare.es/", "session_get_role_list"));
			String[] params = { token };
			String result = (String) call.invoke( params );
			java.util.Map map = call.getOutputParams();
			String error = (String) map.get(new QName("ErrorMsg"));
			if ( error.length() >= 5 ) { 
				this.errorMsg = error;
				return null;
			}
			if ( result.length() < 5 ) {
				String r = (String) result;
				String actividades[];
				actividades = r.split("#");
				return actividades;
			}
			if (result.substring(0,5).equals("ERROR")) {
				this.errorMsg = result;
				return null;
			} else {
				String r = (String) result;
				String actividades[];
				actividades = r.split("#");
				return actividades;
			}
		} catch (Exception e) {
			this.errorMsg = e.toString();
			return null;
		}
	}
	
	public String[] get_language_list( String token ) {
		try {
			this.errorMsg = null;
			Service  service = new Service();
     			Call call = (Call) service.createCall();
			call.setTargetEndpointAddress( new java.net.URL(this.ServerLocation) );
			call.setOperationName(new QName("http://linkcare.es/", "session_get_language_list"));
			String[] params = { token };
			String result = (String) call.invoke( params );
			java.util.Map map = call.getOutputParams();
			String error = (String) map.get(new QName("ErrorMsg"));
			if ( error.length() >= 5 ) { 
				this.errorMsg = error;
				return null;
			}
			if ( result.length() < 5 ) {
				String r = (String) result;
				String actividades[];
				actividades = r.split("#");
				return actividades;
			}
			if (result.substring(0,5).equals("ERROR")) {
				this.errorMsg = result;
				return null;
			} else {
				String r = (String) result;
				String actividades[];
				actividades = r.split("#");
				return actividades;
			}
		} catch (Exception e) {
			this.errorMsg = e.toString();
			return null;
		}
	}
	
	public String[] get_center_list( String token ) {
		try {
			this.errorMsg = null;
			Service  service = new Service();
     			Call call = (Call) service.createCall();
			call.setTargetEndpointAddress( new java.net.URL(this.ServerLocation) );
			call.setOperationName(new QName("http://linkcare.es/", "session_get_center_list"));
			String[] params = { token };
			String result = (String) call.invoke( params );
			java.util.Map map = call.getOutputParams();
			String error = (String) map.get(new QName("ErrorMsg"));
			if ( error.length() >= 5 ) { 
				this.errorMsg = error;
				return null;
			}
			if ( result.length() < 5 ) {
				String r = (String) result;
				String actividades[];
				actividades = r.split("#");
				return actividades;
			}
			if (result.substring(0,5).equals("ERROR")) {
				this.errorMsg = result;
				return null;
			} else {
				String r = (String) result;
				String actividades[];
				actividades = r.split("#");
				return actividades;
			}
		} catch (Exception e) {
			this.errorMsg = e.toString();
			return null;
		}
	}
	
	public String get_active_role( String token ) {
		try {
			this.errorMsg = null;
			Service  service = new Service();
			Call call = (Call) service.createCall();
			call.setTargetEndpointAddress( new java.net.URL(this.ServerLocation) );
			call.setOperationName(new QName("http://linkcare.es/", "session_get_active_role"));
			String[] params = { token };
			String result = (String) call.invoke( params );
			if ( result.length() < 5 ) return result;
			if ( result.substring(0,5).equals("ERROR")) {
				this.errorMsg = result;
				return "-1";
			} else {
				return result;
			}
		} catch (Exception e) {
			this.errorMsg = e.toString();
			return "-1";
		}
	}
		
		public String getErrorMsg() { 
			return this.errorMsg;
		}

		public void setLocation ( String ServerLocation ) {
			this.ServerLocation = ServerLocation;
		}


}