package ExamJuly2020;

import java.util.Scanner;

public class Balls_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int redCount = 0;
        int orangeCount = 0;
        int yellowCount = 0;
        int whiteCount = 0;
        int blackCount = 0;
        int otherCount = 0;
        for (int i = 1; i <= n; i++) {
            String color = scanner.nextLine();

            switch (color){
                case "red":
                    points += 5;
                    redCount++;
                    break;
                case "orange":
                    points += 10;
                    orangeCount++;
                    break;
                case "yellow":
                    points += 15;
                    yellowCount++;
                    break;
                case "white":
                    points += 20;
                    whiteCount++;
                    break;
                case "black":
                    blackCount++;
                    points = (int) Math.floor(points * 1.0 / 2);
                    break;
                default:
                    otherCount++;
                    continue;
            }
        }
        System.out.printf("Total points: %d%n", points);
        System.out.printf("Red balls: %d%n",redCount);
        System.out.printf("Orange balls: %d%n",orangeCount);
        System.out.printf("Yellow balls: %d%n",yellowCount);
        System.out.printf("White balls: %d%n",whiteCount);
        System.out.printf("Other colors picked: %d%n",otherCount);
        System.out.printf("Divides from black balls: %d", blackCount);
    }
}
