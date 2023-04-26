package ExamMarch2020;

import java.util.Scanner;

public class CatWalking_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutes = Integer.parseInt(scanner.nextLine());
        int walkingCount = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        int walkingMinutes = walkingCount * minutes;
        int totalCalories = walkingMinutes * 5;

        if (totalCalories >= calories * 0.5){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", totalCalories);
        }else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", totalCalories);
        }
    }
}
