package ExamJuly2019;

import java.util.Scanner;

public class CoffeeMachine_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int drinkCount = Integer.parseInt(scanner.nextLine());

        double price = 0;
        switch (drink){
            case "Espresso":
                if (sugar.equals("Without")){
                    price = 0.9 - (0.9 * 0.35);
                }else if (sugar.equals("Normal")){
                    price = 1;
                }else if (sugar.equals("Extra")){
                    price = 1.2;
                }
                if (drinkCount >= 5){
                    price = price - (price * 0.25);
                }
                break;
            case "Cappuccino":
                if (sugar.equals("Without")){
                    price = 1 - (1 * 0.35);
                }else if (sugar.equals("Normal")){
                    price = 1.2;
                }else if (sugar.equals("Extra")){
                    price = 1.6;
                }
                break;
            case "Tea":
                if (sugar.equals("Without")){
                    price = 0.5 - (0.5 * 0.35);
                }else if (sugar.equals("Normal")){
                    price = 0.6;
                }else if (sugar.equals("Extra")){
                    price = 0.7;
                }
                break;
        }
        double totalPrice = price * drinkCount;
        if (totalPrice > 15){
            totalPrice = totalPrice - (totalPrice * 0.2);
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", drinkCount, drink, totalPrice);
    }
}
