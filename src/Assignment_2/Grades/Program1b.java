package Assignment_2.Grades;
import java.util.ArrayList;
import java.util.Scanner;
public class Program1b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your grades separated by a space: ");
        String[] inputGrades = scanner.nextLine().split(" ");

        ArrayList<Integer> grades = new ArrayList<>();
        ArrayList<Integer> resultList = new ArrayList<>();

        for (String strGrade : inputGrades) {
            grades.add(Integer.parseInt(strGrade));
        }

        for (int grade : grades) {
            if (grade >= 0 && grade <= 100) {
                resultList.add(1);
            } else {
                resultList.add(0);
            }
        }

        System.out.println("Result list is " + resultList + "\n");
        scanner.close();
    }
}
