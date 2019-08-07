package com.test.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SysUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SysUserApplication.class, args);
    }

}
