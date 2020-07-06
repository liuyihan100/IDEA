package com.gui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Mycontroller {
    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello,world";
    }
}
