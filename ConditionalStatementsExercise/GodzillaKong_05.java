package ConditionalStatementsExercise;

import java.util.Scanner;

public class GodzillaKong_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double countSupernumerary = Double.parseDouble(scanner.nextLine());
        double suitSupernumerary = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;
        double suitSum = countSupernumerary * suitSupernumerary;

        if (countSupernumerary > 150){
            suitSum = suitSum - (suitSum * 0.1);
        }
        double filmSum = decor + suitSum;

        if (budget >= filmSum){
            System.out.printf("Action! %nWingard starts filming with %.2f leva left.", budget - filmSum);
        }else{
            System.out.printf("Not enough money! %nWingard needs %.2f leva more.",filmSum - budget);
        }
    }
}
