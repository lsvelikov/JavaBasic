package ExamJuly2019;

import java.util.Scanner;

public class PcGameShop_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soledGames = Integer.parseInt(scanner.nextLine());

        int hearthstoneCount = 0;
        int forniteCount = 0;
        int overwatchCount = 0;
        int othersCount = 0;
        for (int i = 1; i <= soledGames; i++) {
            String name = scanner.nextLine();

            if (name.equals("Hearthstone")){
                hearthstoneCount++;
            }else if (name.equals("Fornite")){
                forniteCount++;
            }else if (name.equals("Overwatch")){
                overwatchCount++;
            }else{
                othersCount++;
            }
        }
        System.out.printf("Hearthstone - %.2f%%%n", hearthstoneCount * 1.0 / soledGames * 100);
        System.out.printf("Fornite - %.2f%%%n", forniteCount * 1.0 / soledGames * 100);
        System.out.printf("Overwatch - %.2f%%%n", overwatchCount * 1.0 / soledGames * 100);
        System.out.printf("Others - %.2f%%%n", othersCount * 1.0 / soledGames * 100);
    }
}
