package com.gui.consumer;

import com.gui.consumer.service.ConsumerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConsumerApplicationTests {

    @Autowired
    ConsumerService consumerService;

    @Test
    void contextLoads() {

        consumerService.get();

    }

}
