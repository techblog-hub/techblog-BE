package com.project.techlog.common.dto;

import com.project.techlog.common.constants.ResponseCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static com.project.techlog.common.constants.ResponseCode.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseMessage<T> {
    private String resultCode;
    private String message;
    private T data;

    public static <T> ResponseMessage<T> success(T data) {
        return ResponseMessage.<T>builder()
                .data(data)
                .message(SUCCESS.getMessage())
                .resultCode(SUCCESS.getCode())
                .build();
    }

    public static <T> ResponseMessage<T> success(ResponseCode code, T data, String message) {
        return ResponseMessage.<T>builder()
                .data(data)
                .message(message)
                .resultCode(code.getCode())
                .build();
    }

    public static <T> ResponseMessage<T> failure(ResponseCode code, T data) {
        return ResponseMessage.<T>builder()
                .data(null)
                .message(code.getMessage())
                .resultCode(code.getCode())
                .build();
    }

    public static <T> ResponseMessage<T> failure(T data, String code, String message) {
        return ResponseMessage.<T>builder()
                .data(data)
                .message(message)
                .resultCode(code)
                .build();
    }
}
