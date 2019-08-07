package com.test.sys_zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy //开启zuul，且包括了eurekaClient注解
@SpringBootApplication
public class SysZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SysZuulApplication.class, args);
    }

}
