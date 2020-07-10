package com.gui;

import org.junit.Test;

import java.util.*;

public class Test1 {

    @Test
    public void Test1(){
        Integer[] a = new Integer[5];
        a[0] = 5;
        a[1] = 15;
        Integer[] b = new Integer[5];
        b[0] = 5;
        b[1] = 15;
        List<Integer> list = Arrays.asList(b);
        HashSet set = new HashSet(list);
        Iterator iterator = set.iterator();
        while ((iterator.hasNext())){
            System.out.println(iterator.next());
        }
    }
}
