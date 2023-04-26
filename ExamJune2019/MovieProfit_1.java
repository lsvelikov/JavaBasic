package ExamJune2019;

import java.util.Scanner;

public class MovieProfit_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double pricePerDay = tickets * ticketPrice;
        double periodProfit = days * pricePerDay;
        double percentForCinema = periodProfit * percent / 100;
        double profit = periodProfit - percentForCinema;

        System.out.printf("The profit from the movie %s is %.2f lv.", movieName, profit);
    }
}
