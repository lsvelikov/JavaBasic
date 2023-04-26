package Exam2022;

import java.util.Scanner;

public class CatLife {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String catRace = scanner.nextLine();
        String catGender = scanner.nextLine();

        int years = 0;
        boolean isValid = false;
        switch (catRace) {
            case "British Shorthair":
                if (catGender.equals("m")) {
                    years = 13;
                } else if (catGender.equals("f")) {
                    years = 14;
                }
                isValid = true;
                break;
            case "Siamese":
                if (catGender.equals("m")) {
                    years = 15;
                } else if (catGender.equals("f")) {
                    years = 16;
                }
                isValid = true;
                break;
            case "Persian":
                if (catGender.equals("m")) {
                    years = 14;
                } else if (catGender.equals("f")) {
                    years = 15;
                }
                isValid = true;
                break;
            case "Ragdoll":
                if (catGender.equals("m")) {
                    years = 16;
                } else if (catGender.equals("f")) {
                    years = 17;
                }
                isValid = true;
                break;
            case "American Shorthair":
                if (catGender.equals("m")) {
                    years = 12;
                } else if (catGender.equals("f")) {
                    years = 13;
                }
                isValid = true;
                break;
            case "Siberian":
                if (catGender.equals("m")) {
                    years = 11;
                } else if (catGender.equals("f")) {
                    years = 12;
                }
                isValid = true;
                break;
            default:
                isValid = false;
                break;
        }
        double totalMonts = years * 12;
        double catMonths = totalMonts / 6;

        if (isValid) {
            System.out.printf("%.0f cat months", Math.floor(catMonths));
        } else {
            System.out.printf("%s is invalid cat!", catRace);
        }
    }
}
