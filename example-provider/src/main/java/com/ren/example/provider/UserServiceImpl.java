package com.ren.example.provider;

import com.ren.example.common.model.User;
import com.ren.example.common.service.UserService;

public class UserServiceImpl implements UserService {

    public User getUser(User user) {
        System.out.println("用户名：" + user.getName());
        return user;
    }
}
