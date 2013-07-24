package com.alcatel_lucent.test;


public class SessionException extends Exception {
	
	private static final long serialVersionUID = -8882249275482392830L;

	public SessionException(String pMessage) {
		super(pMessage);
	}
	
	public SessionException(Exception pException) {
		super(pException);
	}
}
