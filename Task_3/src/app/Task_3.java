package app;

import domain_package.Courses;
import domain_package.Routines;
import domain_package.Teachers;

import java.util.Scanner;

import static repository.Data.*;
import static service.Methods.*;

/**
 *
 * @author DIPTO
 */

public class Task_3 {

    public static void main(String args[]) {
        setCoursesAndTeachers();
        //USER PROMPT
        showOptionsToUser();

        Scanner input = new Scanner(System.in);
        boolean check = false;

        while (true) {
            String str = input.next(); //if str is "N" then the loop breaks.
            if (!str.equalsIgnoreCase("N")) {
                if (str.equalsIgnoreCase("C")) {
                    //if str is "C" then the list of courses with teacher name is showed.
                    listCoursesWithTeachersName();

                    //USER PROMPT
                    showOptionsToUser();
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
                    showOptionsToUser();
                } else if (str.equalsIgnoreCase("B") && check) {  //check = true if any routine has been created.
                    //if str is "B" then the list of routines is showed
                    showRoutine();

                    //USER PROMPT
                    showOptionsToUser();
                } else if (str.equalsIgnoreCase("B") && !check) {
                    //if check = false, then it means no routines are created so cannot show any routine.
                    System.out.println("Please create a routine first then press this option again to see the routine");

                    //USER PROMPT
                    showOptionsToUser();
                } else {
                    System.out.println("Wrong option. Please try again!");

                    //USER PROMPT
                    showOptionsToUser();
                }
            } else {
                break;
            }
        }
        input.close();
    }
}