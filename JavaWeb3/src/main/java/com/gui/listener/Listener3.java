package com.gui.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

@WebListener()
public class Listener3 implements HttpSessionActivationListener {
    @Override
    public void sessionWillPassivate(HttpSessionEvent se) {
        System.out.println("钝化");
    }

    @Override
    public void sessionDidActivate(HttpSessionEvent se) {
        System.out.println("活化");
    }
}
