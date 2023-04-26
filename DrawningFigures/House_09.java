package DrawningFigures;

import java.util.Scanner;

public class House_09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int stars = 1;
        if (n % 2 == 0){
            stars++;
        }
        double roofLength = (int)Math.ceil(n / 2f);

        for (int i = 0; i < roofLength; i++) {
            int padding = (n - stars) / 2;
            String line = generateForm("-", padding) + generateForm("*", stars) + generateForm("-",padding);
            System.out.println(line);
            stars += 2;
        }
        for (int i = 0; i < n / 2; i++) {
            String line = "|" + generateForm("*", n - 2) + "|";
            System.out.println(line);
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
