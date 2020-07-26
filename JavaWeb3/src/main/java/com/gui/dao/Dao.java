package com.gui.dao;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.gui.bean.Employee;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

public class Dao {
    public Employee getById(String id){
        Employee employee = null;
        try {
            File file = new File("G:\\IDEA\\JavaWeb3\\src\\main\\resources\\druid.properties");
            FileInputStream fis = new FileInputStream(file);
            Properties pros = new Properties();
            pros.load(fis);
            DataSource dataSource = DruidDataSourceFactory.createDataSource(pros);
            Connection conn = dataSource.getConnection();
            QueryRunner runner = new QueryRunner();
            BeanHandler<Employee> handler = new BeanHandler<>(Employee.class);
            employee = runner.query(conn, "select employee_id,last_name from employees where employee_id = ?", handler, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employee;
    }
}
