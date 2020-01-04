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
        System.out.println("You've clicked on page: " + page.getPageName());
    }

    public String getPageName() {
        return this.pageName;
    }

    public void getListOfSchoolsOrCourses() {
        if (listOfSchoolsOrCourses.length > 0) {
            System.out.println("There are the following courses:");
            for (String course : listOfSchoolsOrCourses) {
                System.out.println("\t" + course);
            }
        } else {
            System.out.println("There're no courses on " + getPageName());
        }
    }

    public void whereAmI() {
        System.out.println("You're on the " + getPageName());
    }
}
