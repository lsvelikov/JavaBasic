package ForLoopExercise;

import java.util.Scanner;

public class Salary_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        double totalSalary = salary;
        for (int i = 1; i <= n; i++) {
            String webPaige = scanner.nextLine();

            switch (webPaige){
                case "Facebook":
                    totalSalary -= 150;
                    break;
                case "Instagram":
                    totalSalary -= 100;
                    break;
                case "Reddit":
                    totalSalary -= 50;
                    break;
            }
            if (salary <= 0){
                break;
            }
        }
        if (totalSalary > 0){
            System.out.printf("%.0f", totalSalary);
        }else {
            System.out.println("You have lost your salary.");
        }
    }
}
