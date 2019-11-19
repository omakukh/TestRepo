package com.ok.Lesson3;

public class ProjectManager extends Person {
    String primaryLanguage;

    public ProjectManager (String name, int age, String primaryLanguage){
        super(name, age);
        this.primaryLanguage = primaryLanguage;
    }

    @Override
    public void whoAmI(){

        System.out.println("I'm a PM");
    }

}
