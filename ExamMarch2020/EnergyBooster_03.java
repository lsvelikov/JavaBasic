package ExamMarch2020;

import java.util.Scanner;

public class EnergyBooster_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String setSize = scanner.nextLine();
        int setsCount = Integer.parseInt(scanner.nextLine());

        double price = 0;
        switch (fruit){
            case "Watermelon":
                if (setSize.equals("small")){
                    price = 56;
                }else if (setSize.equals("big")){
                    price = 28.70;
                }
                break;
            case "Mango":
                if (setSize.equals("small")){
                    price = 36.66;
                }else if (setSize.equals("big")){
                    price = 19.60;
                }
                break;
            case "Pineapple":
                if (setSize.equals("small")){
                    price = 42.10;
                }else if (setSize.equals("big")){
                    price = 24.80;
                }
                break;
            case "Raspberry":
                if (setSize.equals("small")){
                    price = 20;
                }else if (setSize.equals("big")){
                    price = 15.20;
                }
                break;
        }
        if (setSize.equals("big")){
            price *= 5;
        }else if (setSize.equals("small")){
            price *= 2;
        }
        double totalPrice = price * setsCount;
        if (totalPrice >= 400 && totalPrice <= 1000){
            totalPrice *= 0.85;
        }else if (totalPrice > 1000){
            totalPrice *= 0.5;
        }
        System.out.printf("%.2f lv.", totalPrice);
    }
}
