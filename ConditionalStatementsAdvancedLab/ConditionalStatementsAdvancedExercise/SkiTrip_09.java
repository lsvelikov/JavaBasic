package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class SkiTrip_09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String comment = scanner.nextLine();

        int roomPrice = 18;
        int apartmentPrice = 25;
        int presidentApartmentPrice = 35;
        int nights = days - 1;

        double totalPrice = 0;

        if (roomType.equals("room for one person")) {
            totalPrice = nights * roomPrice;
        } else if (roomType.equals("apartment")) {
            totalPrice = nights * apartmentPrice;
            if (days < 10) {
                totalPrice = totalPrice - (totalPrice * 0.3);
            } else if (days < 15) {
                totalPrice = totalPrice - (totalPrice * 0.35);
            }else{
                totalPrice = totalPrice - (totalPrice * 0.5);
            }
        }else if (roomType.equals("president apartment")){
            totalPrice = nights * presidentApartmentPrice;
            if (days < 10){
                totalPrice = totalPrice - (totalPrice * 0.1);
            }else if (days < 15){
                totalPrice = totalPrice - (totalPrice * 0.15);
            }else{
                totalPrice = totalPrice - (totalPrice * 0.2);
            }
        }
        if (comment.equals("positive")){
            totalPrice = totalPrice + (totalPrice * 0.25);
        }else if (comment.equals("negative")){
            totalPrice = totalPrice - (totalPrice * 0.1);
        }
        System.out.printf("%.2f", totalPrice);
    }
}
