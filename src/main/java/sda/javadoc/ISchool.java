package sda.javadoc;

import java.util.List;
import java.util.Set;

public interface ISchool {
    /**
     * Adds student given in a parameter to the school.
     * @param student - student added to school.
     */
    void addStudent(Student student);

    /**
     * Creates and adds student to school. Method requires all parameters to create single student
     * than adds newly created student to school.
     * @param firstName - first name of the student that is going to be created.
     * @param lastName - last name of the student that is going to be created.
     * @param age - age of the student that is going to be created.
     * @param courses - courses attended by the student that is going to be created.
     */
    void addStudent(String firstName, String lastName, int age, Set<Course> courses);

    /**
     * Uses student by first name and last name parameters.
     * @param firstName - first name of the student being used.
     * @param lastName - last name of the student being used
     * @return
     */
    Student getStudentByFirstNameAndLastName(String firstName, String lastName);

    /**
     * Creates a list based on courses attended by students.
     * @param course - courses attended by students.
     * @return
     */
    List<Student> getStudentsByCourse(Course course);
}