package sda.javadoc;

import java.util.Set;

public class Student {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final Set<Course> courses;
    public Student(String firstName, String lastName, int age, Set<Course> courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.courses = courses;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public Set<Course> getCourses() {
        return courses;
    }
}