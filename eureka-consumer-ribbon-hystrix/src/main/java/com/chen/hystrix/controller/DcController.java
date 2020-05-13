package com.chen.hystrix.controller;

import com.chen.hystrix.service.HystrixFallback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: robin
 * @description: ${description}
 * @author: Chen Maihai
 * @create: 2020-05-06 18:32
 **/
@RestController
public class DcController {
    @Autowired
    private HystrixFallback hystrixFallback;

    @GetMapping("/consumer")
    public String dc() {
        return hystrixFallback.consumer();
    }


}
