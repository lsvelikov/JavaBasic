package ExamMai2019;

import java.util.Scanner;

public class Safari_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double litersNeeded = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double fuelPrice = litersNeeded * 2.10;
        double totalPrice = fuelPrice + 100;

        if (day.equals("Saturday")){
            totalPrice = totalPrice * 0.9;
        } else if (day.equals("Sunday")) {
            totalPrice = totalPrice * 0.8;
        }

        if (budget >= totalPrice){
            System.out.printf("Safari time! Money left: %.2f lv.", budget - totalPrice);
        }else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", totalPrice - budget);
        }
    }
}
