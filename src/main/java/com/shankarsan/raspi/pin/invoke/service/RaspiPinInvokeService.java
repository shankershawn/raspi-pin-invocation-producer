package com.shankarsan.raspi.pin.invoke.service;

import com.shankarsan.raspi.pin.invoke.dto.RaspiPinInvokeRequestDto;
import com.shankarsan.raspi.pin.invoke.dto.RaspiPinInvokeResponseDto;

public interface RaspiPinInvokeService {
    RaspiPinInvokeResponseDto publishRaspiPinInvokeRequest(RaspiPinInvokeRequestDto raspiPinInvokeRequestDto);
}
