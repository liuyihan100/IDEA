package com.gui.mapper;

import com.gui.bean.Employee;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface EmployeeMapper {

    @Select("Select * from employees where employee_id = #{id}")
    Employee getById(Integer id);

    @Update("Update employees set employeeId = #{employeeId},last_name=#{lastName},salary=#{salary},department_id=#{departmentId}")
    void update(Employee employee);

    @Delete("Delete from employees where employee_id = #{id}")
    void delete(Integer id);

    @Insert("Insert into employees(employee_id,last_name,salary,department_id) values(employeeId,lastName,salary,departmentId)")
    void insert(Employee employee);

}
