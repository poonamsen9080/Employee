package com.hr.manager.exception;

public class EmployeeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -4672663937992648641L;

	public EmployeeNotFoundException() {
		super();
	}

	public EmployeeNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public EmployeeNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public EmployeeNotFoundException(String message) {
		super(message);
	}

	public EmployeeNotFoundException(Throwable cause) {
		super(cause);
	}

}
