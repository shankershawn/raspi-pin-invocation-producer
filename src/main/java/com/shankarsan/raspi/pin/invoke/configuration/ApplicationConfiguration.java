package com.shankarsan.raspi.pin.invoke.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "appconfig")
@Data
public class ApplicationConfiguration {

    private String topic;
}
