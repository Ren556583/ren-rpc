package com.ren.renrpc.serializer;

import com.ren.renrpc.spi.SpiLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * 序列化器工厂（工厂模式，用于获取序列化器对象）
 */
public class SerializerFactory {
    /**
     * 序列化映射（用于实现单例）
     */
    //private static final Map<String, Serializer> KEY_SERIALIZER_MAP = new HashMap<String, Serializer>(){
    //    {
    //        put(SerializerKeys.JDK, new JdkSerializer());
    //        put(SerializerKeys.KRYO, new KryoSerializer());
    //        put(SerializerKeys.JSON, new JsonSerializer());
    //        put(SerializerKeys.HESSIAN, new HessianSerializer());
    //    }
    //};
    static {
        SpiLoader.load(Serializer.class);
    }

    /**
     * 默认序列化器
     */
    // private static final Serializer DEFAULT_SERIALIZER = KEY_SERIALIZER_MAP.get(SerializerKeys.JDK);
    private static final Serializer DEFAULT_SERIALIZER = new JdkSerializer();

    /**
     * 获取实例
     * @param key
     * @return
     */
    public static Serializer getInstance(String key){
        return SpiLoader.getInstance(Serializer.class, key);
    }
}
