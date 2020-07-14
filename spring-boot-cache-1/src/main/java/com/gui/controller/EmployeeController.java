package com.gui.controller;

import com.gui.bean.Employee;
import com.gui.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/{id}")
    public Employee getBtId(@PathVariable("id")Integer id){
        return employeeService.getById(id);
    }

}
