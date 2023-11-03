package Assignment_1;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner Buffer = new Scanner(System.in);
        System.out.println("Please enter your x: ");
        int x = Buffer.nextInt();
        System.out.println("Please enter your y: ");
        int y = Buffer.nextInt();
        System.out.println("Your result is: " + (int) Math.pow(x, y));
        Buffer.close();
    }
}
