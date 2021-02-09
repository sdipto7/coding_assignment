package domain_package;

public class Teachers {

    public String teacherName;

    public Teachers() {
        teacherName = null;
    }

    public Teachers(String name) {
        teacherName = name;
    }

    @Override
    public String toString() {
        return teacherName;
    }
}
