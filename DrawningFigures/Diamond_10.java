package DrawningFigures;

import java.util.Scanner;

public class Diamond_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        int leftRight = (int) Math.floor(n - 1) / 2;
        if (n % 2 != 0){

            int result = (int) Math.floor(n / 2f + 1);
            for (int i = 0; i < result; i++) {
                System.out.print(generateForm("-", leftRight));
                System.out.print("*");

                int mid = n - 2 * leftRight - 2;
                if (mid >= 0){
                    System.out.print(generateForm("-", mid));
                    System.out.print("*");
                }
                System.out.println(generateForm("-", leftRight));
                leftRight--;
            }
        }else{
            for (int i = 0; i < n / 2; i++) {
                System.out.print(generateForm("-", leftRight));
                System.out.print("*");

                int mid = n - 2 * leftRight - 2;
                if (mid >= 0){
                    System.out.print(generateForm("-", mid));
                    System.out.print("*");
                }
                System.out.println(generateForm("-", leftRight));
                leftRight--;
            }
        }

        leftRight++;
        int result1 = (int)Math.floor((n - 1) / 2f);
        for (int i = 0; i < result1; i++) {
            leftRight++;
            System.out.print(generateForm("-", leftRight));
            System.out.print("*");
            int mid = n - 2 * leftRight - 2;
            if (mid >= 0){
                System.out.print(generateForm("-", mid));
                System.out.print("*");
            }
            System.out.println(generateForm("-", leftRight));
        }


    }
    public static String generateForm(String symbol, int numberOfStars){

        StringBuffer builder = new StringBuffer();
        for (int i = 0; i < numberOfStars; i++) {
            builder.append(symbol);
        }
        return builder.toString();
    }
}
