package ForLoopMoreExercises;

import java.util.Scanner;

public class OddEvenPosition_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());

        double minEven = 1000000000.0;
        double maxEven = -1000000000.0;
        double minOdd = 1000000000.0;
        double maxOdd = -1000000000.0;
        double sumEven = 0;
        double sumOdd = 0;

        for (int i = 1; i <= n; i++){
            double number = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0){
                sumEven = sumEven + number;

                if (number > maxEven){
                    maxEven = number;
                }
                if (number < minEven){
                    minEven = number;
                }
            }else{
                sumOdd = sumOdd + number;
                if (number > maxOdd){
                    maxOdd = number;
                }
                if (number < minOdd){
                    minOdd = number;
                }
            }
        }
        System.out.printf("OddSum=%.2f,%n", sumOdd);
        if (minOdd == 1000000000.0 ) {
            System.out.printf("OddMin=No,%n");
        } else {
            System.out.printf("OddMin=%.2f,%n", minOdd);
        }
        if (maxOdd == -1000000000.0) {
            System.out.printf("OddMax=No,%n");
        } else {
            System.out.printf("OddMax=%.2f,%n", maxOdd);
        }

        System.out.printf("EvenSum=%.2f,%n", sumEven);
        if (minEven == 1000000000.0 ) {
            System.out.printf("EvenMin=No,%n");
        } else {
            System.out.printf("EvenMin=%.2f,%n", minEven);
        }
        if (maxEven == -1000000000.0) {
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMax=%.2f", maxEven);
        }
    }
}
