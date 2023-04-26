package ExamApril19;

import java.util.Scanner;

public class CinemaTickets_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int totalTickets = 0;
        int studentsCount = 0;
        int standardCount = 0;
        int kidsCount = 0;
        while (!input.equals("Finish")){
            String movie = input;
            int freePlaces = Integer.parseInt(scanner.nextLine());
            String command = scanner.nextLine();

            int ticketsCount = 0;

            while (!command.equals("End")){
                String ticketType = command;
                ticketsCount++;
                totalTickets++;

                switch (ticketType){
                    case "student":
                        studentsCount++;
                        break;
                    case "standard":
                        standardCount++;
                        break;
                    case "kid":
                        kidsCount++;
                        break;
                }
                if (ticketsCount == freePlaces){
                    break;
                }
                command = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", input, ticketsCount * 1.0 / freePlaces * 100);

            input = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", studentsCount * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardCount * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", kidsCount * 1.0 / totalTickets * 100);
    }
}
