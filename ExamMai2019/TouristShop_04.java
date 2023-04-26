package ExamMai2019;

import java.util.Scanner;

public class TouristShop_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();

        double totalPrice = 0;
        boolean notEnough = false;
        int productCount = 0;
        while (!command.equals("Stop")){
            String productName = command;
            double productPrice = Double.parseDouble(scanner.nextLine());
            productCount++;

            if (productCount % 3 == 0){
                productPrice = productPrice * 0.5;
            }

            if (productPrice > budget){
                notEnough = true;
                budget -= productPrice;
                break;
            }
            totalPrice = totalPrice + productPrice;
            budget = budget - productPrice;

            command = scanner.nextLine();
        }
        if (notEnough){
            System.out.printf("You don't have enough money!\n" +
                    "You need %.2f leva!\n", Math.abs(budget));
        }else{
            System.out.printf("You bought %d products for %.2f leva.", productCount, totalPrice);
        }
    }
}