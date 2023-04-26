package ExamJuly2019;

import java.util.Scanner;

public class TravelAgency_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        String packet = scanner.nextLine();
        String discount = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double price = 0;
        switch (town){
            case "Bansko":
            case "Borovets":
                if (packet.equals("noEquipment")){
                  if (discount.equals("yes")){
                      price = 80 - (80 * 0.05);
                  }else if(discount.equals("no")){
                      price = 80;
                  }
                }else if (packet.equals("withEquipment")){
                    if (discount.equals("yes")){
                        price = 100 - (100 * 0.1);
                    }else if (discount.equals("no")){
                        price = 100;
                    }
                }
                break;
            case "Varna":
            case "Burgas":
                if (packet.equals("withBreakfast")){
                    if (discount.equals("yes")){
                        price = 130 - (130 * 0.12);
                    }else if (discount.equals("no")){
                        price = 130;
                    }
                }else if (packet.equals("noBreakfast")){
                    if (discount.equals("yes")){
                        price = 100 - (100 * 0.07);
                    }else if (discount.equals("no")){
                        price = 100;
                    }
                }
                break;
        }
        if (days > 7){
            days -= 1;
        }
        boolean isValidPacket = packet.equals("noBreakfast") || packet.equals("withBreakfast") || packet.equals("noEquipment") || packet.equals("withEquipment");
        boolean isValid = town.equals("Varna") || town.equals("Burgas") || town.equals("Borovets") || town.equals("Bansko");
        double totalPrice = days * price;
        if (days < 1){
            System.out.println("Days must be positive number!");
        }else if (!isValidPacket || !isValid){
            System.out.println("Invalid input!");
        }else{
            System.out.printf("The price is %.2flv! Have a nice time!", totalPrice);
        }
    }
}
