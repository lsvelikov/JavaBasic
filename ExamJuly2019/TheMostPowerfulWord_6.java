package ExamJuly2019;

import java.util.Scanner;

public class TheMostPowerfulWord_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String currentWord = "";
        int totalSum = 0;
        while (!input.equals("End of words")){
            String word = input;
            int length = word.length();

            int sum = 0;
            for (int i = 0; i < length; i++) {
                sum = sum + (int) word.charAt(i);

            }
            if (word.charAt(0) == 'A' || word.charAt(0) == 'E' || word.charAt(0) == 'I' || word.charAt(0) == 'O' || word.charAt(0) == 'U' || word.charAt(0) == 'Y'){
                sum = sum * length;
            }else if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u' || word.charAt(0) == 'y'){
                sum = sum * length;
            } else{
                sum = sum / length;
            }
            if (sum > totalSum){
                totalSum = sum;
                currentWord = word;
            }

            input = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %d", currentWord, totalSum);
    }
}
