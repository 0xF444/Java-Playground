package Assignment_1;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner Buffer = new Scanner(System.in);

        System.out.print("Please enter your departure time in this format: hh:mm\n");
        String departure = Buffer.nextLine();
        System.out.print("Please enter your arrival time in this format: hh:mm\n");
        String arrival = Buffer.nextLine();

        int hh_depar = Integer.parseInt(departure.substring(0, 2));
        int mm_depar = Integer.parseInt(departure.substring(3, 5));
        int hh_arriv = Integer.parseInt(arrival.substring(0, 2));
        int mm_arriv = Integer.parseInt(arrival.substring(3, 5));

        int departureMinutes = hh_depar * 60 + mm_depar;
        int arrivalMinutes = hh_arriv * 60 + mm_arriv;
        double difference = arrivalMinutes - departureMinutes;
        if (difference < 0) {
            difference += 1440;
        }
        double hh_diff = Math.round(difference / 60);
        double mm_diff = Math.round(difference % 60);
        System.out.println("The trip time is equal to: " + (int) Math.abs(hh_diff) + " hr and "
                + (int) Math.abs(mm_diff) + " min.");
        Buffer.close();
    }
}
