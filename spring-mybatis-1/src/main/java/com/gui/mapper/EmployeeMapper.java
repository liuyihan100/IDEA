package com.gui.mapper;

import com.gui.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployeeMapper {
    List<Employee> getAll();
}
