package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class CarToGo_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        •	Първи ред – Бюджет – реално число в интервала [10.00...10000.00]
//•	Втори ред –  Сезон – текст "Summer" или "Winter"
//•

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String classType = "";
        String carType = "";
        double rentPrice = 0;


        switch (season){
            case "Summer":
                if (budget <= 100){
                    classType = "Economy class";
                    carType = "Cabrio";
                    rentPrice = budget * 0.35;
                }else if (budget <= 500){
                    classType = "Compact class";
                    carType = "Cabrio";
                    rentPrice = budget * 0.45;
                }else if (budget > 500){
                    classType = "Luxury class";
                    carType = "Jeep";
                    rentPrice = budget * 0.9;
                }
                break;
            case "Winter":
                if (budget <= 100){
                    classType = "Economy class";
                    carType = "Jeep";
                    rentPrice = budget * 0.65;
                }else if (budget <= 500){
                    classType = "Compact class";
                    carType = "Jeep";
                    rentPrice = budget * 0.80;
                }else if (budget > 500){
                    classType = "Luxury class";
                    carType = "Jeep";
                    rentPrice = budget * 0.9;
                }
                break;
        }
        System.out.printf("%s%n", classType);
        System.out.printf("%s - %.2f", carType, rentPrice);
    }
}
