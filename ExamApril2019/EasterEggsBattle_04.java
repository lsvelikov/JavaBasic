package ExamApril2019;

import java.util.Scanner;

public class EasterEggsBattle_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsFirstPlayer = Integer.parseInt(scanner.nextLine());
        int eggsSecondPlayer = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        boolean firstHasWon = false;
        boolean secondHasWon = false;
        while (!command.equals("End")){
            String winningPlayer = command;

            if (winningPlayer.equals("one")){
                eggsSecondPlayer--;
            }else if (winningPlayer.equals("two")){
                eggsFirstPlayer--;
            }

            if (eggsFirstPlayer == 0){
                secondHasWon = true;
                break;
            }else if (eggsSecondPlayer == 0){
                firstHasWon = true;
                break;
            }

            command = scanner.nextLine();
        }
        if (firstHasWon){
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.", eggsFirstPlayer);
        }else if (secondHasWon){
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.", eggsSecondPlayer);
        }else {
            System.out.printf("Player one has %d eggs left.\n" +
                    "Player two has %d eggs left.\n", eggsFirstPlayer, eggsSecondPlayer);
        }
    }
}
