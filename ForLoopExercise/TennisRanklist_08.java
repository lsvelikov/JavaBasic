package ForLoopExercise;

import java.util.Scanner;

public class TennisRanklist_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tours = Integer.parseInt(scanner.nextLine());
        int pointsInRanklist = Integer.parseInt(scanner.nextLine());

        double toursWonPercent = 0;
        int winningCounter = 0;
        int averagePoints = 0;
        int totalPoints = pointsInRanklist;
        for (int i = 1; i <= tours; i++){
            String tourPhase = scanner.nextLine();

            switch (tourPhase){
                case "W":
                    totalPoints = totalPoints + 2000;
                    winningCounter++;
                    break;
                case "F":
                    totalPoints = totalPoints + 1200;
                    break;
                case "SF":
                    totalPoints = totalPoints + 720;
                    break;
            }
        }
        averagePoints = (totalPoints - pointsInRanklist) / tours;
        toursWonPercent = winningCounter * 1.0 / tours * 100;
        System.out.printf("Final points: %d%n", totalPoints);
        System.out.printf("Average points: %d%n", averagePoints);
        System.out.printf("%.2f%%", toursWonPercent);
    }
}
