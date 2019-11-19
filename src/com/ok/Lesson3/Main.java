package com.ok.Lesson3;

public class Main {

    public static void main(String[] args) {

//        Person person = new Person("Mikel", 13);
//        person.name = "Jhon";
//
//        System.out.println(person.name);
//        System.out.println(person.age);
//
//        person.whoAmI();
//        System.out.println(person.getAge());
//
//        Person person1 = person.getPerson();
//
//        System.out.println(person1.name);
//        person1.name="Peter";
//
//        System.out.println(person.name);
//
//        Person.foo();


        int i=0;
        while (i <= 10){
            if (i%2 == 0) {
                System.out.println(i);
            }
            i++;
        }



        Person developer = new Developer("it",12, "test");

        developer.whoAmI();

        developer = new ProjectManager("PM", 34,"lang");

        developer.whoAmI();


    }
}
