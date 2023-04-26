package ConditionalStatementsExercise;

import java.util.Scanner;

public class ToyShop_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double profit = (puzzles * 2.6) + (dolls * 3) + (teddyBears * 4.1) + (minions * 8.2) + (trucks * 2);
        int toysCount = puzzles + dolls + teddyBears + minions + trucks;

        if (toysCount >= 50){
            profit = profit - (profit * 0.25);
        }
        double totalProfit = profit - (profit * 0.1);

        if (totalProfit >= tripPrice){
            System.out.printf("Yes! %.2f lv left.",totalProfit - tripPrice);
        }else{
            System.out.printf("Not enough money! %.2f lv needed.",tripPrice - totalProfit);
        }
    }
}
