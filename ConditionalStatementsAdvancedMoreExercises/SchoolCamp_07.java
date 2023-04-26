package ConditionalStatementsAdvancedMoreExercises;

import javax.swing.*;
import java.util.Scanner;

public class SchoolCamp_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String gender = scanner.nextLine();
        int kidsCount = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        String sport = "";
        double nightsPrice = 0;
        double endPrice = 0;

        switch (season){
            case "Spring":
                if (gender.equals("boys") || gender.equals("girls")){
                    nightsPrice = 7.20;
                }else if (gender.equals("mixed")){
                    nightsPrice = 9.5;
                }
                if (gender.equals("boys")){
                    sport = "Tennis";
                }else if (gender.equals("girls")){
                    sport = "Athletics";
                }else if (gender.equals("mixed")){
                    sport = "Cycling";
                }
                endPrice = kidsCount * nightsPrice * nights;
                if (kidsCount >= 10 && kidsCount < 20){
                    endPrice = endPrice - (endPrice * 0.05);
                }else if (kidsCount >= 20 && kidsCount < 50){
                    endPrice = endPrice - (endPrice * 0.15);
                }else if (kidsCount >= 50){
                    endPrice = endPrice - (endPrice * 0.5);
                }
                break;
            case "Summer":
                if (gender.equals("boys") || gender.equals("girls")){
                    nightsPrice = 15;
                }else if (gender.equals("mixed")){
                    nightsPrice = 20;
                }
                if (gender.equals("boys")){
                    sport = "Football";
                }else if (gender.equals("girls")){
                    sport = "Volleyball";
                }else if (gender.equals("mixed")){
                    sport = "Swimming";
                }
                endPrice = kidsCount * nightsPrice * nights;
                if (kidsCount >= 10 && kidsCount < 20){
                    endPrice = endPrice - (endPrice * 0.05);
                }else if (kidsCount >= 20 && kidsCount < 50){
                    endPrice = endPrice - (endPrice * 0.15);
                }else if (kidsCount >= 50){
                    endPrice = endPrice - (endPrice * 0.5);
                }
                break;
            case "Winter":
                if (gender.equals("boys") || gender.equals("girls")){
                    nightsPrice = 9.60;
                }else if (gender.equals("mixed")){
                    nightsPrice = 10;
                }
                if (gender.equals("boys")){
                    sport = "Judo";
                }else if (gender.equals("girls")){
                    sport = "Gymnastics";
                }else if (gender.equals("mixed")){
                    sport = "Ski";
                }
                endPrice = kidsCount * nightsPrice * nights;
                if (kidsCount >= 10 && kidsCount < 20){
                    endPrice = endPrice - (endPrice * 0.05);
                }else if (kidsCount >= 20 && kidsCount < 50){
                    endPrice = endPrice - (endPrice * 0.15);
                }else if (kidsCount >= 50){
                    endPrice = endPrice - (endPrice * 0.5);
                }
                break;
        }
        System.out.printf("%s %.2f lv.", sport, endPrice);
    }
}
