package ExamMarch2019;

import java.util.Scanner;

public class GameNumberWars_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String namePlayer1 = scanner.nextLine();
        String namePlayer2 = scanner.nextLine();
        String command = scanner.nextLine();

        int result1 = 0;
        int result2 = 0;
        int totalPoints1 = 0;
        int totalPoints2 = 0;
        int card1 = 0;
        int card2 = 0;
        boolean isEqual = false;
        while (!command.equals("End of game")){
            card1 = Integer.parseInt(command);
            card2 = Integer.parseInt(scanner.nextLine());

            if (card1 > card2){
                result1 = card1 - card2;
                totalPoints1 += result1;
            }else if (card2 > card1){
                result2 = card2 - card1;
                totalPoints2 += result2;
            }else{
                card1 = Integer.parseInt(scanner.nextLine());
                card2 = Integer.parseInt(scanner.nextLine());
                isEqual = true;
                break;
            }

            command = scanner.nextLine();
        }
        if (isEqual){
            System.out.println("Number wars!");
            if (card1 > card2){
                System.out.printf("%s is winner with %d points", namePlayer1, totalPoints1);
            }else{
                System.out.printf("%s is winner with %d points", namePlayer2, totalPoints2);
            }
        }else {
            System.out.printf("%s has %d points%n", namePlayer1, totalPoints1);
            System.out.printf("%s has %d points%n", namePlayer2, totalPoints2);
        }
    }
}
