package ExamMarch2020;

import java.util.Scanner;

public class TournamentOfChristmas_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        int totalWins = 0;
        int totalLose = 0;
        double totalMoney = 0;
        for (int i = 1; i <= days; i++) {

            String command = scanner.nextLine();
            double money = 0;
            int wins = 0;
            int lose = 0;
            while (!command.equals("Finish")) {
                String sport = command;
                String result = scanner.nextLine();

                if (result.equals("win")){
                    money += 20;
                    wins++;
                    totalWins += wins;
                }else if (result.equals("lose")){
                    lose++;
                    totalLose += lose;
                }

                command = scanner.nextLine();
            }
            if (wins > lose){
                money += money * 0.1;
            }
            totalMoney += money;
        }
        if (totalWins > totalLose){
            totalMoney += totalMoney * 0.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);
        }else{
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
        }
    }
}
