package com.gui;

import com.alibaba.druid.pool.DruidDataSource;
import com.gui.bean.Employee;
import com.gui.dao.Dao;
import com.gui.dao.DaoI;
import com.gui.service.MyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws SQLException {
        ApplicationContext text = new ClassPathXmlApplicationContext("applicationContext.xml");
//        DruidDataSource dataSource = text.getBean("dataSource", DruidDataSource.class);
//        Connection conn = dataSource.getConnection();
//        System.out.println(conn);
//        Employee employee = text.getBean("employee", Employee.class);
//        System.out.println(employee);
//        Dao dao = text.getBean("dao", Dao.class);
//        System.out.println(dao.add(1,1));
//        JdbcTemplate jdbcTemplate = text.getBean("jdbcTemplate", JdbcTemplate.class);
//        List<Employee> list = jdbcTemplate.query("select employee_id,last_name from employees where employee_id >= ? and employee_id < ?", new Object[]{100,110}, new BeanPropertyRowMapper<>(Employee.class));
//        list.forEach(System.out::println);
        MyService service = text.getBean("myService", MyService.class);
        service.play(100,101);
    }
}
