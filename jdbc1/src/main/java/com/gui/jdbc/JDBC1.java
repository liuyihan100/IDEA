package com.gui.jdbc;

import com.gui.bean.Employee;

import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class JDBC1 {

    public Connection getConn() throws Exception {

        FileInputStream stream = new FileInputStream("source.properties");
        Properties pro = new Properties();
        pro.load(stream);

        Class.forName(pro.getProperty("driverClass"));
        String url = pro.getProperty("url");
        String user = pro.getProperty("user");
        String password = pro.getProperty("password");
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;

    }

    public void update() {
        Connection conn = null;
        PreparedStatement state = null;
        try {
            conn = getConn();
            String sql = "update employees set last_name = ? where employee_id = ?";
            state = conn.prepareStatement(sql);
            state.setString(1,"刘毅晗");
            state.setInt(2,100);
            state.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(state != null)
                    state.close();
                if(conn != null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public List<Employee> query(String sql,Object...args) {
        ArrayList<Employee> employees = null;
        Connection conn = null;
        PreparedStatement state = null;
        ResultSet resultSet = null;
        try {
            conn = getConn();
            state = conn.prepareStatement(sql);
            for(int i = 0;i < args.length;i++){
                state.setObject(i+1,args[i]);
            }
            resultSet = state.executeQuery();
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            employees = new ArrayList();
            while (resultSet.next()){
                Employee employee = new Employee();
                Class clazz = employee.getClass();
                for(int i = 1;i <= columnCount;i++){
                    Field declaredField = clazz.getDeclaredField(metaData.getColumnName(i));
                    declaredField.setAccessible(true);
                    declaredField.set(employee,resultSet.getObject(i));
                }
                employees.add(employee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null)
                    resultSet.close();
                if (state != null)
                    state.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return employees;
    }

}
