package Assignment_2.Grades;

import java.util.ArrayList;
import java.util.Scanner;

public class Program1f {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your grades separated by a space: ");
        String[] inputGrades = scanner.nextLine().split(" ");

        ArrayList<Integer> grades = new ArrayList<>();
        ArrayList<Integer> validGrades = new ArrayList<>();
        int noCounter = 0;
        int yesCounter = 0;
        int totalGrade = 0;
        double avg;
        int avgCount = 0;

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

        // Calculating the average
        for (int grade : validGrades) {
            totalGrade += grade;
        }
        avg = (double) totalGrade / validGrades.size();

        // Checking for grades above average
        for (int i = 0; i < validGrades.size(); i++) {
            int grade = validGrades.get(i);
            if (grade > avg) {
                System.out.println("Student at index #" + i + " has a grade above average.\n");
                avgCount++;
            }
        }

        System.out.println("Total student count = " + avgCount);
        scanner.close();
    }
}
