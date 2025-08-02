package com.project.techlog.common.constants;

import lombok.Getter;

@Getter
public enum ResponseCode {

    // 성공
    SUCCESS("200", "요청이 성공적으로 처리되었습니다"),
    // 일반 실패
    FAIL("400", "요청 처리에 실패하였습니다"),
    // 리소스
    NOT_FOUND("404", "요청한 리소스를 찾을 수 없습니다"),
    // 성공
    INTERNAL_ERROR("500", "서버 내부 오류입니다");

    private final String code;
    private final String message;

    ResponseCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
