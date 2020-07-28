package com.gui.servlet;

import com.gui.bean.Employee;
import com.gui.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

@Controller
public class Servlet1 {
    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public ModelAndView play1(@RequestParam("name") String username, @RequestHeader("Accept-Language")String lang,@CookieValue("JSESSIONID")String id){
        System.out.println(username);
        System.out.println(lang);
        System.out.println(id);
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",username);
        mv.setViewName("hello");
        return mv;
    }
    @RequestMapping(value = "world")
    public String play2(){
        return "redirect:worldx";
    }
    @RequestMapping(value = "worldx")
    public String play3(){
        return "world";
    }
    @ResponseBody
    @RequestMapping(value = "handsome",produces = "text/html;charset=UTF-8")
    public String play4(){
        return "帅气";
    }
    @RequestMapping("json")
    @ResponseBody
    public Collection<Employee> get(){
        return employeeDao.getAll();
    }
}
