package ExamMarch2020;

import java.util.Scanner;

public class SuitcasesLoad_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();

        int baggageCount = 0;
        boolean notEnough = false;
        int loaded = 0;
        while (!command.equals("End")){
            double volume = Double.parseDouble(command);
            baggageCount++;

            if (baggageCount % 3 == 0){
                volume += volume * 0.1;
            }

            if (volume > capacity){
                notEnough = true;
                break;
            }
            capacity -= volume;
            loaded++;

            command = scanner.nextLine();
        }
        if (notEnough){
            System.out.println("No more space!");
        }else{
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", loaded);
    }
}
