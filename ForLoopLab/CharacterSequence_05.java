package ForLoopLab;

import java.util.Scanner;

public class CharacterSequence_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int length = text.length();

        for (int i = 0; i < length; i++){
            System.out.println(text.charAt(i));
        }
    }
}
