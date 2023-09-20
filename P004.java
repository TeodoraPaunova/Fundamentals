package MidExam_01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int entryPoint = Integer.parseInt(scanner.nextLine());
        int number = array[entryPoint];
        String type = scanner.nextLine();

        int leftCheapSum = 0;
        int rightCheapSum = 0;
        int leftExpensiveSum = 0;
        int rightExpensiveSum = 0;

        for (int i = 0; i < array.length; i++) {

            if (type.equals("cheap")) {
                if (array[i] < number) {
                    if (i < entryPoint)                                             //change to compare current index to starting index
                    {

                        leftCheapSum = leftCheapSum + array[i];

                    }
                    if (i > entryPoint)                                             //change to compare current index to starting index
                    {

                        rightCheapSum = rightCheapSum + array[i];

                    }
                }

            }
            if (type.equals("expensive")) {
                if (array[i] >= number) {
                    if (i < entryPoint)                                             //change to compare current index to starting index
                    {

                        leftExpensiveSum = leftExpensiveSum + array[i];

                    }
                    if (i > entryPoint)                                             //change to compare current index to starting index
                    {

                        rightExpensiveSum = rightExpensiveSum + array[i];

                    }
                }

            }

        }
        if (type.equals("cheap")) {
            if (leftCheapSum >= rightCheapSum) {
                System.out.printf("Left - %d", leftCheapSum);
            } else {
                System.out.printf("Right - %d", rightCheapSum);
            }
        }
        if (type.equals("expensive")) {
            if (leftExpensiveSum >= rightExpensiveSum) {
                System.out.printf("Left - %d", leftExpensiveSum);
            }else {
                System.out.printf("Right - %d", rightExpensiveSum);
            }
        }
    }
}
