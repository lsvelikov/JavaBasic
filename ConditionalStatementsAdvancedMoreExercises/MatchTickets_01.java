package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class MatchTickets_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int peopleCount = Integer.parseInt(scanner.nextLine());

        double vipTicketPrice = 499.99;
        double normalTicketPrice = 249.99;
        double transportPrice = 0;
        double moneyLeft = 0;

        if (peopleCount >= 1 && peopleCount <= 4) {
            transportPrice = budget * 0.75;
        } else if (peopleCount <= 9) {
            transportPrice = budget * 0.60;
        } else if (peopleCount <= 24) {
            transportPrice = budget * 0.50;
        } else if (peopleCount <= 49) {
            transportPrice = budget * 0.40;
        } else if (peopleCount >= 50) {
            transportPrice = budget * 0.25;
        }
        double restBudget = budget - transportPrice;
        if (category.equals("Normal")){
            moneyLeft = restBudget - normalTicketPrice * peopleCount;
            if (moneyLeft >= 0){
                System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
            }else{
                moneyLeft = normalTicketPrice * peopleCount - restBudget;
                System.out.printf("Not enough money! You need %.2f leva.", moneyLeft);
            }
        }else if (category.equals("VIP")){
            moneyLeft = restBudget - vipTicketPrice * peopleCount;
            if (moneyLeft >= 0){
                System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
            }else{
                moneyLeft = vipTicketPrice * peopleCount - restBudget;
                System.out.printf("Not enough money! You need %.2f leva.", moneyLeft);
            }
        }
    }
}
