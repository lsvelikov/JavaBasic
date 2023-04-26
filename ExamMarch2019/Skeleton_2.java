package ExamMarch2019;

import java.util.Scanner;

public class Skeleton_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutes = Integer.parseInt(scanner.nextLine());
        int seconds = Integer.parseInt(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        int secondsFor100Meters = Integer.parseInt(scanner.nextLine());

        double controlTimeInSec = minutes * 60 + seconds;
        double totalDecreaseTime = length / 120 * 2.5;
        double marinsTime = (length / 100) * secondsFor100Meters - totalDecreaseTime;

        if (controlTimeInSec >= marinsTime){
            System.out.printf("Marin Bangiev won an Olympic quota!%n");
            System.out.printf("His time is %.3f.", marinsTime);
        }else{
            System.out.printf("No, Marin failed! He was %.3f second slower.", marinsTime - controlTimeInSec);
        }
    }
}
