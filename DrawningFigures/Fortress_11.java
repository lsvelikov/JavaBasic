package DrawningFigures;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.Scanner;

public class Fortress_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int colSize = n / 2;
        int midSize = n * 2 - 2 * colSize - 4;
        String underscores = repeatString("_", midSize);
        String arrows = repeatString("^", colSize);
        System.out.println(String.format("/%s\\%s/%s\\", arrows, underscores, arrows));

        for (int row = 1; row <= n - 3; row++) {
            System.out.println(String.format("|%s|", repeatString(" ", 2 * n - 2)));
        }
        String sideSpace = repeatString(" ", colSize + 1);
        System.out.println(String.format("|%s%s%s|", sideSpace, underscores, sideSpace));

        String middleSpaces = repeatString(" ", midSize);
        underscores = repeatString("_", colSize);
        System.out.println(String.format("\\%s/%s\\%s/", underscores, middleSpaces, underscores));
    }
    public static String repeatString(String stringToRepeat, int count){
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + stringToRepeat;
        }
        return text;
    }
}
