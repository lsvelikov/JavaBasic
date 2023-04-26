package ExamApril2019;

import java.util.Scanner;

public class EasterCompetition_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterCakes = Integer.parseInt(scanner.nextLine());

        String winner = "";
        int winnerPoints = 0;
        boolean isFirst = false;
        int maxPoints = 0;
        for (int i = 1; i <= easterCakes; i++) {
            String name = scanner.nextLine();
            String command = scanner.nextLine();

            int totalPoints = 0;
            boolean isWinner = false;
            String winnerName = "";
            while (!command.equals("Stop")){
                int points = Integer.parseInt(command);

                totalPoints += points;
                if (totalPoints > maxPoints){
                    maxPoints = totalPoints;
                    winnerName = name;
                    winner = name;
                    winnerPoints = totalPoints;
                    isFirst = true;
                    isWinner = true;
                }

                command = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", name, totalPoints);
            if (isWinner){
                System.out.printf("%s is the new number 1!%n", winnerName);
            }
        }
        if (isFirst){
            System.out.printf("%s won competition with %d points!", winner, winnerPoints);
        }
    }
}
