package ExamJuly2020;

import java.util.Scanner;

public class AgencyProfit_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String companyName = scanner.nextLine();
        int adultsTicket = Integer.parseInt(scanner.nextLine());
        int kidsTicket = Integer.parseInt(scanner.nextLine());
        double adultTicketPrice = Double.parseDouble(scanner.nextLine());
        double serviceTax = Double.parseDouble(scanner.nextLine());

        double kidTicketPrice = adultTicketPrice * 0.3;
        double adultsTotalPrice = adultTicketPrice + serviceTax;
        double kidTotalPrice = kidTicketPrice + serviceTax;
        double profit = (adultsTotalPrice * adultsTicket) + (kidTotalPrice * kidsTicket);
        double companyProfit = profit * 0.2;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", companyName, companyProfit);
    }
}
