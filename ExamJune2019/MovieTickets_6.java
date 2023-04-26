package ExamJune2019;

import java.util.Scanner;

public class MovieTickets_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = Integer.parseInt(scanner.nextLine());
        int a2 = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        int a3 = 0;
        for (int i = a1; i <= a2 - 1; i++) {
            if (i % 2 != 0){
                a3 = i;
            }
            char symbol = (char)a3;
            for (int j = 1; j <= n - 1; j++) {
                for (int k = 1; k <= n / 2 - 1; k++) {
                    if (a3 == i){
                        if ((i % 2 != 0) && ((j + k + a3) % 2 != 0)){
                            System.out.printf("%s-%d%d%d%n", symbol, j, k, a3);
                        }
                    }
                }
            }
        }
    }
}
