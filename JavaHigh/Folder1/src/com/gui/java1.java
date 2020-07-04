package com.gui;

import java.util.TreeSet;

public class java1 {

    public static void main(String[] args){
        Person person1 = new Person("aaa",18);
        Person person2 = new Person("aba",18);

        if(person1.hashCode() == person2.hashCode()){
            if(person1.equals(person2)){
                System.out.println("相等");
            } else{
                System.out.println("不相等");
            }
        } else{
            System.out.println("不相等");
        }

        TreeSet set = new TreeSet();
        set.add(person1);
        set.add(person2);

        set.forEach(System.out::println);

    }
}
