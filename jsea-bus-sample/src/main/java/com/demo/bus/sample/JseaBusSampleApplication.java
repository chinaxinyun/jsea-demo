package com.demo.bus.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class JseaBusSampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(JseaBusSampleApplication.class, args);
    }
}
