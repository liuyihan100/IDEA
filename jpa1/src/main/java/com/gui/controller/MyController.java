package com.gui.controller;

import com.gui.bean.Employee;
import com.gui.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    HelloService helloService;

    @RequestMapping("13")
    public String hello(){
        return helloService.sayHello("刘毅晗");
    }
}
