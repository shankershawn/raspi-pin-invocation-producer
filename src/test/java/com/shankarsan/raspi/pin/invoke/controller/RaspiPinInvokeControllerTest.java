package com.shankarsan.raspi.pin.invoke.controller;

import com.shankarsan.raspi.pin.invoke.dto.RaspiPinInvokeRequestDto;
import com.shankarsan.raspi.pin.invoke.dto.RaspiPinInvokeResponseDto;
import com.shankarsan.raspi.pin.invoke.service.RaspiPinInvokeService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.internal.verification.VerificationModeFactory;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class RaspiPinInvokeControllerTest {

    @Mock
    private RaspiPinInvokeService raspiPinInvokeService;

    @InjectMocks
    private RaspiPinInvokeController raspiPinInvokeController;

    private static RaspiPinInvokeRequestDto raspiPinInvokeRequestDto;

    @BeforeAll
    public static void setup() {
        raspiPinInvokeRequestDto = RaspiPinInvokeRequestDto
                .builder()
                .intervalMillis(1000)
                .pin(4)
                .pulseCount(10)
                .pulseMillis(400)
                .build();
    }

    @Test
    void shouldPassRaspiPinInvokeService() {
        Object raspiPinInvokeResponseDto;
        when(raspiPinInvokeService.publishRaspiPinInvokeRequest(any()))
                .thenReturn(RaspiPinInvokeResponseDto.builder().build());
        raspiPinInvokeResponseDto = raspiPinInvokeController
                .postRaspiPinInvokeRequest(raspiPinInvokeRequestDto);
        assertNotNull(raspiPinInvokeResponseDto);
        assertEquals("Successfully processed",
                ((RaspiPinInvokeResponseDto) raspiPinInvokeResponseDto).getMessage());
        verify(raspiPinInvokeService, VerificationModeFactory.times(1))
                .publishRaspiPinInvokeRequest(any());
    }
}
