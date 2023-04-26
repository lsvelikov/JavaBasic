package ForLoopMoreExercises;

import java.util.Scanner;

public class GameOfIntervals_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	Първи ред - колко хода ще има по време на играта – цяло число в интервала [1...100]
//•	За всеки ход – числата, които се проверяват в кой интервал са – цели числа в интервала [-100...100]

        int moves = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        int numberTo9 = 0;
        int numberTo19 = 0;
        int numberTo29 = 0;
        int numberTo39 = 0;
        int numberTo50 = 0;
        int invalidNumber = 0;

        for (int i = 1; i <= moves; i++) {
            double number = Double.parseDouble(scanner.nextLine());

            if (number >= 0 && number <= 9) {
                sum = sum + (number * 0.2);
                numberTo9++;
            } else if (number >= 10 && number <= 19) {
                sum = sum + (number * 0.3);
                numberTo19++;
            } else if (number >= 20 && number <= 29) {
                sum = sum + (number * 0.4);
                numberTo29++;
            } else if (number >= 30 && number <= 39) {
                sum = sum + 50;
                numberTo39++;
            } else if (number >= 40 && number <= 50) {
                sum = sum + 100;
                numberTo50++;
            } else {
                sum = sum / 2;
                invalidNumber++;
            }
        }
        System.out.printf("%.2f%n", sum);
        System.out.printf("From 0 to 9: %.2f%%%n", numberTo9 * 1.0 / moves * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", numberTo19 * 1.0 / moves * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", numberTo29 * 1.0 / moves * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", numberTo39 * 1.0 / moves * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", numberTo50 * 1.0 / moves * 100);
        System.out.printf("Invalid numbers: %.2f%%", invalidNumber * 1.0 / moves * 100);
    }
}
