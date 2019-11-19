package com.ok.Lesson3;

public class Person {

   private String name;
   private int age;


    public Person (String name){
        System.out.println("Hello");
        this.name = name;
  //      this.age = age;
    }

    public Person (String name, int age){
        this.name = name;
        this.age = age;

    }

    public String getName(){
        return name;
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
