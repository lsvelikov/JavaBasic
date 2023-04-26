package ExamMai2019;

import java.util.Scanner;

public class MobileOperator_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String duration = scanner.nextLine();
        String typeContract = scanner.nextLine();
        String internet = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());

        double totalTax = 0;
        double tax = 0;
        double internetPrice = 0;
        switch (typeContract){
            case "Small":
                if (duration.equals("one")){
                    tax = 9.98;
                }else if (duration.equals("two")){
                    tax = 8.58;
                }
                break;
            case "Middle":
                if (duration.equals("one")){
                    tax = 18.99;
                }else if (duration.equals("two")){
                    tax = 17.09;
                }
                break;
            case "Large":
                if (duration.equals("one")){
                    tax = 25.98;
                }else if (duration.equals("two")){
                    tax = 23.59;
                }
                break;
            case "ExtraLarge":
                if (duration.equals("one")){
                    tax = 35.99;
                }else if (duration.equals("two")){
                    tax = 31.79;
                }
                break;
        }
        if (tax <= 10 && internet.equals("yes")){
            internetPrice = 5.50;
        }else if (tax <= 30 && internet.equals("yes")){
            internetPrice = 4.35;
        }else if (tax > 30 && internet.equals("yes")){
            internetPrice = 3.85;
        }
        totalTax = tax + internetPrice;
        if (duration.equals("two")){
            totalTax = totalTax - (totalTax * 0.0375);
        }
        System.out.printf("%.2f lv.", totalTax * months);
    }
}
