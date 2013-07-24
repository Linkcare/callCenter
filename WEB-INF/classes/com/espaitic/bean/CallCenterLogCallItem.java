package com.espaitic.bean;

public class CallCenterLogCallItem {

	
	private boolean acknowledged;
	
	private boolean answeredCall;
	
	private String cause;
	
	private String corrFirstName;
	
	private String corrName;
	
	private String corrNumber;
	
	private String corrCanonicalNumber;
	
	private long dateOfBegin;
	
	private long dateOfConvers;
	
	private long dateOfEnd;
	
	private String dirNumber;
	
	private boolean externalCall;
	
	private boolean incomingCall;
	
	private String initialNumber;
	
    private long diffId;

    private long timeId;
	
	private String newDestNumber;
	
	private boolean redirectedCall;

	public CallCenterLogCallItem() {
		super();
	}
	
	public CallCenterLogCallItem(boolean acknowledged, boolean answeredCall,
			String cause, String corrFirstName, String corrName,
			String corrNumber, String corrCanonicalNumber, long dateOfBegin,
			long dateOfConvers, long dateOfEnd, String dirNumber,
			boolean externalCall, boolean incomingCall, String initialNumber,
			long diffId, long timeId, String newDestNumber,
			boolean redirectedCall) {
		super();
		this.acknowledged = acknowledged;
		this.answeredCall = answeredCall;
		this.cause = cause;
		this.corrFirstName = corrFirstName;
		this.corrName = corrName;
		this.corrNumber = corrNumber;
		this.corrCanonicalNumber = corrCanonicalNumber;
		this.dateOfBegin = dateOfBegin;
		this.dateOfConvers = dateOfConvers;
		this.dateOfEnd = dateOfEnd;
		this.dirNumber = dirNumber;
		this.externalCall = externalCall;
		this.incomingCall = incomingCall;
		this.initialNumber = initialNumber;
		this.diffId = diffId;
		this.timeId = timeId;
		this.newDestNumber = newDestNumber;
		this.redirectedCall = redirectedCall;
	}



	public boolean isAcknowledged() {
		return acknowledged;
	}

	public void setAcknowledged(boolean acknowledged) {
		this.acknowledged = acknowledged;
	}

	public boolean isAnsweredCall() {
		return answeredCall;
	}

	public void setAnsweredCall(boolean answeredCall) {
		this.answeredCall = answeredCall;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public String getCorrFirstName() {
		return corrFirstName;
	}

	public void setCorrFirstName(String corrFirstName) {
		this.corrFirstName = corrFirstName;
	}

	public String getCorrName() {
		return corrName;
	}

	public void setCorrName(String corrName) {
		this.corrName = corrName;
	}

	public String getCorrNumber() {
		return corrNumber;
	}

	public void setCorrNumber(String corrNumber) {
		this.corrNumber = corrNumber;
	}

	public String getCorrCanonicalNumber() {
		return corrCanonicalNumber;
	}

	public void setCorrCanonicalNumber(String corrCanonicalNumber) {
		this.corrCanonicalNumber = corrCanonicalNumber;
	}

	public long getDateOfBegin() {
		return dateOfBegin;
	}

	public void setDateOfBegin(long dateOfBegin) {
		this.dateOfBegin = dateOfBegin;
	}

	public long getDateOfConvers() {
		return dateOfConvers;
	}

	public void setDateOfConvers(long dateOfConvers) {
		this.dateOfConvers = dateOfConvers;
	}

	public long getDateOfEnd() {
		return dateOfEnd;
	}

	public void setDateOfEnd(long dateOfEnd) {
		this.dateOfEnd = dateOfEnd;
	}

	public String getDirNumber() {
		return dirNumber;
	}

	public void setDirNumber(String dirNumber) {
		this.dirNumber = dirNumber;
	}

	public boolean isExternalCall() {
		return externalCall;
	}

	public void setExternalCall(boolean externalCall) {
		this.externalCall = externalCall;
	}

	public boolean isIncomingCall() {
		return incomingCall;
	}

	public void setIncomingCall(boolean incomingCall) {
		this.incomingCall = incomingCall;
	}

	public String getInitialNumber() {
		return initialNumber;
	}

	public void setInitialNumber(String initialNumber) {
		this.initialNumber = initialNumber;
	}

	public long getDiffId() {
		return diffId;
	}

	public void setDiffId(long diffId) {
		this.diffId = diffId;
	}

	public long getTimeId() {
		return timeId;
	}

	public void setTimeId(long timeId) {
		this.timeId = timeId;
	}

	public String getNewDestNumber() {
		return newDestNumber;
	}

	public void setNewDestNumber(String newDestNumber) {
		this.newDestNumber = newDestNumber;
	}

	public boolean isRedirectedCall() {
		return redirectedCall;
	}

	public void setRedirectedCall(boolean redirectedCall) {
		this.redirectedCall = redirectedCall;
	}

	@Override
	public String toString() {
		return "CallCenterLogCallItem [acknowledged=" + acknowledged
				+ ", answeredCall=" + answeredCall + ", cause=" + cause
				+ ", corrCanonicalNumber=" + corrCanonicalNumber
				+ ", corrFirstName=" + corrFirstName + ", corrName=" + corrName
				+ ", corrNumber=" + corrNumber + ", dateOfBegin=" + dateOfBegin
				+ ", dateOfConvers=" + dateOfConvers + ", dateOfEnd="
				+ dateOfEnd + ", diffId=" + diffId + ", dirNumber=" + dirNumber
				+ ", externalCall=" + externalCall + ", incomingCall="
				+ incomingCall + ", initialNumber=" + initialNumber
				+ ", newDestNumber=" + newDestNumber + ", redirectedCall="
				+ redirectedCall + ", timeId=" + timeId + "]";
	}

}
