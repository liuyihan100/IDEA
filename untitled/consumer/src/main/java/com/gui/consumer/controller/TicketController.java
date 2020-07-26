package com.gui.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TicketController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/buy")
    public String buy(String name){
        String movie =  restTemplate.getForObject("http://provider/ticket",String.class);
        return  name + " " + movie;
    }
}
