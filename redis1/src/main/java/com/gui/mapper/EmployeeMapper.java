package com.gui.mapper;

import com.gui.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface EmployeeMapper {

    @Select("select employee_id,last_name from employees where employee_id = #{id}")
    Employee getById(Integer id);

}