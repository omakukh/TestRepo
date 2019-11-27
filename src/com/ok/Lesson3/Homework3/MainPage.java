package com.ok.Lesson3.Homework3;

public class MainPage {

    private String[] listOfSchoolsOrCourses = new String[]{};
    private String pageName;

    public MainPage(String pageName, String[] listOfSchoolsOrCourses){
        this.pageName = pageName;
        this.listOfSchoolsOrCourses = listOfSchoolsOrCourses;
    }

    public MainPage(String pageName){
        this.pageName = pageName;
    }

    public void clickOn(String clickOnSomething){
        System.out.println("You've clicked on " + clickOnSomething);
    }

    public void clickOn(MainPage page){
        System.out.println("You've clicked on page" + page.getClass().getSimpleName());
    }

    public String getPageName() {
        return pageName;
    }

    public String[] getListOfSchoolsOrCourses() {
        return listOfSchoolsOrCourses;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public void setListOfSchoolsOrCourses(String[] listOfSchoolsOrCourses) {
        this.listOfSchoolsOrCourses = listOfSchoolsOrCourses;
    }
}
