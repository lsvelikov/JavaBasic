package ExamJuly2020;

import java.util.Scanner;

public class AluminumJoinery_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int woodworkCount = Integer.parseInt(scanner.nextLine());
        String typeWoodwork = scanner.nextLine();
        String deliveryType = scanner.nextLine();

        double price = 0;
        if (typeWoodwork.equals("90X130")) {
            price = 110;
            if (woodworkCount > 30 && woodworkCount <= 60){
                price *= 0.95;
            }else if (woodworkCount > 60){
                price *= 0.92;
            }
        }else if (typeWoodwork.equals("100X150")){
            price = 140;
            if (woodworkCount > 40 && woodworkCount <= 80){
                price *= 0.94;
            }else if(woodworkCount > 80){
                price *= 0.9;
            }
        }else if (typeWoodwork.equals("130X180")){
            price = 190;
            if (woodworkCount > 20 && woodworkCount <= 50){
                price *= 0.93;
            }else if(woodworkCount > 50){
                price *= 0.88;
            }
        }else if (typeWoodwork.equals("200X300")){
            price = 250;
            if (woodworkCount > 25 && woodworkCount <= 50){
                price *= 0.91;
            }else if (woodworkCount > 50){
                price *= 0.86;
            }
        }
        double totalPrice = price * woodworkCount;

        if (deliveryType.equals("With delivery")) {
            totalPrice += 60;
        }
        if (woodworkCount > 99){
            totalPrice = totalPrice * 0.96;
        }

        if (woodworkCount < 10) {
            System.out.println("Invalid order");
        } else {
            System.out.printf("%.2f BGN", totalPrice);
        }
    }
}
