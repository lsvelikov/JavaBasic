package ForLoopExercise;

import java.util.Scanner;

public class Oscars_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorsName = scanner.nextLine();
        double pointsFromAcademy = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        double totalPoints = pointsFromAcademy;
        for (int i = 1; i <= n; i++){
            String name = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());

            int length = name.length();

            double calculatedPoints = (length * points) / 2;
            totalPoints = totalPoints + calculatedPoints;

            if (totalPoints > 1250.5){
                break;
            }
        }
        if (totalPoints > 1250.5){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorsName, totalPoints);
        }else{
            System.out.printf("Sorry, %s you need %.1f more!", actorsName, Math.abs(1250.5 - totalPoints));
        }
    }
}
