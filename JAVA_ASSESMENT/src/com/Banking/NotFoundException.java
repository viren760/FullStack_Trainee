package com.Banking;

public class NotFoundException extends RuntimeException {

	private final String message;
	private final int status;
	public NotFoundException(String message, int status) {
		super();
		this.message = message;
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public int getStatus() {
		return status;
	}
	@Override
	public String toString() {
		return "NotFoundException [message=" + message + ", status=" + status + "]";
	}
	
	
	
	
}