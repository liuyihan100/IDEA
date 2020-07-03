package com.gui;

public class java1 {

    public static void main(String[] args){
        Person person1 = new Person("小红",18);
        Person person2 = new Person("小红",18);

        if(person1.hashCode() == person2.hashCode()){
            if(person1.equals(person2)){
                System.out.println("相等");
            } else{
                System.out.println("不相等");
            }
        } else{
            System.out.println("不相等");
        }

    }
}
