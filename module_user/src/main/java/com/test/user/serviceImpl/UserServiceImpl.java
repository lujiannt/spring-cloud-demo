package com.test.user.serviceImpl;

import com.test.user.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public String getName() {
        return "user";
    }
}
