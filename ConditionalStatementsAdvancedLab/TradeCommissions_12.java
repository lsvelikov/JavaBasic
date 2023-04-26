package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class TradeCommissions_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Фирма дава следните комисионни на търговците си според града, в който работят и обема на продажбите s:
//        Град	0 ≤ s ≤ 500	500 < s ≤ 1 000	1 000 < s ≤ 10 000	s > 10 000
//        Sofia	5%	7%	8%	12%
//                Varna	4.5%	7.5%	10%	13%
//                Plovdiv	5.5%	8%	12%	14.5%
//                Напишете конзолна програма, която чете име на град (текст) и обем на продажби (реално число) , въведени от потребителя, и изчислява и извежда размера на търговската комисионна според горната таблица. Резултатът да се изведе форматиран до 2 цифри след десетичната точка. При невалиден град или обем на продажбите (отрицателно число) да се отпечата "error".
//

        String town = scanner.nextLine();
        double profit = Double.parseDouble(scanner.nextLine());
        boolean isValid = true;
        double result = 0;

        if (town.equals("Sofia")){
            if (profit >= 0 && profit <= 500){
                result = profit * 0.05;
            }else if (profit > 500 && profit <= 1000){
                result = profit * 0.07;
            }else if (profit > 1000 && profit <= 10000){
                result = profit * 0.08;
            }else if (profit > 10000){
                result = profit * 0.12;
            }else{
                isValid = false;
            }
        }else if (town.equals("Varna")){
            if (profit >= 0 && profit <= 500){
                result = profit * 0.045;
            }else if (profit > 500 && profit <= 1000){
                result = profit * 0.075;
            }else if (profit > 1000 && profit <= 10000){
                result = profit * 0.10;
            }else if (profit > 10000){
                result = profit * 0.13;
            }else {
                isValid = false;
            }
        }else if (town.equals("Plovdiv")){
            if (profit >= 0 && profit <= 500){
                result = profit * 0.055;
            }else if (profit > 500 && profit <= 1000){
                result = profit * 0.08;
            }else if (profit > 1000 && profit <= 10000){
                result = profit * 0.12;
            }else if (profit > 10000){
                result = profit * 0.145;
            }else {
                isValid = false;
            }
        }else{
            isValid = false;
        }
        if (isValid){
            System.out.printf("%.2f", result);
        }else{
            System.out.println("error");
        }
    }
}
