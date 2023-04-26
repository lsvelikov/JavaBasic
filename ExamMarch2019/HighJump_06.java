package ExamMarch2019;

import java.util.Scanner;

public class HighJump_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int desiredHigh = Integer.parseInt(scanner.nextLine());
        int currentHigh = desiredHigh - 30;
        int failed = 0;
        int totalJumps = 0;
        boolean isFailed = false;
        int actualHigh = 0;

        for (int i = currentHigh; i <= desiredHigh; i += 5) {

            for (int j = 1; j <= 3; j++) {
                int currentJump = Integer.parseInt(scanner.nextLine());
                totalJumps++;

                if (currentJump > i) {
                    failed = 0;
                    break;
                } else {
                    failed++;
                }
            }
            if (failed == 3) {
                actualHigh = i;
                isFailed = true;
                break;
            }
        }
        if (isFailed){
            System.out.printf("Tihomir failed at %dcm after %d jumps.", actualHigh, totalJumps);
        }else {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", desiredHigh, totalJumps);
        }
    }
}
