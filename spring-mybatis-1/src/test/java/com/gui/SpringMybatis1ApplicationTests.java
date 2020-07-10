package com.gui;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootTest
class SpringMybatis1ApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws Exception {
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

}
