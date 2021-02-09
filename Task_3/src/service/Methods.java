package service;

import domain_package.Courses;
import domain_package.Teachers;
import domain_package.Routines;

import static repository.Data.*;
import static repository.Data.routineList;

public class Methods {

    public static void setCoursesAndTeachers() {
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
}
