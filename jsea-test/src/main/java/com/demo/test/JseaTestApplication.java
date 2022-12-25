package com.demo.test;

import com.alibaba.nacos.api.config.listener.Listener;
import com.chinaxinyun.jsea.config.listener.ConfigListener;
import com.chinaxinyun.jsea.config.utils.ConfigUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.concurrent.Executor;

@SpringBootApplication
@EnableDiscoveryClient
public class JseaTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(JseaTestApplication.class, args);
        ConfigUtils.addListener("dddtest", configInfo -> {
            System.out.println(configInfo);
        });
    }
}
