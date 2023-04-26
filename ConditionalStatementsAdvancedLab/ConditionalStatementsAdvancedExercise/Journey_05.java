package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Journey_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String place = "";

        if (budget <= 100){
            destination = "Bulgaria";
            if (season.equals("summer")){
                place = "Camp";
                budget = budget * 0.3;
            }else if (season.equals("winter")){
                place = "Hotel";
                budget = budget * 0.7;
            }
        }else if (budget > 1000){
            destination = "Europe";
            place = "Hotel";
            budget = budget * 0.9;
        }else{
            destination = "Balkans";
            if (season.equals("summer")){
                place = "Camp";
                budget = budget * 0.4;
            }else if (season.equals("winter")){
                place = "Hotel";
                budget = budget * 0.8;
            }
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", place, budget);
    }
}
