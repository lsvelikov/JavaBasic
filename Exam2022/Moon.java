package Exam2022;

import java.util.Scanner;

public class Moon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double averageSpeed = Double.parseDouble(scanner.nextLine());
        double fuelPerHundredKm = Double.parseDouble(scanner.nextLine());

        double totalDistance = 2 * 384400;
        double timeNeeded = Math.ceil(totalDistance / averageSpeed);
        double totalTime = timeNeeded + 3;
        double fuelNeeded = (fuelPerHundredKm * totalDistance) / 100;

        System.out.printf("%.0f%n", totalTime);
        System.out.printf("%.0f", fuelNeeded);

    }
}
