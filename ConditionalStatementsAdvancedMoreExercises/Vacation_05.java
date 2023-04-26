package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class Vacation_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String placeToStay = "";
        String resort = "";
        double price = 0;

        switch (season){
            case "Summer":
                resort = "Alaska";
                if (budget <= 1000){
                    placeToStay = "Camp";
                    price = budget * 0.65;
                }else if (budget <= 3000){
                    placeToStay = "Hut";
                    price = budget * 0.8;
                }else if (budget > 3000){
                    placeToStay = "Hotel";
                    price = budget * 0.9;
                }
                break;
            case "Winter":
                resort = "Morocco";
                if (budget <= 1000){
                    placeToStay = "Camp";
                    price = budget * 0.45;
                }else if (budget <= 3000){
                    placeToStay = "Hut";
                    price = budget * 0.6;
                }else if (budget > 3000){
                    placeToStay = "Hotel";
                    price = budget * 0.9;
                }
                break;
        }
        System.out.printf("%s - %s - %.2f", resort, placeToStay, price);
    }
}
