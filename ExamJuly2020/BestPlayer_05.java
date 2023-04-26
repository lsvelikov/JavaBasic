package ExamJuly2020;

import java.util.Scanner;

public class BestPlayer_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int maxGoals = 0;
        String bestPlayer = "";
        while (!command.equals("END")){
            String name = command;
            int goals = Integer.parseInt(scanner.nextLine());

            if (goals > maxGoals){
                maxGoals = goals;
                bestPlayer = name;
            }
            if (goals >= 10){
                bestPlayer = name;
                break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n", bestPlayer);
        if (maxGoals >= 3){
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        }else{
            System.out.printf("He has scored %d goals.", maxGoals);
        }
    }
}
