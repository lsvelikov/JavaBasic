package DrawningFigures;

import java.util.Scanner;

public class Arrow_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int outerDots = (n - 1) / 2;
        int innerDots = n - 2;

        System.out.printf("%s%s%s", repeatString(".", outerDots), repeatString("#", n), repeatString(".", outerDots));
        System.out.println();

        for (int i = 0; i < n - 2; i++) {
            System.out.printf("%s#%s#%s", repeatString(".", outerDots), repeatString(".", innerDots), repeatString(".", outerDots));
            System.out.println();
        }
        System.out.printf("%s%s%s", repeatString("#", outerDots + 1), repeatString(".", innerDots), repeatString("#", outerDots + 1));
        System.out.println();

        outerDots = 1;
        innerDots = 2 * n - 5;

        for (int i = 0; i < n - 2; i++) {
            System.out.printf("%s#%s#%s", repeatString(".", outerDots), repeatString(".", innerDots), repeatString(".", outerDots));
            System.out.println();

            outerDots++;
            innerDots -= 2;
        }
        System.out.printf("%s#%s", repeatString(".", outerDots), repeatString(".", outerDots));
    }
    public static String repeatString(String stringToRepeat, int count){
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + stringToRepeat;
        }
        return text;
    }
}
