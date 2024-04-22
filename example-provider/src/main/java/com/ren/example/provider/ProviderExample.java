package com.ren.example.provider;

import com.ren.example.common.service.UserService;
import com.ren.renrpc.RpcApplication;
import com.ren.renrpc.registry.LocalRegistry;
import com.ren.renrpc.server.HttpServer;
import com.ren.renrpc.server.VertxHttpServer;

public class ProviderExample {
    public static void main(String[] args) {
        RpcApplication.init();
        // 注册服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);
        //启动web服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(RpcApplication.getRpcConfig().getServerPort());
    }
}
