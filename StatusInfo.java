package com.model;

import org.springframework.ui.Model;

public class StatusInfo {
	
	private boolean status;
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	private String errMsg;

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}

	
	public void setModel(Object model) {
		this.model = model;
	}

	public Object getModel() {
		return model;
	}

	private int type;
	
	private Object model;
	
	
	
	

}
