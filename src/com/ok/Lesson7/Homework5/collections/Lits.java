package com.ok.Lesson7.Homework5.collections;

import java.util.*;

public class Lits {

    private List<String> schools = new LinkedList<>();
    private Map<String, Set<String>> coursesPerSchool = new HashMap<>();
    private Set<Teacher> listOfTeachers = new HashSet<>();
    private Map<String, Set<String>> litsNews = new HashMap<>();

    Lits() {
        schools.add("QA School");
        schools.add("PM School");
        schools.add("BDA School");
        for (int i = 0; i < schools.size(); i++) {
            initializeCoursesForSchool(schools.get(i));
        }
    }

    public void addNews(String date, String[] news){

        litsNews.put(date, new HashSet<>(Arrays.asList(news)));
    }

    public void printNews(){
        litsNews.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }

    public void addTeachers() {
        listOfTeachers.add(new Teacher("Taras", "Lytvyn"));
        listOfTeachers.add(new Teacher("Volodymyr", "Krokhmaliuk"));
        listOfTeachers.add(new Teacher("Taras", "Lytvyn"));
        listOfTeachers.add(new Teacher("Anna", "Gerasymovych"));
        listOfTeachers.add(new Teacher("Vadym", "Sekret"));
        listOfTeachers.add(new Teacher("Vira", "Povh"));
        listOfTeachers.add(new Teacher("Ivan", "Lavriv"));
        listOfTeachers.add(new Teacher("Ivan", "Lavriv"));
        listOfTeachers.add(new Teacher("Ihor", "Khomenko"));
        listOfTeachers.add(new Teacher("Iryna", "Kulish"));
        listOfTeachers.add(new Teacher("Maryna", "Roik"));
        listOfTeachers.add(new Teacher("Lilia", "Bilas"));
    }

    public void showTeachers() {
        System.out.println("List of teachers:");
        listOfTeachers.forEach(System.out::println);
    }


    public void addCoursesToSchool(String school, String course) {
        if (schools.contains(school)) {
            System.out.println("School " + school + " is in a map, adding course");
            coursesPerSchool.get(school).add(course);
        } else {
            System.out.println("School " + school + " is not in a map, adding school first, then course to it");
            addSchool(school);
            coursesPerSchool.get(school).add(course);
        }
    }

    private void addSchool(String newSchool) {
        schools.add(newSchool);
        initializeCoursesForSchool(newSchool);
    }

    public void getSchoolsList() {
        System.out.print("List of existing schools: ");
        System.out.println(schools);
    }

    private void initializeCoursesForSchool(String school) {
        coursesPerSchool.put(school, new HashSet<>());
    }

    public void printCoursesPerSchool() {
        System.out.println("List of courses per school:");
        coursesPerSchool.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }
}
