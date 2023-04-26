package ExamApril2019;

import java.util.Scanner;

public class EasterGuests_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double easterCakes = Math.ceil(guests * 1.0 / 3);
        int eggsNeeded = guests * 2;
        double easterCakePrice = easterCakes * 4;
        double eggsPrice = eggsNeeded * 0.45;

        double totalPrice = easterCakePrice + eggsPrice;

        if (totalPrice > budget){
            System.out.printf("Lyubo doesn't have enough money.%n");
            System.out.printf("He needs %.2f lv. more.", totalPrice - budget);
        }else{
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.%n", easterCakes, eggsNeeded);
            System.out.printf("He has %.2f lv. left.", budget - totalPrice);
        }
    }
}
