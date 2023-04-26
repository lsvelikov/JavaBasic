package ExamJuly2019;

import java.util.Scanner;

public class Renovation_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int high = Integer.parseInt(scanner.nextLine());
        int bright = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        double area = high * bright * 4;
        double totalArea = Math.round(area - (area * percent / 100));
        boolean isEnough = false;
        while (!command.equals("Tired!")){
            int litersPaint = Integer.parseInt(command);

            totalArea = totalArea - litersPaint;

            if (totalArea <= 0){
                isEnough = true;
                break;
            }

            command = scanner.nextLine();
        }
        if (isEnough){
            if (totalArea == 0){
                System.out.println("All walls are painted! Great job, Pesho!");
            }else{
                System.out.printf("All walls are painted and you have %.0f l paint left!%n", Math.abs(totalArea));
            }
        }else{
            System.out.printf("%.0f quadratic m left.", totalArea);
        }
    }
}
