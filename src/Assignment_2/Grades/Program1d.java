
package Assignment_2.Grades;
import java.util.ArrayList;
import java.util.Scanner;

public class Program1d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your grades separated by a space: ");
        String[] inputGrades = scanner.nextLine().split(" ");

        ArrayList<Integer> grades = new ArrayList<>();
        ArrayList<Integer> validGrades = new ArrayList<>();
        int noCounter = 0;
        int yesCounter = 0;
        int least, most;
        int leastPos = 0;
        int mostPos = 0;

        for (String strGrade : inputGrades) {
            grades.add(Integer.parseInt(strGrade));
        }

        // Grade validation
        for (int i = 0; i < grades.size(); i++) {
            int grade = grades.get(i);
            if (grade >= 0 && grade <= 100) {
                yesCounter++;
                validGrades.add(grade);
            } else {
                noCounter++;
            }
        }


        // Finding the least and most grades
        least = validGrades.get(0);
        most = validGrades.get(0);
        for (int i = 0; i < validGrades.size(); i++) {
            int grade = validGrades.get(i);
            if (grade < least) {
                least = grade;
                leastPos = i;
            }
            if (grade > most) {
                most = grade;
                mostPos = i;
            }
        }

        System.out.println("The highest grade is equal to " + most + " at index #" + mostPos +
                "\nThe least grade is equal to " + least + " at index #" + leastPos);
        scanner.close();
    }
}
