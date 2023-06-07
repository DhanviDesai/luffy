package com.midori.luffy.config;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Data
@NoArgsConstructor
@Configuration
@ConfigurationProperties("luffyConfig")
public class LuffyConfig {
    private String name;
    private String endpoint;
    private String servicePool;
    private Map<String, String> uriMap;
}
