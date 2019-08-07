package com.test.sys_ribbon.serviceImpl;

import com.test.sys_ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("ribbonService")
public class RibbonServciceImpl implements RibbonService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String getName() {
        return restTemplate.getForObject("http://shop/getName", String.class);
    }
}
