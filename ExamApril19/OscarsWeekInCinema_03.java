package ExamApril19;

import java.util.Scanner;

public class OscarsWeekInCinema_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        String typeOfSaloon = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());

        double ticketPrice = 0;
        switch (typeOfSaloon){
            case "normal":
                if (movie.equals("A Star Is Born")){
                    ticketPrice = 7.5;
                }else if (movie.equals("Bohemian Rhapsody")){
                    ticketPrice = 7.35;
                }else if (movie.equals("Green Book")){
                    ticketPrice = 8.15;
                }else if (movie.equals("The Favourite")){
                    ticketPrice = 8.75;
                }
                break;
            case "luxury":
                if (movie.equals("A Star Is Born")){
                    ticketPrice = 10.5;
                }else if (movie.equals("Bohemian Rhapsody")){
                    ticketPrice = 9.45;
                }else if (movie.equals("Green Book")){
                    ticketPrice = 10.25;
                }else if (movie.equals("The Favourite")){
                    ticketPrice = 11.55;
                }
                break;
            case "ultra luxury":
                if (movie.equals("A Star Is Born")){
                    ticketPrice = 13.5;
                }else if (movie.equals("Bohemian Rhapsody")){
                    ticketPrice = 12.75;
                }else if (movie.equals("Green Book")){
                    ticketPrice = 13.25;
                }else if (movie.equals("The Favourite")){
                    ticketPrice = 13.95;
                }
                break;
        }
        System.out.printf("%s -> %.2f lv.", movie,tickets * ticketPrice);
    }
}
