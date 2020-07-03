package com.gui.demo.conf;

import com.gui.demo.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConf {

    @Bean
    public Person hello(){
        Person person = new Person("小明", 15, true);
        return person;
    }
}
