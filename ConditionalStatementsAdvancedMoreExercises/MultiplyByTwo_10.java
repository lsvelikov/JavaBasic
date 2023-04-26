package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class MultiplyByTwo_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number;

        for (int i = 1; i > 0; i++) {
            number = Double.parseDouble(scanner.nextLine());

            if (number >= 0) {
                System.out.printf("Result: %.2f%n", number * 2);
            }else{
                System.out.println("Negative number!");
                break;
            }
        }
    }
}


