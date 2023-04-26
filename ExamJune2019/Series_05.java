package ExamJune2019;

import java.util.Scanner;

public class Series_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int seriesCount = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;
        double totalBudget = budget;
        for (int i = 1; i <= seriesCount; i++) {
            String seriesName = scanner.nextLine();
            double seriesPrice = Double.parseDouble(scanner.nextLine());

            switch (seriesName) {
                case "Thrones":
                    seriesPrice = seriesPrice - (seriesPrice * 0.5);
                    break;
                case "Lucifer":
                    seriesPrice = seriesPrice - (seriesPrice * 0.4);
                    break;
                case "Protector":
                    seriesPrice = seriesPrice - (seriesPrice * 0.3);
                    break;
                case "TotalDrama":
                    seriesPrice = seriesPrice - (seriesPrice * 0.2);
                    break;
                case "Area":
                    seriesPrice = seriesPrice - (seriesPrice * 0.1);
                    break;
                default:
                    break;
            }
            totalPrice = totalPrice + seriesPrice;
            totalBudget = totalBudget - seriesPrice;

        }
        if (budget >= totalPrice){
            System.out.printf("You bought all the series and left with %.2f lv.", totalBudget);
        }else{
            System.out.printf("You need %.2f lv. more to buy the series!", Math.abs(totalBudget));
        }
    }
}
