package com.ren.example.provider;

import com.ren.example.common.model.User;
import com.ren.example.common.service.UserService;
import com.ren.renrpc.config.RpcConfig;
import com.ren.renrpc.proxy.ServiceProxyFactory;
import com.ren.renrpc.utils.ConfigUtils;

public class ConsumerExample {
    public static void main(String[] args) {
        RpcConfig rpc = ConfigUtils.loadConfig(RpcConfig.class,"rpc");
        System.out.println(rpc);

        //获取代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("ren");
        //调用
        User newUser = userService.getUser(user);
        if (newUser!=null){
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }
        short number = userService.getNumber();
        System.out.println(number);
    }
}
