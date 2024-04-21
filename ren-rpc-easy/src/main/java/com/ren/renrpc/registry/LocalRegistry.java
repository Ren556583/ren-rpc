package com.ren.renrpc.registry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 本地注册中心
 */
public class LocalRegistry {

    /**
     * 注册信息存储 key为服务名称 value为服务的实现类
     */
    private static final Map<String, Class<?>> map = new ConcurrentHashMap<>();

    /**
     * 注册服务
     *
     * @param serverName
     * @param implClass
     */
    public static void register(String serverName, Class<?> implClass) {
        map.put(serverName, implClass);
    }

    /**
     * 获取服务
     *
     * @param serverName
     * @return
     */
    public static Class<?> get(String serverName) {
        return map.get(serverName);
    }

    /**
     * 删除服务
     * @param serverName
     */
    public static void remove(String serverName) {
        map.remove(serverName);
    }

}
