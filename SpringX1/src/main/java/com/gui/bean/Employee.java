package com.gui.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee{
    private Integer employee_id;
    private String last_name;
    private Employee who;
    public void init(){
        System.out.println("init");
    }
    public void destroy(){
        System.out.println("destroy");
    }
}
