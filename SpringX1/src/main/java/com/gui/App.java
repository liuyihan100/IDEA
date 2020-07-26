package com.gui;

import com.gui.bean.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext text = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee bean = text.getBean("employee3", Employee.class);
        System.out.println(bean);
    }
}
