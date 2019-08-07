package com.example.sys_auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableResourceServer
@MapperScan("com.example.sys_auth.mapper")
public class SysAuthApplication {


    public static void main(String[] args) {
        SpringApplication.run(SysAuthApplication.class, args);
    }

}
