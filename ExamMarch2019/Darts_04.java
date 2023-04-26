package ExamMarch2019;

import java.util.Scanner;

public class Darts_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String command = scanner.nextLine();

        int totalPoints = 301;
        int shootPoints = 0;
        int shootsCounter = 0;
        int unsuccessfulShootsCounter = 0;
        boolean hasWon = false;
        while (!command.equals("Retire")) {
            String sector = command;
            int points = Integer.parseInt(scanner.nextLine());

            switch (sector) {
                case "Single":
                    shootPoints = points;
                    break;
                case "Double":
                    shootPoints = points * 2;
                    break;
                case "Triple":
                    shootPoints = points * 3;
                    break;
            }

            if (totalPoints - shootPoints < 0) {
                unsuccessfulShootsCounter++;
                command = scanner.nextLine();
                continue;
            } else {
                totalPoints -= shootPoints;
                shootsCounter++;
            }
            if (totalPoints == 0) {
                hasWon = true;
                break;
            }

            command = scanner.nextLine();
        }
        if (hasWon) {
            System.out.printf("%s won the leg with %d shots.", name, shootsCounter);
        } else {
            System.out.printf("%s retired after %d unsuccessful shots.", name, unsuccessfulShootsCounter);
        }
    }
}
