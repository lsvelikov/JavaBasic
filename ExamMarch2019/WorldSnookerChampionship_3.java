package ExamMarch2019;

import java.util.Scanner;

public class WorldSnookerChampionship_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String stage = scanner.nextLine();
        String ticketType = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());
        String trophy = scanner.nextLine();

        double ticketPrice = 0;
        switch (stage){
            case "Final":
                if (ticketType.equals("Standard")){
                    ticketPrice = 110.10;
                }else if (ticketType.equals("Premium")){
                    ticketPrice = 160.66;
                }else if (ticketType.equals("VIP")){
                    ticketPrice = 400;
                }
                break;
            case "Semi final":
                if (ticketType.equals("Standard")){
                    ticketPrice = 75.88;
                }else if (ticketType.equals("Premium")){
                    ticketPrice = 125.22;
                }else if (ticketType.equals("VIP")){
                    ticketPrice = 300.40;
                }
                break;
            case "Quarter final":
                if (ticketType.equals("Standard")){
                    ticketPrice = 55.50;
                }else if (ticketType.equals("Premium")){
                    ticketPrice = 105.20;
                }else if (ticketType.equals("VIP")){
                    ticketPrice = 118.90;
                }
                break;
        }
        double totalPrice = tickets * ticketPrice;
        if (totalPrice > 4000){
            totalPrice = totalPrice * 0.75;
        }else if (totalPrice > 2500 && totalPrice <= 4000){
            totalPrice = totalPrice * 0.9;
            if (trophy.equals("Y")){
                totalPrice = totalPrice + (tickets * 40);
            }
        }else{
            if (trophy.equals("Y")){
                totalPrice = totalPrice + ( tickets * 40);
            }
        }
        System.out.printf("%.2f", totalPrice);
    }
}
