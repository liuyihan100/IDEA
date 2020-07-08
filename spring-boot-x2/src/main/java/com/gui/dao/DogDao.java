package com.gui.dao;

import com.gui.bean.Dog;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class DogDao {

    private static Map<String,Dog> dogs = null;

    static{
        dogs = new HashMap<>();
        dogs.put("土豆",new Dog("土豆",3));
        dogs.put("小冰",new Dog("小冰",2));
        dogs.put("小爱",new Dog("小爱",3));
    }

    public Collection<Dog> getAll(){
        return dogs.values();
    }

    public Dog getByName(String name){
        return dogs.get(name);
    }
}
