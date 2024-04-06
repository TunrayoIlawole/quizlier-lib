package com.quizlier.common.dto;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.quizlier.common.vo.ServiceMessages;
import com.quizlier.common.vo.ServiceResponse;
import com.quizlier.common.vo.ServiceStatusCodes;

public class UserLoginRequest {
	private String email;
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	// Move this to auth?
	private ResponseEntity validate() {
		if (StringUtils.isEmpty(getEmail()) || StringUtils.isBlank(getEmail())) {
			ServiceResponse response = new ServiceResponse(ServiceStatusCodes.ERROR, ServiceMessages.INVALID_EMAIL);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
		}
		if (StringUtils.isEmpty(getPassword()) || StringUtils.isBlank(getPassword())) {
			ServiceResponse response = new ServiceResponse(ServiceStatusCodes.ERROR, ServiceMessages.INVALID_NAME);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
		}
		
		return null;
		
		
	}
}
