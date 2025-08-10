package com.project.techlogcommon.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class TechlogException extends RuntimeException {

	private final TechlogErrorCode errorCode;
	private final String code;
	private final String message;
	private final HttpStatus httpStatus;

	public TechlogException(TechlogErrorCode errorCode, String code, String message, HttpStatus httpStatus) {
		this.errorCode = errorCode;
		this.code = errorCode.getCode();
		this.message = errorCode.getMessage();
		this.httpStatus = errorCode.getHttpStatus();
	}
}
