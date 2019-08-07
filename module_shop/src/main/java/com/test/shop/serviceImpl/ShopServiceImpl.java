package com.test.shop.serviceImpl;

import com.test.shop.mapper.ShopMapper;
import com.test.shop.service.ShopService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("shopService")
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopMapper shopMapper;

    @Override
    public String getName() {
        String shopName = shopMapper.selectName();
        if (StringUtils.isBlank(shopName)) {
            shopName = "null啊";
        }
        return shopName;
    }
}
