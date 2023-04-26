package ExamMarch2020;

import java.util.Scanner;

public class FitnessCard_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        String sportName = "";
        double price = 0;
        switch (sport){
            case "Gym":
                if (gender.equals("m")){
                    price = 42;
                }else if (gender.equals("f")){
                    price = 35;
                }
                sportName = sport;
                break;
            case "Boxing":
                if (gender.equals("m")){
                    price = 41;
                }else if (gender.equals("f")){
                    price = 37;
                }
                sportName = sport;
                break;
            case "Yoga":
                if (gender.equals("m")){
                    price = 45;
                }else if (gender.equals("f")){
                    price = 42;
                }
                sportName = sport;
                break;
            case "Zumba":
                if (gender.equals("m")){
                price = 34;
            }else if (gender.equals("f")){
                price = 31;
            }
                sportName = sport;
                break;
            case "Dances":
                if (gender.equals("m")){
                    price = 51;
                }else if (gender.equals("f")){
                    price = 53;
                }
                sportName = sport;
                break;
            case "Pilates":
                if (gender.equals("m")){
                    price = 39;
                }else if (gender.equals("f")){
                    price = 37;
                }
                sportName = sport;
                break;
        }
        if (age < 20){
            price *= 0.8;
        }
        if (price <= budget){
            System.out.printf("You purchased a 1 month pass for %s.", sportName);
        }else{
            System.out.printf("You don't have enough money! You need $%.2f more.", price - budget);
        }
    }
}
