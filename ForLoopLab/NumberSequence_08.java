package ForLoopLab;

import java.util.Scanner;

public class NumberSequence_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++){
            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (currentNumber > max){
                max = currentNumber;
            }
            if (currentNumber < min){
                min = currentNumber;
            }
        }
        System.out.printf("Max number: %d%n", max);
        System.out.printf("Min number: %d", min);
    }
}
