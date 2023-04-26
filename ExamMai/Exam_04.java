package ExamMai;

import java.util.Scanner;

public class Exam_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());

        int topStudentsCount = 0;
        int veryGoodCount = 0;
        int goodCount = 0;
        int failCount = 0;
        double totalValue = 0;
        for (int i = 1; i <= students; i++){
            double value = Double.parseDouble(scanner.nextLine());
            totalValue += value;

            if (value >= 2 && value <= 2.99){
                failCount++;
            }else if (value >= 3 && value <= 3.99){
                goodCount++;
            }else if (value >= 4 && value <= 4.99){
                veryGoodCount++;
            }else if (value >= 5){
                topStudentsCount++;
            }
        }
        System.out.printf("Top students: %.2f%%%n", topStudentsCount * 1.0 / students * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", veryGoodCount * 1.0 / students * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", goodCount * 1.0 / students * 100);
        System.out.printf("Fail: %.2f%%%n", failCount * 1.0 / students * 100);
        System.out.printf("Average: %.2f", totalValue / students);
    }
}
