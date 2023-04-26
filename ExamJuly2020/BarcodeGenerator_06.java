package ExamJuly2020;

import java.util.Scanner;

public class BarcodeGenerator_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

//        for (int i = Integer.parseInt(("" + start).substring(0,1)); i <= Integer.parseInt(("" + end).substring(0,1)); i++) {
//            for (int j = Integer.parseInt(("" + start).substring(1,2)); j <= Integer.parseInt(("" + end).substring(1,2)); j++) {
//                for (int k = Integer.parseInt(("" + start).substring(2,3)); k <= Integer.parseInt(("" + end).substring(2,3)); k++) {
//                    for (int l = Integer.parseInt(("" + start).substring(3,4)); l <= Integer.parseInt(("" + end).substring(3,4)); l++) {
//                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0){
//                            System.out.printf("%d%d%d%d ", i, j, k, l);
//                        }
//                    }
//                }
//            }
//        }
        String currentStart = "" + start;
        String currentEnd = "" + end;

        for (int i = Integer.parseInt(String.valueOf(currentStart.charAt(0))); i <= Integer.parseInt(String.valueOf(currentEnd.charAt(0))); i++) {
            for (int j = Integer.parseInt(String.valueOf(currentStart.charAt(1))); j <= Integer.parseInt(String.valueOf(currentEnd.charAt(1))); j++) {
                for (int k = Integer.parseInt(String.valueOf(currentStart.charAt(2))); k <= Integer.parseInt(String.valueOf(currentEnd.charAt(2))); k++) {
                    for (int l = Integer.parseInt(String.valueOf(currentStart.charAt(3))); l <= Integer.parseInt(String.valueOf(currentEnd.charAt(3))); l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0){
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
