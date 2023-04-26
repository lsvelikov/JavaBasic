package ExamJune2019;

import java.util.Scanner;

public class FavoriteMovie_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int movieCount = 0;
        int maxSymbol = 0;
        String movieName = "";
        boolean isReached = false;
        while (!command.equals("STOP")){
            String movie = command;
            movieCount++;
            int length = movie.length();

            int sum = 0;
            int totalSum = 0;
            for (int i = 0; i < length; i++) {
                if (movie.charAt(i) >= 65 && movie.charAt(i) <= 90){
                    sum = movie.charAt(i) - length;
                }else if (movie.charAt(i) >= 97 && movie.charAt(i) <= 122){
                    sum = movie.charAt(i) - length * 2;
                }else{
                    sum = movie.charAt(i);
                }
                totalSum = totalSum + sum;
            }
            if (totalSum > maxSymbol){
                maxSymbol = totalSum;
                movieName = movie;
            }
            if (movieCount == 7){
                isReached = true;
                break;
            }

            command = scanner.nextLine();
        }
        if (isReached){
            System.out.println("The limit is reached.");
            System.out.printf("The best movie for you is %s with %d ASCII sum.", movieName, maxSymbol);
        }else{
            System.out.printf("The best movie for you is %s with %d ASCII sum.", movieName, maxSymbol);
        }
    }
}
