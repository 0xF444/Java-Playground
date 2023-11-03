package Assignment_2.Grades;

import java.util.ArrayList;
import java.util.Scanner;

public class Program1e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your grades separated by a space: ");
        String[] inputGrades = scanner.nextLine().split(" ");

        ArrayList<Integer> grades = new ArrayList<>();
        ArrayList<Integer> validGrades = new ArrayList<>();
        int noCounter = 0;
        int yesCounter = 0;
        int aboveCounter = 0;

        for (String strGrade : inputGrades) {
            grades.add(Integer.parseInt(strGrade));
        }

        // Grade Validation
        for (int i = 0; i < grades.size(); i++) {
            int grade = grades.get(i);
            if (grade >= 0 && grade <= 100) {
                yesCounter++;
                validGrades.add(grade);
            } else {
                noCounter++;
            }
        }

        // Checking for grades above 85
        for (int i = 0; i < validGrades.size(); i++) {
            int grade = validGrades.get(i);
            if (grade > 85) {
                aboveCounter++;
                System.out.println("Student at index #" + i + " has a grade above 85%.\n");
            }
        }

        System.out.println("Total student count = " + aboveCounter);
        scanner.close();
    }
}
