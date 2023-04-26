package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Cinema_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double income = 0;
        double seats = rows * columns;

        if (projection.equals("Premiere")){
            income = seats * 12;
            System.out.printf("%.2f leva", income);
        }else if (projection.equals("Normal")){
            income = seats * 7.5;
            System.out.printf("%.2f leva", income);
        }else if (projection.equals("Discount")){
            income = seats * 5;
            System.out.printf("%.2f leva", income);
        }
    }
}
