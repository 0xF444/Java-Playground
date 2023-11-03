package Assignment_1;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner Buffer = new Scanner(System.in);
        System.out.println("Please enter units: ");
        int units = Buffer.nextInt();
        System.out.println("Please enter tens: ");
        int tens = Buffer.nextInt();
        System.out.println("Please enter hundreds: ");
        int hundreds = Buffer.nextInt();
        System.out.println("The number is: " + (units + tens * 10 + hundreds * 100));
        Buffer.close();
    }
}