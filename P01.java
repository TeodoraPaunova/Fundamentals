package MidExam_01;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double needExperience = Double.parseDouble(scanner.nextLine());
        int countBattles = Integer.parseInt(scanner.nextLine());
        int battleTotal = 0;
        double totalExperience = 0;
        for (int battleNum = 1; battleNum <= countBattles; battleNum++) {
            double experienceEarned = Double.parseDouble(scanner.nextLine());


            if (battleNum % 3 == 0 && battleNum % 15 != 0) {
                totalExperience += experienceEarned + experienceEarned * 0.15;

            } else if (battleNum % 5 == 0 && battleNum % 15 != 0) {
                totalExperience += experienceEarned - experienceEarned * 0.10;

            } else if (battleNum % 15 == 0) {
                totalExperience += experienceEarned + experienceEarned * 0.05;

            } else {
                totalExperience += experienceEarned;
            }
            if (totalExperience >= needExperience) {
                battleTotal = battleNum;

                break;
            }

        }
        if (totalExperience >= needExperience) {
            System.out.println("Player successfully collected his needed experience for " + battleTotal + " battles.");

        } else {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", needExperience - totalExperience);


        }
    }
}

