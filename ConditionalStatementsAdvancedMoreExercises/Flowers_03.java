package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class Flowers_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        int flowerCount = chrysanthemums + tulips + roses;
        double chrysanthemumsPrice = 0;
        double rosesPrice = 0;
        double tulipsPrice = 0;
        double arrangement = 2;
        double flowersPrice = 0;
        double totalPrice = 0;

        if (season.equals("Spring")) {
            chrysanthemumsPrice = 2;
            rosesPrice = 4.1;
            tulipsPrice = 2.5;
            flowersPrice = chrysanthemums * chrysanthemumsPrice + roses * rosesPrice + tulips * tulipsPrice;

            if (holiday.equals("Y") && (tulips > 7)){
                flowersPrice = flowersPrice + (flowersPrice * 0.15);
                flowersPrice = flowersPrice - (flowersPrice * 0.05);
            }else if (holiday.equals("N") && (tulips > 7)){
                flowersPrice = flowersPrice - (flowersPrice * 0.05);
            }else if (holiday.equals("Y")){
                flowersPrice = flowersPrice + (flowersPrice * 0.15);
            }else if (holiday.equals("N")){
                flowersPrice = flowersPrice;
            }
            if (flowerCount > 20){
                flowersPrice = flowersPrice - (flowersPrice * 0.2);
            }
            totalPrice = flowersPrice + arrangement;
        }else if (season.equals("Summer")){
            chrysanthemumsPrice = 2;
            rosesPrice = 4.1;
            tulipsPrice = 2.5;
            flowersPrice = chrysanthemums * chrysanthemumsPrice + roses * rosesPrice + tulips * tulipsPrice;

            if (holiday.equals("Y")){
                flowersPrice = flowersPrice + (flowersPrice * 0.15);
            }else if (holiday.equals("N")){
                flowersPrice = flowersPrice;
            }
            if (flowerCount > 20){
                flowersPrice = flowersPrice - (flowersPrice * 0.2);
            }
            totalPrice = flowersPrice + arrangement;
        }else if (season.equals("Autumn")){
            chrysanthemumsPrice = 3.75;
            rosesPrice = 4.5;
            tulipsPrice = 4.15;

            flowersPrice = chrysanthemums * chrysanthemumsPrice + roses * rosesPrice + tulips * tulipsPrice;

            if (holiday.equals("Y")){
                flowersPrice = flowersPrice + (flowersPrice * 0.15);
            }else if (holiday.equals("N")){
                flowersPrice = flowersPrice;
            }
            if (flowerCount > 20){
                flowersPrice = flowersPrice - (flowersPrice * 0.2);
            }
            totalPrice = flowersPrice + arrangement;
        }else if (season.equals("Winter")){
            chrysanthemumsPrice = 3.75;
            rosesPrice = 4.5;
            tulipsPrice = 4.15;

            flowersPrice = chrysanthemums * chrysanthemumsPrice + roses * rosesPrice + tulips * tulipsPrice;

            if (holiday.equals("Y") && (tulips >= 10)){
                flowersPrice = flowersPrice + (flowersPrice * 0.15);
                flowersPrice = flowersPrice - (flowersPrice * 0.1);
            }else if (holiday.equals("N") && (roses >= 10)){
                flowersPrice = flowersPrice - (flowersPrice * 0.1);
            }
            if (holiday.equals("Y")){
                flowersPrice = flowersPrice + (flowersPrice * 0.15);
            }else if (holiday.equals("N")){
                flowersPrice = flowersPrice;
            }
            if (flowerCount > 20){
                flowersPrice = flowersPrice - (flowersPrice * 0.2);
            }
            totalPrice = flowersPrice + arrangement;
        }
        System.out.printf("%.2f", totalPrice);
    }
}
