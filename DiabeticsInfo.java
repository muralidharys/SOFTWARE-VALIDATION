package com.model;

import java.util.List;

public class DiabeticsInfo {
	
	private boolean isHigh;
	
	private List<SuggestionVO> sugVOList;

	public void setHigh(boolean isHigh) {
		this.isHigh = isHigh;
	}

	public boolean isHigh() {
		return isHigh;
	}

	public void setSugVOList(List<SuggestionVO> sugVOList) {
		this.sugVOList = sugVOList;
	}

	public List<SuggestionVO> getSugVOList() {
		return sugVOList;
	}
	
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setTotalRating(int totalRating) {
		this.totalRating = totalRating;
	}

	public int getTotalRating() {
		return totalRating;
	}

	private String errMsg;

	private boolean status;
	
	private String type;
	
	private int totalRating;
	
}
