package com.test.sys_feign.service;

import com.test.sys_feign.serviceImpl.FeignFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service("feignService")
@FeignClient(value = "shop", fallback = FeignFallBack.class)
public interface FeignService {
    @RequestMapping(value = "/getName")
    String getName();
}
