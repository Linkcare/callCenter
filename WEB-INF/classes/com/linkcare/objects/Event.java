package com.linkcare.objects; 

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.namespace.QName;
 
public class Event {

	private String ServerLocation = "http://localhost:8000/ServerWSDL.php";
	private String errorMsg = null;
	
	public void Event() { 

	};
	
	
	public String elapsed_list( String session) {
		try {
			this.errorMsg = null;
			Service  service = new Service();
     		Call call = (Call) service.createCall();
			call.setTargetEndpointAddress( new java.net.URL(this.ServerLocation) );
			call.setOperationName(new QName("http://linkcare.es/", "elapsed_list"));
			String[] params = { session };
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
	
	public String role_list( String session, String event_id, String type ) {
		try {
			this.errorMsg = null;
			Service  service = new Service();
     		Call call = (Call) service.createCall();
			call.setTargetEndpointAddress( new java.net.URL(this.ServerLocation) );
			call.setOperationName(new QName("http://linkcare.es/", "event_role_list"));
			String[] params = { session, event_id, type };
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
	
	public String issuer_list( String session, String event_id ) {
		try {
			this.errorMsg = null;
			Service  service = new Service();
     		Call call = (Call) service.createCall();
			call.setTargetEndpointAddress( new java.net.URL(this.ServerLocation) );
			call.setOperationName(new QName("http://linkcare.es/", "event_issuer_list"));
			String[] params = { session, event_id };
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
	
	
	public String task_list( String session, String event_id ) {
		try {
			this.errorMsg = null;
			Service  service = new Service();
     		Call call = (Call) service.createCall();
			call.setTargetEndpointAddress( new java.net.URL(this.ServerLocation) );
			call.setOperationName(new QName("http://linkcare.es/", "event_task_list"));
			String[] params = { session, event_id };
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
	
	public String form_list( String session, String event_id ) {
		try {
			this.errorMsg = null;
			Service  service = new Service();
     		Call call = (Call) service.createCall();
			call.setTargetEndpointAddress( new java.net.URL(this.ServerLocation) );
			call.setOperationName(new QName("http://linkcare.es/", "event_form_list"));
			String[] params = { session, event_id };
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
	
	public String set( String session, String event ) {
		try {
			this.errorMsg = null;
			Service  service = new Service();
     		Call call = (Call) service.createCall();
			call.setTargetEndpointAddress( new java.net.URL(this.ServerLocation) );
			call.setOperationName(new QName("http://linkcare.es/", "event_set"));
			String[] params = { session, event };
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
	
	public String get( String session, String event_id ) {
		try {
			this.errorMsg = null;
			Service  service = new Service();
     		Call call = (Call) service.createCall();
			call.setTargetEndpointAddress( new java.net.URL(this.ServerLocation) );
			call.setOperationName(new QName("http://linkcare.es/", "event_get"));
			String[] params = { session, event_id };
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
	
	public String delete( String session, String event_id, String type ) {
		try {
			this.errorMsg = null;
			Service  service = new Service();
     		Call call = (Call) service.createCall();
			call.setTargetEndpointAddress( new java.net.URL(this.ServerLocation) );
			call.setOperationName(new QName("http://linkcare.es/", "event_delete"));
			String[] params = { session, event_id, type };
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
	
	public String type( String session ) {
		try {
			this.errorMsg = null;
			Service  service = new Service();
     		Call call = (Call) service.createCall();
			call.setTargetEndpointAddress( new java.net.URL(this.ServerLocation) );
			call.setOperationName(new QName("http://linkcare.es/", "event_type"));
			String[] params = { session };
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
	
	public String report( String session, String start_date, String end_date, String program ) {
		try {
			this.errorMsg = null;
			Service  service = new Service();
     		Call call = (Call) service.createCall();
			call.setTargetEndpointAddress( new java.net.URL(this.ServerLocation) );
			call.setOperationName(new QName("http://linkcare.es/", "event_report"));
			String[] params = { session, start_date, end_date, program };
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
	
	public String report_2( String session, String start_date, String end_date, String program ) {
		try {
			this.errorMsg = null;
			Service  service = new Service();
     		Call call = (Call) service.createCall();
			call.setTargetEndpointAddress( new java.net.URL(this.ServerLocation) );
			call.setOperationName(new QName("http://linkcare.es/", "event_report_2"));
			String[] params = { session, start_date, end_date, program };
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
	
	public String insert( String session, String date, String case_id, String event_type ) {
		try {
			this.errorMsg = null;
			Service  service = new Service();
     		Call call = (Call) service.createCall();
			call.setTargetEndpointAddress( new java.net.URL(this.ServerLocation) );
			call.setOperationName(new QName("http://linkcare.es/", "event_insert"));
			String[] params = { session, date, case_id, event_type };
			String result = (String) call.invoke( params );
			java.util.Map map = call.getOutputParams();
			String error = (String) map.get(new QName("ErrorMsg"));
			if ( error.length() >= 5 ) { 
				this.errorMsg = error;
				return "-1";
			}
			if ( result.length() < 5 ) return result;
			if (result.substring(0,5).equals("ERROR")) {
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