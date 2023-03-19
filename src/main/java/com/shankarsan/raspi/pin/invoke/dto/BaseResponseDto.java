package com.shankarsan.raspi.pin.invoke.dto;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class BaseResponseDto {

    @Builder.Default
    private String message = "Successfully processed";
}
