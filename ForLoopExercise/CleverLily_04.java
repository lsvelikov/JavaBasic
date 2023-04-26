package ForLoopExercise;

import java.util.Scanner;

public class CleverLily_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double laundryMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double totalSum = 0;
        double sum = 0;
        int toysCount = 0;
        int brother = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                sum += 10;
                totalSum += sum;
                brother++;
            } else {
                toysCount++;
            }
        }
        totalSum = totalSum + toysCount * toyPrice - brother;
        if (totalSum >= laundryMachinePrice) {
            System.out.printf("Yes! %.2f", totalSum - laundryMachinePrice);
        }else{
            System.out.printf("No! %.2f", Math.abs(totalSum - laundryMachinePrice));
        }
    }
}
