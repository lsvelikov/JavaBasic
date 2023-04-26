package ConditionalStatementsExercise;

import java.util.Scanner;

public class LunchBreak_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filmName = scanner.nextLine();
        int filmDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        double lunchDuration = breakDuration / 8.0;
        double restDuration = breakDuration / 4.0;

        double leftTime = breakDuration - lunchDuration - restDuration;

        double difference = Math.abs(filmDuration - leftTime);
        if (leftTime >= filmDuration){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", filmName, Math.ceil(difference));
        }else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", filmName, Math.ceil(difference));
        }
    }
}
