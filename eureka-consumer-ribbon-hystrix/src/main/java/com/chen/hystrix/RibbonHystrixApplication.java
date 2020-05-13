package com.chen.hystrix;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @program: robin
 * @description: ${description}
 * @author: Chen Maihai
 * @create: 2020-05-06 18:29
 **/
@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
//@SpringCloudApplication
public class RibbonHystrixApplication {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(RibbonHystrixApplication.class).web(true).run(args);
    }

}
