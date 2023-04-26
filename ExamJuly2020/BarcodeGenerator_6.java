package ExamJuly2020;

import java.util.Scanner;

public class BarcodeGenerator_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String start = scanner.nextLine();
        String end = scanner.nextLine();

        for (int i = Integer.parseInt("" + start.charAt(0)); i <= Integer.parseInt("" + end.charAt(0)); i++) {
            for (int j = Integer.parseInt("" + start.charAt(1)); j <= Integer.parseInt("" + end.charAt(1)); j++) {
                for (int k = Integer.parseInt("" + start.charAt(2)); k <= Integer.parseInt("" + end.charAt(2)); k++) {
                    for (int l = Integer.parseInt("" + start.charAt(3)); l <= Integer.parseInt("" + end.charAt(3)); l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0){
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
