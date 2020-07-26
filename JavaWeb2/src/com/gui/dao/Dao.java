package com.gui.dao;

public class Dao {
    public static boolean check(String name,String password){
        if(name.equals("root") && password.equals("123")){
            return true;
        }
        return false;
    }
}
