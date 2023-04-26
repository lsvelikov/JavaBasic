package ForLoopMoreExercises;

import java.util.Scanner;

public class Grades_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());

        int failStudents = 0;
        int averageStudents = 0;
        int goodStudents = 0;
        int topStudents = 0;
        double sumAllNotes = 0;
        double averageNote = 0;

        for (int i = 1; i <= students; i++){
            double note = Double.parseDouble(scanner.nextLine());

            sumAllNotes = sumAllNotes + note;
            averageNote = sumAllNotes / students;

            if (note >= 2 && note <= 2.99){
                failStudents++;
            }else if (note >=3 && note <= 3.99){
                averageStudents++;
            }else if (note >= 4 && note <= 4.99){
                goodStudents++;
            }else if (note >= 5){
                topStudents++;
            }
        }
        System.out.printf("Top students: %.2f%%%n", topStudents * 1.0 / students * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", goodStudents * 1.0 / students * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", averageStudents * 1.0 / students * 100);
        System.out.printf("Fail: %.2f%%%n", failStudents * 1.0 / students * 100);
        System.out.printf("Average: %.2f", averageNote);
    }
}
