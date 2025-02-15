package com.example.clientservice.config;

import org.springframework.context.annotation.Configuration;

import lombok.Data;


@Configuration
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "service1")
@Data
public class ConfigurationProperties {
    private Feature feature;
    private Cache cache;
    private Api api;

    @Data
    public static class Feature {
        private boolean enabled;
        private boolean debugMode;
    }

    @Data
    public static class Cache {
        private int ttl;
    }

    @Data
    public static class Api {
        private int timeout;
    }
}