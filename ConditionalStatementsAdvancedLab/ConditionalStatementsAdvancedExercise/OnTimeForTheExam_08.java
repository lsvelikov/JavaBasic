package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OnTimeForTheExam_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int totalExamTimeInMinutes = examHour * 60 + examMinutes;
        int totalArrivalTimeInMinutes = arrivalHour * 60 + arrivalMinutes;
        int diff = Math.abs(totalExamTimeInMinutes - totalArrivalTimeInMinutes);

        if (totalExamTimeInMinutes < totalArrivalTimeInMinutes){
            System.out.println("Late");
            if (diff < 60){
                System.out.printf("%d minutes after the start", diff);
            }else{
                int hour = diff / 60;
                int min = diff % 60;
                System.out.printf("%d:%02d hours after the start", hour, min);
            }
        }else if (diff == 0 || diff <= 30){
            System.out.println("On Time");
            if (diff >= 1 && diff <= 30){
                System.out.printf("%d minutes before the start", diff);
            }
        }else{
            System.out.println("Early");
            if (diff >= 60){
                int hour = diff / 60;
                int min = diff % 60;
                System.out.printf("%d:%02d hours before the start", hour, min);
            }else{
                System.out.printf("%d minutes before the start", diff);
            }
        }
    }
}
