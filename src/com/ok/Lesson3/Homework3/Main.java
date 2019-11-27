package com.ok.Lesson3.Homework3;

public class Main {
    public static void main(String[] args) {
        MainPage mainPage = new MainPage("Homepage");

        mainPage.clickOn(mainPage);
        mainPage.clickOn("someWhere");

        MainPage qaSchool = new School("QA School", new String[] {"Automation testing", "ISTQB exam"}, 2,4);
        System.out.println(qaSchool.getPageName());

        School codeSchool = new School("Code School", new String[]{"Java Advanced", "Devops", "Java Base"}, 3, 7);
        System.out.println(codeSchool.getPageName());

        Course javaAdvanced = new Course("Java Advanced", "3 months", "28.11.2019", 12900);
        System.out.println(javaAdvanced.getPageName());
        qaSchool.clickOn(javaAdvanced);
        javaAdvanced.expandPlan();
    }
}
