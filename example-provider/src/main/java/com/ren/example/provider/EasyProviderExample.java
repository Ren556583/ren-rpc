package com.ren.example.provider;

import com.ren.example.common.service.UserService;
import com.ren.renrpc.registry.LocalRegistry;
import com.ren.renrpc.server.HttpServer;
import com.ren.renrpc.server.VertxHttpServer;

public class EasyProviderExample {
    public static void main(String[] args) {
        // 注册服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);
        //启动web服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
