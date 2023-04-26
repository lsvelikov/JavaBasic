package ForLoopMoreExercises;

import java.util.Scanner;

public class Logistics_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	На първия ред – броя на товарите за превоз – цяло число в интервала [1...1000]
//•	За всеки един товар на отделен ред – тонажа на товара – цяло число в интервала [1...1000]

        int parcels = Integer.parseInt(scanner.nextLine());

        int busParcels = 0;
        int lkwParcels = 0;
        int trainParcels = 0;
        int busParcelInTone = 0;
        int lkwParcelInTone = 0;
        int trainParcelInTone = 0;
        for (int i = 1; i <= parcels; i++){
            int parcelInTon = Integer.parseInt(scanner.nextLine());

            if (parcelInTon <= 3){
                busParcels++;
                busParcelInTone += parcelInTon;
            }else if (parcelInTon <= 11){
                lkwParcels++;
                lkwParcelInTone += parcelInTon;
            }else{
                trainParcels++;
                trainParcelInTone += parcelInTon;
            }
        }
        int allParcelsInTon = busParcelInTone + lkwParcelInTone + trainParcelInTone;
        double averagePrice = ((busParcelInTone * 200) + (lkwParcelInTone * 175) + (trainParcelInTone * 120) * 1.0) / allParcelsInTon;
        System.out.printf("%.2f%n", averagePrice);
        System.out.printf("%.2f%%%n", busParcelInTone * 1.0 / allParcelsInTon * 100);
        System.out.printf("%.2f%%%n", lkwParcelInTone * 1.0 / allParcelsInTon * 100);
        System.out.printf("%.2f%%%n", trainParcelInTone * 1.0 / allParcelsInTon * 100);
    }
}
