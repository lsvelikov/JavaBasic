package ExamMai;

import java.util.Scanner;

public class PcStore_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double processorPriceInDollars = Double.parseDouble(scanner.nextLine());
        double videoCardPriceInDollars = Double.parseDouble(scanner.nextLine());
        double ramPriceInDollars = Double.parseDouble(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double processorPriceInLeva = processorPriceInDollars * 1.57;
        double videoCardPriceInLeva = videoCardPriceInDollars * 1.57;
        double ramPriceInLeva = ramPriceInDollars * 1.57 * ramCount;

        double discountedProcessorPriceInLeva = processorPriceInLeva - (processorPriceInLeva * discount);
        double discountedVideoCardPriceInLeva = videoCardPriceInLeva - (videoCardPriceInLeva * discount);

        double totalPrice = discountedProcessorPriceInLeva + discountedVideoCardPriceInLeva + ramPriceInLeva;

        System.out.printf("Money needed - %.2f leva.", totalPrice);

    }
}
