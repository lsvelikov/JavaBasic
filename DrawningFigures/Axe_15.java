package DrawningFigures;

import java.util.Scanner;

public class Axe_15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int width = n * 5;
        int leftDashes = n * 3;
        int middleDashes = 0;
        int rightDashes = width - leftDashes - middleDashes - 2;

        for (int i = 0; i < n; i++) {
            System.out.printf("%s*%s*%s", repeatString("-", leftDashes), repeatString("-", middleDashes), repeatString("-", rightDashes));
            System.out.println();
            middleDashes++;
            rightDashes--;
        }
        middleDashes--;
        rightDashes++;

        for (int i = 0; i < n / 2; i++) {
            System.out.printf("%s*%s*%s", repeatString("*", leftDashes), repeatString("-", middleDashes), repeatString("-", rightDashes));
            System.out.println();
        }
        for (int i = 0; i < n / 2 - 1; i++) {
            System.out.printf("%s*%s*%s", repeatString("-", leftDashes), repeatString("-", middleDashes), repeatString("-", rightDashes));
            System.out.println();

            leftDashes--;
            middleDashes += 2;
            rightDashes--;
        }
        System.out.printf("%s*%s*%s", repeatString("-", leftDashes), repeatString("*", middleDashes), repeatString("-", rightDashes));
        System.out.println();

//        int outerDashLeft = 3 * n;
//        int outerDashRight = 2 * n - 2;
//        int innerDash = 1;
//
//        System.out.printf("%s**%s", repeatString("-",outerDashLeft), repeatString("-", outerDashRight));
//        System.out.println();
//
//        outerDashRight--;
//        for (int i = 1; i < n; i++) {
//            System.out.printf("%s*%s*%s", repeatString("-", outerDashLeft), repeatString("-", innerDash), repeatString("-", outerDashRight));
//            System.out.println();
//            innerDash++;
//            outerDashRight--;
//        }
//        innerDash--;
//        outerDashRight++;
//        for (int i = 0; i < n / 2; i++) {
//            System.out.printf("%s*%s*%s", repeatString("*", outerDashLeft), repeatString("-", innerDash), repeatString("-", outerDashRight));
//            System.out.println();
//        }
//        for (int i = 0; i < n / 2 - 1; i++) {
//            System.out.printf("%s*%s*%s", repeatString("-", outerDashLeft), repeatString("-", innerDash), repeatString("-", outerDashRight));
//            System.out.println();
//            outerDashLeft--;
//            innerDash += 2;
//            outerDashRight--;
//        }
//        System.out.printf("%s*%s*%s", repeatString("-", outerDashLeft), repeatString("*", innerDash), repeatString("-", outerDashRight));
//        System.out.println();
//
    }
    public static String repeatString(String stringToRepeat, int count){
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + stringToRepeat;
        }
        return text;
    }
}
