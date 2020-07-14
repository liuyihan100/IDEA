package com.gui.service;

import com.gui.bean.Employee;
import com.gui.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Cacheable(cacheNames = "emps",key = "#root.methodName + #id",condition = "#a0>110",unless = "#a0==120")
    public Employee getById(Integer id){
        return employeeMapper.getById(id);
    }

}
