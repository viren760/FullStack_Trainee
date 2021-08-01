package com.spring.bank.exception;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(CustomException.class)
	  public void handleCustomException(HttpServletResponse res, CustomException ex) throws IOException {
	    res.sendError(ex.getHttpStatus().value(), ex.getMessage());
	  }
	
	
}
