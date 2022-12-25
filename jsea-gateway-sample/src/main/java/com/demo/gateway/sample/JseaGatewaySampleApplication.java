package com.demo.gateway.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class JseaGatewaySampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(JseaGatewaySampleApplication.class, args);
    }
}
