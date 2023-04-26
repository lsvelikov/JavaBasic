package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class HotelRoom_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0;
        double apartmentPrice = 0;
        double totalStudioPrice = 0;

        double totalApartmentPrice = 0;

        switch (month){
            case "May": case "October":
                studioPrice = 50;
                apartmentPrice = 65;
                if ((nights > 7) && (nights <= 14)){
                    studioPrice = studioPrice - (studioPrice * 0.05);
                }else if (nights > 14) {
                    studioPrice = studioPrice - (studioPrice * 0.3);
                    apartmentPrice = apartmentPrice - (apartmentPrice * 0.1);
                }
                totalStudioPrice = studioPrice * nights;
                totalApartmentPrice = apartmentPrice * nights;
                break;
            case "June": case "September":
                studioPrice = 75.20;
                apartmentPrice = 68.70;
                if (nights > 14){
                    studioPrice = studioPrice - (studioPrice * 0.2);
                    apartmentPrice = apartmentPrice - (apartmentPrice * 0.1);
                }
                totalStudioPrice = studioPrice * nights;
                totalApartmentPrice = apartmentPrice * nights;
                break;
            case "July": case "August":
                studioPrice = 76;
                apartmentPrice = 77;
                if (nights > 14){
                    apartmentPrice = apartmentPrice - (apartmentPrice * 0.1);
                }
                totalStudioPrice = studioPrice * nights;
                totalApartmentPrice = apartmentPrice * nights;
                break;
        }
        System.out.printf("Apartment: %.2f lv.%n", totalApartmentPrice);
        System.out.printf("Studio: %.2f lv.", totalStudioPrice);
   }
}
