package com.gui;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@SpringBootTest
class Database1ApplicationTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void contextLoads() throws Exception {
        Connection connection = dataSource.getConnection();
        System.out.println(dataSource);
        System.out.println(connection);
        String sql = "select * from employees";
        List<Map<String,Object>> list = jdbcTemplate.queryForList(sql);
        list.forEach(System.out::println);
    }

}
