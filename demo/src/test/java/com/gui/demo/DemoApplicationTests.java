package com.gui.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    ApplicationContext ioc;

    @Test
    void contextLoads() {
        Object hello = ioc.getBean("hello");
        System.out.println(hello);
    }
}
