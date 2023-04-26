package ExamJuly2019;

import java.util.Scanner;

public class Club_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double desiredIncome = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();

        double order = 0;
        double profit = 0;
        boolean isReached = false;
        while (!command.equals("Party!")){
            String cocktail = command;
            int cocktailsCount = Integer.parseInt(scanner.nextLine());
            int length = cocktail.length();

            order = length * cocktailsCount;
            if (order % 2 != 0){
                order = order - (order * 0.25);
            }
            profit += order;

            if (profit >= desiredIncome){
                isReached = true;
                break;
            }

            command = scanner.nextLine();
        }
        if (isReached){
            System.out.println("Target acquired.");
        }else{
            System.out.printf("We need %.2f leva more.%n", desiredIncome - profit);
        }
        System.out.printf("Club income - %.2f leva.", profit);
    }
}
