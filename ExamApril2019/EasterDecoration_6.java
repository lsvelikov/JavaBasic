package ExamApril2019;

import java.util.Scanner;

public class EasterDecoration_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int clients = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        for (int i = 1; i <= clients; i++) {
            String command = scanner.nextLine();

            double totalPrice = 0;
            double price = 0;
            int productCount = 0;
            while (!command.equals("Finish")){
                String product = command;
                productCount++;

                switch (product){
                    case "basket":
                        price = 1.50;
                        break;
                    case "wreath":
                        price = 3.80;
                        break;
                    case "chocolate bunny":
                        price = 7;
                        break;
                }
                totalPrice += price;

                command = scanner.nextLine();
            }
            if (productCount % 2 == 0){
                totalPrice *= 0.8;
            }
            System.out.printf("You purchased %d items for %.2f leva.%n", productCount, totalPrice);
            sum += totalPrice;
        }
        System.out.printf("Average bill per client is: %.2f leva.", sum / clients);
    }
}
