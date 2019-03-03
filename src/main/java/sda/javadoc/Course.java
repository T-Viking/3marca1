package sda.javadoc;

/**
 * This enmum represtents every type of Course.
 */

public enum Course {
    /**
     * This value represents backend developer course.
     */
    BACKEND_DEVELOPER("Backend Developer"),
    /**
     * This value represents frontend developer course wih technologies such as Angular, React.
     */
    FRONTEND_DEVELOPER("Frontend Developer"),
    /**
     * This value is just a mockup.
     */
    AI_ENGINEER("AI Engineer"),
    /**
     * This value looks beautiful and means nothing.
     */
    DEV_OPS("Dev ops");
    private String courseName;

    /**
     * Course constructor, creats a course with description given in parameter.
     * @param courseName - course descripition/name
     */
    Course(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Returns course description name.
     * @return course name.
     */
    public String getCourseName() {
        return courseName;
    }
}