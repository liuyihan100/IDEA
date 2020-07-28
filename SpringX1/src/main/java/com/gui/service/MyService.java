package com.gui.service;

import com.gui.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MyService {

    @Autowired
    private Dao dao;

    @Transactional
    public void play(Integer x, Integer y){
        dao.add(x);
        if(dao.query(y) < 1000){
            System.out.println("余额不足");
            throw new RuntimeException();
        }else {
            dao.sub(y);
        }
    }

}
