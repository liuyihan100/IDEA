package com.gui.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable,HttpSessionBindingListener,HttpSessionActivationListener {
    private Integer employee_id;
    private String last_name;

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("Bound");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("Unbound");
    }

    @Override
    public void sessionWillPassivate(HttpSessionEvent se) {
        System.out.println("sessionWillPassivate");
    }

    @Override
    public void sessionDidActivate(HttpSessionEvent se) {
        System.out.println("sessionDidActivate");
    }
}
