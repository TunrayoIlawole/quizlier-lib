package com.quizlier.common.vo;

public class ServiceMessages {
	public static final String DUPLICATE_USERNAME = "That username is already taken. Please try another one";
	public static final String DUPLICATE_EMAIL = "A user with this email already exists. Please sign in or try another email";
	public static final String INVALID_USERNAME = "Username cannot be empty. Please enter a value";
	public static final String INVALID_EMAIL = "Email cannot be empty. Please enter a value";
	public static final String INVALID_NAME = "First name cannot be empty. Please enter a value";
	public static final String INVALID_PASSWORD = "Password cannot be empty. Please enter a value";
	public static final String CREDENTIALS_MISMATCH = "The email and password provided do not match. Please try again";
	public static final String INVALID_USER = "That email address does not exist in our database. Please sign up";
	public static final String MAXIMUM_OPTIONS = "Maximum number of options for question exceeded";
	public static final String DUPLICATE_OPTIONS = "Option already exists for this question";
	public static final String NO_CORRECT_ANSWER = "Question does not have a correct answer set";

	public static String invalidEntity(String entity, String id) {
		return String.format("'%s' with id '%s' does not exist", entity, id);
	}

	public static String duplicateEntity(String entity) {
		return String.format("'%s' already exists", entity);
	}
	
	public static final String GENERAL_ERROR_MESSAGE = "Request processing error";
	public static final String SUCCESS_RESPONSE = "Request processed successfully";
}
