package ExamApril2019;

import java.util.Scanner;

public class EasterParty_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double coverPrice = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        if (guests >= 10 && guests <= 15){
            coverPrice *= 0.85;
        }else if (guests > 15 && guests <= 20){
            coverPrice *= 0.80;
        }else if (guests > 20){
            coverPrice *= 0.75;
        }
        double cakePrice = budget * 0.1;
        double totalPrice = guests * coverPrice + cakePrice;

        if (totalPrice > budget){
            System.out.printf("No party! %.2f leva needed.", totalPrice - budget);
        }else{
            System.out.printf("It is party time! %.2f leva left.", budget - totalPrice);
        }
    }
}
