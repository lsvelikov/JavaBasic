package ExamMai;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CourierExpress_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double parcelInKg = Double.parseDouble(scanner.nextLine());
        String parcelType = scanner.nextLine();
        int distanceInKm = Integer.parseInt(scanner.nextLine());

        double parcelPrice = 0;
        double transportPrice = 0;
        double surPlusParcelPrice = 0;
        double surPlusParcelPricePerKm = 0;
        double totalSurPlusCharge = 0;
        double totalPrice = 0;
        if (parcelType.equals("standard")) {
            if (parcelInKg < 1) {
                parcelPrice = 0.03;
            } else if (parcelInKg >= 1 && parcelInKg < 10) {
                parcelPrice = 0.05;
            } else if (parcelInKg >= 10 && parcelInKg < 40) {
                parcelPrice = 0.10;
            } else if (parcelInKg >= 40 && parcelInKg < 90) {
                parcelPrice = 0.15;
            } else if (parcelInKg >= 90 && parcelInKg < 150) {
                parcelPrice = 0.20;
            }
            transportPrice = distanceInKm * parcelPrice;
            System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", parcelInKg, transportPrice);
        } else if (parcelType.equals("express")) {
            if (parcelInKg < 1) {
                parcelPrice = 0.03;
                surPlusParcelPrice = parcelPrice * 0.8;
            } else if (parcelInKg >= 1 && parcelInKg < 10) {
                parcelPrice = 0.05;
                surPlusParcelPrice = parcelPrice * 0.4;
            }else if (parcelInKg >= 10 && parcelInKg < 40) {
                parcelPrice = 0.10;
                surPlusParcelPrice = parcelPrice * 0.05;
            } else if (parcelInKg >= 40 && parcelInKg < 90) {
                parcelPrice = 0.15;
                surPlusParcelPrice = parcelPrice * 0.02;
            } else if (parcelInKg >= 90 && parcelInKg < 150) {
                parcelPrice = 0.20;
                surPlusParcelPrice = parcelPrice * 0.01;
            }
            transportPrice = distanceInKm * parcelPrice;
            surPlusParcelPricePerKm = parcelInKg * surPlusParcelPrice;
            totalSurPlusCharge = distanceInKm * surPlusParcelPricePerKm;
            totalPrice = transportPrice + totalSurPlusCharge;
            System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", parcelInKg, totalPrice);
        }
    }
}
