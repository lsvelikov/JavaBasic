package ExamMai2019;

import java.util.Scanner;

public class FruitMarket_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananasKg = Double.parseDouble(scanner.nextLine());
        double orangeKg = Double.parseDouble(scanner.nextLine());
        double raspberryKg = Double.parseDouble(scanner.nextLine());
        double strawberryKg = Double.parseDouble(scanner.nextLine());

        double raspberryPrice = strawberryPrice * 0.5;
        double orangePrice = raspberryPrice * 0.6;
        double bananasPrice = raspberryPrice * 0.2;
        double strawberryPriceKg = strawberryPrice * strawberryKg;
        double raspberryTotalPrice = raspberryPrice * raspberryKg;
        double orangeTotalPrice = orangePrice * orangeKg;
        double bananasTotalPrice = bananasPrice * bananasKg;

        double totalPrice = raspberryTotalPrice + orangeTotalPrice + bananasTotalPrice + strawberryPriceKg;

        System.out.printf("%.2f", totalPrice);

    }
}
