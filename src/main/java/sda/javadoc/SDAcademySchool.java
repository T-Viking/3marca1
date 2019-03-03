package sda.javadoc;

import java.util.List;
import java.util.Set;

public class SDAcademySchool implements ISchool {
    @Override
    public void addStudent(Student student) {}
    @Override
    public void addStudent(String firstName, String lastName, int age, Set<Course> courses) {}
    @Override
    public Student getStudentByFirstNameAndLastName(String firstName, String lastName) {
        return null;
    }
    @Override
    public List<Student> getStudentsByCourse(Course course) {
        return null;
    }
}