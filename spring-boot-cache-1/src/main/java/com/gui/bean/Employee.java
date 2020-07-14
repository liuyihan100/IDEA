package com.gui.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer EmployeeId;
    private String lastName;
    private Integer salary;
    private Integer departmentId;
}
