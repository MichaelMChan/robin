package com.chen.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @program: robin
 * @description: ${description}
 * @author: Chen Maihai
 * @create: 2020-04-30 15:19
 **/
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class FeignClientApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(FeignClientApplication.class).web(true).run(args);


    }
}
