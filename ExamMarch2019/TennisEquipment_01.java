package ExamMarch2019;

import java.util.Scanner;

public class TennisEquipment_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double racketPrice = Double.parseDouble(scanner.nextLine());
        int racketsCount = Integer.parseInt(scanner.nextLine());
        int shoes = Integer.parseInt(scanner.nextLine());

        double totalRacketPrice = racketsCount * racketPrice;
        double shoesPrice = racketPrice / 6;
        double totalShoesPrice = shoesPrice * shoes;
        double equipment = (totalRacketPrice + totalShoesPrice) * 0.2;
        double totalPrice = totalRacketPrice + totalShoesPrice + equipment;

        System.out.printf("Price to be paid by Djokovic %.0f%n", Math.floor(totalPrice / 8));
        System.out.printf("Price to be paid by sponsors %.0f", Math.ceil((totalPrice * 7) / 8));
    }
}
