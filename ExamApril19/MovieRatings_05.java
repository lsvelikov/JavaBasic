package ExamApril19;

import java.util.Scanner;

public class MovieRatings_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int movies = Integer.parseInt(scanner.nextLine());
        String movieName = scanner.nextLine();

        double maxRating = Double.MIN_VALUE;
        double minRating = Double.MAX_VALUE;
        double averageRating = 0;
        double totalRating = 0;
        int movieCount = 0;
        String maxRatingMovie = "";
        String minRatingMovie = "";
        for (int i = 1; i <= movies; i++){
            String movie = movieName;
            movieCount++;
            double rating = Double.parseDouble(scanner.nextLine());
            totalRating = totalRating + rating;

            if (rating > maxRating){
                maxRating = rating;
                maxRatingMovie = movie;
            }else if (rating < minRating){
                minRating = rating;
                minRatingMovie = movie;
            }
            averageRating = totalRating / movies;

            if (movieCount == movies){
                break;
            }
            movieName = scanner.nextLine();

        }
        System.out.printf("%s is with highest rating: %.1f%n", maxRatingMovie, maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n", minRatingMovie, minRating);
        System.out.printf("Average rating: %.1f", averageRating);
    }
}
