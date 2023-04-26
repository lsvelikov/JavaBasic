package ExamApril19;

import java.util.Scanner;

public class GodzillaVsKong_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int supernumerary = Integer.parseInt(scanner.nextLine());
        double suitPrice = Double.parseDouble(scanner.nextLine());

        double decor = budget - (budget * 0.9);
        if (supernumerary > 150){
            suitPrice = suitPrice - (suitPrice * 0.1);
        }
        double totalSuitPrice = supernumerary * suitPrice;
        double moneyNeeded = decor + totalSuitPrice;

        if (moneyNeeded > budget){
            System.out.printf("Not enough money!%n");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(budget - moneyNeeded));
        }else{
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - moneyNeeded);
        }
    }
}
