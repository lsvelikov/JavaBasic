package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class NewHouse_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	Вид цветя - текст с възможности - "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
        String flowers = scanner.nextLine();
        int flowersCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;
        switch (flowers){
            case "Roses":
                totalPrice = flowersCount * 5;
                if (flowersCount > 80){
                    totalPrice = totalPrice - (totalPrice * 0.1);
                }
                break;
            case "Dahlias":
                totalPrice = flowersCount * 3.8;
                if (flowersCount > 90){
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;
            case "Tulips":
                totalPrice = flowersCount * 2.8;
                if (flowersCount > 80){
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;
            case "Narcissus":
                totalPrice = flowersCount * 3;
                if (flowersCount < 120){
                    totalPrice = totalPrice + (totalPrice * 0.15);
                }
                break;
            case "Gladiolus":
                totalPrice = flowersCount * 2.5;
                if (flowersCount < 80){
                    totalPrice = totalPrice + (totalPrice * 0.2);
                }
                break;
        }
        if (budget >= totalPrice){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersCount, flowers, budget - totalPrice);
        }else{
            System.out.printf("Not enough money, you need %.2f leva more.", totalPrice - budget);
        }
    }
}
