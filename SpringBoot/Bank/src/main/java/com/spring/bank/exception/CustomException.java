package com.spring.bank.exception;

import org.springframework.http.HttpStatus;

public class CustomException extends RuntimeException{

	private String message;
	private HttpStatus httpStatus;
	public CustomException(String message, HttpStatus httpStatus) {
		super();
		this.message = message;
		this.httpStatus = httpStatus;
	}
	public String getMessage() {
		return message;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	
	
}
