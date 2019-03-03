package sda.javadoc;

import java.util.List;
import java.util.Set;

public interface ISchool {
    void addStudent(Student student);
    void addStudent(String firstName, String lastName, int age, Set<Course> courses);
    Student getStudentByFirstNameAndLastName(String firstName, String lastName);
    List<Student> getStudentsByCourse(Course course);
}