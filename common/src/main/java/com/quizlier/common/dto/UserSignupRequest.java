package com.quizlier.common.dto;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.quizlier.common.vo.ServiceMessages;
import com.quizlier.common.vo.ServiceResponse;
import com.quizlier.common.vo.ServiceStatusCodes;

public class UserSignupRequest {
    private String firstName;
    
    private String lastName;
    
    private String username;
    
    private String email;
    
    private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

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
	
	private ResponseEntity validate() {
		if (StringUtils.isEmpty(getEmail()) || StringUtils.isBlank(getEmail())) {
			ServiceResponse response = new ServiceResponse(ServiceStatusCodes.ERROR, ServiceMessages.INVALID_EMAIL);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
		}
		if (StringUtils.isEmpty(getUsername()) || StringUtils.isBlank(getUsername())) {
			ServiceResponse response = new ServiceResponse(ServiceStatusCodes.ERROR, ServiceMessages.INVALID_USERNAME);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
		}
		if (StringUtils.isEmpty(getFirstName()) || StringUtils.isBlank(getFirstName())) {
			ServiceResponse response = new ServiceResponse(ServiceStatusCodes.ERROR, ServiceMessages.INVALID_NAME);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
		}
		
		return null;
		
		
	}
}
