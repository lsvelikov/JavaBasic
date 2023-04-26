package DrawningFigures;

import java.util.Scanner;

public class Sunglasses_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int col = 0; col < n * 2; col++) {
            System.out.print("*");
        }
        for (int col = 0; col < n; col++) {
            System.out.print(" ");
        }
        for (int col = 0; col < n * 2; col++) {
            System.out.print("*");
        }
        System.out.println();
        for (int row = 0; row < n - 2; row++) {
            System.out.print("*");
            for (int col = 0; col < n * 2 - 2; col++) {
                System.out.print("/");
            }
            System.out.print("*");
            for (int col = 0; col < n; col++) {
                if (row == (n - 1) / 2 - 1) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("*");
            for (int col = 0; col < n * 2 - 2; col++){
                System.out.print("/");
            }
            System.out.println("*");
        }
        for (int col = 0; col < n * 2; col++) {
            System.out.print("*");
        }
        for (int col = 0; col < n; col++) {
            System.out.print(" ");
        }
        for (int col = 0; col < n * 2; col++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
