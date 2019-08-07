package com.test.sys_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer //开启config server
@SpringBootApplication
@EnableDiscoveryClient
public class SysConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SysConfigServerApplication.class, args);
    }

}
