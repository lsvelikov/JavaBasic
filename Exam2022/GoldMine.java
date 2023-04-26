package Exam2022;

import java.util.Scanner;

public class GoldMine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int location = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= location; i++) {
            double averageYield = Double.parseDouble(scanner.nextLine());
            int diggingDays = Integer.parseInt(scanner.nextLine());

            double totalYield = 0;
            for (int j = 1; j <= diggingDays; j++) {
                double yieldPerDay = Double.parseDouble(scanner.nextLine());

                totalYield = totalYield + yieldPerDay;

            }
            double averageYieldPerDay = totalYield / diggingDays;
            if (averageYieldPerDay >= averageYield){
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageYieldPerDay);
            }else{
                System.out.printf("You need %.2f gold.%n", averageYield - averageYieldPerDay);
            }
        }
    }
}
