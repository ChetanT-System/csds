package com.csds.constant;

public interface ApplicationMessageConstant {

	public static final String SUCCESS = "SUCCESS";
	public static final String FAILED = "FAILED";
	
	public static final String LOGIN_FAILED ="Failed to login. Please try again later";
	public static final String LOGIN_INVALID ="Invalid Username and Password. Please try again";
	public static final String LOGIN_SUCCESS ="You have successfully login to system";
	
	public static final String REGISTRATION_FAILED ="Failed to register user. Please try again later";
	public static final String REGISTRATION_ALREADY_FAILED ="This username is not available, Please try with new username";
	
	public static final String SUCCESS_OPERATION = "The %s operation successfully completed";
	public static final String FAILED_OPERATION = "Failed to perform %s operation";
	public static final String ALREADY_PRESENT_OPERATION = "This %s is not available, Please try with new %s";
	
}
