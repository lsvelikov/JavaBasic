package ForLoopMoreExercises;

import java.util.Scanner;

public class EqualPairs_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int sumPair = number1 + number2;
        int maxDiff = sumPair - (number1 + number2);

        for (int i = 2; i <= n; i++){
            number1 = Integer.parseInt(scanner.nextLine());
            number2 = Integer.parseInt(scanner.nextLine());

            if (sumPair != (number1 + number2)){
                maxDiff = Math.abs(sumPair - (number1 + number2));
            }
            sumPair = number1 + number2;
        }
        if (maxDiff == 0){
            System.out.printf("Yes, value=%d", sumPair);
        }else{
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}