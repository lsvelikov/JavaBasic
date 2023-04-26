package ExamJuly2019;

import java.util.Scanner;

public class FamilyTrip_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double nightPrice = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        if (nights > 7){
            nightPrice = nightPrice - (nightPrice * 0.05);
        }
        double totalNightPrice = nightPrice * nights;
        double others = percent * budget / 100;

        double totalPrice = totalNightPrice + others;
        if (totalPrice <= budget){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",budget - totalPrice);
        }else{
            System.out.printf("%.2f leva needed.", totalPrice - budget);
        }
    }
}
