package ExamMarch2020;

import java.util.Scanner;

public class TrekkingMania_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        int musala = 0;
        int monbtlanc = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;
        int totalPeople = 0;
        for (int i = 1; i <= groups; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            totalPeople += people;

            if (people <= 5){
                musala += people;
            }else if (people <= 12){
                monbtlanc += people;
            }else if (people <= 25){
                kilimanjaro += people;
            }else if (people <= 40){
                k2 += people;
            }else {
                everest += people;
            }
        }
        System.out.printf("%.2f%%%n", musala * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", monbtlanc * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", kilimanjaro * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", k2 * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", everest * 1.0 / totalPeople * 100);
    }
}
