package ExamJune2019;

import java.util.Scanner;

public class MovieDestination_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double priceForDay = 0;
        switch (destination){
            case "Dubai":
                if (season.equals("Winter")){
                    priceForDay = 45000 - (45000 * 0.3);
                }else if (season.equals("Summer")){
                    priceForDay = 40000 - (40000 * 0.3);
                }
                break;
            case "Sofia":
                if (season.equals("Winter")){
                    priceForDay = 17000 + (17000 * 0.25);
                }else if (season.equals("Summer")){
                    priceForDay = 12500 + (12500 * 0.25);
                }
                break;
            case "London":
                if (season.equals("Winter")){
                    priceForDay = 24000;
                }else if (season.equals("Summer")){
                    priceForDay = 20250;
                }
                break;
        }
        double totalPrice = priceForDay * days;
        if (budget >= totalPrice){
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - totalPrice);
        }else{
            System.out.printf("The director needs %.2f leva more!", totalPrice - budget);
        }
    }
}
