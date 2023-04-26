package ExamApril2019;

import java.util.Scanner;

public class EasterLunch_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterCake = Integer.parseInt(scanner.nextLine());
        int eggsCartons = Integer.parseInt(scanner.nextLine());
        int cookiesKg = Integer.parseInt(scanner.nextLine());

        double easterCakePrice = easterCake * 3.20;
        double eggsPrice = eggsCartons * 4.35;
        double cookiesPrice = cookiesKg * 5.40;
        double paintPrice = eggsCartons * 12 * 0.15;

        double totalPrice = easterCakePrice + eggsPrice + cookiesPrice + paintPrice;
        System.out.printf("%.2f", totalPrice);

    }
}
