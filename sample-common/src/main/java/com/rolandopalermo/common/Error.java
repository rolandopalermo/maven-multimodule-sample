package com.rolandopalermo.common;

import org.springframework.http.HttpStatus;

public class Error {

	private String errorMessage;
	private HttpStatus statusCode;

	public Error() {
	}
	
	public Error(String errorMessage, HttpStatus statusCode) {
		this.errorMessage = errorMessage;
		this.statusCode = statusCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public HttpStatus getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(HttpStatus statusCode) {
		this.statusCode = statusCode;
	}
	
}