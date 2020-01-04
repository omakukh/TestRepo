package com.ok.Lesson7.Homework5.collections;

public class Teacher {

    private String firstName;
    private String lastName;

    Teacher(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (o == this)
            return true;
        if (!(o instanceof Teacher))
            return false;
        Teacher t = (Teacher)o;
        return t.lastName.equals(lastName) && t.firstName.equals(firstName);
    }

    @Override
    public int hashCode() {
        int result = 42;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }
}
