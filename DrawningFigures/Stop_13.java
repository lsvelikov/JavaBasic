package DrawningFigures;

import java.util.Scanner;

public class Stop_13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int dots = n + 1;
        int underscores = 2 * n + 1;

        System.out.printf("%s%s%s",repeatString(".", dots), repeatString("_", underscores), repeatString(".", dots));
        System.out.println();
        underscores -= 2;
        dots--;

        for (int i = 0; i < n; i++) {
            System.out.printf("%s//%s\\\\%s", repeatString(".", dots), repeatString("_", underscores), repeatString(".", dots));
            System.out.println();
            underscores += 2;
            dots--;
        }
        System.out.printf("//%sSTOP!%s\\\\", repeatString("_", (underscores - 5) / 2), repeatString("_", (underscores - 5) / 2));
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.printf("%s\\\\%s//%s", repeatString(".", i), repeatString("_", underscores), repeatString(".", i));
            System.out.println();
            underscores -= 2;
        }

    }
    public static String repeatString(String stringToRepeat, int count){
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + stringToRepeat;
        }
        return text;
    }
}
