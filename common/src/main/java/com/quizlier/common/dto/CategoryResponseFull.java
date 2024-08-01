package com.quizlier.common.dto;

import java.util.Date;
import java.util.List;


public class CategoryResponseFull {
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<QuestionResponse> getQuestions() {
		return questions;
	}
	public void setQuestions(List<QuestionResponse> questions) {
		this.questions = questions;
	}
	
	private Long id;
	private String name;
	private String description;
	private List<QuestionResponse> questions;
}
