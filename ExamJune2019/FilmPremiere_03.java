package ExamJune2019;

import java.util.Scanner;

public class FilmPremiere_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        String packet = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());

        double ticketPrice = 0;
        double totalPrice = 0;
        switch (movie){
            case "John Wick":
                if (packet.equals("Drink")){
                    ticketPrice = 12;
                }else if (packet.equals("Popcorn")){
                    ticketPrice = 15;
                }else if (packet.equals("Menu")){
                    ticketPrice = 19;
                }
                break;
            case "Star Wars":
                if (packet.equals("Drink")){
                    ticketPrice = 18;
                }else if (packet.equals("Popcorn")){
                    ticketPrice = 25;
                }else if (packet.equals("Menu")){
                    ticketPrice = 30;
                }
                if (tickets >= 4){
                    ticketPrice = ticketPrice - (ticketPrice * 0.3);
                }
                break;
            case "Jumanji":
                if (packet.equals("Drink")){
                    ticketPrice = 9;
                }else if (packet.equals("Popcorn")){
                    ticketPrice = 11;
                }else if (packet.equals("Menu")){
                    ticketPrice = 14;
                }
                if (tickets == 2){
                    ticketPrice = ticketPrice - (ticketPrice * 0.15);
                }
                break;
        }
        totalPrice = tickets * ticketPrice;
        System.out.printf("Your bill is %.2f leva.", totalPrice);
    }
}
