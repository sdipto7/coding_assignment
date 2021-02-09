package domain_package;

public class Routines {
    public int day, hour;
    public String courseName;

    public Routines() {
        day = 0;
        hour = 0;
        courseName = null;
    }

    public Routines(int day, int hour, String courseName) {
        this.day = day;
        this.hour = hour;
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return day + " " + hour + " " + courseName;
    }
}
