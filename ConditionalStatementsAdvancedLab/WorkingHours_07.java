package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class WorkingHours_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if (hours >= 10 && hours <= 18) {
                    System.out.println("open");
                    break;
                }
            default:
                System.out.println("closed");
                break;
        }

    }
}
