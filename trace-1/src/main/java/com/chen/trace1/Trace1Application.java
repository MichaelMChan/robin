package com.chen.trace1;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: robin
 * @description: ${description}
 * @author: Chen Maihai
 * @create: 2020-05-11 11:29
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class Trace1Application {
    private final Logger logger = Logger.getLogger(getClass());

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(Trace1Application.class, args);
    }


}
