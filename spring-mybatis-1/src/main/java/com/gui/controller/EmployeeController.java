package com.gui.controller;

import com.gui.bean.Employee;
import com.gui.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeMapper employeeMapper;

    @RequestMapping("hello")
    public List getAll(){
        List<Employee> all = employeeMapper.getAll();
        return all;
    }
}
