package com.shankarsan.raspi.pin.invoke;

import com.shankarsan.raspi.pin.invoke.controller.RaspiPinInvokeController;
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class RaspiPinInvokeControllerTest {

    @Mock
    private RaspiPinInvokeService raspiPinInvokeService;

    @InjectMocks
    private RaspiPinInvokeController raspiPinInvokeController;

    private static RaspiPinInvokeRequestDto raspiPinInvokeRequestDto;

    private Object raspiPinInvokeResponseDto;

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
