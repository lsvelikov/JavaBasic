package ForLoopMoreExercises;

import java.util.Scanner;

public class BackToThePast_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inheritedMoney = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());

        int age = 18;
        double totalMoney = inheritedMoney;
        for (int i = 1800; i <= year; i++) {

            if (i % 2 == 0) {
                totalMoney = totalMoney - 12000;
                age++;
            } else {
                double spendMoney = 12000 + age * 50;
                totalMoney = totalMoney - spendMoney;
                age++;
            }
        }
        if (totalMoney < 0) {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(totalMoney));
        } else {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", totalMoney);
        }
    }
}
