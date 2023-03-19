package com.shankarsan.raspi.pin.invoke.producer;

import com.shankarsan.raspi.pin.invoke.configuration.ApplicationConfiguration;
import com.shankarsan.raspi.pin.invoke.dto.avro.RaspiPinInvokePayload;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class RaspiPinInvokeProducerTest {

    @Mock
    private ApplicationConfiguration applicationConfiguration;

    @Mock
    private KafkaTemplate<String, RaspiPinInvokePayload> kafkaTemplate;

    @Mock
    private ListenableFuture<SendResult<String, RaspiPinInvokePayload>> sendResultListenableFuture;

    @InjectMocks
    private RaspiPinInvokeProducer raspiPinInvokeProducer;

    @Test
    void shouldPublishRaspiPinInvokePayload() {
        when(applicationConfiguration.getTopic()).thenReturn("TEMP_TOPIC");
        when(kafkaTemplate.send(anyString(), any())).thenReturn(sendResultListenableFuture);
        raspiPinInvokeProducer.publishRaspiPinInvokePayload(RaspiPinInvokePayload.newBuilder().build());
        verify(applicationConfiguration, times(1)).getTopic();
        verify(kafkaTemplate, times(1)).send(anyString(), any());
    }


}
