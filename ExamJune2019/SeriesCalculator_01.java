package ExamJune2019;

import java.util.Scanner;

public class SeriesCalculator_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int seasonsCount = Integer.parseInt(scanner.nextLine());
        int seriesCount = Integer.parseInt(scanner.nextLine());
        double seriesDuration = Double.parseDouble(scanner.nextLine());

        double advertDuration = seriesDuration * 0.2;
        double seriesDurationPlusAdv = seriesDuration + advertDuration;
        double extraTime = seasonsCount * 10;

        double totalTime = seriesDurationPlusAdv * seriesCount * seasonsCount + extraTime;

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", movieName, totalTime);

    }
}
