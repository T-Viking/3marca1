package sda.javadoc;

import java.util.List;
import java.util.Set;

/**
 * Adds students to the school using ISchool index.
 */
public class SDAcademySchool implements ISchool {
    /**
     * Adds student to the school.
     * @param student - student added to school.
     */
    @Override
    public void addStudent(Student student) {}

    /**
     *Adds student's firstName, lastName,age,courses to the school listing.
     * @param firstName - first name of the student that is going to be created.
     * @param lastName - last name of the student that is going to be created.
     * @param age - age of the student that is going to be created.
     * @param courses - courses attended by the student that is going to be created.
     */
    @Override
    public void addStudent(String firstName, String lastName, int age, Set<Course> courses) {}

    /**
     * Adds student to the school by first and last name.
     * @param firstName - first name of the student being used.
     * @param lastName - last name of the student being used
     * @return - returns imaginary value.
     */
    @Override
    public Student getStudentByFirstNameAndLastName(String firstName, String lastName) {
        return null;
    }

    /**
     *
     * @param course - courses attended by students.
     * @return - returns imaginary value.
     */
    @Override
    public List<Student> getStudentsByCourse(Course course) {
        return null;
    }
}