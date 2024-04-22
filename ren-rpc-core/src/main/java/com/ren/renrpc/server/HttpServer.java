package com.ren.renrpc.server;

public interface HttpServer {

    /**
     * 启动服务器
     * @param port
     */
    void doStart(int port);
}
