package Exam2022;

import java.util.Scanner;

public class BeerAndChips {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int beers = Integer.parseInt(scanner.nextLine());
        int chips = Integer.parseInt(scanner.nextLine());

        double totalBeerPrice = beers * 1.2;
        double chipsPrice = totalBeerPrice * 0.45;
        double totalChipsPrice = Math.ceil(chipsPrice * chips);
        double totalPrice = totalBeerPrice + totalChipsPrice;

        if (totalPrice <= budget){
            System.out.printf("%s bought a snack and has %.2f leva left.", name, budget - totalPrice);
        }else{
            System.out.printf("%s needs %.2f more leva!", name, totalPrice - budget);
        }
    }
}
