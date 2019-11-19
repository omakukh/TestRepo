package com.ok.Lesson3;

public class Developer extends Person {
    String primarySkill;

    public Developer (String name, int age, String primarySkill){
        super(name, age);
        this.primarySkill = primarySkill;
    }

    @Override
    public void whoAmI(){

        System.out.println("I'm a dev");
    }

    }
