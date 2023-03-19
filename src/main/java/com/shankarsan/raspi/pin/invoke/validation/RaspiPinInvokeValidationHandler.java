package com.shankarsan.raspi.pin.invoke.validation;

import com.shankarsan.raspi.pin.invoke.dto.BaseResponseDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class RaspiPinInvokeValidationHandler extends ResponseEntityExceptionHandler {

    @Override
    public ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        return handleInternal(ex, headers, status, request);
    }

    @Override
    public ResponseEntity<Object> handleHttpMessageNotReadable(
            HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        return handleInternal(ex, headers, status, request);
    }

    private ResponseEntity<Object> handleInternal(
            Exception ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        BaseResponseDto baseResponseDto = BaseResponseDto
                .builder()
                .message(ex.getMessage())
                .build();
        return handleExceptionInternal(ex, baseResponseDto, headers, status, request);
    }
}
