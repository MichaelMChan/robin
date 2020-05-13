package com.chen.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: robin
 * @description: ${description}
 * @author: Chen Maihai
 * @create: 2020-04-30 18:50
 **/
@RefreshScope
@RestController
public class ConfigController {
    @Value("${info.from}")
    private String test;

    @GetMapping("/dc")
    public String dc() {
        System.out.println("config test value:" + test);
        return test;
    }
}
