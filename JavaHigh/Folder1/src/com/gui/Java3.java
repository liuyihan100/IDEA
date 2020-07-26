package com.gui;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Java3 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        Class clazz = Class.forName("com.gui.Person");
        Object o = clazz.getConstructor(String.class,Integer.class).newInstance("刘毅晗",18);
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o,"李明");
        System.out.println(o);
        Method method = clazz.getDeclaredMethod("play");
        method.setAccessible(true);
        Object invoke = method.invoke(o);
        System.out.println(invoke);

    }

}
