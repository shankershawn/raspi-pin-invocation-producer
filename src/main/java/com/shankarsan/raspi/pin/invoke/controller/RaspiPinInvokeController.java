package com.shankarsan.raspi.pin.invoke.controller;

import com.shankarsan.raspi.pin.invoke.dto.RaspiPinInvokeRequestDto;
import com.shankarsan.raspi.pin.invoke.service.RaspiPinInvokeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/raspi")
@RequiredArgsConstructor
public class RaspiPinInvokeController {

    private final RaspiPinInvokeService raspiPinInvokeService;

    @PostMapping(value = "/pin-invocations",
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Object postRaspiPinInvokeRequest(
            @RequestBody @Valid RaspiPinInvokeRequestDto raspiPinInvokeRequestDto) {
        return raspiPinInvokeService.publishRaspiPinInvokeRequest(raspiPinInvokeRequestDto);
    }
}
