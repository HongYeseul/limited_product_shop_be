package com.example.limited_product_shop.common.exception.handler;

import com.example.limited_product_shop.common.exception.CustomException;
import com.example.limited_product_shop.common.exception.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class CommonExceptionHandler {
    /**
     * API 유효성 검사 실패 예외
     */
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ErrorResponse> handleCustomException(CustomException e) {
        ErrorResponse errorCode = ErrorResponse.from(e.getErrorCode().getHttpStatus(), e.getMessage());
        return ResponseEntity.status(e.getErrorCode().getHttpStatus()).body(errorCode);
    }
}
