package ExamMai2019;

import java.util.Scanner;

public class VetParking_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double endSum = 0;

        for (int i = 1; i <= days; i++) {
            double sum = 0;
            double totalSum = 0;
            for (int j = 1; j <= hours; j++) {
                if ((i % 2 == 0) &&(j % 2 != 0)){
                    sum = 2.50;
                }else if ((i % 2 != 0) && (j % 2 == 0)){
                    sum = 1.25;
                }else{
                    sum = 1;
                }
                totalSum += sum;
            }
            System.out.printf("Day: %s - %.2f leva%n", i, totalSum);
            endSum += totalSum;
        }
        System.out.printf("Total: %.2f leva",endSum);
    }
}
