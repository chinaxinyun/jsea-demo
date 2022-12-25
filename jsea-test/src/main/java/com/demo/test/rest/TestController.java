package com.demo.test.rest;

import com.chinaxinyun.jsea.config.utils.ConfigUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);
    @Value("${test}")
    private String test;

    @PostMapping("/test")
    public void hello() {
        System.out.println("==================");
    }

    @GetMapping("/gtest")
    public String gtest() {
        LOGGER.info(test);
        LOGGER.info(ConfigUtils.get("dddtest"));
        return test;
    }
}
