package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class BikeRace_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//•	Третият ред – вид трасе – "trail", "cross-country", "downhill" или "road"

        int juniorCyclists = Integer.parseInt(scanner.nextLine());
        int seniorCyclists = Integer.parseInt(scanner.nextLine());
        String cyclingRoad = scanner.nextLine();
        double tax = 0;


        if (cyclingRoad.equals("trail")){
            tax = juniorCyclists * 5.5 + seniorCyclists * 7;
            tax = tax - (tax * 0.05);
            System.out.printf("%.2f", tax);
        }else if (cyclingRoad.equals("cross-country")){
            tax = juniorCyclists * 8 + seniorCyclists * 9.5;
            tax = tax - (tax * 0.05);

            if ((juniorCyclists + seniorCyclists) >= 50){
                tax = tax - (tax * 0.25);
            }
            System.out.printf("%.2f", tax);
        }else if (cyclingRoad.equals("downhill")){
            tax = juniorCyclists * 12.25 + seniorCyclists * 13.75;
            tax = tax - (tax * 0.05);
            System.out.printf("%.2f", tax);
        }else if (cyclingRoad.equals("road")){
            tax = juniorCyclists * 20 + seniorCyclists * 21.50;
            tax = tax - (tax * 0.05);
            System.out.printf("%.2f", tax);
        }
    }
}
