package ExamMarch2019;

import java.util.Scanner;

public class BasketballEquipment_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tax = Integer.parseInt(scanner.nextLine());

        double shoes = tax * 0.6;
        double equipment = shoes * 0.8;
        double ball = equipment / 4;
        double accessory = ball / 5;
        double totalPrice = tax + shoes + equipment + ball + accessory;

        System.out.printf("%.2f", totalPrice);

    }
}
