package com.example.limited_product_shop.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.CONFLICT;
import static org.springframework.http.HttpStatus.FORBIDDEN;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.UNAUTHORIZED;

@Getter
@AllArgsConstructor
public enum CommonErrorCode implements ErrorCode {

    // 400 - 잘못된 요청 (Bad Request)
    INCORRECT_PASSWORD(BAD_REQUEST, "입력된 비밀번호가 잘못되었습니다."),

    // 401 - 인증되지 않음 (Unauthorized)
    UNAUTHORIZED_ACCESS(UNAUTHORIZED, "인증되지 않은 접근입니다."),
    LOGIN_REQUIRED(UNAUTHORIZED, "서비스를 이용하시려면 로그인이 필요합니다."),

    // 403 - 금지됨 (Forbidden)
    ACCESS_FORBIDDEN(FORBIDDEN, "해당 리소스에 대한 접근 권한이 없습니다."),
    FEATURE_UNAVAILABLE(FORBIDDEN, "현재 기능을 일시적으로 사용할 수 없습니다."),

    // 404 - 리소스를 찾을 수 없음 (Not Found)
    USER_NOT_FOUND(NOT_FOUND, "사용자를 찾을 수 없습니다."),
    PRODUCT_NOT_FOUND(NOT_FOUND, "해당 제품을 찾을 수 없습니다."),

    // 409 - 리소스 충돌 (Conflict)
    DUPLICATE_LOGIN_ID(CONFLICT, "중복된 로그인 아이디(이메일)가 존재합니다."),

    // 500 - 서버 오류 (Internal Server Error)
    INVALID_AUTHENTICATION_STATE(INTERNAL_SERVER_ERROR, "인증 상태가 올바르지 않습니다. 관리자에게 문의하세요."),
    SERVER_ERROR(INTERNAL_SERVER_ERROR, "서버가 응답을 하지 않습니다.");

    private final HttpStatus httpStatus;
    private final String message;
}

