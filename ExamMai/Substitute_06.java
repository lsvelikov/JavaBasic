package ExamMai;

import java.util.Scanner;

public class Substitute_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        int countSubs = 0;
        for (int i = k; i <= 8; i++){
            for (int j = 9; j >= l; j--){
                for (int f = m; f <= 8; f++){
                    for (int c = 9; c >= n; c--){
                        if (i % 2 == 0 && j % 2 != 0 && f % 2 == 0 && c % 2 != 0){
                            if (countSubs >= 6){
                                break;
                            }
                            if (i == f && j == c){
                                System.out.println("Cannot change the same player.");
                            }else{
                                System.out.printf("%d%d - %d%d%n", i, j, f, c);
                                countSubs++;
                            }
                        }
                    }
                }
            }
        }
    }
}