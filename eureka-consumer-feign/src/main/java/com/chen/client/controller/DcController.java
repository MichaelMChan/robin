package com.chen.client.controller;

import com.chen.client.service.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: robin
 * @description: ${description}
 * @author: Chen Maihai
 * @create: 2020-04-30 15:21
 **/
@RestController
public class DcController {

    @Autowired
    private DcClient dcClient;


    @GetMapping("/consumer")
    public String dc(){
        return dcClient.consumer();

    }



}