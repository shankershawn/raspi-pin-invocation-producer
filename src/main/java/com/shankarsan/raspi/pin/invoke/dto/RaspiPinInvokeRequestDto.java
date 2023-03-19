package com.shankarsan.raspi.pin.invoke.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder
public class RaspiPinInvokeRequestDto {

    @NotNull
    private Integer intervalMillis;

    @NotNull
    private Integer pin;

    @NotNull
    private Integer pulseCount;

    @NotNull
    private Integer pulseMillis;
}
