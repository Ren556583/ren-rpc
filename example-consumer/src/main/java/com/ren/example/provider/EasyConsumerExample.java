package com.ren.example.provider;

import com.ren.example.common.model.User;
import com.ren.example.common.service.UserService;
import com.ren.renrpc.proxy.ServiceProxyFactory;

public class EasyConsumerExample {
    public static void main(String[] args) {
        //静态代理
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("ren");
        // 调用
        User newUser = userServiceProxy.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }
    }
}
