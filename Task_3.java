/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding_assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DIPTO
 */
class Task_3 {

    public static List<Teachers> teacherList = new ArrayList<Teachers>();
    public static List<Courses> courseList = new ArrayList<Courses>();
    public static List<Routines> routineList = new ArrayList<Routines>();

    public static void main(String args[]) {
        initialize();

        System.out.println("A. Create Routine\n"
                + "B. Show Routine\nC. List Courses with Teachers Name"
                + "\npress N to quit");

        Scanner input = new Scanner(System.in);
        boolean check = false;

        while (true) {
            String str = input.next(); //if str is "N" then the loop breaks.
            if (!str.equalsIgnoreCase("N")) {
                if (str.equalsIgnoreCase("C")) {
                    //if str is "C" then the list of courses with teacher name is showed.
                    listCoursesWithTeachersName();

                    //USER PROMPT
                    System.out.println("\nA. Create Routine\n"
                            + "B. Show Routine\nC. List Courses with Teachers Name"
                            + "\npress N to quit");

                } else if (str.equalsIgnoreCase("A")) {
                    //if str is "A" then the list of courses is showed and asked to
                    //create a routine by providing some inputs in a particular pattern.
                    listCourses();

                    //USER PROMPT
                    System.out.println("\nTo create routine please provide information"
                            + " in the following pattern :\n"
                            + "dayIndex(0-4) hourIndex(0-3) courseIndex");

                    System.out.println("\n[press y if routine is creation is complete"
                            + " or just keep following the above pattern to create more routine]\n");

                    //Creating the routine by taking the inputs.
                    while (true) {
                        String first = input.next();
                        if (!first.equalsIgnoreCase("y")) { //if first is "y" then the loop breaks.
                            int day = Integer.parseInt(first);
                            int hour = input.nextInt();
                            int courseIndex = input.nextInt();
                            routineList.add(new Routines(day, hour, courseList.get(courseIndex).courseName));
                        } else {
                            check = true; //After the creation of a routine the check variable is now true
                            break;
                        }
                    }

                    //USER PROMPT
                    System.out.println("\nA. Create Routine\n"
                            + "B. Show Routine\nC. List Courses with Teachers Name"
                            + "\npress N to quit");

                } else if (str.equalsIgnoreCase("B") && check) {  //check = true if any routine has been created.
                    //if str is "B" then the list of routines is showed
                    showRoutine();

                    //USER PROMPT
                    System.out.println("\nA. Create Routine\n"
                            + "B. Show Routine\nC. List Courses with Teachers Name"
                            + "\npress N to quit");
                } else if (str.equalsIgnoreCase("B") && !check) {
                    //if check = false, then it means no routines are created so cannot show any routine.
                    System.out.println("Please create a routine first then press this option again to see the routine");

                    //USER PROMPT
                    System.out.println("\nA. Create Routine\n"
                            + "B. Show Routine\nC. List Courses with Teachers Name"
                            + "\npress N to quit");
                } else {
                    System.out.println("Wrong option. Please try again!");

                    //USER PROMPT
                    System.out.println("\nA. Create Routine\n"
                            + "B. Show Routine\nC. List Courses with Teachers Name"
                            + "\npress N to quit");
                }

            } else {
                break;
            }
        }
        input.close();
    }

    public static void listCoursesWithTeachersName() {
        System.out.println("");
        for (int i = 0; i < courseList.size(); ++i) {
            System.out.println(courseList.get(i) + ", " + teacherList.get(i));
        }
    }

    public static void listCourses() {
        System.out.println("");
        for (int i = 0; i < courseList.size(); ++i) {
            System.out.println((i + 1) + ". " + courseList.get(i));
        }
    }

    public static void showRoutine() {
        System.out.println("");
        for (int i = 0; i < routineList.size(); ++i) {
            System.out.println(routineList.get(i));
        }
    }

    public static void initialize() {
        //The courses List
        courseList.add(new Courses("English Grammar"));
        courseList.add(new Courses("Mathematics"));
        courseList.add(new Courses("Physics"));
        courseList.add(new Courses("Chemistry"));
        courseList.add(new Courses("Biology"));

        //The teachers List
        teacherList.add(new Teachers("John Smith"));
        teacherList.add(new Teachers("Lara Gilbert"));
        teacherList.add(new Teachers("Johanna Kabir"));
        teacherList.add(new Teachers("Danniel Robertson"));
        teacherList.add(new Teachers("Larry Cooper"));
    }
}

class Teachers {

    String teacherName;

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

class Courses {

    String courseName;

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

class Routines {

    int day, hour;
    String courseName;

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
