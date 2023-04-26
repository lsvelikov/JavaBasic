package ExamJuly2019;

import java.util.Scanner;

public class NameGame_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String currentName = "";
        int endPoints = 0;
        while (!input.equals("Stop")){
            String name = input;
            int length = name.length();


            int points = 0;
            int totalPoints = 0;
            for (int i = 0; i < length; i++) {
                int number = Integer.parseInt(scanner.nextLine());
                if (number == (int) name.charAt(i)){
                    points = 10;
                }else{
                    points = 2;
                }
                totalPoints += points;
                if (totalPoints > endPoints){
                    endPoints = totalPoints;
                    currentName = name;
                }
                if (endPoints == totalPoints){
                    currentName = name;
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!", currentName, endPoints);
    }
}
