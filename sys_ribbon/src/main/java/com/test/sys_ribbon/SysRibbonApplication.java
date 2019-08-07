package com.test.sys_ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient //和eureka的区别：此注解可用于其他服务中心
public class SysRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SysRibbonApplication.class, args);
    }


    @Bean
    @LoadBalanced
        //注册bean，并且启用ribbon负载均衡
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
