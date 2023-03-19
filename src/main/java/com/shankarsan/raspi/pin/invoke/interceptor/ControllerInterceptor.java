package com.shankarsan.raspi.pin.invoke.interceptor;

import com.shankarsan.raspi.pin.invoke.dto.BaseResponseDto;
import com.shankarsan.raspi.pin.invoke.exception.ApplicationException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class ControllerInterceptor {

    @Around("execution(* com.shankarsan.raspi.pin.invoke.controller.*.*(..))")
    public Object intercept(ProceedingJoinPoint proceedingJoinPoint) {
        ResponseEntity<BaseResponseDto> responseEntity = null;
        try {
            BaseResponseDto baseResponseDto = (BaseResponseDto) proceedingJoinPoint.proceed();
            if (ObjectUtils.anyNull(baseResponseDto)) {
                throw new ApplicationException("baseResponseDto is null");
            }
            responseEntity = ResponseEntity.ok(baseResponseDto);
        } catch (Throwable throwable) {
            log.error("Exception occurred", throwable);
            responseEntity = ResponseEntity
                    .internalServerError()
                    .body(BaseResponseDto
                            .builder()
                            .message(throwable.getMessage())
                            .build());
        }
        return responseEntity;
    }
}
