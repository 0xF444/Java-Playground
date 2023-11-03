package Assignment_2.Quadratic;

import java.util.Scanner;
import java.lang.Math;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the quadratic formula coefficients in the following order: ax^2 + bx + c = 0");
        String[] coeff = scanner.nextLine().split(" ");

        int a = Integer.parseInt(coeff[0]);
        int b = Integer.parseInt(coeff[1]);
        int c = Integer.parseInt(coeff[2]);

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Solution Set has the real number line.");
                } else {
                    System.out.println("Solution Set is null set.");
                }
            } else {
                double root = -(double)c / b;
                System.out.println("Solution Set has one real root: " + root);
            }
        } else {
            double discriminant = Math.pow(b, 2) - 4 * a * c;

            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Solution Set has two distinct real roots:");
                System.out.println(" Root 1: " + root1);
                System.out.println(" Root 2: " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2.0 * a);
                System.out.println("Solution Set has one real root: " + root);
            } else {
                double realPart = -b / (2.0 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                System.out.println("Solution Set has two complex roots:");
                System.out.println(" Root 1: " + realPart + " + " + imaginaryPart + "i");
                System.out.println(" Root 2: " + realPart + " - " + imaginaryPart + "i");
            }
        }
        scanner.close();
    }
}
