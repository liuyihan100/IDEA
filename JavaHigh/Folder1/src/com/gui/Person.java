package com.gui;

import java.util.Objects;

public class Person implements Comparable {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Person){
            Person p = (Person)o;
            Integer result = this.name.compareTo(p.name);
            return  result;
        }else{
            throw new RuntimeException("错误");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
