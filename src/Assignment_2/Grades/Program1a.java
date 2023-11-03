package Assignment_2.Grades;

import java.util.ArrayList;
import java.util.Scanner;

public class Program1a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your grades separated by a space: ");
        String inputLine = scanner.nextLine();

        // Splitting the input line into an array of strings
        String[] inputGrades = inputLine.split(" ");

        // Using an ArrayList to store the integer grades
        ArrayList<Integer> grades = new ArrayList<>();
        for (String strGrade : inputGrades) {
            grades.add(Integer.parseInt(strGrade));
        }

        int noCounter = 0;
        int yesCounter = 0;

        for (int i = 0; i < grades.size(); i++) {
            int grade = grades.get(i);
            if (grade >= 0 && grade <= 100) {
                System.out.println("Index #" + i + " has a valid grade of " + grade + ".");
                yesCounter++;
            } else {
                System.out.println("Index #" + i + " has an invalid grade of " + grade + ".");
                noCounter++;
            }
        }

        System.out.println("Number of valid grades is equal to: " + yesCounter +
                "\nNumber of invalid grades is equal to: " + noCounter + ".");

        scanner.close();
    }
}
