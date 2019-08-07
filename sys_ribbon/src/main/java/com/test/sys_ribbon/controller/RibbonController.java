package com.test.sys_ribbon.controller;

import com.test.sys_ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RibbonController {
    @Autowired
    private RibbonService ribbonService;

    /**
     * 测试ribbon负载均衡
     *
     * @return
     */
    @RequestMapping("/getName")
    public String getName() {
        return "ribbon : " + ribbonService.getName();
    }
}
