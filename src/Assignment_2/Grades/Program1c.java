package Assignment_2.Grades;
import java.util.Scanner;
public class Program1c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your grades separated by a space: ");
        String[] inputGrades = scanner.nextLine().split(" ");

        int noCounter = 0;
        int yesCounter = 0;
        int totalGrades = 0;

        for (String strGrade : inputGrades) {
            int grade = Integer.parseInt(strGrade);
            if (grade >= 0 && grade <= 100) {
                yesCounter++;
                totalGrades += grade;
            } else {
                noCounter++;
            }
        }

        double average = (double) totalGrades / yesCounter;
        System.out.println("The average of total valid grades is equal to: " + average);
        scanner.close();
    }
}
