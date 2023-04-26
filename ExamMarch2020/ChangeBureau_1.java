package ExamMarch2020;

import java.util.Scanner;

public class ChangeBureau_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double yuan = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double bitcoinInLeva = bitcoin * 1168;
        double yuanInUsd = yuan * 0.15;
        double usdInLeva = yuanInUsd * 1.76;
        double totalInEuro = (bitcoinInLeva + usdInLeva) / 1.95;
        double totalCommission = totalInEuro * commission / 100;
        double totalSum = totalInEuro - totalCommission;

        System.out.printf("%.2f", totalSum);
    }
}
