//package com.atomic.codebasespringboot.repository;
//
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class RedisRepository {
//
//    private final RedisTemplate<String, String> redisTemplate;
//
//    public RedisRepository(RedisTemplate<String, String> redisTemplate) {
//        this.redisTemplate = redisTemplate;
//    }
//
//    public Object get(String key) {
//        return redisTemplate.opsForValue().get(key);
//    }
//
//    public void set(String key, String value) {
//        redisTemplate.opsForValue().set(key, value);
//    }
//
//    public void delete(String key) {
//        redisTemplate.delete(key);
//    }
//}
