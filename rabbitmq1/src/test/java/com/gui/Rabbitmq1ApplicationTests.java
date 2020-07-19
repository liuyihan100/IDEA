package com.gui;

import com.gui.bean.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class Rabbitmq1ApplicationTests {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Autowired
    AmqpAdmin amqpAdmin;

    @Test
    void contextLoads() {
        HashMap<Object,Employee> map = new HashMap();
        map.put("emp2",new Employee(101,"刘毅晗"));
        rabbitTemplate.convertAndSend("direct exchange","china.com",map);
    }

    @Test
    void Test1(){
        Object o = rabbitTemplate.receiveAndConvert("china.com");
        System.out.println(o);
    }

    @Test
    void Test2(){
        amqpAdmin.declareExchange(new DirectExchange("amqp"));
        amqpAdmin.declareQueue(new Queue("queue"));
        amqpAdmin.declareBinding(new Binding("queue",Binding.DestinationType.QUEUE,"amqp","queue",null));
    }

}
