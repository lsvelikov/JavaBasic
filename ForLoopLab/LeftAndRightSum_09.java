package ForLoopLab;

import java.util.Scanner;

public class LeftAndRightSum_09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i <= n * 2; i++){
            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (i <= n){
                leftSum = leftSum + currentNumber;
            }else{
                rightSum = rightSum + currentNumber;
            }
        }
        if (leftSum == rightSum){
            System.out.printf("Yes, sum = %d", leftSum);
        }else{
            System.out.printf("No, diff = %d", Math.abs(leftSum - rightSum));
        }
    }
}
