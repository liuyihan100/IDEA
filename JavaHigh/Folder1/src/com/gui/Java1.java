package com.gui;

import java.util.Comparator;
import java.util.TreeSet;

public class Java1 {

    public static void main(String[] args){
        Person person1 = new Person("aaa",18);
        Person person2 = new Person("aba",20);

        Comparator comparator = (Object o1,Object o2) ->{
            if (o1 instanceof Person && o2 instanceof Person) {
                Person person3 = (Person) o1;
                Person person4 = (Person) o2;
                return -person3.getAge().compareTo(person4.getAge());
            } else {
                throw new RuntimeException("错误");
            }
        };

        TreeSet set = new TreeSet(comparator);
        set.add(person1);
        set.add(person2);

//        set.forEach(System.out::println);
//        Object[] objects = set.toArray();
//        for(Object i : objects){
//            System.out.println(i);
//        }

//        LinkedList list = new LinkedList();
//        list.add(123);
//        list.add(456);
//        list.forEach(System.out::println);
    }
}
