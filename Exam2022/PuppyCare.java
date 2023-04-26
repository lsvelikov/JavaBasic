package Exam2022;

import java.util.Scanner;

public class PuppyCare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodInKg = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int foodInGr = foodInKg * 1000;
        int totalFoodInGrams = 0;
        while (!command.equals("Adopted")){
            int foodInGrams = Integer.parseInt(command);

            totalFoodInGrams = totalFoodInGrams + foodInGrams;

            command = scanner.nextLine();
        }
        if (foodInGr >= totalFoodInGrams){
            System.out.printf("Food is enough! Leftovers: %d grams.", foodInGr - totalFoodInGrams);
        }else{
            System.out.printf("Food is not enough. You need %d grams more.", totalFoodInGrams - foodInGr);
        }
    }
}
