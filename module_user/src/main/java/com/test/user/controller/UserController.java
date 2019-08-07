package com.test.user.controller;

import com.test.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 跳转到user
     *
     * @return
     */
    @RequestMapping("/index")
    @ResponseBody
    public String openToUser() {
        return "user index";
    }

    /**
     * 获取name
     *
     * @return
     */
    @RequestMapping("/getName")
    @ResponseBody
    public String getUserName() {
        return userService.getName();
    }
}
