package ExamJune2019;

import java.util.Scanner;

public class MovieStars_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("ACTION")) {
            String actor = input;
            int length = actor.length();

            double salary = 0;
            double lastSalary = 0;
            if (length <= 15){
                salary = Double.parseDouble(scanner.nextLine());
                lastSalary = salary;
                budget = budget - lastSalary;
            }else{
                salary = budget * 0.2;
                budget = budget - salary;
            }
            if (budget < 0){
                break;
            }
            input = scanner.nextLine();
        }
        if (budget < 0){
            System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
        }else{
            System.out.printf("We are left with %.2f leva.", budget);
        }
    }
}
