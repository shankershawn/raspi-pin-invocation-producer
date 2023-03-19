package com.shankarsan.raspi.pin.invoke.service.impl;

import com.shankarsan.raspi.pin.invoke.dto.RaspiPinInvokeRequestDto;
import com.shankarsan.raspi.pin.invoke.dto.RaspiPinInvokeResponseDto;
import com.shankarsan.raspi.pin.invoke.dto.avro.RaspiPinInvokePayload;
import com.shankarsan.raspi.pin.invoke.exception.ApplicationException;
import com.shankarsan.raspi.pin.invoke.producer.RaspiPinInvokeProducer;
import com.shankarsan.raspi.pin.invoke.service.RaspiPinInvokeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RaspiPinInvokeServiceImpl implements RaspiPinInvokeService {

    private final RaspiPinInvokeProducer raspiPinInvokeProducer;

    /**
     * @param raspiPinInvokeRequestDto
     * @return
     */
    @Override
    public RaspiPinInvokeResponseDto publishRaspiPinInvokeRequest(RaspiPinInvokeRequestDto raspiPinInvokeRequestDto) {
        if (null == raspiPinInvokeRequestDto) {
            throw new ApplicationException("raspiPinInvokeRequestDto is null");
        }
        raspiPinInvokeProducer.publishRaspiPinInvokePayload(getRaspiPinInvokePayload(raspiPinInvokeRequestDto));
        return RaspiPinInvokeResponseDto.builder().build();
    }

    private RaspiPinInvokePayload getRaspiPinInvokePayload(RaspiPinInvokeRequestDto raspiPinInvokeRequestDto) {
        RaspiPinInvokePayload raspiPinInvokePayload = new RaspiPinInvokePayload();
        BeanUtils.copyProperties(raspiPinInvokeRequestDto, raspiPinInvokePayload);
        return raspiPinInvokePayload;
    }
}
