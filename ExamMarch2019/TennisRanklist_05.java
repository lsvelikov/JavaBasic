package ExamMarch2019;

import java.util.Scanner;

public class TennisRanklist_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournament = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int totalPoints = 0;
        int wins = 0;
        for (int i = 1; i <= tournament ; i++) {
            String stage = scanner.nextLine();

            switch (stage){
                case "W":
                    points = 2000;
                    wins++;
                    break;
                case "F":
                    points = 1200;
                    break;
                case "SF":
                    points = 720;
                    break;
            }
            totalPoints += points;
        }
        System.out.printf("Final points: %d%n", totalPoints + startingPoints);
        System.out.printf("Average points: %d%n", (totalPoints) / tournament);
        System.out.printf("%.2f%%", wins * 1.0 / tournament * 100);
    }
}
