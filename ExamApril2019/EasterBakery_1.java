package ExamApril2019;

import java.util.Scanner;

public class EasterBakery_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double flourPrice = Double.parseDouble(scanner.nextLine());
        double flourKg = Double.parseDouble(scanner.nextLine());
        double sugarKg = Double.parseDouble(scanner.nextLine());
        int eggsCartons = Integer.parseInt(scanner.nextLine());
        int yeastPackets = Integer.parseInt(scanner.nextLine());

        double sugarPrice = flourPrice * 0.75;
        double eggsPrice = flourPrice * 1.1;
        double yeastPrice = sugarPrice * 0.2;
        double totalFlourPrice = flourPrice * flourKg;
        double totalSugarPrice = sugarPrice * sugarKg;
        double totalEggsPrice = eggsPrice * eggsCartons;
        double totalYeastPrice = yeastPrice * yeastPackets;

        double totalPrice = totalFlourPrice + totalSugarPrice + totalEggsPrice + totalYeastPrice;

        System.out.printf("%.2f", totalPrice);
    }
}
