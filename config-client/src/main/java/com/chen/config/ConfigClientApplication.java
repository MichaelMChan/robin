package com.chen.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: robin
 * @description: ${description}
 * @author: Chen Maihai
 * @create: 2020-04-30 17:32
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigClientApplication.class).web(true).run(args);
    }

}
