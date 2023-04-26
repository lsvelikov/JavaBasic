package ConditionalStatementsExercise;

import java.util.Scanner;

public class WorldSwimmingRecord_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double meterInSeconds = Double.parseDouble(scanner.nextLine());

        double seconds = meters * meterInSeconds;
        double totalSeconds = seconds + Math.floor(meters / 15) * 12.5;

        if (recordInSeconds < totalSeconds){
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalSeconds - recordInSeconds);
        }else{
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalSeconds);
        }
    }
}
