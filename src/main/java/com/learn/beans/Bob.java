package com.learn.beans;

public class Bob {
    private String name;
    private int age;

    public Bob(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return  ("i am "+name+" my age is "+age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
