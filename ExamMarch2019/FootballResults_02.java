package ExamMarch2019;

import java.util.Scanner;

public class FootballResults_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String match1 = scanner.nextLine();
        String match2 = scanner.nextLine();
        String match3 = scanner.nextLine();

        int win = 0;
        int lose = 0;
        int draw = 0;
        if (match1.charAt(0) > match1.charAt(2)){
            win++;
        }else if ( match1.charAt(0) < match1.charAt(2)){
            lose++;
        }else {
            draw++;
        }
        if (match2.charAt(0) > match2.charAt(2)){
            win++;
        }else if ( match2.charAt(0) < match2.charAt(2)){
            lose++;
        }else {
            draw++;
        }
        if (match3.charAt(0) > match3.charAt(2)){
            win++;
        }else if ( match3.charAt(0) < match3.charAt(2)){
            lose++;
        }else {
            draw++;
        }
        System.out.printf("Team won %d games.%n", win);
        System.out.printf("Team lost %d games.%n", lose);
        System.out.printf("Drawn games: %d", draw);
    }
}
