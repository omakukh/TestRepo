package com.ok.Lesson2;

public class Person {

    String name;
    int age;

    public Person (){

    }

    public Person (String name){
        System.out.println("Hello");
        this.name = name;
    }

    public Person (String name, int age){
        this.name = name;
        this.age = age;

    }

    public void whoAmI(){

        System.out.println("My name is: " + name);
    }

    public int getAge(){

        return age;

    }

    public Person getPerson(){
        return this;
    }

    public static void foo(){
        System.out.println("Static");
    }
}
