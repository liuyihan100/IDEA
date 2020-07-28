package com.gui.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Dao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int query(int id) {

        String sql = "select salary from employees where employee_id = ?";
        return jdbcTemplate.queryForObject(sql, Integer.class, id);

    }

    public void add(int id) {

        String sql = "update employees set salary = salary + 1000 where employee_id = ?";
        jdbcTemplate.update(sql, id);

    }

    public void sub(int id) {

        String sql = "update employees set salary = salary - 1000 where employee_id = ?";
        jdbcTemplate.update(sql, id);

    }
}
