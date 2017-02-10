package com.model;


public class RegisterVerifyMsgs extends LoginVerifyMsgs{
	
	private String regUserNameErr;
	
	private String regEmailErr;

	public void setRegUserNameErr(String regUserNameErr) {
		this.regUserNameErr = regUserNameErr;
	}

	public String getRegUserNameErr() {
		return regUserNameErr;
	}

	public void setRegEmailErr(String regEmailErr) {
		this.regEmailErr = regEmailErr;
	}

	public String getRegEmailErr() {
		return regEmailErr;
	}
	
	

}
