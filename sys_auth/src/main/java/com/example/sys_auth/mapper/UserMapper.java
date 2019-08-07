package com.example.sys_auth.mapper;

import com.example.sys_auth.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User selectUserByName(String name);
}
