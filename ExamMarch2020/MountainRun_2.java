package ExamMarch2020;

import java.util.Scanner;

public class MountainRun_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());

        double secondsNeeded = distance * secondsPerMeter;
        int slowingDown = (int) Math.floor(distance / 50 );
        int slowingDownSeconds = slowingDown * 30;
        double totalTime = secondsNeeded + slowingDownSeconds;

        if (totalTime > record){
            System.out.printf("No! He was %.2f seconds slower.", totalTime - record);
        }else if(totalTime < record){
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);
        }else{
            System.out.printf("No! He was %.2f seconds slower.", totalTime - record);
        }
    }
}
