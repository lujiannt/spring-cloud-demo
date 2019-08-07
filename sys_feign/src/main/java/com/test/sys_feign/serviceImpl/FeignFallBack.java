package com.test.sys_feign.serviceImpl;

import com.test.sys_feign.service.FeignService;
import org.springframework.stereotype.Component;

/**
 * 熔断器demo
 */
@Component
public class FeignFallBack implements FeignService {
    @Override
    public String getName() {
        return "service Error! enter hystrix!";
    }
}
