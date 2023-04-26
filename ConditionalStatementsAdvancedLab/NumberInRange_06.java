package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class NumberInRange_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

       boolean isValid = number >= -100 && number <= 100 && number != 0;

       if (isValid){
           System.out.println("Yes");
       }else{
           System.out.println("No");
       }
    }
}

