package ExamMai;

import java.util.Scanner;

public class DeerOfSanta_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOff = Integer.parseInt(scanner.nextLine());
        int foodLeftInKg = Integer.parseInt(scanner.nextLine());
        double foodFirstDeerInKgPerDay = Double.parseDouble(scanner.nextLine());
        double foodSecondDeerInKgPerDay = Double.parseDouble(scanner.nextLine());
        double foodThirdDeerInKgPerDay = Double.parseDouble(scanner.nextLine());


        double neededFoodFirstDeer = foodFirstDeerInKgPerDay * daysOff;
        double neededFoodSecondDeer = foodSecondDeerInKgPerDay * daysOff;
        double neededFoodThirdDeer = foodThirdDeerInKgPerDay * daysOff;

        double totalFoodNeeded = neededFoodFirstDeer + neededFoodSecondDeer + neededFoodThirdDeer;
        double diff = Math.abs(foodLeftInKg - totalFoodNeeded);

        if (totalFoodNeeded > foodLeftInKg){
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(diff));
        }else{
            System.out.printf("%.0f kilos of food left.", Math.floor(diff));
        }
    }
}
