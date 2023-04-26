package ExamMarch2020;

import java.util.Scanner;

public class FoodForPets_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());

        double biscuits = 0;
        int totalDogsFood = 0;
        int totalCatsFood = 0;
        int totalFood = 0;
        for (int i = 1; i <= days; i++) {
            int dogsFood = Integer.parseInt(scanner.nextLine());
            int catsFood = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0){
                biscuits += (dogsFood + catsFood) * 0.1;
            }

            totalDogsFood += dogsFood;
            totalCatsFood += catsFood;
            totalFood = totalDogsFood + totalCatsFood;

        }
        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(biscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", totalFood / food * 100);
        System.out.printf("%.2f%% eaten from the dog.%n", totalDogsFood * 1.0 / totalFood * 100);
        System.out.printf("%.2f%% eaten from the cat.%n", totalCatsFood * 1.0 / totalFood * 100);
    }
}
