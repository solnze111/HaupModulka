package com.ee;


import com.ee.entity.Person.Person;

public class ServiceMain {
    public static void main(String[] args) {

        Person person = new Person();
        person.setAge(11);
        System.out.println("Services Project Hello world!");
        System.out.println("person age: " + person.getAge());
    }
}