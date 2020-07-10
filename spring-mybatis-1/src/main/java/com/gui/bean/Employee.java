package com.gui.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Integer employeeId;
    private String lastName;
    private Integer salary;
    private Department department;
}
