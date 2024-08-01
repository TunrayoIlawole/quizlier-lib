package com.quizlier.common.dto;

import java.util.Date;
import java.util.List;

public class QuestionResponseFull {
	private Long id;
	private String question;
	private List<OptionResponse> options;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<OptionResponse> getOptions() {
		return options;
	}

	public void setOptions(List<OptionResponse> options) {
		this.options = options;
	}

}
