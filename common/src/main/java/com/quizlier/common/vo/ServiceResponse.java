package com.quizlier.common.vo;

public class ServiceResponse {
	private String status;
	private String message;
	
	public ServiceResponse(String statusCode, String statusMessage) {
		this.status = statusCode;
		this.message = statusMessage;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
