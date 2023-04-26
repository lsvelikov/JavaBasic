package ExamApril19;

import java.util.Scanner;

public class OscarsCeremony_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());

        double statuette = rent - (rent * 0.3);
        double catering = statuette - (statuette * 0.15);
        double sound = catering * 0.5;

        double expenses = rent + statuette + catering + sound;

        System.out.printf("%.2f", expenses);
    }
}
