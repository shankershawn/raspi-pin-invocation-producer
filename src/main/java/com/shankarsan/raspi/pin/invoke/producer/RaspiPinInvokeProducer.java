package com.shankarsan.raspi.pin.invoke.producer;

import com.shankarsan.raspi.pin.invoke.configuration.ApplicationConfiguration;
import com.shankarsan.raspi.pin.invoke.dto.avro.RaspiPinInvokePayload;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class RaspiPinInvokeProducer {

    private final ApplicationConfiguration applicationConfiguration;

    private final KafkaTemplate<String, RaspiPinInvokePayload> kafkaTemplate;

    public void publishRaspiPinInvokePayload(RaspiPinInvokePayload raspiPinInvokePayload) {
        kafkaTemplate.send(applicationConfiguration.getTopic(), raspiPinInvokePayload).addCallback(sendResult ->
                        log.debug("Messaged posted to partition {}, offset {}",
                                sendResult.getRecordMetadata().partition(),
                                sendResult.getRecordMetadata().offset())
                , throwable ->
                        log.error("Publish failed.", throwable)
        );
    }

}
