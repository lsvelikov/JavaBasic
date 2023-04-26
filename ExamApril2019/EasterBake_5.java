package ExamApril2019;

import java.util.Scanner;

public class EasterBake_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterCakes = Integer.parseInt(scanner.nextLine());

        int maxSugar = 0;
        int maxFlour = 0;
        int totalSugar = 0;
        int totalFlour = 0;
        for (int i = 1; i <= easterCakes; i++) {
            int sugar = Integer.parseInt(scanner.nextLine());
            int flour = Integer.parseInt(scanner.nextLine());

            totalSugar += sugar;
            if (sugar > maxSugar){
                maxSugar = sugar;
            }
            totalFlour += flour;
            if (flour > maxFlour){
                maxFlour = flour;
            }
        }
        System.out.printf("Sugar: %.0f%n", Math.ceil(totalSugar * 1.0 / 950));
        System.out.printf("Flour: %.0f%n", Math.ceil(totalFlour * 1.0 / 750));
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlour, maxSugar);
    }
}
