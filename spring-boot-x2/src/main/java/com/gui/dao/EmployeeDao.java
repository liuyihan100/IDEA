package com.gui.dao;

import com.gui.bean.Dog;
import com.gui.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {

    private static Map<Integer,Person> persons = null;
    @Autowired
    private DogDao dogDao;
    private static Integer num;

    static{
        persons = new HashMap<>();
        persons.put(1,new Person(1,"刘毅晗",18,new Dog("土豆",3)));
        persons.put(2,new Person(2,"李仕鸿",19,new Dog("土豆",3)));
        persons.put(3,new Person(3,"李伟",20,new Dog("小冰",2)));
    }

    public void add(Person person){
        if(person.getId() == null){
            person.setId(num++);
        }
        persons.put(person.getId(),person);
    }

    public void delete(Integer id){
        persons.remove(id);
    }

    public void update(Person person){
        if(persons.containsKey(person.getId())){
            person.setDog(dogDao.getByName(person.getDog().getName()));
            persons.put(person.getId(),person);
        }
    }

    public Collection<Person> getAll(){
        return persons.values();
    }

    public Person getById(Integer id){
        return persons.get(id);
    }

}
