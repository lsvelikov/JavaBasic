package ExamJuly2019;

import java.util.Scanner;

public class FootballTournament_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int games = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int won = 0;
        int draw = 0;
        int lost = 0;
        int totalPoints = 0;
        for (int i = 1; i <= games; i++) {
            String result = scanner.nextLine();

            switch (result){
                case "W":
                    won++;
                    points = 3;
                    break;
                case "D":
                    draw++;
                    points = 1;
                    break;
                case "L":
                    lost++;
                    points = 0;
                    break;
            }
            totalPoints += points;
        }
        if (games == 0){
            System.out.printf("%s hasn't played any games during this season.", name);
        }else{
            System.out.printf("%s has won %d points during this season.%n", name, totalPoints);
            System.out.printf("Total stats: \n" +
                    "## W: %d\n" +
                    "## D: %d\n" +
                    "## L: %d\n" +
                    "Win rate: %.2f%%", won, draw, lost, won * 1.0 / games * 100);
        }
    }
}
