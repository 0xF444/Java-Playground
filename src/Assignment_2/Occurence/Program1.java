package Assignment_2.Occurence;
import java.util.Scanner;
import java.util.ArrayList;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first array.");
        String[] entry1 = scanner.nextLine().split(" ");
        System.out.println("Please enter the second array.");
        String[] entry2 = scanner.nextLine().split(" ");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (String s : entry1) {
            list1.add(Integer.parseInt(s));
        }
        for (String s : entry2) {
            list2.add(Integer.parseInt(s));
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int number1 : list1) {
            int counter = 0;
            for (int number2 : list2) {
                if (number1 == number2) {
                    counter++;
                }
            }
            result.add(counter);
        }

        System.out.println("The result list is: " + result + ".");
        scanner.close();
    }
}

