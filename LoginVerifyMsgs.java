package com.model;

public class LoginVerifyMsgs {
	
	private String userNameErrMsg;
	
	public String getUserNameErrMsg() {
		return userNameErrMsg;
	}

	public void setUserNameErrMsg(String userNameErrMsg) {
		this.userNameErrMsg = userNameErrMsg;
	}

	public String getPasswordErrMsg() {
		return passwordErrMsg;
	}

	public void setPasswordErrMsg(String passwordErrMsg) {
		this.passwordErrMsg = passwordErrMsg;
	}

	public void setSeverMessage(String severMessage) {
		this.severMessage = severMessage;
	}

	public String getSeverMessage() {
		return severMessage;
	}

	public void setFirstNameErrMsg(String firstNameErrMsg) {
		this.firstNameErrMsg = firstNameErrMsg;
	}

	public String getFirstNameErrMsg() {
		return firstNameErrMsg;
	}

	public void setLastNameErrMsg(String lastNameErrMsg) {
		this.lastNameErrMsg = lastNameErrMsg;
	}

	public String getLastNameErrMsg() {
		return lastNameErrMsg;
	}

	public void setEmailErrMsg(String emailErrMsg) {
		this.emailErrMsg = emailErrMsg;
	}

	public String getEmailErrMsg() {
		return emailErrMsg;
	}

	private String passwordErrMsg;
	
	private String severMessage;
	
	private String firstNameErrMsg;
	
	
	private String lastNameErrMsg;
	
	private String emailErrMsg;

}
