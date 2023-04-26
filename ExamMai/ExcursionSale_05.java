package ExamMai;

import java.util.Scanner;

public class ExcursionSale_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seaPackets = Integer.parseInt(scanner.nextLine());
        int mountainPackets = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        double profit = 0;
        double price = 0;
        while (!command.equals("Stop")) {
            String excursion = command;

            if (excursion.equals("sea")) {
                if (seaPackets == 0){
                    command = scanner.nextLine();
                    continue;
                }
                seaPackets = seaPackets - 1;
                price = 680;
                profit = profit + price;

            } else if (excursion.equals("mountain")) {
                if (mountainPackets == 0){
                    command = scanner.nextLine();
                    continue;
                }
                mountainPackets = mountainPackets - 1;
                price = 499;
                profit = profit + price;

            }
            if (seaPackets == 0 && mountainPackets == 0){
                break;
            }
            command = scanner.nextLine();
        }
        if (seaPackets == 0 && mountainPackets == 0){
            System.out.printf("Good job! Everything is sold.%n");
            System.out.printf("Profit: %.0f leva.", profit);
        }else{
            System.out.printf("Profit: %.0f leva.", profit);
        }
    }
}
