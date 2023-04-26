package ExamApril19;

import java.util.Scanner;

public class CinemaVoucher_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucher = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int totalMoney = voucher;
        int tickets = 0;
        int productCount = 0;
        while (!input.equals("End")){
            String purchasing = input;
            int length = input.length();

            char a = input.charAt(0);
            char b = input.charAt(1);

            if (length > 8){
                if (totalMoney < a + b){
                    break;
                }
                tickets++;
                totalMoney = totalMoney - (a + b);
            }else{
                if (totalMoney < a){
                    break;
                }
                totalMoney = totalMoney - a;
                productCount++;
            }

            input = scanner.nextLine();
        }
        System.out.println(tickets);
        System.out.println(productCount);
    }
}
