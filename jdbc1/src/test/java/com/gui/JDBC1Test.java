package com.gui;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.gui.bean.Employee;
import com.gui.jdbc.JDBC1;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Handler;

public class JDBC1Test {

    @Test
    public void getConn() {
        JDBC1 jdbc1 = new JDBC1();
        String sql = "select employee_id employeeId,last_name lastName from employees where employee_id >= ? and employee_id < ?";
        List<Employee> employees = jdbc1.query(sql,100,120);
    }

    @Test
    public void play1(){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream("1.jpg"));
            bos = new BufferedOutputStream(new FileOutputStream("2.jpg"));
            byte[] bytes = new byte[10];
            int len;
            while((len = bis.read(bytes)) != -1){
                bos.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bis != null)
                    bis.close();
                if(bos != null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void play2(){
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println(next);
    }

    @Test
    public void play3(){
        try {
            ComboPooledDataSource dataSource = new ComboPooledDataSource("helloc3p0");
            Connection conn = dataSource.getConnection();
            System.out.println(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void play4() throws Exception{
        FileInputStream fis = new FileInputStream("src/main/resources/dbcp.properties");
        Properties pros = new Properties();
        pros.load(fis);
//        BasicDataSource dataSource = BasicDataSourceFactory.createDataSource(pros);
//        Connection conn = dataSource.getConnection();
//        System.out.println(conn);
        DataSource source = DruidDataSourceFactory.createDataSource(pros);
        Connection connection = source.getConnection();
        QueryRunner runner = new QueryRunner();
//        int i = runner.update(connection, "insert into employees(employee_id,last_name) values(201,'傻子')");
//        System.out.println(i);
    }

    @Test
    public void play5(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        int i;
        for(i = 2;i < 10;i++){
            list.add(i,list.get(i-1) + list.get(i-2));
        }
        list.forEach(System.out::println);
    }
}