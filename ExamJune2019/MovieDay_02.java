package ExamJune2019;

import java.util.Scanner;

public class MovieDay_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int filmingTime = Integer.parseInt(scanner.nextLine());
        int scenes = Integer.parseInt(scanner.nextLine());
        int sceneDuration = Integer.parseInt(scanner.nextLine());

        double preparation = filmingTime * 0.15;
        double sceneFilmingDuration = scenes * sceneDuration;
        double timeNeeded = sceneFilmingDuration + preparation;

        double diff = Math.abs(filmingTime - timeNeeded);
        if (filmingTime >= timeNeeded){
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", diff);
        }else{
            System.out.printf("Time is up! To complete the movie you need %d minutes.", Math.round(diff));
        }
    }
}
