package ForLoopLab;

import java.util.Scanner;

public class EvenPowersOf2_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

       int currentNum = 1;

       for (int i = 0; i <= n; i += 2){
           System.out.println(currentNum);

           currentNum = currentNum * 2 * 2;

       }
    }
}
