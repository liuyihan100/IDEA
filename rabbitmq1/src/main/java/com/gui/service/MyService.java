package com.gui.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    @RabbitListener(queues = "china.com")
    public void receive1(Object map){
        System.out.println(map);
    }
}
