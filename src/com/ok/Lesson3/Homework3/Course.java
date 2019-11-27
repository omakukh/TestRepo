package com.ok.Lesson3.Homework3;

public class Course  extends MainPage{
    private String duration;
    private String date;
    private double price;
    private String plan = "Plan";

    public Course(String pageName, String duration, String date, double price){
        super(pageName);
        this.duration = duration;
        this.date = date;
        this.price = price;
    }

    public void expandPlan(){
        clickOn(plan);
    }

}
