package com.gui.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"})
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    private Integer employeeId;
    @Column(name="last_name")
    private String lastName;
    @Column
    private Integer salary;
}
