package com.test.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.test.shop.mapper")
public class SysShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SysShopApplication.class, args);
    }

}
