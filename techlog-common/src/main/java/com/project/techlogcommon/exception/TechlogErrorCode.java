package com.project.techlogcommon.exception;

import org.springframework.http.HttpStatus;

public interface TechlogErrorCode {

	String name();

	String getCode();

	String getMessage();

	HttpStatus getHttpStatus();
}
