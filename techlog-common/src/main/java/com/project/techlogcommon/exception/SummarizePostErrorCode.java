package com.project.techlogcommon.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

public enum SummarizePostErrorCode implements TechlogErrorCode {

	// 요약 포스팅 관련 에러 코드 정의

	;

	private final String code;
	private final String message;
	private final HttpStatus httpStatus;

	SummarizePostErrorCode(String code, String message, HttpStatus httpStatus) {
		this.code = code;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	@Override
	public String getCode() {
		return code;
	}

	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
}
