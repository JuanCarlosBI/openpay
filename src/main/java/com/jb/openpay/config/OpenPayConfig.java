package com.jb.openpay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@Configuration
public class OpenPayConfig {
    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
