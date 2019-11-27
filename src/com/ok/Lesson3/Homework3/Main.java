package com.ok.Lesson3.Homework3;

public class Main {
    public static void main(String[] args) {
        MainPage mainPage = new MainPage("Homepage");
        MainPage qaSchool = new School("QA School", new String[] {"Automation testing", "ISTQB exam"}, 2,4);
        School codeSchool = new School("Code School", new String[]{"Java Advanced", "Devops", "Java Base"}, 3, 7);
        Course javaAdvanced = new Course("Java Advanced", "3 months", "28.11.2019", 12900);

        mainPage.clickOn(mainPage);
        mainPage.whereAmI();
        mainPage.clickOn(codeSchool);
        codeSchool.whereAmI();
        System.out.println("The name of the course is " + javaAdvanced.getPageName());
        codeSchool.selectCourse(javaAdvanced);
        javaAdvanced.expandPlan();

        System.out.println("\nExamples of usage:");
        mainPage.getListOfSchoolsOrCourses();
        System.out.println(qaSchool.getPageName());
        qaSchool.getListOfSchoolsOrCourses();
        ((School) qaSchool).becomeStudent();
    }
}
