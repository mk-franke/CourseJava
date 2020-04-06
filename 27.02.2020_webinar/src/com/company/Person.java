package com.company;

public class Person {

    private String name;
    private int age;
    private Date birthday;

    public Person(String name, int day, int month, int year){
        this.name = name;
        this.birthday = new Date(day, month, year);
    }

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print () {
        System.out.println(name + " " + age);
    }

    public void setPersonField (String name, int age) {
        this.name = name;
        this.age = age;
    }

}
