package com.spring.bank.dto;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class Response<T> {

	private final T message;
	private final int status;
}
