package com.gui.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class Listener2 implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("RequestDestroy");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("RequestInit");
    }
}
