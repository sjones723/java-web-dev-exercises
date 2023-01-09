package exercises.controlflow;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
/*
* It takes in student names and ID numbers (as integers) instead of names and grades.
* The keys should be the IDs and the values should be the names.
* Modify the roster printing code accordingly.
* */
    public static void main(String[]args){
        HashMap< Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students(or ENTER to finish)");

        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                students.put(newID, newStudent);
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getValue() + " (" + student.getKey() + ")");
        }
        System.out.println("Number of students in roster: " + students.size());
    }



    }//main method
//HashMapPractice class
