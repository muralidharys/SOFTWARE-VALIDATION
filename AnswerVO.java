package com.model;

public class AnswerVO {

	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPatName() {
		return patName;
	}

	public void setPatName(String patName) {
		this.patName = patName;
	}

	public int getTotalRating() {
		return totalRating;
	}

	public void setTotalRating(int totalRating) {
		this.totalRating = totalRating;
	}

	public QuestionVO getQuestionVO() {
		return questionVO;
	}

	public void setQuestionVO(QuestionVO questionVO) {
		this.questionVO = questionVO;
	}

	private String patName;
	
	private int totalRating;
	
	private QuestionVO questionVO;
	
	
	
}
