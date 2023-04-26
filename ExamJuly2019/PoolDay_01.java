package ExamJuly2019;

import java.util.Scanner;

public class PoolDay_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double entrancePrice = Double.parseDouble(scanner.nextLine());
        double loungePrice = Double.parseDouble(scanner.nextLine());
        double umbrellaPrice = Double.parseDouble(scanner.nextLine());

        double totalEntrancePrice = people * entrancePrice;
        double totalLoungePrice = Math.ceil(people * 0.75) * loungePrice;
        double totalUmbrellaPrice = Math.ceil(people * 0.5) * umbrellaPrice;

        double totalPrice = totalEntrancePrice + totalLoungePrice + totalUmbrellaPrice;

        System.out.printf("%.2f lv.", totalPrice);
    }
}
