package ConditionalStatementsExercise;

import java.util.Scanner;

public class Control {

    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                String movieName = scanner.nextLine();
                double movieLength = Double.parseDouble(scanner.nextLine());
                double breakLength = Double.parseDouble(scanner.nextLine());

                double timeForRest = breakLength/4;
                double timeForLunch = breakLength/8;
                double totalUsedTime = timeForLunch+timeForRest+movieLength;
                double remainingTime = breakLength-totalUsedTime;
                double minutesNotEnough = Math.ceil(totalUsedTime-breakLength);

                if (breakLength>=totalUsedTime) {
                    System.out.printf("You have enough time to watch " +
                            "%s and left with %.0f " +
                            "minutes free time.",movieName,remainingTime);
                }else {
                    System.out.printf("You don't have enough time to watch " +
                            "%s, " +
                            "you need %.0f more minutes.",movieName,minutesNotEnough);
                }
            }
        }

