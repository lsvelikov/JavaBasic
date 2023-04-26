package DrawningFigures;

import java.util.Scanner;

public class Butterfly_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int halfRowSize = n - 2;
        for (int i = 1; i <= halfRowSize; i++) {
            if (i % 2 != 0){
                System.out.println(String.format("%s\\ /%s", repeatString("*", halfRowSize), repeatString("*", halfRowSize)));
            }else{
                System.out.println(String.format("%s\\ /%s", repeatString("-", halfRowSize), repeatString("-", halfRowSize)));
            }
        }
        System.out.println(String.format("%s @ %s", repeatString(" ", halfRowSize), repeatString(" ", halfRowSize)));
        for (int i = 1; i <= halfRowSize; i++) {
            if (i % 2 != 0){
                System.out.println(String.format("%s/ \\%s", repeatString("*", halfRowSize), repeatString("*", halfRowSize)));
            }else{
                System.out.println(String.format("%s/ \\%s", repeatString("-", halfRowSize), repeatString("-", halfRowSize)));
            }
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
