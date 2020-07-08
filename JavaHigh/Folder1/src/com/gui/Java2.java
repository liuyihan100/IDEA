package com.gui;

import java.util.*;

public class Java2 {

    public static void main(String[] args) {
        HashMap map = new HashMap();
        Object o1 = map.put("1", "刘毅晗");
        Object o2 = map.put("2", "李仕鸿");

        Set keySet = map.keySet();
        for (Object key : keySet){
            System.out.println(key);
        }

        Collection values = map.values();
        Iterator iterator = values.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Set entrySet = map.entrySet();
        entrySet.forEach(System.out::println);
    }
}
