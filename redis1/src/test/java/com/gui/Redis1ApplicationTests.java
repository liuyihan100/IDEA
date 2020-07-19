package com.gui;

import com.gui.bean.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class Redis1ApplicationTests {

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplate empRedisTemplate;

    @Test
    void contextLoads() {
        Employee employee = new Employee(101, "liuyihan");
        redisTemplate.opsForValue().set("emp1",employee);
        empRedisTemplate.opsForValue().set("emp2",employee);
        Object emp2 = empRedisTemplate.opsForValue().get("emp2");
        System.out.println(emp2);
    }

}
