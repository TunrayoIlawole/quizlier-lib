package com.quizlier.common.dto;

import java.util.Date;

public class OptionResponse {
	private Long id;
	private String option_text;
	private boolean isCorrect;
	private Long questionId;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOptionText() {
		return option_text;
	}

	public void setOptionText(String optionText) {
		this.option_text = optionText;
	}

	public boolean getIsCorrect() {
		return isCorrect;
	}

	public void setIsCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
}
