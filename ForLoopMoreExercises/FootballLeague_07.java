package ForLoopMoreExercises;

import java.util.Scanner;

public class FootballLeague_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());

        int fansA = 0;
        int fansB = 0;
        int fansV = 0;
        int fansG = 0;
        for (int i = 1; i <= fans; i++){

            String fan = scanner.nextLine();

            switch (fan){
                case "A":
                    fansA++;
                    break;
                case "B":
                    fansB++;
                    break;
                case "V":
                    fansV++;
                    break;
                case "G":
                    fansG++;
                    break;
            }
        }
        System.out.printf("%.2f%%%n", fansA * 1.0 / fans * 100);
        System.out.printf("%.2f%%%n", fansB * 1.0 / fans * 100);
        System.out.printf("%.2f%%%n", fansV * 1.0 / fans * 100);
        System.out.printf("%.2f%%%n", fansG * 1.0 / fans * 100);
        System.out.printf("%.2f%%%n", fans * 1.0 / capacity * 100);
    }
}
