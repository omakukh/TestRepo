package com.ok.Lesson3.Homework3;

public class School extends MainPage {

    private int numberOfcourses;
    private int numberOfTeachers;
    private String becomeAStudent = "Become a student";
    private String moreDetails = "More details";

    public School(String pageName, String[] listOfSchoolsOrCourses, int numberOfcourses, int numberOfTeachers){
        super(pageName, listOfSchoolsOrCourses);
        this.numberOfcourses = numberOfcourses;
        this.numberOfTeachers = numberOfTeachers;
    }

    public void becomeStudent(){
        clickOn(becomeAStudent);
    }

    public void moreDetails(){
        clickOn(moreDetails);
    }

    @Override
    public String getPageName() {
        System.out.print("Overridden page name: ");
        return super.getPageName();

    }
}
