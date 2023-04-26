package ExamApril2019;

import java.util.Scanner;

public class EasterShop_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsQuantity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int eggsSold = 0;
        boolean notEnough = false;
        while (!command.equals("Close")){
            String typeOrder = command;
            int eggsOrder = Integer.parseInt(scanner.nextLine());

            if (typeOrder.equals("Buy")){
                if (eggsOrder > eggsQuantity){
                    notEnough = true;
                    break;
                }
                eggsQuantity -= eggsOrder;
                eggsSold += eggsOrder;
            }else if (typeOrder.equals("Fill")){
                eggsQuantity += eggsOrder;
            }


            command = scanner.nextLine();
        }
        if (notEnough){
            System.out.printf("Not enough eggs in store!\n" +
                    "You can buy only %d.\n", eggsQuantity);
        }else{
            System.out.printf("Store is closed!\n" +
                    "%d eggs sold.\n", eggsSold);
        }
    }
}
