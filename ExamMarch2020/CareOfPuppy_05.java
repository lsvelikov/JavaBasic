package ExamMarch2020;

import java.util.Scanner;

public class CareOfPuppy_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodInKg = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int totalFood = 0;
        while (!command.equals("Adopted")){
            int foodInGram = Integer.parseInt(command);

            totalFood += foodInGram;

            command = scanner.nextLine();
        }
        if (totalFood > foodInKg * 1000){
            System.out.printf("Food is not enough. You need %d grams more.", totalFood - foodInKg * 1000);
        }else{
            System.out.printf("Food is enough! Leftovers: %d grams.", foodInKg * 1000 - totalFood);
        }
    }
}
