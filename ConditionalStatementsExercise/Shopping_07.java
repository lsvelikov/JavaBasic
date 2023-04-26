package ConditionalStatementsExercise;

import java.util.Scanner;

public class Shopping_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countVideoCards = Integer.parseInt(scanner.nextLine());
        int countProcessors = Integer.parseInt(scanner.nextLine());
        int countRam = Integer.parseInt(scanner.nextLine());

        double priceVideoCards = countVideoCards * 250;
        double priceProcessors = countProcessors * (priceVideoCards * 0.35);
        double priceRam = countRam * (priceVideoCards * 0.1);

        double totalSum = priceVideoCards + priceProcessors + priceRam;

        if (countVideoCards > countProcessors){
            totalSum -= totalSum * 0.15;
        }
        if (totalSum <= budget){
            System.out.printf("You have %.2f leva left!", budget - totalSum);
        }else{
            System.out.printf("Not enough money! You need %.2f leva more!", totalSum - budget);
        }
    }
}
