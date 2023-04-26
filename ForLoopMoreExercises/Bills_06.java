package ForLoopMoreExercises;

import java.util.Scanner;

public class Bills_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int month = Integer.parseInt(scanner.nextLine());

        int water = 20;
        int internet = 15;
        double sumElectricity = 0;
        double other = 0;
        double allOther = 0;

        for (int i = 1; i <= month; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());
            sumElectricity = sumElectricity + electricity;
            other = (sumElectricity + (water * month) + (internet * month));
            allOther = other + (other * 0.2);

        }
        System.out.printf("Electricity: %.2f lv%n", sumElectricity);
        System.out.printf("Water: %.2f lv%n", month * 1.0 * water);
        System.out.printf("Internet: %.2f lv%n", month * 1.0 * internet);
        System.out.printf("Other: %.2f lv%n", allOther);
        System.out.printf("Average: %.2f lv", (sumElectricity + (month * water) + (month * internet) + allOther) / month);

    }
}
