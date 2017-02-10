package com.model;

public class LoginModel {
	
	private String loginuserId;
	
	public String getLoginuserId() {
		return loginuserId;
	}

	public void setLoginuserId(String loginuserId) {
		this.loginuserId = loginuserId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getLoginType() {
		return loginType;
	}

	public void setLoginType(int loginType) {
		this.loginType = loginType;
	}
	private String password;
	
	private int loginType;
	
}
