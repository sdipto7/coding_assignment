package domain_package;

public class Courses {
    public String courseName;

    public Courses() {
        courseName = null;
    }

    public Courses(String course) {
        courseName = course;
    }

    @Override
    public String toString() {
        return courseName;
    }
}
