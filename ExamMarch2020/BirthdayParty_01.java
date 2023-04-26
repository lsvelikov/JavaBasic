package ExamMarch2020;

import java.util.Scanner;

public class BirthdayParty_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double roomRent = Double.parseDouble(scanner.nextLine());

        double cakePrice = roomRent * 0.2;
        double drinksPrice = cakePrice * 0.55;
        double animator = roomRent / 3;

        double totalPrice = roomRent + cakePrice + drinksPrice + animator;

        System.out.printf("%.1f", totalPrice);
    }
}
