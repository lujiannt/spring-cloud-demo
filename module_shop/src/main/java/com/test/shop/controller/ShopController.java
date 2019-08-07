package com.test.shop.controller;

import com.test.shop.service.ShopService;
import com.test.shop.utils.I18NMessageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class ShopController {
    @Autowired
    private ShopService shopService;

    @Value("${configword}")
    String configword;

    /**
     * 跳转到首页
     *
     * @return
     */
    @RequestMapping("/index")
    public ModelAndView showShopPage() {
        ModelAndView view = new ModelAndView();
        //代码国际化
        String value = I18NMessageUtils.get("index.name");
        view.addObject("indexName", value);
        view.setViewName("/index");
        return view;
    }

    /**
     * 跳转到shop
     *
     * @return
     */
    @RequestMapping("/openToShop")
    public String openToShop() {
        return "/shop/shop";
    }

    /**
     * 获取shopname
     *
     * @return
     */
    @RequestMapping("/getName")
    @ResponseBody
    public String getShopName() {
        return shopService.getName();
    }

    /**
     * 国际化
     *
     * @return
     */
    @RequestMapping("/locale")
    public String locale(String lang) {
        System.out.println("locale is " + lang);
        return "/index";
    }

    /**
     * 获取公共配置
     *
     * @return
     */
    @RequestMapping("/getConfig")
    @ResponseBody
    public String getConfig() {
        return configword;
    }
}
