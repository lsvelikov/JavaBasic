package ExamJune2019;

import java.util.Scanner;

public class Cinema_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        double totalPrice = 0;
        int peopleCount = 0;
        boolean isFull = false;
        while (!command.equals("Movie time!")){
            int people = Integer.parseInt(command);
            peopleCount = peopleCount + people;
            if (peopleCount > capacity){
                isFull = true;
                break;
            }
            if (people % 3 == 0){
                totalPrice = totalPrice + people * 5 - 5;
                command = scanner.nextLine();
                continue;
            }
            totalPrice = totalPrice + people * 5;

            command = scanner.nextLine();

        }if (isFull){
            System.out.println("The cinema is full.");
        }else {
            System.out.printf("There are %d seats left in the cinema.%n", capacity - peopleCount);
        }
        System.out.printf("Cinema income - %.0f lv.", totalPrice);
    }
}
