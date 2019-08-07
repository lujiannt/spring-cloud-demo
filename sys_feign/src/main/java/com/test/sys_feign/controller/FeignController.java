package com.test.sys_feign.controller;

import com.test.sys_feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private FeignService feignService;

    @RequestMapping("/getName")
    public String getName() {
        return "feign : " + feignService.getName();
    }
}
