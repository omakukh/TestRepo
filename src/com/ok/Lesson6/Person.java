package com.ok.Lesson6;

public class Person implements Comparable<Person>{

    private Integer age;
    private String name;

    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o){
        return o.age.compareTo(this.age) - o.name.compareTo(this.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
