package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class FishBoat_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermanCount = Integer.parseInt(scanner.nextLine());

        double shipRent = 0;
        switch (season){
            case "Spring":
                shipRent = 3000;
                break;
            case "Summer":
                shipRent = 4200;
                break;
            case "Autumn":
                shipRent = 4200;
                break;
            case "Winter":
                shipRent = 2600;
                break;
        }
        if (fishermanCount <= 6){
            shipRent = shipRent - (shipRent * 0.1);
        }else if (fishermanCount <= 11){
            shipRent = shipRent - (shipRent * 0.15);
        }else{
            shipRent = shipRent - (shipRent * 0.25);
        }

        if (fishermanCount % 2 == 0 && !season.equals("Autumn")){
            shipRent = shipRent - (shipRent * 0.05);
        }
        if (budget >= shipRent){
            System.out.printf("Yes! You have %.2f leva left.", budget - shipRent);
        }else{
            System.out.printf("Not enough money! You need %.2f leva.", shipRent - budget);
        }
    }
}

