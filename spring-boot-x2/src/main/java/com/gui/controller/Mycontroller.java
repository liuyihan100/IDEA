package com.gui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class Mycontroller {
    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello,world";
    }

    @RequestMapping("rel")
    public ModelAndView rel(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","<a href='https://www.bing.com'>hello</a>");
        List<String> list = Arrays.asList("123", "456", "789");
        mv.setViewName("rel");
        mv.addObject("list",list);
        return mv;
    }
}
