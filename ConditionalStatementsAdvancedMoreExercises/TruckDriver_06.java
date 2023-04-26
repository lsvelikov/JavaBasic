package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class TruckDriver_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	Първи ред – Сезон – текст "Spring", "Summer", "Autumn" или "Winter"
//•	Втори ред –  Километри на месец – реално число в интервала [10.00...20000.00]

        String season = scanner.nextLine();
        double km = Double.parseDouble(scanner.nextLine());

        double kmPrice = 0;
        double salary = 0;

        switch (season){
            case "Spring": case "Autumn":
                if (km <= 5000){
                    kmPrice = 0.75;
                    salary = km * kmPrice * 4;
                    salary = salary - (salary * 0.1);
                }else if (km <= 10000){
                    kmPrice = 0.95;
                    salary = km * kmPrice *4;
                    salary = salary - (salary * 0.1);
                }else if (km <= 20000){
                    kmPrice = 1.45;
                    salary = km * kmPrice * 4;
                    salary = salary - (salary * 0.1);
                }
                break;
            case "Summer":
                if (km <= 5000){
                    kmPrice = 0.90;
                    salary = km * kmPrice * 4;
                    salary = salary - (salary * 0.1);
                }else if (km <= 10000){
                    kmPrice = 1.10;
                    salary = km * kmPrice *4;
                    salary = salary - (salary * 0.1);
                }else if (km <= 20000){
                    kmPrice = 1.45;
                    salary = km * kmPrice * 4;
                    salary = salary - (salary * 0.1);
                }
                break;
            case "Winter":
                if (km <= 5000){
                    kmPrice = 1.05;
                    salary = km * kmPrice * 4;
                    salary = salary - (salary * 0.1);
                }else if (km <= 10000){
                    kmPrice = 1.25;
                    salary = km * kmPrice *4;
                    salary = salary - (salary * 0.1);
                }else if (km <= 20000){
                    kmPrice = 1.45;
                    salary = km * kmPrice * 4;
                    salary = salary - (salary * 0.1);
                }
                break;
        }
        System.out.printf("%.2f", salary);
    }
}
