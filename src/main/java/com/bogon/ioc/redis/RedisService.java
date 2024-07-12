package com.bogon.ioc.redis;

public interface RedisService {

    void set(String key, String value);

    String get(String key);

}
