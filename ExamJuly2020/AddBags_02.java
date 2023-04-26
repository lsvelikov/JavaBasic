package ExamJuly2020;

import java.util.Scanner;

public class AddBags_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double baggagePrice = Double.parseDouble(scanner.nextLine());
        double baggageInKg = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int baggageCount = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (baggageInKg < 10){
            price = baggagePrice * 0.2;
        }else if (baggageInKg <= 20){
            price = baggagePrice * 0.5;
        }else{
            price = baggagePrice;
        }

        if (days < 7){
            price = price + (price * 0.4);
        }else if (days <= 30){
            price = price + (price * 0.15);
        }else{
            price = price + (price * 0.1);
        }
        double totalPrice = price * baggageCount;
        System.out.printf("The total price of bags is: %.2f lv.", totalPrice);
    }
}
