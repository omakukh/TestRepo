package com.ok.Lesson7.Homework5.collections;

public class Main {
    public static void main(String[] args) {

        Lits litsSchools = new Lits();
        litsSchools.getSchoolsList();
        litsSchools.printCoursesPerSchool();
        System.out.println();
        litsSchools.addCoursesToSchool("QA School", "Automation testing");
        litsSchools.printCoursesPerSchool();
        System.out.println();
        litsSchools.addCoursesToSchool("QA School2", "Automation testing");
        litsSchools.getSchoolsList();
        litsSchools.printCoursesPerSchool();
        System.out.println();
        litsSchools.addCoursesToSchool("Code School", "Java Basic");
        litsSchools.getSchoolsList();
        litsSchools.printCoursesPerSchool();
        System.out.println();
        litsSchools.addCoursesToSchool("Code School", "Java Basic");
        litsSchools.addCoursesToSchool("Code School", "Java Advanced");
        litsSchools.printCoursesPerSchool();
        System.out.println();
        litsSchools.addTeachers();
        litsSchools.showTeachers();
        System.out.println();
        litsSchools.printNews();
        System.out.println("List of news per date:");
        litsSchools.addNews("2019-12-01",new String[]{"news11","news12"});
        litsSchools.addNews("2019-12-02",new String[]{"news21","news22", "news23"});
        litsSchools.printNews();

    }
}
