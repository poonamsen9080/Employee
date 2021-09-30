package com.hr.manager.exception.handler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.hr.manager.bean.StandardMessage;
import com.hr.manager.exception.EmployeeNotFoundException;
import com.hr.manager.exception.UserNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = { IllegalArgumentException.class, IllegalStateException.class })
	protected ResponseEntity<Object> handleConflict(RuntimeException ex, WebRequest request) {
		return handleExceptionInternal(ex, new StandardMessage(ex.getMessage()), new HttpHeaders(), HttpStatus.CONFLICT, request);
	}

	@ExceptionHandler(value = { EmployeeNotFoundException.class })
	protected ResponseEntity<Object> handleEmployeeNotFound(RuntimeException ex, WebRequest request) {
		return handleExceptionInternal(ex,new StandardMessage(ex.getMessage()), new HttpHeaders(), HttpStatus.NOT_FOUND, request);
	}
	
	@ExceptionHandler(value = { UserNotFoundException.class })
	protected ResponseEntity<Object> handleHRNotFound(RuntimeException ex, WebRequest request) {
		return handleExceptionInternal(ex,new StandardMessage(ex.getMessage()), new HttpHeaders(), HttpStatus.NOT_FOUND, request);
	}
}
