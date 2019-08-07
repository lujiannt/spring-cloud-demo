package com.test.sys_feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients //开启feign
@EnableDiscoveryClient
public class SysFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SysFeignApplication.class, args);
    }

}
