package com.gui.demo.bean;

public class Person {
    private String name;
    private Integer age;
    private boolean boss;

    public Person() {
    }

    public Person(String name, Integer age, boolean boss) {

        this.name = name;
        this.age = age;
        this.boss = boss;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public String getName() {

        return name;
    }

    public Integer getAge() {
        return age;
    }

    public boolean isBoss() {
        return boss;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                '}';
    }
}
