package ExamMarch2019;

import java.util.Scanner;

public class Gymnastics_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String apparatus = scanner.nextLine();

        double difficulty = 0;
        double implementation = 0;
        switch (country){
            case "Russia":
                if (apparatus.equals("ribbon")){
                    difficulty = 9.100;
                    implementation = 9.400;
                }else if (apparatus.equals("hoop")){
                    difficulty = 9.300;
                    implementation = 9.800;
                }else if (apparatus.equals("rope")){
                    difficulty = 9.600;
                    implementation = 9.000;
                }
                break;
            case "Bulgaria":
                if (apparatus.equals("ribbon")){
                    difficulty = 9.600;
                    implementation = 9.400;
                }else if (apparatus.equals("hoop")){
                    difficulty = 9.550;
                    implementation = 9.750;
                }else if (apparatus.equals("rope")){
                    difficulty = 9.500;
                    implementation = 9.400;
                }
                break;
            case "Italy":
                if (apparatus.equals("ribbon")){
                    difficulty = 9.200;
                    implementation = 9.500;
                }else if (apparatus.equals("hoop")){
                    difficulty = 9.450;
                    implementation = 9.350;
                }else if (apparatus.equals("rope")){
                    difficulty = 9.700;
                    implementation = 9.150;
                }
                break;
        }
        double totalPoints = difficulty + implementation;
        double percent = ((20 - totalPoints) / 20) * 100;
        System.out.printf("The team of %s get %.3f on %s.%n", country, totalPoints, apparatus);
        System.out.printf("%.2f%%", percent);
    }
}
