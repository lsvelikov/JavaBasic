package ExamMarch2019;

import java.util.Scanner;

public class BasketballTournament_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int homeWin = 0;
        int homeLoose = 0;
        int totalGames = 0;
        while (!command.equals("End of tournaments")){
            String tournamentName = command;
            int games = Integer.parseInt(scanner.nextLine());
            totalGames += games;

            int result = 0;
            for (int i = 1; i <= games; i++){
                int homePoints = Integer.parseInt(scanner.nextLine());
                int visitorPoints = Integer.parseInt(scanner.nextLine());

                if (homePoints > visitorPoints){
                    homeWin++;
                    result = homePoints - visitorPoints;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", i, tournamentName, result);
                }else if (homePoints < visitorPoints){
                    homeLoose++;
                    result = visitorPoints - homePoints;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", i, tournamentName, result);
                }
            }

            command = scanner.nextLine();
        }
        System.out.printf("%.2f%% matches win%n", homeWin * 1.0 / totalGames * 100);
        System.out.printf("%.2f%% matches lost%n", homeLoose * 1.0 / totalGames * 100);
    }
}
